
package com.travelport.schema.air_v18_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRestrictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRestrictionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DayOfWeek"/>
 *     &lt;enumeration value="FlightTimeOfDay"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareRestrictionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeFareRestrictionType {

    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("FlightTimeOfDay")
    FLIGHT_TIME_OF_DAY("FlightTimeOfDay"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeFareRestrictionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareRestrictionType fromValue(String v) {
        for (TypeFareRestrictionType c: TypeFareRestrictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
