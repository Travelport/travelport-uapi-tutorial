
package com.travelport.schema.common_v12_0;

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
 * &lt;simpleType name="typeCommissionModifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FarePercent"/>
 *     &lt;enumeration value="FareAmount"/>
 *     &lt;enumeration value="CommissionAmount"/>
 *     &lt;enumeration value="LessStandardCommission"/>
 *     &lt;enumeration value="StandardPlusSupplementaryPercent"/>
 *     &lt;enumeration value="SupplementaryPercent"/>
 *     &lt;enumeration value="SupplementaryAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCommissionModifier")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
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
