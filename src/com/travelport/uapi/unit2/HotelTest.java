package com.travelport.uapi.unit2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Test;

import com.travelport.schema.common_v15_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v15_0.Distance;
import com.travelport.schema.hotel_v17_0.*;
import com.travelport.service.hotel_v17_0.HotelFaultMessage;
import com.travelport.service.hotel_v17_0.HotelSearchServicePortType;
import com.travelport.tutorial.support.WSDLService;
import com.travelport.uapi.unit1.Helper;

public class HotelTest {

    @Test
    public void checkResultSequenc() throws DatatypeConfigurationException, HotelFaultMessage{
        HotelSearchServicePortType port = WSDLService.hotelShop.get();
        HotelSearchAvailabilityReq req = new HotelSearchAvailabilityReq();
        
        //business trip, 2 travellers with own room
        HotelSearchModifiers mods = Lesson4.createModifiers(2, 2);
        
        //have to give our branch id
        req.setTargetBranch(System.getProperty("travelport.targetBranch"));
        
        //hotel location is paris france
        HotelLocation location = Lesson4.createCityLocation("PAR");
        
        //near the eiffel tower
        req.setHotelLocation(location);
        mods.setReferencePoint("EIFFEL TOWER");
        
        //within 1000m of the tower?
        Lesson4.addDistanceModifier(mods, 1);
        
        //when staying?
        HotelStay stay = Lesson4.createCheckInAndOut(Lesson4.futureDateAsXML(45),
                Lesson4.futureDateAsXML(47));
        req.setHotelStay(stay);
        
        //point of sale
        req.setBillingPointOfSaleInfo(Helper.tutorialBPOSInfo(6, 2));
        
        //where we store results
        Helper.VendorLocMap locMap = new Helper.VendorLocMap();
        HotelSearchAvailabilityRsp rsp=null;
        int screens = 0;
        
        do {
            rsp = port.service(req);
            assertThat(locMap.mergeAll(rsp.getVendorLocation()), is(0));
            if (rsp.getNextResultReference().size()>1) {
                fail("not sure what it means to have more than 1 next result ref!");
            }
            if (rsp.getNextResultReference().size()==1) {
                req.getNextResultReference().clear();
                //hook the previous result to this next request
                req.getNextResultReference().add(rsp.getNextResultReference().get(0));
            }
            ++screens;
            if (screens==5) {
                break;
            }
        } while (rsp.getNextResultReference().size()>0);
    }

}
