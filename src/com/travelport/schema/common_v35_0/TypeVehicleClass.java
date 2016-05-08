
package com.travelport.schema.common_v35_0;

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
 * &lt;simpleType name="typeVehicleClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mini"/&gt;
 *     &lt;enumeration value="Economy"/&gt;
 *     &lt;enumeration value="Compact"/&gt;
 *     &lt;enumeration value="Intermediate"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Fullsize"/&gt;
 *     &lt;enumeration value="Luxury"/&gt;
 *     &lt;enumeration value="Premium"/&gt;
 *     &lt;enumeration value="Special"/&gt;
 *     &lt;enumeration value="MiniElite"/&gt;
 *     &lt;enumeration value="EconomyElite"/&gt;
 *     &lt;enumeration value="CompactElite"/&gt;
 *     &lt;enumeration value="IntermediateElite"/&gt;
 *     &lt;enumeration value="StandardElite"/&gt;
 *     &lt;enumeration value="FullsizeElite"/&gt;
 *     &lt;enumeration value="PremiumElite"/&gt;
 *     &lt;enumeration value="LuxuryElite"/&gt;
 *     &lt;enumeration value="Oversize"/&gt;
 *     &lt;enumeration value="Subcompact"/&gt;
 *     &lt;enumeration value="Minivan"/&gt;
 *     &lt;enumeration value="TwelvePassengerVan"/&gt;
 *     &lt;enumeration value="MovingVan"/&gt;
 *     &lt;enumeration value="FifteenPassengerVan"/&gt;
 *     &lt;enumeration value="CargoVan"/&gt;
 *     &lt;enumeration value="TwelveFootTruck"/&gt;
 *     &lt;enumeration value="TwentyFootTruck"/&gt;
 *     &lt;enumeration value="TwentyfourFootTruck"/&gt;
 *     &lt;enumeration value="TwentysixFootTruck"/&gt;
 *     &lt;enumeration value="Moped"/&gt;
 *     &lt;enumeration value="Stretch"/&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *     &lt;enumeration value="Unique"/&gt;
 *     &lt;enumeration value="Exotic"/&gt;
 *     &lt;enumeration value="SmallOrMediumTruck"/&gt;
 *     &lt;enumeration value="LargeTruck"/&gt;
 *     &lt;enumeration value="SmallSUV"/&gt;
 *     &lt;enumeration value="MediumSUV"/&gt;
 *     &lt;enumeration value="LargeSUV"/&gt;
 *     &lt;enumeration value="ExoticSUV"/&gt;
 *     &lt;enumeration value="FourWheelDrive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleClass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
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
