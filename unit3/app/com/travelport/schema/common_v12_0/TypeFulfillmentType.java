
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFulfillmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFulfillmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kiosk"/>
 *     &lt;enumeration value="Travel Agency"/>
 *     &lt;enumeration value="Courier"/>
 *     &lt;enumeration value="Standard Mail"/>
 *     &lt;enumeration value="Ticketless"/>
 *     &lt;enumeration value="Ticket Office"/>
 *     &lt;enumeration value="Express Mail"/>
 *     &lt;enumeration value="Corporate Kiosk"/>
 *     &lt;enumeration value="Train Station Service Desk"/>
 *     &lt;enumeration value="Direct Printing of Ticket"/>
 *     &lt;enumeration value="Printing of Ticket at Home"/>
 *     &lt;enumeration value="Digital Printing of Ticket at Home"/>
 *     &lt;enumeration value="Retrieve Ticket at Eurostar in London"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFulfillmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeFulfillmentType {

    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Travel Agency")
    TRAVEL_AGENCY("Travel Agency"),
    @XmlEnumValue("Courier")
    COURIER("Courier"),
    @XmlEnumValue("Standard Mail")
    STANDARD_MAIL("Standard Mail"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless"),
    @XmlEnumValue("Ticket Office")
    TICKET_OFFICE("Ticket Office"),
    @XmlEnumValue("Express Mail")
    EXPRESS_MAIL("Express Mail"),
    @XmlEnumValue("Corporate Kiosk")
    CORPORATE_KIOSK("Corporate Kiosk"),
    @XmlEnumValue("Train Station Service Desk")
    TRAIN_STATION_SERVICE_DESK("Train Station Service Desk"),
    @XmlEnumValue("Direct Printing of Ticket")
    DIRECT_PRINTING_OF_TICKET("Direct Printing of Ticket"),
    @XmlEnumValue("Printing of Ticket at Home")
    PRINTING_OF_TICKET_AT_HOME("Printing of Ticket at Home"),
    @XmlEnumValue("Digital Printing of Ticket at Home")
    DIGITAL_PRINTING_OF_TICKET_AT_HOME("Digital Printing of Ticket at Home"),
    @XmlEnumValue("Retrieve Ticket at Eurostar in London")
    RETRIEVE_TICKET_AT_EUROSTAR_IN_LONDON("Retrieve Ticket at Eurostar in London");
    private final String value;

    TypeFulfillmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFulfillmentType fromValue(String v) {
        for (TypeFulfillmentType c: TypeFulfillmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
