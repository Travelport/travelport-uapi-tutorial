
package com.travelport.schema.common_v35_0;

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
 * &lt;simpleType name="typeVoucherType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullCredit"/&gt;
 *     &lt;enumeration value="GroupOrDay"/&gt;
 *     &lt;enumeration value="SpecificValue"/&gt;
 *     &lt;enumeration value="RegularVoucher"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVoucherType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeVoucherType {

    @XmlEnumValue("FullCredit")
    FULL_CREDIT("FullCredit"),
    @XmlEnumValue("GroupOrDay")
    GROUP_OR_DAY("GroupOrDay"),
    @XmlEnumValue("SpecificValue")
    SPECIFIC_VALUE("SpecificValue"),
    @XmlEnumValue("RegularVoucher")
    REGULAR_VOUCHER("RegularVoucher");
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
