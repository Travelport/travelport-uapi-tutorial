
package com.travelport.schema.rail_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRailSegmentInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRailSegmentInfo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Extra"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *     &lt;enumeration value="Services"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeRailSegmentInfo")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypeRailSegmentInfo {

    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("Services")
    SERVICES("Services");
    private final String value;

    TypeRailSegmentInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeRailSegmentInfo fromValue(String v) {
        for (TypeRailSegmentInfo c: TypeRailSegmentInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
