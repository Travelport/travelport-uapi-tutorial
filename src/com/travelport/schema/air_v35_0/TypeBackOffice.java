
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBackOffice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBackOffice"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Accounting"/&gt;
 *     &lt;enumeration value="Global"/&gt;
 *     &lt;enumeration value="NonAccounting"/&gt;
 *     &lt;enumeration value="NonAccountingRemote"/&gt;
 *     &lt;enumeration value="Dual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeBackOffice")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeBackOffice {

    @XmlEnumValue("Accounting")
    ACCOUNTING("Accounting"),
    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("NonAccounting")
    NON_ACCOUNTING("NonAccounting"),
    @XmlEnumValue("NonAccountingRemote")
    NON_ACCOUNTING_REMOTE("NonAccountingRemote"),
    @XmlEnumValue("Dual")
    DUAL("Dual");
    private final String value;

    TypeBackOffice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBackOffice fromValue(String v) {
        for (TypeBackOffice c: TypeBackOffice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
