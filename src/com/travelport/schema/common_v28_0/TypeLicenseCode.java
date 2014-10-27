
package com.travelport.schema.common_v28_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLicenseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLicenseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Standard Plus"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="TE Only"/>
 *     &lt;enumeration value="uAPI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLicenseCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
public enum TypeLicenseCode {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Standard Plus")
    STANDARD_PLUS("Standard Plus"),
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("TE Only")
    TE_ONLY("TE Only"),
    @XmlEnumValue("uAPI")
    U_API("uAPI");
    private final String value;

    TypeLicenseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLicenseCode fromValue(String v) {
        for (TypeLicenseCode c: TypeLicenseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
