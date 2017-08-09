
package com.travelport.schema.air_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSeatAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeSeatAvailability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Occupied"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="AdvancedBoardingPass"/&gt;
 *     &lt;enumeration value="InterlineCheckin"/&gt;
 *     &lt;enumeration value="Codeshare"/&gt;
 *     &lt;enumeration value="Protected"/&gt;
 *     &lt;enumeration value="PartnerAirline"/&gt;
 *     &lt;enumeration value="AdvSeatSelection"/&gt;
 *     &lt;enumeration value="Blocked"/&gt;
 *     &lt;enumeration value="Extra"/&gt;
 *     &lt;enumeration value="RBDRestriction"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="NoSeat"/&gt;
 *     &lt;enumeration value="UnoccupiedButNotEligible"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeSeatAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeSeatAvailability {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Occupied")
    OCCUPIED("Occupied"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("AdvancedBoardingPass")
    ADVANCED_BOARDING_PASS("AdvancedBoardingPass"),
    @XmlEnumValue("InterlineCheckin")
    INTERLINE_CHECKIN("InterlineCheckin"),
    @XmlEnumValue("Codeshare")
    CODESHARE("Codeshare"),
    @XmlEnumValue("Protected")
    PROTECTED("Protected"),
    @XmlEnumValue("PartnerAirline")
    PARTNER_AIRLINE("PartnerAirline"),
    @XmlEnumValue("AdvSeatSelection")
    ADV_SEAT_SELECTION("AdvSeatSelection"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("RBDRestriction")
    RBD_RESTRICTION("RBDRestriction"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("NoSeat")
    NO_SEAT("NoSeat"),
    @XmlEnumValue("UnoccupiedButNotEligible")
    UNOCCUPIED_BUT_NOT_ELIGIBLE("UnoccupiedButNotEligible");
    private final String value;

    TypeSeatAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeSeatAvailability fromValue(String v) {
        for (TypeSeatAvailability c: TypeSeatAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
