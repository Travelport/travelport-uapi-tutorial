
package com.travelport.schema.common_v12_0;

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
 * &lt;simpleType name="typeVehicleLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Terminal"/>
 *     &lt;enumeration value="ShuttleOnAirport"/>
 *     &lt;enumeration value="ShuttleOffAirport"/>
 *     &lt;enumeration value="RailwayStation"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="CarDealer"/>
 *     &lt;enumeration value="CityCenterDowntown"/>
 *     &lt;enumeration value="EastOfCityCenter"/>
 *     &lt;enumeration value="SouthOfCityCenter"/>
 *     &lt;enumeration value="WestOfCityCenter"/>
 *     &lt;enumeration value="NorthOfCityCenter"/>
 *     &lt;enumeration value="PortOrFerry"/>
 *     &lt;enumeration value="NearResort"/>
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleLocation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
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
