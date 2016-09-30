package com.travelport.uapi.unit2;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.travelport.schema.common_v38_0.CreditCard;
import com.travelport.schema.common_v38_0.Distance;
import com.travelport.schema.common_v38_0.HostToken;
import com.travelport.schema.common_v38_0.NextResultReference;
import com.travelport.schema.common_v38_0.PermittedProviders;
import com.travelport.schema.common_v38_0.Provider;
import com.travelport.schema.common_v38_0.State;
import com.travelport.schema.common_v38_0.TypeReserveRequirement;
import com.travelport.schema.common_v38_0.TypeStructuredAddress;
import com.travelport.schema.common_v38_0.TypeVehicleClass;
import com.travelport.schema.common_v38_0.TypeVehicleLocation;
import com.travelport.schema.common_v38_0.TypeVehicleTransmission;
import com.travelport.schema.hotel_v38_0.BaseHotelSearchRsp;
import com.travelport.schema.hotel_v38_0.HotelLocation;
import com.travelport.schema.hotel_v38_0.HotelMediaLinksReq;
import com.travelport.schema.hotel_v38_0.HotelProperty;
import com.travelport.schema.hotel_v38_0.HotelRating;
import com.travelport.schema.hotel_v38_0.HotelSearchAvailabilityReq;
import com.travelport.schema.hotel_v38_0.HotelSearchLocation;
import com.travelport.schema.hotel_v38_0.HotelSearchModifiers;
import com.travelport.schema.hotel_v38_0.HotelSearchResult;
import com.travelport.schema.hotel_v38_0.HotelStay;
import com.travelport.schema.hotel_v38_0.RateInfo;
import com.travelport.schema.hotel_v38_0.TypeHotelAvailability;
import com.travelport.schema.hotel_v38_0.TypeHotelLocation;
import com.travelport.schema.hotel_v38_0.TypeHotelReferencePoint;
import com.travelport.schema.vehicle_v38_0.TypeRateAvailability;
import com.travelport.schema.vehicle_v38_0.Vehicle;
import com.travelport.schema.vehicle_v38_0.VehicleDateLocation;
import com.travelport.schema.vehicle_v38_0.VehicleModifier;
import com.travelport.schema.vehicle_v38_0.VehicleRate;
import com.travelport.schema.vehicle_v38_0.VehicleSearchAvailabilityReq;
import com.travelport.schema.vehicle_v38_0.VehicleSearchAvailabilityRsp;
import com.travelport.schema.vehicle_v38_0.VehicleSearchModifiers;
import com.travelport.service.hotel_v38_0.HotelFaultMessage;
import com.travelport.service.hotel_v38_0.HotelMediaLinksServicePortType;
import com.travelport.service.hotel_v38_0.HotelSearchServicePortType;
import com.travelport.service.vehicle_v38_0.VehicleFaultMessage;
import com.travelport.service.vehicle_v38_0.VehicleSearchServicePortType;
import com.travelport.tutorial.support.WSDLService;
import com.travelport.uapi.unit1.Helper;
import com.travelport.uapi.unit1.Helper.VendorLocMap;

public class Lesson4 {
    private static String closestHotelCode;
    private static String cheapestHotelCode;
	private static Vehicle lowestEstimatedVehicle;
	private static HostToken HostTokenRef;
	private static String rateSupplier;

	/**
     * Program entry point.
     * 
     * @param argv
     *            cmd line args
	 * @throws FileNotFoundException 
     *            
     *            
     *            
     */
	
	
    public static void main(String[] argv) throws FileNotFoundException {

        // get the port and request, as usual
        HotelSearchServicePortType port = WSDLService.hotelShop.get();
        
        //This port ends up not being provided by some providers so it isn't
        //used by the lesson's code
        HotelMediaLinksServicePortType media = WSDLService.hotelMedia.get();
        WSDLService.hotelMedia.showXML(true);

        //the hotel search parametrs
        int numAdults=2, numRooms=2, distanceInKm=25, maxScreens=4;
        int daysToCheckin = 90, daysToDeparture = 97;
        TypeHotelReferencePoint pointOfInterestName= new TypeHotelReferencePoint();
        pointOfInterestName.setValue("Mall Of America");
        String city = "MSP";
      
        try {
            
            WSDLService.hotelShop.showXML(true);
            
            HotelSearchResult[] result= 
                findLowestPriceAndClosestToAttraction(port, pointOfInterestName, city,distanceInKm,
                maxScreens, numAdults, numRooms, daysToCheckin, 
                daysToDeparture, /*don't care about guarantee*/false);
        
            printHotel(result[0], pointOfInterestName, media);
            printHotel(result[1], pointOfInterestName, media);
            VehicleSearchAvailabilityRsp veh = searchVehicle("CDG", daysToCheckin, daysToDeparture);
            printvehicle(veh);

        } catch (NumberFormatException e) {
            System.err.println("unable to parse hotel price: " + e.getMessage());
        } catch (HotelFaultMessage e) {
            System.err.println("error reading hotel data: " + e.getMessage());
        } catch (VehicleFaultMessage e) {
            System.err.println("error reading vehicle data: " + e.getMessage());
        }

   


    }

    @SuppressWarnings("resource")
	private static void printvehicle(VehicleSearchAvailabilityRsp veh) {
		// TODO Auto-generated method stub
    	Formatter fmt = new Formatter(System.out);
    	
		VehicleDateLocation vdl = veh.getVehicleDateLocation();
		if(vdl != null){	        
	        fmt.format("%-30s [%s:%s]\n", vdl.getPickupDateTime(), vdl.getPickupLocation(), vdl.getReturnDateTime(), vdl.getReturnLocation(), vdl.getPickupLocationType());
			double lowestCost = Long.MAX_VALUE;
			List<Vehicle> vehicleList = veh.getVehicle();
			Iterator<Vehicle> vehIte = vehicleList.iterator();
			while(vehIte.hasNext()){
				Vehicle vehicle = vehIte.next();
				VehicleRate vr = vehicle.getVehicleRate();
				
				if(vr != null){
					if(vr.getRateAvailability().equals(TypeRateAvailability.AVAILABLE)){
						if(vr.getSupplierRate() != null){
							if(vr.getSupplierRate().getEstimatedTotalAmount() != null){
								if(lowestCost > Helper.parseNumberWithCurrency(vr.getSupplierRate().getEstimatedTotalAmount())){
									setLowestEstimatedVehicle(vehicle);
								}
							}
							else{
								if(vr.getSupplierRate().getBaseRate() != null){
									if(lowestCost > Helper.parseNumberWithCurrency(vr.getSupplierRate().getBaseRate())){
										setLowestEstimatedVehicle(vehicle);
									}
								}							
							}
						}
						else if(vr.getApproximateRate() != null){
							//System.out.println(vr.getApproximateRate());
						}
					}
				}
			}
			
			if(getLowestEstimatedVehicle() != null){
				Vehicle lowCost = getLowestEstimatedVehicle();
				fmt.format("%-30s [%s:%s]\n",lowCost.getVehicleRate().getRateCategory(), lowCost.getVendorCode(), lowCost.getVehicleRate().getSupplierRate().getRateForPeriod());
			}			
		}
	}

	/**
     * This the main routine for Lesson4. It reads several screens from the
     * hotel search service and returns an array of size 2. The 0th element is
     * the lowest price hotel and the 1st is the closest.
     * 
     * @throws HotelFaultMessage 
     */
    public static HotelSearchResult[] findLowestPriceAndClosestToAttraction(HotelSearchServicePortType port, 
            TypeHotelReferencePoint pointOfInterest, String city, int searchRadiusInKM, int maxScreens, 
            int numAdults, int numRooms, int daysInFutureForCheckIn, 
            int daysInFutureForCheckOut, boolean noDepositOrGuarantee) throws HotelFaultMessage {

        HotelSearchAvailabilityReq req = new HotelSearchAvailabilityReq();

        HotelSearchModifiers mods = Lesson4.createModifiers(numAdults, numRooms);

        /*
         * bedding requests can't be handled by 1G or 1V
         */ 
        /*
         HotelBedding parents = new
         HotelBedding(); parents.setType(TypeBedding.QUEEN);
         parents.setNumberOfBeds(1); mods.getHotelBedding().add(parents);
          
         HotelBedding kids = new HotelBedding();
         kids.setType(TypeBedding.TWIN); kids.setNumberOfBeds(2);
         mods.getHotelBedding().add(kids);
       */  

        // have to give our branch id
        req.setTargetBranch(System.getProperty("travelport.targetBranch"));
        
        HotelSearchLocation hotelLoc = new HotelSearchLocation();
        hotelLoc.setReferencePoint(pointOfInterest);
        hotelLoc.setHotelLocation(Lesson4.createCityLocation(city));


        req.setHotelSearchLocation(hotelLoc);;
        //req.getHotelSearchLocation().setHotelLocation(Lesson4.createCityLocation(city));

        // within certain radius of attraction
        Lesson4.addDistanceModifier(req.getHotelSearchLocation(), searchRadiusInKM);
        req.setHotelSearchModifiers(mods);

        // when staying?
        HotelStay stay = Lesson4.createCheckInAndOut(Lesson4.futureDateAsXML(daysInFutureForCheckIn),
                Lesson4.futureDateAsXML(daysInFutureForCheckOut));
        req.setHotelStay(stay);

        // point of sale
        req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(6, 2));

        // where we store results
        BaseHotelSearchRsp rsp = null;
        int screens = 0;

        HotelSearchResult closest = null;
		HotelSearchResult cheapest = null;
        int lowestDistance = Integer.MAX_VALUE;
        double lowestPrice = Double.MAX_VALUE;
        // we walk through each result
        do {
            NextResultReference next = null;
            VendorLocMap NOT_USED = new VendorLocMap();

            // run the request, possibly from some middle point
            rsp = port.service(req);            
            // merge everyone into the map
            NOT_USED.mergeAll(rsp.getHotelSearchResult());

            List<HotelSearchResult> results = rsp.getHotelSearchResult();
            for (Iterator<HotelSearchResult> iterator = results.iterator(); iterator.hasNext();) {
                HotelSearchResult r = (HotelSearchResult) iterator.next();
                List<HotelProperty> hp = r.getHotelProperty();
                Iterator<HotelProperty> hl = hp.iterator();
                while(hl.hasNext()){                	               	
                	HotelProperty p = hl.next();
	                if ((p.getAvailability() == null) || (!p.getAvailability().equals(TypeHotelAvailability.AVAILABLE))) {
	                    continue;
	                }
	                //we don't want to have to use a credit card or cash to guarantee resv
	                if (noDepositOrGuarantee) {
	                	if(p.getReserveRequirement() != null){
	                		if(!p.getReserveRequirement().equals(TypeReserveRequirement.OTHER)){
	                			continue;
	                		}
	                	}
	                }
	                
	             	// check for closest
	                if(p.getDistance() != null){
		                int dist = p.getDistance().getValue().intValue();	                
		                if (dist < lowestDistance) {
		                	//setProviderCode(NOT_USED.get(p.getVendorLocationKey()).getProviderCode());
		                	setClosestHotelCode(p.getHotelCode());
		                    closest = r;
		                    lowestDistance = dist;
		                }
	                }
		            // get the price, check for lowest...
		            List<RateInfo> ri = r.getRateInfo();
		            Iterator<RateInfo> rateInfo = ri.iterator();
		            while(rateInfo.hasNext()){
		            	RateInfo info = rateInfo.next();
		            	double min = 0.0;
		            	if(info.getMinimumAmount() != null){
		            		min = Helper.parseNumberWithCurrency(info.getMinimumAmount());
		            	}
		            	else if(info.getApproximateMinimumStayAmount() != null){
		            		min = Helper.parseNumberWithCurrency(info.getApproximateMinimumStayAmount());
		            	}
		            	else if(info.getApproximateMinimumAmount() != null){
		            		min = Helper.parseNumberWithCurrency(info.getApproximateMinimumAmount());
		            	}
		                //some places offer a min price of ZERO which is clearly not
		                //available so we use half max price just to make the output
		                //halfway meaningful
		                if (min==0.0) {
		                	if(info.getMaximumAmount() != null){
		                		min = Helper.parseNumberWithCurrency(info.getMaximumAmount())/2;
		                	}
		                	else if(info.getApproximateMinimumAmount() != null){
		                		min = Helper.parseNumberWithCurrency(info.getApproximateMinimumAmount())/2;
		                	}
		                	else if(info.getApproximateMaximumAmount() != null){
		                		min = Helper.parseNumberWithCurrency(info.getApproximateMaximumAmount())/2;
		                	}
		                }
		                if (min < lowestPrice) {
		                	//setProviderCode(NOT_USED.get(p.getVendorLocationKey()).getProviderCode());
		                	setCheapestHotelCode(p.getHotelCode());
		                    cheapest = r;
		                    lowestPrice = min;
		                    if(info.getRateSupplier() != null){
		                    	setRateSupplier(info.getRateSupplier());
		                    }
			            }
		            }
                }
	                

	                

            }
            // is there more?
            if(rsp.getHostToken() != null){
            	setHostTokenRef(rsp.getHostToken());
            }
            
            if (rsp.getNextResultReference().size() > 0) {
                // there is, so prepare for it
                next = rsp.getNextResultReference().get(0);
            }
            // keep track of number of times we've hit the server
            ++screens;
            if (next == null) {
                // no more data
                break;
            }
            // prepare for next round by setting the next value into this
            // request
            req.getNextResultReference().clear();
            req.getNextResultReference().add(next);

        } while (screens != maxScreens);

        if (closest == null) {        	
            HotelSearchResult[] result = new HotelSearchResult[1];
            result[0]=cheapest;
            return result;
        } 
        
        HotelSearchResult[] result = new HotelSearchResult[2];
        result[0]=cheapest;
        result[1]=closest;
        return result;
    }

    /**
     * Very basic vehicle search for a family vehicle.
     * 
     * @param string
     * @return 
     * @throws VehicleFaultMessage
     * @throws FileNotFoundException 
     */
    public static VehicleSearchAvailabilityRsp searchVehicle(String airportCode, int daysInFuturePickup, int daysInFutureReturn) throws VehicleFaultMessage, FileNotFoundException {
        VehicleSearchServicePortType port = WSDLService.vehicleSearch.get();
        WSDLService.vehicleSearch.showXML(true);
        
        VehicleSearchAvailabilityReq req = new VehicleSearchAvailabilityReq();
        
        req.setTargetBranch(System.getProperty("travelport.targetBranch"));
        req.setReturnAllRates(Boolean.TRUE);

        req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(4, 2));

        VehicleDateLocation dateLoc = new VehicleDateLocation();
        dateLoc.setPickupLocation(airportCode);
        dateLoc.setPickupLocationType(TypeVehicleLocation.AIRPORT);
        dateLoc.setReturnLocation(airportCode);
        dateLoc.setReturnLocationType(TypeVehicleLocation.AIRPORT);

        // just use noon here
        String suffix = "T12:00:00";
        dateLoc.setPickupDateTime(Helper.daysInFuture(daysInFuturePickup) + suffix);
        dateLoc.setReturnDateTime(Helper.daysInFuture(daysInFutureReturn) + suffix);
        req.setVehicleDateLocation(dateLoc);

        VehicleSearchModifiers searchMods = new VehicleSearchModifiers();
        VehicleModifier mods = new VehicleModifier();
        mods.setAirConditioning(Boolean.TRUE);
        mods.setTransmissionType(TypeVehicleTransmission.AUTOMATIC);
        mods.setVehicleClass(TypeVehicleClass.MINIVAN);
        searchMods.getVehicleModifier().add(mods);
        req.setVehicleSearchModifiers(searchMods);
        
        VehicleSearchAvailabilityRsp rsp = port.service(req);
        
        return rsp;
    }

    /**
     * Display a hotel on the terminal.
     * 
     * @param r
     *            the result that we want to print
     * @param attraction
     *            name of the attraction for the distance
     * @param port
     *            the service port for trying to lookup media about the hotel
     * @throws HotelFaultMessage
     */
    @SuppressWarnings("resource")
	public static void printHotel(HotelSearchResult r, 
            TypeHotelReferencePoint pointOfInterestName, HotelMediaLinksServicePortType media)
            throws HotelFaultMessage {

        
         HotelMediaLinksReq req = new HotelMediaLinksReq();
         req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(6, 2));
         
         List<HotelProperty> hotelProperty = r.getHotelProperty();
         Iterator<HotelProperty> hp = hotelProperty.iterator();
         
         while(hp.hasNext()){
        	 HotelProperty p = hp.next();
        	 if(p.getHotelCode().equals(getClosestHotelCode()) || p.getHotelCode().equals(getCheapestHotelCode())){
		         req.getHotelProperty().add(p); 
		        // HotelMediaLinksRsp rsp = media.service(req);
		         
		
		        // at the moment, it doesn't appear that there is any really useful
		        // information in the vendor location map... that may vary by provider		        
		        Formatter fmt = new Formatter(System.out);
		        fmt.format("%-30s [%s:%s]\n", p.getName(), p.getHotelChain(), p.getHotelCode());
		
		        String addr = p.getPropertyAddress().getAddress().get(0);
		        fmt.format("%10s %s\n", "", addr);
		
		        String ratingsText = flattenRatingsToText(p.getHotelRating());
		        List<RateInfo> info = r.getRateInfo();
		        Iterator<RateInfo> rates = info.iterator();
		        while(rates.hasNext()){
		        	RateInfo ri = rates.next();
		        	if(ri.getMinimumAmount() != null){
		        		fmt.format("%10s %-10s to %-10s \n", "", ri.getMinimumAmount(), ri.getMaximumAmount());
		        	}
		        	else if(ri.getApproximateMinimumStayAmount() != null){
		        		fmt.format("%10s %-10s to %-10s \n", "", ri.getApproximateMinimumStayAmount(), ri.getApproximateMinimumAmount());
		        	}
		        	else if(ri.getApproximateMinimumAmount() != null){
		        		fmt.format("%10s %-10s to %-10s \n", "", ri.getApproximateMinimumAmount(), ri.getApproximateMaximumAmount());
		        	}
		        }
		        if(p.getDistance() != null){
			        fmt.format("%10s %s%s from %s\n", "", p.getDistance().getValue(), 
			                p.getDistance().getUnits(), pointOfInterestName);
		        }
		        if (!ratingsText.equals("")) {
		            fmt.format("%10s %s\n", "", ratingsText);
		        }
		        fmt.format("%10s RESERVATION REQUIREMENT IS %s\n", "", p.getReserveRequirement());
		
		        if (p.getCoordinateLocation() != null) {
		            float lat = p.getCoordinateLocation().getLatitude();
		            float lon = p.getCoordinateLocation().getLongitude();
		            fmt.format("%5s http://maps.google.com/?q=%.6f,%.6f\n", "", lat, lon);
		        }
         	}
	        
	    }
    }

    public static String flattenRatingsToText(List<HotelRating> ratings) {
        StringBuilder builder = new StringBuilder();
        for (Iterator<HotelRating> iterator = ratings.iterator(); iterator.hasNext();) {
            HotelRating rating = (HotelRating) iterator.next();
            List<BigInteger> nums = rating.getRating();
            if (nums.isEmpty()) {
                continue;
            }
            builder.append(rating.getRatingProvider() + " says ");
            for (Iterator<BigInteger> numIter = nums.iterator(); numIter.hasNext();) {
                BigInteger num = (BigInteger) numIter.next();
                builder.append(num + " ");
            }
            if (rating.getRatingRange()!=null) {
                builder.append(" on scale of " + rating.getRatingRange().getMinimumRating() + " to "
                    + rating.getRatingRange().getMaximumRating());
            }
        }
        return builder.toString();
    }

    /**
     * No sense in having more than one factory.
     */
    protected static DatatypeFactory factory;

    protected static DatatypeFactory getFactory() {
        if (factory != null) {
            return factory;
        }
        try {
            factory = DatatypeFactory.newInstance();
            return factory;
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Whoa! No data type factory found!");
        }
    }

    /**
     * Return the object that represents the amount of days in the future given.
     * 
     * @return this object can be used in requests that refer to a calendar date
     */
    public static XMLGregorianCalendar futureDateAsXML(int daysInFuture) {
        Date d = new Date();
        Calendar c = GregorianCalendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, daysInFuture);
        return getFactory().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH),
                DatatypeConstants.FIELD_UNDEFINED);
    }

    /**
     * Create the modifiers that always work.
     * 
     * @param numAdults
     * @param numRooms
     * @return
     */
    public static HotelSearchModifiers createModifiers(int numAdults, int numRooms) {
        HotelSearchModifiers mods = new HotelSearchModifiers();
        mods.setNumberOfAdults(2);
        mods.setNumberOfRooms(2);
        /*This permitted provider part is optional to add in Search
         *it can be used as per the requirement*/
        PermittedProviders permitted = new PermittedProviders();
        Provider provider = new Provider();
        provider.setCode(System.getProperty("travelport.gds"));
        permitted.setProvider(provider);
        mods.setPermittedProviders(permitted);
        return mods;
    }

    public static HotelLocation createCityLocation(String cityCode) {
        HotelLocation location = new HotelLocation();
        location.setLocation(cityCode);
        location.setLocationType(TypeHotelLocation.CITY);
        return location;
    }

    public static void addDistanceModifier(HotelSearchLocation mods, long km) {
        Distance distance = new Distance();
        distance.setUnits("KM");
        distance.setValue(BigInteger.valueOf(km));
        mods.setDistance(distance);
    }

    public static HotelStay createCheckInAndOut(XMLGregorianCalendar in, XMLGregorianCalendar out) {
        // when staying?
        HotelStay stay = new HotelStay();
        // use the factory to make XML dates
        stay.setCheckinDate(Lesson4.futureDateAsXML(45));
        stay.setCheckoutDate(Lesson4.futureDateAsXML(47));
        return stay;
    }
    
    public static CreditCard getFakeCreditCard(boolean withAddress) {
        CreditCard cc = new CreditCard();
        TypeStructuredAddress addr = new TypeStructuredAddress();
        
        cc.setType("VI");
        cc.setNumber("4111111111111111");
        cc.setBankCountryCode("US");
        //dec 2014
        cc.setExpDate(getFactory().newXMLGregorianCalendarDate(2016, 06,
                DatatypeConstants.FIELD_UNDEFINED, 
                DatatypeConstants.FIELD_UNDEFINED));
        cc.setName("JOAN TEST");
        cc.setCVV("737");
        addr.setAddressName("Hugh Capet");
        addr.setCity("Montpellier");
        State vt = new State();
        vt.setValue("VT");
        addr.setState(vt);
        addr.setCountry("US");
        addr.setPostalCode("05602");
        addr.setAddressName("1 louvre street");       
        
        
        if (withAddress) {
            cc.setBillingAddress(addr);
        }
        return cc;
    }


	/**
	 * @return the closestHotelCode
	 */
	public static String getClosestHotelCode() {
		return closestHotelCode;
	}

	/**
	 * @param closestHotelCode the closestHotelCode to set
	 */
	public static void setClosestHotelCode(String closestHotelCode) {
		Lesson4.closestHotelCode = closestHotelCode;
	}

	/**
	 * @return the cheapestHotelCode
	 */
	public static String getCheapestHotelCode() {
		return cheapestHotelCode;
	}

	/**
	 * @param cheapestHotelCode the cheapestHotelCode to set
	 */
	public static void setCheapestHotelCode(String cheapestHotelCode) {
		Lesson4.cheapestHotelCode = cheapestHotelCode;
	}

	/**
	 * @return the lowestEstimatedVehicle
	 */
	public static Vehicle getLowestEstimatedVehicle() {
		return lowestEstimatedVehicle;
	}

	/**
	 * @param vehicle the lowestEstimatedVehicle to set
	 */
	public static void setLowestEstimatedVehicle(Vehicle vehicle) {
		Lesson4.lowestEstimatedVehicle = vehicle;
	}

	/**
	 * @return the hostTokenRef
	 */
	public static HostToken getHostTokenRef() {
		return HostTokenRef;
	}

	/**
	 * @param hostTokenRef the hostTokenRef to set
	 */
	public static void setHostTokenRef(HostToken hostTokenRef) {
		HostTokenRef = hostTokenRef;
	}

	/**
	 * @return the rateSupplier
	 */
	public static String getRateSupplier() {
		return rateSupplier;
	}

	/**
	 * @param rateSupplier the rateSupplier to set
	 */
	public static void setRateSupplier(String rateSupplier) {
		Lesson4.rateSupplier = rateSupplier;
	}	

}
