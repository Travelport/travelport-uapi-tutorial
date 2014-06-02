
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionalServiceApplicabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionalServiceApplicabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Itinerary"/>
 *     &lt;enumeration value="Passenger"/>
 *     &lt;enumeration value="Segment"/>
 *     &lt;enumeration value="PassengerSegment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionalServiceApplicabilityType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public enum OptionalServiceApplicabilityType {

    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Passenger")
    PASSENGER("Passenger"),
    @XmlEnumValue("Segment")
    SEGMENT("Segment"),
    @XmlEnumValue("PassengerSegment")
    PASSENGER_SEGMENT("PassengerSegment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OptionalServiceApplicabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionalServiceApplicabilityType fromValue(String v) {
        for (OptionalServiceApplicabilityType c: OptionalServiceApplicabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
