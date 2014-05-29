
package com.travelport.schema.air_v18_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRuleCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRuleCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="WHO"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="SEA"/>
 *     &lt;enumeration value="FLT"/>
 *     &lt;enumeration value="ADV"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="BLA"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="ACC"/>
 *     &lt;enumeration value="TVL"/>
 *     &lt;enumeration value="TKT"/>
 *     &lt;enumeration value="CHG"/>
 *     &lt;enumeration value="HIP"/>
 *     &lt;enumeration value="END"/>
 *     &lt;enumeration value="CHD"/>
 *     &lt;enumeration value="TUC"/>
 *     &lt;enumeration value="AGT"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="MIS"/>
 *     &lt;enumeration value="FBR"/>
 *     &lt;enumeration value="GRP"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="VAC"/>
 *     &lt;enumeration value="DEP"/>
 *     &lt;enumeration value="VOL"/>
 *     &lt;enumeration value="IVE"/>
 *     &lt;enumeration value="VOR"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="NET"/>
 *     &lt;enumeration value="OTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareRuleCategoryCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
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
