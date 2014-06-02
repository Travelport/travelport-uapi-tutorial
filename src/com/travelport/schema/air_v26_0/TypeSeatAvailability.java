
package com.travelport.schema.air_v26_0;

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
 * &lt;simpleType name="typeSeatAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Occupied"/>
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="AdvancedBoardingPass"/>
 *     &lt;enumeration value="InterlineCheckin"/>
 *     &lt;enumeration value="Codeshare"/>
 *     &lt;enumeration value="Protected"/>
 *     &lt;enumeration value="PartnerAirline"/>
 *     &lt;enumeration value="AdvSeatSelection"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Extra"/>
 *     &lt;enumeration value="RBDRestriction"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="NoSeat"/>
 *     &lt;enumeration value="UnoccupiedButNotEligible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeSeatAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
