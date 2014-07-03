package com.travelport.uapi.unit2;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.travelport.schema.common_v26_0.BookingTraveler;
import com.travelport.schema.common_v26_0.BookingTravelerName;
import com.travelport.schema.common_v26_0.CreditCard;
import com.travelport.schema.common_v26_0.Email;
import com.travelport.schema.common_v26_0.Guarantee;
import com.travelport.schema.common_v26_0.HostToken;
import com.travelport.schema.common_v26_0.PermittedProviders;
import com.travelport.schema.common_v26_0.PhoneNumber;
import com.travelport.schema.common_v26_0.Provider;
import com.travelport.schema.common_v26_0.State;
import com.travelport.schema.common_v26_0.TypeStructuredAddress;
import com.travelport.schema.hotel_v26_0.GuestInformation;
import com.travelport.schema.hotel_v26_0.HotelDetailsModifiers;
import com.travelport.schema.hotel_v26_0.HotelDetailsReq;
import com.travelport.schema.hotel_v26_0.HotelDetailsRsp;
import com.travelport.schema.hotel_v26_0.HotelProperty;
import com.travelport.schema.hotel_v26_0.HotelRateDetail;
import com.travelport.schema.hotel_v26_0.HotelReservation;
import com.travelport.schema.hotel_v26_0.HotelSearchResult;
import com.travelport.schema.hotel_v26_0.HotelStay;
import com.travelport.schema.hotel_v26_0.NumberOfAdults;
import com.travelport.schema.hotel_v26_0.TypeHotelRateDescription;
import com.travelport.schema.hotel_v26_0.TypeRateRuleDetail;
import com.travelport.schema.universal_v26_0.HotelCreateReservationReq;
import com.travelport.schema.universal_v26_0.HotelCreateReservationRsp;
import com.travelport.schema.universal_v26_0.ProviderReservationStatus;
import com.travelport.schema.universal_v26_0.UniversalRecord;
import com.travelport.schema.universal_v26_0.UniversalRecordCancelReq;
import com.travelport.schema.universal_v26_0.UniversalRecordCancelRsp;
import com.travelport.service.hotel_v26_0.HotelDetailsServicePortType;
import com.travelport.service.hotel_v26_0.HotelFaultMessage;
import com.travelport.service.hotel_v26_0.HotelMediaLinksServicePortType;
import com.travelport.service.hotel_v26_0.HotelSearchServicePortType;
import com.travelport.service.hotel_v26_0.HotelService;
import com.travelport.service.universal_v26_0.HotelReservationServicePortType;
import com.travelport.service.universal_v26_0.UniversalRecordCancelService;
import com.travelport.service.universal_v26_0.UniversalRecordCancelServicePortType;
import com.travelport.service.universal_v26_0.UniversalRecordFaultMessage;
import com.travelport.tutorial.support.ServiceWrapper;
import com.travelport.tutorial.support.WSDLService;
import com.travelport.uapi.unit1.Helper;

public class Lesson5 {

    /**
     * Just to show how to do it, we provide an example that does not go through
     * the WSDLService convenience class but declares services and ports 
     * itself.
     */
    public static ServiceWrapper<HotelService> svc = new ServiceWrapper<HotelService>(WSDLService.HOTEL_WSDL, HotelService.class);
    public static ServiceWrapper<UniversalRecordCancelService> svc1 = new ServiceWrapper<UniversalRecordCancelService>(WSDLService.UNIVERSAL_WSDL, UniversalRecordCancelService.class);

    public static void main(String[] argv) {
        //the hotel search parametrs
        int numAdults=2, numRooms=1, distanceInKm=25, maxScreens=4;
        int daysToCheckin = 7, daysToDeparture = 9;
        String pointOfInterestName="GOLDEN GATE BRIDGE";
        String city = "SFO";

        //again, normally this is hidden inside the WSDLService code, this is 
        //just to show how it works
        HotelSearchServicePortType port = WSDLService.hotelShop.get();
        @SuppressWarnings("unused")
		HotelDetailsServicePortType det = WSDLService.hotelDetails.get();
        WSDLService.hotelDetails.showXML(true);       
        
        
        HotelReservationServicePortType resv = WSDLService.hotelReserve.get();
        HotelMediaLinksServicePortType media = WSDLService.hotelMedia.get();
        WSDLService.hotelReserve.showXML(true);
        
        UniversalRecordCancelServicePortType uniPort = WSDLService.univCancel.get();
        WSDLService.univCancel.showXML(true);
        
        //now for the real code...
        try {
            
            HotelSearchResult[] result= 
                Lesson4.findLowestPriceAndClosestToAttraction(port, 
                        pointOfInterestName, city, distanceInKm,
                        maxScreens, numAdults, numRooms, daysToCheckin, 
                        daysToDeparture, true/*no deposit!*/);
        
            if (result==null) {
                System.err.println("No results found near "+pointOfInterestName);
                return;
            }
            
            HotelSearchResult cheapest = result[0];
            Lesson4.printHotel(cheapest, pointOfInterestName, media);
            
            //note this is called on the WRAPPER not the object itself
            WSDLService.hotelDetails.showXML(true);
            
            //let's the detailed address and phone number
            HotelDetailsReq deetReq = new HotelDetailsReq();
            
            //if you don't supply this information you cannot get the 
            //rate details... this actually more detailed than the search
            //modes used before
            HotelDetailsModifiers mods = new HotelDetailsModifiers();
            mods.setNumberOfAdults(numAdults);
            mods.setNumberOfRooms(numRooms);            
            /*
             * Permitted provider os optional modifier and may be 
             * needed to add in certain conditions
             */
            PermittedProviders permitted = new PermittedProviders();
            Provider provider = new Provider();
            provider.setCode(System.getProperty("travelport.gds"));
            permitted.setProvider(provider);
            mods.setPermittedProviders(permitted);
            
            
            //we will re-use this again in the booking request
            HotelStay stay = Lesson4.createCheckInAndOut(
                    Lesson4.futureDateAsXML(daysToCheckin),
                    Lesson4.futureDateAsXML(daysToDeparture));
            mods.setHotelStay(stay);
            
            //no sense being on a twin when travelling alone
            /* not implemented by 1V and 1G , so commented out*/
            /*HotelBedding bedding = new HotelBedding();
            bedding.setNumberOfBeds(1);
            bedding.setType(TypeBedding.QUEEN);
            mods.getHotelBedding().add(bedding);*/
            
            
            mods.setRateRuleDetail(TypeRateRuleDetail.COMPLETE);
            if(Lesson4.getRateSupplier() != null){
            	mods.setRateSupplier(Lesson4.getRateSupplier());
            }
            
            //put the modifiers in place
            deetReq.setHotelDetailsModifiers(mods);
            
            
            //always need the billing POS and target branch
            deetReq.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(2, 5));
            deetReq.setTargetBranch(System.getProperty("travelport.targetBranch"));

            //we put the hotel property back that we got from the shop request
            //no need to tweak with it
            List<HotelProperty> hotelProperty = cheapest.getHotelProperty();
            Iterator<HotelProperty> hp = hotelProperty.iterator();
            while(hp.hasNext()){
            	HotelProperty p = hp.next();
            	if(p.getHotelCode().equals(Lesson4.getCheapestHotelCode())){
            		deetReq.setHotelProperty(p);
            		break;
            	}
            }
            
            if(Lesson4.getHostTokenRef() != null){
            	HostToken ht =  new HostToken();
            	ht.setHost(Lesson4.getHostTokenRef().getHost());
            	ht.setValue(Lesson4.getHostTokenRef().getValue());
            	deetReq.setHostToken(ht);
            }
            
            //System.out.println(deetReq);
            //pull apart the details of the response
            HotelDetailsRsp rsp = WSDLService.hotelDetails.get().service(deetReq);
            
            //we will re-use this again later in booking
            HotelProperty property = rsp.getRequestedHotelDetails().getHotelProperty();
            
            //get the list of address info
            List<String> addrList = property.getPropertyAddress().getAddress();
            StringBuilder addr = new StringBuilder();
            for (Iterator<String> addrIter = addrList.iterator(); addrIter.hasNext();) {
                String s = (String) addrIter.next();
                addr.append("              "+s+"\n");
            }
            
            //get the phone info
            StringBuilder phone = new StringBuilder();
            List<PhoneNumber> numList = rsp.getRequestedHotelDetails().getHotelProperty().getPhoneNumber();
            for (Iterator<PhoneNumber> phoneIter = numList.iterator(); phoneIter.hasNext();) {
                PhoneNumber n = (PhoneNumber) phoneIter.next();
                addr.append("              "+n.getType()+" "+n.getNumber()+"\n");
            }
            System.out.println(property.getName());
            System.out.println(addr.toString());
            System.out.println(phone.toString());
            
            HotelRateDetail lowestRate = null;
            double lowest = Double.MAX_VALUE;
            String lowestDescription=null;
            
            //find the rate that has the lowest non-smoking cost
            List<HotelRateDetail> allDetails = rsp.getRequestedHotelDetails().getHotelRateDetail();
            for (Iterator<HotelRateDetail> i = allDetails.iterator(); i.hasNext();) {
                HotelRateDetail rateDetail = (HotelRateDetail) i.next();
                double min = Double.MAX_VALUE;
                if (rateDetail.getTotal() != null) {
                    min = Helper.parseNumberWithCurrency(rateDetail.getTotal());
                } else if (rateDetail.getBase()!=null) {
                    min =  Helper.parseNumberWithCurrency(rateDetail.getBase());
                } else if(rateDetail.getApproximateBase() != null){
                	min =  Helper.parseNumberWithCurrency(rateDetail.getApproximateBase());                	
                } else if(rateDetail.getRatePlanType() != null){
                	System.out.println("This is a worldspan hotel booking.");
                }
                else {
                    System.err.println("Unable to find a price for this hotel!");
                    return;
                }
                //this can be used to filter out different kinds fo guarantee
                //requirements, such a requiring depost, requiring CCard etc
                //boolean g = hasGuaranteedComment(rateDetail); 
                //g=false;

                String description = getDescriptiveText(rateDetail);
                //has to be the lowest that includes NON-SMOKING  
                if ((min<lowest) && (isNonSmoking(description)) && !System.getProperty("travelport.gds").equals("1P")) {
                    lowestRate = rateDetail;
                    lowest = min;
                    lowestDescription = description;
                }
                
                if(System.getProperty("travelport.gds").equals("1P")){
                	lowestRate = rateDetail;
                	lowestDescription = description;
                }
            }
            
            if (lowestRate == null) {
                System.err.println("Unable to find a lowest rate that includes "
                        +"non smoking room at the cheapest hotel.");
                return;
            }
            
            //print out some info for the user to see what we are doing
            System.out.println(lowestDescription);
            //System.out.println("Total Price: "+ lowestRate.getTotal());
            
            //now do a booking
            HotelCreateReservationReq req = new HotelCreateReservationReq();
            
            //only the name and phone are required, but really should be 
            //supplying more data
            //adding traveler 1
            BookingTraveler traveler = new BookingTraveler();
            BookingTravelerName name = new BookingTravelerName();
            name.setFirst("Hugh");
            name.setLast("Capet");
            name.setPrefix("MR");
            PhoneNumber number = new PhoneNumber();
            number.setLocation("home");
            number.setCountryCode("1");
            number.setAreaCode("212");
            number.setNumber("555-1212");
            
            GregorianCalendar c = new GregorianCalendar();
            String dob = "1967-11-23";
            Date date = new Date();
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				 System.err.println("unable to parse Date: " + e1.getMessage());
			}
            c.setTime(date);
            XMLGregorianCalendar xgc = null;
			try {
				xgc = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				System.err.println("Date type configuration error : " + e.getMessage());
			}            
            traveler.setDOB(xgc);
            traveler.setNationality("FR");
            
            TypeStructuredAddress addrs = new TypeStructuredAddress();
            addrs.setAddressName("Home");
            addrs.setAddressName("Hugh Capet");
            addrs.setCity("Montpellier");
            State vt = new State();
            vt.setValue("VT");            
            addrs.setState(vt);
            
            addrs.getStreet().add("1 louvre street");
            
            addrs.setCountry("US");
            addrs.setPostalCode("05602");

            
            traveler.setTravelerType("ADT");
            traveler.setBookingTravelerName(name);
            traveler.getPhoneNumber().add(number);
            
            Email email = new Email();
            email.setEmailID("test@travelport.com");
            email.setType("Home");
            
            traveler.getEmail().add(email);

            traveler.getAddress().add(addrs);
            req.getBookingTraveler().add(traveler);
            
            
            //adding traveler 2
            BookingTraveler traveler1 = new BookingTraveler();
            BookingTravelerName name1 = new BookingTravelerName();
            name1.setFirst("Lara");
            name1.setLast("Capet");
            name1.setPrefix("MRS");
            PhoneNumber number1 = new PhoneNumber();
            number1.setLocation("MON");
            number1.setCountryCode("1");
            number1.setAreaCode("212");
            number1.setNumber("555-1214");
            
            GregorianCalendar c1 = new GregorianCalendar();
            String dob1 = "1969-06-15";
            Date date1 = new Date();
			try {
				date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dob1);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				 System.err.println("unable to parse Date: " + e1.getMessage());
			}
            c1.setTime(date);
            XMLGregorianCalendar xgc1 = null;
			try {
				xgc1 = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				System.err.println("Date type configuration error : " + e.getMessage());
			}            
            traveler.setDOB(xgc1);
            traveler.setNationality("FR");
            
            TypeStructuredAddress addrs1 = new TypeStructuredAddress();
            addrs1.setAddressName("Home");
            addrs1.setAddressName("Hugh Capet");
            addrs1.setCity("Montpellier");
            State vt1 = new State();
            vt1.setValue("VT");            
            addrs1.setState(vt1);
            
            addrs1.getStreet().add("1 louvre street");
            
            addrs1.setCountry("US");
            addrs1.setPostalCode("05602");

            
            traveler1.setTravelerType("ADT");
            traveler1.setBookingTravelerName(name1);
            traveler1.getPhoneNumber().add(number1);
            
            Email email1 = new Email();
            email1.setEmailID("test@travelport.com");
            email1.setType("Home");
            
            traveler1.getEmail().add(email1);

            traveler1.getAddress().add(addrs1);
            req.getBookingTraveler().add(traveler1);
                   
            
            //many rates require a guarantee... we put this in just case but it
            //really should be done in coordination with the values returned
            Guarantee g = new Guarantee();
            g.setType("Guarantee");
            CreditCard ccard = Lesson4.getFakeCreditCard(false);
            g.setCreditCard(ccard);
            req.setGuarantee(g);
            
            GuestInformation gi = new GuestInformation();
            gi.setNumberOfRooms(numRooms);
            NumberOfAdults na = new NumberOfAdults();
            na.setValue(String.valueOf(numAdults));
            gi.setNumberOfAdults(na);
            req.setGuestInformation(gi);
            
            
            //put the rate in that we found was the lowest (from result of details request)
            req.setHotelRateDetail(lowestRate);
            
            //put in the hotel we wanted (from result of details request)
            req.setHotelProperty(property);
            
            //put in the dates of stay (from request to get details)
            req.setHotelStay(stay);
            
            if(Lesson4.getHostTokenRef() != null){
            	HostToken ht =  new HostToken();
            	ht.setHost(Lesson4.getHostTokenRef().getHost());
            	ht.setValue(Lesson4.getHostTokenRef().getValue());
            	req.setHostToken(ht);
            }
            
            WSDLService.hotelReserve.showXML(true);
            
            //always need the billing POS and target branch
            req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(2, 5));
            req.setTargetBranch(System.getProperty("travelport.targetBranch"));
            req.setProviderCode(System.getProperty("travelport.gds"));
            req.setUserAcceptance(Boolean.TRUE);
            
            //System.out.println("HotelReservationCreateReq :  " +req);
            
            HotelCreateReservationRsp createRsp = resv.service(req, null);
            UniversalRecord rec = createRsp.getUniversalRecord();
            System.out.println("Universal Record Locator: "+rec.getLocatorCode());
            HotelReservation rez = rec.getHotelReservation().get(0);
            System.out.println("Hotel reservation Code  : "+rez.getLocatorCode());
            System.out.println("Hotel Total Cost        : "+
                    rez.getHotelRateDetail().getTotal());
            for (String msg : rez.getSellMessage()) {
                System.out.println("                        : "+msg);

            }
            
            cancelReservation(uniPort, rec.getLocatorCode(), rec.getVersion());
        } catch (NumberFormatException e) {
            System.err.println("unable to parse hotel price: " + e.getMessage());
        } catch (HotelFaultMessage e) {
            System.err.println("error reading hotel data: " + e.getMessage());
        } catch (com.travelport.service.universal_v26_0.HotelFaultMessage e) {
			// TODO Auto-generated catch block
        	System.err.println("error in service: " + e.getMessage());
		}

    }
    
    private static void cancelReservation(
			UniversalRecordCancelServicePortType uniPort, String locatorCode,
			BigInteger version) {
		// TODO Auto-generated method stub
		UniversalRecordCancelReq uniCancelReq = new UniversalRecordCancelReq();
		uniCancelReq.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(2, 5));
		uniCancelReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
		uniCancelReq.setUniversalRecordLocatorCode(locatorCode);
		uniCancelReq.setVersion(version);
		try {
			UniversalRecordCancelRsp createRsp = uniPort.service(uniCancelReq);
			List<ProviderReservationStatus> prs = createRsp.getProviderReservationStatus();
			ListIterator<ProviderReservationStatus> prsIterator = prs.listIterator();
			while(prsIterator.hasNext()){
				ProviderReservationStatus cancelInfo = prsIterator.next();
				System.out.println("PNR :"+cancelInfo.getLocatorCode() +"Cancelled Successfully ?" + cancelInfo.isCancelled());
			}
		} catch (UniversalRecordFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("error in Universal Cancel: " + e.getMessage());
		}
	}

	public static String getDescriptiveText(HotelRateDetail rateDetail) {
        StringBuilder description = new StringBuilder();
        List<TypeHotelRateDescription> descList = rateDetail.getRoomRateDescription();
        for (Iterator<TypeHotelRateDescription> descIter = descList.iterator(); descIter.hasNext();) {
            TypeHotelRateDescription desc = (TypeHotelRateDescription) descIter.next();
            if ((desc.getName().equals("Total Includes")) || (desc.getName().equals("Description"))) {
                description.append(desc.getText()+"\n");
            }
        }
        return description.toString();
    }
    
    public static boolean isNonSmoking(String descriptionString) {
        String d=descriptionString.toUpperCase();
        boolean result = false;
        System.out.println("looking for non-smoking:"+descriptionString);
        if ((d.indexOf("NON SMOKING")!=-1) || (d.indexOf("NON-SMOKING")!=-1) ||
                (d.indexOf("NO SMOKING")!=-1) || (d.indexOf("SMOKING PREFERENCE")==-1)) {
            result = true;
        }
        return result;
    }
    
    public static boolean hasGuaranteedComment(HotelRateDetail rateDetail) {
        List<TypeHotelRateDescription> descList = rateDetail.getRoomRateDescription();
        for (Iterator<TypeHotelRateDescription> descIter = descList.iterator(); descIter.hasNext();) {
            TypeHotelRateDescription desc = (TypeHotelRateDescription) descIter.next();
            if (desc.getName().equals("Guarantee")) {
                return true;
            }
        }
        return false;
    }
}
