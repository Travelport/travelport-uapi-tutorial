
package com.travelport.schema.universal_v16_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeURStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeURStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Archived"/>
 *     &lt;enumeration value="Retained"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeURStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeURStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Archived")
    ARCHIVED("Archived"),
    @XmlEnumValue("Retained")
    RETAINED("Retained");
    private final String value;

    TypeURStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeURStatus fromValue(String v) {
        for (TypeURStatus c: TypeURStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
