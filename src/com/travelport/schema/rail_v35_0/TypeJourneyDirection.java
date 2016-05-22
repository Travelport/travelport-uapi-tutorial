
package com.travelport.schema.rail_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeJourneyDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeJourneyDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Outward"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeJourneyDirection")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypeJourneyDirection {

    @XmlEnumValue("Outward")
    OUTWARD("Outward"),
    @XmlEnumValue("Return")
    RETURN("Return");
    private final String value;

    TypeJourneyDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeJourneyDirection fromValue(String v) {
        for (TypeJourneyDirection c: TypeJourneyDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
