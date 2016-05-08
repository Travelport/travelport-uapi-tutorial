package com.travelport.uapi.unit2;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import com.travelport.schema.air_v35_0.AirPricingSolution;
import com.travelport.schema.air_v35_0.AirReservation;
import com.travelport.schema.common_v35_0.ActionStatus;
import com.travelport.schema.common_v35_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v35_0.BookingTraveler;
import com.travelport.schema.common_v35_0.BookingTravelerName;
import com.travelport.schema.common_v35_0.ContinuityCheckOverride;
import com.travelport.schema.common_v35_0.CreditCard;
import com.travelport.schema.common_v35_0.Email;
import com.travelport.schema.common_v35_0.FormOfPayment;
import com.travelport.schema.common_v35_0.Payment;
import com.travelport.schema.common_v35_0.PhoneNumber;
import com.travelport.schema.common_v35_0.Remark;
import com.travelport.schema.universal_v35_0.AirCreateReservationReq;
import com.travelport.schema.universal_v35_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v35_0.ProviderReservationInfo;
import com.travelport.schema.universal_v35_0.TypeRetainReservation;
import com.travelport.service.air_v35_0.AirFaultMessage;
import com.travelport.service.universal_v35_0.AirCreateReservationPortType;
import com.travelport.service.universal_v35_0.AvailabilityFaultMessage;
import com.travelport.tutorial.support.WSDLService;

public class CreateResvSvcTest {
	public static final String FORM_OF_PAYMENT_REF="jwt2mcK1Qp27I2xfpcCtAw==";
	
	@Test
	public void createCancelTest() throws DatatypeConfigurationException, AirFaultMessage, AvailabilityFaultMessage, FileNotFoundException {
		AirCreateReservationPortType create = WSDLService.airReserve.get();
		WSDLService.airReserve.showXML(true);
		
		AirCreateReservationReq req = new AirCreateReservationReq();
		req.setAuthorizedBy("TEST");
		
		//if there are changes to schedule or price, tell us about it
		//in the returned result
		req.setRetainReservation(TypeRetainReservation.BOTH);
		
		//tell uapi where and for who the request is targeting
		req.setProviderCode(System.getProperty("travelport.providerCode"));
		req.setTargetBranch(System.getProperty("travelport.targetBranch"));
		
		//make the traveller info
		BookingTraveler traveller = new BookingTraveler();
		//traveller.setGender("Male");
		
		//home email
		Email email = new Email();
		email.setEmailID("hughc@example.com");
		email.setType("Home");
		traveller.getEmail().add(email);
		
		PhoneNumber phone = new PhoneNumber();
		phone.setCountryCode("33");
		phone.setAreaCode("6");
		phone.setNumber("42000000");
		phone.setType("Mobile");
		traveller.getPhoneNumber().add(phone);
		//name
		BookingTravelerName name = new BookingTravelerName();
		name.setPrefix("Mr");
		name.setFirst("Hugh");
		name.setLast("Capet");
		traveller.setBookingTravelerName(name);
		
		//adult
		traveller.setTravelerType("ADT");

		//put traveller in request
		req.getBookingTraveler().add(traveller);
		
		//point of sale, YYY
		//PointOfSale pos=new PointOfSale();
		//pos.setPseudoCityCode("LON");
		//req.setPointOfSale(pos);
		
		BillingPointOfSaleInfo info = new BillingPointOfSaleInfo();
		//YYY
		info.setOriginApplication("UAPI");
		req.setBillingPointOfSaleInfo(info);
		
		//provider
		req.setProviderCode(System.getProperty("travelport.gds"));
		
		//action status??
		
		//Need to get a factory
		DatatypeFactory factory = DatatypeFactory.newInstance();
		
		//payment
		FormOfPayment fop = new FormOfPayment();
		CreditCard cc = Lesson4.getFakeCreditCard(true);
		fop.setCreditCard(cc);
		fop.setKey(FORM_OF_PAYMENT_REF);
		
		//YYY
		//req.getFormOfPayment().add(fop);
		
		//hook payment to credit card
		Payment payment = new Payment();
		payment.setType("TicketFee");
		payment.setFormOfPaymentRef(FORM_OF_PAYMENT_REF);

		
		//need to do avail/price workflow
		AirPricingSolution soln = Lesson4bad.searchPriceWorkflow("CDG", "SFO", 67, 81);
		req.setAirPricingSolution(soln);
		
		//connect amount of payment to price solution
		payment.setAmount(soln.getTotalPrice());
		
		//this seems to be required
		ActionStatus actionStatus = new ActionStatus();
        //String ticketDate = factory.newXMLGregorianCalendarDate(2013, 10, 1,
        //        DatatypeConstants.FIELD_UNDEFINED).toString();
		XMLGregorianCalendar calendar = factory.newXMLGregorianCalendar();
		
		//we use a java calendar here because it can do arithemitic on dates
		//and stuff like that...
		Calendar javaCalendar = GregorianCalendar.getInstance();
		javaCalendar.setTime(new Date());//right now
		javaCalendar.add(Calendar.DAY_OF_MONTH, 2);//2 days from now
		
		calendar.setTime(23, 59, 0);//midnight day after tomorrow
		calendar.setTimezone(60);//paris is +1 hour from GMT
		
		//copy date from java calendar where we did the arithmetic
		//it is VERY odd that months start at 0 but days in the month start at 1!
        calendar.setMonth(javaCalendar.get(Calendar.MONTH)+1);
        calendar.setDay(javaCalendar.get(Calendar.DAY_OF_MONTH));
        calendar.setYear(javaCalendar.get(Calendar.YEAR));
		
        //convert to XML
        XMLGregorianCalendar greg = factory.newXMLGregorianCalendar();
        greg.setYear(calendar.getYear());
        greg.setMonth(calendar.getMonth());
        greg.setDay(calendar.getDay());
        greg.setHour(calendar.getHour());
        greg.setMinute(calendar.getMinute());
        greg.setSecond(calendar.getSecond());
        //now get the string out and set that to the ticket TIME, even though
        //it says "date" in the name
        actionStatus.setTicketDate(greg.toString());
        
		actionStatus.setProviderCode(System.getProperty("travelport.gds"));
		actionStatus.setType("TAW");
		Remark remark = new Remark();
		//remark.setKey("testRemark");
		remark.setValue("TAUREMARKS");
		actionStatus.setRemark(remark);
		
		req.getActionStatus().add(actionStatus);
		
		//what is this check
		ContinuityCheckOverride override = new ContinuityCheckOverride();
		override.setValue("yes");
		req.setContinuityCheckOverride(override);
		
		/* if you want to set the versions instead of passing null here you
		 * need to be a bit careful as the server is quite particular about 
		 * the values passed here...null seems to me "I accept the defauls"
		 */
		try {
			AirCreateReservationRsp rsp = create.service(req, null);
			if(rsp != null){				
				System.out.println("UR : " + rsp.getUniversalRecord().getLocatorCode());
				List<ProviderReservationInfo> pnrList = rsp.getUniversalRecord().getProviderReservationInfo();
				Iterator<ProviderReservationInfo> pnrIte = pnrList.iterator();
				while(pnrIte.hasNext()){
					ProviderReservationInfo pnrInfo = pnrIte.next();
					System.out.println("PNR : " + pnrInfo.getLocatorCode());
				}
				
				List<AirReservation> airList = rsp.getUniversalRecord().getAirReservation();
				Iterator<AirReservation> airIte = airList.iterator();
				while(airIte.hasNext()){
					AirReservation airRes = airIte.next();
					System.out.println("Air Reservation Locator : " + airRes.getLocatorCode());
				}
			}
		} catch (com.travelport.service.universal_v35_0.AirFaultMessage e) {
			// TODO Auto-generated catch block
			System.err.println("unable to create service: " + e.getMessage());
		}
	}
}
