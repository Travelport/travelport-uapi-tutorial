package com.travelport.uapi.unit2;

import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.travelport.schema.air_v26_0.AirItinerary;
import com.travelport.schema.air_v26_0.AirItinerarySolution;
import com.travelport.schema.air_v26_0.AirPriceResult;
import com.travelport.schema.air_v26_0.AirPriceRsp;
import com.travelport.schema.air_v26_0.AirPricingSolution;
import com.travelport.schema.air_v26_0.AirSegmentRef;
import com.travelport.schema.air_v26_0.AvailabilitySearchRsp;
import com.travelport.schema.air_v26_0.FlightDetails;
import com.travelport.schema.air_v26_0.TypeBaseAirSegment;
import com.travelport.service.air_v26_0.AirFaultMessage;
import com.travelport.service.universal_v26_0.AvailabilityFaultMessage;
import com.travelport.uapi.unit1.Helper;
import com.travelport.uapi.unit1.Lesson2;

public class Lesson4bad {
	
	
	
	
	private static AirItinerary itinerary;

	public static void main(String[] args){
		CreateResvSvcTest resv = new CreateResvSvcTest();
		try {
			resv.createCancelTest();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			System.err.println("unable to parse Air request: " + e.getMessage());
		} catch (AirFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("Error reading Air Data: " + e.getMessage());
		} catch (AvailabilityFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("error in service: " + e.getMessage());
		}
	}

	/**
	 * Walk through all the available search results and pick the one with the
	 * shortest travel time.  Assumes the trip has two solutions, one for out
	 * and the other for back.  This really works out to "prefer direct 
	 * flights" in most cases.
	 * 
	 * @param rsp 
	 * @return
	 */
	public static AirItinerary pickShortestItinerary(AvailabilitySearchRsp rsp) {
		AirItinerary shortest = null;
		long shortestTravelTime = Long.MAX_VALUE;
		
		Helper.AirSegmentMap allSegments = 
				Helper.createAirSegmentMap(rsp.getAirSegmentList().getAirSegment());
		Helper.FlightDetailsMap allDetails = Helper.createFlightDetailsMap(
				rsp.getFlightDetailsList().getFlightDetails());

		List<AirItinerarySolution> allSoln = rsp.getAirItinerarySolution();
		AirItinerarySolution outSoln = allSoln.get(0);
		AirItinerarySolution retSoln = allSoln.get(1);
		
		List<AirItinerary> out = Lesson2.buildRoutings(outSoln, 0,  allSegments, 
				allDetails);
		List<AirItinerary> ret = Lesson2.buildRoutings(retSoln, 1, allSegments, 
				allDetails);
		List<AirItinerary> candidates = Lesson2.mergeOutboundAndInbound(out, ret);
		
		
		for (Iterator<AirItinerary> candIter = candidates.iterator(); candIter.hasNext();) {
			AirItinerary itin = (AirItinerary) candIter.next();
			long total = 0l;

			List<TypeBaseAirSegment> segmentsInItin = itin.getAirSegment();
			for (Iterator<TypeBaseAirSegment> segIter = segmentsInItin.iterator(); segIter.hasNext();) {
				TypeBaseAirSegment seg = (TypeBaseAirSegment) segIter.next();
				
				//Flight details are already converted from refs to real details
				List<FlightDetails> detailsInItin = seg.getFlightDetails();
				for (Iterator<FlightDetails> detailsIter = detailsInItin.iterator(); detailsIter.hasNext();) {
					FlightDetails detail = (FlightDetails) detailsIter.next();
					if (detail.getFlightTime()==null){
						throw new RuntimeException("Unable to find flight details!");
					} else {
						total+=detail.getFlightTime().longValue();
					}
				}
			}
			
			if (total<shortestTravelTime) {
				shortest = itin;
				shortestTravelTime=total;
			}
		}
		
		if (shortest==null) {
			throw new RuntimeException("Unable to find the shortest itinerary!");
		}
		System.out.println("Shortest amount of flight time is "+shortestTravelTime+" minutes...");
		return shortest;
	}
	

	/**
	 * Extract the first AirPricingSolution, if any, from an AirPriceResponse.
	 * 
	 * @param priceRsp  The pricing response object
	 * @return the first pricing solution found, with segments adjusted for
	 * use in an outbound message
	 */
	public static AirPricingSolution getPriceSolution(AirPriceRsp priceRsp) {
		List<AirPriceResult> r = priceRsp.getAirPriceResult();
		
		AirPricingSolution soln = null;
		
		for (Iterator<AirPriceResult> resultIter = r.iterator(); resultIter.hasNext();) {
			AirPriceResult airPriceResult = (AirPriceResult) resultIter.next();
			List<AirPricingSolution> priceSoln = airPriceResult.getAirPricingSolution();
			for(Iterator<AirPricingSolution> solunIter = priceSoln.iterator(); solunIter.hasNext();){
				while(solunIter.hasNext()) {
					soln=solunIter.next();
					break;
				}
			}
		}
		if (soln==null) {
			throw new RuntimeException("Unable to find any Pricing Solutions!");
		}
		
		Helper.AirSegmentMap allSegs = 
				Helper.createAirSegmentMap(priceRsp.getAirItinerary().getAirSegment());
		
		//Adjust segment refs to be real segments
		List<AirSegmentRef> refs = soln.getAirSegmentRef();
		for (Iterator<AirSegmentRef> refIter = refs.iterator(); refIter.hasNext();) {
			AirSegmentRef ref = (AirSegmentRef) refIter.next();
			soln.getAirSegment().add(allSegs.getByRef(ref));
		}
		soln.getAirSegmentRef().clear();

		
		return soln;
	}

	/**
	 * Convenience method expressing the whole search and price workflow.
	 * Useful for understanding other parts of the system that need
	 * an air solution.
	 * 
	 * @param origin airport code
	 * @param dest airport code
	 * @param depInFutureDays departure date
	 * @param retInFutureDays return date 
	 * @return
	 * @throws AirFaultMessage 
	 */
	public static AirPricingSolution searchPriceWorkflow(String origin, String dest,
			int depInFutureDays, int retInFutureDays) throws AirFaultMessage {
		
		AvailabilitySearchRsp availRsp=  Lesson2.search("DEN", "SFO",
				Helper.daysInFuture(67), Helper.daysInFuture(81));
		AirItinerary itin = Lesson4bad.pickShortestItinerary(availRsp);
		AirPriceRsp priceRsp = Lesson2.priceItinerary(itin);
		setItinerary(itin);
		return stripNonXmitSections(Lesson4bad.getPriceSolution(priceRsp));
	}
	
	/**
	 * Strip some data out of an air pricing solution that we received
	 * so it is suitable to send.  
	 * 
	 * @return the same object that was given as parameter, but stripped
	 * of some unnecessary fields
	 */
	public static AirPricingSolution stripNonXmitSections(AirPricingSolution soln) {
	    /*
        <air:AirSegment Key="0T" Group="0" Carrier="AA" FlightNumber="789" ProviderCode="1G" 
                Origin="ORD" Destination="DEN" DepartureTime="2012-04-01T13:05:00.000-06:00" 
                ArrivalTime="2012-04-02T14:35:00.000-07:00" Distance="903" ClassOfService="Y" 
                ETicketability="Yes" Equipment="738" ChangeOfPlane="false" 
                GuaranteedPaymentCarrier="No" TravelOrder="1" 
                OptionalServicesIndicator="false" AvailabilitySource="StatusOverlaid" 
                ParticipantLevel="Secure Sell" LinkAvailability="true" 
                PolledAvailabilityOption="Polled avail exists">
        */
	    /*
	     <ns2:AirSegment Group="0" Carrier="AF" FlightNumber="84" ClassOfService="L" 
	     ChangeOfPlane="false" OptionalServicesIndicator="false" FlightTime="670" 
	     TravelTime="670" Distance="5573" Origin="CDG" Destination="SFO" 
	     DepartureTime="2012-07-11T10:35:00.000+02:00" 
	     ArrivalTime="2012-07-11T12:45:00.000-07:00" ProviderCode="1G" Key="0T" 
	     TravelOrder="0"/>

	     */
	    @SuppressWarnings("unused")
		long travelOrder = 1;
	    for (Iterator<TypeBaseAirSegment> iterator = soln.getAirSegment().iterator(); iterator.hasNext();) {
	    	TypeBaseAirSegment seg = (TypeBaseAirSegment) iterator.next();
            //seg.setTravelOrder(BigInteger.valueOf(travelOrder));
            seg.getFlightDetails().clear();
            //travelOrder++;            
            List<TypeBaseAirSegment> itinList = getItinerary().getAirSegment();
            Iterator<TypeBaseAirSegment> itinIte = itinList.iterator();
            if(itinIte.hasNext()){
            	TypeBaseAirSegment airSeg = itinIte.next();
            	seg.setETicketability(airSeg.getETicketability());
            	seg.setEquipment(airSeg.getEquipment());
                //seg.setParticipantLevel_0020("Secure Sell");
                seg.setGuaranteedPaymentCarrier(airSeg.getGuaranteedPaymentCarrier());
                seg.setAvailabilitySource(airSeg.getAvailabilitySource());
                seg.setLinkAvailability(Boolean.TRUE);
                seg.setPolledAvailabilityOption(airSeg.getPolledAvailabilityOption());
                itinList.remove(airSeg);
            }            
        }
	    soln.getAirPricingInfo().clear();
	    soln.getFareNote().clear();
	    soln.setOptionalServices(null);
	    return soln;
	}

	/**
	 * @return the itinerary
	 */
	public static AirItinerary getItinerary() {
		return itinerary;
	}

	/**
	 * @param itinerary the itinerary to set
	 */
	public static void setItinerary(AirItinerary itinerary) {
		Lesson4bad.itinerary = itinerary;
	}
	 
}
