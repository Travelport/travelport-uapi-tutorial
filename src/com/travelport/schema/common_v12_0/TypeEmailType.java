
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeEmailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEmailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Exec Admin"/>
 *     &lt;enumeration value="Assistant"/>
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="Agency"/>
 *     &lt;enumeration value="Business Office"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="Sales Office"/>
 *     &lt;enumeration value="Reservations"/>
 *     &lt;enumeration value="Listserve"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEmailType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public enum TypeEmailType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Exec Admin")
    EXEC_ADMIN("Exec Admin"),
    @XmlEnumValue("Assistant")
    ASSISTANT("Assistant"),
    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Business Office")
    BUSINESS_OFFICE("Business Office"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("Sales Office")
    SALES_OFFICE("Sales Office"),
    @XmlEnumValue("Reservations")
    RESERVATIONS("Reservations"),
    @XmlEnumValue("Listserve")
    LISTSERVE("Listserve"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeEmailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeEmailType fromValue(String v) {
        for (TypeEmailType c: TypeEmailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
