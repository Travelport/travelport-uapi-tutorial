
package com.travelport.schema.common_v12_0;

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
 * &lt;simpleType name="typeEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Ticket"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="Void"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEventType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
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
