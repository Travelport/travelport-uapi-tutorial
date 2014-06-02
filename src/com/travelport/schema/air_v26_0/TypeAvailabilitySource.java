
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAvailabilitySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAvailabilitySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AvailStatusTTY"/>
 *     &lt;enumeration value="CacheClosedStatus"/>
 *     &lt;enumeration value="CacheAVS"/>
 *     &lt;enumeration value="DirectAccess"/>
 *     &lt;enumeration value="CacheDirectAccess"/>
 *     &lt;enumeration value="CacheSellFailures"/>
 *     &lt;enumeration value="CacheGUI"/>
 *     &lt;enumeration value="CacheLastSeatAvail"/>
 *     &lt;enumeration value="CacheP2PJourney"/>
 *     &lt;enumeration value="CacheP2PMixClass"/>
 *     &lt;enumeration value="CacheP2PLink"/>
 *     &lt;enumeration value="LastSeatAvail"/>
 *     &lt;enumeration value="TEManualSell"/>
 *     &lt;enumeration value="CacheOtherVendorsResponse"/>
 *     &lt;enumeration value="StatusOverlaid"/>
 *     &lt;enumeration value="CacheSeamless"/>
 *     &lt;enumeration value="Seamless"/>
 *     &lt;enumeration value="UnknownSource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAvailabilitySource")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeAvailabilitySource {


    /**
     * AVS (Availability Status from TTY Message sent
     *                         via Carriers.)
     * 
     */
    @XmlEnumValue("AvailStatusTTY")
    AVAIL_STATUS_TTY("AvailStatusTTY"),

    /**
     * Cache Closed Status Update
     *                     
     * 
     */
    @XmlEnumValue("CacheClosedStatus")
    CACHE_CLOSED_STATUS("CacheClosedStatus"),

    /**
     * Cache AVS
     * 
     */
    @XmlEnumValue("CacheAVS")
    CACHE_AVS("CacheAVS"),

    /**
     * Direct Access
     * 
     */
    @XmlEnumValue("DirectAccess")
    DIRECT_ACCESS("DirectAccess"),

    /**
     * Cache Direct Access
     * 
     */
    @XmlEnumValue("CacheDirectAccess")
    CACHE_DIRECT_ACCESS("CacheDirectAccess"),

    /**
     * Cache from Sell Failures update
     *                     
     * 
     */
    @XmlEnumValue("CacheSellFailures")
    CACHE_SELL_FAILURES("CacheSellFailures"),

    /**
     * Cache from GUI update
     * 
     */
    @XmlEnumValue("CacheGUI")
    CACHE_GUI("CacheGUI"),

    /**
     * Cache from Last Seat Avail
     *                     
     * 
     */
    @XmlEnumValue("CacheLastSeatAvail")
    CACHE_LAST_SEAT_AVAIL("CacheLastSeatAvail"),

    /**
     * Cache from P2P Journey Status
     *                     
     * 
     */
    @XmlEnumValue("CacheP2PJourney")
    CACHE_P_2_P_JOURNEY("CacheP2PJourney"),

    /**
     * Cache from P2P Mix Class Status
     *                     
     * 
     */
    @XmlEnumValue("CacheP2PMixClass")
    CACHE_P_2_P_MIX_CLASS("CacheP2PMixClass"),

    /**
     * Cache from P2P Link Status
     *                     
     * 
     */
    @XmlEnumValue("CacheP2PLink")
    CACHE_P_2_P_LINK("CacheP2PLink"),

    /**
     * Last Seat Avail
     * 
     */
    @XmlEnumValue("LastSeatAvail")
    LAST_SEAT_AVAIL("LastSeatAvail"),

    /**
     * TE Manual Sell (Unknown source)
     *                     
     * 
     */
    @XmlEnumValue("TEManualSell")
    TE_MANUAL_SELL("TEManualSell"),

    /**
     * Cache from Other Vendors response from
     *                         Direct
     *                         Access
     * 
     */
    @XmlEnumValue("CacheOtherVendorsResponse")
    CACHE_OTHER_VENDORS_RESPONSE("CacheOtherVendorsResponse"),

    /**
     * Status Overlaid
     * 
     */
    @XmlEnumValue("StatusOverlaid")
    STATUS_OVERLAID("StatusOverlaid"),

    /**
     * Cache Seamless
     * 
     */
    @XmlEnumValue("CacheSeamless")
    CACHE_SEAMLESS("CacheSeamless"),

    /**
     * Seamless
     * 
     */
    @XmlEnumValue("Seamless")
    SEAMLESS("Seamless"),

    /**
     * Unknown source from SD Sell
     *                     
     * 
     */
    @XmlEnumValue("UnknownSource")
    UNKNOWN_SOURCE("UnknownSource");
    private final String value;

    TypeAvailabilitySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeAvailabilitySource fromValue(String v) {
        for (TypeAvailabilitySource c: TypeAvailabilitySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
