
package com.travelport.schema.rail_v42_0;

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
 * &lt;simpleType name="typeTransportMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bicycle"/&gt;
 *     &lt;enumeration value="Boat"/&gt;
 *     &lt;enumeration value="Bus"/&gt;
 *     &lt;enumeration value="Cable Car"/&gt;
 *     &lt;enumeration value="Car"/&gt;
 *     &lt;enumeration value="Carriage"/&gt;
 *     &lt;enumeration value="Courtesy car"/&gt;
 *     &lt;enumeration value="Helicopter"/&gt;
 *     &lt;enumeration value="Limousine"/&gt;
 *     &lt;enumeration value="Metro"/&gt;
 *     &lt;enumeration value="Monorail"/&gt;
 *     &lt;enumeration value="Motorbike"/&gt;
 *     &lt;enumeration value="Pack Animal"/&gt;
 *     &lt;enumeration value="Plane"/&gt;
 *     &lt;enumeration value="Rental Car"/&gt;
 *     &lt;enumeration value="Rickshaw"/&gt;
 *     &lt;enumeration value="Shuttle"/&gt;
 *     &lt;enumeration value="Subway"/&gt;
 *     &lt;enumeration value="Sedan Chair"/&gt;
 *     &lt;enumeration value="Taxi"/&gt;
 *     &lt;enumeration value="Train"/&gt;
 *     &lt;enumeration value="Trolley"/&gt;
 *     &lt;enumeration value="Tube"/&gt;
 *     &lt;enumeration value="Walk"/&gt;
 *     &lt;enumeration value="Water Taxi"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Car/Rush hour"/&gt;
 *     &lt;enumeration value="Taxi/Rush hour"/&gt;
 *     &lt;enumeration value="No Transportation"/&gt;
 *     &lt;enumeration value="Express Train"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *     &lt;enumeration value="Ship/Ferry"/&gt;
 *     &lt;enumeration value="Underground"/&gt;
 *     &lt;enumeration value="Tram/light rail"/&gt;
 *     &lt;enumeration value="Shared Taxi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeTransportMode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
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
