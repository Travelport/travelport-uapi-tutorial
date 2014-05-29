package com.travelport.uapi.unit1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import com.travelport.schema.air_v18_0.*;
import com.travelport.service.air_v18_0.AirFaultMessage;
import com.travelport.tutorial.support.WSDLService;

public class AirSvcTest {

	public static String MY_APP_NAME="tutorial_tests";
	
	@Test
	public void availability() throws AirFaultMessage {
		AvailabilitySearchReq request = new AvailabilitySearchReq();
		AvailabilitySearchRsp rsp;
		
		setupRequestForSearch(request);
		
		rsp=WSDLService.airAvailability.get().service(request);
		//these checks are just sanity that we can make an availability request
		assertThat(rsp.getAirItinerarySolution().size(), is(not(0)));
		assertThat(rsp.getAirSegmentList().getAirSegment().size(), is(not(0)));
	}


	
	@Test
	public void lowFareSearch() throws ParseException, AirFaultMessage {
		LowFareSearchReq request = new LowFareSearchReq();
		LowFareSearchRsp response;
		String myTraceId = "ltk-007";
		
		request.setTraceId(myTraceId);//sanity
		
		setupRequestForSearch(request);

		//2 adults travelling, needed for a low cost search
		AirReq.addAdultPassengers(request, 2);

		//do the work
		response = WSDLService.airShop.get().service(request);
		
		//sanity cechk
		assertThat(myTraceId, is(equalTo(request.getTraceId())));
		
		//hard to say what the response exactly *SHOULD* be but we should
		//not have a bunch of null or empty values!
		assertThat(response.getAirPricingSolution().size(), is(not(0)));
 		assertThat(response.getAirSegmentList().getAirSegment().size(), is(not(0)));
 		//this should not be empty for 1G as the gds because it should be 
 		//giving a warning that MaxSolutions is not supported by the provider
		assertThat(response.getResponseMessage().size(), is(not(0)));
		
	}

	//different search request types use this different ways
	public void setupRequestForSearch(AirSearchReq request) {
		
		//add in the tport branch code
		request.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		//set the GDS via a search modifier
		AirSearchModifiers modifiers = AirReq.createModifiersWithProviders(System.getProperty("travelport.gds"));
		
		AirReq.addPointOfSale(request, MY_APP_NAME);
		
		//try to limit the size of the return... not supported by 1G!
		modifiers.setMaxSolutions(BigInteger.valueOf(25));
		request.setAirSearchModifiers(modifiers);
		
		//travel is for paris to portland 2 months from now, one week trip
		SearchAirLeg outbound = AirReq.createLeg("CDG", "PDX");
		AirReq.addDepartureDate(outbound, Helper.daysInFuture(60));
		AirReq.addEconomyPreferred(outbound);

		//coming back
		SearchAirLeg ret = AirReq.createLeg("PDX", "CDG");
		AirReq.addDepartureDate(ret, Helper.daysInFuture(67));
		AirReq.addEconomyPreferred(ret);

		//put them in the request
		List<SearchAirLeg> legs = request.getSearchAirLeg();
		legs.add(outbound);
		legs.add(ret);
	}
}
