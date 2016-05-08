package com.travelport.uapi.unit1;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import com.travelport.schema.common_v32_0.BillingPointOfSaleInfo;
import com.travelport.schema.system_v32_0.PingReq;
import com.travelport.schema.system_v32_0.PingRsp;
import com.travelport.service.system_v32_0.SystemFaultMessage;
import com.travelport.tutorial.support.WSDLService;

public class Lesson1 {

	public static void main(String[] argv) throws FileNotFoundException, UnsupportedEncodingException {		
		//
		// PING REQUEST
		//
		String payload= "this my payload; there are many like it but this one is mine";
		String someTraceId = "doesntmatter-8176";
		String originApp = "UAPI";
		
		//set up the request parameters into a PingReq object
		PingReq req = new PingReq();
		req.setPayload(payload);
		req.setTraceId(someTraceId);
		
		BillingPointOfSaleInfo billSetInfo = new BillingPointOfSaleInfo();
		billSetInfo.setOriginApplication(originApp);
		
		req.setBillingPointOfSaleInfo(billSetInfo);
		
		
		try {
			//run the ping request
	        WSDLService.sysPing.showXML(true);
	        
	        PingRsp rsp = new PingRsp();        
	        //WSDLService.sysPing.get().service(req);     	
        	rsp = WSDLService.sysPing.get().service(req);
			//print results.. payload and trace ID are echoed back in response
			System.out.println(rsp.getTraceId());
			System.out.println(rsp.getTransactionId());
		} catch (SystemFaultMessage e) {
			//usually only the error message is useful, not the full stack
			//trace, since the stack trace in is your address space...
			System.err.println("Error making ping request: "+e.getMessage());
		}
	}
}
