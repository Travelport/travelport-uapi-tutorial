
package com.travelport.schema.universal_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDisplayDetailName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDisplayDetailName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OwningAgencyPCC"/&gt;
 *     &lt;enumeration value="CreatingAgentSignOn"/&gt;
 *     &lt;enumeration value="CreatingAgentDuty"/&gt;
 *     &lt;enumeration value="CreatingAgencyIATA"/&gt;
 *     &lt;enumeration value="PrepaidTicketAdviceIndicator"/&gt;
 *     &lt;enumeration value="BFBorrowed"/&gt;
 *     &lt;enumeration value="GlobalPNR"/&gt;
 *     &lt;enumeration value="ReadOnlyPNR"/&gt;
 *     &lt;enumeration value="PastDateQuickRetrievedPNR"/&gt;
 *     &lt;enumeration value="SuperPNR"/&gt;
 *     &lt;enumeration value="PNRPurgeDate"/&gt;
 *     &lt;enumeration value="OriginalReceivedFieldValue"/&gt;
 *     &lt;enumeration value="DivPsgrName"/&gt;
 *     &lt;enumeration value="TruncInd"/&gt;
 *     &lt;enumeration value="DivTypeInd"/&gt;
 *     &lt;enumeration value="RLoc"/&gt;
 *     &lt;enumeration value="DivDt"/&gt;
 *     &lt;enumeration value="DivTm"/&gt;
 *     &lt;enumeration value="TravelOrder"/&gt;
 *     &lt;enumeration value="SegmentStatus"/&gt;
 *     &lt;enumeration value="StartDate"/&gt;
 *     &lt;enumeration value="DayChange"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *     &lt;enumeration value="StartTime"/&gt;
 *     &lt;enumeration value="EndTime"/&gt;
 *     &lt;enumeration value="BookingCode"/&gt;
 *     &lt;enumeration value="TrainNumber"/&gt;
 *     &lt;enumeration value="NumberOfSeats"/&gt;
 *     &lt;enumeration value="SellType"/&gt;
 *     &lt;enumeration value="TariffType"/&gt;
 *     &lt;enumeration value="ConfirmationNumber"/&gt;
 *     &lt;enumeration value="BoardingInformation"/&gt;
 *     &lt;enumeration value="ArrivalInformation"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeDisplayDetailName")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeDisplayDetailName {


    /**
     * 
     *                  The pseudo city code of the agency owning the PNR 
     *              
     * 
     */
    @XmlEnumValue("OwningAgencyPCC")
    OWNING_AGENCY_PCC("OwningAgencyPCC"),

    /**
     * 
     *                     Sign on code of the agent created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgentSignOn")
    CREATING_AGENT_SIGN_ON("CreatingAgentSignOn"),

    /**
     * 
     *                     Duty code of the agent created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgentDuty")
    CREATING_AGENT_DUTY("CreatingAgentDuty"),

    /**
     * 
     *                     IATA number of the agency  created the PNR
     *                 
     * 
     */
    @XmlEnumValue("CreatingAgencyIATA")
    CREATING_AGENCY_IATA("CreatingAgencyIATA"),

    /**
     * 
     *                     Indicates whether Prepaid Ticket Advice is attached to PNR
     *                 
     * 
     */
    @XmlEnumValue("PrepaidTicketAdviceIndicator")
    PREPAID_TICKET_ADVICE_INDICATOR("PrepaidTicketAdviceIndicator"),

    /**
     * 
     *                     Indicates the current PNR as borrowed
     *                 
     * 
     */
    @XmlEnumValue("BFBorrowed")
    BF_BORROWED("BFBorrowed"),

    /**
     * 
     *                      Indicates whether current PNR is Global PNR
     *                 
     * 
     */
    @XmlEnumValue("GlobalPNR")
    GLOBAL_PNR("GlobalPNR"),

    /**
     * 
     *                     Indicates PNR as read only
     *                 
     * 
     */
    @XmlEnumValue("ReadOnlyPNR")
    READ_ONLY_PNR("ReadOnlyPNR"),

    /**
     * 
     *                      Indicates PNR retrieved from offline archival process                 
     *                 
     * 
     */
    @XmlEnumValue("PastDateQuickRetrievedPNR")
    PAST_DATE_QUICK_RETRIEVED_PNR("PastDateQuickRetrievedPNR"),

    /**
     * 
     *                     Indicates whether current PNR is Super PNR
     *                 
     * 
     */
    @XmlEnumValue("SuperPNR")
    SUPER_PNR("SuperPNR"),

    /**
     * 
     *                     Purge date of the PNR
     *                 
     * 
     */
    @XmlEnumValue("PNRPurgeDate")
    PNR_PURGE_DATE("PNRPurgeDate"),

    /**
     * 
     *                     The original data in the received field
     *                 
     * 
     */
    @XmlEnumValue("OriginalReceivedFieldValue")
    ORIGINAL_RECEIVED_FIELD_VALUE("OriginalReceivedFieldValue"),

    /**
     * 
     *                     Passenger Name in a divided PNR
     *                 
     * 
     */
    @XmlEnumValue("DivPsgrName")
    DIV_PSGR_NAME("DivPsgrName"),

    /**
     * 
     *                     Indicator for Truncated names
     *                 
     * 
     */
    @XmlEnumValue("TruncInd")
    TRUNC_IND("TruncInd"),

    /**
     * 
     *                     Divide Type Indicator if it pertains to child or parent booking
     *                 
     * 
     */
    @XmlEnumValue("DivTypeInd")
    DIV_TYPE_IND("DivTypeInd"),

    /**
     * 
     *                     Record Locator of parent or child booking
     *                 
     * 
     */
    @XmlEnumValue("RLoc")
    R_LOC("RLoc"),

    /**
     * 
     *                     Date of divide action
     *                 
     * 
     */
    @XmlEnumValue("DivDt")
    DIV_DT("DivDt"),

    /**
     * 
     *                     Time of day of divide action
     *                 
     * 
     */
    @XmlEnumValue("DivTm")
    DIV_TM("DivTm"),

    /**
     * 
     *                     Travel order of the segment
     *                 
     * 
     */
    @XmlEnumValue("TravelOrder")
    TRAVEL_ORDER("TravelOrder"),

    /**
     * 
     *                     Status of associated segment
     *                 
     * 
     */
    @XmlEnumValue("SegmentStatus")
    SEGMENT_STATUS("SegmentStatus"),

    /**
     * 
     *                      Date of departure of the rail segment
     *                 
     * 
     */
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),

    /**
     * 
     *                     Indicates arrival date as number of days before or after departure date
     *                 
     * 
     */
    @XmlEnumValue("DayChange")
    DAY_CHANGE("DayChange"),

    /**
     * 
     *                         Vendor code of the segment
     *                 
     * 
     */
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),

    /**
     * 
     *                     Start Time of the segment
     *                 
     * 
     */
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),

    /**
     * 
     *                         End Time of the segment
     *                 
     * 
     */
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),

    /**
     * 
     *                    The booking code of the rail segment seating area
     *                 
     * 
     */
    @XmlEnumValue("BookingCode")
    BOOKING_CODE("BookingCode"),

    /**
     * 
     *                     Denotes Train number
     *                 
     * 
     */
    @XmlEnumValue("TrainNumber")
    TRAIN_NUMBER("TrainNumber"),

    /**
     * 
     *                     Number of seats sold for the trip
     *                 
     * 
     */
    @XmlEnumValue("NumberOfSeats")
    NUMBER_OF_SEATS("NumberOfSeats"),

    /**
     * 
     *                    The mode of selling the segment
     *                 
     * 
     */
    @XmlEnumValue("SellType")
    SELL_TYPE("SellType"),

    /**
     * 
     *                      Type of Tariff for the segment
     *                 
     * 
     */
    @XmlEnumValue("TariffType")
    TARIFF_TYPE("TariffType"),

    /**
     * 
     *                      The confirmation number of the segment
     *                 
     * 
     */
    @XmlEnumValue("ConfirmationNumber")
    CONFIRMATION_NUMBER("ConfirmationNumber"),

    /**
     * 
     *                      Information related to boarding point of the segment
     *                 
     * 
     */
    @XmlEnumValue("BoardingInformation")
    BOARDING_INFORMATION("BoardingInformation"),

    /**
     * 
     *                    Information related to arrival point of the segment
     *                 
     * 
     */
    @XmlEnumValue("ArrivalInformation")
    ARRIVAL_INFORMATION("ArrivalInformation"),

    /**
     * 
     *                     Additional   information
     *                 
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    TypeDisplayDetailName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDisplayDetailName fromValue(String v) {
        for (TypeDisplayDetailName c: TypeDisplayDetailName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
