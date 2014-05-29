
package com.travelport.schema.common_v15_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLoggingLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLoggingLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRACE"/>
 *     &lt;enumeration value="DEBUG"/>
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="FATAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLoggingLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeLoggingLevel {

    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    FATAL;

    public String value() {
        return name();
    }

    public static TypeLoggingLevel fromValue(String v) {
        return valueOf(v);
    }

}
