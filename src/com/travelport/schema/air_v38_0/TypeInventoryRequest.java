
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeInventoryRequest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeInventoryRequest"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Seamless"/&gt;
 *     &lt;enumeration value="DirectAccess"/&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeInventoryRequest")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeInventoryRequest {

    @XmlEnumValue("Seamless")
    SEAMLESS("Seamless"),
    @XmlEnumValue("DirectAccess")
    DIRECT_ACCESS("DirectAccess"),
    @XmlEnumValue("Basic")
    BASIC("Basic");
    private final String value;

    TypeInventoryRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInventoryRequest fromValue(String v) {
        for (TypeInventoryRequest c: TypeInventoryRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
