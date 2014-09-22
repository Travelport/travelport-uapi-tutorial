---
layout: page
title: "Travelport Universal API with PHP"
description :
---
{% include JB/setup %}

## Unit 3, Lesson 7

### Objective of Lesson 7

In this lesson, we'll document the how to send a basic PHP Air Search Request.

We'll focus on how it works and how it uses the uAPI to do its work.  

### Starting up

In this lesson we will go to a bit more complex API use with PHP. We will search for hotel and then get the detail of the selected hotel and lastly
book it and all in PHP.


##Coding

As we have already coded a simple Php page we will dive directly into the coding here. In this tutorial we created an index.php page which uses css and html
to get input from user about TargetBranch, Username, Password, Provider, City for which we are searching the hotel, checkin and checkout dates and of course
number of adults to book the hotel. So, the page is more html/css and less php. Once we get the inputs from the user and we have created a phpSample_index.php
to process the inputs. 

In this page we created some utility functions like initializeHeader(xml message as input parameter) which will do the header initailization, credentials endoing 
and curl_init to call the webservices for all the operations and lastly it will return soap variable which we will use to run the curl_exec method from another 
utility function called runRequest. This function will call another function initializeCommons to initialize the input parameters into PHP session array.
Then the runRequest function will run the xml request and will return xml response.

Note: we will check if the Session is already set or we will use the function session_start() to start the session.

Now, once these are done we will create the phpSample_HotelSearch.php. At the top we checked if session is set otherwise we will start the session.
Now by using the include_once function we made sure that if the phpSample_index.php is already ran once. Now we followed the standard process to create
xml request message and ran it using utility functions. using another utility function prettyPrint we are saving the response xml file in the output directory.

Once we get back the Hotel Search results, we have rendered the results using phpSample_HotelDetail.php where we have included another page phpSample_HotelSelect.php
using which we can select the hotel and parse the response xml to create the hotelDetailRequest usingm the parseOutput() function.

Now once the hotel is selected we are ready to book. We have to ask for the traveler name, payment information and we used some html in phpSample_HotelBook.php
to get the details from the user as input. Once we get the inputs we have used parseDetailOutput function to parse the details response to create the HotelBookRequest.

On our way from index to hotelBook we saved all the request and response xml transactions.

So, we are just finished a complete hotel booking flow using Php.



----------------------

[< Return to Unit 3, Lesson 6](lesson_3-6.html) | [Proceed to Unit 3, Lesson 8 >](lesson_3-8.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}

{% include JB/analytics %}






