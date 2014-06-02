
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCharacteristic.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCharacteristic">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExitRow"/>
 *     &lt;enumeration value="Wing"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="Forward"/>
 *     &lt;enumeration value="Rear"/>
 *     &lt;enumeration value="UpperDeck"/>
 *     &lt;enumeration value="LowerDeck"/>
 *     &lt;enumeration value="DesignatedRBD"/>
 *     &lt;enumeration value="ExtraLegRoom"/>
 *     &lt;enumeration value="BufferRow"/>
 *     &lt;enumeration value="RowDoesNotExist"/>
 *     &lt;enumeration value="SeatRestrictionsApply"/>
 *     &lt;enumeration value="MovieScreen"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="NearGalley"/>
 *     &lt;enumeration value="NearToilet"/>
 *     &lt;enumeration value="Bulkhead"/>
 *     &lt;enumeration value="Window"/>
 *     &lt;enumeration value="RestrictedRecline"/>
 *     &lt;enumeration value="Preferential"/>
 *     &lt;enumeration value="RestrictedGeneral"/>
 *     &lt;enumeration value="LegRest"/>
 *     &lt;enumeration value="NoSeat"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="RBDSpecific"/>
 *     &lt;enumeration value="Bassinet"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Handicapped"/>
 *     &lt;enumeration value="BufferZone"/>
 *     &lt;enumeration value="ElectronicConnection"/>
 *     &lt;enumeration value="HandicappedFacilityAccess"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Toilet"/>
 *     &lt;enumeration value="Galley"/>
 *     &lt;enumeration value="Closet"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="LuggageStorage"/>
 *     &lt;enumeration value="StairsToUpperDeck"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="RearFacingSeat"/>
 *     &lt;enumeration value="StorageSpace"/>
 *     &lt;enumeration value="UndesirableSeat"/>
 *     &lt;enumeration value="NotAllowedForInfant"/>
 *     &lt;enumeration value="SuitableForAdultWithInfant"/>
 *     &lt;enumeration value="Cot"/>
 *     &lt;enumeration value="CotSeat"/>
 *     &lt;enumeration value="Wall"/>
 *     &lt;enumeration value="Exit"/>
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="MobilePassengersOnly"/>
 *     &lt;enumeration value="NeitherAisleNorWindow"/>
 *     &lt;enumeration value="SeatToBeOfferedLast"/>
 *     &lt;enumeration value="SmokingAllowed"/>
 *     &lt;enumeration value="PaidGeneralSeat"/>
 *     &lt;enumeration value="PaidExitSeat"/>
 *     &lt;enumeration value="MainDeck"/>
 *     &lt;enumeration value="PaidClubWorldUpperDeck"/>
 *     &lt;enumeration value="PaidTwin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCharacteristic")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeCharacteristic {

    @XmlEnumValue("ExitRow")
    EXIT_ROW("ExitRow"),
    @XmlEnumValue("Wing")
    WING("Wing"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Rear")
    REAR("Rear"),
    @XmlEnumValue("UpperDeck")
    UPPER_DECK("UpperDeck"),
    @XmlEnumValue("LowerDeck")
    LOWER_DECK("LowerDeck"),
    @XmlEnumValue("DesignatedRBD")
    DESIGNATED_RBD("DesignatedRBD"),
    @XmlEnumValue("ExtraLegRoom")
    EXTRA_LEG_ROOM("ExtraLegRoom"),
    @XmlEnumValue("BufferRow")
    BUFFER_ROW("BufferRow"),
    @XmlEnumValue("RowDoesNotExist")
    ROW_DOES_NOT_EXIST("RowDoesNotExist"),
    @XmlEnumValue("SeatRestrictionsApply")
    SEAT_RESTRICTIONS_APPLY("SeatRestrictionsApply"),
    @XmlEnumValue("MovieScreen")
    MOVIE_SCREEN("MovieScreen"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("NearGalley")
    NEAR_GALLEY("NearGalley"),
    @XmlEnumValue("NearToilet")
    NEAR_TOILET("NearToilet"),
    @XmlEnumValue("Bulkhead")
    BULKHEAD("Bulkhead"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("RestrictedRecline")
    RESTRICTED_RECLINE("RestrictedRecline"),
    @XmlEnumValue("Preferential")
    PREFERENTIAL("Preferential"),
    @XmlEnumValue("RestrictedGeneral")
    RESTRICTED_GENERAL("RestrictedGeneral"),
    @XmlEnumValue("LegRest")
    LEG_REST("LegRest"),
    @XmlEnumValue("NoSeat")
    NO_SEAT("NoSeat"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("RBDSpecific")
    RBD_SPECIFIC("RBDSpecific"),
    @XmlEnumValue("Bassinet")
    BASSINET("Bassinet"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Handicapped")
    HANDICAPPED("Handicapped"),
    @XmlEnumValue("BufferZone")
    BUFFER_ZONE("BufferZone"),
    @XmlEnumValue("ElectronicConnection")
    ELECTRONIC_CONNECTION("ElectronicConnection"),
    @XmlEnumValue("HandicappedFacilityAccess")
    HANDICAPPED_FACILITY_ACCESS("HandicappedFacilityAccess"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Toilet")
    TOILET("Toilet"),
    @XmlEnumValue("Galley")
    GALLEY("Galley"),
    @XmlEnumValue("Closet")
    CLOSET("Closet"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("LuggageStorage")
    LUGGAGE_STORAGE("LuggageStorage"),
    @XmlEnumValue("StairsToUpperDeck")
    STAIRS_TO_UPPER_DECK("StairsToUpperDeck"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("RearFacingSeat")
    REAR_FACING_SEAT("RearFacingSeat"),
    @XmlEnumValue("StorageSpace")
    STORAGE_SPACE("StorageSpace"),
    @XmlEnumValue("UndesirableSeat")
    UNDESIRABLE_SEAT("UndesirableSeat"),
    @XmlEnumValue("NotAllowedForInfant")
    NOT_ALLOWED_FOR_INFANT("NotAllowedForInfant"),
    @XmlEnumValue("SuitableForAdultWithInfant")
    SUITABLE_FOR_ADULT_WITH_INFANT("SuitableForAdultWithInfant"),
    @XmlEnumValue("Cot")
    COT("Cot"),
    @XmlEnumValue("CotSeat")
    COT_SEAT("CotSeat"),
    @XmlEnumValue("Wall")
    WALL("Wall"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("MobilePassengersOnly")
    MOBILE_PASSENGERS_ONLY("MobilePassengersOnly"),
    @XmlEnumValue("NeitherAisleNorWindow")
    NEITHER_AISLE_NOR_WINDOW("NeitherAisleNorWindow"),
    @XmlEnumValue("SeatToBeOfferedLast")
    SEAT_TO_BE_OFFERED_LAST("SeatToBeOfferedLast"),
    @XmlEnumValue("SmokingAllowed")
    SMOKING_ALLOWED("SmokingAllowed"),
    @XmlEnumValue("PaidGeneralSeat")
    PAID_GENERAL_SEAT("PaidGeneralSeat"),
    @XmlEnumValue("PaidExitSeat")
    PAID_EXIT_SEAT("PaidExitSeat"),
    @XmlEnumValue("MainDeck")
    MAIN_DECK("MainDeck"),
    @XmlEnumValue("PaidClubWorldUpperDeck")
    PAID_CLUB_WORLD_UPPER_DECK("PaidClubWorldUpperDeck"),
    @XmlEnumValue("PaidTwin")
    PAID_TWIN("PaidTwin");
    private final String value;

    TypeCharacteristic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCharacteristic fromValue(String v) {
        for (TypeCharacteristic c: TypeCharacteristic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
