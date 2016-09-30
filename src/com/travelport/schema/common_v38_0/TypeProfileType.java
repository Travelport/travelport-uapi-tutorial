
package com.travelport.schema.common_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AgencyGroup"/&gt;
 *     &lt;enumeration value="Agency"/&gt;
 *     &lt;enumeration value="BranchGroup"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="Agent"/&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="TravelerGroup"/&gt;
 *     &lt;enumeration value="Traveler"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeProfileType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public enum TypeProfileType {

    @XmlEnumValue("AgencyGroup")
    AGENCY_GROUP("AgencyGroup"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("TravelerGroup")
    TRAVELER_GROUP("TravelerGroup"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    TypeProfileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileType fromValue(String v) {
        for (TypeProfileType c: TypeProfileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
