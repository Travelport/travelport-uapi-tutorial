
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeGdsRemark.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeGdsRemark">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Itinerary"/>
 *     &lt;enumeration value="Vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeGdsRemark")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeGdsRemark {

    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    TypeGdsRemark(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeGdsRemark fromValue(String v) {
        for (TypeGdsRemark c: TypeGdsRemark.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
