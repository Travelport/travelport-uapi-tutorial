
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFuel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFuel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Petrol"/>
 *     &lt;enumeration value="Diesel"/>
 *     &lt;enumeration value="Hybrid"/>
 *     &lt;enumeration value="Electric"/>
 *     &lt;enumeration value="LPGCNG"/>
 *     &lt;enumeration value="Hydrogen"/>
 *     &lt;enumeration value="MultiFuel"/>
 *     &lt;enumeration value="Ethanol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFuel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public enum TypeFuel {

    @XmlEnumValue("Petrol")
    PETROL("Petrol"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    @XmlEnumValue("Hybrid")
    HYBRID("Hybrid"),
    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    LPGCNG("LPGCNG"),
    @XmlEnumValue("Hydrogen")
    HYDROGEN("Hydrogen"),
    @XmlEnumValue("MultiFuel")
    MULTI_FUEL("MultiFuel"),
    @XmlEnumValue("Ethanol")
    ETHANOL("Ethanol");
    private final String value;

    TypeFuel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFuel fromValue(String v) {
        for (TypeFuel c: TypeFuel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
