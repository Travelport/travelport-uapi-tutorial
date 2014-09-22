---
layout: page
title: "Travelport Universal API with PHP"
description :
---
{% include JB/setup %}

## Unit 3, Lesson 6

### Objective of Lesson 6

In this lesson, we'll document the how to send a basic PHP Air Search Request.

We'll focus on how it works and how it uses the uAPI to do its work.  

### Starting up

Please install PHP and Apache server for PHP. As we will be working with webservices please install CURL to work with webservices in php.
Once installation is done we are ready to go.


##Coding

You can start with just creating a blank php page by writing <?php          ?> in a blank txt file and saving it as php_SampleAir.php
You are ready with your first php page. Now to call an uAPI service from php you first need to initialize all the required variables like TargetBranch,
Username, password and provider. Let us first create a simple air availability search with php.

We have initialized TargetBranch and Credentials as $TARGETBRANCH and $CREDENTIALS and the xml request for Air Availability as $message.

Now after these variables are initialized with values we can encode the credentials with base 64 encode and initialize a variable $soap_do with curl_init
method which will call the webservices url.

After that we initialized the header variable with the header array of the xml request to send to the webservices url. Now use curl_setOpt method
to verify ssl, verify Host, posting the request and add the header.

Now you are ready to run the request using curl_exec. We used another variable to get and print the response.


So, we just finished a simple air availability request with php. In the next lesson we will play with Hotel in php.

{% endhighlight %}

### The Future

To summarize what is coming up in the tutorial, We have Air Pricing and booking request in line to add to the php Air tutorial.

----------------------

[< Return to Unit 2, Lesson 5](lesson_2-5.html) | [Proceed to Unit 3, Lesson 7 >](lesson_3-7.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}

{% include JB/analytics %}






