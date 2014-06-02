
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeInFlightService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeInFlightService">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Movie"/>
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="Telex"/>
 *     &lt;enumeration value="AudioProgramming"/>
 *     &lt;enumeration value="Television"/>
 *     &lt;enumeration value="ResvBookingService"/>
 *     &lt;enumeration value="DutyFreeSales"/>
 *     &lt;enumeration value="Smoking"/>
 *     &lt;enumeration value="NonSmoking"/>
 *     &lt;enumeration value="ShortFeatureVideo"/>
 *     &lt;enumeration value="NoDutyFree"/>
 *     &lt;enumeration value="InSeatPowerSource"/>
 *     &lt;enumeration value="InternetAccess"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Library"/>
 *     &lt;enumeration value="LieFlatSeat"/>
 *     &lt;enumeration value="AdditionalServicesExists"/>
 *     &lt;enumeration value="WiFi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeInFlightService")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeInFlightService {

    @XmlEnumValue("Movie")
    MOVIE("Movie"),
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),
    @XmlEnumValue("Telex")
    TELEX("Telex"),
    @XmlEnumValue("AudioProgramming")
    AUDIO_PROGRAMMING("AudioProgramming"),
    @XmlEnumValue("Television")
    TELEVISION("Television"),
    @XmlEnumValue("ResvBookingService")
    RESV_BOOKING_SERVICE("ResvBookingService"),
    @XmlEnumValue("DutyFreeSales")
    DUTY_FREE_SALES("DutyFreeSales"),
    @XmlEnumValue("Smoking")
    SMOKING("Smoking"),
    @XmlEnumValue("NonSmoking")
    NON_SMOKING("NonSmoking"),
    @XmlEnumValue("ShortFeatureVideo")
    SHORT_FEATURE_VIDEO("ShortFeatureVideo"),
    @XmlEnumValue("NoDutyFree")
    NO_DUTY_FREE("NoDutyFree"),
    @XmlEnumValue("InSeatPowerSource")
    IN_SEAT_POWER_SOURCE("InSeatPowerSource"),
    @XmlEnumValue("InternetAccess")
    INTERNET_ACCESS("InternetAccess"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Library")
    LIBRARY("Library"),
    @XmlEnumValue("LieFlatSeat")
    LIE_FLAT_SEAT("LieFlatSeat"),
    @XmlEnumValue("AdditionalServicesExists")
    ADDITIONAL_SERVICES_EXISTS("AdditionalServicesExists"),
    @XmlEnumValue("WiFi")
    WI_FI("WiFi");
    private final String value;

    TypeInFlightService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInFlightService fromValue(String v) {
        for (TypeInFlightService c: TypeInFlightService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
