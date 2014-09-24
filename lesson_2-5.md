---
layout: page
title: "Making an Air or Hotel booking"
description: "Understanding how to create a booking for air, hotel, or both with the Universal API;."
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
	<hotel:HotelProperty HotelChain="BW" HotelCode="03174" HotelLocation="MSP" Name="BW PLUS BLOOMINGTON HOTEL" ParticipationLevel="Best Available Rate and Inside Shopper participant">
	   <hotel:PropertyAddress>
		  <hotel:Address>1901 Killebrew Dr</hotel:Address>
		  <hotel:Address>Bloomington MN 55425 US</hotel:Address>
	   </hotel:PropertyAddress>
	   <common_v26_0:PhoneNumber Type="Business" Number="1 952-8548200"/>
	   <common_v26_0:PhoneNumber Type="Fax" Number="1 952-8546940"/>
	   <common_v26_0:Distance Units="MI" Value="3" Direction="SW"/>
	   <hotel:HotelRating RatingProvider="AAA">
		  <hotel:Rating>3</hotel:Rating>
	   </hotel:HotelRating>
	</hotel:HotelProperty>
	<hotel:HotelDetailItem Name="CheckInTime">
	   <hotel:Text>3PM</hotel:Text>            
</hotel:HotelDetailItem>
	<hotel:HotelDetailItem Name="CheckOutTime">
	   <hotel:Text>11AM</hotel:Text>
	</hotel:HotelDetailItem>
	<hotel:HotelDetailItem Name="Marketing Message">
	   <hotel:Text>THE WORLDS BIGGEST HOTEL FAMILY</hotel:Text>
	</hotel:HotelDetailItem>
	<hotel:HotelRateDetail RatePlanType="C1KRACD" Base="USD1209.91" Total="USD1382.63">
	   <hotel:RoomRateDescription Name="Total Includes">
		  <hotel:Text>The Total includes taxes, surcharges, fees.</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Description">
		  <hotel:Text>FLEXIBLE RATE*BEST LEAST RESTRICTIVE RATE.1 KING BED NSMK MICRFG 42IN LCD TV PILLOWTOP.CONTINENTAL BREAKFAST.</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Include in Rate">
		  <hotel:Text>Breakfast Included</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Commission">
		  <hotel:Text>Yes</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Rate Change Indicator">
		  <hotel:Text>Yes</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Guarantee">
		  <hotel:Text>Guarantee Required</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:HotelRateByDate EffectiveDate="2014-06-20" ExpireDate="2014-06-29" Base="USD139.99"/>
	   <hotel:MealPlans>
		  <hotel:MealPlan Code="6"/>
	   </hotel:MealPlans>
	   <hotel:CancelInfo/>
	   <hotel:GuaranteeInfo GuaranteeType="Guarantee"/>
	</hotel:HotelRateDetail>
	<hotel:HotelRateDetail RatePlanType="C2QRACD" Base="USD1209.91" Total="USD1382.63">
	   <hotel:RoomRateDescription Name="Total Includes">
		  <hotel:Text>The Total includes taxes, surcharges, fees.</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Description">
		  <hotel:Text>FLEXIBLE RATE*BEST LEAST RESTRICTIVE RATE.2 QUEEN BEDS NSMK MICRFG 42IN LCD TV PILLOWTOP.CONTINENTAL BREAKFAST.</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Include in Rate">
		  <hotel:Text>Breakfast Included</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Commission">
		  <hotel:Text>Yes</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Rate Change Indicator">
		  <hotel:Text>Yes</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:RoomRateDescription Name="Guarantee">
		  <hotel:Text>Guarantee Required</hotel:Text>
	   </hotel:RoomRateDescription>
	   <hotel:HotelRateByDate EffectiveDate="2014-06-20" ExpireDate="2014-06-29" Base="USD139.99"/>
	   <hotel:MealPlans>
		  <hotel:MealPlan Code="6"/>
	   </hotel:MealPlans>
	   <hotel:CancelInfo/>
	   <hotel:GuaranteeInfo GuaranteeType="Guarantee"/>
	</hotel:HotelRateDetail>

{% endhighlight %}

This is far from all the `hotel:HotelRateDetail` entities encoded in this single XML message!

The early part of this snippet shows some of the detailed data about the property, and the marketing message sent from the hotel's owner.  Further, there are many possible _rates_ that can be identified by the `RatePlanType` attribute.  The prices are shown with descriptive text about each option.  As we shall see, the `Name="Guarantee"` attribute of a `RoomRateDescription` element (child of a `HotelRateDetail` object), will be critical at a later stage in booking, as such a rate typically requires a credit card to hold the reservation.

The output of the code for `lesson5` is to show the user the selected hotel, some details about it, and the information about room rates.  The search result above and the result below are done based on the point of interest "Golden Gate Bridge" (a famous Bridge in San Francisco, California).  We have selected the cheapest hotel from our shopping search, then asked for details, and chosen the lowest rate found in the details (2 nights in SFO for about 321 USD!), for a non-smoking room, with a King-sized bed.

{% highlight console %}
SUPER 8 SAN FRANCISCO FISHERMA [OZ:46314]
           SAN FRANCISCO CA
           USD155.00  to USD195.00  
           3KM from GOLDEN GATE BRIDGE
           AAA says 2 NTM says 1 
           RESERVATION REQUIREMENT IS OTHER
      http://maps.google.com/?q=37.799198,-122.441597

SUPER 8 SAN FRANCISCO FISHERMA
              Hwy 101 on Lombard 
              San Francisco CA 94123 US 
              Business 1 415-9220244
              Fax 1 415-9228887

			  
looking for non-smoking:[Total includes taxes, surcharges and fees.]
[BEST AVAILABLE RATE.1 KING BED NON-SMOKING ROOM WITH.FREE  BREAKFAST AND FREE.]

looking for non-smoking:[Total includes taxes, surcharges and fees.]
[AAA DISCOUNT.1 KING BED NON-SMOKING ROOM WITH.FREE  BREAKFAST AND FREE.]

[Total includes taxes, surcharges and fees.]
[AAA DISCOUNT.1 KING BED NON-SMOKING ROOM WITH.FREE  BREAKFAST AND FREE.]

{% endhighlight %}

### Reserving the room

For the third step in the hotel booking sequence, we must construct a new request with the key hotel parameters such as the number of rooms, number of adults, check-in and out dates, and choices that might affect price or availability such as `HotelBedding` or the travelers desire for a non-smoking room.

The two objects for making bookings are called `AirCreateReservationPortType` and `HotelReservationServicePortType`, with the naturally named requests `AirCreateReservationReq` and `HotelCreateReservationReq` and the matching response (`Rsp`) types for getting results.

Since we are now making the reservation, we need to put in details about who the traveler is in the create reservation request:

{% highlight java %}

	//adding traveler 1
    BookingTraveler traveler = new BookingTraveler();
    BookingTravelerName name = new BookingTravelerName();
    name.setFirst("Hugh");
    name.setLast("Capet");
    name.setPrefix("MR");
    PhoneNumber number = new PhoneNumber();
    number.setLocation("home");
    number.setCountryCode("1");
    number.setAreaCode("212");
    number.setNumber("555-1212");
            
    GregorianCalendar c = new GregorianCalendar();
    String dob = "1967-11-23";
    Date date = new Date();
    try {
	date = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
    }catch (ParseException e1) {
	// TODO Auto-generated catch block
	System.err.println("unable to parse Date: " + e1.getMessage());
    }
    c.setTime(date);
    XMLGregorianCalendar xgc = null;
    try {
		xgc = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
   }catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		System.err.println("Date type configuration error : " + e.getMessage());
   }            
   traveler.setDOB(xgc);
   traveler.setNationality("FR");
            
   TypeStructuredAddress addrs = new TypeStructuredAddress();
   addrs.setAddressName("Home");
   addrs.setAddressName("Hugh Capet");
   addrs.setCity("Montpellier");
   State vt = new State();
   vt.setValue("VT");            
   addrs.setState(vt);
            
   addrs.getStreet().add("1 louvre street");
            
   addrs.setCountry("US");
   addrs.setPostalCode("05602");

            
   traveler.setTravelerType("ADT");
   traveler.setBookingTravelerName(name);
   traveler.getPhoneNumber().add(number);
            
   Email email = new Email();
   email.setEmailID("test@travelport.com");
   email.setType("Home");
            
   traveler.getEmail().add(email);

   traveler.getAddress().add(addrs);
   req.getBookingTraveler().add(traveler);
            
            
   //adding traveler 2
   BookingTraveler traveler1 = new BookingTraveler();
   BookingTravelerName name1 = new BookingTravelerName();
   name1.setFirst("Lara");
   name1.setLast("Capet");
   name1.setPrefix("MRS");
   PhoneNumber number1 = new PhoneNumber();
   number1.setLocation("home");
   number1.setCountryCode("1");
   number1.setAreaCode("212");
   number1.setNumber("555-1214");
            
   GregorianCalendar c1 = new GregorianCalendar();
   String dob1 = "1969-06-15";
   Date date1 = new Date();
   try {
	date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dob1);
   } catch (ParseException e1) {
	// TODO Auto-generated catch block
	System.err.println("unable to parse Date: " + e1.getMessage());
   }
   c1.setTime(date);
   XMLGregorianCalendar xgc1 = null;
   try {
xgc1 = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		System.err.println("Date type configuration error : " + e.getMessage());
	}            
   traveler.setDOB(xgc1);
   traveler.setNationality("FR");
		
   TypeStructuredAddress addrs1 = new TypeStructuredAddress();
   addrs1.setAddressName("Home");
   addrs1.setAddressName("Hugh Capet");
   addrs1.setCity("Montpellier");
   State vt1 = new State();
   vt1.setValue("VT");            
   addrs1.setState(vt1);
		
   addrs1.getStreet().add("1 louvre street");
		
   addrs1.setCountry("US");
   addrs1.setPostalCode("05602");

		
   traveler1.setTravelerType("ADT");
   traveler1.setBookingTravelerName(name1);
   traveler1.getPhoneNumber().add(number1);
		
   Email email1 = new Email();
   email1.setEmailID("test@travelport.com");
   email1.setType("Home");
	   
   traveler1.getEmail().add(email1);

   traveler1.getAddress().add(addrs1);
   req.getBookingTraveler().add(traveler1);


{% endhighlight %}

In a real application, rather than a tutorial, one would almost certainly want to add many more details about the traveler.  The `BookingTraveler` object has numerous fields that can accept multiple addresses, phone numbers, email addresses, the gender, the age of the traveler, and more.

If there is a family traveling and booking this room in Los Angeles, the hotel reception may want to have the name and details of other family members in case they should arrive separately at the hotel from Mr Capet.

We can take some values found in the "hotel details" response, and place them into the request that we are going to use for booking the room:
* the `lowestRate` which is of type `HotelRateDetail`
* the `property` which is of type `HotelProperty`

This is convenient, since we can be sure that we are sending all the details we know about the rate and property.

{% highlight java %}

//put the rate in that we found was the lowest (from result of details request)
req.setHotelRateDetail(lowestRate);
            
//put in the hotel we wanted (from result of details request)
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
     cc.setNumber("4123456789001111");
     cc.setBankCountryCode("US");
     //dec 2014
     cc.setExpDate(getFactory().newXMLGregorianCalendarDate(2016, 06,
              DatatypeConstants.FIELD_UNDEFINED, 
              DatatypeConstants.FIELD_UNDEFINED));
     cc.setName("JOAN TEST");
     cc.setCVV("256");
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
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <univ:HotelCreateReservationReq AuthorizedBy="user" TargetBranch="TRGT_BRCH" TraceId="trace" UserAcceptance="true" ProviderCode="1G" xmlns:univ="http://www.travelport.com/schema/universal_v26_0">
         <com:BillingPointOfSaleInfo OriginApplication="UAPI" xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
         <com:BookingTraveler Age="46" DOB="1967-11-23" Gender="F" Key="0dKhKpmwTMKMaovg6xTrlQ==" Nationality="FR" TravelerType="ADT" xmlns:com="http://www.travelport.com/schema/common_v26_0">
            <com:BookingTravelerName First="Hugh" Last="Capet" Prefix="Mr"/>
            <com:PhoneNumber AreaCode="212" CountryCode="1" Location="MON" Number="555-1212" Type="Home"/>
            <com:Email EmailID="test@travelport.com" Type="Home"/>
            <com:Address>
               <com:AddressName>Hugh Capet</com:AddressName>
               <com:Street>1 louvre street</com:Street>
               <com:City>Montpellier</com:City>
               <com:State>VT</com:State>
               <com:PostalCode>05602</com:PostalCode>
               <com:Country>US</com:Country>
            </com:Address>
         </com:BookingTraveler>
         <com:BookingTraveler Age="44" DOB="1969-06-15" Gender="F" Key="0dKhKpmwTMKMaovg7xTrlQ==" Nationality="FR" TravelerType="ADT" xmlns:com="http://www.travelport.com/schema/common_v26_0">
            <com:BookingTravelerName First="Lara" Last="Capet" Prefix="Mrs"/>
            <com:PhoneNumber AreaCode="212" CountryCode="1" Location="MON" Number="555-1214" Type="Home"/>
            <com:Email EmailID="test@travelport.com" Type="Home"/>
            <com:Address>
               <com:AddressName>Hugh Capet</com:AddressName>
               <com:Street>1 louvre street</com:Street>
               <com:City>Montpellier</com:City>
               <com:State>VT</com:State>
               <com:PostalCode>05602</com:PostalCode>
               <com:Country>US</com:Country>
            </com:Address>
         </com:BookingTraveler>
         <hot:HotelRateDetail RatePlanType="NK1RAC" Base="USD1363.00" Tax="USD208.71" Total="USD1571.71" xmlns:hot="http://www.travelport.com/schema/hotel_v26_0"/>
         <hot:HotelProperty HotelChain="OZ" HotelCode="46314" HotelLocation="SFO" Name="SUPER 8 SAN FRANCISCO FISHERMA" ParticipationLevel="Best Available Rate and Inside Shopper participant" xmlns:hot="http://www.travelport.com/schema/hotel_v26_0">
            <hotel:PropertyAddress xmlns:hotel="http://www.travelport.com/schema/hotel_v26_0">
               <hotel:Address>Hwy 101 on Lombard</hotel:Address>
               <hotel:Address>San Francisco CA 94123 US</hotel:Address>
            </hotel:PropertyAddress>
         </hot:HotelProperty>
         <hot:HotelStay xmlns:hot="http://www.travelport.com/schema/hotel_v26_0">
            <hot:CheckinDate>2014-06-20</hot:CheckinDate>
            <hot:CheckoutDate>2014-06-29</hot:CheckoutDate>
         </hot:HotelStay>
         <com:Guarantee Type="Guarantee" xmlns:com="http://www.travelport.com/schema/common_v26_0">
            <com:CreditCard BankCountryCode="US" BankName="USB" ExpDate="2016-06" CVV=”256” Number="4123456789001111" Type="VI"/>
         </com:Guarantee>
         <hot:GuestInformation NumberOfRooms="1" xmlns:hot="http://www.travelport.com/schema/hotel_v26_0">
            <hot:NumberOfAdults>2</hot:NumberOfAdults>
         </hot:GuestInformation>
         <com:HostToken xmlns:com="http://www.travelport.com/schema/common_v26_0"/>
      </univ:HotelCreateReservationReq>
   </soapenv:Body>
</soapenv:Envelope>

{% endhighlight %}

{% highlight xml %}
<SOAP:Envelope xmlns:SOAP="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP:Body>
      <universal:HotelCreateReservationRsp TraceId="trace" TransactionId="DD16BD840A07761E3F0A3B5EF9902206" ResponseTime="5728" xmlns:universal="http://www.travelport.com/schema/universal_v26_0" xmlns:common_v26_0="http://www.travelport.com/schema/common_v26_0" xmlns:hotel="http://www.travelport.com/schema/hotel_v26_0">
         <common_v26_0:ResponseMessage Code="3715" Type="Warning" ProviderCode="1G">Host only allows one Address/Delivery Address. Only one sent in request.</common_v26_0:ResponseMessage>
         <universal:UniversalRecord LocatorCode="DWV1V1" Version="0" Status="Active">
            <common_v26_0:BookingTraveler Key="0dKhKpmwTMKMaovg6xTrlQ==" TravelerType="ADT" Age="46" DOB="1967-11-23" Gender="F" Nationality="FR" ElStat="A">
               <common_v26_0:BookingTravelerName Prefix="Mr" First="Hugh" Last="Capet"/>
               <common_v26_0:PhoneNumber Key="BvmZPU1xRAaR9j9EaZOXTQ==" Type="Home" Location="MON" CountryCode="1" Number="555-1212" AreaCode="212" ElStat="A">
                  <common_v26_0:ProviderReservationInfoRef Key="gXDg/odHSoe3auG2Cvy64w=="/>
               </common_v26_0:PhoneNumber>
               <common_v26_0:Email Key="QcY4T9jfRJet6jlmmidP/Q==" Type="Home" EmailID="test@travelport.com" ElStat="A">
                  <common_v26_0:ProviderReservationInfoRef Key="gXDg/odHSoe3auG2Cvy64w=="/>
               </common_v26_0:Email>
               <common_v26_0:Address Key="DGb7KNz2SDOWDAYGWAYdYw==" ElStat="A">
                  <common_v26_0:AddressName>Hugh Capet</common_v26_0:AddressName>
                  <common_v26_0:Street>1 louvre street</common_v26_0:Street>
                  <common_v26_0:City>Montpellier</common_v26_0:City>
                  <common_v26_0:State>VT</common_v26_0:State>
                  <common_v26_0:PostalCode>05602</common_v26_0:PostalCode>
                  <common_v26_0:Country>US</common_v26_0:Country>
                  <common_v26_0:ProviderReservationInfoRef Key="gXDg/odHSoe3auG2Cvy64w=="/>
               </common_v26_0:Address>
            </common_v26_0:BookingTraveler>
            <common_v26_0:BookingTraveler Key="0dKhKpmwTMKMaovg7xTrlQ==" TravelerType="ADT" Age="44" DOB="1969-06-15" Gender="F" Nationality="FR" ElStat="A">
               <common_v26_0:BookingTravelerName Prefix="Mrs" First="Lara" Last="Capet"/>
               <common_v26_0:PhoneNumber Key="6m9jDVdRR9GBgjD1jmwmDA==" Type="Home" Location="MON" CountryCode="1" Number="555-1214" AreaCode="212" ElStat="A">
                  <common_v26_0:ProviderReservationInfoRef Key="gXDg/odHSoe3auG2Cvy64w=="/>
               </common_v26_0:PhoneNumber>
               <common_v26_0:Email Key="7rev9Z00SpK5Dk/EDPekgA==" Type="Home" EmailID="test@travelport.com" ElStat="A">
                  <common_v26_0:ProviderReservationInfoRef Key="gXDg/odHSoe3auG2Cvy64w=="/>
               </common_v26_0:Email>
               <common_v26_0:Address Key="muVZDegARjyFXDgXMXwhig==" ElStat="A">
                  <common_v26_0:AddressName>Hugh Capet</common_v26_0:AddressName>
                  <common_v26_0:Street>1 louvre street</common_v26_0:Street>
                  <common_v26_0:City>Montpellier</common_v26_0:City>
                  <common_v26_0:State>VT</common_v26_0:State>
                  <common_v26_0:PostalCode>05602</common_v26_0:PostalCode>
                  <common_v26_0:Country>US</common_v26_0:Country>
               </common_v26_0:Address>
            </common_v26_0:BookingTraveler>
            <common_v26_0:OSI Key="rjuofEYhQVCf0AHzuxI+UA==" Carrier="1G" Text="OZ46314ARR20JUN CXL:TO AVOID BEING BILLED CANCEL BY 6:00 PM 20-JU" ElStat="A" ProviderReservationInfoRef="gXDg/odHSoe3auG2Cvy64w=="/>
            <universal:ProviderReservationInfo Key="gXDg/odHSoe3auG2Cvy64w==" ProviderCode="1G" LocatorCode="XSMX6E" CreateDate="2014-05-08T18:27:11.882+00:00" ModifiedDate="2014-05-08T18:27:11.909+00:00" HostCreateDate="2014-05-08" OwningPCC="5TY2"/>
            <hotel:HotelReservation Status="HK" BookingConfirmation="69069310" LocatorCode="00014SDY" CreateDate="2014-05-08T18:27:11.850+00:00" ModifiedDate="2014-05-08T18:27:11.909+00:00" ProviderReservationInfoRef="gXDg/odHSoe3auG2Cvy64w==" TravelOrder="1">
               <common_v26_0:BookingTravelerRef Key="0dKhKpmwTMKMaovg6xTrlQ=="/>
               <common_v26_0:BookingTravelerRef Key="0dKhKpmwTMKMaovg7xTrlQ=="/>
               <common_v26_0:ReservationName>
                  <common_v26_0:BookingTravelerRef Key="0dKhKpmwTMKMaovg6xTrlQ=="/>
               </common_v26_0:ReservationName>
               <hotel:HotelProperty HotelChain="OZ" HotelCode="46314" HotelLocation="SFO" Name="SUPER 8 SAN FRANCIS" ParticipationLevel="Best Available Rate and Inside Shopper participant">
                  <hotel:PropertyAddress>
                     <hotel:Address>HWY 101 ON LOMBARD</hotel:Address>
                     <hotel:Address>SAN FRANCISCO CA 94123</hotel:Address>
                  </hotel:PropertyAddress>
                  <common_v26_0:PhoneNumber Type="Hotel" Number="415-922-0244"/>
                  <common_v26_0:PhoneNumber Type="Fax" Number="415-922-8887"/>
               </hotel:HotelProperty>
               <hotel:HotelRateDetail RatePlanType="NK1RAC" Base="USD1363.00" Tax="USD208.71" Total="USD1571.71" RateGuaranteed="true">
                  <hotel:RoomRateDescription Name="Total Includes">
                     <hotel:Text>Total includes taxes, surcharges and fees</hotel:Text>
                  </hotel:RoomRateDescription>
                  <hotel:HotelRateByDate EffectiveDate="2014-06-20" ExpireDate="2014-06-22" Base="USD165.00"/>
                  <hotel:HotelRateByDate EffectiveDate="2014-06-22" ExpireDate="2014-06-27" Base="USD155.00"/>
                  <hotel:HotelRateByDate EffectiveDate="2014-06-27" ExpireDate="2014-06-29" Base="USD129.00"/>
                  <hotel:TaxDetails>
                     <hotel:Tax Code="SATX">
                        <hotel:Amount>USD21.20</hotel:Amount>
                     </hotel:Tax>
                     <hotel:Tax Code="SRCH">
                        <hotel:Amount>USD1.51</hotel:Amount>
                     </hotel:Tax>
                     <hotel:Tax Code="OCTX">
                        <hotel:Amount>USD0.47</hotel:Amount>
                     </hotel:Tax>
                  </hotel:TaxDetails>
                  <hotel:GuaranteeInfo GuaranteeType="Guarantee"/>
               </hotel:HotelRateDetail>
               <hotel:HotelStay>
                  <hotel:CheckinDate>2014-06-20</hotel:CheckinDate>
                  <hotel:CheckoutDate>2014-06-29</hotel:CheckoutDate>
               </hotel:HotelStay>
               <common_v26_0:Guarantee Type="Guarantee" Key="iuod0lMyQBCskHtRXhG5ew==" Reusable="true" ElStat="A">
                  <common_v26_0:CreditCard Type="VI" Number="************1111" ExpDate="2016-06" BankName="USB" BankCountryCode="US"/>
               </common_v26_0:Guarantee>
               <common_v26_0:BookingSource Type="IataNumber" Code="99999992"/>
               <hotel:GuestInformation NumberOfRooms="1">
                  <hotel:NumberOfAdults>2</hotel:NumberOfAdults>
               </hotel:GuestInformation>
               <common_v26_0:SellMessage>GTD:HOLD ROOM UNTIL 6PM</common_v26_0:SellMessage>
               <common_v26_0:SellMessage>CXL:TO AVOID BEING BILLED CANCEL BY 6:00 PM 20-JU</common_v26_0:SellMessage>
               <common_v26_0:SellMessage>N-14; PENALTY AMOUNT 165.00 USD PER ROOM PLUS</common_v26_0:SellMessage>
               <common_v26_0:SellMessage>TAXES</common_v26_0:SellMessage>
               <common_v26_0:SellMessage>THANK YOU FOR BOOKING SUPER 8.   *</common_v26_0:SellMessage>
            </hotel:HotelReservation>
            <common_v26_0:AgencyInfo>
               <common_v26_0:AgentAction ActionType="Created" AgentCode="AGNT_CODE" BranchCode="TRGT_BRCH" AgencyCode="AGCY_CODE" EventTime="2014-05-08T18:27:06.576+00:00"/>
            </common_v26_0:AgencyInfo>
         </universal:UniversalRecord>
      </universal:HotelCreateReservationRsp>
   </SOAP:Body>
</SOAP:Envelope>
{% endhighlight %}

And our program (lesson5.java) prints out a few fields for people who don't want to dig around in the XML:

{% highlight console %}
Universal Record Locator: DWTMD8
Hotel reservation Code  : 00014QMG
Hotel Total Cost        : USD321.72
                        : GTD:CREDIT CARD GUARANTEE
                        : CXL:TO AVOID BEING BILLED CANCEL BY 4:00 PM 21-JU
                        : N-14; PENALTY AMOUNT 139.50 USD PER ROOM PLUS
                        : TAXES
                        : THANK YOU FOR BOOKING SUPER 8.   *

{% endhighlight %}

A few things to note about the request and response above. First, the credit card information is obviously something that most real applications will need to improve. Be sure that you verify any of your practices with this sensitive data with your credit card company. For example, it is normally not recommended for a website to "hold onto" credit card information but rather utilize it (once) for communication with Travelport and then discard it.

There are a number of "human readable" segments to the response. Some of these are displayed in our program's output but there are many text "blobs" that may be interesting to users. The number of these to display depends on what level of detail your application is working with. For application's that target travel agents or other professionals, it is recommended to err on the side of too much detail rather than too little.

### Universal Record

There are two record locators show in the output. The first one is for the Travelport concept of the Universal Record and the second one for the Hotel reservation system. A Universal Record is created for you anytime you book travel, a hotel, or a car through the Universal API™. There are additional APIs provided to allow various types of changes to be made to Universal Records.

A Universal Record can be thought of as a wrapper around other records. A single Universal Record can have air travel, a vehicle reservation, a hotel reservation, and even tours or other activities associated with it. The objective is to have all the details about a single journey for a specific customer in one place. The details of the Universal Record API is beyond the scope of this tutorial, but suffice it to say that this "container" should be used by application’s that wish to have all of a traveler's data together… and this means almost all of them!


### Thanks

Thanks for working through all of Unit 2 and our discussion of hotel reservations, booking, and searching by landmarks.  If you continue on to the next unit, we'll be discussing how to embed Travelport's uAPI inside a Facebook app and the issues that arise from that.





----------------------

[< Return to Unit 2, Lesson 4](lesson_2-4.html) || [Proceed to Lesson 1, Air >](lesson_3-6.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}
{% include JB/analytics %}
