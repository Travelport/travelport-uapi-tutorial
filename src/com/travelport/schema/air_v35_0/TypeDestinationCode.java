
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDestinationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDestinationCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MexicoCostRicaCentralAmerica"/&gt;
 *     &lt;enumeration value="Caribbean"/&gt;
 *     &lt;enumeration value="SouthAmerica"/&gt;
 *     &lt;enumeration value="Europe"/&gt;
 *     &lt;enumeration value="Africa"/&gt;
 *     &lt;enumeration value="MiddleEastWesternAsia"/&gt;
 *     &lt;enumeration value="Asia"/&gt;
 *     &lt;enumeration value="AustraliaNewZealandPacificIslands"/&gt;
 *     &lt;enumeration value="CanadaGreenland"/&gt;
 *     &lt;enumeration value="USA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDestinationCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypeDestinationCode {


    /**
     * Mexico/Central America/Canal
     *                         Zone/Costa Rica
     * 
     */
    @XmlEnumValue("MexicoCostRicaCentralAmerica")
    MEXICO_COST_RICA_CENTRAL_AMERICA("MexicoCostRicaCentralAmerica"),

    /**
     * Island and Countries of The Caribbean
     * 
     */
    @XmlEnumValue("Caribbean")
    CARIBBEAN("Caribbean"),

    /**
     * South America
     * 
     */
    @XmlEnumValue("SouthAmerica")
    SOUTH_AMERICA("SouthAmerica"),

    /**
     * Europe
     * 
     */
    @XmlEnumValue("Europe")
    EUROPE("Europe"),

    /**
     * Africa
     * 
     */
    @XmlEnumValue("Africa")
    AFRICA("Africa"),

    /**
     * Middle East/Western Asia
     * 
     */
    @XmlEnumValue("MiddleEastWesternAsia")
    MIDDLE_EAST_WESTERN_ASIA("MiddleEastWesternAsia"),

    /**
     * Asia
     * 
     */
    @XmlEnumValue("Asia")
    ASIA("Asia"),

    /**
     * Australia/New Zealand/Pacific Islands
     * 
     */
    @XmlEnumValue("AustraliaNewZealandPacificIslands")
    AUSTRALIA_NEW_ZEALAND_PACIFIC_ISLANDS("AustraliaNewZealandPacificIslands"),

    /**
     * Canada and Greenland
     * 
     */
    @XmlEnumValue("CanadaGreenland")
    CANADA_GREENLAND("CanadaGreenland"),

    /**
     * United States of America
     * 
     */
    USA("USA");
    private final String value;

    TypeDestinationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDestinationCode fromValue(String v) {
        for (TypeDestinationCode c: TypeDestinationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
