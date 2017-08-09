
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFarePull.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFarePull"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReverseOfOriginDestination"/&gt;
 *     &lt;enumeration value="SameAsOriginDestination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFarePull")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public enum TypeFarePull {

    @XmlEnumValue("ReverseOfOriginDestination")
    REVERSE_OF_ORIGIN_DESTINATION("ReverseOfOriginDestination"),
    @XmlEnumValue("SameAsOriginDestination")
    SAME_AS_ORIGIN_DESTINATION("SameAsOriginDestination");
    private final String value;

    TypeFarePull(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFarePull fromValue(String v) {
        for (TypeFarePull c: TypeFarePull.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
