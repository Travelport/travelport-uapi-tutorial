
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateGuarantee.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateGuarantee">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rate Guaranteed"/>
 *     &lt;enumeration value="Rate Quoted"/>
 *     &lt;enumeration value="Agent Entered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRateGuarantee")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public enum TypeRateGuarantee {

    @XmlEnumValue("Rate Guaranteed")
    RATE_GUARANTEED("Rate Guaranteed"),
    @XmlEnumValue("Rate Quoted")
    RATE_QUOTED("Rate Quoted"),
    @XmlEnumValue("Agent Entered")
    AGENT_ENTERED("Agent Entered");
    private final String value;

    TypeRateGuarantee(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateGuarantee fromValue(String v) {
        for (TypeRateGuarantee c: TypeRateGuarantee.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
