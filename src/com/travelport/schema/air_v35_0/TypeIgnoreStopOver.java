
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeIgnoreStopOver.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeIgnoreStopOver"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoStopOver"/&gt;
 *     &lt;enumeration value="StopOver"/&gt;
 *     &lt;enumeration value="IgnoreSegment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeIgnoreStopOver")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeIgnoreStopOver {


    /**
     * No Stop over included.
     * 
     */
    @XmlEnumValue("NoStopOver")
    NO_STOP_OVER("NoStopOver"),

    /**
     * Stop over included.
     * 
     */
    @XmlEnumValue("StopOver")
    STOP_OVER("StopOver"),

    /**
     * Segment Ignored.
     * 
     */
    @XmlEnumValue("IgnoreSegment")
    IGNORE_SEGMENT("IgnoreSegment");
    private final String value;

    TypeIgnoreStopOver(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeIgnoreStopOver fromValue(String v) {
        for (TypeIgnoreStopOver c: TypeIgnoreStopOver.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
