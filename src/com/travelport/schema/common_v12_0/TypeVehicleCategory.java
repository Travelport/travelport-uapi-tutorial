
package com.travelport.schema.common_v12_0;

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
 * &lt;simpleType name="typeVehicleCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="Van"/>
 *     &lt;enumeration value="SUV"/>
 *     &lt;enumeration value="Convertible"/>
 *     &lt;enumeration value="Truck"/>
 *     &lt;enumeration value="StationWagon"/>
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="AllTerrain"/>
 *     &lt;enumeration value="Recreational"/>
 *     &lt;enumeration value="Sport"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="ExtendedCabPickup"/>
 *     &lt;enumeration value="RegularCabPickup"/>
 *     &lt;enumeration value="SpecialOffer"/>
 *     &lt;enumeration value="Coupe"/>
 *     &lt;enumeration value="Monospace"/>
 *     &lt;enumeration value="Roadster"/>
 *     &lt;enumeration value="Crossover"/>
 *     &lt;enumeration value="Motorcycle"/>
 *     &lt;enumeration value="Limo"/>
 *     &lt;enumeration value="Motorhome"/>
 *     &lt;enumeration value="TwoWheelVehicle"/>
 *     &lt;enumeration value="CommercialVanOrTruck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
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
