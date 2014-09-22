package com.travelport.uapi.unit1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.travelport.schema.air_v29_0.AirItinerary;
import com.travelport.schema.air_v29_0.AirItinerarySolution;
import com.travelport.schema.air_v29_0.AirPriceReq;
import com.travelport.schema.air_v29_0.AirPriceResult;
import com.travelport.schema.air_v29_0.AirPriceRsp;
import com.travelport.schema.air_v29_0.AirPricingCommand;
import com.travelport.schema.air_v29_0.AirPricingSolution;
import com.travelport.schema.air_v29_0.AirSearchModifiers;
import com.travelport.schema.air_v29_0.AirSegmentRef;
import com.travelport.schema.air_v29_0.AvailabilitySearchReq;
import com.travelport.schema.air_v29_0.AvailabilitySearchRsp;
import com.travelport.schema.air_v29_0.Connection;
import com.travelport.schema.air_v29_0.FlightDetails;
import com.travelport.schema.air_v29_0.FlightDetailsRef;
import com.travelport.schema.air_v29_0.SearchAirLeg;
import com.travelport.schema.air_v29_0.TypeBaseAirSegment;
import com.travelport.schema.common_v29_0.ResponseMessage;
import com.travelport.schema.common_v29_0.SearchPassenger;
import com.travelport.schema.common_v29_0.CabinClass;
import com.travelport.schema.common_v29_0.TypeResultMessage;
import com.travelport.service.air_v29_0.AirFaultMessage;
import com.travelport.tutorial.support.WSDLService;


public class Lesson2 {
	private static final String travelerRef = "gr8AVWGCR064r57Jt0+8bA==";

	//
	// PROGRAM ENTRY POINT
	//
	public static void main(String[] argv) {
		
		try {
			//make the request... paris to chattanooga TN USA
			String from ="CDG",to="CHA";
			
			//staying a week ... two months from now.. roundtrip
			AvailabilitySearchRsp rsp = search(from, to, 
					Helper.daysInFuture(60), Helper.daysInFuture(67));
			
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
				try {
					displayItineraryPrice(itin);
				} catch (AirFaultMessage e) {
					System.err.println("*** Unable to price itinerary:"+e.getMessage());
				}
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
	public static void displayItineraryPrice(AirItinerary itin) throws AirFaultMessage {
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
