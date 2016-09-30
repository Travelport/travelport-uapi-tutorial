
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeReqSeat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeReqSeat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Aisle"/&gt;
 *     &lt;enumeration value="Bulkhead"/&gt;
 *     &lt;enumeration value="Exit"/&gt;
 *     &lt;enumeration value="Window"/&gt;
 *     &lt;enumeration value="Middle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeReqSeat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum TypeReqSeat {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Bulkhead")
    BULKHEAD("Bulkhead"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle");
    private final String value;

    TypeReqSeat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeReqSeat fromValue(String v) {
        for (TypeReqSeat c: TypeReqSeat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
