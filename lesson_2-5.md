---
layout: page
title: "Making an Air or Hotel booking"
description: "Understanding how to create a booking for air, hotel, or both with the Universal API&trade;."
---
{% include JB/setup %}

## Unit 2, Lesson 5

### Objective of Lesson 5

In this lesson we are going to focus on the mechanics of actually making a booking, and having that reservation handled by Travelport.

We will discuss Hotel bookings in some depth, and refer to the similarities with making Air reservations.  

### Shopping and reality

For air travel, [Lesson 3](lesson_1-3.html) discussed how to perform a _low fare search_, usually just called _shopping_. [Lesson 4](lesson_2_4.html) did something similar for hotel room shopping.

Shopping differs from [availability and pricing](lesson_1-2.html) not only because it combines the two processes in one step, but also because the technology underlying it is quite different.

In particular, almost all providers of search services --- from internet search engines like [Google](http://google.com) to comparison shopping tools for consumer goods like [PriceGrabber](http://www.pricegrabber.com) --- take some shortcuts in an effort to produce the lowest-priced result as quickly as possible.  Although the techniques are different by both industry and shopping provider, typically there is a need to use caching techniques so the shopping provider does not have to do live queries for all of the items that it might propose as results. 

![Warning](images/warning.png)  In the particular case of buying travel-related _live_ inventory, a particular result from a shopping request (`LowFareSearchReq` producing a `LowFareSearchRsp`) may be "out of date".  For this reason, you were cautioned in the previous lesson that it is good practice with the uAPI to follow up a result gained from a shopping request with an additional `AirPricingReq` to insure that the inventory is still available and that the price has not changed.

A deeper reason than caching, for this need to "verify" that a particular price is available or has not changed, is because the uAPI is a truly real-time system with thousands of concurrent users.  It is more than likely that during the time your program spends processing results from a shopping requests, many other pieces of software are connected to Travelport and actively changing the inventory that is available.

Further, the owners of the inventory can, and do, change their prices frequently, and this also can occur concurrently with your program's operation.

The endgame of managing live inventory is the booking step.

When doing a booking request, all possible checks are done to the requested item to be reserved: this is to ensure that the object is still available, has been priced correctly with the provided fares, and any taxes are added correctly.

Further, the system must also know _who_ is making the booking, and how the traveler will pay for the booking.  The uAPI will validate all of the values provided very carefully, to ensure that a final booking is only made when all the data are correct.

### Hotel details

The sequence of calls to the uAPI for reserving a hotel is:
1. shop
2. details
3. reserve

Generally, the values returned from the Air service are more complex to parse and display to the user, because of the broader range of products (including rail) and the much larger set of possible, applicable fares.  For a hotel room, there are fewer variables so the responses returned are somewhat simpler to process and display.

Although hotel inventory is simpler, the results from a shopping request, such as those shown in lesson 4, are not sufficient to create a booking.  Once a particular hotel of interest is found with a shopping request, it should be followed up to get the detailed room and pricing information, as well as more details about the property that are likely of interest to any traveler, like the full address, phone numbers, etc.

When the `HotelDetailsServicePortType` is invoked with a `HotelDetailsReq`, the parameters that are needed are quite similar to a shopping request but the result includes many different options in terms of pricing and, in some cases, other marketing information from the hotel.  

Let's look "under the hood" to see part of the XML result that is passed back to our client program when we ask for details about a particular property:

{% highlight xml %}
<hotel:RequestedHotelDetails>
  <hotel:HotelProperty HotelChain="HJ" HotelCode="29993" HotelLocation="LAX" Name="HOWARD JOHNSON LOS ANGELES">
    <hotel:PropertyAddress>
      <hotel:Address>603 S. New Hampshire Ave. </hotel:Address>
      <hotel:Address>Los Angeles CA 90005 US </hotel:Address>
    </hotel:PropertyAddress>
    <common_v15_0:PhoneNumber Type="Business" Number="1 213-3854444"/>
    <common_v15_0:PhoneNumber Type="Fax" Number="1 213-3805413"/>
    <common_v15_0:Distance Value="3" Direction="SW"/>
  </hotel:HotelProperty>
  <hotel:HotelDetailItem Name="Marketing Message">
    <hotel:Text>THANK YOU FOR CHOOSING HOWARD JOHNSO</hotel:Text>
  </hotel:HotelDetailItem>
  <hotel:HotelRateDetail RatePlanType="NDD1SDI" Base="USD148.84" Tax="USD23.07" Total="USD171.90">
    <hotel:RoomRateDescription Name="Total Includes">
      <hotel:Text>The Total includes taxes, surcharges, fees.</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Description">
      <hotel:Text>STAY 2  SAVE 15 PERCENT -.2 DOUBLE BEDS NON SMOKING ROOM WITH.FREE CONTINENTAL BREAKFAST  FREE.</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Commission">
      <hotel:Text>Yes</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Guarantee">
      <hotel:Text>Guarantee Required</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:HotelRateByDate EffectiveDate="2012-06-20" ExpireDate="2012-06-22" Base="USD74.42"/>
  </hotel:HotelRateDetail>
  <hotel:HotelRateDetail RatePlanType="DD1SDI" Base="USD148.84" Tax="USD23.07" Total="USD171.90">
    <hotel:RoomRateDescription Name="Total Includes">
      <hotel:Text>The Total includes taxes, surcharges, fees.</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Description">
      <hotel:Text>STAY 2  SAVE 15 PERCENT -.2 DOUBLE BEDS SMOKING ROOM WITH FREE.CONTINENTAL BREAKFAST  FREE WI-FI.</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Commission">
      <hotel:Text>Yes</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:RoomRateDescription Name="Guarantee">
      <hotel:Text>Guarantee Required</hotel:Text>
    </hotel:RoomRateDescription>
    <hotel:HotelRateByDate EffectiveDate="2012-06-20" ExpireDate="2012-06-22" Base="USD74.42"/>
  </hotel:HotelRateDetail>

{% endhighlight %}

This is far from all the `hotel:HotelRateDetail` entities encoded in this single XML message!

The early part of this snippet shows some of the detailed data about the property, and the marketing message sent from the hotel's owner.  Further, there are many possible _rates_ that can be identified by the `RatePlanType` attribute.  The prices are shown with descriptive text about each option.  As we shall see, the `Name="Guarantee"` attribute of a `RoomRateDescription` element (child of a `HotelRateDetail` object), will be critical at a later stage in booking, as such a rate typically requires a credit card to hold the reservation.

The output of the code for `lesson5` is to show the user the selected hotel, some details about it, and the information about room rates.  The search result above and the result below are done based on the point of interest "Staples Center" (a multi-purpose event center in downtown Los Angeles, California).  We have selected the cheapest hotel from our shopping search, then asked for details, and chosen the lowest rate found in the details (2 nights in LA for about 170 USD!), for a non-smoking room, with a queen-sized bed.

{% highlight console %}
HOWARD JOHNSON LOS ANGELES
              603 S. New Hampshire Ave. 
              Los Angeles CA 90005 US 
              Business 1 213-3854444
              Fax 1 213-3805413


[The Total includes taxes, surcharges, fees.]
[STAY 2  SAVE 15 PERCENT -.2 DOUBLE BEDS NON SMOKING ROOM WITH.FREE CONTINENTAL BREAKFAST  FREE.]

Total Price: USD171.90
{% endhighlight %}

### Reserving the room

For the third step in the hotel booking sequence, we must construct a new request with the key hotel parameters such as the number of rooms, number of adults, check-in and out dates, and choices that might affect price or availability such as `HotelBedding` or the travelers desire for a non-smoking room.

The two objects for making bookings are called `AirCreateReservationPortType` and `HotelReservationServicePortType`, with the naturally named requests `AirCreateReservationReq` and `HotelCreateReservationReq` and the matching response (`Rsp`) types for getting results.

Since we are now making the reservation, we need to put in details about who the traveler is in the create reservation request:

{% highlight java %}

BookingTraveler traveler = new BookingTraveler();
BookingTravelerName name = new BookingTravelerName();
name.setFirst("Hugh");
name.setLast("Capet");
PhoneNumber number = new PhoneNumber();
number.setLocation("home");
number.setCountryCode("1");
number.setAreaCode("212");
number.setNumber("555-1212");
traveler.setTravelerType("ADT");
traveler.setBookingTravelerName(name);
traveler.getPhoneNumber().add(number);
req.getBookingTraveler().add(traveler);

{% endhighlight %}

In a real application, rather than a tutorial, one would almost certainly want to add many more details about the traveler.  The `BookingTraveler` object has numerous fields that can accept multiple addresses, phone numbers, email addresses, the gender, the age of the traveler, and more.

If there is a family traveling and booking this room in Los Angeles, the hotel reception may want to have the name and details of other family members in case they should arrive separately at the hotel from Mr Capet.

We can take some values found in the "hotel details" response, and place them into the request that we are going to use for booking the room:
* the `lowestRate` which is of type `HotelRateDetail`
* the `property` which is of type `HotelProperty`

This is convenient, since we can be sure that we are sending all the details we know about the rate and property.

{% highlight java %}

req.setHotelRateDetail(lowestRate);
req.setHotelProperty(property);

{% endhighlight %}

### Guarantee

A credit card number is needed to reserve a room in most cases.

Generally speaking, the card simply holds the reservation, and is not charged immediately. Later on, the property might charge penalties to the card in case of late cancellations or no-show.

![Warning](images/warning.png)  Because the card is not being charged, many providers do not validate the address of the cardholder against the credit card account --- and the uAPI might generate error if you provide this detail.

In `lesson4` we have a helper routine called `getFakeCreditCard()` that will return a bogus credit card object and, optionally, attach a billing address as well.

{% highlight java %}

public static CreditCard getFakeCreditCard(boolean withAddress) {
    CreditCard cc = new CreditCard();
    TypeStructuredAddress addr = new TypeStructuredAddress();
    
    cc.setType("VI");
    cc.setNumber("4012888888881881");
    //dec 2014
    cc.setExpDate(getFactory().newXMLGregorianCalendarDate(2014, 12,
            DatatypeConstants.FIELD_UNDEFINED, 
            DatatypeConstants.FIELD_UNDEFINED));
    cc.setName("JOAN TEST");
    cc.setCVV("111");
    addr.setAddressName("Hugh Capet");
    addr.setCity("Montpellier");
    State vt = new State();
    vt.setValue("VT");
    addr.setState(vt);
    addr.setCountry("US");
    addr.setPostalCode("05602");
    addr.setAddressName("1 louvre street");
    
    if (withAddress) {
        cc.setBillingAddress(addr);
    }
    return cc;
}
{% endhighlight %}

If you are implementing this tutorial using "testing" credentials issued by Travelport, the actual values in the credit card fields will not be validated.

In a real application, many checks will be made to verify with the credit card provider if this card number is associated with this owner, and to check if the CCV code (the code on the back of the card) is correct.

### Making The Final Reservation

As has been the case in most of the lessons, we use a request/response pair to actually make the reservation.  This results in the following request and response to be transmitted to and received from Travelport. (This example is for a hotel that is near the 'GOLDEN GATE BRIDGE' attraction in San Francisco, California):

{% highlight xml %}
<?xml version="1.0" encoding="UTF-8"?><soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:HotelCreateReservationReq xmlns="http://www.travelport.com/schema/common_v15_0" xmlns:ns2="http://www.travelport.com/schema/hotel_v17_0" xmlns:ns3="http://www.travelport.com/schema/vehicle_v17_0" xmlns:ns4="http://www.travelport.com/schema/passive_v14_0" xmlns:ns5="http://www.travelport.com/schema/air_v18_0" xmlns:ns6="http://www.travelport.com/schema/universal_v16_0" xmlns:ns7="http://www.travelport.com/schema/rail_v12_0" TargetBranch="P105110">
      <BillingPointOfSaleInfo OriginApplication="UAPI"/>
      <BookingTraveler TravelerType="ADT">
        <BookingTravelerName First="Hugh" Last="Capet"/>
        <PhoneNumber Location="home" CountryCode="1" AreaCode="212" Number="555-1212"/>
      </BookingTraveler>
      <ns2:HotelRateDetail RatePlanType="TLGT78B" DepositRequired="true" Base="USD519.76" Total="USD519.76">
        <ns2:RoomRateDescription Name="Total Includes">
          <ns2:Text>The Total includes taxes, surcharges, fees.</ns2:Text>
        </ns2:RoomRateDescription>
        <ns2:RoomRateDescription Name="Description">
          <ns2:Text>ADVANCE PURCHASE NO REFUNDS.2 DOUBLE BEDS CLASSIC VIEW CLASSIC VIEW DOUBLE.BED ROOMS ARE 330 SQ FT IN SIZE AND LOCATED.</ns2:Text>
        </ns2:RoomRateDescription>
        <ns2:RoomRateDescription Name="Rate Change Indicator">
          <ns2:Text>No</ns2:Text>
        </ns2:RoomRateDescription>
        <ns2:RoomRateDescription Name="Guarantee">
          <ns2:Text>Deposit Required</ns2:Text>
        </ns2:RoomRateDescription>
        <ns2:HotelRateByDate EffectiveDate="2012-08-13" ExpireDate="2012-08-15" Base="USD225.00"/>
      </ns2:HotelRateDetail>
      <ns2:HotelProperty HotelChain="IC" HotelCode="12753" HotelLocation="SFO" Name="INTERCONTINENTAL">
        <ns2:PropertyAddress>
          <ns2:Address>888 HOWARD STREET </ns2:Address>
          <ns2:Address>SAN FRANCISCO CA 94103 US </ns2:Address>
        </ns2:PropertyAddress>
        <PhoneNumber Type="Business" Number="1 415-616-6500"/>
        <PhoneNumber Type="Fax" Number="1 415-616-6621"/>
        <Distance Value="1" Direction="SW"/>
        <ns2:HotelRating RatingProvider="AAA">
          <ns2:Rating>4</ns2:Rating>
        </ns2:HotelRating>
      </ns2:HotelProperty>
      <ns2:HotelStay>
        <ns2:CheckinDate>2012-08-13</ns2:CheckinDate>
        <ns2:CheckoutDate>2012-08-15</ns2:CheckoutDate>
      </ns2:HotelStay>
      <Guarantee Type="Deposit">
        <CreditCard Type="VI" Number="4012888888881881" ExpDate="2014-12" Name="JOAN TEST" CVV="111"/>
      </Guarantee>
    </ns2:HotelCreateReservationReq>
  </soap:Body>
</soap:Envelope>
{% endhighlight %}

{% highlight xml %}
<?xml version="1.0" encoding="UTF-8"?><SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
  <SOAP:Body>
    <hotel:HotelCreateReservationRsp xmlns:hotel="http://www.travelport.com/schema/hotel_v17_0" xmlns:common_v15_0="http://www.travelport.com/schema/common_v15_0" TransactionId="3882E10D0A076114004561A6ED3C9786" ResponseTime="4756">
<universal:UniversalRecord xmlns:universal="http://www.travelport.com/schema/universal_v16_0" LocatorCode="H9M6J6" Version="0" Status="Active">
        <common_v15_0:BookingTraveler Key="86293" TravelerType="ADT">
          <common_v15_0:BookingTravelerName First="Hugh" Last="Capet"/>
          <common_v15_0:PhoneNumber Key="86603" Type="None" Location="home" CountryCode="1" Number="555-1212" AreaCode="212"/>
          <common_v15_0:PhoneNumber Key="86604" Type="None" Location="HOM" Number="1 212 555-1212">
            <common_v15_0:ProviderReservationInfoRef Key="60521"/>
          </common_v15_0:PhoneNumber>
        </common_v15_0:BookingTraveler>
        <common_v15_0:OSI Key="22934" Carrier="1V" Text="-IC12753ARR13AUG CXL:ADVANCE PURCHASE ENTIRE STAY NONREFUNDABLE" ProviderReservationInfoRef="60521"/>
        <universal:ProviderReservationInfo Key="60521" ProviderCode="1V" LocatorCode="S79ZZY" CreateDate="2012-06-29T13:51:43.350+00:00" ModifiedDate="2012-06-29T13:51:43.367+00:00" HostCreateDate="2012-06-29"/>
<hotel:HotelReservation Status="HK" BookingConfirmation="66541697" LocatorCode="00LGSRYL" CreateDate="2012-06-29T13:51:43.169+00:00" ModifiedDate="2012-06-29T13:51:43.367+00:00" ProviderReservationInfoRef="60521" TravelOrder="1">
          <common_v15_0:BookingTravelerRef Key="86293"/>
          <common_v15_0:ReservationName>
            <common_v15_0:BookingTravelerRef Key="86293"/>
          </common_v15_0:ReservationName>
          <hotel:HotelProperty HotelChain="IC" HotelCode="12753" HotelLocation="SFO" Name="INTERCONTINENTAL">
            <hotel:PropertyAddress>
              <hotel:Address>888 HOWARD STREET</hotel:Address>
              <hotel:Address>SAN FRANCISCO US 94103 CA</hotel:Address>
            </hotel:PropertyAddress>
            <common_v15_0:PhoneNumber Type="Hotel" Number="1-1-1"/>
            <common_v15_0:PhoneNumber Type="Fax" Number="1-1-1"/>
            <common_v15_0:Distance Value="1" Direction="SW"/>
            <hotel:HotelRating RatingProvider="AAA">
              <hotel:Rating>4</hotel:Rating>
            </hotel:HotelRating>
          </hotel:HotelProperty>
          <hotel:HotelRateDetail RatePlanType="TLGT78B" Base="USD450.00" Total="USD519.76" RateGuaranteed="true">
            <hotel:RoomRateDescription Name="Total Includes">
              <hotel:Text>Total includes taxes, surcharges and fees</hotel:Text>
            </hotel:RoomRateDescription>
            <hotel:HotelRateByDate EffectiveDate="2012-08-13" ExpireDate="2012-08-15" Base="USD225.00"/>
          </hotel:HotelRateDetail>
          <hotel:HotelStay>
            <hotel:CheckinDate>2012-08-13</hotel:CheckinDate>
            <hotel:CheckoutDate>2012-08-15</hotel:CheckoutDate>
          </hotel:HotelStay>
          <common_v15_0:Guarantee Type="Deposit" Key="48488" Reusable="true">
            <common_v15_0:CreditCard Type="VI" Number="************1881" ExpDate="2014-12" Name="JOAN TEST" CVV="***"/>
          </common_v15_0:Guarantee>
          <common_v15_0:BookingSource Type="IataNumber" Code="00000000"/>
          <hotel:GuestInformation NumberOfRooms="1">
            <hotel:NumberOfAdults>1</hotel:NumberOfAdults>
          </hotel:GuestInformation>
          <common_v15_0:SellMessage>EFFECTIVE DATE:13AUG</common_v15_0:SellMessage>
          <common_v15_0:SellMessage>GUARANTEE REQUIREMENTS:ENTIRE STAY NONREFUNDABLE DPST DUE AT</common_v15_0:SellMessage>
          <common_v15_0:SellMessage>BKNG</common_v15_0:SellMessage>
          <common_v15_0:SellMessage>CXL:ADVANCE PURCHASE ENTIRE STAY NONREFUNDABLE</common_v15_0:SellMessage>
          <common_v15_0:SellMessage>THANK YOU FOR BOOKING INTERCONTINENTAL *</common_v15_0:SellMessage>
        </hotel:HotelReservation>
        <common_v15_0:AgencyInfo>
          <common_v15_0:AgentAction ActionType="Created" AgentCode="UAPI4438208500" BranchCode="P105110" AgencyCode="S30276" EventTime="2012-06-29T13:51:38.723+00:00"/>
        </common_v15_0:AgencyInfo>
      </universal:UniversalRecord>
    </hotel:HotelCreateReservationRsp>
  </SOAP:Body>
</SOAP:Envelope>
{% endhighlight %}

And our program (lesson5.java) prints out a few fields for people who don't want to dig around in the XML:

{% highlight console %}
Universal Record Locator: H9M6J6
Hotel reservation Code  : 00LGSRYL
Hotel Total Cost        : USD519.76
                        : EFFECTIVE DATE:13AUG
                        : GUARANTEE REQUIREMENTS:ENTIRE STAY NONREFUNDABLE DPST DUE AT
                        : BKNG
                        : CXL:ADVANCE PURCHASE ENTIRE STAY NONREFUNDABLE
                        : THANK YOU FOR BOOKING INTERCONTINENTAL *

{% endhighlight %}

A few things to note about the request and response above.  First, the credit card information is obviously something that most real applications will need to improve. Be sure that you verify any of your practices with this sensitive data with your credit card company.  For example, it is normally not recommended for a website to "hold onto" credit card information but rather utilize it (once) for communication with Travelport and then discard it.  

There are a number of "human readable" segments to the response.  Some of these are displayed in our program's output but there are many text "blobs" that may be interesting to users.  The number of these to display depends on what level of detail your application is working with.  For application's that target travel agents or other professionals, it is recommended to err on the side of too much detail rather than too little.

### Universal Record

There are two record locators show in the output.  The first one is for the Travelport concept of the Universal Record and the second one for the Hotel reservation system.  A Universal Record is created for you anytime you book travel, a hotel, or a car through the Universal API&trade;.  There are additional APIs provided to allow various types of changes to be made to Universal Records.

A Universal Record can be thought of as a wrapper around other records.  A single Universal Record can have air travel, a vehicle reservation, a hotel reservation, and even tours or other activities associated with it.  The objective is to have all the details about a single journey for a specific customer in one place.  The details of the Universal Record API is beyond the scope of this tutorial, but suffice it to say that this "container" should be used by application's that wish to have all of a traveler's data together... and this means almost all of them!

### Thanks

Thanks for working through all of Unit 2 and our discussion of hotel reservations, booking, and searching by landmarks.  If you continue on to the next unit, we'll be discussing how to embed Travelport's uAPI inside a Facebook app and the issues that arise from that.





----------------------

[< Return to Unit 2, Lesson 4](lesson_2-4.html) |
[Proceed to Unit 3, Lesson 6 >](lesson_3-6.html) 

[Table of Contents](index.html)
<hr>

{% include JB/comments %}
{% include JB/analytics %}
