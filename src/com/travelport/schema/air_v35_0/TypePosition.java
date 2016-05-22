
package com.travelport.schema.air_v35_0;

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
 * &lt;simpleType name="typePosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Left"/&gt;
 *     &lt;enumeration value="Right"/&gt;
 *     &lt;enumeration value="Center"/&gt;
 *     &lt;enumeration value="LeftCenter"/&gt;
 *     &lt;enumeration value="RightCenter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typePosition")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
