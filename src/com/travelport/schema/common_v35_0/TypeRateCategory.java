
package com.travelport.schema.common_v35_0;

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
 * &lt;simpleType name="typeRateCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Association"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Corporate"/&gt;
 *     &lt;enumeration value="Government"/&gt;
 *     &lt;enumeration value="Industry"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *     &lt;enumeration value="Promotional"/&gt;
 *     &lt;enumeration value="Credential"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Consortium"/&gt;
 *     &lt;enumeration value="Convention"/&gt;
 *     &lt;enumeration value="Negotiated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRateCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
