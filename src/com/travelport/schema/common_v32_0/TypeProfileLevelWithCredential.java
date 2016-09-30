
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileLevelWithCredential.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileLevelWithCredential"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Agency"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="Agent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeProfileLevelWithCredential")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum TypeProfileLevelWithCredential {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeProfileLevelWithCredential(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileLevelWithCredential fromValue(String v) {
        for (TypeProfileLevelWithCredential c: TypeProfileLevelWithCredential.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
