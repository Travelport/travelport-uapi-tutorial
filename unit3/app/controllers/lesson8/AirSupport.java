package controllers.lesson8;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

import com.travelport.schema.air_v18_0.*;
import com.travelport.schema.common_v15_0.*;
import com.travelport.schema.common_v15_0.TypeFlexibleTimeSpec.SearchExtraDays;
import com.travelport.service.air_v18_0.AirFaultMessage;
import com.travelport.service.air_v18_0.AirLowFareSearchPortType;
import com.travelport.tutorial.support.WSDLService;
import com.travelport.uapi.unit1.AirReq;
import com.travelport.uapi.unit1.Helper;

/**
 * This class handles the work of actually making requests to and from the TPORT
 * service. Besides, I just like having a file called 'air support'. :-)
 * 
 * @author iansmith
 * 
 */
public class AirSupport {
    public static SimpleDateFormat niceWithTime = new SimpleDateFormat("EEEE MMMM dd hha");
    public static SimpleDateFormat justDate = new SimpleDateFormat("MMMM dd");

    public static class Seg {
        public String origin;
        public float originLat;
        public float originLon;
        public String dest;
        public float destLat;
        public float destLon;
        public String flight;
        public String depTime;
        public String carrier;

        public String toString() {
            return "SEG:" + carrier + "#" + flight + " " + origin + "->" + dest + "@" + depTime;
        }

        public String toJson() {
            String dpt = depTime;
            dpt = niceWithTime.format(Helper.dateFromISO8601(depTime));
            return "{ \"origin\": \"" + origin + "\" " + 
                    ", \"dest\": \"" + dest + "\" " + 
                    ", \"flight\": \"" + flight + "\" " +
                    ", \"carrier\": \"" + carrier + "\" " + 
                    ", \"depTime\": \"" + dpt + "\" "+
                    ", \"originLat\": " + originLat + " "+
                    ", \"originLon\": " + originLon + " "+
                    ", \"destLat\": " + destLat + " " +
                    ", \"destLon\": " + destLon + " "+
                    " }";

        }
    }

    public static class Journey {
        public String price;
        public Seg[] seg;
        public String outboundDate;
        public String returnDate;
        public String orig;
        public String dest;
        public int lastOut;
        
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < seg.length; i++) {
                builder.append(seg[i].toString() + ",");
            }
            return "JOURNEY:" + price + "[" + builder.toString() + "]";

        }

        public String toJson() {
            StringBuilder builder = new StringBuilder();
            builder.append("{ \"price\": " + Helper.parseNumberWithCurrency(price) 
                    + ", \"currency\": \"" + price.substring(0, 3) + "\" "
                    + ", \"outboundDate\": \"" + outboundDate + "\" "
                    + ", \"returnDate\": \"" + returnDate + "\" "
                    + ", \"orig\": \"" + orig + "\" "
                    + ", \"dest\": \"" + dest + "\" "
                    + ", \"lastOut\": " + lastOut + " "
                    + ", \"seg\": [");

            for (int i = 0; i < seg.length; i++) {
                builder.append(seg[i].toJson());
                if (i != seg.length - 1) {
                    builder.append(",");
                }
            }
            builder.append("] }");
            return builder.toString();
        }
    }

    /**
     * The only request we really need to do involves shopping. Returns
     * a single Journey object.
     * @param dest
     *            the destination that is the user's location or hometown
     * @param origin
     *            the user running the app
     * @param date the date of someone's birthday.  arrive day before
     *depart 2 days after
     * @return  bundle of information about lowest price on first screen
     */
    public static Journey price(String destAirport, String originAirport, Date bday) throws AirFaultMessage {

        // get the dates worked out day before and day after
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(bday);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date out = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 2);
        Date in = cal.getTime();
        List<String> destList = new ArrayList<String>();
        destList.add(destAirport);
        List<String> origList = new ArrayList<String>();
        origList.add(originAirport);
        return price(destList, origList, destAirport, originAirport, in, out, 0, 1, false).get(0);
    }
    /**
     * Allows you to get several journeys if you want.
     * @param dest
     *            the destination that is the user's location or hometown
     * @param origin
     *            the user running the app
     * @return List of journeys
     */

    public static List<Journey> price(List<String> destAirport, List<String> originAirport, 
            String destName, String originName,
            Date in, Date out, int distance, int num, boolean wantFlexDate) throws AirFaultMessage {

        AirLowFareSearchPortType port = WSDLService.airShop.get();
        WSDLService.airShop.showXML(true);

        LowFareSearchReq request = new LowFareSearchReq();

        // always need these
        request.setTargetBranch(System.getenv(WSDLService.TARGET_BRANCH_ENV));
        
        request.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(8, 3));

        // outbound leg
        SearchAirLeg outbound = createLeg(originAirport, destAirport, out, distance, wantFlexDate);
        request.getSearchAirLeg().add(outbound);

        // inbound leg
        SearchAirLeg inbound = createLeg(destAirport, originAirport, in, distance, wantFlexDate);
        request.getSearchAirLeg().add(inbound);

        // one passenger, Adult
        SearchPassenger adult = new SearchPassenger();
        adult.setCode("ADT");
        request.getSearchPassenger().add(adult);

        AirSearchModifiers modifiers = 
                AirReq.createModifiersWithProviders(System.getenv(WSDLService.GDS_ENV));
        request.setAirSearchModifiers(modifiers);
        // try the request
        LowFareSearchRsp rsp = port.service(request);
        // convert into helpful maps
        Helper.AirSegmentMap allSegments = Helper.createAirSegmentMap(rsp.getAirSegmentList().getAirSegment());

        List<Journey> allJourneys = new ArrayList<Journey>();
        
        for (int s=0 ; ((s<num) && (s<rsp.getAirPricingSolution().size())); ++s) {
            AirPricingSolution sol = rsp.getAirPricingSolution().get(s);

            // convert refs to real segments
            List<AirSegmentRef> refs = sol.getAirSegmentRef();
            List<AirSegment> segs = new ArrayList<AirSegment>();
            for (int i = 0; i < refs.size(); ++i) {
                segs.add(allSegments.getByRef(refs.get(i)));
            }

            // build journey data structure to show to user
            Journey result = new Journey();
            result.seg = new Seg[segs.size()];
            int counter = 0;
            result.price = sol.getApproximateTotalPrice();
            result.outboundDate = justDate.format(out);
            result.returnDate = justDate.format(in);
            result.orig = originName;
            result.dest = destName;
            result.lastOut = -1;
            
            for (Iterator<AirSegment> segIter = segs.iterator(); segIter.hasNext();) {
                AirSegment seg = (AirSegment) segIter.next();
                Seg resultSeg = new Seg();
                resultSeg.carrier = seg.getCarrier();
                resultSeg.depTime = seg.getDepartureTime();
                resultSeg.dest = seg.getDestination();
                resultSeg.origin = seg.getOrigin();
                resultSeg.flight = seg.getFlightNumber();
                if ((result.lastOut==-1) &&
                        (destAirport.contains(resultSeg.dest))) {
                    result.lastOut=counter;
                }
                result.seg[counter++] = resultSeg;
            }
            
            allJourneys.add(result);
        }
        
        return allJourneys;
    }

    /**
     * Simple data format for use in searches.
     */
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Two points in origin destination order plus a date of travel
     */
    public static SearchAirLeg createLeg(List<String> localOrigin, List<String> localDest, 
            Date date, long distance, boolean wantFlexDate) {
        SearchAirLeg result = new SearchAirLeg();
        
        for (int i=0; i<localDest.size(); ++i) {
            result.getSearchDestination().add(codeToLocation(localDest.get(i),distance));
        }
        Date earliestTime = new Date(date.getTime());
        Date preferredTime = new Date(date.getTime());
        Date latestTime = new Date(date.getTime());
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(earliestTime);
        cal.set(Calendar.HOUR_OF_DAY, 7);
        earliestTime = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 11);
        preferredTime = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 22);
        latestTime = cal.getTime();

        for (int i=0; i<localOrigin.size(); ++i) {
            result.getSearchOrigin().add(codeToLocation(localOrigin.get(i), distance));
        }

        TypeFlexibleTimeSpec flex = new TypeFlexibleTimeSpec();
        flex.setPreferredTime(dateFormat.format(preferredTime));
        TypeTimeRange range = new TypeTimeRange();
        range.setEarliestTime(dateFormat.format(earliestTime));
        range.setLatestTime(dateFormat.format(latestTime));
        flex.setTimeRange(range);
        
        if (wantFlexDate) {
            SearchExtraDays extra = new SearchExtraDays();
            extra.setDaysBefore(new Integer(1));
            extra.setDaysAfter(new Integer(1));
            flex.setSearchExtraDays(extra);
        }
        result.getSearchDepTime().add(flex);
        return result;
    }

    /**
     * Utility for converting lat/lon to a search location.
     * 
     * @param localDest
     * @return
     */
    public static TypeSearchLocation codeToLocation(String code, long maxDistance) {
        TypeSearchLocation loc = new TypeSearchLocation();
        Airport airport = new Airport();
        airport.setCode(code);
        loc.setAirport(airport);
        if (maxDistance!=0) {
            Distance dist = new Distance();
            dist.setUnits("KM");
            dist.setValue(BigInteger.valueOf(maxDistance));
            loc.setDistance(dist);
        }
        return loc;
    }

}
