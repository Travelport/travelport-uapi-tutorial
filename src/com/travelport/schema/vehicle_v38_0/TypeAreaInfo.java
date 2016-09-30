
package com.travelport.schema.vehicle_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAreaInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAreaInfo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirportMain"/&gt;
 *     &lt;enumeration value="AirportSecondary"/&gt;
 *     &lt;enumeration value="CityCenterDowntown"/&gt;
 *     &lt;enumeration value="EastOfCityCenter"/&gt;
 *     &lt;enumeration value="SouthOfCityCenter"/&gt;
 *     &lt;enumeration value="WestOfCityCenter"/&gt;
 *     &lt;enumeration value="NorthOfCityCenter"/&gt;
 *     &lt;enumeration value="PortOrFerry"/&gt;
 *     &lt;enumeration value="NearResort"/&gt;
 *     &lt;enumeration value="RailwayStation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAreaInfo")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public enum TypeAreaInfo {

    @XmlEnumValue("AirportMain")
    AIRPORT_MAIN("AirportMain"),
    @XmlEnumValue("AirportSecondary")
    AIRPORT_SECONDARY("AirportSecondary"),
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
    @XmlEnumValue("RailwayStation")
    RAILWAY_STATION("RailwayStation");
    private final String value;

    TypeAreaInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAreaInfo fromValue(String v) {
        for (TypeAreaInfo c: TypeAreaInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
