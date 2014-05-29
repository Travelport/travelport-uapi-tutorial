package controllers.lesson8;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import models.Terminal;

import org.json.JSONException;

import play.Play;
import play.cache.Cache;
import play.db.ebean.Model;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.ExpressionList;
import com.restfb.*;
import com.restfb.batch.BatchRequest;
import com.restfb.batch.BatchRequest.BatchRequestBuilder;
import com.restfb.batch.BatchResponse;
import com.restfb.exception.FacebookNetworkException;
import com.restfb.types.User;
import com.travelport.schema.air_v18_0.AirPricingSolution;
import com.travelport.service.air_v18_0.AirFaultMessage;

import controllers.lesson7.FBSecurity;
import controllers.lesson8.BirthdaySolution.FBNamedPlace;

public class Lesson8 extends Controller{
    public static class TerminalDist {
        public Terminal terminal;
        public float dist;
    }
    
    /**
     * This controls the size of a "batch" of operations sent to FB.  Bigger
     * numbers give better performance, lower numbers give better end-user
     * behavior as the progress bar updates more frequently.
     */
    public static final int BATCH_MAX = 25;
    /**
     * Called to start the proceedings with a "user visible" token number.
     * This is to prevent leaking OAUTH tokens outside the server.  Not that
     * this is too terrible, but still it's better to be careful.
     * 
     * When called, this generates a page that has the progress bar on it
     * and starts the progress bar going.
     * 
     * @param uuid the number of the index into the session
     * @return
     */
    public static Result start(String uuid) {

        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        String accessToken = soln.authToken;

        System.out.println("Play path is "+Play.application().path());
        
        if ((accessToken==null) || (accessToken.length()==0)) {
            return internalServerError("Could not find oauth token!");
        }

        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
        User me = facebookClient.fetchObject("me", User.class);
        System.out.println("me is "+ me.getLocale() +" ,"+
                me.getLocation().getName()+","+me.getLocation().getId());
        String originId = getIdForLocationOrHometown(me);
        if (originId==null) {
            return ok(views.html.l8.nohometown.render(me.getId()));
        }
        soln.origin = facebookClient.fetchObject(originId, 
                FBNamedPlace.class);
        processNamedPlace(soln.origin);
        soln.originAirport = nearestAirport(soln.origin);
        if ((soln.origin==null) || (soln.originAirport==null)) {
            return ok(views.html.l8.nohometown.render(me.getId()));
        }
        System.out.println("Origin:"+soln.origin.name);
        return(ok(views.html.l8.birthdaytravel.render(uuid)));
    } 

    public static String getIdForLocationOrHometown(User u) {
        if (u.getLocation()==null) {
            //fall back to hometown
            if (u.getHometown()==null) {
                return null;
            }
            return u.getHometown().getId();
        }
        return u.getLocation().getId();
        
    }

    /**
     * Called to initialize datastructures and tell the client side how
     * many friends we have.
     * 
     * @param uuid our unique id
     * @return json payload
     */
    public static Result friendInit(String uuid) {
        try {
            BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
            String accessToken = soln.authToken;

            FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
            Connection<User> friendConn = facebookClient.fetchConnection("me/friends", 
                    User.class);
            List<User> friends = friendConn.getData();
            /*if (friends.size()>20) {
                List<User> f = new ArrayList<User>();
                for (int i=0; i<20; ++i) {
                    f.add(friends.get(i));
                }
                friends = f;
            }
            System.out.println("ADJUSTED SIZE "+friends.size());*/
            soln.friends = friends;
            soln.friendIter = 0;
            return ok(toJsonResult(soln.friends.size(), "", null));
        } catch (FacebookNetworkException e ) {
            System.err.println("Facebook exception!"+e.getMessage());
            if (e.getMessage()==null) {
                System.err.println("Are you sure you are connected to the network?");
            }
            System.err.println("Sometimes this means your OAuth token has expired!");
            return(internalServerError("FacebookException: "+e.getMessage()));
        }
    }

    /**
     * Process another friend until we find one with a hometown plus
     * birthday, then return the number of friends remaining to be
     * processed.
     */

    public static Result friendIter(String uuid) throws ParseException{
        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        String accessToken = soln.authToken;

        if ((accessToken==null) || (accessToken.length()==0)) {
            return internalServerError("Could not find oauth token!");
        }

        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
        if (soln.friends==null) {
            return ok(toJsonResult(0, "", null));
        }
        //
        // BATCH OF REQUESTS
        //
        int batchSize = 0;
        int batchPointer = soln.friendIter;
        List<BatchRequest> batch = new ArrayList<BatchRequest>();
        do {
            User old = soln.friends.get(batchPointer);
            batchSize++;
            batchPointer++;
            batch.add(createBatchRequestForFriendData(old.getId()));
        } while ((batchSize<BATCH_MAX) && (batchPointer <soln.friends.size()));

        //
        //SEND TO FB
        //
        List<BatchResponse> batchResponses =
                facebookClient.executeBatch(batch, new ArrayList<BinaryAttachment>());

        //
        //WALK THE RESULTS
        //
        JsonMapper jsonMapper = new DefaultJsonMapper();
        String fullName = "";

        for (Iterator<BatchResponse> batchIter = batchResponses.iterator(); batchIter.hasNext();) {
            BatchResponse response = (BatchResponse) batchIter.next();
            //network connectivity and such is ok?
            if ((response!=null) && (response.getCode()==200)) {
                User friend = jsonMapper.toJavaObject(response.getBody(), User.class);
                //enough data for us to process?
                String destId = getIdForLocationOrHometown(friend);
                if ((destId!=null) && (destId!=soln.origin.id) && (friend.getBirthday()!=null)) {
                    Date d = isBirthdayInNextNMonths(3, friend.getBirthday(), 
                            friend.getBirthdayAsDate());
                    if (d!=null) {
                        soln.hits.add(friend);
                        soln.birthdayDate.add(d);
                        fullName = friend.getFirstName() + " " + friend.getLastName() + 
                                " ( " + niceFormat.format(d) + " )";
                    }
                } else {
                    //System.err.println("Not enough data for friend "+friend.getName());
                }
            } else {
                if (response==null) {
                    System.err.println("Error reading response data! Nothing received!");
                } else{
                    System.err.println("error retreiving value from FB!"+response.getCode());
                }
            }
            //update counter in case we need it for future requests
            soln.friendIter++;
        }

        //are we done?
        if (soln.friendIter==soln.friends.size()) {
            //System.out.println("Processed all friends...");
            soln.friends=null;
            return ok(toJsonResult(0, "", null));
        } 

        return ok(toJsonResult(soln.friends.size()-soln.friendIter, fullName, null));
    }

    /**
     * Simple check to see if this birthday is next N months.  The date
     * version may be null if the person did not specify a year.
     * @param n  number of months
     * @param birthdayText the birthday as a string (might be 11/11 without year)
     * @param bday the date version if available
     * @return null if the birthday is not in next N months, otherwase return
     * the date representing the birthday
     */
    public static Date isBirthdayInNextNMonths(int n, String birthdayText, Date bday)
            throws ParseException{
        Date now = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(now);

        Calendar bdayCal = GregorianCalendar.getInstance();

        //if no birthday, then they have put in 05/19 but no year, so add it
        if (bday==null) {
            String year = ""+calendar.get(Calendar.YEAR);
            bday = mmdd.parse(birthdayText+"/"+year);
        } else {
            bdayCal.setTime(bday);
            bdayCal.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
            bday = bdayCal.getTime();
        }
        //no matter what, bday is now set to *this* year's birthday...
        //is that in the past? if so, add a year
        if (now.after(bday)) {
            bdayCal.add(Calendar.YEAR, 1);
            bday = bdayCal.getTime();
        }

        //n months is the cutoff
        calendar.add(Calendar.MONTH, n);
        Date inFuture = calendar.getTime();
        if ((now.before(bday)) && (inFuture.after(bday))) {
            return bday;
        }
        return null;

    }

    public static SimpleDateFormat mmdd = new SimpleDateFormat("MM/dd/yyyy");
    public static SimpleDateFormat niceFormat = new SimpleDateFormat("EEEE MMMM dd");


    /**
     * Create a single request for geography info, but as a batch request.
     * @param fbid the id of the town (in facebook terms)
     * @return the batch request
     */
    public static BatchRequest createBatchRequestForLocation(String fbid) {
        return new BatchRequestBuilder(fbid).build();
    }

    /**
     * Convenience routing for creating a batch request for friend data.
     * 
     * @param fbid  the friend's id
     * @return the batch request
     */
    public static BatchRequest createBatchRequestForFriendData(String fbid) {
        return new BatchRequestBuilder(fbid).method("GET").
                body(Parameter.with("fields", "id, first_name, last_name, birthday, location, hometown")).build();
    }

    /**
     * Return a simple json bundle to the client.
     * 
     * @param numRemaining number of items remaining to be processed
     * @param textHint the text to show the user
     * @return the fully formed json string
     */
    public static String toJsonResult(int numRemaining, String textHint, String url) {
        return "{ \"result\": { \"remaining\": "+numRemaining+
                ", \"updateString\": \""+textHint+"\" "+
                ", \"url\": \""+url+"\" "+
                "} } ";
    }
    /**
     * Utility for computing a uuid for this session or retrieving the
     * existing one.
     * @return
     */
    public static String getSessionId() {
        String uuid = session("uuid");
        if(uuid==null) {
            uuid=java.util.UUID.randomUUID().toString();
            session("uuid", uuid);
        }
        return uuid;
    }

    /**
     * Called to start the geography searching.  We need to tell the client
     * side how many items we are going to check.
     * 
     * @param uuid
     * @return json result
     */
    public static Result geoInit(String uuid) {
        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        soln.geoIter=0;
        return ok(toJsonResult(soln.hits.size(), "", null));
    }
    /**
     * Called to load a particular set of geo items in a bundle.
     * 
     * @param uuid
     * @return
     */
    public static Result geoIter(String uuid) {
        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        String accessToken = soln.authToken;

        if ((accessToken==null) || (accessToken.length()==0)) {
            return internalServerError("Could not find oauth token!");
        }

        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
        List<BatchRequest> batch = new ArrayList<BatchRequest>();

        int batchPointer = soln.geoIter;
        int batchCount = 0;
        do {

            User u = soln.hits.get(batchPointer);
            batch.add(createBatchRequestForLocation(getIdForLocationOrHometown(u)));

            batchCount++;
            batchPointer++;
        } while ((batchCount < BATCH_MAX) && (batchPointer< soln.hits.size()));


        //SEND TO FB
        List<BatchResponse> batchResponses =
                facebookClient.executeBatch(batch, new ArrayList<BinaryAttachment>());


        //reset pointer for evaluation
        batchPointer = soln.geoIter;
        //
        //WALK THE RESULTS
        //
        String textHint = "";

        for (Iterator<BatchResponse> respIter = batchResponses.iterator(); respIter.hasNext();) {
            BatchResponse resp = (BatchResponse) respIter.next();

            if (resp.getCode()!=200) {
                System.err.println("Error processing FB response to geography request!");
            } else {
                JsonMapper mapper = new DefaultJsonMapper();
                BirthdaySolution.FBNamedPlace ht = mapper.toJavaObject(resp.getBody(), 
                        BirthdaySolution.FBNamedPlace.class);
                if (!ht.category.equals("City")) {
                    System.err.println("Found a hometown that's not a city...?"+ht.category);
                } else {
                    textHint = processNamedPlace(ht);
                    ht.location.nearestAirport = nearestAirport(ht);
                    soln.hometown.add(ht);
                }
            }
            ++batchPointer;
        }
        //update the counter in case we need it for another round
        soln.geoIter = batchPointer;

        return ok(toJsonResult(soln.hits.size()-soln.geoIter, textHint, null));

    }

    /**
     * This method is called by Facebook to tell us that somebody is hitting
     * our application.
     * 
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws JSONException
     * @throws IOException
     */
    @BodyParser.Of(value = BodyParser.FormUrlEncoded.class, maxLength = 32 * 1024)
    public static Result postFromFB() throws NoSuchAlgorithmException, InvalidKeyException, JSONException, IOException {
        Object raw = FBSecurity.DecodePostFromFB(request());

        if (raw == null) {
            return internalServerError("Unable to understand FB security!");
        }

        if (raw instanceof Result) {
            return ((Result)raw);
        }

        if (!(raw instanceof String)) {
            return internalServerError("Unable to understand FB security! Weird type");
        }

        String oauthToken = (String) raw;

        String sessionId = Lesson8.getSessionId();
        Cache.set(sessionId, new BirthdaySolution(oauthToken.trim()));

        //redirirt through the routes
        return redirect(controllers.lesson8.routes.Lesson8.start(sessionId));

    }
    public static Model.Finder<Long, Terminal> finder = 
            new Model.Finder<Long, Terminal>(Long.class, Terminal.class);

    /**
     * Prepare to compute the prices via Tport.
     * @param uuid
     * @return
     */
    public static Result priceInit(String uuid) {
        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        soln.priceIter=0;
        soln.price=new ArrayList<AirPricingSolution>();
        return ok(toJsonResult(soln.hits.size(), "", null));
    }

    static class Rez {
        @Facebook
        public String page_id;

        @Facebook
        public String name;

        @Facebook
        public BirthdaySolution.FBLocation location;

        @Facebook
        List<String> categories;

    }

    public static Result priceIter(String uuid) {
        BirthdaySolution soln = (BirthdaySolution)Cache.get(uuid);
        User friend = soln.hits.get(soln.priceIter);
        Date bday = soln.birthdayDate.get(soln.priceIter);
        BirthdaySolution.FBNamedPlace dest = soln.hometown.get(soln.priceIter);
        Date when = soln.birthdayDate.get(soln.priceIter);
        String textHint, price="";
        String destAirport = dest.location.nearestAirport;
        String origAirport = soln.originAirport;
        String friendName = friend.getFirstName()+" "+friend.getLastName();
        String imageURL = dest.picture;
        String resultJson = "\"\"";
             
        try {
            if ((destAirport==null) || (origAirport==null) || (destAirport.trim().length()!=3) ||
                    (origAirport.trim().length()!=3)) {
                textHint = "Problem with "+friendName+" can't figure out airport for:"+
                    dest.name;
                destAirport = "";
                origAirport = "";
                imageURL="";
            } else {    
                AirSupport.Journey j = AirSupport.price(destAirport.trim(), origAirport.trim(),  when);
                textHint = soln.originAirport+"->"+dest.location.nearestAirport+
                    " "+price + "("+friendName+")";
                price =j.price;
                resultJson=j.toJson();
            }
        } catch (AirFaultMessage e) {
            textHint = "Error!";
            System.err.println("error in pricing request:"+e.getMessage());
        }
        soln.priceIter++;
        int numRemaining = soln.hits.size()-soln.priceIter;
         
        String json= "{ \"result\": { \"remaining\": "+numRemaining+
                ", \"updateString\": \""+textHint+"\" "+
                ", \"image\": \""+imageURL+"\" "+
                ", \"price\": \""+price+"\" "+
                ", \"friend\": \""+friendName+"\" "+
                ", \"friendid\": \""+friend.getId()+"\" "+
                ", \"orig\": \""+origAirport+"\" "+
                ", \"dest\": \""+destAirport+"\" "+
                ", \"journey\":"+resultJson +
                ", \"town\": \""+dest.name+"\" "+
                ", \"townid\": \""+dest.id+"\" "+
                ", \"birthday\": \""+niceFormat.format(bday)+"\" "+
                "} } ";

        return ok(json);
    }


    //This uses the ucode database to determine the nearest airport given 
    //an already processed FBNamedPlace.  The result is null if we cannot
    //determinate a nearby airport, often because there was no country
    //provided in the FBNamedPlace.
    public static String nearestAirport(FBNamedPlace town) {
        if (town.location.country==null) {
            return null;
        }
        ExpressionList<Terminal> exp = finder.where().
                ilike("country_code", town.location.country);
        String state = town.location.state;
        if ((state!=null) && (!state.trim().equals(""))){
            exp = exp.ilike("state_code",state);
        }
        exp=exp.eq("is_significant", true).eq("st_type",1);

        List<TerminalDist> t = nearestTerminal(town, exp, 1);
        if (t.isEmpty()) {
            System.out.println("Could not figure out nearest airport for "+town.name);
            return null;
        } 
        String iata = t.get(0).terminal.iataCode;
        System.out.println("Nearest airport for "+town.name+" is "+iata);
        return iata;
    }
    
    public static List<TerminalDist> nearestTerminal(FBNamedPlace town, ExpressionList<Terminal> exp, int max ) {
        List<TerminalDist> finalResult = new ArrayList<TerminalDist>();
        List<Terminal> queryResult = exp.findList();
        
        for (int j=0; j<queryResult.size();++j) {
            Terminal candidate = queryResult.get(j);
            TerminalDist pair = new TerminalDist();
            pair.terminal = candidate;
            if ((pair.terminal.latitude==0.0f) && (pair.terminal.longitude==0.0f)){
                continue;
            }
            pair.dist = SearchTerminal.distFrom(town.location.latitude.floatValue(),
                    town.location.longitude.floatValue(), 
                    candidate.latitude, candidate.longitude);
            int before = -991;
            for (int i=0; i<finalResult.size();++i) {
                TerminalDist possibleSuccessor = finalResult.get(i);
                if (pair.dist <  possibleSuccessor.dist) {
                    before = i;
                    break;
                }
            }
            if (before==-991) {
                finalResult.add(pair);
            } else {
                finalResult.add(before, pair);
            }
            if (finalResult.size()>max) {
                finalResult.remove(max);
            }
        }
        return finalResult;
    }

    //This function normalizes a FBNamedPlace into standard country
    //and state codes (for the US).  This allows us to do database
    //searches in a sensible way.  It returns a human-readable name
    //if it can find one.
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
}

