
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDistance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDistance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="KM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDistance")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeDistance {

    MI,
    KM;

    public String value() {
        return name();
    }

    public static TypeDistance fromValue(String v) {
        return valueOf(v);
    }

}
