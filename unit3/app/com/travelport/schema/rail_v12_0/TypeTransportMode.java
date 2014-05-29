
package com.travelport.schema.rail_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTransportMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTransportMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bicycle"/>
 *     &lt;enumeration value="Boat"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Cable Car"/>
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="Carriage"/>
 *     &lt;enumeration value="Courtesy car"/>
 *     &lt;enumeration value="Helicopter"/>
 *     &lt;enumeration value="Limousine"/>
 *     &lt;enumeration value="Metro"/>
 *     &lt;enumeration value="Monorail"/>
 *     &lt;enumeration value="Motorbike"/>
 *     &lt;enumeration value="Pack Animal"/>
 *     &lt;enumeration value="Plane"/>
 *     &lt;enumeration value="Rental Car"/>
 *     &lt;enumeration value="Rickshaw"/>
 *     &lt;enumeration value="Shuttle"/>
 *     &lt;enumeration value="Subway"/>
 *     &lt;enumeration value="Sedan Chair"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="Trolley"/>
 *     &lt;enumeration value="Tube"/>
 *     &lt;enumeration value="Walk"/>
 *     &lt;enumeration value="Water Taxi"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Car/Rush hour"/>
 *     &lt;enumeration value="Taxi/Rush hour"/>
 *     &lt;enumeration value="No Transportation"/>
 *     &lt;enumeration value="Express Train"/>
 *     &lt;enumeration value="Public"/>
 *     &lt;enumeration value="Ship/Ferry"/>
 *     &lt;enumeration value="Underground"/>
 *     &lt;enumeration value="Tram/light rail"/>
 *     &lt;enumeration value="Shared Taxi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeTransportMode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeTransportMode {

    @XmlEnumValue("Bicycle")
    BICYCLE("Bicycle"),
    @XmlEnumValue("Boat")
    BOAT("Boat"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Cable Car")
    CABLE_CAR("Cable Car"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Carriage")
    CARRIAGE("Carriage"),
    @XmlEnumValue("Courtesy car")
    COURTESY_CAR("Courtesy car"),
    @XmlEnumValue("Helicopter")
    HELICOPTER("Helicopter"),
    @XmlEnumValue("Limousine")
    LIMOUSINE("Limousine"),
    @XmlEnumValue("Metro")
    METRO("Metro"),
    @XmlEnumValue("Monorail")
    MONORAIL("Monorail"),
    @XmlEnumValue("Motorbike")
    MOTORBIKE("Motorbike"),
    @XmlEnumValue("Pack Animal")
    PACK_ANIMAL("Pack Animal"),
    @XmlEnumValue("Plane")
    PLANE("Plane"),
    @XmlEnumValue("Rental Car")
    RENTAL_CAR("Rental Car"),
    @XmlEnumValue("Rickshaw")
    RICKSHAW("Rickshaw"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),
    @XmlEnumValue("Subway")
    SUBWAY("Subway"),
    @XmlEnumValue("Sedan Chair")
    SEDAN_CHAIR("Sedan Chair"),
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("Trolley")
    TROLLEY("Trolley"),
    @XmlEnumValue("Tube")
    TUBE("Tube"),
    @XmlEnumValue("Walk")
    WALK("Walk"),
    @XmlEnumValue("Water Taxi")
    WATER_TAXI("Water Taxi"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Car/Rush hour")
    CAR_RUSH_HOUR("Car/Rush hour"),
    @XmlEnumValue("Taxi/Rush hour")
    TAXI_RUSH_HOUR("Taxi/Rush hour"),
    @XmlEnumValue("No Transportation")
    NO_TRANSPORTATION("No Transportation"),
    @XmlEnumValue("Express Train")
    EXPRESS_TRAIN("Express Train"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Ship/Ferry")
    SHIP_FERRY("Ship/Ferry"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("Tram/light rail")
    TRAM_LIGHT_RAIL("Tram/light rail"),
    @XmlEnumValue("Shared Taxi")
    SHARED_TAXI("Shared Taxi");
    private final String value;

    TypeTransportMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTransportMode fromValue(String v) {
        for (TypeTransportMode c: TypeTransportMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
