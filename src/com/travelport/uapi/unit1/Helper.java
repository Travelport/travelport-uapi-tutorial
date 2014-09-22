package com.travelport.uapi.unit1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.travelport.schema.air_v29_0.*;
import com.travelport.schema.common_v29_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v29_0.VendorLocation;
import com.travelport.schema.hotel_v29_0.HotelSearchResult;
import com.travelport.schema.rail_v29_0.RailJourney;
import com.travelport.schema.rail_v29_0.RailJourneyRef;
import com.travelport.schema.rail_v29_0.RailSegment;
import com.travelport.schema.universal_v29_0.SavedTripActivity.VendorLocationRef;

public class Helper {
    /**
     * Utility class for building a map that knows about all the segments in the
     * response.
     */
    public static class AirSegmentMap extends HashMap<String, TypeBaseAirSegment> {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void add(TypeBaseAirSegment segment) {
            put(segment.getKey(), segment);
        }

        @Override
        public TypeBaseAirSegment get(Object wontWork) {
            throw new RuntimeException("This is disallowed because it was a " + "common mistake to pass a AirSegmentRef here instead "
                    + "of the string contained in the AirSegmentRef");
        }

        public TypeBaseAirSegment getByRef(AirSegmentRef ref) {
            return super.get(ref.getKey());
        }
    }

    /**
     * Utility class for building a map that knows all the flight details
     * objects and can look them up by their key.
     */
    public static class FlightDetailsMap extends HashMap<String, FlightDetails> {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void add(FlightDetails detail) {
            put(detail.getKey(), detail);
        }

        @Override
        public FlightDetails get(Object wontWork) {
            throw new RuntimeException("This is disallowed because it was a " + "common mistake to pass a FlightSegmentRef here instead "
                    + "of the string contained in the FlightSegmentRef");
        }

        public FlightDetails getByRef(FlightDetailsRef ref) {
            return super.get(ref.getKey());
        }

    }

    // this is the format we SEND to travelport
    public static SimpleDateFormat searchFormat = new SimpleDateFormat("yyyy-MM-dd");

    // return a date that is n days in future
    public static String daysInFuture(int n) {
        Date now = new Date(), future;
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DATE, n);
        future = calendar.getTime();
        return searchFormat.format(future);
    }

    /**
     * Build the map from references to flight details to to real flight
     * details.
     */
    public static FlightDetailsMap createFlightDetailsMap(List<FlightDetails> details) {
        FlightDetailsMap result = new FlightDetailsMap();
        for (Iterator<FlightDetails> iterator = details.iterator(); iterator.hasNext();) {
            FlightDetails deet = (FlightDetails) iterator.next();
            result.add(deet);
        }
        return result;
    }

    /**
     * Take a air segment list and construct a map of all the segments into a
     * segment map. This makes other parts of the work easier.
     */
    public static AirSegmentMap createAirSegmentMap(List<TypeBaseAirSegment> segments) {
        // construct a map with all the segments and their keys
        AirSegmentMap segmentMap = new AirSegmentMap();

        for (Iterator<TypeBaseAirSegment> iterator = segments.iterator(); iterator.hasNext();) {
        	TypeBaseAirSegment airSegment = (TypeBaseAirSegment) iterator.next();
            segmentMap.add(airSegment);
        }

        return segmentMap;
    }

    public static final String RAIL_PROVIDER = "RCH";
    public static final String LOW_COST_PROVIDER = "ACH";

    /**
     * Convenience class for keeping a mapping from id to rail journey.
     * 
     * @author iansmith
     * 
     */
    public static class RailJourneyMap extends HashMap<String, RailJourney> {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void add(RailJourney j) {
            put(j.getKey(), j);
        }

        @Override
        public RailJourney get(Object wontWork) {
            throw new RuntimeException("This is disallowed because it was a " + "common mistake to pass a RailJourneyRef here instead "
                    + "of the string contained in the RailJourneyRef");
        }

        public RailJourney getByRef(RailJourneyRef ref) {
            return super.get(ref.getKey());
        }

    }

    /**
     * Take a list of rail journeys and put them all into a map.
     * 
     * @param r
     *            list of rail journeys
     * @return the built map from keys to rail segments
     */
    public static RailJourneyMap createRailJourneyMap(List<RailJourney> r) {

        RailJourneyMap result = new Helper.RailJourneyMap();
        for (Iterator<RailJourney> iterator = r.iterator(); iterator.hasNext();) {
            RailJourney seg = (RailJourney) iterator.next();
            result.add(seg);
        }
        return result;
    }

    /**
     * Convenience class for keeping a mapping from id to rail segment.
     * 
     */
    public static class RailSegmentMap extends HashMap<String, RailSegment> {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void add(RailSegment j) {
            put(j.getKey(), j);
        }
    }

    /**
     * Take a list of rail segments and put them all into a map.
     * 
     * @param r
     *            list of rail segments
     * @return the built map from keys to rail segments
     */
    public static RailSegmentMap createRailSegmentMap(List<RailSegment> r) {

        RailSegmentMap result = new Helper.RailSegmentMap();
        for (Iterator<RailSegment> iterator = r.iterator(); iterator.hasNext();) {
            RailSegment seg = (RailSegment) iterator.next();
            result.add(seg);
        }
        return result;
    }

    // this is not *quite* a travel port date because tport puts a colon in
    // the timezone which is not ok with RFC822 timezones
    public static SimpleDateFormat tportResultFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    // turn a travel port date from a response back into a java object
    // not as easy to do because java gets confused by the iso 8601 timezone
    public static Date dateFromISO8601(String iso) {
        try {
            String noColon = iso.substring(0, 26) + iso.substring(27);
            return tportResultFormat.parse(noColon);
        } catch (ParseException e) {
            throw new RuntimeException("Really unlikely, but it looks like " + "travelport is not using ISO dates anymore! "
                    + e.getMessage());
        }
    }

    /**
     * Map from a key to an actual Vendor location
     */
    public static class VendorLocMap extends HashMap<String, VendorLocation> {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public void add(VendorLocation location) {
            put(location.getKey(),location);
        }

        /*@Override
        public VendorLocation get(Object wontWork) {
            throw new RuntimeException("This is disallowed because it was a " + "common mistake to pass a AirSegmentRef here instead "
                    + "of the string contained in the VendorLocationRef");
        }*/

        /**
         * Much more type safe than the get above
         * 
         * @param ref the reference object
         * @return the vendor location being referenced
         */
        public VendorLocation getByLocationRef(VendorLocationRef ref) {
            return super.get(ref.getKey());
        }
        
   
      
        /**
         * Merge all the locations into this object.A non-zero return is probably
         * very bad.
         */
        public int mergeAll(List<HotelSearchResult> list) {
            int result = 0;
            for (Iterator<HotelSearchResult> sourceIter = list.iterator(); sourceIter.hasNext();) {
                HotelSearchResult loc = (HotelSearchResult) sourceIter.next();
                
                Iterator<VendorLocation> it = loc.getVendorLocation().iterator();                         
                while(it.hasNext()) {
                    ++result;
                    VendorLocation vl = it.next();
                    add(vl);
                }
                
            }
            
            return result;
        }
        
    }

    /**
     * Make a point of sale based on lesson number and unit.
     */
    public static BillingPointOfSaleInfo tutorialBPOSInfo(int lesson, int unit) {
        BillingPointOfSaleInfo info = new BillingPointOfSaleInfo();
        info.setOriginApplication("UAPI");
        return info;
    }
    /**
     * Parse a number from something with a currency code on the front.  Aborts
     * if the number cannot be understood.
     */
    public static double parseNumberWithCurrency(String numberWithCurrency) {
        // first 3 chars are currency code
        String price = numberWithCurrency.substring(3);
        return Double.parseDouble(price);
    }
    
}
