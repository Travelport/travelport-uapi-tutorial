package com.travelport.uapi.unit1;

import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.travelport.schema.air_v35_0.AirPricingSolution;
import com.travelport.schema.air_v35_0.AirSegmentRef;
import com.travelport.schema.air_v35_0.TypeBaseAirSegment;
import com.travelport.schema.rail_v35_0.RailJourney;
import com.travelport.schema.rail_v35_0.RailJourneyRef;
import com.travelport.schema.rail_v35_0.RailPricingSolution;
import com.travelport.schema.rail_v35_0.RailSegment;
import com.travelport.schema.rail_v35_0.RailSegmentRef;

/**
 * Utility class for making a decent-looking display out of an itinerary.
 */
public class PrintableItinerary {
	protected Helper.AirSegmentMap airSegs;
	protected AirPricingSolution airSolution;
	protected Helper.RailJourneyMap railJourneys;
	protected Helper.RailSegmentMap railSegments;
	protected RailPricingSolution railSolution;
	protected String roundTripTurnaround;
	
	/**
	 * Create something that can be printed out decently for a human. 
	 * If roundTripTurnaround is not null, it will be
	 * used in separating the outbound journey from the return
	 * 
	 * @param solution the pricing solution that should be displayed
	 * @param seg segment map of all segments in the result
	 * @param roundTripTurnaround null or airport name that is destination
	 */
	public PrintableItinerary(AirPricingSolution solution, Helper.AirSegmentMap seg,
			String roundTripTurnaround) {
		this.airSegs = seg;
		this.airSolution = solution;
		this.roundTripTurnaround = roundTripTurnaround;
	}
	/**
	 * Create rail itinerary that can be printed out decently.
	 * If roundTripTurnaround is not null, it will be
	 * used in separating the outbound journey from the return
	 * 
	 * @param solution the rail pricing solution that should be displayed
	 * @param seg segment map of all rail segments in the result
	 * @param roundTripTurnaround null or airport name that is destination
	 */
	public PrintableItinerary(RailPricingSolution solution, Helper.RailJourneyMap jour,
			Helper.RailSegmentMap seg) {
		this.railJourneys = jour;
		this.railSolution = solution;
		this.railSegments = seg;
	}
	/**
	 * Conversion of this object to a string is its primary job. 
	 */
	public String toString() {
		StringBuilder result = new StringBuilder();
		Formatter fmt = new Formatter(result, Locale.US);
		if (airSegs!=null) {
			printAir(fmt);
		} else {
			printRail(fmt);
		}
		return result.toString();

	}
	public void printRail(Formatter fmt) {
		//print out the segments first
		List<RailJourneyRef> journeyKeys = railSolution.getRailJourneyRef();
		for (Iterator<RailJourneyRef> iterator =journeyKeys.iterator(); iterator.hasNext();) {
			RailJourneyRef journeyRef = (RailJourneyRef) iterator.next();
			//looking the journey by its key
			RailJourney j = railJourneys.getByRef(journeyRef);
			printJourney(j, fmt);
			if (j.getDestination().equals(roundTripTurnaround)) {
				fmt.format("%s","\n\n");
			}
		}
		
		fmt.format("Total Price %s", railSolution.getTotalPrice());
	}
	public void printAir(Formatter fmt) {
		//print out the segments first
		List<AirSegmentRef> segKeys = airSolution.getAirSegmentRef();
		for (Iterator<AirSegmentRef> iterator = segKeys.iterator(); iterator.hasNext();) {
			AirSegmentRef airSegmentRef = (AirSegmentRef) iterator.next();
			//looking the leg by its key
			TypeBaseAirSegment leg = airSegs.getByRef(airSegmentRef);
			printLeg(leg, fmt);
			if (leg.getDestination().equals(roundTripTurnaround)) {
				fmt.format("%s","\n\n");
			}
		}
		
		fmt.format("Base Price: %s   Total Price %s", 
				airSolution.getBasePrice(),
				airSolution.getTotalPrice());
		
	}
	/**
	 * Print out some details about a segment.  This is far from all
	 * the available information.
	 * 
	 * @param segment the segment to be displayed
	 * @param fmt the formatter to use to display the data
	 */
	public void printLeg(TypeBaseAirSegment segment, Formatter fmt) {
		Date dep = Helper.dateFromISO8601(segment.getDepartureTime());
		fmt.format("AIR Departing from %3s to %3s on %Tc\n",
				segment.getOrigin(), 
				segment.getDestination(), dep);
		fmt.format("         Flight [%2s]#%4s  Flight time: %s minutes\n", 
				segment.getCarrier(), 
				segment.getFlightNumber(), segment.getFlightTime());
		fmt.format("                           Arrive %Tc\n", 
				Helper.dateFromISO8601(segment.getArrivalTime()));
	}
	public void printJourney(RailJourney journey, Formatter fmt) {
		Date dep = Helper.dateFromISO8601(journey.getDepartureTime());

		fmt.format("RAIL (%s) From %s to %s on %Tc\n",
				journey.getJourneyDirection(),
				journey.getOriginStationName(),
				journey.getDestinationStationName(), dep);
		
		List<RailSegmentRef> onThisJourney = journey.getRailSegmentRef();
		for (Iterator<RailSegmentRef> rsIter = onThisJourney.iterator(); rsIter.hasNext();) {
			RailSegment railSegment = railSegments.get(rsIter.next().getKey());
			if (railSegment.getOperatingCompany()==null) {
				fmt.format("         METRO");
			} else {
				fmt.format("         %s[%2s] Train #%4s  ",
						railSegment.getOperatingCompany().getName(), 
						railSegment.getOperatingCompany().getCode(),
						railSegment.getTrainNumber());
			}
			fmt.format(" --- From "+railSegment.getOriginStationName()+" to "+railSegment.getDestinationStationName());
			if (railSegment.getTravelTime()!=null) {
				fmt.format("Travel time: %s minutes\n", railSegment.getTravelTime());
			} else {
				fmt.format("\n");
			}
		}
		fmt.format("                           Arrive %Tc\n", 
				Helper.dateFromISO8601(journey.getArrivalTime()));
	}

}
