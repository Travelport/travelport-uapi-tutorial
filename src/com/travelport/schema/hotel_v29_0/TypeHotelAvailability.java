
package com.travelport.schema.hotel_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="AvailableForOtherRates"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHotelAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
public enum TypeHotelAvailability {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("AvailableForOtherRates")
    AVAILABLE_FOR_OTHER_RATES("AvailableForOtherRates"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeHotelAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelAvailability fromValue(String v) {
        for (TypeHotelAvailability c: TypeHotelAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
