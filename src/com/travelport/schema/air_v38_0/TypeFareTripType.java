
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareTripType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareTripType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneWay"/&gt;
 *     &lt;enumeration value="OneWayOnly"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="ReturnOnly"/&gt;
 *     &lt;enumeration value="HalfReturn"/&gt;
 *     &lt;enumeration value="CircleTrip"/&gt;
 *     &lt;enumeration value="RoundTheWorld"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFareTripType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeFareTripType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("ReturnOnly")
    RETURN_ONLY("ReturnOnly"),
    @XmlEnumValue("HalfReturn")
    HALF_RETURN("HalfReturn"),
    @XmlEnumValue("CircleTrip")
    CIRCLE_TRIP("CircleTrip"),
    @XmlEnumValue("RoundTheWorld")
    ROUND_THE_WORLD("RoundTheWorld");
    private final String value;

    TypeFareTripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareTripType fromValue(String v) {
        for (TypeFareTripType c: TypeFareTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
