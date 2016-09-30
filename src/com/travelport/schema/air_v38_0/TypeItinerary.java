
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeItinerary.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeItinerary"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="Pocket"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeItinerary")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeItinerary {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Pocket")
    POCKET("Pocket");
    private final String value;

    TypeItinerary(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeItinerary fromValue(String v) {
        for (TypeItinerary c: TypeItinerary.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
