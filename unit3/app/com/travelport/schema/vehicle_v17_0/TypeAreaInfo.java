
package com.travelport.schema.vehicle_v17_0;

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
 * &lt;simpleType name="typeAreaInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirportMain"/>
 *     &lt;enumeration value="AirportSecondary"/>
 *     &lt;enumeration value="CityCenterDowntown"/>
 *     &lt;enumeration value="EastOfCityCenter"/>
 *     &lt;enumeration value="SouthOfCityCenter"/>
 *     &lt;enumeration value="WestOfCityCenter"/>
 *     &lt;enumeration value="NorthOfCityCenter"/>
 *     &lt;enumeration value="PortOrFerry"/>
 *     &lt;enumeration value="NearResort"/>
 *     &lt;enumeration value="RailwayStation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAreaInfo")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
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
