
package com.travelport.schema.util_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeShowProvidersType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeShowProvidersType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Provisioned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeShowProvidersType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeShowProvidersType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Provisioned")
    PROVISIONED("Provisioned");
    private final String value;

    TypeShowProvidersType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeShowProvidersType fromValue(String v) {
        for (TypeShowProvidersType c: TypeShowProvidersType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
