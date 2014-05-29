
package com.travelport.schema.air_v18_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="long"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareRuleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeFareRuleType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("long")
    LONG("long");
    private final String value;

    TypeFareRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareRuleType fromValue(String v) {
        for (TypeFareRuleType c: TypeFareRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
