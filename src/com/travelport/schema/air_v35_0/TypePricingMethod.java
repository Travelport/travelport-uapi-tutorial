
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePricingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePricingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="ManualFare"/&gt;
 *     &lt;enumeration value="Guaranteed"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *     &lt;enumeration value="Restored"/&gt;
 *     &lt;enumeration value="Ticketed"/&gt;
 *     &lt;enumeration value="Unticketable"/&gt;
 *     &lt;enumeration value="Reprice"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="AutoUsingPrivateFare"/&gt;
 *     &lt;enumeration value="GuaranteedUsingAirlinePrivateFare"/&gt;
 *     &lt;enumeration value="Airline"/&gt;
 *     &lt;enumeration value="AgentAssisted"/&gt;
 *     &lt;enumeration value="VerifyPrice"/&gt;
 *     &lt;enumeration value="AltSegmentRemovedReprice"/&gt;
 *     &lt;enumeration value="AuxiliarySegmentRemovedReprice"/&gt;
 *     &lt;enumeration value="DuplicateSegmentRemovedReprice"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="GuaranteedUsingAgencyPrivateFare"/&gt;
 *     &lt;enumeration value="AutoRapidReprice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typePricingMethod")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypePricingMethod {


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
     * Expired fare, older than 7 days
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
     * Fare created as a result of Claim PNR which transfers data to GDS for ticketing purposes.
     *                
     * 
     */
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),

    /**
     * Worldspan TKG FAX Line Documentation - AGENT ASSISTEDPRICED
     *                
     * 
     */
    @XmlEnumValue("AgentAssisted")
    AGENT_ASSISTED("AgentAssisted"),

    /**
     * Worldspan TKG FAX Line Documentation -  AWAITING PRICE VERIFICATION 
     *                
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * Worldspan TKG FAX Line Documentation - AWAITING REPRICING ALT SEGS RMVD 
     *                
     * 
     */
    @XmlEnumValue("AltSegmentRemovedReprice")
    ALT_SEGMENT_REMOVED_REPRICE("AltSegmentRemovedReprice"),

    /**
     * Worldspan TKG FAX Line Documentation -  AWAITING REPRICING AUX SEGS REMOVED 
     *                
     * 
     */
    @XmlEnumValue("AuxiliarySegmentRemovedReprice")
    AUXILIARY_SEGMENT_REMOVED_REPRICE("AuxiliarySegmentRemovedReprice"),

    /**
     * Worldspan TKG FAX Line Documentation - AWAITING REPRICING DUPE SEGS REMOVED
     *                 
     * 
     */
    @XmlEnumValue("DuplicateSegmentRemovedReprice")
    DUPLICATE_SEGMENT_REMOVED_REPRICE("DuplicateSegmentRemovedReprice"),

    /**
     * Any other kind of Pricing Method which is not supported by API.
     *                 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Guaranteed fare using Agency private fare that was filed with a fare distributor.
     *                
     * 
     */
    @XmlEnumValue("GuaranteedUsingAgencyPrivateFare")
    GUARANTEED_USING_AGENCY_PRIVATE_FARE("GuaranteedUsingAgencyPrivateFare"),

    /**
     * Auto priced by rapid reprice. Provider 1P FCI code 4 .
     * 
     */
    @XmlEnumValue("AutoRapidReprice")
    AUTO_RAPID_REPRICE("AutoRapidReprice");
    private final String value;

    TypePricingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePricingMethod fromValue(String v) {
        for (TypePricingMethod c: TypePricingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
