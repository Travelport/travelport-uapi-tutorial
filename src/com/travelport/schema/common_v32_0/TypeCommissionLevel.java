
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCommissionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCommissionLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Recalled"/&gt;
 *     &lt;enumeration value="Fare"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCommissionLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
public enum TypeCommissionLevel {

    @XmlEnumValue("Recalled")
    RECALLED("Recalled"),
    @XmlEnumValue("Fare")
    FARE("Fare"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    TypeCommissionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCommissionLevel fromValue(String v) {
        for (TypeCommissionLevel c: TypeCommissionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
