
package com.travelport.schema.common_v15_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRecordStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRecordStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Past"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRecordStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeRecordStatus {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Past")
    PAST("Past"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeRecordStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRecordStatus fromValue(String v) {
        for (TypeRecordStatus c: TypeRecordStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
