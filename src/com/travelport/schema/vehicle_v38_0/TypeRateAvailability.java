
package com.travelport.schema.vehicle_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateAvailability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Call"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRateAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public enum TypeRateAvailability {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    TypeRateAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateAvailability fromValue(String v) {
        for (TypeRateAvailability c: TypeRateAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
