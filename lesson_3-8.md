---
layout: page
title: "Universal API&trade; from inside a Facebook app"
description :
---
{% include JB/setup %}

## Unit 3, Lesson 8

### Objective of Lesson 8

In this lesson, we'll use the Travelport uAPI in ways that should be familiar to you from the previous units.

However, we are going to do this _inside_ our Facebook application using the data from the end-user's Facebook account.  We'll be developing an app (really a page) that knows how to display the upcoming birthdays of your friends, and an airfare quote for each of the possible trips to go visit a friend on their birthday.

This lesson runs in batch mode where all the processing work is done on the server. The interactive version will be described in [Lesson 9](lesson_3-9.html). This processing can take some time if you have a lot of friends. We are going to process friends in iterations (rounds) so the user can see that we are making progress. On each iteration we send a batch of requests to Facebook or Travelport for processing.

There is a trade-off here when using Facebook: the more requests in a batch, the more efficient the processing since you avoid networking penalty you would pay if you sent the requests individually.  However, the larger batches mean longer delays between "progress notifications" to the user.

### A travel industry nightmare

Almost any travel industry application has to deal with the problem of names and locations.

Our application here is no exception.  Facebook links location information to a Facebook page, all of which have simple textual names.  We have to figure out from the name of the location what transportation hub (rail or air) is nearest to this location.

Let's stick for now with just airports, and try some easy ones first. Here are the Facebook pages:

* [Miami, Florida](http://www.Facebook.com/pages/Miami-Florida/110148382341970?sk=info)
* [Munich, Germany](http://www.Facebook.com/pages/Munich-Germany/116045151742857?sk=info)
* [Singapore, Singapore](http://www.Facebook.com/pages/Miami-Florida/110148382341970?sk=info)

These are all comparatively easy because the description of the place has the name of an airport in it.  It is worth noting that Miami's "name" does not include a country!

Now let's look at some problem cases. Remember the problem we face: given just the name above, what airport would we use to visit that place?



* [Kesteren](http://www.Facebook.com/pages/Kesteren/112092158807378?sk=info)

Some places in Facebook are labelled _only_ with a city name.  Without knowing the country, as in this example, it is pretty hard to draw much of a conclusion.
Since Facebook provides latitude and longitude, a sufficiently motivated person could try to determine the country where the coordinates fall in.  Better still would be to use the spatial searching capabilities of a modern database like Postgres or Microsoft SQL Server which can do a "radius search".  With such a search and a table of all airports' latitude and longitude the problem becomes trivial.

* [Nuneaton, Warwickshire](http://www.Facebook.com/pages/Nuneaton-Warwickshire/106044539433646?sk=info)

This second difficult case can be related to the first of our easy cases, Miami.

Readers familiar with the geographical units of England will readily recognize and roughly "locate" such a place, just as residents of the United States recognize the names and know the approximate locations of states.  This suggests that our solution must understand more about the geographical units and naming conventions of countries. 

In the code provided for lessons eight and nine of this tutorial, we have "built in" this knowledge for the states of the United States, the counties of England, and the provinces of Canada. 

* [Strasbourg Saint Denis](http://www.Facebook.com/pages/Strasbourg-Saint-Denis/108855882513632)

This third example is provided primarily to show that no automated approach can handle all cases.  "Strasbourg Saint Denis" is actually a Metro station in Paris. 

There are numerous difficulties with this:
1. it has been mislabeled by Facebook as being in Strasbourg, France, an error of a few hundred kilometers... 
2. the names "Strasbourg" and "Saint Denis" are also _both_ cities in France, so simple city name matching could end up with wrong results.
3. Third, and perhaps worst, is the fact Strasbourg (or "Strasburg") is actually the name of _both_ a French and German city and they are in the same place! (The city straddles the Rhine river that divides France and Germany, and has changed hands a few times in the last few centuries.) 

Any approach that uses the country name, as we do in lessons 8 and 9, can fail to find nearby airports located in a different country.

### UCode, databases in Play 2.0

Thankfully, the solution to our problem is at and hand and provided by Travelport.

Travelport has provided us with the _UCode_ data set. This is a collection of regularized names and associated transportation hubs.  One can query it to determine what transportation facilities are at what location.  It includes about 75 thousand airports, train stations, and metro stops, and is updated regularly.  If you have a database like the one mentioned above that can do radius searches, the problem is entirely solved as you can search for entries in the UCode data "near" a given point. 

As an aside, readers that have followed the prior lessons will note that the Travelport uAPI also has the capability of doing "nearby" or "radius" searches.  We used this capability in Lesson 4 when searching for hotels "near" an attraction.  However, to solve this variant of the problem requires the ability to search near a latitude and longitude point, not something currently supported by the uAPI.

We are going to be using this data as part of our solution.  We have encoded this data as an sql script suitable for loading into either Play's test, [memory-resident database](http://hsqldb.org/) or the Heroku-provided [Postgres database](http://www.postgresql.org/) that is assigned to every application.  (Sadly, this development database does not have the spatial querying capability referred to earlier).

The SQL script is `1.sql` and located in the directory `unit3/conf/evolutions/default`.  There are a few other files in that directory that may be of interest.  These are "subsets" of the full dataset provided in `1.sql`. By shrinking the dataset, you can reduce the startup time of your copy of unit3, although at the cost of having fewer Facebook friends for whom you can find appropriate airports.   This can be very handy when running a local copy of the system since loading all that data, plus storing it in memory, can make your "change cycle" for the code quite slow.

In Play 2.0, an [evolution](http://www.playframework.org/documentation/2.0.1/Evolutions) is a change in the database structure.  These are kept in files, in numerical order, so as you change your application, Play can automatically migrate the database to the correct version for the code.  It uses some comments in the sql scripts to know what to do to. At the top of the evolution file should be a comment like this:

{% highlight sql %}
# --- !Ups
{% endhighlight %}

and a corresponding `!Downs` towards the middle of the file.  The code between these two is used to upgrade the database (move the version _to_ version N) and the code after the `!Downs` marker is used to downgrade it should that be necessary (move the version _from_ version N).  For our tutorial, we only have the one evolution, to setup the database and populate it with data, and we shouldn't need to downgrade.

### UCode data

If you are interested in exploring the UCode data, you can play with it by using the `terminal` application that is included in the source code for Lesson 8 on your workstation. 

If you run the system on your local workstation, you can try accessing a URL like `/terminal/state/TN` for airports/train stations in the US state of Tennessee or `/terminal/country/FR` for those in France. 

You can also have it calculate the distance from a point to each of these terminals by providing a latitude and a longitude.

For example:

{% highlight console %}

http://localhost:9000/terminal/state/TN?loc=33.660939,-93.4552
http://localhost:9000/terminal/country/GB?loc=48.858518,2.294405

{% endhighlight%}

Both these examples show the distance of each terminal from the reference geolocation, _Paris_.
In the latter case, the result clearly shows that Belfast, airport code BHD, in Northern Ireland is 851km from Paris but Bournemouth (BOH) on the south coast of England is only 364km from Paris.

<br/>
<img src="images/screencap-terminal.png">
<br/>


### Setting up Lesson 8

<br/>
<img src="images/location-fb-setting.png">
<br/>

You'll need to go to your [application control panel](http://developers.Facebook.com/apps), select your application and then select "edit settings" to see the settings that are shown above.  You'll need to point Facebook at `/birthday/` instead of `/herokufb/` as we were using last time.  

You'll probably want to double check that your heroku configuration variables are correct also, with all your Facebook and Travelport credentials present in the settings.  Go to the `unit3` directory and verify these settings like this:

{% highlight console %}

$ heroku config

BUILDPACK_URL       => http://github.com/heroku/heroku-buildpack-scala.git
DATABASE_URL        => postgres://somedb:somename@somemachine.compute-1.amazonaws.com/somedb
FBAPPID             => YOUR_APP_ID
FBAPPNAMESPACE      => YOUR_APP_NAMESPACE
FBSECRET            => YOUR_APP_SECRET
JAVA_OPTS           => -Xmx384m -Xss512k -XX:+UseCompressedOops
PATH                => .sbt_home/bin:/usr/local/bin:/usr/bin:/bin
REPO                => /app/.sbt_home/.ivy2/cache
SBT_OPTS            => -Xmx384m -Xss512k -XX:+UseCompressedOops
SHARED_DATABASE_URL => postgres:postgres://somedb:somename@somemachine.compute-1.amazonaws.com/somedb
TPGDS               => 1G
TPPASSWORD          => YOUR_TPORT_PASSWORD
TPTARGETBRANCH      => YOUR_TPORT_BRANCH
TPUSERNAME          => YOUR_TPORT_USERNAME

{% endhighlight %}



### Lesson 8 Flow

There are three stages to the processing of the Facebook data. We'll concentrate mostly on the Travelport uAPI calls since the Facebook API is [documented elsewhere](http://developers.Facebook.com/docs/reference/api/).  

#### Getting the list of friends

Using the Facebook query `/me/friends` we can obtain of the list of friends for the current user.  (It requires authentication, of course.)

This list however, doesn't include all their details.  We have to iterate over the list of friends and request the details on each one to determine their location and birthday.  We use the Facebook query `id?fields=hometown,location,birthday` (where the id is the id of the friend) to extract these details. We'll do these in batches of 25 (see `BATCH_MAX` constant in `Lesson8.java`). 

For each one, we check the "location" and "hometown" properties returned from Facebook.   Users that do not have at least one of these two properties are discarded.  Then we process the birthday field to see if that friend's birthday is coming up in the next 90 days.  If the friend hasn't supplied a birthday, again he or she is discarded.

In the code of `Lesson8.java`, you will see two methods that perform the setup action and each iteration of "batching" the Facebook requests:

{% highlight java %}
public static Result friendInit(String uuid)
public static Result friendIter(String uuid)

{% endhighlight %}

These two methods return some json-encoded data to the caller -- in this case the javascript for the user interface that displays the progress bar and some helpful text during processing.


#### Getting the geography information

When we receive the location information about a friend (either hometown or current location), we get it in the form of an Facebook "id", not the particulars.

We have to loop over all the locations to request detailed information (particularly the latitude and longitude) from Facebook.  We simply request the information about the "id", again in batches.  This turns id 19982661 into "Lake Placid, New York" and gives us the latitude and longitude of this place.

As before, there are two methods, `geoInit()` ad `geoIter()` in the code that are used to setup and then proceed with each iteration of geography information.  Each iteration returns status information back to the caller about the state of processing.  

When we process the results of a particular batch, we augment the object holding the name of the place (the class `BirthdaySolution.FBNamedPlace`) to include the nearest airport.

You can find the code in `processNamedPlace` and `nearestAirport()` in `lesson8/Lesson8.java`.  At a high level, the approach is to first ensure that the name is in a format that is conducive to a database search.  Then find all the airports nearby that location by using the UCode data, and then to compute the distance to each candidate to find the closest.  

The first part, normalizing a name, requires the use of our geographic "knowledge" in the file `lesson8/GeoInfo`.  The function that tries to normalize the name wants to be sure that it finds the name of the state, if available, but always includes the name of the country.

If the "state" can be found, it saves processing time in the next stage because we don't end up processing all the terminals in a country, but in a smaller area, the "state".   The reader should note that although we detect the counties of England, we do not process them as "states" as we do with US states or Canadian provinces.

{% highlight java %}
public static String processNamedPlace(FBNamedPlace ht) {
    String city = "";
    String state = "";
    String country = "";
    String[] pair;

    if (GeoInfo.stateNameContainedIn(ht.name)) {
        pair = ht.name.split(",");
        if (pair.length!=2) {
            System.err.println("Can't understand name:"+ht.name);
            city ="";
            state = ht.name;
        } else {
            city = pair[0];
            state = pair[1];
        }
        ht.location.state=GeoInfo.stateAbbrevFromName(state.trim());
        country = "United States";
    } else if (GeoInfo.provinceNameContainedIn(ht.name)) {
        pair = ht.name.split(",");
        if (pair.length!=2) {
            System.err.println("Can't understand name:"+ht.name);
            city ="";
            state = ht.name;
        } else {
            city = pair[0];
            state = pair[1];
        }
        ht.location.state=GeoInfo.provinceAbbrevFromName(state.trim());
        country = "Canada";
    } else {
        pair = ht.name.split(",");
        if (pair.length==1) {
            System.err.println("Can't understand name:"+ht.name);
            country = ht.name;
        } else {
            city = pair[0];
            country = pair[pair.length-1];
            if (GeoInfo.isEnglishCounty(country.trim())) {
                country="United Kingdom";
            }
        }
    }

    ht.location.city = city;
    ht.location.country= GeoInfo.ISOCodeFromName(country.trim());
    return city+" "+state+" "+country;
}

{% endhighlight %}


In java code, the latter part of our approach needs a normalized name from above and then works out the nearest airport for it using the UCode data.  Our queries are done using the [Ebean ORM](http://www.playframework.org/documentation/2.0.1/JavaEbean) that is provided standard with Play 2.0.

{% highlight java %}

public static String nearestAirport(FBNamedPlace town) {
     if (town.location.country==null) {
         return null;
     }
	//
	// Compute an SQL query based on the fields of "town"
	//
     ExpressionList<Terminal> exp = finder.where().
             ilike("country_code", town.location.country);
     String state = town.location.state;
     if ((state!=null) && (!state.trim().equals(""))){
         exp = exp.ilike("state_code",state);
     }
     exp=exp.eq("is_significant", true).eq("st_type",1);
     List<Terminal> queryResult = exp.findList();

	 //
	 // With the results now in queryResult, we walk that to find the closest airport
	 //
     Terminal target = null;
     float winningDistance = 0.0f;
     for (int j=0; j<queryResult.size();++j) {
         Terminal terminal = queryResult.get(j);
         if (target==null) {
             //winner by default, no other candidate yet
             target = terminal;
             winningDistance=
                     SearchTerminal.distFrom(town.location.latitude.floatValue(),
                             town.location.longitude.floatValue(), 
                             terminal.latitude, terminal.longitude);
             continue;       
         }
         //
         // This distance calculation is not particularly accurate, but it is simple and fast. We
         // are very unlikely to need accuracy to the meter when considering distances to objects
         // the size of a train station or airport.
         //
         float dist = SearchTerminal.distFrom(town.location.latitude.floatValue(),
                 town.location.longitude.floatValue(), 
                 terminal.latitude, terminal.longitude);
         if (dist<winningDistance) {
             target = terminal;
             winningDistance = dist;
         } 
     }
     //
     // It's possible we couldn't find any possible terminal so show an error message or display
     // the resulting distance on the terminal (not in the browser)
     //
     if (target==null) {
         System.err.println("\tCan't figure out a terminal");
         return null;
     } else {
         System.out.println(town.name+" nearest airport is "+target.iataCode+","+target.name+" ("+
                 (winningDistance/1000.0f)+" km)");
         return target.iataCode;
     }

{% endhighlight %}

#### Getting the lowest fare

The setup for this phase is similar to the other two, we start with `priceInit()` and each iteration of generating travel itineraries is via `priceInit()`.

In terms of Travelport request processing, the application does the following key steps (starting in `priceIter()` in the java code of Lesson 8).  All of these should be familiar to readers who have read the prior lessons: 

1. Extract the nearest airport for the friend's destination (see above)
2. Construct a Low Fare Search Request between the current user's location and the friend's location (see `createLeg` in `lesson8/AirSupport.java`)
3. Submit the request to Travelport (`price()` in `lesson8/AirSupport.java`)
4. Select the first result of this search and convert it into a format more convenient for json encoding back to the browser (see the classes `Journey` and `Segment` in `lesson8/AirSupport.java`)
  
The `Journey` and `Segment` classes we have used here are simplifications of the classes found in the uAPI that just contain the information we need to show to the user in the browser.


### The product


After all the data has been processed, you'll see something like this in your web browser.

<br/>
<img src="images/screencap-birthday.png">
<br/>


In the next lesson, we'll improve on the ideas in this lesson to do something that is more interactive and fun.

### Exercises for the reader

* Improve the birthday application to also look for other hints about the person's location, not just the properties from their profile.  You can try looking to see if they have any posts on their wall that both are authored by the friend and include a location.  

* The UCode database knows about "states" for other countries.  Using an SQL query, determine what other countries have "states" according to UCode and add processing for these countries as well.  All of this processing in Lesson 8 is handled in `GeoInfo.java`

[< Return to Unit 3, Lesson 7](lesson_3-7.html) | [Proceed to Unit 3, Lesson 9 >](lesson_3-9.html)

[Table of Contents](index.html)
<hr>

{% include JB/comments %}

{% include JB/analytics %}

