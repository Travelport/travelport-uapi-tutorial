package com.travelport.uapi.unit1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import com.travelport.schema.air_v42_0.AirSearchModifiers;
import com.travelport.schema.air_v42_0.AvailabilitySearchReq;
import com.travelport.schema.air_v42_0.AvailabilitySearchRsp;
import com.travelport.schema.air_v42_0.LowFareSearchReq;
import com.travelport.schema.air_v42_0.LowFareSearchRsp;
import com.travelport.schema.air_v42_0.SearchAirLeg;
import com.travelport.schema.common_v42_0.BaseReq;
import com.travelport.service.air_v42_0.AirFaultMessage;
import com.travelport.tutorial.support.WSDLService;

public class AirSvcTest {

	public static String MY_APP_NAME="UAPI";
	
	@Test
	public void availability() throws AirFaultMessage {
		AvailabilitySearchReq request = new AvailabilitySearchReq();
		AvailabilitySearchRsp rsp;
		
		setupRequestForSearch(request);
		
		rsp=WSDLService.airAvailability.get().service(request, null);
		//these checks are just sanity that we can make an availability request
		assertThat(rsp.getAirItinerarySolution().size(), is(not(0)));
		assertThat(rsp.getAirSegmentList().getAirSegment().size(), is(not(0)));
	}


	
	private void setupRequestForSearch(AvailabilitySearchReq request) {
		// TODO Auto-generated method stub
		
		//add in the tport branch code
	    request.setTargetBranch(System.getProperty("travelport.targetBranch"));
	    
		//set the GDS via a search modifier
		AirSearchModifiers modifiers = AirReq.createModifiersWithProviders(System.getProperty("travelport.gds"));
		
		AirReq.addPointOfSale(request, MY_APP_NAME);
		
		//try to limit the size of the return... not supported by 1G!
		modifiers.setMaxSolutions(BigInteger.valueOf(25));
		request.setAirSearchModifiers(modifiers);
		
		//travel is for paris to portland 2 months from now, one week trip
		SearchAirLeg outbound = AirReq.createSearchLeg("CDG", "PDX");
		AirReq.addSearchDepartureDate(outbound, Helper.daysInFuture(60));
		AirReq.addSearchEconomyPreferred(outbound);

	}



	@SuppressWarnings("unused")
	@Test
	public void lowFareSearch() throws ParseException, AirFaultMessage {
		LowFareSearchReq request = new LowFareSearchReq();
		BaseReq req = new BaseReq();
		LowFareSearchRsp response;
		String myTraceId = "ltk-007";
		
		request.setTraceId(myTraceId);//sanity
		
		setupRequestForSearch(request);

		//2 adults travelling, needed for a low cost search
		AirReq.addAdultPassengers(request, 2);

		//do the work
		response = WSDLService.airShop.get().service(request, null);
		
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
	public void setupRequestForSearch(LowFareSearchReq request) {
		
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
