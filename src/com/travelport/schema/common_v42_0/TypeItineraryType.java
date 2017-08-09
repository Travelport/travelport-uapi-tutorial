
package com.travelport.schema.common_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeItineraryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeItineraryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Original"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeItineraryType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeItineraryType {


    /**
     * Indicates the itinerary is New
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * Indicates the itinerary is Original
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    TypeItineraryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeItineraryType fromValue(String v) {
        for (TypeItineraryType c: TypeItineraryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
