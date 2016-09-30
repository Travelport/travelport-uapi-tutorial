
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeImageSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeImageSize"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeImageSize")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
public enum TypeImageSize {

    T,
    I,
    S,
    M,
    L,
    E,
    G,
    F,
    B,
    J,
    O,
    H,
    C;

    public String value() {
        return name();
    }

    public static TypeImageSize fromValue(String v) {
        return valueOf(v);
    }

}
