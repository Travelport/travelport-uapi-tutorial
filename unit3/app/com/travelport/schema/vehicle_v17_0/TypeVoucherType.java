
package com.travelport.schema.vehicle_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVoucherType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVoucherType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullCredit"/>
 *     &lt;enumeration value="GroupOrDay"/>
 *     &lt;enumeration value="SpecificValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVoucherType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeVoucherType {

    @XmlEnumValue("FullCredit")
    FULL_CREDIT("FullCredit"),
    @XmlEnumValue("GroupOrDay")
    GROUP_OR_DAY("GroupOrDay"),
    @XmlEnumValue("SpecificValue")
    SPECIFIC_VALUE("SpecificValue");
    private final String value;

    TypeVoucherType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVoucherType fromValue(String v) {
        for (TypeVoucherType c: TypeVoucherType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
