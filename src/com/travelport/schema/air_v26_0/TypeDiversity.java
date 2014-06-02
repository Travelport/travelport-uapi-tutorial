
package com.travelport.schema.air_v26_0;

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
 * &lt;simpleType name="typeDiversity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Blend"/>
 *     &lt;enumeration value="Airports"/>
 *     &lt;enumeration value="Carrier"/>
 *     &lt;enumeration value="Origin"/>
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="DateCombination"/>
 *     &lt;enumeration value="FirstODDate"/>
 *     &lt;enumeration value="SecondODDate"/>
 *     &lt;enumeration value="FirstOD"/>
 *     &lt;enumeration value="SecondOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDiversity")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
