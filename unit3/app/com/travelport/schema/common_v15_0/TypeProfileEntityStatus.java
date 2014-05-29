
package com.travelport.schema.common_v15_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileEntityStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileEntityStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProfileEntityStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeProfileEntityStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    TypeProfileEntityStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileEntityStatus fromValue(String v) {
        for (TypeProfileEntityStatus c: TypeProfileEntityStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
