package com.travelport.uapi.unit1;

/*
 * I learn best by looking at and running tests.  A good set of tests shows
 * how an API works and can't "lie" because they are executable.  These
 * tests work on the 'System' service of travelport's uAPI. 
 * 
 * This test is designed to be used inside Eclipse with JUnit4 + Hamcrest
 * matchers, although it will probably work in just about any java development 
 * enviroment.  This has a dependency on Apache's CXF, version 2.6.0, 
 * that is available for free at http://cxf.apache.org/
 * 
 * You need to change the arguments passed to the JVM to include 
 * -Dtravelport.username and -Dtravelport.password to have your credentials.  
 * You also must change the SYSTEM_WSDL URL below to point to a copy of the 
 * system WSDL on your local filesystem.
 */

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.travelport.schema.common_v32_0.BillingPointOfSaleInfo;
import com.travelport.schema.system_v32_0.PingReq;
import com.travelport.schema.system_v32_0.PingRsp;
import com.travelport.schema.system_v32_0.SystemInfoReq;
import com.travelport.schema.system_v32_0.TimeReq;
import com.travelport.schema.system_v32_0.TimeRsp;
import com.travelport.service.system_v32_0.SystemFaultMessage;
import com.travelport.tutorial.support.WSDLService;


// Don't forget to add the -Dtravelport.username="AAA" and 
//-Dtravelport.password="BBB" to your command line or run arguments in eclipse
public class SystemSvcTest {
	//definition of the format we get back as a string from tport
    SimpleDateFormat tportDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");

	@Test
	public void testGetSystemtimePort() throws SystemFaultMessage, ParseException, InterruptedException {
		TimeReq request = new TimeReq();
		TimeRsp response;
		
		String traceId1 = "whocares-1982", traceId2="whocares-1968";
		Date firstReqTime, secondReqTime, functionStart = new Date();
		
		//sleep a couple of seconds so functionStart will be different than the requests we run
		//your clock needs to be pretty close to tports for this to work with only one
		//second of difference!  make it bigger if your clocks are off by more...
		Thread.sleep(1000);
		
		//use traceId for sanity
		request.setTraceId(traceId1);
		response = WSDLService.sysTime.get().service(request);
		
		//check sanity
		assertThat(traceId1, is(equalTo(response.getTraceId())));
		//parse string of response from tport into java object
		firstReqTime = tportDateFormat.parse(response.getSystemTime());
		//check that there is a difference between start of func and the result
		assertThat(functionStart.before(firstReqTime), is(true));
		
		//sleep a couple of seconds
		Thread.sleep(1000);
		
		//second request
		request.setTraceId(traceId2);
		response = WSDLService.sysTime.get().service(request);
		//check sanity on second request
		assertThat(traceId2, is(equalTo(response.getTraceId())));

		//parse date returned
		secondReqTime = tportDateFormat.parse(response.getSystemTime());
		//check that there is a difference between 2nd call and 1st
		assertThat(firstReqTime.before(secondReqTime), is(true));
		
		//if time is moving forward, the first time better less than the second!
		long difference =  secondReqTime.getTime() - firstReqTime.getTime();
		assertThat(difference > 0, is(true));
		
		//note:  response.getResponseTime() is the *length of time spent processing
		//note:  the result by tport*, not the time of the response to this service! 
	}
	

	@Test(expected=SystemFaultMessage.class)
	public void testGetSystemInfoPort() throws SystemFaultMessage{
		SystemInfoReq request = new SystemInfoReq();
		
		//no parameters to set on this request! we can take all the defaults??
		WSDLService.sysInfo.get().service(request);
		fail("we are expecting the line above to fail.  but still... why is " +
				"thi line above not allowed?");
	}

	@Test
	public void testGetSystemPingPort() throws SystemFaultMessage {
		PingReq request = new PingReq();
		PingRsp response;
		
		String myPayload= "this my payload; there are many like it but this one is mine";
		String myTraceId = "doesntmatter-8176";

		//set request params
		request.setPayload(myPayload);
		request.setTraceId(myTraceId);
		
		BillingPointOfSaleInfo billSetInfo = new BillingPointOfSaleInfo();
		billSetInfo.setOriginApplication("UAPI");
		
		request.setBillingPointOfSaleInfo(billSetInfo);
		
		//run request through ping service
		response = WSDLService.sysPing.get().service(request);
		
		//payload returned should be same as one sent
		assertThat(myPayload, is(equalTo(response.getPayload())));
		//sanity check with the trace id
		assertThat(myTraceId, is(equalTo(response.getTraceId())));
		// make suer that there is a transaction id even though we don't
		// know what it will be exactly...
		assertThat(response.getTransactionId().length() > 5, is(true));
	}

}
