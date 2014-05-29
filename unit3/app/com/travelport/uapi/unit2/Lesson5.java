package com.travelport.uapi.unit2;

import java.util.Iterator;
import java.util.List;

import com.travelport.schema.common_v15_0.*;
import com.travelport.schema.hotel_v17_0.*;
import com.travelport.service.hotel_v17_0.*;
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

    public static void main(String[] argv) {
        //the hotel search parametrs
        int numAdults=1, numRooms=1, distanceInKm=25, maxScreens=4;
        int daysToCheckin = 7, daysToDeparture = 9;
        String pointOfInterestName="Staples Center";

        HotelSearchServicePortType port = WSDLService.hotelShop.get();
        HotelDetailsServicePortType det = WSDLService.hotelDetails.get();
        WSDLService.hotelDetails.showXML(true);
        HotelReservationServicePortType resv = WSDLService.hotelReserve.get();
        HotelMediaLinksServicePortType media = WSDLService.hotelMedia.get();
        
        WSDLService.hotelReserve.showXML(true);
        try {
            
            HotelSearchResult[] result= 
                Lesson4.findLowestPriceAndClosestToAttraction(port, 
                        pointOfInterestName, distanceInKm,
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
            mods.setNumberOfAdults(1);
            mods.setNumberOfRooms(1);
            
            //we will re-use this again in the booking request
            HotelStay stay = Lesson4.createCheckInAndOut(
                    Lesson4.futureDateAsXML(daysToCheckin),
                    Lesson4.futureDateAsXML(daysToDeparture));
            mods.setHotelStay(stay);
            
            //no sense being on a twin when travelling alone
            HotelBedding bedding = new HotelBedding();
            bedding.setNumberOfBeds(1);
            bedding.setType(TypeBedding.QUEEN);
            mods.getHotelBedding().add(bedding);
            mods.setRateRuleDetail(TypeRateRuleDetail.COMPLETE);
            
            //put the modifiers in place
            deetReq.setHotelDetailsModifiers(mods);
            
            
            //always need the billing POS and target branch
            deetReq.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(2, 5));
            deetReq.setTargetBranch(System.getProperty("travelport.targetBranch"));

            //we put the hotel property back that we got from the shop request
            //no need to tweak with it
            deetReq.setHotelProperty(cheapest.getHotelProperty());
      
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
                    min =  Helper.parseNumberWithCurrency(rateDetail.getTotal());
                } else {
                    System.err.println("Unable to find a price for this hotel!");
                    return;
                }
                String description = getDescriptiveText(rateDetail);
                //has to be the lowest that includes NON-SMOKING and does not
                //require a credit card for a guarantee... note that it would
                //be nice to use rateDetail.isDepositRequired but we can't
                //because that property is DROPPED from the XML when in the
                //false case so we get a NPE...
                boolean g = hasGuaranteedComment(rateDetail); 
                g=false;
                if ((min<lowest) && (isNonSmoking(description)) && (!g)) {
                    lowestRate = rateDetail;
                    lowest = min;
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
            System.out.println("Total Price: "+ lowestRate.getTotal());
            
            //now do a booking
            HotelCreateReservationReq req = new HotelCreateReservationReq();
            
            //only the name and phone are required, but really should be 
            //supplying more data
            BookingTraveler traveler = new BookingTraveler();
            BookingTravelerName name = new BookingTravelerName();
            name.setFirst("Hugh");
            name.setLast("Capet");
            PhoneNumber number = new PhoneNumber();
            number.setLocation("home");
            number.setCountryCode("1");
            number.setAreaCode("212");
            number.setNumber("555-1212");
            traveler.setTravelerType("ADT");
            traveler.setBookingTravelerName(name);
            traveler.getPhoneNumber().add(number);
            req.getBookingTraveler().add(traveler);
            
            //many rates require a guarantee... we put this in just case but it
            //really should be done in coordination with the values returned
            Guarantee g = new Guarantee();
            g.setType("Deposit");
            CreditCard ccard = Lesson4.getFakeCreditCard(false);
            g.setCreditCard(ccard);
            req.setGuarantee(g);
            
            
            //put the rate in that we found was the lowest (from result of details request)
            req.setHotelRateDetail(lowestRate);
            
            //put in the hotel we wanted (from result of details request)
            req.setHotelProperty(property);
            
            //put in the dates of stay (from request to get details)
            req.setHotelStay(stay);
            
            WSDLService.hotelReserve.showXML(true);
            
            //always need the billing POS and target branch
            req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(2, 5));
            req.setTargetBranch(System.getProperty("travelport.targetBranch"));

            resv.service(req, null);
            
        } catch (NumberFormatException e) {
            System.err.println("unable to parse hotel price: " + e.getMessage());
        } catch (HotelFaultMessage e) {
            System.err.println("error reading hotel data: " + e.getMessage());
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
        if ((d.indexOf("NON SMOKING")!=-1) || (d.indexOf("NON-SMOKING")!=-1) ||
                (d.indexOf("NO SMOKING")!=-1)) {
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
