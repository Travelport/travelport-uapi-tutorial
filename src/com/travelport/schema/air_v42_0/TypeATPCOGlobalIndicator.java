
package com.travelport.schema.air_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeATPCOGlobalIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeATPCOGlobalIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *     &lt;enumeration value="TB"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="WH"/&gt;
 *     &lt;enumeration value="ZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeATPCOGlobalIndicator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
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
