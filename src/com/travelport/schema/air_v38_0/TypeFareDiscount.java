
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareDiscount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareDiscount"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BaseReCalcUSTaxes"/&gt;
 *     &lt;enumeration value="BaseNoReCalcUSTaxes"/&gt;
 *     &lt;enumeration value="BaseTax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareDiscount")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeFareDiscount {

    @XmlEnumValue("BaseReCalcUSTaxes")
    BASE_RE_CALC_US_TAXES("BaseReCalcUSTaxes"),
    @XmlEnumValue("BaseNoReCalcUSTaxes")
    BASE_NO_RE_CALC_US_TAXES("BaseNoReCalcUSTaxes"),
    @XmlEnumValue("BaseTax")
    BASE_TAX("BaseTax");
    private final String value;

    TypeFareDiscount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareDiscount fromValue(String v) {
        for (TypeFareDiscount c: TypeFareDiscount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
