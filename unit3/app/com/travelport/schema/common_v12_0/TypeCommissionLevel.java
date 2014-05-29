
package com.travelport.schema.common_v12_0;

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
 * &lt;simpleType name="typeCommissionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recalled"/>
 *     &lt;enumeration value="Fare"/>
 *     &lt;enumeration value="Penalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCommissionLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
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
