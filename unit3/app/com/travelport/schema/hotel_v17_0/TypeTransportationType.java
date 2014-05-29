
package com.travelport.schema.hotel_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTransportationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTransportationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="CourtesyBus"/>
 *     &lt;enumeration value="Limo"/>
 *     &lt;enumeration value="Public"/>
 *     &lt;enumeration value="SubwayRail"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="RentalCar"/>
 *     &lt;enumeration value="Walk"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeTransportationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeTransportationType {

    @XmlEnumValue("CourtesyBus")
    COURTESY_BUS("CourtesyBus"),
    @XmlEnumValue("Limo")
    LIMO("Limo"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("SubwayRail")
    SUBWAY_RAIL("SubwayRail"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),
    @XmlEnumValue("RentalCar")
    RENTAL_CAR("RentalCar"),
    @XmlEnumValue("Walk")
    WALK("Walk"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeTransportationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTransportationType fromValue(String v) {
        for (TypeTransportationType c: TypeTransportationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
