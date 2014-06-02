
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Airport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHotelLocation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeHotelLocation {

    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport");
    private final String value;

    TypeHotelLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelLocation fromValue(String v) {
        for (TypeHotelLocation c: TypeHotelLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
