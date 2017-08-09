
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAdjustmentTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAdjustmentTarget"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Base"/&gt;
 *     &lt;enumeration value="Total"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeAdjustmentTarget")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public enum TypeAdjustmentTarget {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeAdjustmentTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAdjustmentTarget fromValue(String v) {
        for (TypeAdjustmentTarget c: TypeAdjustmentTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
