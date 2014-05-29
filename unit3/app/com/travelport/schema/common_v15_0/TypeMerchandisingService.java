
package com.travelport.schema.common_v15_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMerchandisingService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMerchandisingService">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Baggage"/>
 *     &lt;enumeration value="GroundTransportation"/>
 *     &lt;enumeration value="InFlightEntertainment"/>
 *     &lt;enumeration value="Lounge"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="MealOrBeverage"/>
 *     &lt;enumeration value="Pets"/>
 *     &lt;enumeration value="RuleOverride"/>
 *     &lt;enumeration value="PreReservedSeatAssignment"/>
 *     &lt;enumeration value="PriorityBoarding"/>
 *     &lt;enumeration value="SportsEquipment"/>
 *     &lt;enumeration value="Standby"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="TravelServices"/>
 *     &lt;enumeration value="UnaccompaniedTravel"/>
 *     &lt;enumeration value="Upgrades"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMerchandisingService")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeMerchandisingService {

    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    @XmlEnumValue("GroundTransportation")
    GROUND_TRANSPORTATION("GroundTransportation"),
    @XmlEnumValue("InFlightEntertainment")
    IN_FLIGHT_ENTERTAINMENT("InFlightEntertainment"),
    @XmlEnumValue("Lounge")
    LOUNGE("Lounge"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("MealOrBeverage")
    MEAL_OR_BEVERAGE("MealOrBeverage"),
    @XmlEnumValue("Pets")
    PETS("Pets"),
    @XmlEnumValue("RuleOverride")
    RULE_OVERRIDE("RuleOverride"),
    @XmlEnumValue("PreReservedSeatAssignment")
    PRE_RESERVED_SEAT_ASSIGNMENT("PreReservedSeatAssignment"),
    @XmlEnumValue("PriorityBoarding")
    PRIORITY_BOARDING("PriorityBoarding"),
    @XmlEnumValue("SportsEquipment")
    SPORTS_EQUIPMENT("SportsEquipment"),
    @XmlEnumValue("Standby")
    STANDBY("Standby"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("TravelServices")
    TRAVEL_SERVICES("TravelServices"),
    @XmlEnumValue("UnaccompaniedTravel")
    UNACCOMPANIED_TRAVEL("UnaccompaniedTravel"),
    @XmlEnumValue("Upgrades")
    UPGRADES("Upgrades"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeMerchandisingService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMerchandisingService fromValue(String v) {
        for (TypeMerchandisingService c: TypeMerchandisingService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
