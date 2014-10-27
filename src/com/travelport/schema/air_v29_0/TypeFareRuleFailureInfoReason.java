
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareRuleFailureInfoReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareRuleFailureInfoReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoRuleForValidation"/>
 *     &lt;enumeration value="MinimumStayFailure"/>
 *     &lt;enumeration value="AdvPurchaseFailure"/>
 *     &lt;enumeration value="PICTypeFailure"/>
 *     &lt;enumeration value="StopoverTransferFailure"/>
 *     &lt;enumeration value="DateSeasonalityFailure"/>
 *     &lt;enumeration value="RoutingFailure"/>
 *     &lt;enumeration value="MileageFailure"/>
 *     &lt;enumeration value="DayTimeFailure"/>
 *     &lt;enumeration value="OpenJawUsageFailure"/>
 *     &lt;enumeration value="IndirectTravelProvision"/>
 *     &lt;enumeration value="SalesRestrictionNotMet"/>
 *     &lt;enumeration value="FICNAFare"/>
 *     &lt;enumeration value="HIFFailure"/>
 *     &lt;enumeration value="IntlSurfaceSector"/>
 *     &lt;enumeration value="CurrencyUsageFailure"/>
 *     &lt;enumeration value="DiscountApplFailure"/>
 *     &lt;enumeration value="FootNoteFailure"/>
 *     &lt;enumeration value="DayTimeApplCatNotMet"/>
 *     &lt;enumeration value="DayTimeApplCatIncomplete"/>
 *     &lt;enumeration value="SeasonalityCatNotMet"/>
 *     &lt;enumeration value="SeasonalityCatIncomplete"/>
 *     &lt;enumeration value="FlightApplCatNotMet"/>
 *     &lt;enumeration value="FlightApplCatIncomplete"/>
 *     &lt;enumeration value="AdvResvAdvTicketCatNotMet"/>
 *     &lt;enumeration value="AdvResvAdvTicketCatIncomplete"/>
 *     &lt;enumeration value="BookingClassFailure"/>
 *     &lt;enumeration value="MinStayCatNotMet"/>
 *     &lt;enumeration value="MinStayCatIncomplete"/>
 *     &lt;enumeration value="MaxStayCatNotMet"/>
 *     &lt;enumeration value="MaxStayCatIncomplete"/>
 *     &lt;enumeration value="StopoverCatNotMet"/>
 *     &lt;enumeration value="StopoverCatIncomplete"/>
 *     &lt;enumeration value="PermittedCombinationCatNotMet"/>
 *     &lt;enumeration value="PermittedCombinationCatNotIncomplete"/>
 *     &lt;enumeration value="BlackoutCatNotMet"/>
 *     &lt;enumeration value="BlackoutCatNotIncomplete"/>
 *     &lt;enumeration value="AccomTvlReqCatNotMet"/>
 *     &lt;enumeration value="AccomTvlReqCatIncomplete"/>
 *     &lt;enumeration value="SalesRestCatNotMet"/>
 *     &lt;enumeration value="SalesRestCatIncomplete"/>
 *     &lt;enumeration value="EligibilityCatNotMet"/>
 *     &lt;enumeration value="EligibilityCatIncomplete"/>
 *     &lt;enumeration value="TransfersCatNotMet"/>
 *     &lt;enumeration value="TransfersCatIncomplete"/>
 *     &lt;enumeration value="TransfersRoutingFailure"/>
 *     &lt;enumeration value="HIPMileageCatNotMet"/>
 *     &lt;enumeration value="HIPMileageCatIncomplete"/>
 *     &lt;enumeration value="ChildDiscountCatNotMet"/>
 *     &lt;enumeration value="ChildDiscountCatIncomplete"/>
 *     &lt;enumeration value="TourConductorDiscCatNotMet"/>
 *     &lt;enumeration value="TourConductorDiscCatIncomplete"/>
 *     &lt;enumeration value="AgentDiscountCatNotMet"/>
 *     &lt;enumeration value="AgentDiscountCatIncomplete"/>
 *     &lt;enumeration value="OtherDiscountCatNotMet"/>
 *     &lt;enumeration value="OtherDiscountCatIncomplete"/>
 *     &lt;enumeration value="MiscFareTagCatNotMet"/>
 *     &lt;enumeration value="MiscFareTagCatIncomplete"/>
 *     &lt;enumeration value="FareByRuleCatNotMet"/>
 *     &lt;enumeration value="FareByRuleCatIncomplete"/>
 *     &lt;enumeration value="VisitCountryCatNotMet"/>
 *     &lt;enumeration value="VisitCountryCatIncomplete"/>
 *     &lt;enumeration value="NegFaresCatNotMet"/>
 *     &lt;enumeration value="NegFaresCatIncomplete"/>
 *     &lt;enumeration value="OthFailurePTCFailed"/>
 *     &lt;enumeration value="OthFailureRecFailed"/>
 *     &lt;enumeration value="CombineabilityFailure"/>
 *     &lt;enumeration value="TravelRestrictionNotMet"/>
 *     &lt;enumeration value="SurchargesNotMet"/>
 *     &lt;enumeration value="MaximumStayFailure"/>
 *     &lt;enumeration value="FareUsageFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareRuleFailureInfoReason")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeFareRuleFailureInfoReason {

    @XmlEnumValue("NoRuleForValidation")
    NO_RULE_FOR_VALIDATION("NoRuleForValidation"),
    @XmlEnumValue("MinimumStayFailure")
    MINIMUM_STAY_FAILURE("MinimumStayFailure"),
    @XmlEnumValue("AdvPurchaseFailure")
    ADV_PURCHASE_FAILURE("AdvPurchaseFailure"),

    /**
     * Passenger Identification Code Failure
     *                     
     * 
     */
    @XmlEnumValue("PICTypeFailure")
    PIC_TYPE_FAILURE("PICTypeFailure"),
    @XmlEnumValue("StopoverTransferFailure")
    STOPOVER_TRANSFER_FAILURE("StopoverTransferFailure"),
    @XmlEnumValue("DateSeasonalityFailure")
    DATE_SEASONALITY_FAILURE("DateSeasonalityFailure"),
    @XmlEnumValue("RoutingFailure")
    ROUTING_FAILURE("RoutingFailure"),
    @XmlEnumValue("MileageFailure")
    MILEAGE_FAILURE("MileageFailure"),
    @XmlEnumValue("DayTimeFailure")
    DAY_TIME_FAILURE("DayTimeFailure"),
    @XmlEnumValue("OpenJawUsageFailure")
    OPEN_JAW_USAGE_FAILURE("OpenJawUsageFailure"),
    @XmlEnumValue("IndirectTravelProvision")
    INDIRECT_TRAVEL_PROVISION("IndirectTravelProvision"),
    @XmlEnumValue("SalesRestrictionNotMet")
    SALES_RESTRICTION_NOT_MET("SalesRestrictionNotMet"),
    @XmlEnumValue("FICNAFare")
    FICNA_FARE("FICNAFare"),

    /**
     * Higher Intermediate Fare/Point or Mileage
     *                         Exceptions failures
     * 
     */
    @XmlEnumValue("HIFFailure")
    HIF_FAILURE("HIFFailure"),
    @XmlEnumValue("IntlSurfaceSector")
    INTL_SURFACE_SECTOR("IntlSurfaceSector"),
    @XmlEnumValue("CurrencyUsageFailure")
    CURRENCY_USAGE_FAILURE("CurrencyUsageFailure"),
    @XmlEnumValue("DiscountApplFailure")
    DISCOUNT_APPL_FAILURE("DiscountApplFailure"),
    @XmlEnumValue("FootNoteFailure")
    FOOT_NOTE_FAILURE("FootNoteFailure"),
    @XmlEnumValue("DayTimeApplCatNotMet")
    DAY_TIME_APPL_CAT_NOT_MET("DayTimeApplCatNotMet"),
    @XmlEnumValue("DayTimeApplCatIncomplete")
    DAY_TIME_APPL_CAT_INCOMPLETE("DayTimeApplCatIncomplete"),
    @XmlEnumValue("SeasonalityCatNotMet")
    SEASONALITY_CAT_NOT_MET("SeasonalityCatNotMet"),
    @XmlEnumValue("SeasonalityCatIncomplete")
    SEASONALITY_CAT_INCOMPLETE("SeasonalityCatIncomplete"),
    @XmlEnumValue("FlightApplCatNotMet")
    FLIGHT_APPL_CAT_NOT_MET("FlightApplCatNotMet"),
    @XmlEnumValue("FlightApplCatIncomplete")
    FLIGHT_APPL_CAT_INCOMPLETE("FlightApplCatIncomplete"),
    @XmlEnumValue("AdvResvAdvTicketCatNotMet")
    ADV_RESV_ADV_TICKET_CAT_NOT_MET("AdvResvAdvTicketCatNotMet"),
    @XmlEnumValue("AdvResvAdvTicketCatIncomplete")
    ADV_RESV_ADV_TICKET_CAT_INCOMPLETE("AdvResvAdvTicketCatIncomplete"),
    @XmlEnumValue("BookingClassFailure")
    BOOKING_CLASS_FAILURE("BookingClassFailure"),
    @XmlEnumValue("MinStayCatNotMet")
    MIN_STAY_CAT_NOT_MET("MinStayCatNotMet"),
    @XmlEnumValue("MinStayCatIncomplete")
    MIN_STAY_CAT_INCOMPLETE("MinStayCatIncomplete"),
    @XmlEnumValue("MaxStayCatNotMet")
    MAX_STAY_CAT_NOT_MET("MaxStayCatNotMet"),
    @XmlEnumValue("MaxStayCatIncomplete")
    MAX_STAY_CAT_INCOMPLETE("MaxStayCatIncomplete"),
    @XmlEnumValue("StopoverCatNotMet")
    STOPOVER_CAT_NOT_MET("StopoverCatNotMet"),
    @XmlEnumValue("StopoverCatIncomplete")
    STOPOVER_CAT_INCOMPLETE("StopoverCatIncomplete"),
    @XmlEnumValue("PermittedCombinationCatNotMet")
    PERMITTED_COMBINATION_CAT_NOT_MET("PermittedCombinationCatNotMet"),
    @XmlEnumValue("PermittedCombinationCatNotIncomplete")
    PERMITTED_COMBINATION_CAT_NOT_INCOMPLETE("PermittedCombinationCatNotIncomplete"),
    @XmlEnumValue("BlackoutCatNotMet")
    BLACKOUT_CAT_NOT_MET("BlackoutCatNotMet"),
    @XmlEnumValue("BlackoutCatNotIncomplete")
    BLACKOUT_CAT_NOT_INCOMPLETE("BlackoutCatNotIncomplete"),
    @XmlEnumValue("AccomTvlReqCatNotMet")
    ACCOM_TVL_REQ_CAT_NOT_MET("AccomTvlReqCatNotMet"),
    @XmlEnumValue("AccomTvlReqCatIncomplete")
    ACCOM_TVL_REQ_CAT_INCOMPLETE("AccomTvlReqCatIncomplete"),
    @XmlEnumValue("SalesRestCatNotMet")
    SALES_REST_CAT_NOT_MET("SalesRestCatNotMet"),
    @XmlEnumValue("SalesRestCatIncomplete")
    SALES_REST_CAT_INCOMPLETE("SalesRestCatIncomplete"),
    @XmlEnumValue("EligibilityCatNotMet")
    ELIGIBILITY_CAT_NOT_MET("EligibilityCatNotMet"),
    @XmlEnumValue("EligibilityCatIncomplete")
    ELIGIBILITY_CAT_INCOMPLETE("EligibilityCatIncomplete"),
    @XmlEnumValue("TransfersCatNotMet")
    TRANSFERS_CAT_NOT_MET("TransfersCatNotMet"),
    @XmlEnumValue("TransfersCatIncomplete")
    TRANSFERS_CAT_INCOMPLETE("TransfersCatIncomplete"),
    @XmlEnumValue("TransfersRoutingFailure")
    TRANSFERS_ROUTING_FAILURE("TransfersRoutingFailure"),

    /**
     * Higher Intermediate Point or Mileage
     *                         Exception categories not met
     * 
     */
    @XmlEnumValue("HIPMileageCatNotMet")
    HIP_MILEAGE_CAT_NOT_MET("HIPMileageCatNotMet"),

    /**
     * Higher Intermediate Point or Mileage
     *                         Exceptions categories incomplete
     * 
     */
    @XmlEnumValue("HIPMileageCatIncomplete")
    HIP_MILEAGE_CAT_INCOMPLETE("HIPMileageCatIncomplete"),
    @XmlEnumValue("ChildDiscountCatNotMet")
    CHILD_DISCOUNT_CAT_NOT_MET("ChildDiscountCatNotMet"),
    @XmlEnumValue("ChildDiscountCatIncomplete")
    CHILD_DISCOUNT_CAT_INCOMPLETE("ChildDiscountCatIncomplete"),
    @XmlEnumValue("TourConductorDiscCatNotMet")
    TOUR_CONDUCTOR_DISC_CAT_NOT_MET("TourConductorDiscCatNotMet"),
    @XmlEnumValue("TourConductorDiscCatIncomplete")
    TOUR_CONDUCTOR_DISC_CAT_INCOMPLETE("TourConductorDiscCatIncomplete"),
    @XmlEnumValue("AgentDiscountCatNotMet")
    AGENT_DISCOUNT_CAT_NOT_MET("AgentDiscountCatNotMet"),
    @XmlEnumValue("AgentDiscountCatIncomplete")
    AGENT_DISCOUNT_CAT_INCOMPLETE("AgentDiscountCatIncomplete"),
    @XmlEnumValue("OtherDiscountCatNotMet")
    OTHER_DISCOUNT_CAT_NOT_MET("OtherDiscountCatNotMet"),
    @XmlEnumValue("OtherDiscountCatIncomplete")
    OTHER_DISCOUNT_CAT_INCOMPLETE("OtherDiscountCatIncomplete"),
    @XmlEnumValue("MiscFareTagCatNotMet")
    MISC_FARE_TAG_CAT_NOT_MET("MiscFareTagCatNotMet"),
    @XmlEnumValue("MiscFareTagCatIncomplete")
    MISC_FARE_TAG_CAT_INCOMPLETE("MiscFareTagCatIncomplete"),
    @XmlEnumValue("FareByRuleCatNotMet")
    FARE_BY_RULE_CAT_NOT_MET("FareByRuleCatNotMet"),
    @XmlEnumValue("FareByRuleCatIncomplete")
    FARE_BY_RULE_CAT_INCOMPLETE("FareByRuleCatIncomplete"),
    @XmlEnumValue("VisitCountryCatNotMet")
    VISIT_COUNTRY_CAT_NOT_MET("VisitCountryCatNotMet"),
    @XmlEnumValue("VisitCountryCatIncomplete")
    VISIT_COUNTRY_CAT_INCOMPLETE("VisitCountryCatIncomplete"),
    @XmlEnumValue("NegFaresCatNotMet")
    NEG_FARES_CAT_NOT_MET("NegFaresCatNotMet"),
    @XmlEnumValue("NegFaresCatIncomplete")
    NEG_FARES_CAT_INCOMPLETE("NegFaresCatIncomplete"),
    @XmlEnumValue("OthFailurePTCFailed")
    OTH_FAILURE_PTC_FAILED("OthFailurePTCFailed"),
    @XmlEnumValue("OthFailureRecFailed")
    OTH_FAILURE_REC_FAILED("OthFailureRecFailed"),
    @XmlEnumValue("CombineabilityFailure")
    COMBINEABILITY_FAILURE("CombineabilityFailure"),
    @XmlEnumValue("TravelRestrictionNotMet")
    TRAVEL_RESTRICTION_NOT_MET("TravelRestrictionNotMet"),
    @XmlEnumValue("SurchargesNotMet")
    SURCHARGES_NOT_MET("SurchargesNotMet"),
    @XmlEnumValue("MaximumStayFailure")
    MAXIMUM_STAY_FAILURE("MaximumStayFailure"),
    @XmlEnumValue("FareUsageFailure")
    FARE_USAGE_FAILURE("FareUsageFailure");
    private final String value;

    TypeFareRuleFailureInfoReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareRuleFailureInfoReason fromValue(String v) {
        for (TypeFareRuleFailureInfoReason c: TypeFareRuleFailureInfoReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
