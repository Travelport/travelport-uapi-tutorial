
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareBreak.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareBreak"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MustBreak"/&gt;
 *     &lt;enumeration value="MustOnlyBreak"/&gt;
 *     &lt;enumeration value="MustNotBreak"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareBreak")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeFareBreak {


    /**
     * Break Fare at the associated segment.
     *                         Multiple Breaks or No Breaks may be allowed.
     * 
     */
    @XmlEnumValue("MustBreak")
    MUST_BREAK("MustBreak"),

    /**
     * Only Break Fare at the associated segment.
     *                         Fare Break in the entire itinerary is allowed only at the
     *                         concerned segment.
     * 
     */
    @XmlEnumValue("MustOnlyBreak")
    MUST_ONLY_BREAK("MustOnlyBreak"),

    /**
     * No Fare Break allowed at the associated
     *                         segment.
     * 
     */
    @XmlEnumValue("MustNotBreak")
    MUST_NOT_BREAK("MustNotBreak");
    private final String value;

    TypeFareBreak(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareBreak fromValue(String v) {
        for (TypeFareBreak c: TypeFareBreak.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
