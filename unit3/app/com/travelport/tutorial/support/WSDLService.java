package com.travelport.tutorial.support;

import java.net.MalformedURLException;
import java.net.URL;

import play.Play;

import com.travelport.service.air_v18_0.*;
import com.travelport.service.hotel_v17_0.*;
import com.travelport.service.system_v8_0.*;
import com.travelport.service.vehicle_v17_0.VehicleSearchServicePortType;
import com.travelport.service.vehicle_v17_0.VehicleService;

/**
 * Convenience class for getting access to the WSDL services without needing to
 * mess with the parameters and such. This hides some CXF specific things that
 * most people don't care about.
 */
public class WSDLService {
    //location of the WSDL files within this repository
    static public String SYSTEM_WSDL = "wsdl/system_v8_0/System.wsdl";
    static public String AIR_WSDL = "wsdl/air_v18_0/Air.wsdl";
    static public String HOTEL_WSDL = "wsdl/hotel_v17_0/Hotel.wsdl";
    static public String VEHICLE_WSDL = "wsdl/vehicle_v17_0/Vehicle.wsdl";

    // these endpoint parameters vary based on which region you are
    // in...check your travelport sign up to see which url you should use...
    //static public String SYSTEM_ENDPOINT = "https://emea.universal-api.travelport.com/B2BGateway/connect/uAPI/SystemService";
    //static public String AIR_ENDPOINT = "https://emea.universal-api.travelport.com/B2BGateway/connect/uAPI/AirService";
    //static public String HOTEL_ENDPOINT = "https://emea.universal-api.travelport.com/B2BGateway/connect/uAPI/HotelService";
    //static public String VEHICLE_ENDPOINT = "https://emea.universal-api.travelport.com/B2BGateway/connect/uAPI/VehicleService";
    
    //
    //For test credentials, use the ones with "copy" in the name
    //
    //https://emea.copy-webservices.travelport.com/B2BGateway/connect/uAPI/Service
    static public String SYSTEM_ENDPOINT = "https://emea.copy-webservices.travelport.com/B2BGateway/connect/uAPI/SystemService";
    static public String AIR_ENDPOINT = "https://emea.copy-webservices.travelport.com/B2BGateway/connect/uAPI/AirService";
    static public String HOTEL_ENDPOINT = "https://emea.copy-webservices.travelport.com/B2BGateway/connect/uAPI/HotelService";
    static public String VEHICLE_ENDPOINT = "https://emea.copy-webservices.travelport.com/B2BGateway/connect/uAPI/VehicleService";
    
            
    //the services... these are not normally useful to most developers
    public static ServiceWrapper<HotelService> hotel = new ServiceWrapper<HotelService>(WSDLService.HOTEL_WSDL, HotelService.class);
    public static ServiceWrapper<AirService> air = new ServiceWrapper<AirService>(WSDLService.AIR_WSDL, AirService.class);
    public static ServiceWrapper<SystemService> sys = new ServiceWrapper<SystemService>(WSDLService.SYSTEM_WSDL, SystemService.class);
    public static ServiceWrapper<VehicleService> vehicle = new ServiceWrapper<VehicleService>(WSDLService.VEHICLE_WSDL, VehicleService.class);
   
    //air ports
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
    public static PortWrapper<AirCreateReservationPortType, AirService> airReserve = new PortWrapper<AirCreateReservationPortType, AirService>(
            air, AirCreateReservationPortType.class, AIR_ENDPOINT);

    //system ports
    public static PortWrapper<SystemPingPortType, SystemService> sysPing = new PortWrapper<SystemPingPortType, SystemService>(
            sys, SystemPingPortType.class, SYSTEM_ENDPOINT);
    public static PortWrapper<SystemInfoPortType, SystemService> sysInfo = new PortWrapper<SystemInfoPortType, SystemService>(
            sys, SystemInfoPortType.class, SYSTEM_ENDPOINT);
    public static PortWrapper<SystemTimePortType, SystemService> sysTime = new PortWrapper<SystemTimePortType, SystemService>(
            sys, SystemTimePortType.class, SYSTEM_ENDPOINT);

    //hotel ports
    public static PortWrapper<HotelReservationServicePortType, HotelService> hotelReserve = new PortWrapper<HotelReservationServicePortType, HotelService>(
            hotel, HotelReservationServicePortType.class, HOTEL_ENDPOINT);
    public static PortWrapper<HotelSearchServicePortType, HotelService> hotelShop = new PortWrapper<HotelSearchServicePortType, HotelService>(
            hotel, HotelSearchServicePortType.class, HOTEL_ENDPOINT);
    public static PortWrapper<HotelDetailsServicePortType, HotelService> hotelDetails = new PortWrapper<HotelDetailsServicePortType, HotelService>(
            hotel, HotelDetailsServicePortType.class, HOTEL_ENDPOINT);
    public static PortWrapper<HotelCancelServicePortType, HotelService> hotelCancel = new PortWrapper<HotelCancelServicePortType, HotelService>(
            hotel, HotelCancelServicePortType.class, HOTEL_ENDPOINT);
    public static PortWrapper<HotelMediaLinksServicePortType, HotelService> hotelMedia = new PortWrapper<HotelMediaLinksServicePortType, HotelService>(
            hotel, HotelMediaLinksServicePortType.class, HOTEL_ENDPOINT);

    //vehicle ports
    public static PortWrapper<VehicleSearchServicePortType, VehicleService> vehicleSearch = new PortWrapper<VehicleSearchServicePortType, VehicleService>(
            vehicle, VehicleSearchServicePortType.class, VEHICLE_ENDPOINT);

    //names of the environment properties
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
        String tb  = System.getProperty(TARGET_BRANCH);
        
        if ((user==null) || (user.trim().length()==0)) {
            user = System.getenv(USERNAME_ENV);
        }
        
        if ((pwd==null) || (pwd.trim().length()==0)) {
            pwd = System.getenv(PASSWORD_ENV);
        }

        if ((gds==null) || (gds.trim().length()==0)) {
            gds = System.getenv(GDS_ENV);
        }

        if ((tb==null) || (tb.trim().length()==0)) {
            tb = System.getenv(TARGET_BRANCH_ENV);
        }

        if ((user == null) || (pwd == null)
                || (gds == null) || (tb == null)) {
            throw new RuntimeException("One or more of your properties " + "has not been set properly for you to access the travelport "
                    + "uAPI.  Check your command line arguments or eclipse " + "run configuration for these properties:" + USERNAME_PROP
                    + "," + PASSWORD_PROP + "," + GDS_PROP + "," + TARGET_BRANCH +".  These can also be set via environment variables.");
        }
    }

    public static String getURLPrefix() {
        return "file:///"+Play.application().path().getAbsolutePath();
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
            String prefix = getURLPrefix();
            if (!prefix.endsWith("/")) {
                prefix+="/";
            }
            URL url = new URL(prefix + wsdlFileInThisProject);
            return url;
        } catch (MalformedURLException e) {
            throw new RuntimeException("The URL to access the WSDL was not " + "well-formed! Check the URLPREFIX value in the class "
                    + "WSDLService in the file Helper.java.  We tried to " + "to use this url:\n" + getURLPrefix() + AIR_WSDL);

        }
    }
}
