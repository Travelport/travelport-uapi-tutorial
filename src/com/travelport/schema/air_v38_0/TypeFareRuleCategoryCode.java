
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRuleCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRuleCategoryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="WHO"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="SEA"/&gt;
 *     &lt;enumeration value="FLT"/&gt;
 *     &lt;enumeration value="ADV"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="STP"/&gt;
 *     &lt;enumeration value="TRF"/&gt;
 *     &lt;enumeration value="CMB"/&gt;
 *     &lt;enumeration value="BLA"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="TVL"/&gt;
 *     &lt;enumeration value="TKT"/&gt;
 *     &lt;enumeration value="CHG"/&gt;
 *     &lt;enumeration value="HIP"/&gt;
 *     &lt;enumeration value="END"/&gt;
 *     &lt;enumeration value="CHD"/&gt;
 *     &lt;enumeration value="TUC"/&gt;
 *     &lt;enumeration value="AGT"/&gt;
 *     &lt;enumeration value="DSC"/&gt;
 *     &lt;enumeration value="MIS"/&gt;
 *     &lt;enumeration value="FBR"/&gt;
 *     &lt;enumeration value="GRP"/&gt;
 *     &lt;enumeration value="TUR"/&gt;
 *     &lt;enumeration value="VAC"/&gt;
 *     &lt;enumeration value="DEP"/&gt;
 *     &lt;enumeration value="VOL"/&gt;
 *     &lt;enumeration value="IVE"/&gt;
 *     &lt;enumeration value="VOR"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareRuleCategoryCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeFareRuleCategoryCode {


    /**
     * Rule App/Other Conditions
     * 
     */
    APP,

    /**
     * Eligibility
     * 
     */
    WHO,

    /**
     * Day/Time
     * 
     */
    DAY,

    /**
     * Seasonal
     * 
     */
    SEA,

    /**
     * Flight App
     * 
     */
    FLT,

    /**
     * Advance Res/Tkt
     * 
     */
    ADV,

    /**
     * Minimum Stay
     * 
     */
    MIN,

    /**
     * Maximum Stay
     * 
     */
    MAX,

    /**
     * Stopovers
     * 
     */
    STP,

    /**
     * Transfers/Routing
     *                     
     * 
     */
    TRF,

    /**
     * Combinability
     * 
     */
    CMB,

    /**
     * Blackouts
     * 
     */
    BLA,

    /**
     * Surcharges
     * 
     */
    SUR,

    /**
     * Accompanied
     * 
     */
    ACC,

    /**
     * Travel Restrictions
     * 
     */
    TVL,

    /**
     * Sales Restrictions
     * 
     */
    TKT,

    /**
     * Penalties
     * 
     */
    CHG,

    /**
     * HIP and Mileage Exceptions
     * 
     */
    HIP,

    /**
     * Ticket Endorsements
     * 
     */
    END,

    /**
     * Children"s Discounts
     * 
     */
    CHD,

    /**
     * Tour Conductor Disc
     * 
     */
    TUC,

    /**
     * Agent Discounts
     * 
     */
    AGT,

    /**
     * All Other Disc
     * 
     */
    DSC,

    /**
     * Misc Fare Tags
     * 
     */
    MIS,

    /**
     * Fare By Rule
     * 
     */
    FBR,

    /**
     * Groups
     * 
     */
    GRP,

    /**
     * Tours
     * 
     */
    TUR,

    /**
     * Visit Another Country
     * 
     */
    VAC,

    /**
     * Deposits
     * 
     */
    DEP,

    /**
     * Voluntary Changes
     * 
     */
    VOL,

    /**
     * Involuntary Exchanges
     *                     
     * 
     */
    IVE,

    /**
     * Voluntary Refunds
     * 
     */
    VOR,

    /**
     * Involuntary Refunds
     * 
     */
    IVR,

    /**
     * Negotiated Fares
     * 
     */
    NET,

    /**
     * Other
     * 
     */
    OTH;

    public String value() {
        return name();
    }

    public static TypeFareRuleCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
