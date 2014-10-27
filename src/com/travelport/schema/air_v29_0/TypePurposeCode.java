
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePurposeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePurposeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Pleasure"/>
 *     &lt;enumeration value="CharterService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePurposeCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypePurposeCode {


    /**
     * Business
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * Pleasure
     * 
     */
    @XmlEnumValue("Pleasure")
    PLEASURE("Pleasure"),

    /**
     * Charter Service
     * 
     */
    @XmlEnumValue("CharterService")
    CHARTER_SERVICE("CharterService");
    private final String value;

    TypePurposeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePurposeCode fromValue(String v) {
        for (TypePurposeCode c: TypePurposeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
