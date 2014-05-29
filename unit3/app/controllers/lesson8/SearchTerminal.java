package controllers.lesson8;

import java.util.List;

import models.Terminal;
import play.Logger;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.ExpressionList;

public class SearchTerminal extends Controller {

    protected static Model.Finder<Long, Terminal> finder = 
            new Model.Finder<Long, Terminal>(Long.class, Terminal.class);
  
    public static Result searchCountry(String country, String loc) {
        return search(null,country,loc);
    }
    
    public static Result search(String state, String country, String loc) {
        Logger.info("loc is "+loc);
        ExpressionList<Terminal> exp = finder.where().ilike("country_code", country);
        if (state!=null) {
            exp = exp.ilike("state_code",state);
        }
        
        List<Terminal> queryResult = exp.
                eq("is_significant", true).
                orderBy("name").findList();
        
        if (loc!=null) {
            String[] pair = loc.split(",", 2);
            if (pair.length==2) {
                try {
                    float lat = Float.parseFloat(pair[0]);
                    float lon = Float.parseFloat(pair[1]);
                    Logger.info("rending template with distances");
                    return(ok(views.html.l8.terminal.render(queryResult,Boolean.TRUE,
                            Float.valueOf(lat),Float.valueOf(lon))));

                } catch (NumberFormatException e) {
                    Logger.error("Ignoring lat/long because of format exception! "+e.getMessage());
                }
            }
        }
        return(ok(views.html.l8.terminal.render(queryResult,Boolean.FALSE,
                Float.valueOf(0.0f),Float.valueOf(0.0f))));
    }
    
    //courtesy of Stackoverflow, questions/837872
    public static float distFrom(float lat1, float lng1, float lat2, float lng2) {
        double earthRadius = 3958.75;
        double dLat = Math.toRadians(lat2-lat1);
        double dLng = Math.toRadians(lng2-lng1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;

        int meterConversion = 1609;

        return new Float(dist * meterConversion).floatValue();
        }
}
