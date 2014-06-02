
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareGuarantee.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareGuarantee">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="ManualFare"/>
 *     &lt;enumeration value="Guaranteed"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Restored"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Unticketable"/>
 *     &lt;enumeration value="Reprice"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="AutoUsingPrivateFare"/>
 *     &lt;enumeration value="GuaranteedUsingAirlinePrivateFare"/>
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="GuaranteeExpired"/>
 *     &lt;enumeration value="AgencyPrivateFareNoOverride"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareGuarantee")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeFareGuarantee {


    /**
     * Automatically generated
     *                
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * Agent has overridden default(s)
     *                
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Fare has been constructed by agent
     *                
     * 
     */
    @XmlEnumValue("ManualFare")
    MANUAL_FARE("ManualFare"),

    /**
     * Fare is guaranteed
     * 
     */
    @XmlEnumValue("Guaranteed")
    GUARANTEED("Guaranteed"),

    /**
     * Invalid fare, e.g. due to name or
     *                   itinerary change
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * Ticketed stored fare has been restored
     *                
     * 
     */
    @XmlEnumValue("Restored")
    RESTORED("Restored"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),

    /**
     * Unable to ticket
     * 
     */
    @XmlEnumValue("Unticketable")
    UNTICKETABLE("Unticketable"),

    /**
     * Need requote to ticket
     * 
     */
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),

    /**
     * Expired fare due to older fare guarantee date typically older than 7 days
     *                
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Agency private fares that are not guaranteed
     *                
     * 
     */
    @XmlEnumValue("AutoUsingPrivateFare")
    AUTO_USING_PRIVATE_FARE("AutoUsingPrivateFare"),

    /**
     * Guaranteed fare using Airline private fare that was filed with a fare distributor.
     *                
     * 
     */
    @XmlEnumValue("GuaranteedUsingAirlinePrivateFare")
    GUARANTEED_USING_AIRLINE_PRIVATE_FARE("GuaranteedUsingAirlinePrivateFare"),

    /**
     * Fare guaranteed by Airline.
     *                
     * 
     */
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),

    /**
     * Guaranteed fare recently got expired as ticketing hadn't been done within a time frame typically midnight local time of POS .
     * 
     */
    @XmlEnumValue("GuaranteeExpired")
    GUARANTEE_EXPIRED("GuaranteeExpired"),

    /**
     * Agency Private Fare with no rules override
     * 
     */
    @XmlEnumValue("AgencyPrivateFareNoOverride")
    AGENCY_PRIVATE_FARE_NO_OVERRIDE("AgencyPrivateFareNoOverride"),

    /**
     * To handle new enumerations added by provider but currently not recognized by API
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeFareGuarantee(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareGuarantee fromValue(String v) {
        for (TypeFareGuarantee c: TypeFareGuarantee.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
