---
layout: page
title: "Basic air travel requests"
description: "Making requests to find schedules and prices."
---
{% include JB/setup %}

## Unit 1, Lesson 2

### Objective of Lesson 2

After this lesson is completed, you should know how to search for available flights, and price itineraries using the Travelport Universal API&trade;.   

    If you are using "test" credentials you should be aware that the test environment is based on a "copy" of activity on the primary (non-test) system at Travelport.  For this reason, there are sometimes situations where specific data/requests cannot be served from the test environment, since data must have been "recently" seen in the production environment to be visible in test.  It's a good idea to try a request that has a timeout, for example, again in a minute or two.

### Workflow

This lesson, building on [Lesson 1](lesson_1-1.html), will allow you to do what most travel agents did in the past and what many search engines still do today.  The objective is to book a trip for a customer, but to do that, the agent needs to do two basic tasks:

1. Find a set of available flights to get the traveller from origin to destination (and often back)

2. Given the set of flights, determine the current price of that itinerary

Given the terminology we explained in [Lesson 1](lesson_1-1.html), there are two ports that are needed to accomplish this workflow: the "Availability Search" port and the "Price" port.  Both of these can be accessed from the `AirService` object.

### Generating the Client-Side

If you did not do so in the previous lesson, you'll need to make sure you have all the generated code necessary for Unit 1.   In this lesson, we'll be primarily  working with the "Air" service, but it is a good idea to now generate not just the "Air" service in `src/wsdl/air_v18_0/Air.wsdl`, but also the "Hotel" service in `src/wsdl/hotel_v17_0/Hotel.wsdl`, "System" service in `src/wsdl/system_v8_0/System.wsdl`, and the "Vehicle" service in `src/wsdl/vehicle_v17_0/Vehicle.wsdl`.

After you have generated the code, you will have many more packages in your project (hitting "refresh" or "F5" on your `src` folder is probably a good idea).  The [AirService object's](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/service/air_v18_0/AirService.java) (generated) implementation is part of the package [com.travelport.service.air_v18_0]((https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/service/air_v18_0/).  

### Why So Many Packages And Files?

The reason for all the generated code (tens of thousands of lines of it) resulting from running "generate client" on `Air.wsdl` and the other services, is that WSDL files may reference other WSDL files as well as external types, in XSD files, as we explained previously.  The WSDL code we have used to generate source code is the _complete_ interface to each of the named uAPI services.

The `Air.wsdl` file is the top of a large pyramid of different objects, and since they all can be referenced in a chain that starts from `Air.wsdl`, the CXF framework is obligated to generate code for them. CXF must generate Java code for all _reachable_ types starting at `Air.wsdl`, and proceeding through any number of requests and responses.

In this specific case, the set of reachable types includes classes describing the amenities available in a particular hotel and the details of the taxes on a particular rail journey!

### Goal

The class [Lesson2](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/uapi/unit1/Lesson2.java) can output itineraries for a given city pair, in this case Paris to Chattanooga Tennessee, USA, in a form like this:

{% highlight console %}
Price:GBP941.70 [BasePrice EUR760.00, Taxes GBP315.70]
AF#682 from CDG to ATL at 2012-06-22T10:55:00.000+02:00
AF#8468 from ATL to CHA at 2012-06-22T16:05:00.000-04:00
DL#5023 from CHA to ATL at 2012-06-29T16:06:00.000-04:00
DL#8517 from ATL to CDG at 2012-06-29T17:55:00.000-04:00
-----------
Price:GBP3594.70 [BasePrice EUR3998.00, Taxes GBP301.70]
UA#2331 from CDG to CLT at 2012-06-22T11:10:00.000+02:00
US#3568 from CLT to CHA at 2012-06-22T16:25:00.000-04:00
DL#5023 from CHA to ATL at 2012-06-29T16:06:00.000-04:00
DL#8517 from ATL to CDG at 2012-06-29T17:55:00.000-04:00
{% endhighlight %}


This output is quite specific to the airline industry but probably familiar to many readers who travel frequently.

Itineraries are separated by the dashed lines.  The first itinerary has a price of 941.70 Great Britain Pounds (GBP) and involves two Air France (AF) flights on June 22nd and two Delta (DL) flights on the way back to Paris on June 29th.  The next itinerary is (shocking!) about four times as expensive, 3594.70 GBP, and involves three carriers this time, UA (United Airlines), US (US Airways), and again Delta on the return.  Note that this outbound air journey has a connection in Charlotte, North Carolina, USA (CLT) instead of Atlanta, Georgia (ATL).

When run, the code `Lesson2` will produce a number of these itineraries, plus prices for them - typically about 20.  There will be a pause at the time the program starts while it waits for the proposed, available itineraries to be returned from a Travelport GDS.  At the time each itinerary is displayed, there will also be a pause while that particular itinerary is priced.

### Outline 

At a high level, the class [Lesson2](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/uapi/unit1/Lesson2.java) must perform these logical operations:

1. Construct the necessary parameters for an availability search, such as the origin and destination city as well as the travel dates
2. Send the availability search request
3. Decode the results of the search into proper itineraries
4. Looping over each itinerary,
  * Request the price of this itinerary
  * Display the resulting price
  * Display the segments of the journey

As we shall see, the first and third items require particular care, and can be more complex than most readers would expect.

#### Purely uAPI

In the case of the first item, the objective in uAPI terms is construct an `AvailabilitySearchReq` which is primarily composed of two `SearchAirLeg` components plus one or more `AirSearchModifiers`.  One `SearchAirLeg` is for the outbound and one is for the return journey.  All these parts can be seen in this XML request, sampled from `Lesson2`. As before, the origin point is Paris, France (airport is 'CDG') and the destination is 'CHA' or Chattanooga, Tennessee in the US.  

{% highlight xml %}
 
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:AvailabilitySearchReq xmlns="http://www.travelport.com/schema/common_v15_0" xmlns:ns2="http://www.travelport.com/schema/air_v18_0" xmlns:ns3="http://www.travelport.com/schema/vehicle_v17_0" xmlns:ns4="http://www.travelport.com/schema/hotel_v17_0" xmlns:ns5="http://www.travelport.com/schema/passive_v14_0" xmlns:ns6="http://www.travelport.com/schema/rail_v12_0" xmlns:ns7="http://www.travelport.com/schema/universal_v16_0" TargetBranch="P105110">
      <BillingPointOfSaleInfo OriginApplication="UAPI"/>
      <ns2:SearchAirLeg>
        <ns2:SearchOrigin>
          <Airport Code="CDG"/>
        </ns2:SearchOrigin>
        <ns2:SearchDestination>
          <Airport Code="CHA"/>
        </ns2:SearchDestination>
        <ns2:SearchDepTime PreferredTime="2012-08-18"/>
        <ns2:AirLegModifiers>
          <ns2:PreferredCabins>
            <ns2:CabinClass Type="Economy"/>
          </ns2:PreferredCabins>
        </ns2:AirLegModifiers>
      </ns2:SearchAirLeg>
      <ns2:SearchAirLeg>
        <ns2:SearchOrigin>
          <Airport Code="CHA"/>
        </ns2:SearchOrigin>
        <ns2:SearchDestination>
          <Airport Code="CDG"/>
        </ns2:SearchDestination>
        <ns2:SearchDepTime PreferredTime="2012-08-25"/>
        <ns2:AirLegModifiers>
          <ns2:PreferredCabins>
            <ns2:CabinClass Type="Economy"/>
          </ns2:PreferredCabins>
        </ns2:AirLegModifiers>
      </ns2:SearchAirLeg>
      <ns2:AirSearchModifiers>
        <ns2:PreferredProviders>
          <Provider Code="1V"/>
        </ns2:PreferredProviders>
      </ns2:AirSearchModifiers>
    </ns2:AvailabilitySearchReq>
  </soap:Body>
</soap:Envelope>
{% endhighlight %}

### Preparing the Search

At the beginning of `main()` in the `Lesson2` class are these lines:

{% highlight java %}
//make the request... paris to chattanooga TN USA
String from ="CDG",to="CHA";
//staying a week ... two months from now.. roundtrip
AvailabilitySearchRsp rsp = search(from, to, 
	Helper.daysInFuture(60), Helper.daysInFuture(67));
{% endhighlight %}

The two calls to the helper method `Helper.daysInFuture()` should be fairly self explanatory.

So, we've setup all we need for a search now, right? We have the origin, destination, and dates of travel, so we are ready, right?  Not by a long shot!  The method `search` is implemented in `Lesson2` and is dozens of lines of code plus uses a number of helper routines.  

"Why all this extra code?", one may wonder.  The reason is that there are hundreds of parameters that can possibly be set on an air search, for far too many reasons than can be explained here.

Some of these parameters are required to be sent in _any_ air travel search done with uAPI: not only the obvious origin and destination, but also other details such as what type of passenger is traveling. _Adult_ is our default choice, but there are more than 100 types of passengers such as _Military Veteran_, _Member of the Clergy_, etc).

Here is a snippet from the implementation of the `search()` method:

{% highlight java %}

//R/T journey
SearchAirLeg outbound = AirReq.createLeg(origin, dest);
AirReq.addDepartureDate(outbound, dateOut);
AirReq.addEconomyPreferred(outbound);

//coming back
SearchAirLeg ret = AirReq.createLeg(dest, origin);
AirReq.addDepartureDate(ret, dateBack);
//put traveller in econ
AirReq.addEconomyPreferred(ret);

{% endhighlight %}


The code above creates two "legs" for the search to consider: one outbound from `origin` to `dest` and one for the reverse (`ret`) one week later.  (When actually transmitted, the request results in XML similar to that shown above.) Each leg also has a departure date and what type of seat should be searched for.

Each line of this snippet with code on it uses a method from the [AirReq](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/uapi/unit1/AirReq.java) helper object.  These helper methods have been provided to try to make it easier to understand the examples or write new code that does similar things.  

The `AirReq` class has no magic, of course.  This class is building various structures from the classes that were generated as part of our work with `Air.wsdl`.  For example:

{% highlight java %}

public static SearchAirLeg createLeg(String originAirportCode,
	String destAirportCode) {
	
	TypeSearchLocation originLoc = new TypeSearchLocation();
	TypeSearchLocation destLoc = new TypeSearchLocation();

	// airport objects are just wrappers for their codes
	Airport origin = new Airport(), dest = new Airport();
	origin.setCode(originAirportCode);
	dest.setCode(destAirportCode);
	
	// search locations can be things other than airports but we are using
	// the airport version...
	originLoc.setAirport(origin);
	destLoc.setAirport(dest);

	return createLeg(originLoc, destLoc);
	}
{% endhighlight %}


This is the code that creates a single `SearchAirLeg` object that is part of our request to the Travelport uAPI for an availability search.

You can see from the code above that locations are more complicated objects than one might expect... they _can_ be an airport code, as in this example, or they can be more complex entities such as "all locations near a given a city" as we will see in Lesson 3.

It is worth the time looking at the implementation of `AirReq` and the XML sample above, so that you can see, even for the relatively simple searches we are doing here, the number of different options, and thus different Java classes and XML structures, that are used.

### Decoding the result

To understand the decoding taking place in the client code of Lesson 2, it may be useful to examine the XML that is actually returned via the network from the uAPI server to our client.  This example is edited for space:

{% highlight xml %}

 <?xml version="1.0" encoding="UTF-8"?><SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
  <SOAP:Body>
    <air:AvailabilitySearchRsp xmlns:air="http://www.travelport.com/schema/air_v18_0" xmlns:common_v15_0="http://www.travelport.com/schema/common_v15_0" TransactionId="E32DF18C0A07581501D13BB0BE67E3C8" ResponseTime="965" DistanceUnits="MI">
      <air:FlightDetailsList>
        <air:FlightDetails Key="0T" Origin="CDG" Destination="ATL" DepartureTime="2012-06-23T10:55:00.000+02:00" ArrivalTime="2012-06-23T14:20:00.000-04:00" FlightTime="565" TravelTime="722" Equipment="77W" OriginTerminal="2E" DestinationTerminal="S"/>
        <air:FlightDetails Key="1T" Origin="ATL" Destination="CHA" DepartureTime="2012-06-23T16:05:00.000-04:00" ArrivalTime="2012-06-23T16:57:00.000-04:00" FlightTime="52" TravelTime="722" Equipment="CRJ" OriginTerminal="S"/>
        <air:FlightDetails Key="2T" Origin="CDG" Destination="ATL" DepartureTime="2012-06-23T10:55:00.000+02:00" ArrivalTime="2012-06-23T14:20:00.000-04:00" FlightTime="565" TravelTime="722" Equipment="77W" OriginTerminal="2E" DestinationTerminal="S"/>
        <air:FlightDetails Key="3T" Origin="ATL" Destination="CHA" DepartureTime="2012-06-23T16:05:00.000-04:00" ArrivalTime="2012-06-23T16:57:00.000-04:00" FlightTime="52" TravelTime="722" Equipment="CRJ" OnTimePerformance="70" OriginTerminal="S"/>
        <air:FlightDetails Key="4T" Origin="CDG" Destination="CLT" DepartureTime="2012-06-23T11:10:00.000+02:00" ArrivalTime="2012-06-23T14:35:00.000-04:00" FlightTime="565" TravelTime="743" Equipment="767" OriginTerminal="1"/>
        <air:FlightDetails Key="5T" Origin="CLT" Destination="CHA" DepartureTime="2012-06-23T16:25:00.000-04:00" ArrivalTime="2012-06-23T17:33:00.000-04:00" FlightTime="68" TravelTime="743" Equipment="CRJ" OnTimePerformance="-10"/>
        <air:FlightDetails Key="6T" Origin="CDG" Destination="CLT" DepartureTime="2012-06-23T11:10:00.000+02:00" ArrivalTime="2012-06-23T14:35:00.000-04:00" FlightTime="565" TravelTime="743" Equipment="767" OriginTerminal="1"/>
        <air:FlightDetails Key="7T" Origin="CLT" Destination="CHA" DepartureTime="2012-06-23T16:25:00.000-04:00" ArrivalTime="2012-06-23T17:33:00.000-04:00" FlightTime="68" TravelTime="743" Equipment="CRJ" OnTimePerformance="-10"/>
      </air:FlightDetailsList>
      <air:AirSegmentList>
        <air:AirSegment Key="30T" Group="0" Carrier="AF" FlightNumber="682" Origin="CDG" Destination="ATL" DepartureTime="2012-06-23T10:55:00.000+02:00" ArrivalTime="2012-06-23T14:20:00.000-04:00" FlightTime="565" TravelTime="722" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
          <air:AirAvailInfo ProviderCode="1G">
            <air:BookingCodeInfo BookingCounts="J9|ZC|W9|U9|TC|GR"/>
            <air:BookingCodeInfo CabinClass="Business" BookingCounts="C9|D7|IC"/>
            <air:BookingCodeInfo CabinClass="Economy" BookingCounts="OC|S9|Y9|B9|M9|K9|H9|LC|QC|EC|NC|RC|VC|XC"/>
            <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="A5"/>
          </air:AirAvailInfo>
          <air:FlightDetailsRef Key="0T"/>
        </air:AirSegment>
        <air:AirSegment Key="31T" Group="0" Carrier="AF" FlightNumber="8468" Origin="ATL" Destination="CHA" DepartureTime="2012-06-23T16:05:00.000-04:00" ArrivalTime="2012-06-23T16:57:00.000-04:00" FlightTime="52" TravelTime="722" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
          <air:CodeshareInfo OperatingCarrier="DL"/>
          <air:AirAvailInfo ProviderCode="1G">
            <air:BookingCodeInfo BookingCounts="W9|U9|T9"/>
            <air:BookingCodeInfo CabinClass="Economy" BookingCounts="S9|Y9|B9|M9|K9|H9|V9|L9|Q9|N7|R7"/>
            <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="A9"/>
          </air:AirAvailInfo>
          <air:FlightDetailsRef Key="1T"/>
        </air:AirSegment>
        <air:AirSegment Key="32T" Group="0" Carrier="DL" FlightNumber="8504" Origin="CDG" Destination="ATL" DepartureTime="2012-06-23T10:55:00.000+02:00" ArrivalTime="2012-06-23T14:20:00.000-04:00" FlightTime="565" TravelTime="722" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
          <air:CodeshareInfo OperatingCarrier="AF"/>
          <air:AirAvailInfo ProviderCode="1G">
            <air:BookingCodeInfo BookingCounts="J9|W5|U0|T0"/>
            <air:BookingCodeInfo CabinClass="Business" BookingCounts="C9|D7|I0"/>
            <air:BookingCodeInfo CabinClass="Economy" BookingCounts="S0|Y9|B9|M9|H9|Q9|K0|L0"/>
          </air:AirAvailInfo>
          <air:FlightDetailsRef Key="2T"/>
        </air:AirSegment>
        <air:AirSegment Key="33T" Group="0" Carrier="DL" FlightNumber="5542" Origin="ATL" Destination="CHA" DepartureTime="2012-06-23T16:05:00.000-04:00" ArrivalTime="2012-06-23T16:57:00.000-04:00" FlightTime="52" TravelTime="722" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
          <air:AirAvailInfo ProviderCode="1G">
            <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|K9|L9|E3"/>
            <air:BookingCodeInfo BookingCounts="U9|T9"/>
          </air:AirAvailInfo>
          <air:FlightDetailsRef Key="3T"/>
        </air:AirSegment>
      </air:AirSegmentList>
      <air:AirItinerarySolution Key="60T">
        <air:AirSegmentRef Key="30T"/>
        <air:AirSegmentRef Key="31T"/>
        <air:AirSegmentRef Key="32T"/>
        <air:AirSegmentRef Key="33T"/>
        <air:AirSegmentRef Key="34T"/>
        <air:AirSegmentRef Key="35T"/>
        <air:AirSegmentRef Key="36T"/>
        <air:AirSegmentRef Key="37T"/>
        <air:AirSegmentRef Key="38T"/>
        <air:AirSegmentRef Key="39T"/>
        <air:AirSegmentRef Key="40T"/>
        <air:AirSegmentRef Key="41T"/>
        <air:AirSegmentRef Key="42T"/>
        <air:AirSegmentRef Key="43T"/>
        <air:AirSegmentRef Key="44T"/>
        <air:AirSegmentRef Key="45T"/>
        <air:Connection SegmentIndex="0"/>
        <air:Connection SegmentIndex="2"/>
        <air:Connection SegmentIndex="4"/>
        <air:Connection SegmentIndex="6"/>
        <air:Connection SegmentIndex="8"/>
        <air:Connection SegmentIndex="10"/>
        <air:Connection SegmentIndex="12"/>
        <air:Connection SegmentIndex="14"/>
      </air:AirItinerarySolution>
      <air:AirItinerarySolution Key="61T">
        <air:AirSegmentRef Key="46T"/>
        <air:AirSegmentRef Key="47T"/>
        <air:AirSegmentRef Key="48T"/>
        <air:AirSegmentRef Key="49T"/>
        <air:AirSegmentRef Key="50T"/>
        <air:AirSegmentRef Key="51T"/>
        <air:AirSegmentRef Key="52T"/>
        <air:AirSegmentRef Key="53T"/>
        <air:AirSegmentRef Key="54T"/>
        <air:AirSegmentRef Key="55T"/>
        <air:AirSegmentRef Key="56T"/>
        <air:AirSegmentRef Key="57T"/>
        <air:AirSegmentRef Key="58T"/>
        <air:AirSegmentRef Key="59T"/>
        <air:Connection SegmentIndex="0"/>
        <air:Connection SegmentIndex="2"/>
        <air:Connection SegmentIndex="4"/>
        <air:Connection SegmentIndex="6"/>
        <air:Connection SegmentIndex="8"/>
        <air:Connection SegmentIndex="9"/>
        <air:Connection SegmentIndex="11"/>
        <air:Connection SegmentIndex="12"/>
      </air:AirItinerarySolution>
    </air:AvailabilitySearchRsp>
  </SOAP:Body>
</SOAP:Envelope>
{% endhighlight %}


Let's understand the approach the uAPI is using to encode the results.

Each type of entity is detailed once, typically in a "list" of that type, for example the `air:FlightDetailsList` has many `air:FlightDetails` entities within it (and many more were clipped out for space reasons).  Similarly, the `air:AirSegmentList` contains many `air:AirSegment` encodings (again, we removed many `air:AirSegment` items for space).  

However, it is important to note that _within_ the `air:AirSegment`, the response does not repeat the `air:FlightDetails`, but instead uses an `air:FlightDetailsRef` to refer to the flight details in question.  The `air:FlightDetailsRef` has a `Key` attribute that matches up with the `Key` attribute in the `air:FlightDetails` object.

Why do it this way? Primarily, this approach avoids repetition which would bloat the already large requests and responses.  If you look at the last XML objects in the example, you will see two "solutions" (`air:AirItinerarySolution`) that clearly indicate that it is possible to have a compact representation... after you have all the definitions above!

Despite the name, a single `air:ItinerarySolution` may encode many possible itineraries because it "connects" segments with the `air:Connection` entries.  We'll explain more about this later when we'll cover building "routings".

The large size of these messages and the complexity of encoding and decoding them is one of the more serious complaints about SOAP/XML as a transport mechanism in systems such as the uAPI.  We will not debate that point here, but it's important to highlight that the requests and responses sent to and from the Travelport system often end up being hundreds of lines of XML.  If you are concerned about the size of the data being passed from your client to the Travelport servers, you can enable the gzip compression algorithm in the headers of your web requests with `Accept-Encoding: gzip, deflate`.

### Decoding Part One: Building Key Maps

For this tutorial, we have provided you with helper code to take a list, such as `air:FlightDetailsList`, and build a Java `HashMap` that maps all keys to the full `air:FlightDetails` objects.  This is handy to build first, so when your are decoding something like the `air:AirItinerarySolution` you can easily get to the "true" objects being worked with.

Here is the part of the `main()` routine in `Lesson2` that builds the maps `allSegments` and `allDetails` from the response (`rsp`) to our availability search request:

{% highlight java %}

//make tables that map the "key" (or a reference) to the proper
//segment and the proper flight details
Helper.AirSegmentMap allSegments = Helper.createAirSegmentMap(
		rsp.getAirSegmentList().getAirSegment());
Helper.FlightDetailsMap allDetails = Helper.createFlightDetailsMap(
		rsp.getFlightDetailsList().getFlightDetails());
{% endhighlight %}


It's worth noting in this example that to get access to the list of `air:AirSegment` objects in the result, the Java code is `getAirSegments().getAirSegment()`.  This peculiarity is tied to the way that CXF encodes the types expressed in the `Air.wsdl` file into a Java representation.  Other programming languages might use an array or other data structure to encode the list of air segments.

### Decoding part 2: air solutions

It would be handy if the results returned from an air availability search could be pulled out of the response and directly used as parameters back to the uAPI as all or part of a air price request. 

However, the availability search returns _many_ possible solutions and these are encoded in a compact way, see `air:AirItinerarySolution` in the XML example above.  Conversely, the air price port requires that you supply a single itinerary, in the form of an `AirItinerary` object, for pricing.  Some of the pieces of an `AirItinerary` can be constructed from the pieces returned from the server to us, but most of the pieces of an `AirItinerary` have to be _derived_ from the results we have obtained from the `AirAvailabilitySearchRsp`.

In our XML example above, we displayed exactly two `AirItinerarySolution` objects.  This is all that were present in the result because one `AirItinerarySolution` is returned for each "leg" of the journey that has been searched for.  In this case, our search was from CDG (Paris) to CHA (Chattanooga) on the first leg and the reverse for the way back.  The code in `main` that takes care of this small issue is :

{% highlight java %}
//Each "solution" is for a particular part of the journey... on
//a round trip there will be two of thes
List<AirItinerarySolution> solutions = rsp.getAirItinerarySolution();
AirItinerarySolution outboundSolution = solutions.get(0);
AirItinerarySolution inboundSolution = solutions.get(1);
{% endhighlight %}


### Decoding part 3: building routings

A "routing" is a set a flights, in some order, that get the traveller from an origin to a destination.  This set has one element in the case of a direct flight, otherwise it has one or more "connections".  The code for building the final "routings" is quite short in `main()` for `Lesson2`:

{% highlight java %}
//bound the routings by using the connections
List<AirItinerary> out = buildRoutings(outboundSolution, allSegments, allDetails);
List<AirItinerary> in = buildRoutings(inboundSolution, allSegments, allDetails);
			
//merge in and out itins so we can get pricing for whole deal
List<AirItinerary> allItins = mergeOutboundAndInbound(out, in);
{% endhighlight %}


The functions `buildRoutings()` and `mergeOutboundAndInbound()` hide quite a bit of complexity.  Let's start by thinking about how to construct a routing from the XML.

From the example above, this is the outbound solution:

{% highlight xml %}

<air:AirItinerarySolution Key="60T">
  <air:AirSegmentRef Key="30T"/>
  <air:AirSegmentRef Key="31T"/>
  <air:AirSegmentRef Key="32T"/>
  <air:AirSegmentRef Key="33T"/>
  <air:AirSegmentRef Key="34T"/>
  <air:AirSegmentRef Key="35T"/>
  <air:AirSegmentRef Key="36T"/>
  <air:AirSegmentRef Key="37T"/>
  <air:AirSegmentRef Key="38T"/>
  <air:AirSegmentRef Key="39T"/>
  <air:AirSegmentRef Key="40T"/>
  <air:AirSegmentRef Key="41T"/>
  <air:AirSegmentRef Key="42T"/>
  <air:AirSegmentRef Key="43T"/>
  <air:AirSegmentRef Key="44T"/>
  <air:AirSegmentRef Key="45T"/>
  <air:Connection SegmentIndex="0"/>
  <air:Connection SegmentIndex="2"/>
  <air:Connection SegmentIndex="4"/>
  <air:Connection SegmentIndex="6"/>
  <air:Connection SegmentIndex="8"/>
  <air:Connection SegmentIndex="10"/>
  <air:Connection SegmentIndex="12"/>
  <air:Connection SegmentIndex="14"/>
</air:AirItinerarySolution>
{% endhighlight %}

At first glance, it looks like this solution has a total of 16 air segments involved... way more than just a trip from Paris to Chattanooga via Atlanta! The connections (`air:Connection`) at the bottom are the key to understanding what route takes someone from Paris to Chattanooga.

The first air connection object indicates that index 0 of the list above, the air segment ref with key "30T" has a connection to the _next_ air segment ref (key "31T").  If we return to the very top of the XML example given previously and extract the _air segments_ that are referred to by keys 30T and 31T we have:

{% highlight xml %}
<air:AirSegment Key="30T" Group="0" Carrier="AF" FlightNumber="682" Origin="CDG" Destination="ATL" DepartureTime="2012-06-23T10:55:00.000+02:00" ArrivalTime="2012-06-23T14:20:00.000-04:00" FlightTime="565" TravelTime="722" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
  <air:AirAvailInfo ProviderCode="1G">
    <air:BookingCodeInfo BookingCounts="J9|ZC|W9|U9|TC|GR"/>
    <air:BookingCodeInfo CabinClass="Business" BookingCounts="C9|D7|IC"/>
    <air:BookingCodeInfo CabinClass="Economy" BookingCounts="OC|S9|Y9|B9|M9|K9|H9|LC|QC|EC|NC|RC|VC|XC"/>
    <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="A5"/>
  </air:AirAvailInfo>
  <air:FlightDetailsRef Key="0T"/>
</air:AirSegment>
<air:AirSegment Key="31T" Group="0" Carrier="AF" FlightNumber="8468" Origin="ATL" Destination="CHA" DepartureTime="2012-06-23T16:05:00.000-04:00" ArrivalTime="2012-06-23T16:57:00.000-04:00" FlightTime="52" TravelTime="722" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
  <air:CodeshareInfo OperatingCarrier="DL"/>
  <air:AirAvailInfo ProviderCode="1G">
    <air:BookingCodeInfo BookingCounts="W9|U9|T9"/>
    <air:BookingCodeInfo CabinClass="Economy" BookingCounts="S9|Y9|B9|M9|K9|H9|V9|L9|Q9|N7|R7"/>
    <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="A9"/>
  </air:AirAvailInfo>
  <air:FlightDetailsRef Key="1T"/>
</air:AirSegment>
{% endhighlight %}


This shows the two flights needed to get from Paris to Chattanooga: Air France flight 682 (Carrier="AF" and FlightNumber="682") from CDG to ATL and then Air France flight 8468.  Looking carefully at the second air segment here, you can see the `air:CodeShareInfo` element that identifies this second flight as a codeshare flight that is being operated by Delta (OperatingCarrier="DL").  So, if you were surprised that Air France had a domestic flight from Atlanta to Chattanooga within the USA, you now know the truth!

This processing of using the `AirSolution` objects' `Connection` objects to figure out the necessary `AirSegment` objects, taken from the maps built in "Decoding part 1", is the job of the function `buildRoutings()` shown earlier.  The routing result is an `AirItinerary` object with the correct legs in it for the particular outbound or inbound journey.  Since the routings for outbound and inbound are built separately - the `air:AirItinerarySolution` entities in the XML dictate this - we will need to combine the outbound and inbound itineraries (in the right order!) to form full return itineraries.  Without this, we would be pricing the one way journeys either from Paris to Chattanooga, or the reverse.  

In `Lesson2`, the function `mergeOutboundAndInbound()` creates a Java `List` of all the combinations of outbound and return itineraries created by `buildRoutings()`.  This is done by creating every permutation (the cross product) of the two input lists of `AirItinerary` objects.

### Pricing

We now have a `List<AirItinerary>` object, with each element indicating a journey that is suitable for pricing.

As with any port we have discussed in this tutorial, we must first construct the correct request parameters, in this case `AirPricingReq`.  The `AirPricingReq` object has a few more parameters that are needed besides the itinerary, such as the cabin preference (in case multiple are available), the type of passenger, etc.

This is the critical part of the function `displayItineraryPrice` that does the work of calling the uAPI to get a price for an `AirItinerary`:
	
{% highlight java %}
public static void displayItineraryPrice(AirItinerary itin) throws AirFaultMessage {
	//now lets try to price it
	AirPriceReq priceReq = new AirPriceReq();
	AirPriceRsp priceRsp;
	
	//price the itinerary provided
	priceReq.setAirItinerary(itin);
	
	//set cabin
	AirPricingCommand command = new AirPricingCommand();
	command.setCabinClass(TypeCabinClass.ECONOMY);
	priceReq.getAirPricingCommand().add(command);
	
	//our branch
	priceReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
	
	//one adult passenger
	SearchPassenger adult = new SearchPassenger();
	adult.setCode("ADT");
	priceReq.getSearchPassenger().add(adult);
	
	//add point of sale (v18_0)
	AirReq.addPointOfSale(priceReq, "tutorial-unit1-lesson2");
	
	//make the request to tport
	priceRsp = WSDLService.airPrice.get().service(priceReq);
{% endhighlight %}

### AirPriceReq

One of the most crucial functions of the uAPI is its ability to accurately price a given itinerary and display not only the total price to be paid, but also to break down all the pricing components as well. In addition, there is the complex issue of which taxes and from what jurisdiction should be applied.  Here is an example `AirPricingReq` in XML as sent from Lesson 2 to Travelport:

{% highlight xml %}
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:AirPriceReq xmlns="http://www.travelport.com/schema/common_v15_0" xmlns:ns2="http://www.travelport.com/schema/air_v18_0" xmlns:ns3="http://www.travelport.com/schema/rail_v12_0" xmlns:ns4="http://www.travelport.com/schema/vehicle_v17_0" xmlns:ns5="http://www.travelport.com/schema/hotel_v17_0" xmlns:ns6="http://www.travelport.com/schema/passive_v14_0" xmlns:ns7="http://www.travelport.com/schema/universal_v16_0" TargetBranch="P105110">
      <BillingPointOfSaleInfo OriginApplication="UAPI"/>
      <ns2:AirItinerary>
        <ns2:AirSegment Group="0" Carrier="AF" FlightNumber="682" ProviderCode="1V" Origin="CDG" Destination="ATL" DepartureTime="2012-08-18T10:55:00.000+02:00" ArrivalTime="2012-08-18T14:20:00.000-04:00" Key="36T">
          <ns2:FlightDetails Key="4T" Equipment="77W" OriginTerminal="2E" DestinationTerminal="S" FlightTime="565" TravelTime="725" Origin="CDG" Destination="ATL" DepartureTime="2012-08-18T10:55:00.000+02:00" ArrivalTime="2012-08-18T14:20:00.000-04:00"/>
        </ns2:AirSegment>
        <ns2:AirSegment Group="0" Carrier="AF" FlightNumber="8468" ProviderCode="1V" Origin="ATL" Destination="CHA" DepartureTime="2012-08-18T16:15:00.000-04:00" ArrivalTime="2012-08-18T17:00:00.000-04:00" Key="37T">
          <ns2:FlightDetails Key="5T" Equipment="CR7" OriginTerminal="S" FlightTime="45" TravelTime="725" Origin="ATL" Destination="CHA" DepartureTime="2012-08-18T16:15:00.000-04:00" ArrivalTime="2012-08-18T17:00:00.000-04:00"/>
        </ns2:AirSegment>
        <ns2:AirSegment Group="1" Carrier="DL" FlightNumber="5139" ProviderCode="1V" Origin="CHA" Destination="ATL" DepartureTime="2012-08-25T12:15:00.000-04:00" ArrivalTime="2012-08-25T13:05:00.000-04:00" Key="58T">
          <ns2:FlightDetails Key="26T" Equipment="CRJ" OnTimePerformance="80" DestinationTerminal="S" FlightTime="50" TravelTime="715" Origin="CHA" Destination="ATL" DepartureTime="2012-08-25T12:15:00.000-04:00" ArrivalTime="2012-08-25T13:05:00.000-04:00"/>
        </ns2:AirSegment>
        <ns2:AirSegment Group="1" Carrier="DL" FlightNumber="28" ProviderCode="1V" Origin="ATL" Destination="CDG" DepartureTime="2012-08-25T15:15:00.000-04:00" ArrivalTime="2012-08-26T06:10:00.000+02:00" Key="59T">
          <ns2:FlightDetails Key="27T" Equipment="767" OriginTerminal="S" DestinationTerminal="2E" FlightTime="535" TravelTime="715" Origin="ATL" Destination="CDG" DepartureTime="2012-08-25T15:15:00.000-04:00" ArrivalTime="2012-08-26T06:10:00.000+02:00"/>
        </ns2:AirSegment>
      </ns2:AirItinerary>
      <SearchPassenger Code="ADT"/>
      <ns2:AirPricingCommand CabinClass="Economy"/>
    </ns2:AirPriceReq>
  </soap:Body>
</soap:Envelope>
{% endhighlight %}

As you can see, primarily the request consists of the details of the flights to be travelled on plus a few extra details such as the passenger type and cabin class.  The outbound journey is two `AirSegment` objects, but both in `Group` zero; the return segments are in `Group` one.  A careful reader might be wondering why the `FlightDetails` elements have the `Key` attribute on them, such as the "26T" associated with the flight from CHA to ATL.  These are not used in this request (and are ignored by uAPI) but are "leftovers" from re-using the some parts of the results provided as a response to our availability request done previously.

### Pricing Response

Below is a slightly-edited pricing response provided by Travelport in response to an `AirPriceReq` from Lesson 2 as seen above. The optional services section has been removed as it is quite long and not within the scope of this tutorial.  

The particular details of understanding all the aspects of this response are beyond what we can cover in this tutorial.  We do ask you to look at the two highlighted portions of the XML response, marked with highlight 1 and 2.  Highlight one shows the `AirPricingSolution` component of the XML, probably the one that most readers (and travellers!) are most interested in!  The second highlight comment shows the section related to taxes.  Each of the taxes specified, identified by its `Category` attribute such as `XF`, relates to a specific IATA-published tax.  In this case, a reader with access to the list of taxes could determine that the `XF` or "Passenger Facility Charge" tax is applied three times, twice in Atlanta and once in Chattanooga.  This is makes sense once realizes that this facility charge is charged only on flights _originating_ from a given airport.

{% highlight xml %}
 <SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
  <SOAP:Body>
    <air:AirPriceRsp xmlns:air="http://www.travelport.com/schema/air_v18_0" xmlns:common_v15_0="http://www.travelport.com/schema/common_v15_0" TransactionId="054FA5650A076111010236618BFD0A08" ResponseTime="2262">
      <air:AirItinerary>
        <air:AirSegment Key="0T" Group="0" Carrier="DL" FlightNumber="8504" ProviderCode="1V" Origin="CDG" Destination="ATL" DepartureTime="2012-08-18T10:55:00.000+02:00" ArrivalTime="2012-08-18T14:20:00.000-04:00" FlightTime="565" TravelTime="565" Distance="4390" ClassOfService="K" ChangeOfPlane="false" OptionalServicesIndicator="false">
          <air:FlightDetails Key="1T" Origin="CDG" Destination="ATL" DepartureTime="2012-08-18T10:55:00.000+02:00" ArrivalTime="2012-08-18T14:20:00.000-04:00" FlightTime="565" TravelTime="565"/>
        </air:AirSegment>
        <air:AirSegment Key="2T" Group="0" Carrier="DL" FlightNumber="5542" ProviderCode="1V" Origin="ATL" Destination="CHA" DepartureTime="2012-08-18T16:15:00.000-04:00" ArrivalTime="2012-08-18T17:00:00.000-04:00" FlightTime="45" TravelTime="45" Distance="107" ClassOfService="K" ChangeOfPlane="false" OptionalServicesIndicator="false">
          <air:FlightDetails Key="3T" Origin="ATL" Destination="CHA" DepartureTime="2012-08-18T16:15:00.000-04:00" ArrivalTime="2012-08-18T17:00:00.000-04:00" FlightTime="45" TravelTime="45"/>
        </air:AirSegment>
        <air:AirSegment Key="4T" Group="1" Carrier="DL" FlightNumber="5139" ProviderCode="1V" Origin="CHA" Destination="ATL" DepartureTime="2012-08-25T12:15:00.000-04:00" ArrivalTime="2012-08-25T13:05:00.000-04:00" FlightTime="50" TravelTime="50" Distance="107" ClassOfService="Q" ChangeOfPlane="false" OptionalServicesIndicator="false">
          <air:FlightDetails Key="5T" Origin="CHA" Destination="ATL" DepartureTime="2012-08-25T12:15:00.000-04:00" ArrivalTime="2012-08-25T13:05:00.000-04:00" FlightTime="50" TravelTime="50"/>
        </air:AirSegment>
        <air:AirSegment Key="6T" Group="1" Carrier="DL" FlightNumber="28" ProviderCode="1V" Origin="ATL" Destination="CDG" DepartureTime="2012-08-25T15:15:00.000-04:00" ArrivalTime="2012-08-26T06:10:00.000+02:00" FlightTime="535" TravelTime="535" Distance="4390" ClassOfService="Q" ChangeOfPlane="false" OptionalServicesIndicator="false">
          <air:FlightDetails Key="7T" Origin="ATL" Destination="CDG" DepartureTime="2012-08-25T15:15:00.000-04:00" ArrivalTime="2012-08-26T06:10:00.000+02:00" FlightTime="535" TravelTime="535"/>
        </air:AirSegment>
      </air:AirItinerary>
      <air:AirPriceResult>
        <!--
		  HIGHLIGHT 1: THE PRICE
		-->
        <air:AirPricingSolution Key="8T" TotalPrice="USD2019.90" BasePrice="EUR1155.00" ApproximateTotalPrice="USD2019.90" ApproximateBasePrice="USD1520.00" EquivalentBasePrice="USD1520.00" Taxes="USD499.90">
          <air:AirSegmentRef Key="0T"/>
          <air:AirSegmentRef Key="2T"/>
          <air:AirSegmentRef Key="4T"/>
          <air:AirSegmentRef Key="6T"/>
          <air:AirPricingInfo Key="9T" TotalPrice="USD2019.90" BasePrice="EUR1155.00" ApproximateTotalPrice="USD2019.90" ApproximateBasePrice="USD1520.00" EquivalentBasePrice="USD1520.00" Taxes="USD499.90" LatestTicketingTime="2012-06-26T23:59:00.000-06:00" PricingMethod="Guaranteed" IncludesVAT="false" ETicketability="Yes" PlatingCarrier="DL" ProviderCode="1V">
            <air:FareInfo Key="20T" FareBasis="KH4AFFR" PassengerTypeCode="ADT" Origin="CDG" Destination="CHA" EffectiveDate="2012-06-19T09:15:00.000-06:00" DepartureDate="2012-08-18" Amount="NUC714.81" PrivateFare="false" NegotiatedFare="false" NotValidBefore="2012-08-18" NotValidAfter="2012-08-18">
              <common_v15_0:Endorsement Value="NON ENDO/"/>
              <common_v15_0:Endorsement Value="FARE RSTR COULD APPLY"/>
              <air:BaggageAllowance>
                <air:NumberOfPieces>1</air:NumberOfPieces>
                <air:MaxWeight/>
              </air:BaggageAllowance>
              <air:FareRuleKey FareInfoRef="20T" ProviderCode="1V">Uz2vJADyQ1L/G5z8j/CiSvIYR/AK2reE8hhH8Arat4TyGEfwCtq3hPIYR/AK2reE8hhH8Arat4SiBqSlMvperrFfUlC4CxwWHWbLEhhPHQUOzWQlBHOBwH6aJkxZm2pSdMUD5H0ZXQxSv+4yYUhi0GklyCSHoHtgoa3E3tIqGwA4hviVcNc8AFNV6KU7qYzRTc4ZKcCwL6Q8fKGGSfkQ3tNHpKreSvYcQMlheDAIJ/QTJ3mD70mQce4HMsZtq4i6fJvsGOhXgBinc5W6BdNIYvjmCnu36Wn4yXA/jzSwzCDJcD+PNLDMIMlwP480sMwgyXA/jzSwzCA/d7cR0af4Jmz733dVPxthVXaCeceV8PyM0ofhODC2r+XNPGmjUcssHSpnhoj1vQc/lmACoODWFHr0G1EBelYrwBYxnFOB370=</air:FareRuleKey>
            </air:FareInfo>
            <air:FareInfo Key="25T" FareBasis="QH3AFFR" PassengerTypeCode="ADT" Origin="CHA" Destination="CDG" EffectiveDate="2012-06-19T09:15:00.000-06:00" DepartureDate="2012-08-25" Amount="NUC807.10" PrivateFare="false" NegotiatedFare="false" NotValidBefore="2012-08-25" NotValidAfter="2012-08-25">
              <common_v15_0:Endorsement Value="NON ENDO/"/>
              <common_v15_0:Endorsement Value="FARE RSTR COULD APPLY"/>
              <air:BaggageAllowance>
                <air:NumberOfPieces>1</air:NumberOfPieces>
                <air:MaxWeight/>
              </air:BaggageAllowance>
              <air:FareRuleKey FareInfoRef="25T" ProviderCode="1V">Uz2vJADyQ1L/G5z8j/CiSvIYR/AK2reE8hhH8Arat4TyGEfwCtq3hPIYR/AK2reE8hhH8Arat4SiBqSlMvperrFfUlC4CxwWHWbLEhhPHQVcgM/167Qccc2nSJVpEMZUzzW0/Nh6JtDkDe+lbgyuvFKNsqrjh6OkgwzQ8cWS/Ec4hviVcNc8AFNV6KU7qYzRTc4ZKcCwL6Q8fKGGSfkQ3tNHpKreSvYcQMlheDAIJ/QTJ3mD70mQce4HMsZtq4i634LK8khFI7gj2XoghSHdF/jmCnu36Wn4yXA/jzSwzCDJcD+PNLDMIMlwP480sMwgyXA/jzSwzCA/d7cR0af4Jmz733dVPxthVXaCeceV8PyM0ofhODC2r+XNPGmjUcssHSpnhoj1vQc/lmACoODWFHr0G1EBelYrwBYxnFOB370=</air:FareRuleKey>
            </air:FareInfo>
            <air:BookingInfo BookingCode="K" FareInfoRef="20T" SegmentRef="0T"/>
            <air:BookingInfo BookingCode="K" FareInfoRef="20T" SegmentRef="2T"/>
            <air:BookingInfo BookingCode="Q" FareInfoRef="25T" SegmentRef="4T"/>
            <air:BookingInfo BookingCode="Q" FareInfoRef="25T" SegmentRef="6T"/>
	        <!--
			  HIGHLIGHT 2: TAXES
			-->
            <air:TaxInfo Category="AY" Amount="USD7.50" Key="10T"/>
            <air:TaxInfo Category="US" Amount="USD33.40" Key="11T"/>
            <air:TaxInfo Category="XA" Amount="USD5.00" Key="12T"/>
            <air:TaxInfo Category="XF" Amount="USD13.50" Key="13T">
              <air:TaxDetail Amount="USD4.50" OriginAirport="ATL"/>
              <air:TaxDetail Amount="USD4.50" OriginAirport="CHA"/>
              <air:TaxDetail Amount="USD4.50" OriginAirport="ATL"/>
            </air:TaxInfo>
            <air:TaxInfo Category="XY" Amount="USD7.00" Key="14T"/>
            <air:TaxInfo Category="YC" Amount="USD5.50" Key="15T"/>
            <air:TaxInfo Category="FR" Amount="USD26.80" Key="16T"/>
            <air:TaxInfo Category="IZ" Amount="USD5.30" Key="17T"/>
            <air:TaxInfo Category="QX" Amount="USD35.30" Key="18T"/>
            <air:TaxInfo Category="YQ" Amount="USD360.60" Key="19T"/>
            <air:FareCalc>PAR DL X/ATL DL CHA M714.81KH4AFFR DL X/ATL DL PAR M807.10QH3AFFR NUC1521.91END ROE0.758475</air:FareCalc>
            <air:PassengerType Code="ADT"/>
            <air:ChangePenalty>
              <air:Amount>USD131.00</air:Amount>
            </air:ChangePenalty>
          </air:AirPricingInfo>
          <air:FareNote Key="30T">RATE USED IN EQU TOTAL IS BSR 1EUR - 1.3157895USD</air:FareNote>
          <air:FareNote Key="31T">LAST DATE TO PURCHASE TICKET: 26JUN12</air:FareNote>
          <air:FareNote Key="32T">E-TKT REQUIRED</air:FareNote>
          <air:FareNote Key="33T">TICKETING AGENCY 273L</air:FareNote>
          <air:FareNote Key="34T">DEFAULT PLATING CARRIER DL</air:FareNote>
        </air:AirPricingSolution>
      </air:AirPriceResult>
    </air:AirPriceRsp>
  </SOAP:Body>
</SOAP:Envelope>

{% endhighlight %}
### Woot! 

We have now completed the basic workflow that must be done to find a way to travel between two points via Air!  You should be able to run Lesson 2 the same way you ran Lesson 1 and have Travelport price a few dozen or so possible itineraries for you.    As we will see in Lesson 3, there are other ways to do this work... and other ways to travel besides air!  

![Warning](images/warning.png) A slight word of warning is in order:  It is not recommended practice to price all possible combinations of possible itineraries via an `AirPriceReq` to the uAPI.  We have done so in this lesson because for clarity of exlpanation.  One either should apply some filtering logic to reduce the possible set of itineraries, or use the shopping capabilities explained in the next lesson to have the uAPI propose "reasonable and available" itineraries.

### Exercises for the reader

* Try changing the origin and destination airports to ones that you know well.  Look at the displayed itineraries and prices and compare to an online travel website.

* Try using the `displayItineraryPrice` to compare the prices of two one-way journeys from the origin to the destination and the round trip price.  To do this you will need to construct "one way" itineraries (`AirItinerary`) and submit them to the pricing engine.

* Try to improve the output of the program to be more descriptive and human-friendly.  This primarily means changing the loops in `displayItineraryPrice` and `main()` that walk the `AirPriceResult` and `AirItinerary` lists respectively.

* Using a debugger, try stopping `Lesson2` around line 27.  Walk down the hierarchy of objects inside the `rsp` and explore what more information about the flights could be displayed for the user.  Similarly, stop the program around line 227 and do the same for the `priceRsp` to see what extra information could be displayed about the price.

----------------------

[< Return to Unit 1, Lesson 1](lesson_1-1.html) |
[Proceed to Unit 1, Lesson 3 >](lesson_1-3.html)

[Table of Contents](index.html)

{% include JB/comments %}

{% include JB/analytics %}


