
package com.travelport.schema.common_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMCOStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMCOStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Used"/&gt;
 *     &lt;enumeration value="Refunded"/&gt;
 *     &lt;enumeration value="Voided"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMCOStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeMCOStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Used")
    USED("Used"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    TypeMCOStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMCOStatus fromValue(String v) {
        for (TypeMCOStatus c: TypeMCOStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
