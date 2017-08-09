
package com.travelport.schema.common_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileLevelWithSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileLevelWithSystem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="Agency"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="BranchGroup"/&gt;
 *     &lt;enumeration value="Agent"/&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="TravelerGroup"/&gt;
 *     &lt;enumeration value="Traveler"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeProfileLevelWithSystem")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeProfileLevelWithSystem {

    @XmlEnumValue("System")
    SYSTEM("System"),
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

    TypeProfileLevelWithSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileLevelWithSystem fromValue(String v) {
        for (TypeProfileLevelWithSystem c: TypeProfileLevelWithSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
