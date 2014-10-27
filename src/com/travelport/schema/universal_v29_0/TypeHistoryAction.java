
package com.travelport.schema.universal_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHistoryAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHistoryAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirAdd"/>
 *     &lt;enumeration value="AirCancel"/>
 *     &lt;enumeration value="AirCreate"/>
 *     &lt;enumeration value="AirDelete"/>
 *     &lt;enumeration value="AirUpdate"/>
 *     &lt;enumeration value="HotelAdd"/>
 *     &lt;enumeration value="HotelCancel"/>
 *     &lt;enumeration value="HotelCreate"/>
 *     &lt;enumeration value="HotelDelete"/>
 *     &lt;enumeration value="HotelUpdate"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="Sync"/>
 *     &lt;enumeration value="URAdd"/>
 *     &lt;enumeration value="URDelete"/>
 *     &lt;enumeration value="URUpdate"/>
 *     &lt;enumeration value="URCancel"/>
 *     &lt;enumeration value="URCreate"/>
 *     &lt;enumeration value="VehicleAdd"/>
 *     &lt;enumeration value="VehicleCancel"/>
 *     &lt;enumeration value="VehicleCreate"/>
 *     &lt;enumeration value="VehicleDelete"/>
 *     &lt;enumeration value="VehicleUpdate"/>
 *     &lt;enumeration value="PassiveCreate"/>
 *     &lt;enumeration value="PassiveCancel"/>
 *     &lt;enumeration value="PassiveAdd"/>
 *     &lt;enumeration value="PassiveDelete"/>
 *     &lt;enumeration value="Ticketing"/>
 *     &lt;enumeration value="ETRSync"/>
 *     &lt;enumeration value="AirRefund"/>
 *     &lt;enumeration value="RailCreate"/>
 *     &lt;enumeration value="RailCancel"/>
 *     &lt;enumeration value="RailModify"/>
 *     &lt;enumeration value="AirExchange"/>
 *     &lt;enumeration value="Issue"/>
 *     &lt;enumeration value="URModify"/>
 *     &lt;enumeration value="GdsQueuePlace"/>
 *     &lt;enumeration value="GdsQueueRemove"/>
 *     &lt;enumeration value="VoidTkt"/>
 *     &lt;enumeration value="AirMerchandisingFulfillment"/>
 *     &lt;enumeration value="EMDRetrieve"/>
 *     &lt;enumeration value="EMDIssue"/>
 *     &lt;enumeration value="RailUpdate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHistoryAction")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
public enum TypeHistoryAction {

    @XmlEnumValue("AirAdd")
    AIR_ADD("AirAdd"),
    @XmlEnumValue("AirCancel")
    AIR_CANCEL("AirCancel"),
    @XmlEnumValue("AirCreate")
    AIR_CREATE("AirCreate"),
    @XmlEnumValue("AirDelete")
    AIR_DELETE("AirDelete"),
    @XmlEnumValue("AirUpdate")
    AIR_UPDATE("AirUpdate"),
    @XmlEnumValue("HotelAdd")
    HOTEL_ADD("HotelAdd"),
    @XmlEnumValue("HotelCancel")
    HOTEL_CANCEL("HotelCancel"),
    @XmlEnumValue("HotelCreate")
    HOTEL_CREATE("HotelCreate"),
    @XmlEnumValue("HotelDelete")
    HOTEL_DELETE("HotelDelete"),
    @XmlEnumValue("HotelUpdate")
    HOTEL_UPDATE("HotelUpdate"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("Sync")
    SYNC("Sync"),
    @XmlEnumValue("URAdd")
    UR_ADD("URAdd"),
    @XmlEnumValue("URDelete")
    UR_DELETE("URDelete"),
    @XmlEnumValue("URUpdate")
    UR_UPDATE("URUpdate"),
    @XmlEnumValue("URCancel")
    UR_CANCEL("URCancel"),
    @XmlEnumValue("URCreate")
    UR_CREATE("URCreate"),
    @XmlEnumValue("VehicleAdd")
    VEHICLE_ADD("VehicleAdd"),
    @XmlEnumValue("VehicleCancel")
    VEHICLE_CANCEL("VehicleCancel"),
    @XmlEnumValue("VehicleCreate")
    VEHICLE_CREATE("VehicleCreate"),
    @XmlEnumValue("VehicleDelete")
    VEHICLE_DELETE("VehicleDelete"),
    @XmlEnumValue("VehicleUpdate")
    VEHICLE_UPDATE("VehicleUpdate"),
    @XmlEnumValue("PassiveCreate")
    PASSIVE_CREATE("PassiveCreate"),
    @XmlEnumValue("PassiveCancel")
    PASSIVE_CANCEL("PassiveCancel"),
    @XmlEnumValue("PassiveAdd")
    PASSIVE_ADD("PassiveAdd"),
    @XmlEnumValue("PassiveDelete")
    PASSIVE_DELETE("PassiveDelete"),
    @XmlEnumValue("Ticketing")
    TICKETING("Ticketing"),
    @XmlEnumValue("ETRSync")
    ETR_SYNC("ETRSync"),
    @XmlEnumValue("AirRefund")
    AIR_REFUND("AirRefund"),
    @XmlEnumValue("RailCreate")
    RAIL_CREATE("RailCreate"),
    @XmlEnumValue("RailCancel")
    RAIL_CANCEL("RailCancel"),
    @XmlEnumValue("RailModify")
    RAIL_MODIFY("RailModify"),
    @XmlEnumValue("AirExchange")
    AIR_EXCHANGE("AirExchange"),
    @XmlEnumValue("Issue")
    ISSUE("Issue"),
    @XmlEnumValue("URModify")
    UR_MODIFY("URModify"),
    @XmlEnumValue("GdsQueuePlace")
    GDS_QUEUE_PLACE("GdsQueuePlace"),
    @XmlEnumValue("GdsQueueRemove")
    GDS_QUEUE_REMOVE("GdsQueueRemove"),
    @XmlEnumValue("VoidTkt")
    VOID_TKT("VoidTkt"),
    @XmlEnumValue("AirMerchandisingFulfillment")
    AIR_MERCHANDISING_FULFILLMENT("AirMerchandisingFulfillment"),
    @XmlEnumValue("EMDRetrieve")
    EMD_RETRIEVE("EMDRetrieve"),
    @XmlEnumValue("EMDIssue")
    EMD_ISSUE("EMDIssue"),
    @XmlEnumValue("RailUpdate")
    RAIL_UPDATE("RailUpdate");
    private final String value;

    TypeHistoryAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHistoryAction fromValue(String v) {
        for (TypeHistoryAction c: TypeHistoryAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
