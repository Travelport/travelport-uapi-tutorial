
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAssessIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAssessIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MileageAndCurrency"/>
 *     &lt;enumeration value="MileageOrCurrency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAssessIndicator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeAssessIndicator {

    @XmlEnumValue("MileageAndCurrency")
    MILEAGE_AND_CURRENCY("MileageAndCurrency"),
    @XmlEnumValue("MileageOrCurrency")
    MILEAGE_OR_CURRENCY("MileageOrCurrency");
    private final String value;

    TypeAssessIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAssessIndicator fromValue(String v) {
        for (TypeAssessIndicator c: TypeAssessIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
