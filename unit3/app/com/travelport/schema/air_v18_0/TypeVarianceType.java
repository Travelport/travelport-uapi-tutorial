
package com.travelport.schema.air_v18_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVarianceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVarianceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Diversion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVarianceType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeVarianceType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Diversion")
    DIVERSION("Diversion");
    private final String value;

    TypeVarianceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVarianceType fromValue(String v) {
        for (TypeVarianceType c: TypeVarianceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
