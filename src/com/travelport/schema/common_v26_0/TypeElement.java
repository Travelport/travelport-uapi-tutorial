
package com.travelport.schema.common_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeElement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeElement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="CreditCardAuthorization"/>
 *     &lt;enumeration value="DeliveryInfo"/>
 *     &lt;enumeration value="FormOfPayment"/>
 *     &lt;enumeration value="ActionStatus"/>
 *     &lt;enumeration value="OSI"/>
 *     &lt;enumeration value="GeneralRemark"/>
 *     &lt;enumeration value="UnassociatedRemark"/>
 *     &lt;enumeration value="AccountingRemark"/>
 *     &lt;enumeration value="PostScript"/>
 *     &lt;enumeration value="AirReservationAirSegmentUpdate"/>
 *     &lt;enumeration value="AirSegment"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="SSR"/>
 *     &lt;enumeration value="SeatAssignment"/>
 *     &lt;enumeration value="SpecificSeatAssignment"/>
 *     &lt;enumeration value="AutoSeatAssignment"/>
 *     &lt;enumeration value="AirPricingInfo"/>
 *     &lt;enumeration value="VehicleSpecialRequest"/>
 *     &lt;enumeration value="SpecialEquipment"/>
 *     &lt;enumeration value="XMLRemark"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="TicketingModifiers"/>
 *     &lt;enumeration value="Guarantee"/>
 *     &lt;enumeration value="DeliveryAddress"/>
 *     &lt;enumeration value="ServiceFeeInfo"/>
 *     &lt;enumeration value="LinkedUniversalRecord"/>
 *     &lt;enumeration value="NameRemark"/>
 *     &lt;enumeration value="PassiveSegment"/>
 *     &lt;enumeration value="PaymentInformation"/>
 *     &lt;enumeration value="CustomerID"/>
 *     &lt;enumeration value="DriversLicense"/>
 *     &lt;enumeration value="AssociatedRemark"/>
 *     &lt;enumeration value="CollectionAddress"/>
 *     &lt;enumeration value="HotelSpecialRequest"/>
 *     &lt;enumeration value="CorporateDiscountID"/>
 *     &lt;enumeration value="CommissionRemark"/>
 *     &lt;enumeration value="PocketItineraryRemark"/>
 *     &lt;enumeration value="CustomizedNameData"/>
 *     &lt;enumeration value="InvoiceRemark"/>
 *     &lt;enumeration value="ThirdPartyInformation"/>
 *     &lt;enumeration value="TravelCompliance"/>
 *     &lt;enumeration value="ReviewBooking"/>
 *     &lt;enumeration value="ConsolidatorRemark"/>
 *     &lt;enumeration value="BookingTraveler"/>
 *     &lt;enumeration value="AppliedProfile"/>
 *     &lt;enumeration value="TripName"/>
 *     &lt;enumeration value="TravelPurpose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeElement")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public enum TypeElement {

    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("CreditCardAuthorization")
    CREDIT_CARD_AUTHORIZATION("CreditCardAuthorization"),
    @XmlEnumValue("DeliveryInfo")
    DELIVERY_INFO("DeliveryInfo"),
    @XmlEnumValue("FormOfPayment")
    FORM_OF_PAYMENT("FormOfPayment"),
    @XmlEnumValue("ActionStatus")
    ACTION_STATUS("ActionStatus"),
    OSI("OSI"),
    @XmlEnumValue("GeneralRemark")
    GENERAL_REMARK("GeneralRemark"),
    @XmlEnumValue("UnassociatedRemark")
    UNASSOCIATED_REMARK("UnassociatedRemark"),
    @XmlEnumValue("AccountingRemark")
    ACCOUNTING_REMARK("AccountingRemark"),
    @XmlEnumValue("PostScript")
    POST_SCRIPT("PostScript"),
    @XmlEnumValue("AirReservationAirSegmentUpdate")
    AIR_RESERVATION_AIR_SEGMENT_UPDATE("AirReservationAirSegmentUpdate"),
    @XmlEnumValue("AirSegment")
    AIR_SEGMENT("AirSegment"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),
    SSR("SSR"),
    @XmlEnumValue("SeatAssignment")
    SEAT_ASSIGNMENT("SeatAssignment"),
    @XmlEnumValue("SpecificSeatAssignment")
    SPECIFIC_SEAT_ASSIGNMENT("SpecificSeatAssignment"),
    @XmlEnumValue("AutoSeatAssignment")
    AUTO_SEAT_ASSIGNMENT("AutoSeatAssignment"),
    @XmlEnumValue("AirPricingInfo")
    AIR_PRICING_INFO("AirPricingInfo"),
    @XmlEnumValue("VehicleSpecialRequest")
    VEHICLE_SPECIAL_REQUEST("VehicleSpecialRequest"),
    @XmlEnumValue("SpecialEquipment")
    SPECIAL_EQUIPMENT("SpecialEquipment"),
    @XmlEnumValue("XMLRemark")
    XML_REMARK("XMLRemark"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("TicketingModifiers")
    TICKETING_MODIFIERS("TicketingModifiers"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("DeliveryAddress")
    DELIVERY_ADDRESS("DeliveryAddress"),
    @XmlEnumValue("ServiceFeeInfo")
    SERVICE_FEE_INFO("ServiceFeeInfo"),
    @XmlEnumValue("LinkedUniversalRecord")
    LINKED_UNIVERSAL_RECORD("LinkedUniversalRecord"),
    @XmlEnumValue("NameRemark")
    NAME_REMARK("NameRemark"),
    @XmlEnumValue("PassiveSegment")
    PASSIVE_SEGMENT("PassiveSegment"),
    @XmlEnumValue("PaymentInformation")
    PAYMENT_INFORMATION("PaymentInformation"),
    @XmlEnumValue("CustomerID")
    CUSTOMER_ID("CustomerID"),
    @XmlEnumValue("DriversLicense")
    DRIVERS_LICENSE("DriversLicense"),
    @XmlEnumValue("AssociatedRemark")
    ASSOCIATED_REMARK("AssociatedRemark"),
    @XmlEnumValue("CollectionAddress")
    COLLECTION_ADDRESS("CollectionAddress"),
    @XmlEnumValue("HotelSpecialRequest")
    HOTEL_SPECIAL_REQUEST("HotelSpecialRequest"),
    @XmlEnumValue("CorporateDiscountID")
    CORPORATE_DISCOUNT_ID("CorporateDiscountID"),
    @XmlEnumValue("CommissionRemark")
    COMMISSION_REMARK("CommissionRemark"),
    @XmlEnumValue("PocketItineraryRemark")
    POCKET_ITINERARY_REMARK("PocketItineraryRemark"),
    @XmlEnumValue("CustomizedNameData")
    CUSTOMIZED_NAME_DATA("CustomizedNameData"),
    @XmlEnumValue("InvoiceRemark")
    INVOICE_REMARK("InvoiceRemark"),
    @XmlEnumValue("ThirdPartyInformation")
    THIRD_PARTY_INFORMATION("ThirdPartyInformation"),
    @XmlEnumValue("TravelCompliance")
    TRAVEL_COMPLIANCE("TravelCompliance"),
    @XmlEnumValue("ReviewBooking")
    REVIEW_BOOKING("ReviewBooking"),
    @XmlEnumValue("ConsolidatorRemark")
    CONSOLIDATOR_REMARK("ConsolidatorRemark"),
    @XmlEnumValue("BookingTraveler")
    BOOKING_TRAVELER("BookingTraveler"),
    @XmlEnumValue("AppliedProfile")
    APPLIED_PROFILE("AppliedProfile"),
    @XmlEnumValue("TripName")
    TRIP_NAME("TripName"),
    @XmlEnumValue("TravelPurpose")
    TRAVEL_PURPOSE("TravelPurpose");
    private final String value;

    TypeElement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeElement fromValue(String v) {
        for (TypeElement c: TypeElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
