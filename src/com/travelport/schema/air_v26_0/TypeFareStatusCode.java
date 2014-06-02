
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReadyToTicket"/>
 *     &lt;enumeration value="UnableToTicket"/>
 *     &lt;enumeration value="Reprice"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Unable"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareStatusCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeFareStatusCode {


    /**
     * Fare is enabled and available for ticketing
     * 
     */
    @XmlEnumValue("ReadyToTicket")
    READY_TO_TICKET("ReadyToTicket"),

    /**
     * Fare could not be ticketed 
     * 
     */
    @XmlEnumValue("UnableToTicket")
    UNABLE_TO_TICKET("UnableToTicket"),

    /**
     * Fare needs to be repriced
     * 
     */
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),

    /**
     * Fare is ticketed
     * 
     */
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),

    /**
     * Fare is not enabled
     * 
     */
    @XmlEnumValue("Unable")
    UNABLE("Unable"),

    /**
     * To handle new enumerations added by provider but currently not recognized by API
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeFareStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareStatusCode fromValue(String v) {
        for (TypeFareStatusCode c: TypeFareStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
