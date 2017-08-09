
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCommissionModifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommissionModifier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FarePercent"/&gt;
 *     &lt;enumeration value="FareAmount"/&gt;
 *     &lt;enumeration value="CommissionAmount"/&gt;
 *     &lt;enumeration value="LessStandardCommission"/&gt;
 *     &lt;enumeration value="StandardPlusSupplementaryPercent"/&gt;
 *     &lt;enumeration value="SupplementaryPercent"/&gt;
 *     &lt;enumeration value="SupplementaryAmount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommissionModifier")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public enum TypeCommissionModifier {


    /**
     * Commission percentage applied to the fare
     * 
     */
    @XmlEnumValue("FarePercent")
    FARE_PERCENT("FarePercent"),

    /**
     * Commission amount applied to the fare 
     * 
     */
    @XmlEnumValue("FareAmount")
    FARE_AMOUNT("FareAmount"),

    /**
     * Specific commission amount to be applied
     * 
     */
    @XmlEnumValue("CommissionAmount")
    COMMISSION_AMOUNT("CommissionAmount"),

    /**
     * Indicates commission percentage applied to the fare less the standard commission
     * 
     */
    @XmlEnumValue("LessStandardCommission")
    LESS_STANDARD_COMMISSION("LessStandardCommission"),

    /**
     * Indicates commission percentage includes standard and supplementary commission
     * 
     */
    @XmlEnumValue("StandardPlusSupplementaryPercent")
    STANDARD_PLUS_SUPPLEMENTARY_PERCENT("StandardPlusSupplementaryPercent"),

    /**
     * Supplementary commission percent which is applied to the fare
     * 
     */
    @XmlEnumValue("SupplementaryPercent")
    SUPPLEMENTARY_PERCENT("SupplementaryPercent"),

    /**
     * Supplementary commission amount which is applied to the fare
     * 
     */
    @XmlEnumValue("SupplementaryAmount")
    SUPPLEMENTARY_AMOUNT("SupplementaryAmount");
    private final String value;

    TypeCommissionModifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommissionModifier fromValue(String v) {
        for (TypeCommissionModifier c: TypeCommissionModifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
