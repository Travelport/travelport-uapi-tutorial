
package com.travelport.schema.hotel_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBedding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBedding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Twin"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Queen"/>
 *     &lt;enumeration value="King"/>
 *     &lt;enumeration value="SofaBed"/>
 *     &lt;enumeration value="MurphyBed"/>
 *     &lt;enumeration value="TatamiMats"/>
 *     &lt;enumeration value="Futon"/>
 *     &lt;enumeration value="RollawayAdult"/>
 *     &lt;enumeration value="RollawayChild"/>
 *     &lt;enumeration value="Crib"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeBedding")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeBedding {

    @XmlEnumValue("Twin")
    TWIN("Twin"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Queen")
    QUEEN("Queen"),
    @XmlEnumValue("King")
    KING("King"),
    @XmlEnumValue("SofaBed")
    SOFA_BED("SofaBed"),
    @XmlEnumValue("MurphyBed")
    MURPHY_BED("MurphyBed"),
    @XmlEnumValue("TatamiMats")
    TATAMI_MATS("TatamiMats"),
    @XmlEnumValue("Futon")
    FUTON("Futon"),
    @XmlEnumValue("RollawayAdult")
    ROLLAWAY_ADULT("RollawayAdult"),
    @XmlEnumValue("RollawayChild")
    ROLLAWAY_CHILD("RollawayChild"),
    @XmlEnumValue("Crib")
    CRIB("Crib");
    private final String value;

    TypeBedding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBedding fromValue(String v) {
        for (TypeBedding c: TypeBedding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
