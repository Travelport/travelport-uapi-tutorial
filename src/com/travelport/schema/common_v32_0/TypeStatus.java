
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Issued"/&gt;
 *     &lt;enumeration value="ReadyToIssue"/&gt;
 *     &lt;enumeration value="IssueLater"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum TypeStatus {


    /**
     * The service fee has been issued.
     * 
     */
    @XmlEnumValue("Issued")
    ISSUED("Issued"),

    /**
     * The service fee is ready to be issued.
     * 
     */
    @XmlEnumValue("ReadyToIssue")
    READY_TO_ISSUE("ReadyToIssue"),

    /**
     * The service fee can be issued later.
     * 
     */
    @XmlEnumValue("IssueLater")
    ISSUE_LATER("IssueLater");
    private final String value;

    TypeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeStatus fromValue(String v) {
        for (TypeStatus c: TypeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
