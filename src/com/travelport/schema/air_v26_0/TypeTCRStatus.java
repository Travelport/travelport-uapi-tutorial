
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTCRStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTCRStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Exchanged"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeTCRStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeTCRStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Exchanged")
    EXCHANGED("Exchanged"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    TypeTCRStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTCRStatus fromValue(String v) {
        for (TypeTCRStatus c: TypeTCRStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
