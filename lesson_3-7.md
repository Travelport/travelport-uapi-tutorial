---
layout: page
title: "Travelport Universal API with PHP"
description :
---
{% include JB/setup %}

## Lesson 2, Hotel

### Objective of Lesson 2

In this lesson, we'll document the how to send a basic PHP Air Search Request.

We'll focus on how it works and how it uses Travelport Universal API to do its work.  

### Starting up

This lesson entails a bit more complex API use with PHP. We will search for hotel, then get the detail of the selected hotel, and then book it --- all in PHP.


## Coding

As we have already coded a simple PHP page in the previous lesson, let us dive directly into the coding here. In this tutorial, we create an index.php page which uses CSS and HTML to get input from the user about TargetBranch, Username, Password, Provider, City for which we are searching the hotel, checkin and checkout dates, and the number of adults to book the hotel. Therefore, the page is more HTML/CSS and less PHP. Once the input from the user is provided, we create a phpSample_index.php to process the inputs.

In this page, we create the following utility functions:
* initializeHeader (XML message as input parameter) which does the header initailization
* credentials *endoing* and *curl_init* to call the webservices for all the operations
* a soap variable is returned used to run the curl_exec method from another utility function called runRequest.
 
runRequest calls another function initializeCommons to initialize the input parameters into PHP session array.
Then the runRequest function runs the XML request and the return XML response.

Note: check if the Session is already set or use the function session_start() to start the session.

Once these are complete, create the phpSample_HotelSearch.php. Proceed if the session is set, otherwise start the session
Use the *include_once* function to make sure the phpSample_index.php is already ran once. Next, follow the standard process to create the XML request message and run it using utility functions. Use another utility function, prettyPrint, to save the response XML file in the output directory.

Once the Hotel Search results are returned, we have rendered the results using *phpSample_HotelDetail.php* where we have included another page *phpSample_HotelSelect.php*. Select the hotel and parse the response XML to create the *hotelDetailRequest* using the *parseOutput()* function.

Once the hotel is selected, we are ready to book. Enter the traveler name, payment information, and some HTML used in *phpSample_HotelBook.php* to get the details from the user as input. Once we get the input, use the *parseDetailOutput* function to parse the detailed response to create the HotelBookRequest.

Save all the request and response XML transactions fom index to hotelBook.

This completes a hotel booking flow using PHP.



----------------------

[< Return to Lesson 1, Air](lesson_3-6.html) | [Proceed to Lesson 3, Vehicle >](lesson_3-8.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}

{% include JB/analytics %}






