
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAmenityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAmenityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="Room"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAmenityLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeAmenityLevel {

    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("Room")
    ROOM("Room");
    private final String value;

    TypeAmenityLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAmenityLevel fromValue(String v) {
        for (TypeAmenityLevel c: TypeAmenityLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
