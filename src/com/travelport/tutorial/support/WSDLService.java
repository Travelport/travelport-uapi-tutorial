package com.travelport.tutorial.support;

import java.net.MalformedURLException;
import java.net.URL;

import com.travelport.service.air_v42_0.AirAvailabilitySearchPortType;
import com.travelport.service.air_v42_0.AirLowFareSearchAsynchPortType;
import com.travelport.service.air_v42_0.AirLowFareSearchPortType;
import com.travelport.service.air_v42_0.AirPricePortType;
import com.travelport.service.air_v42_0.AirRetrieveLowFareSearchPortType;
import com.travelport.service.air_v42_0.AirService;
import com.travelport.service.air_v42_0.AirTicketingPortType;
import com.travelport.service.hotel_v42_0.HotelDetailsServicePortType;
import com.travelport.service.hotel_v42_0.HotelMediaLinksServicePortType;
import com.travelport.service.hotel_v42_0.HotelSearchServicePortType;
import com.travelport.service.hotel_v42_0.HotelService;
import com.travelport.service.system_v32_0.SystemInfoPortType;
import com.travelport.service.system_v32_0.SystemPingPortType;
import com.travelport.service.system_v32_0.SystemService;
import com.travelport.service.system_v32_0.SystemTimePortType;
import com.travelport.service.universal_v42_0.AirCreateReservationPortType;
import com.travelport.service.universal_v42_0.HotelCancelServicePortType;
import com.travelport.service.universal_v42_0.HotelReservationServicePortType;
import com.travelport.service.universal_v42_0.UniversalRecordRetrieveServicePortType;
import com.travelport.service.universal_v42_0.UniversalRecordService;
import com.travelport.service.vehicle_v42_0.VehicleSearchServicePortType;
import com.travelport.service.vehicle_v42_0.VehicleService;
import com.travelport.service.util_v42_0.ReferenceDataRetrievePortType;
import com.travelport.service.util_v42_0.ReferenceDataRetrieveService;;


/**
 * Convenience class for getting access to the WSDL services without needing to
 * mess with the parameters and such. This hides some CXF specific things that
 * most people don't care about.
 */
public class WSDLService {
	// make this point to the right path for you
	static public String URLPREFIX = "file:///C://Travelport_1//SamplesAutoMation//AutoWork//travelport-uapi-tutorial-v42/";

	// location of the WSDL files within this repository
	static public String SYSTEM_WSDL = "wsdl/system_v32_0/System.wsdl";
	static public String AIR_WSDL = "wsdl/air_v42_0/Air.wsdl";
	static public String HOTEL_WSDL = "wsdl/hotel_v42_0/Hotel.wsdl";
	static public String VEHICLE_WSDL = "wsdl/vehicle_v42_0/Vehicle.wsdl";
	static public String UNIVERSAL_WSDL = "wsdl/universal_v42_0/UniversalRecord.wsdl";
	static public String UTIL_WSDL = "wsdl/util_v42_0/Util.wsdl";

	// these endpoint parameters vary based on which region you are
	// in...check your travelport sign up to see which url you should use...
	// use the version with copy in the name for test credentials...
	// note trailing slash!
	static public String ENDPOINT_PREFIX = "https://apac.universal-api.pp.travelport.com/B2BGateway/connect/uAPI/";
			//"http://WAS-UNIVERSALAPI-33890-004.DVQA1.TVLPORT.COM:33890/kestrel/";
	// static public String
	// ENDPOINT_PREFIX="https://americas.universal-api.pp.travelport.com/B2BGateway/connect/uAPI/";

	static public String SYSTEM_ENDPOINT = ENDPOINT_PREFIX + "SystemService";
	static public String AIR_ENDPOINT = ENDPOINT_PREFIX + "AirService";
	static public String HOTEL_ENDPOINT = ENDPOINT_PREFIX + "HotelService";
	static public String VEHICLE_ENDPOINT = ENDPOINT_PREFIX + "VehicleService";
	static public String UNIVERSAL_ENDPOINT = ENDPOINT_PREFIX + "UniversalRecordService";
	static public String UTIL_ENDPOINT = ENDPOINT_PREFIX + "UtilService";
	

	// the services... these are not normally useful to most developers
	public static ServiceWrapper<HotelService> hotel = new ServiceWrapper<HotelService>(
			WSDLService.HOTEL_WSDL, HotelService.class);
	public static ServiceWrapper<AirService> air = new ServiceWrapper<AirService>(
			WSDLService.AIR_WSDL, AirService.class);
	public static ServiceWrapper<SystemService> sys = new ServiceWrapper<SystemService>(
			WSDLService.SYSTEM_WSDL, SystemService.class);
	public static ServiceWrapper<VehicleService> vehicle = new ServiceWrapper<VehicleService>(
			WSDLService.VEHICLE_WSDL, VehicleService.class);
	public static ServiceWrapper<com.travelport.service.universal_v42_0.HotelService> universalHotel = new ServiceWrapper<com.travelport.service.universal_v42_0.HotelService>(
			WSDLService.UNIVERSAL_WSDL, com.travelport.service.universal_v42_0.HotelService.class);
	
	public static ServiceWrapper<com.travelport.service.universal_v42_0.AirService> universalAir = new ServiceWrapper<com.travelport.service.universal_v42_0.AirService>(
			WSDLService.UNIVERSAL_WSDL, com.travelport.service.universal_v42_0.AirService.class);
	public static ServiceWrapper<UniversalRecordService> universal = new ServiceWrapper<UniversalRecordService>(
			WSDLService.UNIVERSAL_WSDL, UniversalRecordService.class);
	public static ServiceWrapper<ReferenceDataRetrieveService> referenceDataRetrieve = new ServiceWrapper<ReferenceDataRetrieveService>(
			WSDLService.UTIL_WSDL, ReferenceDataRetrieveService.class);
	

	// air ports
	public static PortWrapper<AirLowFareSearchPortType, AirService> airShop = new PortWrapper<AirLowFareSearchPortType, AirService>(
			air, AirLowFareSearchPortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirLowFareSearchAsynchPortType, AirService> airShopAsync = new PortWrapper<AirLowFareSearchAsynchPortType, AirService>(
			air, AirLowFareSearchAsynchPortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirAvailabilitySearchPortType, AirService> airAvailability = new PortWrapper<AirAvailabilitySearchPortType, AirService>(
			air, AirAvailabilitySearchPortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirRetrieveLowFareSearchPortType, AirService> airRetrieve = new PortWrapper<AirRetrieveLowFareSearchPortType, AirService>(
			air, AirRetrieveLowFareSearchPortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirPricePortType, AirService> airPrice = new PortWrapper<AirPricePortType, AirService>(
			air, AirPricePortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirCreateReservationPortType, com.travelport.service.universal_v42_0.AirService> airReserve = new PortWrapper<AirCreateReservationPortType, com.travelport.service.universal_v42_0.AirService>(
			universalAir, AirCreateReservationPortType.class, AIR_ENDPOINT);
	public static PortWrapper<AirTicketingPortType, AirService> airTicket = new PortWrapper<AirTicketingPortType, AirService>(
			air, AirTicketingPortType.class, AIR_ENDPOINT);

	// system ports
	public static PortWrapper<SystemPingPortType, SystemService> sysPing = new PortWrapper<SystemPingPortType, SystemService>(
			sys, SystemPingPortType.class, SYSTEM_ENDPOINT);
	public static PortWrapper<SystemInfoPortType, SystemService> sysInfo = new PortWrapper<SystemInfoPortType, SystemService>(
			sys, SystemInfoPortType.class, SYSTEM_ENDPOINT);
	public static PortWrapper<SystemTimePortType, SystemService> sysTime = new PortWrapper<SystemTimePortType, SystemService>(
			sys, SystemTimePortType.class, SYSTEM_ENDPOINT);

	// hotel ports
	public static PortWrapper<HotelReservationServicePortType, com.travelport.service.universal_v42_0.HotelService> hotelReserve = new PortWrapper<HotelReservationServicePortType, com.travelport.service.universal_v42_0.HotelService>(
			universalHotel, HotelReservationServicePortType.class, HOTEL_ENDPOINT);
	public static PortWrapper<HotelSearchServicePortType, HotelService> hotelShop = new PortWrapper<HotelSearchServicePortType, HotelService>(
			hotel, HotelSearchServicePortType.class, HOTEL_ENDPOINT);
	public static PortWrapper<HotelDetailsServicePortType, HotelService> hotelDetails = new PortWrapper<HotelDetailsServicePortType, HotelService>(
			hotel, HotelDetailsServicePortType.class, HOTEL_ENDPOINT);
	public static PortWrapper<HotelCancelServicePortType, HotelService> hotelCancel = new PortWrapper<HotelCancelServicePortType, HotelService>(
			hotel, HotelCancelServicePortType.class, HOTEL_ENDPOINT);
	public static PortWrapper<HotelMediaLinksServicePortType, HotelService> hotelMedia = new PortWrapper<HotelMediaLinksServicePortType, HotelService>(
			hotel, HotelMediaLinksServicePortType.class, HOTEL_ENDPOINT);

	// vehicle ports
	public static PortWrapper<VehicleSearchServicePortType, VehicleService> vehicleSearch = new PortWrapper<VehicleSearchServicePortType, VehicleService>(
			vehicle, VehicleSearchServicePortType.class, VEHICLE_ENDPOINT);
	// universalrecord ports
	public static PortWrapper<UniversalRecordRetrieveServicePortType, UniversalRecordService> universalRetrieve = new PortWrapper<UniversalRecordRetrieveServicePortType, UniversalRecordService>(
			universal, UniversalRecordRetrieveServicePortType.class, UNIVERSAL_ENDPOINT);
	// util ports
	public static PortWrapper<ReferenceDataRetrievePortType, ReferenceDataRetrieveService> referenceRetrieve = new PortWrapper<ReferenceDataRetrievePortType, ReferenceDataRetrieveService>(
			referenceDataRetrieve, ReferenceDataRetrievePortType.class, UTIL_ENDPOINT);
	// names of the environment properties
	static protected String USERNAME_PROP = "travelport.username";
	static protected String PASSWORD_PROP = "travelport.password";
	static protected String GDS_PROP = "travelport.gds";
	static protected String TARGET_BRANCH = "travelport.targetBranch";

	static public String USERNAME_ENV = "TPUSERNAME";
	static public String PASSWORD_ENV = "TPPASSWORD";
	static public String GDS_ENV = "TPGDS";
	static public String TARGET_BRANCH_ENV = "TPTARGETBRANCH";

	/**
	 * Check that all the properties we get through the environment are at least
	 * present.
	 */
	public static void checkProperties() {
		String user = System.getProperty(USERNAME_PROP);
		String pwd = System.getProperty(PASSWORD_PROP);
		String gds = System.getProperty(GDS_PROP);
		String tb = System.getProperty(TARGET_BRANCH);		
		

		if ((user == null) || (user.trim().length() == 0)) {
			user = System.getenv(USERNAME_ENV);
		}

		if ((pwd == null) || (pwd.trim().length() == 0)) {
			pwd = System.getenv(PASSWORD_ENV);
		}

		if ((gds == null) || (gds.trim().length() == 0)) {
			gds = System.getenv(GDS_ENV);
		}

		if ((tb == null) || (tb.trim().length() == 0)) {
			tb = System.getenv(TARGET_BRANCH_ENV);
		}

		if ((user == null) || (pwd == null) || (gds == null) || (tb == null)) {
			throw new RuntimeException(
					"One or more of your properties "
							+ "has not been set properly for you to access the travelport "
							+ "uAPI.  Check your command line arguments or eclipse "
							+ "run configuration for these properties:"
							+ USERNAME_PROP
							+ ","
							+ PASSWORD_PROP
							+ ","
							+ GDS_PROP
							+ ","
							+ TARGET_BRANCH
							+ ".  These can also be set via environment variables.");
		}
	}

	/**
	 * This checks that the path given by a URL is well formed as URL despite
	 * the fact that this must be a pointer to a file.
	 * 
	 * @param wsdlFileInThisProject
	 *            name of the wsdl file, with dir prefix
	 * @return the URL that points to the wsdl
	 */
	public static URL getURLForWSDL(String wsdlFileInThisProject) {
		try {
			URL url = new URL(URLPREFIX + wsdlFileInThisProject);
			return url;
		} catch (MalformedURLException e) {
			throw new RuntimeException("The URL to access the WSDL was not "
					+ "well-formed! Check the URLPREFIX value in the class "
					+ "WSDLService in the file Helper.java.  We tried to "
					+ "to use this url:\n" + URLPREFIX + AIR_WSDL);

		}
	}
}
