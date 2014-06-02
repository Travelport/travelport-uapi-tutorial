
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PrePay"/>
 *     &lt;enumeration value="PostPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHotelPaymentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeHotelPaymentType {

    @XmlEnumValue("PrePay")
    PRE_PAY("PrePay"),
    @XmlEnumValue("PostPay")
    POST_PAY("PostPay");
    private final String value;

    TypeHotelPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelPaymentType fromValue(String v) {
        for (TypeHotelPaymentType c: TypeHotelPaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
