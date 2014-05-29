
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRateCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRateCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Association"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Industry"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Inclusive"/>
 *     &lt;enumeration value="Promotional"/>
 *     &lt;enumeration value="Credential"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Consortium"/>
 *     &lt;enumeration value="Convention"/>
 *     &lt;enumeration value="Negotiated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRateCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeRateCategory {

    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Credential")
    CREDENTIAL("Credential"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Consortium")
    CONSORTIUM("Consortium"),
    @XmlEnumValue("Convention")
    CONVENTION("Convention"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated");
    private final String value;

    TypeRateCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRateCategory fromValue(String v) {
        for (TypeRateCategory c: TypeRateCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
