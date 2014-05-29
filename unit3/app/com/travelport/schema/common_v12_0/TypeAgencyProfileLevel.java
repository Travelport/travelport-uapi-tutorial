
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyProfileLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAgencyProfileLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="BranchGroup"/>
 *     &lt;enumeration value="Agent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAgencyProfileLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeAgencyProfileLevel {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeAgencyProfileLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAgencyProfileLevel fromValue(String v) {
        for (TypeAgencyProfileLevel c: TypeAgencyProfileLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
