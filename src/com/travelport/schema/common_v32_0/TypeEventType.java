
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Ticket"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="Void"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeEventType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum TypeEventType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Void")
    VOID("Void");
    private final String value;

    TypeEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeEventType fromValue(String v) {
        for (TypeEventType c: TypeEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
