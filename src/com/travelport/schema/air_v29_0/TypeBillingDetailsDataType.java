
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBillingDetailsDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBillingDetailsDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="AlphaNumeric"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeBillingDetailsDataType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeBillingDetailsDataType {

    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("AlphaNumeric")
    ALPHA_NUMERIC("AlphaNumeric"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    TypeBillingDetailsDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBillingDetailsDataType fromValue(String v) {
        for (TypeBillingDetailsDataType c: TypeBillingDetailsDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
