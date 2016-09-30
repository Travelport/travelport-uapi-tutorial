package com.travelport.uapi.unit2;

import java.util.List;
import java.util.ListIterator;

import com.travelport.schema.air_v38_0.AirReservation;
import com.travelport.schema.air_v38_0.TypeBaseAirSegment;
import com.travelport.schema.common_v38_0.BillingPointOfSaleInfo;
import com.travelport.schema.hotel_v38_0.HotelProperty;
import com.travelport.schema.hotel_v38_0.HotelReservation;
import com.travelport.schema.universal_v38_0.UniversalRecord;
import com.travelport.schema.universal_v38_0.UniversalRecordRetrieveReq;
import com.travelport.schema.universal_v38_0.UniversalRecordRetrieveRsp;
import com.travelport.service.universal_v38_0.UniversalRecordArchivedFaultMessage;
import com.travelport.service.universal_v38_0.UniversalRecordFaultMessage;
import com.travelport.service.universal_v38_0.UniversalRecordRetrieveServicePortType;
import com.travelport.tutorial.support.WSDLService;

public class Lesson6 {
	public static void main(String[] argv){
		//UniversalRecord Retrieve Request
		UniversalRecordRetrieveRsp urRetrieveRsp = retrieveUniversalRecordDetails();
		
		if(urRetrieveRsp != null){
			//Check the reservation and other details inside the UniversalRecord
			checkReservations(urRetrieveRsp);
		}
		
	}

	private static void checkReservations(
			UniversalRecordRetrieveRsp urRetrieveRsp) {
		// TODO Auto-generated method stub
		if(urRetrieveRsp != null){
			if(urRetrieveRsp.getUniversalRecord() != null){
				UniversalRecord responseRecord = urRetrieveRsp.getUniversalRecord();
				
				if(responseRecord.getAirReservation() != null){
					List<AirReservation> airResv = responseRecord.getAirReservation();
					
					ListIterator<AirReservation> airResvListIte = airResv.listIterator();
					
					while(airResvListIte.hasNext()){
						AirReservation airReservation = airResvListIte.next();
						//Get details about particular AirReservation
						if(airReservation != null){
							//this will give the list of AirSegments
							List<TypeBaseAirSegment> airSegmetnList = airReservation.getAirSegment();
						}
					}
				}
				
				if(responseRecord.getHotelReservation() != null){
					List<HotelReservation> hotelresv = responseRecord.getHotelReservation();
					
					ListIterator<HotelReservation> hotelresvListIte = hotelresv.listIterator();
					
					while(hotelresvListIte.hasNext()){
						HotelReservation hotelReservation = hotelresvListIte.next();
						
						if(hotelReservation != null){
							//this will give the HotelProperty for this Hotelreservation
							HotelProperty property = hotelReservation.getHotelProperty();
						}
					}
				}
			}
		}
	}

	private static UniversalRecordRetrieveRsp retrieveUniversalRecordDetails() {
		// TODO Auto-generated method stub
		UniversalRecordRetrieveReq urRetrieveReq = new UniversalRecordRetrieveReq();
		
		UniversalRecordRetrieveRsp urRetrieveRsp = null;
		
		urRetrieveReq.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		BillingPointOfSaleInfo posInfo = new BillingPointOfSaleInfo();
		posInfo.setOriginApplication("UAPI");
		urRetrieveReq.setBillingPointOfSaleInfo(posInfo);
		//Use the UniversalRecordLocatorCode used to create the Air/Hotel/Vehicle/Passive or all reservations
		urRetrieveReq.setUniversalRecordLocatorCode("UniversalRecordLocatorCode");
		
		UniversalRecordRetrieveServicePortType urRetrieve = WSDLService.universalRetrieve.get();
		
		try {
			urRetrieveRsp = urRetrieve.service(urRetrieveReq, null, null);
		} catch (UniversalRecordArchivedFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("Error retrieving UniversalRecord: "+e.getMessage());
		} catch (UniversalRecordFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("Error retrieving UniversalRecord: "+e.getMessage());
		}
		
		return urRetrieveRsp;

	}
}
