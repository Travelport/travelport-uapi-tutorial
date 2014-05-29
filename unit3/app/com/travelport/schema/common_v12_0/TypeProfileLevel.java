
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="BranchGroup"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="TravelerGroup"/>
 *     &lt;enumeration value="Traveler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProfileLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeProfileLevel {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("TravelerGroup")
    TRAVELER_GROUP("TravelerGroup"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    TypeProfileLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileLevel fromValue(String v) {
        for (TypeProfileLevel c: TypeProfileLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
