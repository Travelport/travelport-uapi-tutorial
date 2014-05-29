
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProviderToken.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProviderToken">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sabre"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProviderToken")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeProviderToken {

    @XmlEnumValue("Sabre")
    SABRE("Sabre");
    private final String value;

    TypeProviderToken(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProviderToken fromValue(String v) {
        for (TypeProviderToken c: TypeProviderToken.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
