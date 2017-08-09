
package com.travelport.schema.util_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMctConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMctConnection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DD"/&gt;
 *     &lt;enumeration value="DI"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="II"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMctConnection")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeMctConnection {

    DD,
    DI,
    ID,
    II;

    public String value() {
        return name();
    }

    public static TypeMctConnection fromValue(String v) {
        return valueOf(v);
    }

}
