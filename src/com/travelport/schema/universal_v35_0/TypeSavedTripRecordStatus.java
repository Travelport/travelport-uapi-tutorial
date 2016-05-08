
package com.travelport.schema.universal_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSavedTripRecordStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeSavedTripRecordStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Past"/&gt;
 *     &lt;enumeration value="Current"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeSavedTripRecordStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeSavedTripRecordStatus {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Past")
    PAST("Past"),
    @XmlEnumValue("Current")
    CURRENT("Current");
    private final String value;

    TypeSavedTripRecordStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeSavedTripRecordStatus fromValue(String v) {
        for (TypeSavedTripRecordStatus c: TypeSavedTripRecordStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
