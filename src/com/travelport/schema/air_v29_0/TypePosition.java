
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="LeftCenter"/>
 *     &lt;enumeration value="RightCenter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePosition")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypePosition {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("LeftCenter")
    LEFT_CENTER("LeftCenter"),
    @XmlEnumValue("RightCenter")
    RIGHT_CENTER("RightCenter");
    private final String value;

    TypePosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePosition fromValue(String v) {
        for (TypePosition c: TypePosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
