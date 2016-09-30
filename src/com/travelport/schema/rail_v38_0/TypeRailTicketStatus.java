
package com.travelport.schema.rail_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRailTicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRailTicketStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Not Print Ready"/&gt;
 *     &lt;enumeration value="Can Be Printed"/&gt;
 *     &lt;enumeration value="Queued (sent to print module)"/&gt;
 *     &lt;enumeration value="Printed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRailTicketStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
public enum TypeRailTicketStatus {

    @XmlEnumValue("Not Print Ready")
    NOT_PRINT_READY("Not Print Ready"),
    @XmlEnumValue("Can Be Printed")
    CAN_BE_PRINTED("Can Be Printed"),
    @XmlEnumValue("Queued (sent to print module)")
    QUEUED_SENT_TO_PRINT_MODULE("Queued (sent to print module)"),
    @XmlEnumValue("Printed")
    PRINTED("Printed");
    private final String value;

    TypeRailTicketStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRailTicketStatus fromValue(String v) {
        for (TypeRailTicketStatus c: TypeRailTicketStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
