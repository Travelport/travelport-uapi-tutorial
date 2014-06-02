
package com.travelport.schema.common_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePurchaseWindow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePurchaseWindow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BookingOnly"/>
 *     &lt;enumeration value="TicketingOnly"/>
 *     &lt;enumeration value="CheckInOnly"/>
 *     &lt;enumeration value="Anytime"/>
 *     &lt;enumeration value="PostTicketing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePurchaseWindow")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypePurchaseWindow {

    @XmlEnumValue("BookingOnly")
    BOOKING_ONLY("BookingOnly"),
    @XmlEnumValue("TicketingOnly")
    TICKETING_ONLY("TicketingOnly"),
    @XmlEnumValue("CheckInOnly")
    CHECK_IN_ONLY("CheckInOnly"),
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime"),
    @XmlEnumValue("PostTicketing")
    POST_TICKETING("PostTicketing");
    private final String value;

    TypePurchaseWindow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePurchaseWindow fromValue(String v) {
        for (TypePurchaseWindow c: TypePurchaseWindow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
