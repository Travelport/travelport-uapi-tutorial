
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeATPCOGlobalIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeATPCOGlobalIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="FE"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TB"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="WH"/>
 *     &lt;enumeration value="ZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeATPCOGlobalIndicator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeATPCOGlobalIndicator {


    /**
     * FareByRule -- All fares incl. EH/TS
     *                     
     * 
     */
    AL,

    /**
     * Via Atlantic Pacific
     * 
     */
    AP,

    /**
     * Via Atlantic
     * 
     */
    AT,

    /**
     * Within Canada.
     * 
     */
    CA,

    /**
     * Circle trip.
     * 
     */
    CT,

    /**
     * Within Eastern Hemisphere
     *                     
     * 
     */
    EH,

    /**
     * Far East
     * 
     */
    FE,

    /**
     * FareByRule - For int'l incl.
     *                         AT/PA/WH/CT/RW
     * 
     */
    IN,

    /**
     * FareByRule for North America incl
     *                         US/CA/TB/PV
     * 
     */
    NA,

    /**
     * Via Pacific
     * 
     */
    PA,

    /**
     * Via Pacific and via North America
     *                     
     * 
     */
    PN,

    /**
     * Via Polar Route.
     * 
     */
    PO,

    /**
     * Russia - Area 3 
     * 
     */
    RU,

    /**
     * Round The World.
     * 
     */
    RW,

    /**
     * South Atlantic only
     * 
     */
    SA,

    /**
     * Via South Polar Route
     * 
     */
    SP,

    /**
     * Trans-border
     * 
     */
    TB,

    /**
     * Via Siberia.
     * 
     */
    TS,

    /**
     * Within the United States.
     *                     
     * 
     */
    US,

    /**
     * Within Western Hemisphere
     *                     
     * 
     */
    WH,

    /**
     * Any Global
     * 
     */
    ZZ;

    public String value() {
        return name();
    }

    public static TypeATPCOGlobalIndicator fromValue(String v) {
        return valueOf(v);
    }

}
