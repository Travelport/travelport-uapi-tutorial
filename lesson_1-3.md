---
layout: page
title: "Advanced Travel Shopping"
description: "Understanding shopping and using LowFareSearch requests."
---
{% include JB/setup %}

## Unit 1, Lesson 3

### Objective of Lesson 3

After this lesson is completed, you will understand how to use the shopping facility of Travelport’s Universal API to find the lowest cost transport between two cities, including using rail and low cost airlines as a means of travel.

You will also understand how to get data from the low cost shopping APIs asynchronously.


### LowFareSearch vs. Availability/Pricing

In the [previous lesson](lesson_1-2.html) we explained that a typical travel industry workflow searches for availability of flights - the possible itineraries from origin to destination - and then price one or more itineraries that are interesting to the traveler.

Our code for Lesson 2 wasn’t particularly efficient about choosing which flights to price: it tried them all.
			It is not recommended to price all the available itinaries returned. This was done in Lesson 2 for clarity of explanation.

There are many metrics that a program could use to evaluate itineraries prior to calling the air price port, and improve efficiency. For example, one could choose the shortest amount of time spent traveling, the fewest number of stops, or the lowest priced option.

The Low Fare Search port, yet another port on the AirService object, allows you to combine these two steps (Availability, Pricing) by doing a search and having the search results come back already priced. Further, the Low Fare Search can do the work of narrowing down the set of returned itineraries to those that are the least expensive, since searching for the lowest price is a common case.


![Warning](images/warning.png) Note that the Low Fare Search algorithm does not guarantee that the price shown is still available. It is advised that you follow-up a few good reesults returned from the Low Fare Search with an additional AirPricingRequest to ensure that the itinerary’s price is still up to date. 

### Air, Rail, and Low Cost Carriers

Travelport uAPI supports three different types of providers.

1. The first is the one we have been using previously, the GDS provider(s) of Travelport, Galileo (1G), Apollo (1V), and Worldspan (1P). These provide you with capabilities that one would expect in online shopping and booking of air travel. Lesson 2 was designed to work solely with this type of provider.

2. Travelport Universal API also includes the ability to search for train travel with several different companies, called *suppliers* in Universal API terminology. The functionality for rail-based travel is accessed in the same general way as demonstrated with air travel, but starting with the RailService that is defined in Rail.wsdl (in the directory wsdl/rail_v26_0 in the supplied files with this tutorial). 

3. The third type of provider that can be accessed through Travelport Universal API is the traditionally-named *Low-Cost Carrier* provider. In fact, a Low-Cost Carrier in this terminology is a carrier that does not participate in Global Distribution System (GDS) agreements for their inventory of seats. So, GDSes (like Galileo, Apollo, and Worldspan) typically do not distribute the fares or availability of seats of these airlines to their networks. Often these airlines sell exclusively via the internet on their own websites. We mention this type of provider here for completeness. This tutorial focuses primarily on the GDS and rail providers.

### Goal of Lesson 3

The goal of this lesson is to produce output to compare prices across different means of transport between two locations.


### Low Fare searching, the hard way

Since you have already finished [Lesson 1](lesson_1-1.html) and [Lesson 2](lesson_1-2.html), we'll omit a lot of the details that are present in the `Lesson3` class' source code.

To search using the AirLowFareSearchPortType, combine the start of Lesson 2, creating a search request, and the end of Lesson 2, displaying the resulting pricing solutions. The intermediate manipulation of various data structures that was a bit complex in the case of Lesson 2 is now avoided. (It is best to use the air price port to check that results returned from low cost searching are still valid, but we’ll ignore this for now.) Low fare searching is more difficult using the AirLowFareSearchAsyncPortType.

Because some of the results from providers can take some time to be returned, Travelport Universal API offers the ability to send a search request and then retrieve the results at your convenience. The flow of such an application looks like this:

1. Send LowCostSearchAsyncReq via the low cost search async port’s service() method
2. Consume LowCostSearchAsyncRsp response object to determine what providers have what data
3. Loop over all the providers that have results
	
	- Send a RetrieveLowFareSearchReq to retrieve results from the above search, from a specific provider
	- Consume the RetrieveLowFareSearchRsp object to get results

As we have seen in Lesson 1 and Lesson 2, a particular request/response pair should be handled synchronously with Travelport Universal API. However, because of the structure above, it is possible to proceed with other actions in between requesting, say, the air results and the rail results of a particular search.

### Java Typing, Universal API, and Low Fare Search Responses

There are two basic Java types that are used in the asynchronous approach to handling responses: LowFareSearchAsyncRsp and RetrieveLowFareSearchRsp. These are the appropriate types returned by the asynchronous search and get-me-more-data ports, respectively.

The designers of Travelport Universal API planned ahead for this and made these two types share a common base type (a Java superclass), AirSearchRsp. This means that your code can be written to consume results from the AirSearchRsp class and then it can handle either immediate or later-retrieved results.

Similarly, the result of the availability requests in [Lesson 2](lesson_1-2.html) can also be treated as an AirSearchRsp object, as the class AvailabilitySearchReq also inherits from this base class. Looking further up the heirarchy, for example, reveals that all search requests also share a common base class (AirSearchReq and its parent BaseSearchReq). All requests, without regard to their type, share the base class BaseReq (with the notable exception of ping). In BaseReq you find those fields that are common to any request, such as *TraceId*.

#### XML -> Java Types

The Java types are just a convenience for creating XML objects that are actually transmitted or received over the network to or from Travelport. One can actually take this commonality one step farther and discover that different responses have similar parts. For example, both LowFareSearchRsp and LowFareSearchAsynchRsp share elements in the XML representation (and thus the Java type system) with the results contained in of AvailabilitySeachRsp and AirPriceRsp. In many different areas of both requests and response one may either need to create or understand a list of TypeBaseAirSegment objects, for example, because the WSDL (via XSD files, via a generator, via XML, and finally via your programming language) is defined to have a list of TypeBaseAirSegment objects in the same way.

#### Go To Definition

With this in mind, these types of relationships are present in many places in Travelport Universal API, and it is often very useful to use Eclipse’s *Go To Definition* feature (typically bound to the F3 key) to investigate the parent classes in the class hierarchy generated by Universal API’s WSDL.

### A small amount of nomenclature

One has to be a bit flexible with the naming and use of some of the methods that are part of the AirSearchRsp response object.

It may seem strange, at first, that an Air search response contains rail journeys. This historical bit of nomenclature is needed to account for the ability to put different providers as your preferred (or not preferred) provider in an AirSearchReq. If you include the rail provider as a preferred provider for a journey from Berlin to Montpellier, the low fare air search can, return a result that includes Deutsche Bahn trains.


### PrintableItinerary

The class [PrintableItinerary](https://github.com/travelport/Travelport-uapi-tutorial/blob/master/src/com/Travelport/uapi/unit1/PrintableItinerary.java) is included with the code for this unit. It is intended to be used as part of this lesson.

Instances of this class can be constructed in one of two ways:

{% highlight java %}
public PrintableItinerary(AirPricingSolution solution, Helper.AirSegmentMap seg,
	 String roundTripTurnaround)

public PrintableItinerary(RailPricingSolution solution, Helper.RailJourneyMap jour,		   
	 Helper.RailSegmentMap seg)


{% endhighlight %}

These two constructors are the air and rail versions of this class. Once constructed, it is possible to simply call *toString()* on the PrintableItinerary object and print out something understandable.

A couple of things to note about PrintableItinerary constructors:

* The air version of the constructor requires the caller to supply the roundTripTurnaround as an airport code. This is because air pricing solutions do not have the direction notion that is present in RailJourney and thus the code in PrintableItinerary must determine which parts of a trip (AirSegments) are out-bound and which are in-bound.

* Both of these constructors need the maps that were discussed in Lesson 2 to have already been built, so these are needed in Lesson 3 as well. This is because the PrintableItinerary prints out many details that are present only in the full definition of classes like AirSegment and not in the AirSegmentRef solution.

PrintableItinerary produces simple but functional output. The example output at the beginning of this lesson is from PrintableItinerary. You can change the code to improve the quality of the output if you want to, but be careful to protect your code from unexpected null values: often the results of a rail or air journey have null values in many places and you don’t want your code to crash with a NullPointerException (NPE).

### The main() event

The code for main in Lesson3 is reproduced, edited for size and clarity, below:

{% highlight java %}

public static void main(String[] argv) {

// pick a pair of cities that might be better to go via rail and have
// low cost carrier options
String origin = "GLA", destination = "LGW";
LowFareSearchAsynchReq req = new LowFareSearchAsynchReq();
// this creates the request parameters... and doesn't care if the
// request is synchronous or asynch
createLowFareSearchWithRail(req, origin, destination, 7, 9);

try {
System.out.println("waiting for first response from a provider...");
WSDLService.airShopAsync.showXML(true);
LowFareSearchAsynchRsp lowCostRsp = 
WSDLService.airShopAsync.get().service(req);
HashMap<String, Boolean> partMap = new HashMap<String, Boolean>();
List<BaseAsyncProviderSpecificResponse> specificResponses = lowCostRsp
				.getAsyncProviderSpecificResponse();

// print out what we got from initial response... this is to print
// the summary for all providers and set up the partMap for use in
// our loop below
for (Iterator<BaseAsyncProviderSpecificResponse> specIter = specificResponses.iterator(); specIter.hasNext();) {
	BaseAsyncProviderSpecificResponse asynchRsp = (BaseAsyncProviderSpecificResponse) specIter.next();
	if(asynchRsp.isMoreResults()){
		partMap.put(asynchRsp.getProviderCode(), asynchRsp.isMoreResults());
		System.out.println("Provider " + asynchRsp.getProviderCode());
		System.out.println("More results waiting " + asynchRsp.isMoreResults());
	}
}

// prepare for the loop... we print first and ask for the response
// second we have to setup the values before entering the first time
String searchId = lowCostRsp.getSearchId();
String currentProvider = null;
if(lowCostRsp.getResponseMessage().size() > 0){
	checkForErrorMessage(lowCostRsp);
currentProvider =       lowCostRsp.getResponseMessage().get(0).getProviderCode();
}
AirSearchRsp rsp = lowCostRsp; // so we can print it out
while (partMap.isEmpty() == false) {
    if(currentProvider != null && partMap.get(currentProvider) != null){
	System.out.println("++++++++++++++++++++\n"
		+ "Response is from provider " + currentProvider + ":"
		+ partMap.get(currentProvider));
	}

	printSomeExampleResults(destination, rsp, 7);
				
	boolean moreResults = false;
	if(currentProvider != null && partMap.get(currentProvider) != null){
		moreResults = partMap.get(currentProvider);
	}
	else{
Iterator<Entry<String, Boolean>> pm =      partMap.entrySet().iterator();
		if(pm.hasNext()){
			currentProvider = pm.next().getKey();
			moreResults = partMap.get(currentProvider);
							
		}
	}
		
if (moreResults) {
		if (partMap.isEmpty()) {
				continue; // just get out of the loop
		}
		// change to next provider from the partMap
		//currentProvider = partMap.keySet().iterator().next();			}
		// start the retreival of either the next part or the 1st part
		// from the next provider
		// just to show we can do something else while we wait
	try {
 		System.out.println("Sleeping 5 secs before trying to "
				+ "request more results from "
				+ currentProvider);
		Thread.sleep(5 * 1000);
	} catch (InterruptedException ignored) {
		/* wont happen */
	}
	// sleep is finished, run the request for more data...
	RetrieveLowFareSearchReq retrieve = new RetrieveLowFareSearchReq();
	retrieve.setSearchId(searchId);
	retrieve.setProviderCode(currentProvider);				
	AirReq.addPointOfSale(retrieve, MYAPP);
	WSDLService.airRetrieve.get();				
	rsp = WSDLService.airRetrieve.get().service(retrieve);
	checkForErrorMessage(rsp);
	// finished with that one
	partMap.remove(currentProvider);
	// more providers?
	}
} catch (AirFaultMessage e) {
System.err.println("Fault trying send request to travelport:"
			+ e.getMessage());
}

}

{% endhighlight %}


The key portion of this `main()` function is the loop that goes through the set of providers and each of their parts.

### Output

When you run `Lesson3` you will see some itineraries such as the ones presented at the top of this lesson.

With those edited for clarity, the output of the program looks like this:

{% highlight console %}

waiting for first response from a provider...
Provider ACH
More results waiting true
Provider RCH
More results waiting true
Total number solutions: 16 air and 0 rail
Example AIR Solution 1 of 16
Base Price: GBP18.00   Total Price USD165.10
-------------------
Example AIR Solution 2 of 16
Base Price: GBP18.00   Total Price USD165.10
-------------------
Example AIR Solution 3 of 16
Base Price: GBP18.00   Total Price USD165.10
-------------------
Example AIR Solution 4 of 16
Base Price: GBP18.00   Total Price USD165.10
-------------------
Example AIR Solution 5 of 16
Base Price: GBP23.00   Total Price USD173.10
-------------------
Example AIR Solution 6 of 16
Base Price: GBP23.00   Total Price USD173.10
-------------------
Example AIR Solution 7 of 16
Base Price: GBP23.00   Total Price USD173.10
-------------------
Sleeping 5 secs before trying to request more results from ACH
Response Message From Provider ACH : Warning : ACH carriers do not support AirLegModifiers. -- Error Code = 14
Total number solutions: 144 air and 0 rail
Example AIR Solution 1 of 144
Base Price: GBP73.58   Total Price GBP69.58
-------------------
Example AIR Solution 2 of 144
Base Price: GBP76.58   Total Price GBP72.58
-------------------
Example AIR Solution 3 of 144
Base Price: GBP80.58   Total Price GBP76.58
-------------------
Example AIR Solution 4 of 144
Base Price: GBP84.58   Total Price GBP80.58
-------------------
Example AIR Solution 5 of 144
Base Price: GBP89.58   Total Price GBP85.58
-------------------
Example AIR Solution 6 of 144
Base Price: GBP89.58   Total Price GBP85.58
-------------------
Example AIR Solution 7 of 144
Base Price: GBP92.58   Total Price GBP88.58
-------------------
Sleeping 5 secs before trying to request more results from RCH
Response Message From Provider null : Warning : No Asynch LFS response data found for the Search Id and Provider Code specified in the request. -- Error Code = 0


{% endhighlight %}


This is more realistic than the idealized output shown at the beginning of this lesson that included just the itineraries.

![Warning](images/warning.png)  Note: depending on your test credentials, the rail, vehicle, and low-cost carrier providers may not be available.  If you see an error message such as *No provider configured* or similar, it is because you are using test credentials and you need to upgrade to production credentials to access the provider.

Of interest:

* The `RCH` provider is the rail provider and two of its suppliers (Benelux and Deutsche Bahn) have no train service in the United Kingdom, so we get the warnings from *RCH\[BN\]* and *RCH\[DB\]* when doing a Glasgow to London search.

* There is also a warning that there is no LFS data found for the provider, coming from the RetrieveLowFareSearchRsp.

### End of Unit 1

Congratulations!

You've completed all three lessons in this unit.  With these three lessons completed, you should be feeling fairly confident of using nearly any feature of Travelport Universal API that involves searching for and displaying content.

In the upcoming unit, the focus is on some other types of common workflows such creating a booking for air travel or searching hotels by their distance from a landmark.

Enjoy using Travelport Universal API!


### Exercises for the reader

* Using the Low Fare search (synchronous or asynchronous), build the necessary tables to keep track of the lowest priced way to travel from origin to destination and print out the five lowest-priced itineraries, whether by rail or air.

* Above we discussed Java's type system, `AirSearchRsp` objects and the fact that these may include rail journey information.  By studying the WSDL and XSD files, determine if the same *crossover* applies to searching for availability in train travel.

* Use the `FlightDetails` class to display to the user if any meals are expected on air journeys, as well as the particular type of aircraft that will be used.  It may be helpful to build a table to make the set of aircraft easier to understand for those not familiar with the model numbers of aircraft, such as changing *737* into *Boeing 737* or even *Boeing Single-Aisle Jet*.

----------------------

[< Return to Unit 1, Lesson 2](lesson_1-2.html) |
[Proceed to Unit 2, Lesson 4 >](lesson_2-4.html)

[Table of Contents](index.html)

{% include JB/comments %}
{% include JB/analytics %}
