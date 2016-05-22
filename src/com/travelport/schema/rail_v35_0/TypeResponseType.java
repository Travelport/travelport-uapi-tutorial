
package com.travelport.schema.rail_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Availability"/&gt;
 *     &lt;enumeration value="Schedules"/&gt;
 *     &lt;enumeration value="Fares"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeResponseType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypeResponseType {

    @XmlEnumValue("Availability")
    AVAILABILITY("Availability"),
    @XmlEnumValue("Schedules")
    SCHEDULES("Schedules"),
    @XmlEnumValue("Fares")
    FARES("Fares");
    private final String value;

    TypeResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeResponseType fromValue(String v) {
        for (TypeResponseType c: TypeResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
