package controllers.lesson8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.restfb.Facebook;
import com.restfb.types.User;
import com.travelport.schema.air_v18_0.AirPricingSolution;
import com.travelport.service.air_v18_0.AirLowFareSearchPortType;

/**
 * This class holds the information we are building about each solution 
 * 
 * @author iansmith
 *
 */
public class BirthdaySolution {

    public String authToken;
    
    public BirthdaySolution(String authToken) {
        this.authToken = authToken;
    }
    
    //the origin hometown (of the running user)
    public FBNamedPlace origin;
    
    public String originAirport;
    
    //list of users who have the neeeded data plus have a birthday coming
    //up in the next three months
    public List<User> hits = new ArrayList<User>();;
    
    //parallel list of hometimes to hits 
    public List<FBNamedPlace> hometown = new ArrayList<FBNamedPlace>();

    //parallel list of birthday dates to hits 
    public List<Date> birthdayDate = new ArrayList<Date>();

    //pricing solutions
    public List<AirPricingSolution> price;
    
    //raw friend list
    public List<User> friends;
    
    //during the friend iterations, this is the current iter
    public int friendIter;

    //durig geo iteration, this is the current iter
    public int geoIter;
    
    //during price iteration, this is current iter
    public int priceIter;
    
    /**
     * Support class for getting the location.
     * 
     * @author iansmith
     *
     */
    public static class FBLocation {
        @Facebook
        public String state;
        
        @Facebook
        public String country;
        
        @Facebook
        public String city;
        
        @Facebook
        public Double latitude;
        
        @Facebook
        public Double longitude;
        
        public String nearestAirport;
        
        public FBLocation() {
            
        }
        
        public String toString() {
            StringBuilder b = new StringBuilder('['+city+","+country);
            if (state!=null) {
                b.append(","+state);
            }
            b.append(":"+latitude+","+longitude+"]");
            return b.toString();
        }
    }
    
    /**
     * Support class for getting the hometown/location.
     * @author iansmith
     *
     */
    public static class FBNamedPlace {
        @Facebook
        public String category;
        
        @Facebook
        public String name;
        
        @Facebook
        public String picture;
        
        @Facebook
        public FBLocation location;
        
        @Facebook
        public String id;
        
        public FBNamedPlace() {
            
        }
        
        public String toString() {
            return name+"->"+location.toString();
        }
    }
}

