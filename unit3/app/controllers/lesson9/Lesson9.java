package controllers.lesson9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Terminal;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.ExpressionList;
import com.travelport.service.air_v18_0.AirFaultMessage;

import controllers.lesson8.*;
import controllers.lesson8.BirthdaySolution.FBNamedPlace;
import controllers.lesson8.Lesson8.TerminalDist;

public class Lesson9 extends Controller{
    protected static Model.Finder<Long, Terminal> finder = 
            new Model.Finder<Long, Terminal>(Long.class, Terminal.class);
    public static final int MAX_ITIN=5;
    
    public static Result start() {
	String fbAppId = System.getenv("FBAPPID");
	String fbSecret = System.getenv("FBSECRET");
	String googMaps = System.getenv("GOOGMAPSKEY");
	String fbChannel = System.getenv("FBCHANNEL");

	if (
	   (fbAppId==null) || (fbAppId.equals("")) ||
	   (fbSecret==null) || (fbSecret.equals("")) ||
	   (fbChannel==null) || (fbChannel.equals("")) ||
	   (googMaps==null) || (googMaps.equals(""))
	) {
		return ok("One of FBAPPID, FBSECRET, FBCHANNEL, or GOOGMAPSKEY is not set");
	}
        return(ok(views.html.l9.fbpage.render(fbAppId, fbSecret, fbChannel, googMaps)));
    } 
    static SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    
    public static Result nearestTerminal(String name, String lat, String lon) {
        FBNamedPlace place = new BirthdaySolution.FBNamedPlace();
        place.location=new BirthdaySolution.FBLocation();
        place.location.latitude=Double.parseDouble(lat);
        place.location.longitude=Double.parseDouble(lon);
        place.name = name;
        Lesson8.processNamedPlace(place);
        
        ExpressionList<Terminal> exp = 
                finder.where().ilike("country_code", place.location.country).
                eq("st_type", new Integer(1));
             
        if (place.location.state!=null) {
            exp = exp.ilike("state_code",place.location.state);
        }
        
        List<TerminalDist> nearestAirport = Lesson8.nearestTerminal(place, exp, 3);
        List<TerminalDist> nearestMajorAirport = Lesson8.nearestTerminal(place, 
                exp.eq("is_significant", Boolean.TRUE), 3);

        List<TerminalDist> death = new ArrayList<TerminalDist>();
        for (TerminalDist t: nearestAirport) {
            for (TerminalDist b: nearestMajorAirport) {
                if (t.terminal.id == b.terminal.id) {
                    death.add(t);
                }
            }
        }
        for (TerminalDist t: death) {
            nearestAirport.remove(t);
        }
        
        exp = finder.where().ilike("country_code", place.location.country).
        eq("st_type", new Integer(2)).istartsWith("city", place.location.city.trim());
        if (place.location.state!=null) {
            exp = exp.ilike("state_code",place.location.state);
        }
        
        List<TerminalDist> nearestTrain = Lesson8.nearestTerminal(place, exp, 5);

        if (nearestTrain.isEmpty()) {
            exp = finder.where().ilike("country_code", place.location.country).
                    eq("st_type", new Integer(2)).istartsWith("name", place.location.city.trim());
            if (place.location.state!=null) {
                exp = exp.ilike("state_code",place.location.state);
            }
            nearestTrain = Lesson8.nearestTerminal(place, exp, 5);
        }

        if (nearestTrain.isEmpty()) {
            exp = finder.where().ilike("country_code", place.location.country).
                    eq("st_type", new Integer(2)).ilike("name", "%"+place.location.city.trim()+"%");
            if (place.location.state!=null) {
                exp = exp.ilike("state_code",place.location.state);
            }
            nearestTrain = Lesson8.nearestTerminal(place, exp, 5);
        }
        if ((nearestTrain.isEmpty()) && (place.location.state!=null)) {
            exp = finder.where().ilike("country_code", place.location.country).
                    eq("st_type", new Integer(2)).ilike("state_code",place.location.state);
            nearestTrain = Lesson8.nearestTerminal(place, exp, 5);
        }

        StringBuilder b = new StringBuilder();
        b.append("[");
        for (TerminalDist t: nearestAirport) {
            if (b.length()>1) {
                b.append(", ");
            }
            b.append(jsonForTerminalDist(t));
        }
        for (TerminalDist t: nearestMajorAirport) {
            if (b.length()>1) {
                b.append(", ");
            }
            b.append(jsonForTerminalDist(t));
        }
        for (TerminalDist t: nearestTrain) {
            if (b.length()>1) {
                b.append(", ");
            }
            b.append(jsonForTerminalDist(t));
        }
        b.append("]");
        
        //System.out.println(b.toString());
        return ok(b.toString());
    }
    
    public static Result go(String outbound,String ret,
            String originName, String originLat, String originLon,
            String destName, String destLat, String destLon,
            String flexDatesRaw) {
        System.out.println("outbound:"+outbound);
        System.out.println("return:"+ret);
        System.out.println("origin:"+originLat+","+originLon);
        System.out.println("originName:"+originName);
        System.out.println("dest:"+destLat+","+destLon);
        System.out.println("destName:"+destName);
        System.out.println("flexDates:"+flexDatesRaw);
        
        FBNamedPlace orig = new BirthdaySolution.FBNamedPlace();
        orig.location = new BirthdaySolution.FBLocation();
        orig.location.latitude=Double.parseDouble(originLat);    
        orig.location.longitude=Double.parseDouble(originLon);  
        orig.name=originName;

        FBNamedPlace dest = new BirthdaySolution.FBNamedPlace();
        dest.location = new BirthdaySolution.FBLocation();
        dest.location.latitude=Double.parseDouble(destLat);    
        dest.location.longitude=Double.parseDouble(destLon);  
        dest.name=destName;
        
        if (Lesson8.processNamedPlace(dest)==null) {
            return(badRequest(genErrorJSON("Can't understand destination "+destName)));
        }
        if (Lesson8.processNamedPlace(orig)==null) {
            return(badRequest(genErrorJSON("Can't understand origin "+originName)));
        }
        boolean flexDates = false;
        if (flexDatesRaw.toLowerCase().trim().equals("true")) {
            flexDates=true;
        }
        
        int numAirports = 3;
        if (flexDates) {
            numAirports = 1;
        }
        
        //try multiple airports for orig
        ExpressionList<Terminal> exp = 
                finder.where().ilike("country_code", orig.location.country).
                eq("st_type", new Integer(1)).eq("is_metro",Boolean.FALSE);
        List<TerminalDist> nearestMajorAirportOrig = Lesson8.nearestTerminal(orig, 
                exp.eq("is_significant", Boolean.TRUE), numAirports);

        if ((nearestMajorAirportOrig==null) || (nearestMajorAirportOrig.size()==0)) {
            return(badRequest(genErrorJSON("Can't find major airport for origin "+originName)));
        }
        List<String> origAirport = new ArrayList<String>();
        for (TerminalDist t : nearestMajorAirportOrig) {
            origAirport.add(t.terminal.iataCode);
        }
        
        //multiple airports on dest
        exp = finder.where().ilike("country_code", dest.location.country).
                eq("st_type", new Integer(1)).eq("is_metro",Boolean.FALSE);
        List<TerminalDist> nearestMajorAirportDest = Lesson8.nearestTerminal(dest, 
                exp.eq("is_significant", Boolean.TRUE), numAirports);
        if ((nearestMajorAirportDest==null) || (nearestMajorAirportDest.size()==0)) {
            return(badRequest(genErrorJSON("Can't find major airport for dest "+destName)));
        }
        List<String> destAirport = new ArrayList<String>();
        for (TerminalDist t : nearestMajorAirportDest) {
            destAirport.add(t.terminal.iataCode);
        }
        Date out =null;
        Date in = null;
        try {
            out = fmt.parse(outbound);
            in = fmt.parse(ret);
            System.out.println("Outbound to "+destAirport+" on "+out);
            System.out.println("Return to   "+origAirport+" on "+in);
        } catch (ParseException e) {
            System.err.println("Unable to parse date correctly:"+e.getMessage());
        }
        //price based on airports
        List<AirSupport.Journey> j;
        try {
            j = AirSupport.price(destAirport, origAirport, 
                    dest.name, orig.name,in, out, 0, MAX_ITIN, flexDates);
        } catch (AirFaultMessage e) {
            System.err.println("TPORT ERROR:"+e.getMessage());
            return internalServerError("{ \"error\" : \""+e.getMessage() +"\"}");
        }
        System.out.println("PRICED: "+j.size()+" with flexDates:"+flexDates);
        /*
        it's likely the lowest price airports are where we should explore
        so we'll use those for this second query
        List<String> secondOrigin = new ArrayList<String>();
        List<String> secondDest = new ArrayList<String>();
        
        secondOrigin.add(j.get(0).seg[0].origin);
        secondDest.add(j.get(0).seg[j.get(0).lastOut].dest);
        System.out.println("should do flex date query on "+secondOrigin+"->"+secondDest);
        
        //now we need to run again with flexible dates
        List<AirSupport.Journey> k;
        try {
            k = AirSupport.price(secondDest, secondOrigin, 
                    dest.name, orig.name,in, out, 0, MAX_ITIN, true);
        } catch (AirFaultMessage e) {
            return internalServerError("{ \"error\" : \""+e.getMessage() +"\"");
        }
        
        kloop:for (AirSupport.Journey someK: k) {
            int currentPriceK = Integer.parseInt(someK.price);
            for (int count =0; count<j.size();++count) {
                AirSupport.Journey someJ = j.get(count);
                int currentPriceJ = Integer.parseInt(someJ.price);
                if (currentPriceK<currentPriceJ) {
                    System.out.println("found flex date winner!--------");
                    System.out.println(someK.toJson());
                    j.add(count,someK);
                    continue kloop;
                }
            }
        }
        //get back down to size
        while (j.size()>MAX_ITIN) {
            System.out.println("Cutting final list down from "+j.size());
            j.remove(j.size()-1);
        }
        */
        //get coords for map
        for (int i=0; i<j.size();i++) {
            addCoordinatesForJourney(j.get(i));
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i=0; i<j.size();++i) {
            String blob = j.get(i).toJson();
            if (i>0) {
                builder.append(", ");
            }
            builder.append(blob);
        }
        builder.append("]");
        return ok(builder.toString());
    }
    
    public static void addCoordinatesForJourney(AirSupport.Journey journey) {
        for (int s=0; s<journey.seg.length;s++) {
            ExpressionList<Terminal> exp = Lesson8.finder.where().ieq("iata_code", journey.seg[s].origin);
            Terminal queryResult = exp.findUnique();   
            if (queryResult==null) {
                System.err.println("Can't find location for origin:"+journey.seg[s].origin);
            } else {
                journey.seg[s].originLat=queryResult.latitude;    
                journey.seg[s].originLon=queryResult.longitude;    
            }
            exp = Lesson8.finder.where().ieq("iata_code", journey.seg[s].dest);
            queryResult = exp.findUnique();
            if (queryResult==null) {
                System.err.println("Can't find location for dest:"+journey.seg[s].dest);
            } else {
                journey.seg[s].destLat=queryResult.latitude;    
                journey.seg[s].destLon=queryResult.longitude;  
            }
       }
    }
    public static String jsonForTerminalDist(TerminalDist t) {
        return "{ \"distance\": " + (t.dist/1000.0f) + 
                ", \"name\": \"" + t.terminal.name + "\" " + 
                ", \"iata_code\": \"" + t.terminal.iataCode + "\" " +
                ", \"ucode\": \"" + t.terminal.ucode + "\" " + 
                ", \"city\": \"" + t.terminal.city + "\" "+
                ", \"country\": \"" + t.terminal.country + "\" "+
                ", \"state\": \"" + t.terminal.stateCode + "\" "+
                ", \"type\": " + t.terminal.stType + " " +
                ", \"significant\": \"" + t.terminal.significant + "\" " +
                ", \"lon\": " + t.terminal.longitude + " "+
                ", \"lat\": " + t.terminal.latitude + " "+
                " }";

    }
    
    public static String genErrorJSON(String msg) {
        return "{ \"error\": \""+msg+"\"}";
    }
}
