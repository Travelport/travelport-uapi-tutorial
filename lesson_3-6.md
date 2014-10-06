---
layout: page
title: "Travelport Universal API with PHP"
description :
---
{% include JB/setup %}

## Lesson 1, Air

### Objective of Lesson 1

In this lesson, we'll document how to send a basic PHP Air Search Request.

We'll focus on how it works and how it uses Travelport Universal API to do the work.  

### Starting up

Please install PHP and Apache server for PHP. Please install CURL to work with webservices in PHP.
Once installation is completed, we are ready to begin.


## Coding

You can start creating a blank php page by writing {%highlight php %} <?php          ?> {% endhighlight %} in a blank text file and saving it as php_SampleAir.php
Now to call a Universal API service from PHP you first need to initialize all the required variables like TargetBranch,
Username, password, and provider. Let us first create a simple air availability search with PHP.

We have initialized TargetBranch and Credentials as $TARGETBRANCH and $CREDENTIALS and the xml request for Air Availability as $message.

After these variables are initialized with values, we can encode the credentials with base 64 encode and initialize a variable $soap_do with curl_init
method which calls the webservices URL.

After that we initialized the header variable with the header array of the XML request to send to the webservices URL. Now use curl_setOpt method
to verify SSL, verify Host, posting the request, and add the header.

Now you are ready to run the request using curl_exec. We used another variable to get and print the response.

That is the process to complete a simple air availability request with PHP. The next lesson covers hotel requests in PHP.



----------------------

[< Return to Unit 2, Lesson 5](lesson_2-5.html) | [Proceed to Lesson 2, Hotel >](lesson_3-7.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}

{% include JB/analytics %}






