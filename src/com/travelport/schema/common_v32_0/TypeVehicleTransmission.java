
package com.travelport.schema.common_v32_0;

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
 * &lt;simpleType name="typeVehicleTransmission"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="Automatic4WD"/&gt;
 *     &lt;enumeration value="AutomaticAWD"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Manual4WD"/&gt;
 *     &lt;enumeration value="ManualAWD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleTransmission")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
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
