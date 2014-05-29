---
layout: page
title: "Advanced travel shopping"
description: "Understanding shopping and using LowFareSearch requests."
---
{% include JB/setup %}

## Unit 1, Lesson 3

### Objective of Lesson 3

After this lesson is completed, you should know how to use the "shopping" facility of Travelport's Universal API&trade; to find the lowest cost transport between two cities, including using rail and low cost airlines as a means of travel. 

You will also understand how to get data from the low cost shopping APIs _asynchronously_.

### LowFareSearch vs. Availability/Pricing

In the [previous lesson](lesson_1-2.html) we explained that a typical, perhaps even the archetypal, travel industry workflow was to search for availability of flights - the possible itineraries from origin to destination - and then price one or more itineraries that were interesting to the traveller.

Our code for `Lesson 2` wasn't particularly efficient about choosing what flights to price: it tried them all.  

    Again, we don't recommend pricing all the itinaries returned to you as available!  This was done is lesson 2 for clarity of explanation and far better options will be discussed in this and future lessons.

There are many metrics that a program could use to evaluate itineraries prior to calling the air price port, and improve efficiency. For example, one could choose the shortest amount of time spent travelling, fewest number of stops, or, of course, the lowest priced option.

The Low Fare Search port, yet another port on the `AirService` object, allows you to combine these two steps (Availability, Pricing) by doing a search and having the search results come back already priced. Further, the Low Fare Search can do the work of narrowing down the set of returned itineraries to those that are the least expensive, since searching for the lowest price is a common case.

![Warning](images/warning.png) Note that the Low Fare Search algorithm does not guarantee that the price shown is still available. It is advised that you follow-up a few "good looking" result returned from the Low Fare Search with an additional `AirPricingRequest` to ensure that the itinerary's price is still up to date.  

### Air, Rail, and Low Cost Carriers

The Travelport uAPI supports three different types of providers.

1. The first is the one we have been using previously, the "GDS" provider(s) of Travelport such as Galileo("1G"), Apollo("1V") and Worldspan("1P").  These provide you with capabilities that one would expect in online shopping and booking of air travel; Lesson 2 was designed to work solely with this type of provider.

2. The uAPI also includes the ability to search for train travel with several different companies, called "suppliers" in the uAPI terminology.  The functionality for rail-based travel is accessed in the same general way as we have already seen with air travel, but naturally starting with the `RailService` that is defined in `Rail.wsdl` (in the directory `wsdl/rail_v12_0` in the supplied files with this tutorial).  

3. The other type of provider that can be accessed through the uAPI is the traditionally-named "Low-Cost Carrier" provider. In fact, a "Low Cost Carrier" in this terminology is a carrier that does not participate in "global distribution system" agreements for their inventory of seats - and that is the 'g' and 'd' in the acronym G-D-S.  So, GDSes (like Galileo, Apollo, and Worldspan) typically do not distribute the fares or availability of seats of these airlines to their networks.  Often these airlines sell exclusively via the internet on their own websites.  We mention this type of provider here for completeness. We will focus primarily on the GDS and rail providers as there are numerous special areas to be addressed when working with the "Low Cost provider".

### The goal of Lesson 3

The goal of this lesson is to produce output to compare prices across different means of transport between two locations.  

This is a snippet from the [Lesson3](https://github.com/travelport/Travelport-uapi-tutorial/blob/master/src/com/Travelport/uapi/unit1/Lesson3.java) program, showing two different itineraries from Glasgow, Scotland, to London's Gatwick Airport:

{% highlight console %}

AIR Departing from GLA to LGW on TUE MAY 01 11:00:00 CEST 2012
         Flight [BA]#2957  Flight time: 85 minutes
                           Arrive TUE MAY 01 12:25:00 CEST 2012

AIR Departing from LGW to GLA on THU MAY 03 12:25:00 CEST 2012
         Flight [BA]#2960  Flight time: 80 minutes
                           Arrive THU MAY 03 13:45:00 CEST 2012
Base Price: GBP80.00   Total Price GBP160.10

RAIL (OUTWARD) From Paisley Gilmour Str. to Gatwick Airport on TUE MAY 01 07:04:00 CEST 2012
         SCOTRAIL[SR] Train #SR7989   --- From Paisley Gilmour Str. to Glasgow
         VIRGIN TRAINS[VT] Train #VT6560   --- From Glasgow to London Euston
         METRO --- From London Euston to London Victoria
         SOUTHERN[SN] Train #SN1992   --- From London Victoria to Gatwick Airport
                           Arrive TUE MAY 01 13:22:00 CEST 2012
RAIL (RETURN) From Gatwick Airport to Paisley Gilmour Str. on THU MAY 03 05:10:00 CEST 2012
         SOUTHERN[SN] Train #SN4071   --- From Gatwick Airport to Clapham Junction
         SOUTHERN[SN] Train #SN3000   --- From Clapham Junction to Watford Junction
         VIRGIN TRAINS[VT] Train #VT6000   --- From Watford Junction to Glasgow
         SCOTRAIL[SR] Train #SR5718   --- From Glasgow to Paisley Gilmour Str.
                           Arrive THU MAY 03 12:10:00 CEST 2012
Total Price GBP356.00

{% endhighlight %}

In addition, this data was retrieved asynchronously, allowing the application to do other things while waiting for the results to be returned.

In the case of this tutorial, the `Lesson3` application just "sleeps" but there is no reason it could not calculate the cube root of pi, the price of tea in China, the net worth of Sergei Brin, etc. while waiting.

### Low Fare searching, the hard way

Since you have already finished [Lesson 1](lesson_1-1.html) and [Lesson 2](lesson_1-2.html), we'll omit a lot of the details that are present in the `Lesson3` class' source code.

To search using the `AirLowFareSearchPortType` one simply combines the start of Lesson 2, creating a search request, and the end of Lesson 2, displaying the resulting pricing solutions.  The intermediate manipulation of various data structures that was a bit complex in the case of Lesson 2 is now avoided.  (Again, it is best to use the air price port to check that results returned from low cost searching are still valid, but we'll ignore this for now.)  This seems easy, so let's make low fare searching *more* difficult by _not_ using the `AirLowFareSearchPortType` and instead using its _asynchronous_ brother, the `AirLowFareSearchAsyncPortType`!  

Because some of the results from providers can take some time to be returned, the uAPI offers you the ability to send a search request and then retrieve the results at your convenience.  So, the flow of such an application looks like this:

1. Send `LowCostSearchAsyncReq` via the low cost search async port's `service()` method
2. Consume `LowCostSearchAsyncRsp` response object to determine what providers have what data
3. Looping over all the providers that have results
	
	- Send a `RetrieveLowFareSearchReq` to retrieve results from the above search, from a specific provider
	- Consume the `RetrieveLowFareSearchRsp` object to get results

As we have seen in *Lesson 1* and *Lesson 2*, a _particular_ request/response pair should be handled synchronously with the uAPI.  However, because of the structure above, it is possible to proceed with other actions in between requesting, say, the air results and the rail results of a particular search.

### Java Typing, uAPI, and Low Fare Search Responses

There are two basic Java types that are used in the asynchronous approach to handling responses:  `LowFareSearchAsyncRsp` and `RetrieveLowFareSearchRsp`.  These are the appropriate types returned by the "asynchronous search" and "get me more data" ports, respectively.

Thoughtfully, the designers of the uAPI planned ahead for this and made these two types share a common base type (a Java superclass), `AirSearchRsp`.  This means that your code can be written, of course with some care, to consume results from the `AirSearchRsp` class and then it can handle either immediate or later-retrieved results.  

Similarly, the result of the availability requests in [Lesson 2](lesson_1-2.html) can _also_ be treated as an `AirSearchRsp` object, as the class `AvailabilitySearchReq` also inherits from this base class. Looking further up the heirarchy, for example, reveals that all search requests also share a common base class (`AirSearchReq` and its parent `BaseSearchReq`).  All requests, without regard to their type, share the base class `BaseReq` (with the notable exception of ping).  In `BaseReq` you find those fields that are common to any request, such as "TraceId".

#### XML -> Java Types

Of course, really the Java "types" are just a convenience for creating XML objects that are actually transmitted or received over the network to or from Travelport.  One can actually take this "commonality" one step farther and discover that _different_ responses have parts that similar.  For example, both `LowFareSearchRsp` and `LowFareSearchAsynchRsp` share elements in the XML representation (and thus the Java type system) with the results contained in of `AvailabilitySeachRsp` and `AirPriceRsp`.  In many different areas of both requests and response one may either need to create or understand a list of `AirSegment` objects, for example, because the WSDL (via XSD files, via a generator, via XML, and finally via your programming language) is defined to have a list of AirSegment objects in the same way.

#### Go To Definition

With this in mind, the these types of relationships are present in many places in the uAPI, and it is often very useful to use Eclipse's "Go To Definition" feature (typically bound to the F3 key) to investigate the parent classes in the class hierarchy generated by the uAPI's WSDL.

### A small amount of nomenclature

One has to be a bit flexible with the naming and use of some of the methods that are part of the `AirSearchRsp` response object.

It may seem strange, at first, that an "Air" search response contains *rail* journeys! This historical bit of nomenclature is needed to account for the ability to put different providers as your preferred (or not preferred!) in an `AirSearchReq`. If you include the rail provider as a preferred provider for a journey from Berlin to Montpellier, the low fare air search can, and usually will, return a result that includes Deutsche Bahn trains!  

### PrintableItinerary

The class [PrintableItinerary](https://github.com/travelport/Travelport-uapi-tutorial/blob/master/src/com/Travelport/uapi/unit1/PrintableItinerary.java) is included with the code for this unit.  It is intended to be used as part of this lesson.

Instances of this class can be constructed in one of two ways:

{% highlight java %}
public PrintableItinerary(AirPricingSolution solution, Helper.AirSegmentMap seg,
		String roundTripTurnaround)

public PrintableItinerary(RailPricingSolution solution, Helper.RailJourneyMap jour,
				Helper.RailSegmentMap seg)

{% endhighlight %}

These two constructors are the air and rail versions of this class. Once constructed, it is possible to simply call "toString()" on the `PrintableItinerary` object and have something reasonably understandable to a human printed out. 

A couple of things to note about `PrintableItinerary` constructors:

* The air version of the constructor requires the caller to supply the `roundTripTurnaround` as an airport code.  This is because air pricing solutions do not have the `direction` notion that is present in `RailJourney` and thus the code in `PrintableItinerary` must determine which parts of a trip (`AirSegments`) are out-bound and which are in-bound.

* Both of these constructors need the "maps" that were discussed in lesson 2 to have already been built, so these will be needed in lesson 3 as well.  This is not surprising since the PrintableItinerary prints out many details that are present only in the full definition of classes like `AirSegment` and not in the `AirSegmentRef` solution.

`PrintableItinerary` produces simple but functional output.   The example output at the beginning of this lesson is from `PrintableItinerary`.  You can change the code to improve the quality of the output if you want to, but be careful to protect your code from unexpected `null` values: often the results of a rail or air journey have `null` values in many places and you don't want your code to crash with a `NullPointerException` (NPE).

### The main() event

The code for `main` in `Lesson3` is reproduced, edited for size and clarity, below:

{% highlight java %}

public static void main(String[] argv) {
	String origin = "GLA", destination = "LGW";
	LowFareSearchAsynchReq req = new LowFareSearchAsynchReq();
	//7 days out for departure and 9 days out for return
	createLowFareSearchWithRail(req, origin, destination, 7, 9);

	try {
		//the actual search request
		LowFareSearchAsynchRsp lowCostRsp = WSDLService.airShopAsync.get().service(req);

		[create a HashMap that knows about all the providers and how many 'parts' they have]

		//these three parameters are needed as we loop to get each result... they are the
		//context of our first search above
		String searchId = lowCostRsp.getSearchId();
		String currentProvider = lowCostRsp.getProviderCode();
		long currentPart = lowCostRsp.getPartNumber().longValue();
		
		AirSearchRsp rsp = lowCostRsp; // so we can print it out
		while (partMap.isEmpty() == false) {

			printSomeExampleResults(destination, rsp, 2); //2 sample results

			[update currentPart and currentProvider for next "retrieve request"]

			[sleep a few seconds]
			
			//run the request for more data...
			RetrieveLowFareSearchReq retrieve = new RetrieveLowFareSearchReq();
			//note that these are the "context" parameters that need to be given in
			//the retreive so we get back "more data" from our search
			retrieve.setSearchId(searchId);
			retrieve.setProviderCode(currentProvider);
			retrieve.setPartNumber(BigInteger.valueOf(currentPart));

			//request more data based on the currentPart and currentProvider
			rsp = WSDLService.airRetreive.get().service(retrieve);
			
			checkForErrorMessage(rsp);
		}
	} catch (AirFaultMessage e) {
		System.err.println("Fault trying send request to Travelport:"
				+ e.getMessage());
	}

}
{% endhighlight %}


None of the code above should be shocking if you have been following us through the previous two lessons.  The key portion of this `main()` function is the loop that goes through the set of providers and each of their parts.  A more clever program than the one we have written here would do some useful computation where we have just done "\[sleep a few seconds\]"!

### Output

When you run `Lesson3` you will see some itineraries such as the ones presented at the top of this lesson.

With those edited for clarity, the output of the program will look like this:

{% highlight console %}

waiting for first response from a provider...
Provider ACH has a total of 1 parts
Provider 1G has a total of 1 parts
Provider RCH has a total of 3 parts
++++++++++++++++++++
Response is from provider 1G: part 1 of 1
Total number solutions: 66 air and 0 rail
[Example AIR Solution 1 of 66]
[Example AIR Solution 2 of 66]
Sleeping 5 secs before trying to request part 1 from ACH
No data available from low cost provider?
++++++++++++++++++++
Response is from provider ACH: part 1 of 1
Total number solutions: 0 air and 0 rail
Sleeping 5 secs before trying to request part 1 from RCH
Response Message From Provider RCH[BN]  : Warning : BeNe only support international journeys. -- Error Code = 14
++++++++++++++++++++
Response is from provider RCH: part 1 of 3
Total number solutions: 0 air and 0 rail
Sleeping 5 secs before trying to request part 2 from RCH
Response Message From Provider RCH[TL]  : Warning : TL assumes adult for PassengerType if no Age or Date of Birth specified. -- Error Code = 14
++++++++++++++++++++
Response is from provider RCH: part 2 of 3
Total number solutions: 0 air and 30 rail
[Example RAIL solution 1 of 30]
[Example RAIL solution 2 of 30]
Sleeping 5 secs before trying to request part 3 from RCH
Response Message From Provider RCH[DB]  : Warning : No available rail suppliers for the requested origin location country -- Error Code = 14
++++++++++++++++++++
Response is from provider RCH: part 3 of 3
Total number solutions: 0 air and 0 rail

{% endhighlight %}


This is a bit more "real" than the idealized output shown at the beginning of this lesson, that included just the itineraries.

![Warning](images/warning.png)  A brief warning is needed here.  Depending on your test credentials, the rail, vehicle, and low-cost carrier providers may not be available.  If you see an error message such as 'No provider configured' or similar, that is because you are using test credentials and you need to upgrade to "real" credentials to access the provider.

A couple of things that the reader be interested in:

* The `RCH` provider is the rail provider and two of its suppliers (Benelux and Deutsche Bahn) have no train service in the United Kingdom, so we get the warnings from "RCH\[BN\]" and "RCH\[DB\]" when doing a Glasgow to London search.

* These two providers are also shown in the output as having 0 air and 0 rail results.

### End of Unit 1

Congratulations!

You've managed to get through all three of the lessons in this unit.  With these three lessons under your belt, you should be feeling fairly confident of using nearly any feature of the uAPI that involves searching for content and then displaying it to the user.

In the upcoming unit, we will focus on some other types of common workflows such creating a booking for air travel or searching hotels by their distance from a landmark.

Enjoy using the uAPI!


### Exercises for the reader

* Using the Low Fare search (synchronous or asynchronous), build the necessary tables to keep track of the lowest priced way to travel from origin to destination and print out the five lowest-priced itineraries, whether by rail or air.

* Above we discussed Java's type system, `AirSearchRsp` objects and the fact that these may include rail journey information.  By studying the WSDL and XSD files, determine if the same "crossover" applies to searching for availability in train travel.

* Use the `FlightDetails` class to display to the user if any meals are expected on air journeys, as well as the particular type of aircraft that will be used.  It may be helpful to build a table to make the set of aircraft easier to understand for those not familiar with the model numbers of aircraft, such as changing "737" into "Boeing 737" or even "Boeing Single-Aisle Jet".

----------------------

[< Return to Unit 1, Lesson 2](lesson_1-2.html) |
[Proceed to Unit 2, Lesson 4 >](lesson_2-4.html)

[Table of Contents](index.html)

{% include JB/comments %}
{% include JB/analytics %}
