package com.travelport.uapi.unit1;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.travelport.schema.air_v35_0.AirItinerary;
import com.travelport.schema.air_v35_0.AirItinerarySolution;
import com.travelport.schema.air_v35_0.AirPriceReq;
import com.travelport.schema.air_v35_0.AirPriceResult;
import com.travelport.schema.air_v35_0.AirPriceRsp;
import com.travelport.schema.air_v35_0.AirPricingCommand;
import com.travelport.schema.air_v35_0.AirPricingSolution;
import com.travelport.schema.air_v35_0.AirSearchModifiers;
import com.travelport.schema.air_v35_0.AirSegmentRef;
import com.travelport.schema.air_v35_0.AvailabilitySearchReq;
import com.travelport.schema.air_v35_0.AvailabilitySearchRsp;
import com.travelport.schema.air_v35_0.Connection;
import com.travelport.schema.air_v35_0.FlightDetails;
import com.travelport.schema.air_v35_0.FlightDetailsRef;
import com.travelport.schema.air_v35_0.SearchAirLeg;
import com.travelport.schema.air_v35_0.TypeBaseAirSegment;
import com.travelport.schema.common_v35_0.ActionStatus;
import com.travelport.schema.common_v35_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v35_0.BookingTraveler;
import com.travelport.schema.common_v35_0.BookingTravelerName;
import com.travelport.schema.common_v35_0.DeliveryInfo;
import com.travelport.schema.common_v35_0.DeliveryInfo.ShippingAddress;
import com.travelport.schema.common_v35_0.Email;
import com.travelport.schema.common_v35_0.FormOfPayment;
import com.travelport.schema.common_v35_0.PhoneNumber;
import com.travelport.schema.common_v35_0.ResponseMessage;
import com.travelport.schema.common_v35_0.SSR;
import com.travelport.schema.common_v35_0.SearchPassenger;
import com.travelport.schema.common_v35_0.State;
import com.travelport.schema.common_v35_0.TypeResultMessage;
import com.travelport.schema.common_v35_0.TypeStructuredAddress;
import com.travelport.schema.universal_v35_0.AirCreateReservationReq;
import com.travelport.schema.universal_v35_0.AirCreateReservationRsp;
import com.travelport.service.air_v35_0.AirFaultMessage;
import com.travelport.service.universal_v35_0.AirCreateReservationPortType;
import com.travelport.service.universal_v35_0.AvailabilityFaultMessage;
import com.travelport.tutorial.support.WSDLService;


public class Lesson2 {
	private static final String travelerRef = "gr8AVWGCR064r57Jt0+8bA==";

	//
	// PROGRAM ENTRY POINT
	//
	public static void main(String[] argv) throws FileNotFoundException, AvailabilityFaultMessage, com.travelport.service.universal_v35_0.AirFaultMessage {
		
		try {
			//make the request... paris to chattanooga TN USA
			String from ="MEL",to="SYD";
			
			//staying a week ... two months from now.. roundtrip
			AvailabilitySearchRsp rsp = search(from, to, 
					Helper.daysInFuture(60), Helper.daysInFuture(68));
			
			//make tables that map the "key" (or a reference) to the proper
			//segment and the proper flight details
			Helper.AirSegmentMap allSegments = Helper.createAirSegmentMap(
					rsp.getAirSegmentList().getAirSegment());
			Helper.FlightDetailsMap allDetails = Helper.createFlightDetailsMap(
					rsp.getFlightDetailsList().getFlightDetails());
			
			//Each "solution" is for a particular part of the journey... on
			//a round trip there will be two of thes
			List<AirItinerarySolution> solutions = rsp.getAirItinerarySolution();
			AirItinerarySolution outboundSolution = solutions.get(0);
			AirItinerarySolution inboundSolution = solutions.get(1);
			
			//bound the routings by using the connections
			List<AirItinerary> out = buildRoutings(outboundSolution, 0, allSegments, allDetails);
			List<AirItinerary> in = buildRoutings(inboundSolution, 1, allSegments, allDetails);
			
			//merge in and out itins so we can get pricing for whole deal
			List<AirItinerary> allItins = mergeOutboundAndInbound(out, in);
			
			//walk the itineraries, displaying as we go
			for (Iterator<AirItinerary> allIter = allItins.iterator(); allIter.hasNext();) {
				AirItinerary itin = allIter.next();
				
				List<TypeBaseAirSegment> segments = itin.getAirSegment();
				for (Iterator<TypeBaseAirSegment> iter = segments.iterator(); iter.hasNext();) {
					TypeBaseAirSegment airSegment = (TypeBaseAirSegment) iter.next();
					String carrier="??";
					String flightNum="???";
					if (airSegment!=null) {
					    if (airSegment.getCarrier()!=null) {
					        carrier = airSegment.getCarrier();
					    }
					    if (airSegment.getFlightNumber()!=null) {
					        flightNum = airSegment.getFlightNumber();
					    }
					}
					System.out.print(carrier+"#"+flightNum);
					String o="???",d="???";
					if (airSegment!=null) {
                        if (airSegment.getOrigin()!=null) {
                            o=airSegment.getOrigin();
                        }
                        if (airSegment.getDestination()!=null) {
                            d=airSegment.getDestination();
                        }
					}
					System.out.print(" from "+o+" to "+ d);
					String dtime = "??:??";
					if (airSegment!=null) {
					    if (airSegment.getDepartureTime()!=null) {
					        dtime = airSegment.getDepartureTime();
					    }
					}
					System.out.print(" at "+dtime);
					if ((airSegment!=null) && (airSegment.getFlightTime()!=null)) {
							System.out.println(" (flight time "+airSegment.getFlightTime()+" mins)");
					} else {
						System.out.println();
					}
				}
				System.out.println("-----------");
				
				try {
					AirPriceRsp priceRsp = displayItineraryPrice(itin);
					if(priceRsp.getAirPriceResult() != null){
						AirCreateReservationRsp airBookRsp = bookItinerary(priceRsp);
						if(airBookRsp != null){
							if(airBookRsp.getUniversalRecord() != null){
								System.out.println("The Universal Record Locator for this reservation : " + airBookRsp.getUniversalRecord().getLocatorCode());
								break;
							}
						}
					}
				} catch (AirFaultMessage e) {
					System.err.println("*** Unable to price itinerary:"+e.getMessage());
				}

			}
		} catch (AirFaultMessage e) {
			System.err.println("Error:"+e.getMessage());
		}
	}
	
	/**
	 * Take the inbound and outbound solutions and merge them into full 
	 * itineraries and return the resulting list (which is size of 
	 * in times size of out in terms of number of elements)
	 * @param out
	 * @param in
	 * @result resulting merged itineraries
	 */
	public static List<AirItinerary> mergeOutboundAndInbound(List<AirItinerary> out,
			List<AirItinerary> in) {
		
		List<AirItinerary> result = new ArrayList<AirItinerary>();
		
		//each of the inbounds
		for (Iterator<AirItinerary> initer = in.iterator(); initer.hasNext();) {
			AirItinerary inItin = (AirItinerary) initer.next();

			List<TypeBaseAirSegment> inSegs = inItin.getAirSegment();
			
			//each of the outbounds
			for (Iterator<AirItinerary> iterator = out.iterator(); iterator.hasNext();) {
				AirItinerary outItin = (AirItinerary) iterator.next();
				
				List<TypeBaseAirSegment> outSegs = outItin.getAirSegment();
				
				//create a new merged itin with the in + out segmens
				AirItinerary merged = new AirItinerary();
				
				//note the ORDER is important here... we want to end up
				//with the inSegs before the outSegs and addAll puts the
				//new objects at the front
				merged.getAirSegment().addAll(outSegs);
				merged.getAirSegment().addAll(inSegs);
				result.add(merged);
			}
		}
		
		return result;
	}
	/**
	 * Walk a solution to build a list of itineraries that can be used in
	 * a pricing request.  These itineraries only are for "half" of a
	 * round trip.
	 */
	public static List<AirItinerary> buildRoutings(AirItinerarySolution soln,
			int resultingGroupNumber,
			Helper.AirSegmentMap segmentMap, Helper.FlightDetailsMap detailMap) {
		ArrayList<AirItinerary> result = new ArrayList<AirItinerary>();
		
		//walk the list of segments in this itinerary... but convert them from
		//references to real segments for use in pricing
		List<AirSegmentRef> legs = soln.getAirSegmentRef();
		ArrayList<TypeBaseAirSegment> segs = new ArrayList<TypeBaseAirSegment>();
		//when this loop is done, we have a list of segments that are good to
		//go for use in a pricing request... 
		for (Iterator<AirSegmentRef> segIter = legs.iterator(); segIter.hasNext();) {
			AirSegmentRef ref = segIter.next();
			TypeBaseAirSegment realSegment = segmentMap.getByRef(ref);
			segs.add(cloneAndFixFlightDetails(realSegment, resultingGroupNumber, detailMap));
		}
		
		//a connection indicates that elements in the list of segs have to
		//be put together to make a routing
		List<Connection> conns = soln.getConnection();
	
		for (Iterator<Connection> connIter = conns.iterator(); connIter.hasNext();) {
			Connection connection = (Connection) connIter.next();
			AirItinerary itin = new AirItinerary();
			int idx = connection.getSegmentIndex();
			itin.getAirSegment().add(segs.get(idx));
			itin.getAirSegment().add(segs.get(idx+1));
			result.add(itin);
			segs.set(idx, null);
			segs.set(idx+1, null);
			//what happens when there is a double connection?
		}
		
		//those that are left are direct flights (no connections)
		for (int i=0; i<segs.size();++i) {
			TypeBaseAirSegment segment = segs.get(i);
			if (segment!=null) {
				AirItinerary itin = new AirItinerary();
				itin.getAirSegment().add(segment);
				result.add(itin);
			}
		}
		return result;
	}
	
	/**
	 * This is not a true clone because we don't copy all the fields; just the
	 * ones we need to do pricing with this segment.
	 * 
	 * @param orig segment to "clone"
	 * @return a clone of the input segment, with any reference to flight
	 * details adjusted to be the actual details
	 */
	public static TypeBaseAirSegment cloneAndFixFlightDetails(TypeBaseAirSegment orig, 
			int resultingGroupNumber, Helper.FlightDetailsMap detailMap) {
		TypeBaseAirSegment result = new TypeBaseAirSegment();
		result.setCarrier(orig.getCarrier());
		result.setClassOfService(orig.getClassOfService());
		result.setFlightNumber(orig.getFlightNumber());
		result.setKey(orig.getKey());
		result.setDepartureTime(orig.getDepartureTime());
		result.setArrivalTime(orig.getArrivalTime());
		result.setDestination(orig.getDestination());
		result.setOrigin(orig.getOrigin());
		result.setProviderCode(System.getProperty("travelport.gds"));
		result.setGroup(resultingGroupNumber);
		
		//adjust flight detail references to be REAL flight details
		List<FlightDetailsRef> refs = orig.getFlightDetailsRef();
		for (Iterator<FlightDetailsRef> refsIter = refs.iterator(); refsIter.hasNext();) {
			FlightDetailsRef ref = (FlightDetailsRef) refsIter.next();
			FlightDetails deets = detailMap.getByRef(ref);
			result.getFlightDetails().add(deets);
		}
		return result;
	}
	
	/**
	 * Create a pricing request for a particular itinerary, evaluate it and
	 * then display the result (which might be an error).
	 * 
	 * @param itin the itinerary we are going to process
	 * @throws AirFaultMessage
	 */
	public static AirPriceRsp displayItineraryPrice(AirItinerary itin) throws AirFaultMessage {
		AirPriceRsp priceRsp = priceItinerary(itin);
		
		//print price result
		List<AirPriceResult> prices = priceRsp.getAirPriceResult();
		for (Iterator<AirPriceResult> i = prices.iterator(); i.hasNext();) {
			AirPriceResult result = (AirPriceResult) i.next();
			if (result.getAirPriceError()!=null) {
				TypeResultMessage msg= result.getAirPriceError();
				System.err.println("Error during pricing operation:"+
						msg.getType()+":"+msg.getValue());
			} else {
				List<AirPricingSolution> priceingSolns = result.getAirPricingSolution();
				Iterator<AirPricingSolution> aps = priceingSolns.iterator();
				while(aps.hasNext()){
					AirPricingSolution soln = aps.next();
					System.out.print("Price:"+ soln.getTotalPrice());
					System.out.print(" [BasePrice "+soln.getBasePrice() +", ");
					System.out.println("Taxes "+soln.getTaxes()+"]");
				}
			}
		}
		
		return priceRsp;
	}

	private static AirCreateReservationRsp bookItinerary(AirPriceRsp priceRsp) throws FileNotFoundException, AvailabilityFaultMessage, com.travelport.service.universal_v35_0.AirFaultMessage {
		// TODO Auto-generated method stub
		AirCreateReservationReq airBookReq = new AirCreateReservationReq();
		
		airBookReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		BillingPointOfSaleInfo posInfo = new BillingPointOfSaleInfo();
		posInfo.setOriginApplication("UAPI");
		airBookReq.setBillingPointOfSaleInfo(posInfo);
		
		BookingTraveler bookingTraveler = createBookingTravelerDetails();	
		
		
		FormOfPayment fop = new FormOfPayment();
		fop.setType("Cash");
		fop.setKey("jwt2mcK1Qp27I2xfpcCtAw==");

		airBookReq.getFormOfPayment().add(fop);
		
		AirPricingSolution soln = null;
		
		if(priceRsp.getAirPriceResult() != null){
			List<AirPriceResult> prices = priceRsp.getAirPriceResult();
			for (Iterator<AirPriceResult> i = prices.iterator(); i.hasNext();) {
				AirPriceResult result = (AirPriceResult) i.next();
				if (result.getAirPriceError()!=null) {
					TypeResultMessage msg= result.getAirPriceError();
					System.err.println("Error during pricing operation:"+
							msg.getType()+":"+msg.getValue());
				} else {
					List<AirPricingSolution> priceingSolns = result.getAirPricingSolution();
					Iterator<AirPricingSolution> aps = priceingSolns.iterator();
					if(aps.hasNext()){
						 soln = aps.next();
					}
				}
			}
		}
		
		String carrier = "";
		
		if(soln != null){			
			if(priceRsp.getAirItinerary().getAirSegment() != null){
				Iterator<TypeBaseAirSegment> segmentIterator = priceRsp.getAirItinerary().getAirSegment().iterator();
				while (segmentIterator.hasNext()){
					TypeBaseAirSegment segment = segmentIterator.next();
					carrier = segment.getCarrier();
					soln.getAirSegment().add(segment);					
				}
			}
			
			if(soln.getAirSegmentRef() != null){
				soln.getAirSegmentRef().clear();
			}
			
			airBookReq.setAirPricingSolution(soln);
		}
		
		SSR ssr = new SSR();
		
		if(carrier.length() > 0){
			ssr.setCarrier(carrier);
			ssr.setFreeText("P/US/F1234567/US/17SEP69/M/24SEP18/SMITH/JACK -1SMITH/JACKMR");
			ssr.setKey("+5x5xfQmRVGhwHtTOkvqLg==");
			ssr.setType("DOCS");
			
			bookingTraveler.getSSR().add(ssr);
		}
		
		airBookReq.getBookingTraveler().add(bookingTraveler);
		
		ActionStatus actionStatus = new ActionStatus();
		actionStatus.setProviderCode(System.getProperty("travelport.gds"));
		actionStatus.setTicketDate("T*");
		actionStatus.setType("ACTIVE");
		
		airBookReq.getActionStatus().add(actionStatus);
		
		//airBookRsp = new AirCreateReservationRsp();
		//WSDLService.airReserve.showXML(true);
		
		AirCreateReservationPortType resv = WSDLService.airReserve.get();
		
		return resv.service(airBookReq, null);
	}

	private static BookingTraveler createBookingTravelerDetails() {
		// TODO Auto-generated method stub
		BookingTraveler bookingTraveler = new BookingTraveler();
		bookingTraveler.setTravelerType("ADT");
		bookingTraveler.setKey(travelerRef);
		bookingTraveler.setGender("M");
		
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
		
		bookingTraveler.setDOB(xgc);

		BookingTravelerName name = new BookingTravelerName();
		name.setFirst("Jack");
		name.setLast("Smith");
		name.setPrefix("Mr");
		
		bookingTraveler.setBookingTravelerName(name);
		
		DeliveryInfo address = new DeliveryInfo();
		
		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setAddressName("Home");
		shippingAddress.setCity("Denver");
        State vt = new State();
        vt.setValue("CO");            
        shippingAddress.setState(vt);
        
        shippingAddress.getStreet().add("2914 N. Dakota Avenue");
        
        shippingAddress.setCountry("US");
        shippingAddress.setPostalCode("80206");
        
        address.setShippingAddress(shippingAddress);
        
        bookingTraveler.getDeliveryInfo().add(address);
        
        PhoneNumber phone = new PhoneNumber();
        phone.setAreaCode("303");
        phone.setNumber("3333333");
        phone.setCountryCode("1");
        phone.setLocation("DEN");
        
        bookingTraveler.getPhoneNumber().add(phone);
        
        Email email = new Email();
        email.setEmailID("test@travelport.com");
        email.setType("Home");
        
		bookingTraveler.getEmail().add(email);
		
		TypeStructuredAddress generalAddress = new TypeStructuredAddress();
		
		generalAddress.setAddressName("Home");
		generalAddress.setCity("Denver");
        State vt1 = new State();
        vt1.setValue("CO");            
        generalAddress.setState(vt1);
        
        generalAddress.getStreet().add("2914 N. Dakota Avenue");
        
        generalAddress.setCountry("US");
        generalAddress.setPostalCode("80206");
        
        bookingTraveler.getAddress().add(generalAddress);
        
		return bookingTraveler;
	}

	/**
	 * This just does the price computation so it is easy to re-use.
	 * 
	 * @param itin
	 * @return
	 * @throws AirFaultMessage 
	 */
	public static AirPriceRsp priceItinerary(AirItinerary itin) throws AirFaultMessage {
		//now lets try to price it
		AirPriceReq priceReq = new AirPriceReq();
		
		//price the itinerary provided
		priceReq.setAirItinerary(itin);
		
		//set cabin
		AirPricingCommand command = new AirPricingCommand();
		command.setCabinClass("Economy");
		priceReq.getAirPricingCommand().add(command);
		
		//our branch
		priceReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
		//one adult passenger
		SearchPassenger adult = new SearchPassenger();
		adult.setCode("ADT");
		adult.setBookingTravelerRef(travelerRef);
		priceReq.getSearchPassenger().add(adult);
		
		//add point of sale (v18_0)
		AirReq.addPointOfSale(priceReq, "UAPI");	
		
		
		//make the request to tport
		//WSDLService.airPrice.showXML(true);
		return WSDLService.airPrice.get().service(priceReq);
}

	/**
	 * Do a search for availability for a traveller.
	 * 
	 * @param origin airport code
	 * @param dest airport code
	 * @param dateOut date of departure in yyyy-MM-dd format
	 * @param dateBack date of return in yyyy-MM-dd format
	 * @return raw response object
	 */
	public static AvailabilitySearchRsp  search(String origin,
			String dest, String dateOut, String dateBack) throws AirFaultMessage{

		AvailabilitySearchReq request = new AvailabilitySearchReq();
		AvailabilitySearchRsp response;
		request.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		//set POS
		AirReq.addPointOfSale(request, "UAPI");
		
		//set the GDS via a search modifier
		AirSearchModifiers modifiers = AirReq.createModifiersWithProviders(System.getProperty("travelport.gds"));
		request.setAirSearchModifiers(modifiers);

		//R/T journey
		SearchAirLeg outbound = AirReq.createSearchLeg(origin, dest);
		AirReq.addSearchDepartureDate(outbound, dateOut);
		AirReq.addSearchEconomyPreferred(outbound);

		//coming back
		SearchAirLeg ret = AirReq.createSearchLeg(dest, origin);
		AirReq.addSearchDepartureDate(ret, dateBack);
		//put traveller in econ
		AirReq.addSearchEconomyPreferred(ret);
		
		

		//put the legs in the request
		List<SearchAirLeg> legs = request.getSearchAirLeg();
		legs.add(outbound);
		legs.add(ret);
		
		//to show the XML you are sendinging and receiving on this port
		//WSDLService.airAvailability.showXML(true);
		response = WSDLService.airAvailability.get().service(request);

		//print out any messages that the GDS sends back
		for (Iterator<ResponseMessage> iterator = response.getResponseMessage().iterator(); iterator.hasNext();) {
			ResponseMessage message = (ResponseMessage) iterator.next();
			System.out.println("MESSAGE:"+message.getProviderCode()+" ["+message.getType() 
					+"] "+message.getValue());
		}
		
		return response;
	}


}
