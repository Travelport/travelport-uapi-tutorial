package com.travelport.uapi.unit2;

import java.math.BigInteger;
import java.util.ListIterator;

import com.travelport.schema.common_v38_0.BillingPointOfSaleInfo;
import com.travelport.schema.util_v38_0.ReferenceDataItem;
import com.travelport.schema.util_v38_0.ReferenceDataRetrieveReq;
import com.travelport.schema.util_v38_0.ReferenceDataRetrieveRsp;
import com.travelport.schema.util_v38_0.ReferenceDataSearchModifiers;
import com.travelport.service.util_v38_0.ReferenceDataRetrievePortType;
import com.travelport.service.util_v38_0.UtilFaultMessage;
import com.travelport.tutorial.support.WSDLService;

public class Lesson7 {
	public static void main(String[] argv){
		
		//referenceDataTypeCode possible values
		//AccountingReferenceType 		//AccountingRemarkType		//Airport 		
		//AirAndRailMiscType		//AirAndRailSupplierType 		//BusinessType 		
		//Carrier 		//City 		//CityAirport 		//Country		//Currency 		
		//EmailType 		//Equipment		//FulfillmentType		//GeoPoliticalArea		
		//HotelAmenities  	//HotelMealPlans	//HotelMiscType		//HotelRateCategory 
		//HotelRoomViewType 	//HotelSupplierType 	//HotelTaxType 		//MerchandisingOfferType 
		//PassengerTypeCode 	//PaymentFormatType 	//PaymentType  
		//and many others, details available in this link 
		//https://support.travelport.com/webhelp/uapi/uAPI.htm#Getting_Started/Design_Considerations/Reference_Data.htm%3FTocPath%3DGetting%2520Started%7CUniversal%2520API%2520Overview%7CDesign%2520Considerations%7C_____5
			
		//using airport for sample purposes
		String referenceDataTypeCode = "Airport";		
		
		//UniversalRecord Retrieve Request
		ReferenceDataRetrieveRsp refRetrieveRsp = retrieveReferenceData(referenceDataTypeCode);
		
		if(refRetrieveRsp != null && refRetrieveRsp.getReferenceDataItem() != null && refRetrieveRsp.getReferenceDataItem().size() > 0){
			ListIterator<ReferenceDataItem> refIte = refRetrieveRsp.getReferenceDataItem().listIterator();
			while (refIte.hasNext()) {			
				ReferenceDataItem refData = refIte.next();
				if(refData != null){
					System.out.println("Name: "+refData.getName()+">>>>Code: "+refData.getCode());
				}
			}
		}
	}

	private static ReferenceDataRetrieveRsp retrieveReferenceData(
			String referenceDataTypeCode) {
		
		ReferenceDataRetrieveReq refRetrieveReq = new ReferenceDataRetrieveReq();
		ReferenceDataRetrieveRsp refRetrieveRsp = new ReferenceDataRetrieveRsp();
		
		refRetrieveReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		BillingPointOfSaleInfo posInfo = new BillingPointOfSaleInfo();
		posInfo.setOriginApplication("UAPI");
		refRetrieveReq.setBillingPointOfSaleInfo(posInfo);
		
		refRetrieveReq.setTypeCode(referenceDataTypeCode);
		
		ReferenceDataSearchModifiers modifiers = new ReferenceDataSearchModifiers();
		modifiers.setMaxResults(new BigInteger("20000"));
		modifiers.setProviderCode(System.getProperty("travelport.gds"));
		modifiers.setStartFromResult(new BigInteger("1"));		
		
		ReferenceDataRetrievePortType refRetrieve = WSDLService.referenceRetrieve.get();
		
		try {
			refRetrieveRsp = refRetrieve.service(refRetrieveReq);
		} catch (UtilFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("Error retrieving Data: "+e.getMessage());
		} 
		return refRetrieveRsp;
	}
	
}
