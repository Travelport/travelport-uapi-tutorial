
package com.travelport.schema.common_v28_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleTransmission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleTransmission">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Automatic4WD"/>
 *     &lt;enumeration value="AutomaticAWD"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Manual4WD"/>
 *     &lt;enumeration value="ManualAWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleTransmission")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
public enum TypeVehicleTransmission {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Automatic4WD")
    AUTOMATIC_4_WD("Automatic4WD"),
    @XmlEnumValue("AutomaticAWD")
    AUTOMATIC_AWD("AutomaticAWD"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Manual4WD")
    MANUAL_4_WD("Manual4WD"),
    @XmlEnumValue("ManualAWD")
    MANUAL_AWD("ManualAWD");
    private final String value;

    TypeVehicleTransmission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleTransmission fromValue(String v) {
        for (TypeVehicleTransmission c: TypeVehicleTransmission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
