
package com.travelport.schema.common_v29_0;

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
 * &lt;simpleType name="typeAdjustmentTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAdjustmentTarget")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
