---
layout: page
title: "Hotel search, searching by landmark"
description: "Understanding hotel searches and how to search based on a point of interest rather than a city or airport."
---
{% include JB/setup %}

## Unit 2, Lesson 4

### Objective of Unit 2

After you have worked your way through this unit, you'll be able to do searching for multiple types of travel-related items (hotels and cars) in addition to the transportation we covered in the last unit.

In addition, we are going to focus on creating bookings for hotels, air travel, etc. so you can complete the entire purchase cycle.  We'll finish by putting it all together with a "Universal Record" --- a part of the Universal API&trade; that pulls together all the information about trips and travelers.

### The goal of Lesson 4

After deciding when, where, and how to travel (the subjects of [Unit 1](lesson1) of our tutorial), the next step is usually to try to find an accommodation at the destination.

Hotels are the most common target in searching for accommodation.  When this lesson is completed you'll have a program that can output information like this:

{% highlight console %}

EXTENDED STAY AMERICA-BLOOMINGTON [EA:92802]
           BLOOMINTON MN
           USD59.84   to USD107.99  
           5KM from Mall of America
           AAA says 2 NTM says 2 
           RESERVATION REQUIREMENT IS OTHER
       http://maps.google.com/?q=44.858501,-93.288498
BW PLUS BLOOMINGTON HOTEL      [BW:03174]
           BLOOMINGTON MN
           USD139.99  to USD249.99  
           0KM from Mall of America
           AAA says 3 NTM says 3 
           RESERVATION REQUIREMENT IS OTHER   
	   http://maps.google.com/?q=44.851898,-93.245300

{% endhighlight %}

### WSDL for hotel search

You probably should have done so already, but you’ll need to go through the process of generating the client-side code for the Hotel Service if you haven’t done that yet. Building the Air and Vehicle support is also recommended to avoid linker problems. The `HotelService` has a number of ports, as did the `AirService` we covered before.

Once you have the client code from `Hotel.wsdl` (in the directory `wsdl/hotel_v26_0` in the provided code), you may want to examine the `HotelAvailabiltySearchReq` and `BaseHotelSearchRsp(Base Type of HotelAvailabiltySearchRsp)` as these are the request/response pair of primary importance to the task ahead.

When we work with the hotel availability search request, as with any request, there is the requirement for the `BillingPointOfSaleInfo` to be set to inform the uAPI what application is using the api; we have provided the method `Helper.tutorialBPOSInfo()` to create this object for you.   Similarly, one must always set the target branch and we do so based on the system property `travelport.targetBranch` (or the environment variable `TPTARGETBRANCH`).  

![Warning](images/warning.png) For any API request other than "ping", the billing point of sale and the target branch parameters are needed.  These are required so that the uAPI can do the proper accounting of what services are being accessed and by whom.

In terms of the actual search parameters, the primary ones are

* A `HotelStay` object representing check-in and check-out dates
* A `HotelSearchModifiers` object which can have many parameters but the number of adults and number of room requested are of primary importance.
* Either an option to the hotel modifiers to specify a point of interest or a city/airport code that tells the hotel search where the accommodation is desired.

For each of the above, we've provided a helper function in lesson 4's code to make it easy to create these objects.

The return value, `BaseHotelSearchRsp`  is substantially simpler than the return value for air travel searches, but in a similar form.  The critical elements of the returned object are the returned collection of `HotelSearchResult` objects and the children of these objects, the `HotelProperty` and `RateInfo` object object. The `RateInfo` provides information about the pricing of the hotel and the `HotelProperty` object provides some details about the specific property such as the address and amenities etc.


#### XML For A Hotel Search

If you using another programming language, or just curious, you may want to see the what the request and response pair of messages are for a hotel search and response

*Hotel Search Request*

{% highlight xml %}

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
      <hot:HotelSearchAvailabilityReq TargetBranch="TRGT_BRCH" xmlns:hot="http://www.travelport.com/schema/hotel_v26_0">
         <com:BillingPointOfSaleInfo OriginApplication="UAPI" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <hot:HotelLocation Location="MSP"/>
         <hot:HotelSearchModifiers NumberOfAdults="2" NumberOfRooms="2">
            <com:PermittedProviders xmlns:com="http://www.travelport.com/schema/common_v26_0">
              <com:Provider Code="1G"/>
            </com:PermittedProviders>
            <com:Distance Units="KM" Value="25" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            <com:ReferencePoint xmlns:com="http://www.travelport.com/schema/common_v26_0">Mall of America</com:ReferencePoint>
         </hot:HotelSearchModifiers>
         <hot:HotelStay>
            <hot:CheckinDate>2014-06-19</hot:CheckinDate>
            <hot:CheckoutDate>2014-06-28</hot:CheckoutDate>
         </hot:HotelStay>
      </hot:HotelSearchAvailabilityReq>
   </soapenv:Body>
</soapenv:Envelope> 

{% endhighlight %}

*Subset of Search Response To Above, With Amenities List Shortened*

{% highlight xml %}

<SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP:Body>
      <hotel:HotelSearchAvailabilityRsp TransactionId="D7FCCB3B0A07761F65354077AFE8D8C4" ResponseTime="7172" xmlns:hotel="http://www.travelport.com/schema/hotel_v26_0" xmlns:common_v26_0="http://www.travelport.com/schema/common_v26_0">
         <common_v26_0:NextResultReference ProviderCode="1G">2OUR+4LUgs/Y5RH7gtSCz5dqVnro2EWMWFuGa1O3qZznXXAmkuC73JtLiE/HH5vpg/HcXdIteLwCKuu98ybn17Lm4mgxMfRJOQbGN2K2pSA=</common_v26_0:NextResultReference>
         <hotel:HotelSearchResult>
            <common_v26_0:VendorLocation ProviderCode="1G" VendorCode="CP" VendorLocationID="03121" Key="7rmNk2LVT6CV2H0ctX/bXQ=="/>
            <hotel:HotelProperty HotelChain="CP" HotelCode="03121" HotelLocation="MSP" Name="CROWNE PLAZA MSP AIRPORT MALL" VendorLocationKey="7rmNk2LVT6CV2H0ctX/bXQ==" HotelTransportation="Walk" ReserveRequirement="Guarantee" ParticipationLevel="Lowest Public Rate" Availability="Available" FeaturedProperty="true" NetTransCommissionInd="A">
               <hotel:PropertyAddress>
                  <hotel:Address>BLOOMINGTON MN</hotel:Address>
               </hotel:PropertyAddress>
               <common_v26_0:CoordinateLocation latitude="44.8583" longitude="-93.2224"/>
              <common_v26_0:Distance Units="KM" Value="2" Direction="NE"/>
               <hotel:HotelRating RatingProvider="AAA">
                  <hotel:Rating>3</hotel:Rating>
               </hotel:HotelRating>
               <hotel:HotelRating RatingProvider="NTM">
                  <hotel:Rating>3</hotel:Rating>
               </hotel:HotelRating>
               <hotel:Amenities>
                  <hotel:Amenity Code="AICO"/>
                  <hotel:Amenity Code="CHCA"/>
                  <hotel:Amenity Code="BRFT"/>
                  <hotel:Amenity Code="CARE"/>
                  <hotel:Amenity Code="COSH"/>
                  <hotel:Amenity Code="CODE"/>
                  <hotel:Amenity Code="ELEV"/>
                  <hotel:Amenity Code="FRTR"/>
                  <hotel:Amenity Code="GARO"/>
                  <hotel:Amenity Code="GISH"/>
                  <hotel:Amenity Code="HAFA"/>
                  <hotel:Amenity Code="LAVA"/>
                  <hotel:Amenity Code="MEPL"/>
                  <hotel:Amenity Code="MEFA"/>
                  <hotel:Amenity Code="MIBA"/>
                  <hotel:Amenity Code="MOIR"/>
                  <hotel:Amenity Code="NSMR"/>
                  <hotel:Amenity Code="PARK"/>
                  <hotel:Amenity Code="FPRK"/>
                  <hotel:Amenity Code="SPAL"/>
                  <hotel:Amenity Code="PHSV"/>
                  <hotel:Amenity Code="INPL"/>
                  <hotel:Amenity Code="OUPL"/>
                  <hotel:Amenity Code="ROSE"/>
                  <hotel:Amenity Code="WTKI"/>
                  <hotel:Amenity Code="SPAA"/>
                  <hotel:Amenity Code="A220"/>
                  <hotel:Amenity Code="D220"/>
                  <hotel:Amenity Code="JGTK"/>
               </hotel:Amenities>
            </hotel:HotelProperty>
            <hotel:RateInfo MinimumAmount="USD141.99" MinAmountRateChanged="false" MaximumAmount="USD224.99" MaxAmountRateChanged="false"/>
         </hotel:HotelSearchResult>

{% endhighlight %}

The amenities list, omitted above, is a sequence of four-letter codes that indicate features of the hotel.  For example
{% highlight xml %}
    <hotel:Amenity Code="AICO"/>
{% endhighlight %}
is air-conditioning.  

### Getting "more" results

In the interest of simplicity, we did not discuss in the previous lesson exactly how many search results were expected to be returned, and, perhaps most importantly, how to request more results if the provider of search results can deliver them.

The Universal API&trade; will signal in its responses if more results are available for any kind of search.  At the Java level, you use the method `getNextResultReference` to get access to a "token" that you can use later to tell Travelport what data you have already been returned.  You can see the token in the `common_v26_0:NextResultReference` tag at the top of the XML response.

![Warning](images/warning.png)  Historically, the GDSes provided data on "green-screen", character-based terminals. These systems had the notion of a screenful of information--the number of lines of text that the user could see before the top lines scrolled off-screen.  Some APIs to various GDSes have also used, or perhaps "kept", the notion of a "screenful" of information to represent a partial list of results.  In homage to this tradition, we will keep the nomenclature of "a screen" to indicate one _burst_ of information returned.

The typical construction in code for pulling multiple screens of information from a search request looks something like the following Java code.  We are using a hotel search here, but it applies to other searches.

{% highlight java %}

do {
     
     
     NextResultReference next = null;
     VendorLocMap NOT_USED = new VendorLocMap();

    
    // run the request, possibly from some middle point
    rsp = port.service(req);            
    // merge everyone into the map
    NOT_USED.mergeAll(rsp.getHotelSearchResult());

    
    List<HotelSearchResult> results = rsp.getHotelSearchResult();
    for (Iterator<HotelSearchResult> iterator = results.iterator(); iterator.hasNext();) {
    HotelSearchResult r = (HotelSearchResult) iterator.next();
    List<HotelProperty> hp = r.getHotelProperty();
    Iterator<HotelProperty> hl = hp.iterator();
    while(hl.hasNext()){                	               	
       HotelProperty p = hl.next();
	if ((p.getAvailability() == null) || (!p.getAvailability().equals(TypeHotelAvailability.AVAILABLE))) {
             continue;
       }
       //we don't want to have to use a credit card or cash to guarantee resv
	if (noDepositOrGuarantee) {
		if(p.getReserveRequirement() != null){		                                                                                                                                             
			if(!p.getReserveRequirement().equals(TypeReserveRequirement.OTHER)){
				continue;
	         	}
	        }
	}
	                
	// check for closest
	if(p.getDistance() != null){
	       int dist = p.getDistance().getValue().intValue();	                
	       if (dist < lowestDistance) {	  							
		       //setProviderCode(NOT_USED.get(p.getVendorLocationKey()).getProviderCode());
	      	       setClosestHotelCode(p.getHotelCode());
		       closest = r;
		       lowestDistance = dist;
		}
       }
		            
      // get the price, check for lowest...
      List<RateInfo> ri = r.getRateInfo();
      Iterator<RateInfo> rateInfo = ri.iterator();
      while(rateInfo.hasNext()){
                RateInfo info = rateInfo.next();
		double min = 0.0;
		if(info.getMinimumAmount() != null){
			min = Helper.parseNumberWithCurrency(info.getMinimumAmount());
		}
		else if(info.getApproximateMinimumStayAmount() != null){
			min = Helper.parseNumberWithCurrency(info.getApproximateMinimumStayAmount());
	      	}
		else if(info.getApproximateMinimumAmount() != null){
       			min = Helper.parseNumberWithCurrency(info.getApproximateMinimumAmount());
		}
		//some places offer a min price of ZERO which is clearly not
		//available so we use half max price just to make the output
		//halfway meaningful
		if (min==0.0) {
		   if(info.getMaximumAmount() != null){
			min = Helper.parseNumberWithCurrency(info.getMaximumAmount())/2;
		   }
		   else if(info.getApproximateAverageMinimumAmount() != null){
		      min =              Helper.parseNumberWithCurrency(info.getApproximateAverageMinimumAmount())/2;
                   }
		   else if(info.getApproximateMaximumAmount() != null){
		      min = Helper.parseNumberWithCurrency(info.getApproximateMaximumAmount())/2;
		   }
		}
		if (min < lowestPrice) {
	           //setProviderCode(NOT_USED.get(p.getVendorLocationKey()).getProviderCode());
	      	   setCheapestHotelCode(p.getHotelCode());
		   cheapest = r;
		   lowestPrice = min;
		   if(info.getRateSupplier() != null){
		      	setRateSupplier(info.getRateSupplier());
		   }
		}
	   }
	   
	   
	   

   
    // is there more?
    if(rsp.getHostToken() != null){
     	setHostTokenRef(rsp.getHostToken());
    }
            
    if (rsp.getNextResultReference().size() > 0) {
       // there is, so prepare for it
       next = rsp.getNextResultReference().get(0);
    }
    // keep track of number of times we've hit the server
    ++screens;
    if (next == null) {
       // no more data
       break;
    }
    // prepare for next round by setting the next value into this
    // request
    req.getNextResultReference().clear();
    req.getNextResultReference().add(next);
} while (screens != maxScreens); 

{% endhighlight %}

A few things are worth talking about from this snippet.

* The value returned by `getNextResultReference` is not meaningful other than as a marker to a follow-up request to indicate what part of the full result set has already been seen.

* Second, the _same_ request object is re-used for each pass around the loop.  The request parameters should be the same each time, with the full requests differing only by the next result reference.

* Finally, the loop here keeps track of how many screens have been read and it stops when `MAX_REQUESTS` has been reached.  This is both good policy and safe.  It is good policy because the total list of results may be _far_ larger than you might expect: search for any hotel in Paris, France, can yield a great many results! It is also safe because this protects you from launching a large, or even infinite, number of requests if you have a bug in your program.

#### The Resulting XML

The XML used to request "more information", aka "next screen", looks like this for a follow-up to the response shown in the previous XML listing:

{% highlight xml %}

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
      <hot:HotelSearchAvailabilityReq TargetBranch="TRGT_BRCH" xmlns:hot="http://www.travelport.com/schema/hotel_v26_0">
         <com:BillingPointOfSaleInfo OriginApplication="UAPI" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <com:NextResultReference ProviderCode="1G" xmlns:com="http://www.travelport.com/schema/common_v26_0">2OUR+4LUgs/Y5RH7gtSCz5dqVnro2EWMWFuGa1O3qZznXXAmkuC73JtLiE/HH5vpg/HcXdIteLwCKuu98ybn17Lm4mgxMfRJOQbGN2K2pSA=</com:NextResultReference>
         <hot:HotelLocation Location="MSP"/>
         <hot:HotelSearchModifiers NumberOfAdults="2" NumberOfRooms="2">
            <com:PermittedProviders xmlns:com="http://www.travelport.com/schema/common_v26_0">
               <com:Provider Code="1G"/>
            </com:PermittedProviders>
            <com:Distance Units="KM" Value="25" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
            <com:ReferencePoint xmlns:com="http://www.travelport.com/schema/common_v26_0">Mall of America</com:ReferencePoint>
         </hot:HotelSearchModifiers>
         <hot:HotelStay>
            <hot:CheckinDate>2014-06-19</hot:CheckinDate>
            <hot:CheckoutDate>2014-06-28</hot:CheckoutDate>
         </hot:HotelStay>
      </hot:HotelSearchAvailabilityReq>
   </soapenv:Body>
</soapenv:Envelope>

{% endhighlight %}

As was explained in the previous section concerning the Java code, the request parameters should be the same as the original request, with the only difference between the initial and follow-up requests being the `NextResultReference` tag.

### Searching by location

If you read the XML carefully above for the requests, you'll have realized that in this lesson, we are going to be searching for hotels that are located near some famous landmark.

To do this, one must provide, obviously, the name of the landmark but also *not* provide a "location" with a city code as we have done previously.  For example, let's assume we are looking for accomodation for a family vacation to Paris, France.  With two adults and two children, we are going to need two hotel rooms and we are planning to spend a couple of days at [Disneyland Paris](http://www.disneylandparis.com/).

For those unfamiliar with Paris' geography, Disneyland Paris _neé EuroDisney_, is 32km east of the center of Paris.  Thus, a hotel search that used the city code "PAR" or any of the Paris airports (north and south of the city) will be unlikely to produce good results.  We need to do our search for this landmark.

The key idea for doing a location of search is to use a search modifier with the location's name contained in it.  You do that with Java code like this example from `Lesson4`:

{% highlight java %}
HotelSearchModifiers mods = Lesson4.createModifiers(numAdults, numRooms);
//...
String pointOfInterest = "EuroDisney";
mods.setReferencePoint(pointOfInterest);
Lesson4.addDistanceModifier(mods, searchRadiusInKM); req.setHotelSearchModifiers(mods);
{% endhighlight %}

The first line creates a search modifier object, and the parameters represent the need for two rooms with two adults in the party.

Next, we add the attraction to the search modifiers and we do not add anything to the hotel location property of the request of object. We can also add a distance object, created by the helper function, that represents a distance of searchRadiusInKM which can be 5 or 25 or any long value. This is required to tell the geography searching engine of the uAPI how far away from the attraction to consider.

### Full validation of XML schemas

If you look at the Java code, you'll notice this when we set the distance from our attraction point:

{% highlight java %}
Distance distance = new Distance();
distance.setUnits("KM");
distance.setValue(BigInteger.valueOf(km));
{% endhighlight %}

This a good time for a warning about XML schema validation.  Although it appears that "any old string will do" for the units in the `setUnits` call above, actually only two are valid, "KM" and "MI" in uppercase letters. The XML schemas provided by Travelport for the uAPI correctly list the valid values, but the transformation to Java code has chosen to allow you to supply this value as a string.  

![Warning](images/warning.png)  It is good practice to turn on "full validation" when developing your application, no matter the programming language you are using.  This means that your system will not attempt to transmit XML sequences that are invalid, and thus likely to be rejected anyway by Travelport's system when it receives them.  There are a few places where Travelport's system is forgiving, but it is far better to correct your errors, such as using "km" as a unit instead of "KM", before-hand and not depend on anything working not provided in the WSDL and XSD files defining the API.  

Our supplied helper code for creating the instances of the uAPI's ports turns on the checking for you like this in `PortWrapper.java`

{% highlight java %}
provider.getRequestContext().put("schema-validation-enabled", "true"); 
{% endhighlight %}

If you have an application finished and ready for deployment to a production system, you can increase performance by turning off this checking.  If you have any doubts, however, about your code or you are trying to debug a problem it is best to leave this checking enabled.


### Key elements of Lesson 4

The main part of the code for this lesson, contained in [Lesson4.java](https://github.com/travelport/travelport-uapi-tutorial/blob/master/src/com/travelport/uapi/unit2/Lesson4.java) is a loop, as described above in the section about retrieving multiple screens of results. Prior to the loop entry, we set up a `HotelSearchAvailabilityRequest` with the key parameters based on destination attraction and the dates of travel.  

As we go around the loop of reading bunches of results, we keep track of the hotel that has the lowest minimum price and the hotel that is closest (in kilometers) to our attraction.  After reading several screens of data, we display the lowest priced and the closest option with some details from the response object, in particular the `HotelSearchResult` that represents these two "good" choices.  

As we have done in the [previous lessons](lesson_1-2.html) concerning decoding the results of air searches, we build a map that tracks the "key" to "value" mapping for items in the response.  In this lesson, the type of this object is the `Helper.VendorLocMap`. We construct this object as we read each screen of information. We were not able to find any cases where this map provided us needed information that was not present in either in the `HotelSearchResult` or `HotelProperty` objects that we were processing but this may vary based on your choice of provider.

### A small exercise for readers interested in vehicles

It may be that renting a car in the area near Disneyland Paris is a useful option for our family on this trip, so we want to add a car search to see how much it might cost and how that would effect the total price of the stay.  

For this small enhancement, we'll make sure we look for a mini-van with air-conditioning and an automatic transmission from the _airport_. We'll expect the family to keep the vehicle for the whole of their trip.

For this exercise, as before, you'll need to generate the client side code for the WSDL in `wsdl/vehicle_v26_0/vehicle.wsdl` if you have not done so already.  You can follow the same "recipe" we have used in all the lessons so far:

* create a request object
* get the port object representing the functionality
* call `service()`
* and finally decode the response object.

We won't detail too much about how to add this feature to the code for lesson 4 but only point on some potential "gotchas":

* You need to supply a date _and_ time for pickup and delivery.  These, unlike hotel search, are not using the XML objects but just raw strings in the format "2014-08-20T09:00:00".


You should be able to print out the results of the search with the type of `vehicleRate`,  name of the vendor (`VendorCode` field)  and the price (`RateForPeriod`) like this:

{% highlight console %}
STANDARD                       [ZL:EUR45.00] 
{% endhighlight %}


### Further exercises for the reader

* Similarly to the last exercise where we used a different service for a vehicle search, try to convert each price to Thai Bhat. To do this, you can use the `UtilCurrencyConversionPortType` in the `wsdl/Util_v26_0/Util.wsdl` definition.  Naturally, the classes to use are `CurrencyConversionReq` and `CurrencyConversionRsp` who contain `CurrencyConversion` objects.

* There is a large list of amenties that are provided for each hotel.  Decode this list and display them to the user.  Each amenity is represented by a [four letter code](http://support.travelport.com/webhelp/uapi/Content/Hotel/Shared_Hotel_Topics/Hotel%20Amenities.htm). You should create a table to print these out in a nice way for the user.  The "translation" of each of these amenities is farther down on that same page of documentation.

----------------------

[< Return to Unit 1, Lesson 3](lesson_1-3.html) |
[Proceed to Unit 2, Lesson 5 >](lesson_2-5.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}
{% include JB/analytics %}
