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
BW HOTEL MONTGOMERY            [BW:25754]
           PONTORSON FR
           EUR95.00   to EUR179.00  
           10KM from Mont St Michel
           RESERVATION REQUIREMENT IS GUARANTEE
IBIS AVRANCHES MONT ST MICHEL  [RT:23750]
           SAINT QUENTIN SUR L
           EUR72.00   to EUR72.00   
           13KM from Mont St Michel
           RESERVATION REQUIREMENT IS OTHER
{% endhighlight %}

### WSDL for hotel search

You probably should have done so already, but you'll need to go through the process of generating the client-side code for the Hotel Service if you haven't done that yet.  Building the Air and Vehicle support is also recommended to avoid linker problems. The `HotelService` has a number of ports, as did the `AirService` we covered before.

Once you have the client code from `Hotel.wsdl` (in the directory `wsdl/hotel_v17_0` in the provided code), you may want to examine the `HotelAvailabiltySearchReq` and `HotelAvailabilitySearchRsp` as these are the request/response pair of primary importance to the task ahead.

When we work with the hotel availability search request, as with any request, there is the requirement for the `BillingPointOfSaleInfo` to be set to inform the uAPI what application is using the api; we have provided the method `Helper.tutorialBPOSInfo()` to create this object for you.   Similarly, one must always set the target branch and we do so based on the system property `travelport.targetBranch` (or the environment variable `TPTARGETBRANCH`).  

![Warning](images/warning.png) For any API request other than "ping", the billing point of sale and the target branch parameters are needed.  These are required so that the uAPI can do the proper accounting of what services are being accessed and by whom.

In terms of the actual search parameters, the primary ones are

* A `HotelStay` object representing check-in and check-out dates
* A `HotelSearchModifiers` object which can have many parameters but the number of adults and number of room requested are of primary importance.
* Either an option to the hotel modifiers to specify a point of interest or a city/airport code that tells the hotel search where the accommodation is desired.

For each of the above, we've provided a helper function in lesson 4's code to make it easy to create these objects.

The return value, `HotelAvailabilitySearchRsp` is substantially simpler than the return value for air travel searches, but in a similar form.  The critical elements of the returned object are the returned collection of `HotelSearchResult` objects and the children of these objects, the `HotelProperty` object.  The search result provides information about the pricing of the hotel and the latter object provides some details about the specific property such as the address and amenities.


#### XML For A Hotel Search

If you using another programming language, or just curious, you may want to see the what the request and response pair of messages are for a hotel search and response

*Hotel Search Request*

{% highlight xml %}
 <?xml version="1.0" encoding="UTF-8"?><soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:HotelSearchAvailabilityReq xmlns="http://www.travelport.com/schema/common_v15_0" xmlns:ns2="http://www.travelport.com/schema/hotel_v17_0" xmlns:ns3="http://www.travelport.com/schema/vehicle_v17_0" xmlns:ns4="http://www.travelport.com/schema/passive_v14_0" xmlns:ns5="http://www.travelport.com/schema/air_v18_0" xmlns:ns6="http://www.travelport.com/schema/rail_v12_0" xmlns:ns7="http://www.travelport.com/schema/universal_v16_0" TargetBranch="P105110">
      <BillingPointOfSaleInfo OriginApplication="UAPI"/>
      <ns2:HotelSearchModifiers NumberOfAdults="2" NumberOfRooms="2">
        <Distance Units="KM" Value="25"/>
        <ReferencePoint>Mall of America</ReferencePoint>
      </ns2:HotelSearchModifiers>
      <ns2:HotelStay>
        <ns2:CheckinDate>2012-08-13</ns2:CheckinDate>
        <ns2:CheckoutDate>2012-08-15</ns2:CheckoutDate>
      </ns2:HotelStay>
    </ns2:HotelSearchAvailabilityReq>
  </soap:Body>
</soap:Envelope>
{% endhighlight %}

*Subset of Search Response To Above, With Amenities List Shortened*

{% highlight xml %}
<?xml version="1.0" encoding="UTF-8"?><SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
  <SOAP:Body>
    <hotel:HotelSearchAvailabilityRsp xmlns:hotel="http://www.travelport.com/schema/hotel_v17_0" xmlns:common_v15_0="http://www.travelport.com/schema/common_v15_0" TransactionId="375924880A07611201EC28B7A0F1087D" ResponseTime="2004">
      <common_v15_0:NextResultReference ProviderCode="1V">k2UqRqGv/uGTZSpGoa/+4XFUHxaT56Vv+TQNVk6nh9vs5DAVQD2dUzEZbeAcrKSIAUUYScOi8pcQeLU1Xww207/30A1eaXfw</common_v15_0:NextResultReference>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="HI" VendorLocationID="31732" Key="1"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="HH" VendorLocationID="05192" Key="2"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="CP" VendorLocationID="03121" Key="3"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="CX" VendorLocationID="47694" Key="4"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="CI" VendorLocationID="27592" Key="5"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="WV" VendorLocationID="54357" Key="6"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="HX" VendorLocationID="03114" Key="7"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="MX" VendorLocationID="58227" Key="8"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="HY" VendorLocationID="84192" Key="9"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="AA" VendorLocationID="34361" Key="10"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="ES" VendorLocationID="67637" Key="11"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="MC" VendorLocationID="01108" Key="12"/>
      <common_v15_0:VendorLocation ProviderCode="1V" VendorCode="RC" VendorLocationID="92978" Key="13"/>
      <hotel:HotelSearchResult MinimumAmount="USD138.99" MinAmountRateChanged="false" MaximumAmount="USD204.00" MaxAmountRateChanged="false">
        <hotel:HotelProperty HotelChain="HI" HotelCode="31732" HotelLocation="MSP" Name="HOLIDAY INN EXP STES AIRPORT" VendorLocationKey="1" HotelTransportation="Public" ReserveRequirement="Other" ParticipationLevel="Enhanced Best Available Rate participant" Availability="Available" FeaturedProperty="true">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8598" longitude="-93.2515"/>
          <common_v15_0:Distance Units="KM" Value="2" Direction="NW"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
          ....
          </hotel:Amenities>
        </hotel:HotelProperty>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult MinimumAmount="USD199.00" MaximumAmount="USD304.00">
        <hotel:HotelProperty HotelChain="HH" HotelCode="05192" HotelLocation="MSP" Name="HILTON MINNEAPOLIS ARPT M-OF- A" VendorLocationKey="2" HotelTransportation="Walk" ReserveRequirement="Guarantee" ParticipationLevel="Best Available Rate and Inside Shopper participant" Availability="Available" FeaturedProperty="true">
          <hotel:PropertyAddress>
            <hotel:Address>3800 E 80TH STREET</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8607" longitude="-93.2186"/>
          <common_v15_0:Distance Units="KM" Value="3" Direction="NE"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
          ...
          </hotel:Amenities>
        </hotel:HotelProperty>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult>
        <hotel:HotelProperty HotelChain="CP" HotelCode="03121" HotelLocation="MSP" Name="CROWNE PLAZA MSP AIRPORT MALL" VendorLocationKey="3" HotelTransportation="Walk" ReserveRequirement="Guarantee" ParticipationLevel="Enhanced Best Available Rate participant" Availability="NotAvailable" FeaturedProperty="true">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8583" longitude="-93.2224"/>
          <common_v15_0:Distance Units="KM" Value="2" Direction="NE"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
		 ...
        </hotel:Amenities>
        </hotel:HotelProperty>
        <hotel:HotelSearchError Code="5000" Type="Warning">0601 NOT AVAILABLE FOR DATES REQUESTED</hotel:HotelSearchError>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult MinimumAmount="USD139.00" MinAmountRateChanged="false" MaximumAmount="USD139.00" MaxAmountRateChanged="false">
        <hotel:HotelProperty HotelChain="CX" HotelCode="47694" HotelLocation="MSP" Name="CNTRY INN-STES MALL OF AMERICA" VendorLocationKey="4" HotelTransportation="Other" ReserveRequirement="Deposit" ParticipationLevel="Best Available Rate and Inside Shopper participant" Availability="Available">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.852" longitude="-93.2408"/>
          <common_v15_0:Distance Units="KM" Value="0" Direction="N"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
          ...
          </hotel:Amenities>
        </hotel:HotelProperty>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult>
        <hotel:HotelProperty HotelChain="CI" HotelCode="27592" HotelLocation="MSP" Name="COMFORT INN AIRPORT" VendorLocationKey="5" HotelTransportation="Walk" ReserveRequirement="Guarantee" ParticipationLevel="Best Available Rate and Inside Shopper participant">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON  MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8617" longitude="-93.2559"/>
          <common_v15_0:Distance Units="KM" Value="2" Direction="NW"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
            ...
          </hotel:Amenities>
        </hotel:HotelProperty>
        <hotel:HotelSearchError Code="5000" Type="Warning">0606 REQUEST HOC FOR RATES</hotel:HotelSearchError>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult>
        <hotel:HotelProperty HotelChain="WV" HotelCode="54357" HotelLocation="MSP" Name="HOSPITALITY INN AND SUITES" VendorLocationKey="6" HotelTransportation="Other" ReserveRequirement="Guarantee" ParticipationLevel="Inside Shopper participant">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8598" longitude="-93.2515"/>
          <common_v15_0:Distance Units="KM" Value="2" Direction="NW"/>
          <hotel:Amenities>
            ...
        </hotel:HotelProperty>
        <hotel:HotelSearchError Code="5000" Type="Warning">0606 REQUEST HOC FOR RATES</hotel:HotelSearchError>
      </hotel:HotelSearchResult>
      <hotel:HotelSearchResult MinimumAmount="USD154.00" MaximumAmount="USD179.00">
        <hotel:HotelProperty HotelChain="HX" HotelCode="03114" HotelLocation="MSP" Name="HAMPTON STE MINNEAPOLIS ST PAUL" VendorLocationKey="7" HotelTransportation="Other" ReserveRequirement="Guarantee" ParticipationLevel="Best Available Rate and Inside Shopper participant" Availability="Available">
          <hotel:PropertyAddress>
            <hotel:Address>BLOOMINGTON MN</hotel:Address>
          </hotel:PropertyAddress>
          <common_v15_0:CoordinateLocation latitude="44.8588" longitude="-93.2309"/>
          <common_v15_0:Distance Units="KM" Value="2" Direction="NE"/>
          <hotel:HotelRating RatingProvider="AAA">
            <hotel:Rating>3</hotel:Rating>
          </hotel:HotelRating>
          <hotel:Amenities>
            ...
          </hotel:Amenities>
        </hotel:HotelProperty>
      </hotel:HotelSearchResult>
{% endhighlight %}

The amenities list, omitted above, is a sequence of four-letter codes that indicate features of the hotel.  For example
{% highlight xml %}
    <hotel:Amenity Code="AICO"/>
{% endhighlight %}
is air-conditioning.  

### Getting "more" results

In the interest of simplicity, we did not discuss in the previous lesson exactly how many search results were expected to be returned, and, perhaps most importantly, how to request more results if the provider of search results can deliver them.

The Universal API&trade; will signal in its responses if more results are available for any kind of search.  At the Java level, you use the method `getNextResultReference` to get access to a "token" that you can use later to tell Travelport what data you have already been returned.  You can see the token in the `common_v15_0:NextResultReference` tag at the top of the XML response.

![Warning](images/warning.png)  Historically, the GDSes provided data on "green-screen", character-based terminals. These systems had the notion of a screenful of information--the number of lines of text that the user could see before the top lines scrolled off-screen.  Some APIs to various GDSes have also used, or perhaps "kept", the notion of a "screenful" of information to represent a partial list of results.  In homage to this tradition, we will keep the nomenclature of "a screen" to indicate one _burst_ of information returned.

The typical construction in code for pulling multiple screens of information from a search request looks something like the following Java code.  We are using a hotel search here, but it applies to other searches.

{% highlight java %}
do {
	NextResultReference next = null;
    
	//... prepare a request and get the response...
	
    List<HotelSearchResult> results = response.getHotelSearchResult();
	
	//... process this screenful of results...
	
    // is there more?
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
    // prepare for next round by setting the next value into the same request
    req.getNextResultReference().clear();
    req.getNextResultReference().add(next);

} while (screens != MAX_SCREENS);
{% endhighlight %}

A few things are worth talking about from this snippet.

* The value returned by `getNextResultReference` is not meaningful other than as a marker to a follow-up request to indicate what part of the full result set has already been seen.

* Second, the _same_ request object is re-used for each pass around the loop.  The request parameters should be the same each time, with the full requests differing only by the next result reference.

* Finally, the loop here keeps track of how many screens have been read and it stops when `MAX_REQUESTS` has been reached.  This is both good policy and safe.  It is good policy because the total list of results may be _far_ larger than you might expect: search for any hotel in Paris, France, can yield a great many results! It is also safe because this protects you from launching a large, or even infinite, number of requests if you have a bug in your program.

#### The Resulting XML

The XML used to request "more information", aka "next screen", looks like this for a follow-up to the response shown in the previous XML listing:

{% highlight xml %}
<?xml version="1.0" encoding="UTF-8"?><soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:HotelSearchAvailabilityReq xmlns="http://www.travelport.com/schema/common_v15_0" xmlns:ns2="http://www.travelport.com/schema/hotel_v17_0" xmlns:ns3="http://www.travelport.com/schema/vehicle_v17_0" xmlns:ns4="http://www.travelport.com/schema/passive_v14_0" xmlns:ns5="http://www.travelport.com/schema/air_v18_0" xmlns:ns6="http://www.travelport.com/schema/rail_v12_0" xmlns:ns7="http://www.travelport.com/schema/universal_v16_0" TargetBranch="P105110">
      <BillingPointOfSaleInfo OriginApplication="UAPI"/>
      <NextResultReference ProviderCode="1V">k2UqRqGv/uGTZSpGoa/+4XFUHxaT56Vv+TQNVk6nh9vs5DAVQD2dUzEZbeAcrKSIAUUYScOi8pcQeLU1Xww207/30A1eaXfw</NextResultReference>
      <ns2:HotelSearchModifiers NumberOfAdults="2" NumberOfRooms="2">
        <Distance Units="KM" Value="25"/>
        <ReferencePoint>Mall of America</ReferencePoint>
      </ns2:HotelSearchModifiers>
      <ns2:HotelStay>
        <ns2:CheckinDate>2012-08-13</ns2:CheckinDate>
        <ns2:CheckoutDate>2012-08-15</ns2:CheckoutDate>
      </ns2:HotelStay>
    </ns2:HotelSearchAvailabilityReq>
  </soap:Body>
</soap:Envelope>
{% endhighlight %}

As was explained in the previous section concerning the Java code, the request parameters should be the same as the original request, with the only difference between the initial and follow-up requests being the `NextResultReference` tag.

### Searching by location

If you read the XML carefully above for the requests, you'll have realized that in this lesson, we are going to be searching for hotels that are located near some famous landmark.

To do this, one must provide, obviously, the name of the landmark but also *not* provide a "location" with a city code as we have done previously.  For example, let's assume we are looking for accomodation for a family vacation to Paris, France.  With two adults and two children, we are going to need two hotel rooms and we are planning to spend a couple of days at [Disneyland Paris](http://www.disneylandparis.com/).

For those unfamiliar with Paris' geography, Disneyland Paris _neé EuroDisney_, is 32km east of the center of Paris.  Thus, a hotel search that used the city code "PAR" or any of the Paris airports (north and south of the city) will be unlikely to produce good results.  We need to do our search for this landmark.

The key idea for doing a location of search is to use a search modifier with the location's name contained in it.  You do that with Java code like this example from `Lesson4`:

{% highlight java %}
HotelSearchModifiers mods = Lesson4.createModifiers(2, 2);
//...
String ATTRACTION = "EuroDisney";
mods.setReferencePoint(ATTRACTION);
Lesson4.addDistanceModifier(mods, 25);
req.setHotelSearchModifiers(mods);

{% endhighlight %}

The first line creates a search modifier object, and the parameters represent the need for two rooms with two adults in the party.

Next, we add the attraction to the search modifiers and we _do not_ add anything to the hotel location property of the request of object.  We can also add a distance object, created by the helper function, that represents a distance of twenty-five kilometers.  This is required to tell the geography searching engine of the uAPI how far away from the attraction to consider.

### Full validation of XML schemas

If you look at the Java code, you'll notice this when we set the distance from our attraction point:

{% highlight java %}
Distance distance = new Distance();
distance.setUnits("KM");
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

For this exercise, as before, you'll need to generate the client side code for the WSDL in `wsdl/vehicle_v17_0/vehicle.wsdl` if you have not done so already.  You can follow the same "recipe" we have used in all the lessons so far:

* create a request object
* get the port object representing the functionality
* call `service()`
* and finally decode the response object.

We won't detail too much about how to add this feature to the code for lesson 4 but only point on some potential "gotchas":

* You need to supply a date _and_ time for pickup and delivery.  These, unlike hotel search, are not using the XML objects but just raw strings in the format "2012-08-20T11:59:00".


You should be able to print out the results of the search with the name of the vendor (`VendorCode` field), the location to pick up the vehicle, the type of vehicle (`Description`), and the price (`EstimatedTotalAmount`) like this:

{% highlight console %}
FORD ESCAPE OR SIMILAR  [Vendor: ZR]
         EUR905.27
{% endhighlight %}


### Further exercises for the reader

* Similarly to the last exercise where we used a different service for a vehicle search, try to convert each price to Thai Bhat. To do this, you can use the `UtilCurrencyConversionPortType` in the `wsdl/Util_v17_0/Util.wsdl` definition.  Naturally, the classes to use are `CurrencyConversionReq` and `CurrencyConversionRsp` who contain `CurrencyConversion` objects.

* There is a large list of amenties that are provided for each hotel.  Decode this list and display them to the user.  Each amenity is represented by a [four letter code](http://support.travelport.com/webhelp/uapi/Content/Hotel/Shared_Hotel_Topics/Hotel%20Amenities.htm). You should create a table to print these out in a nice way for the user.  The "translation" of each of these amenities is farther down on that same page of documentation.

----------------------

[< Return to Unit 1, Lesson 3](lesson_1-3.html) |
[Proceed to Unit 2, Lesson 5 >](lesson_2-5.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}
{% include JB/analytics %}
