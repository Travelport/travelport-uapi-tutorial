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

If you did not do so in the previous lesson, you’ll need to make sure you have all the generated code necessary for Unit 1. In this lesson, we’ll be primarily working with the “Air” service, but it is a good idea to now generate not just the “Air” service in src/wsdl/air_v26_0/Air.wsdl, but also the “Hotel” service in src/wsdl/hotel_v26_0/Hotel.wsdl, “System” service in src/wsdl/system_v8_0/System.wsdl, the “Vehicle” service in src/wsdl/vehicle_v26_0/Vehicle.wsdl and the “Universal” service in src/wsdl/universal_v26_0/UniversalRecord.wsdl

After you have generated the code, you will have many more packages in your project (hitting "refresh" or "F5" on your `src` folder is probably a good idea).  The [AirService object's](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/service/air_v26_0/AirService.java) (generated) implementation is part of the package [com.travelport.service.air_v26_0]((https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/service/air_v26_0/).  

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

Itineraries are separated by the dashed lines. The first itinerary has a price of 941.70 Great Britain Pounds (GBP) and involves two Air France (AF) flights on June 22nd and two Delta (DL) flights on the way back to Paris on June 29th. The next itinerary is (shocking!) about four times as expensive, 3594.70 GBP, and involves three carriers this time, UA (United Airlines), US (US Airways), and again Delta on the return. Note that this outbound air journey has a connection in Charlotte, North Carolina, USA (CLT) instead of Atlanta, Georgia (ATL).

When run, the code Lesson2 will produce a number of these itineraries, plus prices for them - typically about 20. There will be a pause at the time the program starts while it waits for the proposed, available itineraries to be returned from a Travelport GDS. At the time each itinerary is displayed, there will also be a pause while that particular itinerary is priced.


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

In the case of the first item, the objective in uAPI terms is construct an AvailabilitySearchReq which is primarily composed of two SearchAirLeg components plus one or more AirSearchModifiers. One SearchAirLeg is for the outbound and one is for the return journey. All these parts can be seen in this XML request, sampled from Lesson2. As before, the origin point is Paris, France (airport is ‘CDG’) and the destination is ‘CHA’ or Chattanooga, Tennessee in the US.
 
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">   <soapenv:Header/>
   <soapenv:Body>
      <air:AvailabilitySearchReq AuthorizedBy="user" TargetBranch="TRGT_BRCH" TraceId="trace" xmlns:air="http://www.travelport.com/schema/air_v26_0">
         <com:BillingPointOfSaleInfo OriginApplication="UAPI" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <air:SearchAirLeg>
            <air:SearchOrigin>
               <com:Airport Code="CDG" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            </air:SearchOrigin>
            <air:SearchDestination>
               <com:Airport Code="CHA" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            </air:SearchDestination>
            <air:SearchDepTime PreferredTime="2014-06-19"/>
			<air:AirLegModifiers>
               <air:PreferredCabins>
                  <com:CabinClass Type="Economy" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
               </air:PreferredCabins>
            </air:AirLegModifiers>
         </air:SearchAirLeg>
         <air:SearchAirLeg>
            <air:SearchOrigin>
               <com:Airport Code="CHA" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            </air:SearchOrigin>
            <air:SearchDestination>
               <com:Airport Code="CDG" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            </air:SearchDestination>
            <air:SearchDepTime PreferredTime="2014-06-28"/>
			<air:AirLegModifiers>
               <air:PreferredCabins>
                  <com:CabinClass Type="Economy" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
               </air:PreferredCabins>
            </air:AirLegModifiers>
         </air:SearchAirLeg>
         <air:AirSearchModifiers>
            <air:PreferredProviders>
               <com:Provider Code="1G" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            </air:PreferredProviders>
         </air:AirSearchModifiers>
      </air:AvailabilitySearchReq>
   </soapenv:Body>
</soapenv:Envelope>
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

The two calls to the helper method Helper.daysInFuture() should be fairly self explanatory.

So, we’ve setup all we need for a search now, right? We have the origin, destination, and dates of travel, so we are ready, right? Not by a long shot! The method search is implemented in Lesson2 and is dozens of lines of code plus uses a number of helper routines.

“Why all this extra code?”, one may wonder. The reason is that there are hundreds of parameters that can possibly be set on an air search, for far too many reasons than can be explained here.

Some of these parameters are required to be sent in any air travel search done with uAPI: not only the obvious origin and destination, but also other details such as what type of passenger is traveling. Adult is our default choice, but there are more than 100 types of passengers such as Military Veteran, Member of the Clergy, etc).


{% highlight java %}

//R/T journey
SearchAirLeg outbound = AirReq.createSearchLeg(origin, dest);
AirReq.addSearchDepartureDate(outbound, dateOut);
AirReq.addSearchEconomyPreferred(outbound);

//coming back
SearchAirLeg ret = AirReq.createSearchLeg(dest, origin);
AirReq.addSearchDepartureDate(ret, dateBack);
//put traveller in econ
AirReq.addSearchEconomyPreferred(ret);


{% endhighlight %}


The code above creates two “legs” for the search to consider: one outbound from origin to dest and one for the reverse (ret) one week later. (When actually transmitted, the request results in XML similar to that shown above.) Each leg also has a departure date and what type of seat should be searched for.

Each line of this snippet with code on it uses a method from the  [AirReq](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/uapi/unit1/AirReq.java) helper object.  helper object. These helper methods have been provided to try to make it easier to understand the examples or write new code that does similar things.

The AirReq class has no magic, of course. This class is building various structures from the classes that were generated as part of our work with Air.wsdl. For example:


{% highlight java %}

public static SearchAirLeg createSearchLeg(String originAirportCode, String destAirportCode) {
	// TODO Auto-generated method stub
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

	return createSearchLeg(originLoc, destLoc);
} 

{% endhighlight %}


This is the code that creates a single SearchAirLeg object that is part of our request to the Travelport uAPI for an availability search.

You can see from the code above that locations are more complicated objects than one might expect… they can be an airport code, as in this example, or they can be more complex entities such as “all locations near a given a city” as we will see in Lesson 3.

It is worth the time looking at the implementation of AirReq and the XML sample above, so that you can see, even for the relatively simple searches we are doing here, the number of different options, and thus different Java classes and XML structures, that are used.


### Decoding the result

To understand the decoding taking place in the client code of Lesson 2, it may be useful to examine the XML that is actually returned via the network from the uAPI server to our client. This example is edited for space:

{% highlight xml %}

<SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP:Body>
      <air:AvailabilitySearchRsp TraceId="trace" TransactionId="D763582C0A07761EE2F55AE35BFB8A81" ResponseTime="1276" DistanceUnits="MI" xmlns:air="http://www.travelport.com/schema/air_v26_0" xmlns:common_v26_0="http://www.travelport.com/schema/common_v26_0">         <common_v26_0:NextResultReference>H4sIAAAAAAAAAJ1U30sUQRz/3urljwxTS8Iwi0p7yN3zPD1Pfcj8lXX+oJMeFB/G23Ed29tdZ+fONSSol556iSAKgiASgl56C4LeosCXiKAgIkJ67A8QApsZd9XtKKl9mJ3vdz7fz/fnzLMfEHUp1C2gAlLzjJhqH6VoOU1c5t1433j/DXpYApERKHXJNew5AKAslfK1khu1Zu2casTdJcKy86qhuyrSkcMwdVV+krMtddBjFGXZpH0VW+mbn5vIZs2qAuXTsB9ROklyWPhh0Dad5gZaQKVxqpytY1PbotEEMuPgLJkjWcSIbfVwBh07OwypPRiGTOyRWRMXM6UFk8uIJUUGtWlRCs1ElqFlGCWWwSFRg9p5h0HdrsMRi2EDU35akbMpljkuwnWIpmGfTYlBAqnKoXaB6Jj284h8XZRtwz0nT/0KhIop4w8KWRz3k+NX3r26l7ytAMi2AGdJ7cHy5yp8eDnTffTW+kzAFuHt7fw/rpfm6NrPj6eRApE0VLsY0ey8nIMBtOwyUP/eqEwY3+NRUP+tMtrdtUcHvzuuAqVTUE/cCYrnMMW6AI7ZbJgU+CzCAUeqfT2Dk+Gw/GjEhdAGEJNZ8k5Xub4nIYvuVfPuM76/zCeCs5zZe44lsocXmVf4RCgzPyF5CQOfsPVFFIhOQZXOtUEKU1BNrAIyiUxgyrYwB7BQjuULto4EE4MjaZsampA1gQnlxHz7MbSVU1RMgBiAem6jChtVQLZjetHr6QvTXzbErFBoCoNmkYvV83wJ0JubG9/GZ9THCigXoYyMEtMkLr90pH+e2pZt2sYyg4bfwts565HBDD03z4mCtYSdZSVMHcmM7xicyrD87NO3NXOLyYmWEjHOblGQQWwia4lf1SIPVuIN6xK/VAFlgyyrDY9Oep4jzJv3nEDZ1d47Zyf6L3V/UqCEl5UPskn4y7JrVCpN7jikCY+hVHKXjtgc4u9NSf+FPv471h6Lx5KxtlQqFe9IxDtbk+2xWKKjPZHs6kp1xQVuYJhHKsyUvFjL5YsgdpXyNotdFchfbSAfFoX9+noFhNDgmzduOW92fFLpPFHsPJGKtXWkkom4H6Tj/QKTpCv8SgYAAA==</common_v26_0:NextResultReference>
         	<air:FlightDetails Key="Gnk6Hb/dSkCpQaCKFlz19w==" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" Equipment="333" OriginTerminal="1"/>             <air:FlightDetails Key="6MBPXEaTQoi0YX+NEEY7IA==" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" Equipment="CRJ" OnTimePerformance="50"/>             <air:FlightDetails Key="HM8qnlkfQwq0zdaDTlZtew==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T13:55:00.000+02:00" ArrivalTime="2014-06-19T17:25:00.000-04:00" FlightTime="570" TravelTime="728" Equipment="744" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="MbFLiy1rRsOZhJ/LYYVSNg==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T19:15:00.000-04:00" ArrivalTime="2014-06-19T20:03:00.000-04:00" FlightTime="48" TravelTime="728" Equipment="M88" OriginTerminal="S"/>
            <air:FlightDetails Key="MGcumtrlSBuWxoY0TgP7oQ==" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" Equipment="333" OriginTerminal="1"/>
            <air:FlightDetails Key="2iqm4ZZpRR2+TGufGEz0sQ==" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" Equipment="CRJ" OnTimePerformance="50"/>
            <air:FlightDetails Key="vJK+HkPBSJeWriSqllVl0Q==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T13:55:00.000+02:00" ArrivalTime="2014-06-19T17:25:00.000-04:00" FlightTime="570" TravelTime="728" Equipment="744" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="K5q2+hv0Qzu2HvBRwR9kPA==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T19:15:00.000-04:00" ArrivalTime="2014-06-19T20:03:00.000-04:00" FlightTime="48" TravelTime="728" Equipment="M88" OnTimePerformance="80" OriginTerminal="S"/>
            <air:FlightDetails Key="hoU7y4BRSk+5tx7497KfOQ==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T10:45:00.000+02:00" ArrivalTime="2014-06-19T14:15:00.000-04:00" FlightTime="570" TravelTime="730" Equipment="77W" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="GdAeZ2UsRFmQVsTKRayhvQ==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T16:10:00.000-04:00" ArrivalTime="2014-06-19T16:55:00.000-04:00" FlightTime="45" TravelTime="730" Equipment="CRJ" OnTimePerformance="70" OriginTerminal="S"/>
            <air:FlightDetails Key="RW7aOdb6RmKEAg/G4dSOSQ==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T10:45:00.000+02:00" ArrivalTime="2014-06-19T14:15:00.000-04:00" FlightTime="570" TravelTime="730" Equipment="77W" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="h/MsIGQCSeme3eTDxAWSBQ==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T16:10:00.000-04:00" ArrivalTime="2014-06-19T16:55:00.000-04:00" FlightTime="45" TravelTime="730" Equipment="CRJ" OriginTerminal="S"/>
            <air:FlightDetails Key="+qCQysKrS3yq3Sg8WF02HA==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T08:30:00.000+02:00" ArrivalTime="2014-06-19T12:03:00.000-04:00" FlightTime="573" TravelTime="734" Equipment="764" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="TH0G+IWIS7WTK/+X2q3pvQ==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T14:00:00.000-04:00" ArrivalTime="2014-06-19T14:44:00.000-04:00" FlightTime="44" TravelTime="734" Equipment="CRJ" OnTimePerformance="70" OriginTerminal="S"/>
            <air:FlightDetails Key="JT7vUR3YQluy+LspdXCz9g==" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T08:30:00.000+02:00" ArrivalTime="2014-06-19T12:03:00.000-04:00" FlightTime="573" TravelTime="734" Equipment="764" OriginTerminal="2E" DestinationTerminal="I"/>
            <air:FlightDetails Key="pONP4ltUS0a0f5fAGnV3Pg==" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T14:00:00.000-04:00" ArrivalTime="2014-06-19T14:44:00.000-04:00" FlightTime="44" TravelTime="734" Equipment="CRJ" OriginTerminal="S"/>
            <air:FlightDetails Key="LeXLrYCsTQK2WBZgVosKYA==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" Equipment="CRJ" DestinationTerminal="S"/>
            <air:FlightDetails Key="G3UGNot4QE6i79tY1JYWKw==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" Equipment="764" OriginTerminal="I" DestinationTerminal="2E"/>
            <air:FlightDetails Key="8z9DKAp2Sh6ggaCZ24Xn4Q==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T15:10:00.000-04:00" ArrivalTime="2014-06-28T16:10:00.000-04:00" FlightTime="60" TravelTime="660" Equipment="CRJ" OnTimePerformance="60" DestinationTerminal="S"/>
            <air:FlightDetails Key="/Pd5vV87RCyP1sk/2bYDcg==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T17:40:00.000-04:00" ArrivalTime="2014-06-29T08:10:00.000+02:00" FlightTime="510" TravelTime="660" Equipment="77W" OriginTerminal="I" DestinationTerminal="2E"/>
            <air:FlightDetails Key="hW2WXa8eRfCjXMcqrk4TXg==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" Equipment="CRJ" OnTimePerformance="70" DestinationTerminal="S"/>
            <air:FlightDetails Key="QObW3qF6T/Kh9msB7CDC/A==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" Equipment="764" OriginTerminal="I" DestinationTerminal="2E"/>
            <air:FlightDetails Key="RWJT4a2OTxW/eQKmp7JVMA==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T15:10:00.000-04:00" ArrivalTime="2014-06-28T16:10:00.000-04:00" FlightTime="60" TravelTime="660" Equipment="CRJ" DestinationTerminal="S"/>
            <air:FlightDetails Key="C08ZYGVZTxiKe11R8pyLhg==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T17:40:00.000-04:00" ArrivalTime="2014-06-29T08:10:00.000+02:00" FlightTime="510" TravelTime="660" Equipment="77W" OriginTerminal="I" DestinationTerminal="2E"/>
            <air:FlightDetails Key="YaVeleaMQ7O280qiQhUIvQ==" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" Equipment="DH8" OnTimePerformance="60"/>
            <air:FlightDetails Key="Qto8xVAhTsewKU8uEnuvhw==" Origin="CLT" Destination="IAD" DepartureTime="2014-06-28T14:40:00.000-04:00" ArrivalTime="2014-06-28T16:12:00.000-04:00" FlightTime="92" TravelTime="749" Equipment="CR7"/>
            <air:FlightDetails Key="XA9v/ApjTCWqiuqEfH6ZQw==" Origin="IAD" Destination="CDG" DepartureTime="2014-06-28T17:15:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="460" TravelTime="749" Equipment="763" DestinationTerminal="1"/>
            <air:FlightDetails Key="a6gqUN6DTMOZh/0zYPFcxA==" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" Equipment="DH8" OnTimePerformance="60"/>
            <air:FlightDetails Key="NVhxRDwEQUC3qtm0JS0M6A==" Origin="CLT" Destination="CDG" DepartureTime="2014-06-28T16:45:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="490" TravelTime="749" Equipment="333" DestinationTerminal="1"/>
            <air:FlightDetails Key="PBYfsiSWSlOOlzFGIWTxCg==" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" Equipment="DH3" OnTimePerformance="60"/>
            <air:FlightDetails Key="quMkwU6jQluJxBl25D+E2Q==" Origin="CLT" Destination="IAD" DepartureTime="2014-06-28T14:27:00.000-04:00" ArrivalTime="2014-06-28T15:44:00.000-04:00" FlightTime="77" TravelTime="749" Equipment="CR9" OnTimePerformance="80"/>
            <air:FlightDetails Key="jt3W0tNlTpCing+FawNFxg==" Origin="IAD" Destination="CDG" DepartureTime="2014-06-28T17:15:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="460" TravelTime="749" Equipment="763" DestinationTerminal="1"/>
         </air:FlightDetailsList>
         <air:AirSegmentList>
            <air:AirSegment Key="BghDFrDORxOeDtSVTR55qw==" Group="0" Carrier="US" FlightNumber="787" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" ETicketability="Yes" Equipment="333" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="C9|D9|Z9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U9|E9|R9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="Gnk6Hb/dSkCpQaCKFlz19w=="/>
            </air:AirSegment>
            <air:AirSegment Key="Ctjwmp1VQ0yu+R9gDq/YTA==" Group="0" Carrier="US" FlightNumber="4703" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U9|E9|R9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="6MBPXEaTQoi0YX+NEEY7IA=="/>
            </air:AirSegment>
            <air:AirSegment Key="KXrZTzhpQMW06FMrdT4FmA==" Group="0" Carrier="AF" FlightNumber="688" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T13:55:00.000+02:00" ArrivalTime="2014-06-19T17:25:00.000-04:00" FlightTime="570" TravelTime="728" ETicketability="Yes" Equipment="744" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I6|ZC"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|EC|N9|R9|V9|GR"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="HM8qnlkfQwq0zdaDTlZtew=="/>
            </air:AirSegment>
            <air:AirSegment Key="anKrpNJwTpKu8Z8j2VJohA==" Group="0" Carrier="AF" FlightNumber="9470" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T19:15:00.000-04:00" ArrivalTime="2014-06-19T20:03:00.000-04:00" FlightTime="48" TravelTime="728" ETicketability="Yes" Equipment="M88" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="DL" OperatingFlightNumber="1339"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9"/>
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|A9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|N9|R9|V9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="MbFLiy1rRsOZhJ/LYYVSNg=="/>
            </air:AirSegment>
            <air:AirSegment Key="2hwxW4XgQnmaIQ1nYkCGkA==" Group="0" Carrier="AA" FlightNumber="787" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" ETicketability="Yes" Equipment="333" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="US" OperatingFlightNumber="787"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="R7|D7"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|H7|K7|M7|L7|V7|S7|N7|G7|Q7|O7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="MGcumtrlSBuWxoY0TgP7oQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="Oeum1/cARcGMNgaljQpJpg==" Group="0" Carrier="AA" FlightNumber="5046" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|H7|K7|M7|L7|V7|S7|N7|G7|Q7|O7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="2iqm4ZZpRR2+TGufGEz0sQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="DlKDyA5OQ6a6ElWcBR+IZQ==" Group="0" Carrier="DL" FlightNumber="8606" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T13:55:00.000+02:00" ArrivalTime="2014-06-19T17:25:00.000-04:00" FlightTime="570" TravelTime="728" ETicketability="Yes" Equipment="744" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="AF" OperatingFlightNumber="688"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I0|Z0"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="vJK+HkPBSJeWriSqllVl0Q=="/>
            </air:AirSegment>
            <air:AirSegment Key="xceCVBzxSx2gm4jfsMxUQw==" Group="0" Carrier="DL" FlightNumber="1339" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T19:15:00.000-04:00" ArrivalTime="2014-06-19T20:03:00.000-04:00" FlightTime="48" TravelTime="728" ETicketability="Yes" Equipment="M88" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="First" BookingCounts="F9|P9|A9|G7"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V9|E9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="K5q2+hv0Qzu2HvBRwR9kPA=="/>
            </air:AirSegment>
            <air:AirSegment Key="li0aGpkDTN6u5wsms/D99g==" Group="0" Carrier="DL" FlightNumber="8504" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T10:45:00.000+02:00" ArrivalTime="2014-06-19T14:15:00.000-04:00" FlightTime="570" TravelTime="730" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="AF" OperatingFlightNumber="682"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z0"/>
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="hoU7y4BRSk+5tx7497KfOQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="lvJNmKjVQYm0z9d7apqA+w==" Group="0" Carrier="DL" FlightNumber="5037" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T16:10:00.000-04:00" ArrivalTime="2014-06-19T16:55:00.000-04:00" FlightTime="45" TravelTime="730" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V9|E9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="GdAeZ2UsRFmQVsTKRayhvQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="tVP8dZmQREuOGNadVYXsLQ==" Group="0" Carrier="AF" FlightNumber="682" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T10:45:00.000+02:00" ArrivalTime="2014-06-19T14:15:00.000-04:00" FlightTime="570" TravelTime="730" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z2"/>
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|A9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|EC|N9|R9|V9|GR"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="RW7aOdb6RmKEAg/G4dSOSQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="ZlGRXDC/RZuBmiiss3bodA==" Group="0" Carrier="AF" FlightNumber="8468" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T16:10:00.000-04:00" ArrivalTime="2014-06-19T16:55:00.000-04:00" FlightTime="45" TravelTime="730" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|A9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|N9|R9|V9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="h/MsIGQCSeme3eTDxAWSBQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="1FLXTLkWTlS8eY9Wxxgtdw==" Group="0" Carrier="DL" FlightNumber="43" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T08:30:00.000+02:00" ArrivalTime="2014-06-19T12:03:00.000-04:00" FlightTime="573" TravelTime="734" ETicketability="Yes" Equipment="764" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V0|E0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="+qCQysKrS3yq3Sg8WF02HA=="/>
            </air:AirSegment>
            <air:AirSegment Key="qD5jqfG6SeSqovK0pbUi2g==" Group="0" Carrier="DL" FlightNumber="5177" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T14:00:00.000-04:00" ArrivalTime="2014-06-19T14:44:00.000-04:00" FlightTime="44" TravelTime="734" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V0|E0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="TH0G+IWIS7WTK/+X2q3pvQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="ahJkcLfVTjSIQ32ubLwfTA==" Group="0" Carrier="AF" FlightNumber="3620" Origin="CDG" Destination="ATL" DepartureTime="2014-06-19T08:30:00.000+02:00" ArrivalTime="2014-06-19T12:03:00.000-04:00" FlightTime="573" TravelTime="734" ETicketability="Yes" Equipment="764" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="DL" OperatingFlightNumber="43"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|N9|R9|VC"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="JT7vUR3YQluy+LspdXCz9g=="/>
            </air:AirSegment>
            <air:AirSegment Key="uhd4RYXcR8Wjm4bBMa5vpg==" Group="0" Carrier="AF" FlightNumber="2891" Origin="ATL" Destination="CHA" DepartureTime="2014-06-19T14:00:00.000-04:00" ArrivalTime="2014-06-19T14:44:00.000-04:00" FlightTime="44" TravelTime="734" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|A9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|N9|R9|VC"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="pONP4ltUS0a0f5fAGnV3Pg=="/>
            </air:AirSegment>
            <air:AirSegment Key="KSRQU33jSZKkjAN+tW1Wow==" Group="1" Carrier="AF" FlightNumber="3693" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W2|S2|A2"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y2|B2|M2|U2|K2|H2|LC|QC|TC|NC|RC|VC"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="LeXLrYCsTQK2WBZgVosKYA=="/>
            </air:AirSegment>
            <air:AirSegment Key="6xUVe6ybT1SFCdBooOpFsA==" Group="1" Carrier="AF" FlightNumber="8985" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" ETicketability="Yes" Equipment="764" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="DL" OperatingFlightNumber="28"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|IC|ZC"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|NC|RC|VC"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="G3UGNot4QE6i79tY1JYWKw=="/>
            </air:AirSegment>
            <air:AirSegment Key="PvsfeQYMQtyZINezRHrHww==" Group="1" Carrier="DL" FlightNumber="5177" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T15:10:00.000-04:00" ArrivalTime="2014-06-28T16:10:00.000-04:00" FlightTime="60" TravelTime="660" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V9|E5"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="8z9DKAp2Sh6ggaCZ24Xn4Q=="/>
            </air:AirSegment>
            <air:AirSegment Key="kt3TV9ebSjGyt1nv3oAOJA==" Group="1" Carrier="DL" FlightNumber="8517" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T17:40:00.000-04:00" ArrivalTime="2014-06-29T08:10:00.000+02:00" FlightTime="510" TravelTime="660" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="AF" OperatingFlightNumber="681"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z9"/>
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W0"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|S9|H9|Q9|K9|L9|U9|T9|X9|V0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="/Pd5vV87RCyP1sk/2bYDcg=="/>
            </air:AirSegment>
            <air:AirSegment Key="BLwcAHGiQ4++6bwJPVOL0w==" Group="1" Carrier="DL" FlightNumber="5289" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y2|B2|M2|S2|H2|Q2|K0|L0|U0|T0|X0|V0|E0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="hW2WXa8eRfCjXMcqrk4TXg=="/>
            </air:AirSegment>
            <air:AirSegment Key="0tFf+CCYQpO6f+vYPZ7F+w==" Group="1" Carrier="DL" FlightNumber="28" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" ETicketability="Yes" Equipment="764" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I0|Z0"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B2|M2|S2|H2|Q2|K0|L0|U0|T0|X0|V0|E0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="QObW3qF6T/Kh9msB7CDC/A=="/>
            </air:AirSegment>
            <air:AirSegment Key="VHdNy4BKQCaeMl99C1DiwQ==" Group="1" Carrier="AF" FlightNumber="2891" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T15:10:00.000-04:00" ArrivalTime="2014-06-28T16:10:00.000-04:00" FlightTime="60" TravelTime="660" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|A9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|N9|R9|V9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="RWJT4a2OTxW/eQKmp7JVMA=="/>
            </air:AirSegment>
            <air:AirSegment Key="SYLQkf4hTsml15MazhmrNw==" Group="1" Carrier="AF" FlightNumber="681" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T17:40:00.000-04:00" ArrivalTime="2014-06-29T08:10:00.000+02:00" FlightTime="510" TravelTime="660" ETicketability="Yes" Equipment="77W" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|I9|Z9"/>
                  <air:BookingCodeInfo CabinClass="PremiumEconomy" BookingCounts="W9|S9|AC"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|U9|K9|H9|L9|Q9|T9|EC|N9|R9|VC|GR"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="C08ZYGVZTxiKe11R8pyLhg=="/>
            </air:AirSegment>
            <air:AirSegment Key="3Ml7yD+uRReC6Bej8/QO2g==" Group="1" Carrier="AA" FlightNumber="4702" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" ETicketability="Yes" Equipment="DH8" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|H7|K7|M7|L7|W7|V7|G7|S7|N7|Q7|O7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="YaVeleaMQ7O280qiQhUIvQ=="/>
            </air:AirSegment>
            <air:AirSegment Key="Gz36Uve2QyWVIyjn7jdWTQ==" Group="1" Carrier="UA" FlightNumber="4974" Origin="CLT" Destination="IAD" DepartureTime="2014-06-28T14:40:00.000-04:00" ArrivalTime="2014-06-28T16:12:00.000-04:00" FlightTime="92" TravelTime="749" ETicketability="Yes" Equipment="CR7" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="First" BookingCounts="F6|C6|A6|D6|Z6|P6"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|E9|U9|H9|Q9|V9|W9|S9|T9|L9|K9|G9|N9"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="Qto8xVAhTsewKU8uEnuvhw=="/>
            </air:AirSegment>
            <air:AirSegment Key="9PhtZGMDQkKYpObriDuwUA==" Group="1" Carrier="LH" FlightNumber="7640" Origin="IAD" Destination="CDG" DepartureTime="2014-06-28T17:15:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="460" TravelTime="749" ETicketability="Yes" Equipment="763" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail exists" OptionalServicesIndicator="false" AvailabilitySource="AvailStatusTTY" OperationalStatus="Flight Canceled">
               <air:CodeshareInfo OperatingCarrier="UA" OperatingFlightNumber="915"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J7|C7|D7|Z7|P7"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|M7|U7|H7|Q7|V7|W7|S7|T7|L7|K7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="XA9v/ApjTCWqiuqEfH6ZQw=="/>
            </air:AirSegment>
            <air:AirSegment Key="4nyKuXrKQC6cUNyh219J6g==" Group="1" Carrier="AA" FlightNumber="4702" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" ETicketability="Yes" Equipment="DH8" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|H7|K7|M7|L7|V7|S7|N7|G7|Q7|O7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="a6gqUN6DTMOZh/0zYPFcxA=="/>
            </air:AirSegment>
            <air:AirSegment Key="Zp9TdGoySnyuJ7/MjvT1UA==" Group="1" Carrier="AA" FlightNumber="786" Origin="CLT" Destination="CDG" DepartureTime="2014-06-28T16:45:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="490" TravelTime="749" ETicketability="Yes" Equipment="333" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:CodeshareInfo OperatingCarrier="US" OperatingFlightNumber="786"/>
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="R7|D7"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y7|B7|H7|K7|M7|L7|V7|S7|N7|G7|Q7|O7"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="NVhxRDwEQUC3qtm0JS0M6A=="/>
            </air:AirSegment>
            <air:AirSegment Key="qhn7UN0nTees+vCERsKROw==" Group="1" Carrier="US" FlightNumber="4339" Origin="CHA" Destination="CLT" DepartureTime="2014-06-28T12:26:00.000-04:00" ArrivalTime="2014-06-28T13:56:00.000-04:00" FlightTime="90" TravelTime="749" ETicketability="Yes" Equipment="DH3" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U1|E0|R0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="PBYfsiSWSlOOlzFGIWTxCg=="/>
            </air:AirSegment>
            <air:AirSegment Key="UqMhXhlORg2fVlW9iFC3Uw==" Group="1" Carrier="US" FlightNumber="2890" Origin="CLT" Destination="IAD" DepartureTime="2014-06-28T14:27:00.000-04:00" ArrivalTime="2014-06-28T15:44:00.000-04:00" FlightTime="77" TravelTime="749" ETicketability="Yes" Equipment="CR9" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="First" BookingCounts="F9|A9|P9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U1|E0|R0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="quMkwU6jQluJxBl25D+E2Q=="/>
            </air:AirSegment>
            <air:AirSegment Key="XoaE97DxRjOBWjhy1nSzMg==" Group="1" Carrier="UA" FlightNumber="915" Origin="IAD" Destination="CDG" DepartureTime="2014-06-28T17:15:00.000-04:00" ArrivalTime="2014-06-29T06:55:00.000+02:00" FlightTime="460" TravelTime="749" ETicketability="Yes" Equipment="763" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
               <air:AirAvailInfo ProviderCode="1G">
                  <air:BookingCodeInfo CabinClass="Business" BookingCounts="J9|C9|D9|Z9|P9"/>
                  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|E9|U9|H9|Q9|V9|W9|S0|T0|L0|K0|G0|N0"/>
               </air:AirAvailInfo>
               <air:FlightDetailsRef Key="jt3W0tNlTpCing+FawNFxg=="/>
            </air:AirSegment>
         </air:AirSegmentList>
         <air:AirItinerarySolution Key="Sj9QAm8iRSK2XGbyHoIKmA==">
            <air:AirSegmentRef Key="BghDFrDORxOeDtSVTR55qw=="/>
            <air:AirSegmentRef Key="Ctjwmp1VQ0yu+R9gDq/YTA=="/>
            <air:AirSegmentRef Key="KXrZTzhpQMW06FMrdT4FmA=="/>
            <air:AirSegmentRef Key="anKrpNJwTpKu8Z8j2VJohA=="/>
            <air:AirSegmentRef Key="2hwxW4XgQnmaIQ1nYkCGkA=="/>
            <air:AirSegmentRef Key="Oeum1/cARcGMNgaljQpJpg=="/>
            <air:AirSegmentRef Key="DlKDyA5OQ6a6ElWcBR+IZQ=="/>
            <air:AirSegmentRef Key="xceCVBzxSx2gm4jfsMxUQw=="/>
            <air:AirSegmentRef Key="li0aGpkDTN6u5wsms/D99g=="/>
            <air:AirSegmentRef Key="lvJNmKjVQYm0z9d7apqA+w=="/>
            <air:AirSegmentRef Key="tVP8dZmQREuOGNadVYXsLQ=="/>
            <air:AirSegmentRef Key="ZlGRXDC/RZuBmiiss3bodA=="/>
            <air:AirSegmentRef Key="1FLXTLkWTlS8eY9Wxxgtdw=="/>
           	<air:AirSegmentRef Key="qD5jqfG6SeSqovK0pbUi2g=="/>
            <air:AirSegmentRef Key="ahJkcLfVTjSIQ32ubLwfTA=="/>
            <air:AirSegmentRef Key="uhd4RYXcR8Wjm4bBMa5vpg=="/>
            <air:Connection SegmentIndex="0"/>
            <air:Connection SegmentIndex="2"/>
            <air:Connection SegmentIndex="4"/>
            <air:Connection SegmentIndex="6"/>
            <air:Connection SegmentIndex="8"/>
            <air:Connection SegmentIndex="10"/>
            <air:Connection SegmentIndex="12"/>
            <air:Connection SegmentIndex="14"/>
         </air:AirItinerarySolution>
         <air:AirItinerarySolution Key="t5Jva/QBRymp1XdkZoKwYg==">
            <air:AirSegmentRef Key="KSRQU33jSZKkjAN+tW1Wow=="/>
            <air:AirSegmentRef Key="6xUVe6ybT1SFCdBooOpFsA=="/>
            <air:AirSegmentRef Key="PvsfeQYMQtyZINezRHrHww=="/>
            <air:AirSegmentRef Key="kt3TV9ebSjGyt1nv3oAOJA=="/>
            <air:AirSegmentRef Key="BLwcAHGiQ4++6bwJPVOL0w=="/>
            <air:AirSegmentRef Key="0tFf+CCYQpO6f+vYPZ7F+w=="/>
           	<air:AirSegmentRef Key="VHdNy4BKQCaeMl99C1DiwQ=="/>
            <air:AirSegmentRef Key="SYLQkf4hTsml15MazhmrNw=="/>
            <air:AirSegmentRef Key="3Ml7yD+uRReC6Bej8/QO2g=="/>
            <air:AirSegmentRef Key="Gz36Uve2QyWVIyjn7jdWTQ=="/>
            <air:AirSegmentRef Key="9PhtZGMDQkKYpObriDuwUA=="/>
            <air:AirSegmentRef Key="4nyKuXrKQC6cUNyh219J6g=="/>
            <air:AirSegmentRef Key="Zp9TdGoySnyuJ7/MjvT1UA=="/>
            <air:AirSegmentRef Key="qhn7UN0nTees+vCERsKROw=="/>
            <air:AirSegmentRef Key="UqMhXhlORg2fVlW9iFC3Uw=="/>
            <air:AirSegmentRef Key="XoaE97DxRjOBWjhy1nSzMg=="/>
            <air:Connection SegmentIndex="0"/>
            <air:Connection SegmentIndex="2"/>
            <air:Connection SegmentIndex="4"/>
            <air:Connection SegmentIndex="6"/>
            <air:Connection SegmentIndex="8"/>
            <air:Connection SegmentIndex="9"/>
            <air:Connection SegmentIndex="11"/>
            <air:Connection SegmentIndex="13"/>
            <air:Connection SegmentIndex="14"/>
         </air:AirItinerarySolution>
      </air:AvailabilitySearchRsp>
   </SOAP:Body>
</SOAP:Envelope> 

{% endhighlight %}


Let’s understand the approach the uAPI is using to encode the results.

Each type of entity is detailed once, typically in a “list” of that type, for example the air:FlightDetailsList has many air:FlightDetails entities within it (and many more were clipped out for space reasons). Similarly, the air:AirSegmentList contains many air:AirSegment encodings (again, we removed many air:AirSegment items for space).

However, it is important to note that within the air:AirSegment, the response does not repeat the air:FlightDetails, but instead uses an air:FlightDetailsRef to refer to the flight details in question. The air:FlightDetailsRef has a Key attribute that matches up with the Key attribute in the air:FlightDetails object.

Why do it this way? Primarily, this approach avoids repetition which would bloat the already large requests and responses. If you look at the last XML objects in the example, you will see two “solutions” (air:AirItinerarySolution) that clearly indicate that it is possible to have a compact representation… after you have all the definitions above!

Despite the name, a single air:ItinerarySolution may encode many possible itineraries because it “connects” segments with the air:Connection entries. We’ll explain more about this later when we’ll cover building “routings”.

The large size of these messages and the complexity of encoding and decoding them is one of the more serious complaints about SOAP/XML as a transport mechanism in systems such as the uAPI. We will not debate that point here, but it’s important to highlight that the requests and responses sent to and from the Travelport system often end up being hundreds of lines of XML. If you are concerned about the size of the data being passed from your client to the Travelport servers, you can enable the gzip compression algorithm in the headers of your web requests with Accept-Encoding: gzip, deflate.


### Decoding Part One: Building Key Maps

For this tutorial, we have provided you with helper code to take a list, such as air:FlightDetailsList, and build a Java HashMap that maps all keys to the full air:FlightDetails objects. This is handy to build first, so when your are decoding something like the air:AirItinerarySolution you can easily get to the “true” objects being worked with.

Here is the part of the main() routine in Lesson2 that builds the maps allSegments and allDetails from the response (rsp) to our availability search request:


{% highlight java %}

//make tables that map the "key" (or a reference) to the proper
//segment and the proper flight details
Helper.AirSegmentMap allSegments = Helper.createAirSegmentMap(rsp.getAirSegmentList().getAirSegment());
Helper.FlightDetailsMap allDetails = Helper.createFlightDetailsMap(rsp.getFlightDetailsList().getFlightDetails()); 

{% endhighlight %}


It’s worth noting in this example that to get access to the list of air:AirSegment objects in the result, the Java code is getAirSegmentList().getAirSegment(). This peculiarity is tied to the way that CXF encodes the types expressed in the Air.wsdl file into a Java representation. Other programming languages might use an array or other data structure to encode the list of air segments.

### Decoding part 2: air solutions

It would be handy if the results returned from an air availability search could be pulled out of the response and directly used as parameters back to the uAPI as all or part of a air price request.

However, the availability search returns many possible solutions and these are encoded in a compact way, see air:AirItinerarySolution in the XML example above. Conversely, the air price port requires that you supply a single itinerary, in the form of an AirItinerary object, for pricing. Some of the pieces of an AirItinerary can be constructed from the pieces returned from the server to us, but most of the pieces of an AirItinerary have to be derived from the results we have obtained from the AirAvailabilitySearchRsp.

In our XML example above, we displayed exactly two AirItinerarySolution objects. This is all that were present in the result because one AirItinerarySolution is returned for each “leg” of the journey that has been searched for. In this case, our search was from CDG (Paris) to CHA (Chattanooga) on the first leg and the reverse for the way back. The code in main that takes care of this small issue is :


{% highlight java %}
//Each "solution" is for a particular part of the journey... on		
//a round trip there will be two of thes
List<AirItinerarySolution> solutions = rsp.getAirItinerarySolution();
AirItinerarySolution outboundSolution = solutions.get(0);			
AirItinerarySolution inboundSolution = solutions.get(1); 

{% endhighlight %}


### Decoding part 3: building routings

A “routing” is a set a flights, in some order, that get the traveller from an origin to a destination. This set has one element in the case of a direct flight, otherwise it has one or more “connections”. The code for building the final “routings” is quite short in main() for Lesson2:

{% highlight java %}
//bound the routings by using the connections
List<AirItinerary> out = buildRoutings(outboundSolution, 0, allSegments, allDetails);
List<AirItinerary> in = buildRoutings(inboundSolution, 1, allSegments, allDetails);	
//merge in and out itins so we can get pricing for whole deal		
List<AirItinerary> allItins = mergeOutboundAndInbound(out, in); 

{% endhighlight %}


The functions buildRoutings() and mergeOutboundAndInbound() hide quite a bit of complexity. Let’s start by thinking about how to construct a routing from the XML.

From the example above, this is the outbound solution:


{% highlight xml %}

 <air:AirItinerarySolution Key="Sj9QAm8iRSK2XGbyHoIKmA==">
	<air:AirSegmentRef Key="BghDFrDORxOeDtSVTR55qw=="/>
	<air:AirSegmentRef Key="Ctjwmp1VQ0yu+R9gDq/YTA=="/>
	<air:AirSegmentRef Key="KXrZTzhpQMW06FMrdT4FmA=="/>
	<air:AirSegmentRef Key="anKrpNJwTpKu8Z8j2VJohA=="/>
	<air:AirSegmentRef Key="2hwxW4XgQnmaIQ1nYkCGkA=="/>
	<air:AirSegmentRef Key="Oeum1/cARcGMNgaljQpJpg=="/>
	<air:AirSegmentRef Key="DlKDyA5OQ6a6ElWcBR+IZQ=="/>
	<air:AirSegmentRef Key="xceCVBzxSx2gm4jfsMxUQw=="/>
	<air:AirSegmentRef Key="li0aGpkDTN6u5wsms/D99g=="/>
	<air:AirSegmentRef Key="lvJNmKjVQYm0z9d7apqA+w=="/>
	<air:AirSegmentRef Key="tVP8dZmQREuOGNadVYXsLQ=="/>
	<air:AirSegmentRef Key="ZlGRXDC/RZuBmiiss3bodA=="/>
	<air:AirSegmentRef Key="1FLXTLkWTlS8eY9Wxxgtdw=="/>
	<air:AirSegmentRef Key="qD5jqfG6SeSqovK0pbUi2g=="/>
	<air:AirSegmentRef Key="ahJkcLfVTjSIQ32ubLwfTA=="/>
	<air:AirSegmentRef Key="uhd4RYXcR8Wjm4bBMa5vpg=="/>
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

At first glance, it looks like this solution has a total of 16 air segments involved… way more than just a trip from Paris to Chattanooga via Atlanta! The connections (air:Connection) at the bottom are the key to understanding what route takes someone from Paris to Chattanooga.

The first air connection object indicates that index 0 of the list above, the air segment ref with key “BghDFrDORxOeDtSVTR55qw==“ has a connection to the next air segment ref (key “Ctjwmp1VQ0yu+R9gDq/YTA==”). If we return to the very top of the XML example given previously and extract the air segments that are referred to by keys BghDFrDORxOeDtSVTR55qw== and Ctjwmp1VQ0yu+R9gDq/YTA== we have:


{% highlight xml %}
<air:AirSegment Key="BghDFrDORxOeDtSVTR55qw==" Group="0" Carrier="US" FlightNumber="787" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" ETicketability="Yes" Equipment="333" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
<air:AirAvailInfo ProviderCode="1G">
  <air:BookingCodeInfo CabinClass="Business" BookingCounts="C9|D9|Z9"/>
  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U9|E9|R9"/>
</air:AirAvailInfo>
<air:FlightDetailsRef Key="L0aZH3NHTnCF4nGr4SGuUw=="/>
</air:AirSegment>
<air:AirSegment Key="Ctjwmp1VQ0yu+R9gDq/YTA==" Group="0" Carrier="US" FlightNumber="4703" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless">
<air:AirAvailInfo ProviderCode="1G">
  <air:BookingCodeInfo CabinClass="Economy" BookingCounts="Y9|B9|M9|H9|Q9|N9|V9|W9|L9|S9|T9|G9|K9|U9|E9|R9"/>
</air:AirAvailInfo>
<air:FlightDetailsRef Key="7VqUUrr7RnanR/eFSV5Syw=="/>
</air:AirSegment>
{% endhighlight %}


This shows the two flights needed to get from Paris to Chattanooga: US Airways flight 787 (Carrier=”US” and FlightNumber=”787”) from CDG to CLT and then US Airways flight 4703.
 
This processing of using the AirSolution objects’ Connection objects to figure out the necessary AirSegment objects, taken from the maps built in “Decoding part 1”, is the job of the function buildRoutings() shown earlier. The routing result is an AirItinerary object with the correct legs in it for the particular outbound or inbound journey. Since the routings for outbound and inbound are built separately - the air:AirItinerarySolution entities in the XML dictate this - we will need to combine the outbound and inbound itineraries (in the right order!) to form full return itineraries. Without this, we would be pricing the one way journeys either from Paris to Chattanooga, or the reverse.
  

In Lesson2, the function mergeOutboundAndInbound() creates a Java List of all the combinations of outbound and return itineraries created by buildRoutings(). This is done by creating every permutation (the cross product) of the two input lists of AirItinerary objects.

### Pricing

We now have a List<AirItinerary> object, with each element indicating a journey that is suitable for pricing.

As with any port we have discussed in this tutorial, we must first construct the correct request parameters, in this case AirPricingReq. The AirPricingReq object has a few more parameters that are needed besides the itinerary, such as the cabin preference (in case multiple are available), the type of passenger, etc.

This is the critical part of the function displayItineraryPrice that does the work of calling the uAPI to get a price for an AirItinerary by calling another method priceItinerary.

	
{% highlight java %}
public static void displayItineraryPrice(AirItinerary itin) throws AirFaultMessage {
	AirPriceRsp priceRsp = priceItinerary(itin);

	//print price result
	List<AirPriceResult> prices = priceRsp.getAirPriceResult();
	for (Iterator<AirPriceResult> i = prices.iterator(); i.hasNext();) {
		AirPriceResult result = (AirPriceResult) i.next();
		if (result.getAirPriceError()!=null) {
			TypeResultMessage msg= result.getAirPriceError();
			System.err.println("Error during pricing operation:"+
					msg.getType()+":"+msg.getValue());
		} else {
			List<AirPricingSolution> priceingSolns = result.getAirPricingSolution();
			Iterator<AirPricingSolution> aps = priceingSolns.iterator();
			while(aps.hasNext()){
				AirPricingSolution soln = aps.next();
				System.out.print("Price:"+ soln.getTotalPrice());
System.out.print(" [BasePrice "+soln.getBasePrice() +", ");
				System.out.println("Taxes "+soln.getTaxes()+"]");
				}
			}
		}
}

public static AirPriceRsp priceItinerary(AirItinerary itin) throws AirFaultMessage {
	//now lets try to price it
	AirPriceReq priceReq = new AirPriceReq();

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
	adult.setBookingTravelerRef(travelerRef);
	priceReq.getSearchPassenger().add(adult);
		
	//add point of sale (v18_0)
	AirReq.addPointOfSale(priceReq, "UAPI");
	
	//make the request to tport
	//WSDLService.airPrice.showXML(true);
	return WSDLService.airPrice.get().service(priceReq);
} 

{% endhighlight %}

### AirPriceReq

One of the most crucial functions of the uAPI is its ability to accurately price a given itinerary and display not only the total price to be paid, but also to break down all the pricing components as well. In addition, there is the complex issue of which taxes and from what jurisdiction should be applied. Here is an example AirPricingReq in XML as sent from Lesson 2 to Travelport:

{% highlight xml %}
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
      <air:AirPriceReq AuthorizedBy="user" TargetBranch="TRGT_BRCH" TraceId="trace" xmlns:air="http://www.travelport.com/schema/air_v26_0">
         <com:BillingPointOfSaleInfo OriginApplication="UAPI" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <air:AirItinerary>
            <air:AirSegment Key="BghDFrDORxOeDtSVTR55qw==" Group="0" Carrier="US" FlightNumber="787" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" ETicketability="Yes" Equipment="333" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ProviderCode="1G">
               <air:FlightDetails Key="Gnk6Hb/dSkCpQaCKFlz19w==" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="728" Equipment="333" OriginTerminal="1"/>
            </air:AirSegment>
            <air:AirSegment Key="Ctjwmp1VQ0yu+R9gDq/YTA==" Group="0" Carrier="US" FlightNumber="4703" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ProviderCode="1G">
               <air:FlightDetails Key="6MBPXEaTQoi0YX+NEEY7IA==" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="728" Equipment="CRJ" OnTimePerformance="50"/>
            </air:AirSegment>
            <air:AirSegment Key="KSRQU33jSZKkjAN+tW1Wow==" Group="1" Carrier="AF" FlightNumber="3693" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" ETicketability="Yes" Equipment="CRJ" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ProviderCode="1G">
               <air:FlightDetails Key="LeXLrYCsTQK2WBZgVosKYA==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="660" Equipment="CRJ" DestinationTerminal="S"/>
            </air:AirSegment>
            <air:AirSegment Key="6xUVe6ybT1SFCdBooOpFsA==" Group="1" Carrier="AF" FlightNumber="8985" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" ETicketability="Yes" Equipment="764" ChangeOfPlane="false" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ProviderCode="1G">
               <air:FlightDetails Key="G3UGNot4QE6i79tY1JYWKw==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="660" Equipment="764" OriginTerminal="I" DestinationTerminal="2E"/>
            </air:AirSegment>
         </air:AirItinerary>
         <com:SearchPassenger BookingTravelerRef="gr8AVWGCR064r57Jt0+8bA==" Code="ADT" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <air:AirPricingCommand CabinClass="Economy"/>
      </air:AirPriceReq>
   </soapenv:Body>
</soapenv:Envelope> 

{% endhighlight %}

As you can see, primarily the request consists of the details of the flights to be travelled on plus a few extra details such as the passenger type and cabin class. The outbound journey is two AirSegment objects, but both in Group zero; the return segments are in Group one. A careful reader might be wondering why the FlightDetails elements have the Key attribute on them, such as the “LeXLrYCsTQK2WBZgVosKYA==” associated with the flight from CHA to ATL. These are not used in this request (and are ignored by uAPI) but are “leftovers” from re-using the some parts of the results provided as a response to our availability request done previously.

### Pricing Response

Below is a slightly-edited pricing response provided by Travelport in response to an AirPriceReq from Lesson 2 as seen above. The optional services section has been removed as it is quite long and not within the scope of this tutorial.

The particular details of understanding all the aspects of this response are beyond what we can cover in this tutorial. We do ask you to look at the two highlighted portions of the XML response, marked with highlight 1 and 2. Highlight one shows the AirPricingSolution component of the XML, probably the one that most readers (and travellers!) are most interested in! The second highlight comment shows the section related to taxes. Each of the taxes specified, identified by its Category attribute such as XF, relates to a specific IATA-published tax. In this case, a reader with access to the list of taxes could determine that the XF or “Passenger Facility Charge” tax is applied one time. This is makes sense once realizes that this facility charge is charged only on flights originating from a given airport.


{% highlight xml %}
<SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP:Body>
      <air:AirPriceRsp TraceId="trace" TransactionId="D78AC8530A07761F653540775EFAB8E1" ResponseTime="2219" xmlns:air="http://www.travelport.com/schema/air_v26_0" xmlns:common_v26_0="http://www.travelport.com/schema/common_v26_0">      
         <air:AirItinerary>
            <air:AirSegment Key="aJ+85P2LQuatsglZjH2vEA==" Group="0" Carrier="US" FlightNumber="787" ProviderCode="1G" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="560" Distance="4169" ClassOfService="Y" Equipment="333" ChangeOfPlane="false" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used">
               <air:FlightDetails Key="YR3LnDGHSR2rygLHy54xQA==" Origin="CDG" Destination="CLT" DepartureTime="2014-06-19T11:00:00.000+02:00" ArrivalTime="2014-06-19T14:20:00.000-04:00" FlightTime="560" TravelTime="560"/>
            </air:AirSegment>
            <air:AirSegment Key="tMd98wTSTfS6P/MlJqIBTQ==" Group="0" Carrier="US" FlightNumber="4703" ProviderCode="1G" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="64" Distance="242" ClassOfService="Y" Equipment="CRJ" ChangeOfPlane="false" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used">
               <air:FlightDetails Key="O+xow5YqSbKSTEClE223ew==" Origin="CLT" Destination="CHA" DepartureTime="2014-06-19T16:04:00.000-04:00" ArrivalTime="2014-06-19T17:08:00.000-04:00" FlightTime="64" TravelTime="64"/>
            </air:AirSegment>
            <air:AirSegment Key="QmzJXO7FSNSI0Idf/2cYwQ==" Group="1" Carrier="AF" FlightNumber="3693" ProviderCode="1G" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="58" Distance="107" ClassOfService="Y" Equipment="CRJ" ChangeOfPlane="false" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used">
               <air:FlightDetails Key="mwtwPJL7TuqHpZq+mvFXFg==" Origin="CHA" Destination="ATL" DepartureTime="2014-06-28T13:10:00.000-04:00" ArrivalTime="2014-06-28T14:08:00.000-04:00" FlightTime="58" TravelTime="58"/>
            </air:AirSegment>
            <air:AirSegment Key="2Arnr04sS1a7+V7eP0Bf0A==" Group="1" Carrier="AF" FlightNumber="8985" ProviderCode="1G" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="525" Distance="4390" ClassOfService="Y" Equipment="764" ChangeOfPlane="false" OptionalServicesIndicator="false" AvailabilitySource="Seamless" ParticipantLevel="Secure Sell" LinkAvailability="true" PolledAvailabilityOption="Polled avail used">
               <air:FlightDetails Key="iRfx8rZQT+qc0YVOIcDGDQ==" Origin="ATL" Destination="CDG" DepartureTime="2014-06-28T15:25:00.000-04:00" ArrivalTime="2014-06-29T06:10:00.000+02:00" FlightTime="525" TravelTime="525"/>
            </air:AirSegment>
         </air:AirItinerary>
         <air:AirPriceResult>
        <!--
		  HIGHLIGHT 1: THE PRICE
	 -->
            <air:AirPricingSolution Key="o+pya9W6T+Gy87Co05wJQg==" TotalPrice="USD7776.50" BasePrice="EUR5367.00" ApproximateTotalPrice="USD7776.50" ApproximateBasePrice="USD7427.00" EquivalentBasePrice="USD7427.00" Taxes="USD349.50">
               <air:AirSegmentRef Key="aJ+85P2LQuatsglZjH2vEA=="/>
               <air:AirSegmentRef Key="tMd98wTSTfS6P/MlJqIBTQ=="/>
               <air:AirSegmentRef Key="QmzJXO7FSNSI0Idf/2cYwQ=="/>
               <air:AirSegmentRef Key="2Arnr04sS1a7+V7eP0Bf0A=="/>
               <air:AirPricingInfo Key="meu2KDNhQAGCGQJhYwRfEA==" TotalPrice="USD7776.50" BasePrice="EUR5367.00" ApproximateTotalPrice="USD7776.50" ApproximateBasePrice="USD7427.00" EquivalentBasePrice="USD7427.00" Taxes="USD349.50" LatestTicketingTime="2014-06-19T23:59:00.000-04:00" PricingMethod="Guaranteed" Refundable="true" IncludesVAT="false" ETicketability="Yes" PlatingCarrier="AF" ProviderCode="1G">
                  <air:FareInfo Key="616nlLJPTYe6eltTKUXxdA==" FareBasis="Y" PassengerTypeCode="ADT" Origin="CDG" Destination="CHA" EffectiveDate="2014-05-07T12:36:00.000-04:00" DepartureDate="2014-06-19" Amount="NUC3859.27">
                     <air:FareSurcharge Key="TAVD7Fc8RpWdjJ9ZEfcZ4Q==" Type="Other" Amount="NUC193.23"/>
                     <air:FareRuleKey FareInfoRef="616nlLJPTYe6eltTKUXxdA==" ProviderCode="1G">3TFrSfabjMy3B8PanMGpdXBoLjhbR1gVcGguOFtHWBVwaC44W0dYFXBoLjhbR1gVcGguOFtHWBVg3wcBOxII7c4ehECoSxMqtrxcCZbzmQUieAZzX1zdFT5sY+couqFYiZ0GuEvenFYyCpREeNngGrGPlzQJBf8N0GUe2Mq77PqR9dh0BNJmJp6j53MLJY8gk8KgKKgD/M8T3axPaUkreQ4V5JiCuyeaaoV7e0sQ5xcwzPCpW6ysnrPxxXH+cPyeVL8cFMthAhdnrlEaTtT8m2+F4LXF94M9b4XgtcX3gz1vheC1xfeDPW+F4LXF94M9b4XgtcX3gz3PFSbUjR/jPjwn8Jtn5AyUTkU5ix234WEeKfLo+guRnY+kJvAqa0I9diMTcBymlraCSrHwSU22hIWS16b4Cyqb</air:FareRuleKey>
                  </air:FareInfo>
                  <air:FareInfo Key="wI1fVATWRFm8/UR1W5teOQ==" FareBasis="YFF" PassengerTypeCode="ADT" Origin="CHA" Destination="CDG" EffectiveDate="2014-05-07T12:36:00.000-04:00" DepartureDate="2014-06-28" Amount="NUC3355.45">
                     <air:FareRuleKey FareInfoRef="wI1fVATWRFm8/UR1W5teOQ==" ProviderCode="1G">3TFrSfabjMy3B8PanMGpdXBoLjhbR1gVcGguOFtHWBVwaC44W0dYFXBoLjhbR1gVcGguOFtHWBVg3wcBOxII7SSXKnfq7KyWtrxcCZbzmQVrphp/cIIKMlKfDyo1VU0BGCZHhmWO6JcyCpREeNngGl6zyAGrimt+izgx5P88hqzcgKkdC2lARK2iJwJFdxeFIXf+FXPDPKeSogZBJfxhOys6FQf5LT3GzCqxPJEZkfZEM2piTgRvorO3IVH4FlwAmfXGJt3oesW8q+GF+WhBr2+F4LXF94M9b4XgtcX3gz1vheC1xfeDPW+F4LXF94M9b4XgtcX3gz3IKozv0qZkQS0NUIis7KKABwo3eQ6CWKGEHLUqhXB6oDtnyF/mAWqWVJAq9LYQQTQ9iDMQYO8NLffKcstq9lK9+jTNUUAbVTc=</air:FareRuleKey>
                  </air:FareInfo>
                  <air:BookingInfo BookingCode="Y" CabinClass="Economy" FareInfoRef="616nlLJPTYe6eltTKUXxdA==" SegmentRef="aJ+85P2LQuatsglZjH2vEA=="/>
                  <air:BookingInfo BookingCode="Y" CabinClass="Economy" FareInfoRef="616nlLJPTYe6eltTKUXxdA==" SegmentRef="tMd98wTSTfS6P/MlJqIBTQ=="/>
                  <air:BookingInfo BookingCode="Y" CabinClass="Economy" FareInfoRef="wI1fVATWRFm8/UR1W5teOQ==" SegmentRef="QmzJXO7FSNSI0Idf/2cYwQ=="/>
                  <air:BookingInfo BookingCode="Y" CabinClass="Economy" FareInfoRef="wI1fVATWRFm8/UR1W5teOQ==" SegmentRef="2Arnr04sS1a7+V7eP0Bf0A=="/>
	        <!--
		    HIGHLIGHT 2: TAXES
		-->
                  <air:TaxInfo Category="AY" Amount="USD7.50" Key="7UCn93mFSmWs/YiqDJnKGw=="/>
                  <air:TaxInfo Category="US" Amount="USD35.00" Key="/K/rKi2jTOGzkjSD1Y3Fmw=="/>
                  <air:TaxInfo Category="XA" Amount="USD5.00" Key="L2sBWAM2Q/m3oC2dtBRRgg=="/>
                  <air:TaxInfo Category="XF" Amount="USD12.00" Key="LF8JiecWRX2avgeKZqyJyg==">
                     <air:TaxDetail Amount="USD3.00" OriginAirport="CLT"/>
                     <air:TaxDetail Amount="USD4.50" OriginAirport="CHA"/>
                     <air:TaxDetail Amount="USD4.50" OriginAirport="ATL"/>
                  </air:TaxInfo>
                  <air:TaxInfo Category="XY" Amount="USD7.00" Key="8UdDQceWQvaW+PnLiIurbw=="/>
                  <air:TaxInfo Category="YC" Amount="USD5.50" Key="gWEJrdH5RqWEuwQdx+tCgw=="/>
                  <air:TaxInfo Category="FR" Amount="USD28.50" Key="e5WTSZpwS0q9zea053fm3Q=="/>
                  <air:TaxInfo Category="IZ" Amount="USD6.20" Key="e8ybQMmpSV2nyQe/hI09zQ=="/>
                  <air:TaxInfo Category="QX" Amount="USD39.40" Key="dmmkxqnyR5KmxXGdUxcjqw=="/>
                  <air:TaxInfo Category="YR" Amount="USD203.40" Key="T6jaLoC6SLK9boN6k6WFNw=="/>
                  <air:FareCalc>PAR US X/CLT Q193.23 US CHA M3859.27Y AF X/ATL AF PAR M3355.45YFF NUC7407.95END ROE0.724488</air:FareCalc>
                  <air:PassengerType Code="ADT"/>
                  <air:ChangePenalty>
                     <air:Percentage>0.00</air:Percentage>
                  </air:ChangePenalty>
                  <air:CancelPenalty>
                     <air:Percentage>0.00</air:Percentage>
                  </air:CancelPenalty>
                  <air:BaggageAllowances>
                     <air:BaggageAllowanceInfo TravelerType="ADT" Origin="PAR" Destination="CHA" Carrier="US">
                        <air:URLInfo>                                          <air:URL>MYTRIPANDMORE.COM/BAGGAGEDETAILSUS.BAGG</air:URL>
                        </air:URLInfo>
                        <air:TextInfo>
                           <air:Text>1P</air:Text>
                           <air:Text>BAGGAGE DISCOUNTS MAY APPLY BASED ON FREQUENT FLYER STATUS/ ONLINE CHECKIN/FORM OF PAYMENT/MILITARY/ETC.</air:Text>
                        </air:TextInfo>
                        <air:BagDetails ApplicableBags="1stChecked" BasePrice="EUR0.00" ApproximateBasePrice="USD0.00" TotalPrice="EUR0.00" ApproximateTotalPrice="USD0.00">
                           <air:BaggageRestriction>
                              <air:TextInfo>
                                 <air:Text>UPTO50LB/23KG AND UPTO62LI/158LCM</air:Text>
                              </air:TextInfo>
                           </air:BaggageRestriction>
                        </air:BagDetails>
                        <air:BagDetails ApplicableBags="2ndChecked" BasePrice="EUR73.00" ApproximateBasePrice="USD101.02" TotalPrice="EUR73.00" ApproximateTotalPrice="USD101.02">
                           <air:BaggageRestriction>
                              <air:TextInfo>
                                 <air:Text>UPTO50LB/23KG AND UPTO62LI/158LCM</air:Text>
                              </air:TextInfo>
                           </air:BaggageRestriction>
                        </air:BagDetails>
                     </air:BaggageAllowanceInfo>
                     <air:BaggageAllowanceInfo TravelerType="ADT" Origin="CHA" Destination="PAR" Carrier="US">
                        <air:URLInfo>                           <air:URL>MYTRIPANDMORE.COM/BAGGAGEDETAILSUS.BAGG</air:URL>
                        </air:URLInfo>
                        <air:TextInfo>
                           <air:Text>1P</air:Text>
                           <air:Text>BAGGAGE DISCOUNTS MAY APPLY BASED ON FREQUENT FLYER STATUS/ ONLINE CHECKIN/FORM OF PAYMENT/MILITARY/ETC.</air:Text>
                        </air:TextInfo>
                        <air:BagDetails ApplicableBags="1stChecked" BasePrice="EUR0.00" ApproximateBasePrice="USD0.00" TotalPrice="EUR0.00" ApproximateTotalPrice="USD0.00">
                           <air:BaggageRestriction>
                              <air:TextInfo>
                                 <air:Text>UPTO50LB/23KG AND UPTO62LI/158LCM</air:Text>
                              </air:TextInfo>
                           </air:BaggageRestriction>
                        </air:BagDetails>
                        <air:BagDetails ApplicableBags="2ndChecked" BasePrice="EUR73.00" ApproximateBasePrice="USD101.02" TotalPrice="EUR73.00" ApproximateTotalPrice="USD101.02">
                           <air:BaggageRestriction>
                              <air:TextInfo>
                                 <air:Text>UPTO50LB/23KG AND UPTO62LI/158LCM</air:Text>
                              </air:TextInfo>
                           </air:BaggageRestriction>
                        </air:BagDetails>
                     </air:BaggageAllowanceInfo>
                     <air:CarryOnAllowanceInfo Origin="PAR" Destination="CLT" Carrier="US">
                        <air:TextInfo>
                           <air:Text>UPTO40LB/18KG AND UPTO45LI/115LCM</air:Text>
                        </air:TextInfo>
                        <air:TextInfo>
                           <air:Text>CARRYON HAND BAGGAGE ALLOWANCE</air:Text>
                        </air:TextInfo>
                        <air:CarryOnDetails ApplicableCarryOnBags="1" BasePrice="EUR0.00" ApproximateBasePrice="USD0.00" TotalPrice="EUR0.00" ApproximateTotalPrice="USD0.00"/>
                        <air:CarryOnDetails ApplicableCarryOnBags="2" BasePrice="USD0.00" ApproximateBasePrice="USD0.00" TotalPrice="USD0.00" ApproximateTotalPrice="USD0.00"/>
                     </air:CarryOnAllowanceInfo>
                     <air:CarryOnAllowanceInfo Origin="CLT" Destination="CHA" Carrier="US">
                        <air:TextInfo>
                           <air:Text>UPTO40LB/18KG AND UPTO45LI/115LCM</air:Text>
                        </air:TextInfo>
                        <air:TextInfo>
                           <air:Text>CARRYON HAND BAGGAGE ALLOWANCE</air:Text>
                        </air:TextInfo>
                        <air:CarryOnDetails ApplicableCarryOnBags="1" BasePrice="USD0.00" ApproximateBasePrice="USD0.00" TotalPrice="USD0.00" ApproximateTotalPrice="USD0.00"/>
                        <air:CarryOnDetails ApplicableCarryOnBags="2" BasePrice="USD0.00" ApproximateBasePrice="USD0.00" TotalPrice="USD0.00" ApproximateTotalPrice="USD0.00"/>
                     </air:CarryOnAllowanceInfo>
                     <air:CarryOnAllowanceInfo Origin="CHA" Destination="ATL" Carrier="DL">
                        <air:TextInfo>
                           <air:Text>PERSONAL ITEM</air:Text>
                        </air:TextInfo>
                        <air:CarryOnDetails ApplicableCarryOnBags="1" BasePrice="USD0.00" ApproximateBasePrice="USD0.00" TotalPrice="USD0.00" ApproximateTotalPrice="USD0.00"/>
                     </air:CarryOnAllowanceInfo>
                     <air:CarryOnAllowanceInfo Origin="ATL" Destination="PAR" Carrier="DL">
                        <air:TextInfo>
                           <air:Text>PERSONAL ITEM</air:Text>
                        </air:TextInfo>
                        <air:CarryOnDetails ApplicableCarryOnBags="1" BasePrice="USD0.00" ApproximateBasePrice="USD0.00" TotalPrice="USD0.00" ApproximateTotalPrice="USD0.00"/>
                     </air:CarryOnAllowanceInfo>
                     <air:EmbargoInfo Origin="PAR" Destination="CLT" Carrier="US">
                        <air:URLInfo>                           <air:URL>MYTRIPANDMORE.COM/BAGGAGEDETAILSUS.BAGG</air:URL>
                        </air:URLInfo>
                        <air:TextInfo>
                           <air:Text>888</air:Text>
                        </air:TextInfo>
                     </air:EmbargoInfo>
                     <air:EmbargoInfo Origin="CHA" Destination="ATL" Carrier="DL">
                        <air:URLInfo>                           <air:URL>MYTRIPANDMORE.COM/BAGGAGEDETAILSDL.BAGG</air:URL>
                        </air:URLInfo>
                        <air:TextInfo>
                           <air:Text>888</air:Text>
                        </air:TextInfo>
                     </air:EmbargoInfo>
                     <air:EmbargoInfo Origin="ATL" Destination="PAR" Carrier="DL">
                        <air:URLInfo>                           <air:URL>MYTRIPANDMORE.COM/BAGGAGEDETAILSDL.BAGG</air:URL>
                        </air:URLInfo>
                        <air:TextInfo>
                           <air:Text>888</air:Text>
                        </air:TextInfo>
                     </air:EmbargoInfo>
                  </air:BaggageAllowances>
               </air:AirPricingInfo>
               <air:FareNote Key="27WpEwySQV2YnSiNgy4ZlA==">RATE USED IN EQU TOTAL IS BSR 1EUR - 1.383891USD</air:FareNote>
               <air:FareNote Key="XPt+IPKaQCmxfCPjJpQZPQ==">LAST DATE TO PURCHASE TICKET: 19JUN14</air:FareNote>
               <air:FareNote Key="a83eh8xmSOO544WQZhd3Bg==">E-TKT REQUIRED</air:FareNote>
               <air:FareNote Key="hSh3ZbHHTbaOkh8cXiZCvg==">TICKETING FEES MAY APPLY</air:FareNote>
               <air:FareNote Key="Sbfy24ZNSk2d5Cqsq0FY9A==">TICKETING AGENCY 5TY2</air:FareNote>
               <air:FareNote Key="xvh3XRsCQaOrMmbcvZG/6w==">DEFAULT PLATING CARRIER AF</air:FareNote>
            </air:AirPricingSolution>
         </air:AirPriceResult>
      </air:AirPriceRsp>
   </SOAP:Body>
</SOAP:Envelope>


{% endhighlight %}
### Woot! 

We have now completed the basic workflow that must be done to find a way to travel between two points via Air! You should be able to run Lesson 2 the same way you ran Lesson 1 and have Travelport price a few dozen or so possible itineraries for you. As we will see in Lesson 3, there are other ways to do this work… and other ways to travel besides air!  

![Warning](images/warning.png) A slight word of warning is in order: It is not recommended practice to price all possible combinations of possible itineraries via an AirPriceReq to the uAPI. We have done so in this lesson because for clarity of exlpanation. One either should apply some filtering logic to reduce the possible set of itineraries, or use the shopping capabilities explained in the next lesson to have the uAPI propose “reasonable and available” itineraries.

### Exercises for the reader

* Try changing the origin and destination airports to ones that you know well. Look at the displayed itineraries and prices and compare to an online travel website.

* Try using the displayItineraryPrice to compare the prices of two one-way journeys from the origin to the destination and the round trip price. To do this you will need to construct “one way” itineraries (AirItinerary) and submit them to the pricing engine.

* Try to improve the output of the program to be more descriptive and human-friendly. This primarily means changing the loops in displayItineraryPrice and main() that walk the AirPriceResult and AirItinerary lists respectively.

* Using a debugger, try stopping Lesson2 around line 27. Walk down the hierarchy of objects inside the rsp and explore what more information about the flights could be displayed for the user. Similarly, stop the program around line 227 and do the same for the priceRsp to see what extra information could be displayed about the price.

----------------------

[< Return to Unit 1, Lesson 1](lesson_1-1.html) |
[Proceed to Unit 1, Lesson 3 >](lesson_1-3.html)

[Table of Contents](index.html)

{% include JB/comments %}

{% include JB/analytics %}


