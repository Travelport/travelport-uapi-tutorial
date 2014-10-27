
package com.travelport.schema.common_v28_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mini"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Compact"/>
 *     &lt;enumeration value="Intermediate"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Fullsize"/>
 *     &lt;enumeration value="Luxury"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="MiniElite"/>
 *     &lt;enumeration value="EconomyElite"/>
 *     &lt;enumeration value="CompactElite"/>
 *     &lt;enumeration value="IntermediateElite"/>
 *     &lt;enumeration value="StandardElite"/>
 *     &lt;enumeration value="FullsizeElite"/>
 *     &lt;enumeration value="PremiumElite"/>
 *     &lt;enumeration value="LuxuryElite"/>
 *     &lt;enumeration value="Oversize"/>
 *     &lt;enumeration value="Subcompact"/>
 *     &lt;enumeration value="Minivan"/>
 *     &lt;enumeration value="TwelvePassengerVan"/>
 *     &lt;enumeration value="MovingVan"/>
 *     &lt;enumeration value="FifteenPassengerVan"/>
 *     &lt;enumeration value="CargoVan"/>
 *     &lt;enumeration value="TwelveFootTruck"/>
 *     &lt;enumeration value="TwentyFootTruck"/>
 *     &lt;enumeration value="TwentyfourFootTruck"/>
 *     &lt;enumeration value="TwentysixFootTruck"/>
 *     &lt;enumeration value="Moped"/>
 *     &lt;enumeration value="Stretch"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Unique"/>
 *     &lt;enumeration value="Exotic"/>
 *     &lt;enumeration value="SmallOrMediumTruck"/>
 *     &lt;enumeration value="LargeTruck"/>
 *     &lt;enumeration value="SmallSUV"/>
 *     &lt;enumeration value="MediumSUV"/>
 *     &lt;enumeration value="LargeSUV"/>
 *     &lt;enumeration value="ExoticSUV"/>
 *     &lt;enumeration value="FourWheelDrive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleClass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
public enum TypeVehicleClass {

    @XmlEnumValue("Mini")
    MINI("Mini"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Compact")
    COMPACT("Compact"),
    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Fullsize")
    FULLSIZE("Fullsize"),
    @XmlEnumValue("Luxury")
    LUXURY("Luxury"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("MiniElite")
    MINI_ELITE("MiniElite"),
    @XmlEnumValue("EconomyElite")
    ECONOMY_ELITE("EconomyElite"),
    @XmlEnumValue("CompactElite")
    COMPACT_ELITE("CompactElite"),
    @XmlEnumValue("IntermediateElite")
    INTERMEDIATE_ELITE("IntermediateElite"),
    @XmlEnumValue("StandardElite")
    STANDARD_ELITE("StandardElite"),
    @XmlEnumValue("FullsizeElite")
    FULLSIZE_ELITE("FullsizeElite"),
    @XmlEnumValue("PremiumElite")
    PREMIUM_ELITE("PremiumElite"),
    @XmlEnumValue("LuxuryElite")
    LUXURY_ELITE("LuxuryElite"),
    @XmlEnumValue("Oversize")
    OVERSIZE("Oversize"),
    @XmlEnumValue("Subcompact")
    SUBCOMPACT("Subcompact"),
    @XmlEnumValue("Minivan")
    MINIVAN("Minivan"),
    @XmlEnumValue("TwelvePassengerVan")
    TWELVE_PASSENGER_VAN("TwelvePassengerVan"),
    @XmlEnumValue("MovingVan")
    MOVING_VAN("MovingVan"),
    @XmlEnumValue("FifteenPassengerVan")
    FIFTEEN_PASSENGER_VAN("FifteenPassengerVan"),
    @XmlEnumValue("CargoVan")
    CARGO_VAN("CargoVan"),
    @XmlEnumValue("TwelveFootTruck")
    TWELVE_FOOT_TRUCK("TwelveFootTruck"),
    @XmlEnumValue("TwentyFootTruck")
    TWENTY_FOOT_TRUCK("TwentyFootTruck"),
    @XmlEnumValue("TwentyfourFootTruck")
    TWENTYFOUR_FOOT_TRUCK("TwentyfourFootTruck"),
    @XmlEnumValue("TwentysixFootTruck")
    TWENTYSIX_FOOT_TRUCK("TwentysixFootTruck"),
    @XmlEnumValue("Moped")
    MOPED("Moped"),
    @XmlEnumValue("Stretch")
    STRETCH("Stretch"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Unique")
    UNIQUE("Unique"),
    @XmlEnumValue("Exotic")
    EXOTIC("Exotic"),
    @XmlEnumValue("SmallOrMediumTruck")
    SMALL_OR_MEDIUM_TRUCK("SmallOrMediumTruck"),
    @XmlEnumValue("LargeTruck")
    LARGE_TRUCK("LargeTruck"),
    @XmlEnumValue("SmallSUV")
    SMALL_SUV("SmallSUV"),
    @XmlEnumValue("MediumSUV")
    MEDIUM_SUV("MediumSUV"),
    @XmlEnumValue("LargeSUV")
    LARGE_SUV("LargeSUV"),
    @XmlEnumValue("ExoticSUV")
    EXOTIC_SUV("ExoticSUV"),
    @XmlEnumValue("FourWheelDrive")
    FOUR_WHEEL_DRIVE("FourWheelDrive");
    private final String value;

    TypeVehicleClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleClass fromValue(String v) {
        for (TypeVehicleClass c: TypeVehicleClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
