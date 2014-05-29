
package com.travelport.schema.universal_v16_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeReservationTicketed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeReservationTicketed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Not Applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeReservationTicketed")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeReservationTicketed {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Not Applicable")
    NOT_APPLICABLE("Not Applicable");
    private final String value;

    TypeReservationTicketed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeReservationTicketed fromValue(String v) {
        for (TypeReservationTicketed c: TypeReservationTicketed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
