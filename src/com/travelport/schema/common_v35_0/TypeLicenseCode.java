
package com.travelport.schema.common_v35_0;

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
 * &lt;simpleType name="typeLicenseCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Standard Plus"/&gt;
 *     &lt;enumeration value="Enterprise"/&gt;
 *     &lt;enumeration value="TE Only"/&gt;
 *     &lt;enumeration value="uAPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeLicenseCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
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
