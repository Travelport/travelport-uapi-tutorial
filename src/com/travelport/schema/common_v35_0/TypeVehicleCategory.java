
package com.travelport.schema.common_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Car"/&gt;
 *     &lt;enumeration value="Van"/&gt;
 *     &lt;enumeration value="SUV"/&gt;
 *     &lt;enumeration value="Convertible"/&gt;
 *     &lt;enumeration value="Truck"/&gt;
 *     &lt;enumeration value="StationWagon"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="AllTerrain"/&gt;
 *     &lt;enumeration value="Recreational"/&gt;
 *     &lt;enumeration value="Sport"/&gt;
 *     &lt;enumeration value="Special"/&gt;
 *     &lt;enumeration value="ExtendedCabPickup"/&gt;
 *     &lt;enumeration value="RegularCabPickup"/&gt;
 *     &lt;enumeration value="SpecialOffer"/&gt;
 *     &lt;enumeration value="Coupe"/&gt;
 *     &lt;enumeration value="Monospace"/&gt;
 *     &lt;enumeration value="Roadster"/&gt;
 *     &lt;enumeration value="Crossover"/&gt;
 *     &lt;enumeration value="Motorcycle"/&gt;
 *     &lt;enumeration value="Limo"/&gt;
 *     &lt;enumeration value="Motorhome"/&gt;
 *     &lt;enumeration value="TwoWheelVehicle"/&gt;
 *     &lt;enumeration value="CommercialVanOrTruck"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeVehicleCategory {

    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Van")
    VAN("Van"),
    SUV("SUV"),
    @XmlEnumValue("Convertible")
    CONVERTIBLE("Convertible"),
    @XmlEnumValue("Truck")
    TRUCK("Truck"),
    @XmlEnumValue("StationWagon")
    STATION_WAGON("StationWagon"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("AllTerrain")
    ALL_TERRAIN("AllTerrain"),
    @XmlEnumValue("Recreational")
    RECREATIONAL("Recreational"),
    @XmlEnumValue("Sport")
    SPORT("Sport"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("ExtendedCabPickup")
    EXTENDED_CAB_PICKUP("ExtendedCabPickup"),
    @XmlEnumValue("RegularCabPickup")
    REGULAR_CAB_PICKUP("RegularCabPickup"),
    @XmlEnumValue("SpecialOffer")
    SPECIAL_OFFER("SpecialOffer"),
    @XmlEnumValue("Coupe")
    COUPE("Coupe"),
    @XmlEnumValue("Monospace")
    MONOSPACE("Monospace"),
    @XmlEnumValue("Roadster")
    ROADSTER("Roadster"),
    @XmlEnumValue("Crossover")
    CROSSOVER("Crossover"),
    @XmlEnumValue("Motorcycle")
    MOTORCYCLE("Motorcycle"),
    @XmlEnumValue("Limo")
    LIMO("Limo"),
    @XmlEnumValue("Motorhome")
    MOTORHOME("Motorhome"),
    @XmlEnumValue("TwoWheelVehicle")
    TWO_WHEEL_VEHICLE("TwoWheelVehicle"),
    @XmlEnumValue("CommercialVanOrTruck")
    COMMERCIAL_VAN_OR_TRUCK("CommercialVanOrTruck");
    private final String value;

    TypeVehicleCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleCategory fromValue(String v) {
        for (TypeVehicleCategory c: TypeVehicleCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
