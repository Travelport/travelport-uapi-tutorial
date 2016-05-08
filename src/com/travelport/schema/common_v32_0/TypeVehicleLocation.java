
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleLocation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Terminal"/&gt;
 *     &lt;enumeration value="ShuttleOnAirport"/&gt;
 *     &lt;enumeration value="ShuttleOffAirport"/&gt;
 *     &lt;enumeration value="RailwayStation"/&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="CarDealer"/&gt;
 *     &lt;enumeration value="CityCenterDowntown"/&gt;
 *     &lt;enumeration value="EastOfCityCenter"/&gt;
 *     &lt;enumeration value="SouthOfCityCenter"/&gt;
 *     &lt;enumeration value="WestOfCityCenter"/&gt;
 *     &lt;enumeration value="NorthOfCityCenter"/&gt;
 *     &lt;enumeration value="PortOrFerry"/&gt;
 *     &lt;enumeration value="NearResort"/&gt;
 *     &lt;enumeration value="Airport"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleLocation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
public enum TypeVehicleLocation {

    @XmlEnumValue("Terminal")
    TERMINAL("Terminal"),
    @XmlEnumValue("ShuttleOnAirport")
    SHUTTLE_ON_AIRPORT("ShuttleOnAirport"),
    @XmlEnumValue("ShuttleOffAirport")
    SHUTTLE_OFF_AIRPORT("ShuttleOffAirport"),
    @XmlEnumValue("RailwayStation")
    RAILWAY_STATION("RailwayStation"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("CarDealer")
    CAR_DEALER("CarDealer"),
    @XmlEnumValue("CityCenterDowntown")
    CITY_CENTER_DOWNTOWN("CityCenterDowntown"),
    @XmlEnumValue("EastOfCityCenter")
    EAST_OF_CITY_CENTER("EastOfCityCenter"),
    @XmlEnumValue("SouthOfCityCenter")
    SOUTH_OF_CITY_CENTER("SouthOfCityCenter"),
    @XmlEnumValue("WestOfCityCenter")
    WEST_OF_CITY_CENTER("WestOfCityCenter"),
    @XmlEnumValue("NorthOfCityCenter")
    NORTH_OF_CITY_CENTER("NorthOfCityCenter"),
    @XmlEnumValue("PortOrFerry")
    PORT_OR_FERRY("PortOrFerry"),
    @XmlEnumValue("NearResort")
    NEAR_RESORT("NearResort"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeVehicleLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleLocation fromValue(String v) {
        for (TypeVehicleLocation c: TypeVehicleLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
