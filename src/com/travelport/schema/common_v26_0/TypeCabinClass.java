
package com.travelport.schema.common_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCabinClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCabinClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="PremiumFirst"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCabinClass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeCabinClass {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("PremiumFirst")
    PREMIUM_FIRST("PremiumFirst");
    private final String value;

    TypeCabinClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCabinClass fromValue(String v) {
        for (TypeCabinClass c: TypeCabinClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
