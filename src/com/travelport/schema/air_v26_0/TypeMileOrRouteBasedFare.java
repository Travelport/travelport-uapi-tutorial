
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMileOrRouteBasedFare.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMileOrRouteBasedFare">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mile"/>
 *     &lt;enumeration value="Route"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMileOrRouteBasedFare")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeMileOrRouteBasedFare {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeMileOrRouteBasedFare(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMileOrRouteBasedFare fromValue(String v) {
        for (TypeMileOrRouteBasedFare c: TypeMileOrRouteBasedFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
