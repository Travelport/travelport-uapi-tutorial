
package com.travelport.schema.common_v35_0;

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
 * &lt;simpleType name="typeFuel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Petrol"/&gt;
 *     &lt;enumeration value="Diesel"/&gt;
 *     &lt;enumeration value="Hybrid"/&gt;
 *     &lt;enumeration value="Electric"/&gt;
 *     &lt;enumeration value="LPGCNG"/&gt;
 *     &lt;enumeration value="Hydrogen"/&gt;
 *     &lt;enumeration value="MultiFuel"/&gt;
 *     &lt;enumeration value="Ethanol"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFuel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
