
package com.travelport.schema.common_v32_0;

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
 * &lt;simpleType name="OptionalServiceApplicabilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Itinerary"/&gt;
 *     &lt;enumeration value="Passenger"/&gt;
 *     &lt;enumeration value="Segment"/&gt;
 *     &lt;enumeration value="PassengerSegment"/&gt;
 *     &lt;enumeration value="PassengerOD"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionalServiceApplicabilityType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum OptionalServiceApplicabilityType {

    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Passenger")
    PASSENGER("Passenger"),
    @XmlEnumValue("Segment")
    SEGMENT("Segment"),
    @XmlEnumValue("PassengerSegment")
    PASSENGER_SEGMENT("PassengerSegment"),

    /**
     * PassengerOD stands for passenger origin destination.
     * 
     */
    @XmlEnumValue("PassengerOD")
    PASSENGER_OD("PassengerOD"),
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
