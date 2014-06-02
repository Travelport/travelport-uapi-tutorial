
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFacility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFacility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFacility")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeFacility {

    @XmlEnumValue("Seat")
    SEAT("Seat"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeFacility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFacility fromValue(String v) {
        for (TypeFacility c: TypeFacility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
