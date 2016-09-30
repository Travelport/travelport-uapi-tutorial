
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URTicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URTicketStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ticketed"/&gt;
 *     &lt;enumeration value="Unticketed"/&gt;
 *     &lt;enumeration value="Partially Ticketed"/&gt;
 *     &lt;enumeration value="Not Applicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "URTicketStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum URTicketStatus {

    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Unticketed")
    UNTICKETED("Unticketed"),
    @XmlEnumValue("Partially Ticketed")
    PARTIALLY_TICKETED("Partially Ticketed"),
    @XmlEnumValue("Not Applicable")
    NOT_APPLICABLE("Not Applicable");
    private final String value;

    URTicketStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URTicketStatus fromValue(String v) {
        for (URTicketStatus c: URTicketStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
