
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBooking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBooking">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SSR"/>
 *     &lt;enumeration value="Auxillary Segment"/>
 *     &lt;enumeration value="Available for Display/Pricing"/>
 *     &lt;enumeration value="Contact Carrier for Booking"/>
 *     &lt;enumeration value="No Booking Required"/>
 *     &lt;enumeration value="Apply booking per service"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeBooking")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeBooking {

    SSR("SSR"),
    @XmlEnumValue("Auxillary Segment")
    AUXILLARY_SEGMENT("Auxillary Segment"),
    @XmlEnumValue("Available for Display/Pricing")
    AVAILABLE_FOR_DISPLAY_PRICING("Available for Display/Pricing"),
    @XmlEnumValue("Contact Carrier for Booking")
    CONTACT_CARRIER_FOR_BOOKING("Contact Carrier for Booking"),
    @XmlEnumValue("No Booking Required")
    NO_BOOKING_REQUIRED("No Booking Required"),
    @XmlEnumValue("Apply booking per service")
    APPLY_BOOKING_PER_SERVICE("Apply booking per service");
    private final String value;

    TypeBooking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBooking fromValue(String v) {
        for (TypeBooking c: TypeBooking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
