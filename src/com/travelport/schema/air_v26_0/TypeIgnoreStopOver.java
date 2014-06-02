
package com.travelport.schema.air_v26_0;

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
 * &lt;simpleType name="typeIgnoreStopOver">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoStopOver"/>
 *     &lt;enumeration value="StopOver"/>
 *     &lt;enumeration value="IgnoreSegment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeIgnoreStopOver")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
