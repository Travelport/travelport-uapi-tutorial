
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDiversity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDiversity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Blend"/&gt;
 *     &lt;enumeration value="Airports"/&gt;
 *     &lt;enumeration value="Carrier"/&gt;
 *     &lt;enumeration value="Origin"/&gt;
 *     &lt;enumeration value="Destination"/&gt;
 *     &lt;enumeration value="DateCombination"/&gt;
 *     &lt;enumeration value="FirstODDate"/&gt;
 *     &lt;enumeration value="SecondODDate"/&gt;
 *     &lt;enumeration value="FirstOD"/&gt;
 *     &lt;enumeration value="SecondOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDiversity")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeDiversity {

    @XmlEnumValue("Blend")
    BLEND("Blend"),
    @XmlEnumValue("Airports")
    AIRPORTS("Airports"),
    @XmlEnumValue("Carrier")
    CARRIER("Carrier"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("DateCombination")
    DATE_COMBINATION("DateCombination"),
    @XmlEnumValue("FirstODDate")
    FIRST_OD_DATE("FirstODDate"),
    @XmlEnumValue("SecondODDate")
    SECOND_OD_DATE("SecondODDate"),
    @XmlEnumValue("FirstOD")
    FIRST_OD("FirstOD"),
    @XmlEnumValue("SecondOD")
    SECOND_OD("SecondOD");
    private final String value;

    TypeDiversity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDiversity fromValue(String v) {
        for (TypeDiversity c: TypeDiversity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
