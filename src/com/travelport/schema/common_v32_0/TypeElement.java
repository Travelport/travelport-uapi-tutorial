
package com.travelport.schema.common_v32_0;

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
 * &lt;simpleType name="typeElement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="CreditCardAuthorization"/&gt;
 *     &lt;enumeration value="DeliveryInfo"/&gt;
 *     &lt;enumeration value="FormOfPayment"/&gt;
 *     &lt;enumeration value="ActionStatus"/&gt;
 *     &lt;enumeration value="OSI"/&gt;
 *     &lt;enumeration value="GeneralRemark"/&gt;
 *     &lt;enumeration value="UnassociatedRemark"/&gt;
 *     &lt;enumeration value="AccountingRemark"/&gt;
 *     &lt;enumeration value="PostScript"/&gt;
 *     &lt;enumeration value="AirReservationAirSegmentUpdate"/&gt;
 *     &lt;enumeration value="AirSegment"/&gt;
 *     &lt;enumeration value="PhoneNumber"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="LoyaltyCard"/&gt;
 *     &lt;enumeration value="SSR"/&gt;
 *     &lt;enumeration value="SeatAssignment"/&gt;
 *     &lt;enumeration value="SpecificSeatAssignment"/&gt;
 *     &lt;enumeration value="AutoSeatAssignment"/&gt;
 *     &lt;enumeration value="AirPricingInfo"/&gt;
 *     &lt;enumeration value="VehicleSpecialRequest"/&gt;
 *     &lt;enumeration value="SpecialEquipment"/&gt;
 *     &lt;enumeration value="XMLRemark"/&gt;
 *     &lt;enumeration value="Address"/&gt;
 *     &lt;enumeration value="TicketingModifiers"/&gt;
 *     &lt;enumeration value="Guarantee"/&gt;
 *     &lt;enumeration value="DeliveryAddress"/&gt;
 *     &lt;enumeration value="ServiceFeeInfo"/&gt;
 *     &lt;enumeration value="LinkedUniversalRecord"/&gt;
 *     &lt;enumeration value="NameRemark"/&gt;
 *     &lt;enumeration value="PassiveSegment"/&gt;
 *     &lt;enumeration value="PaymentInformation"/&gt;
 *     &lt;enumeration value="CustomerID"/&gt;
 *     &lt;enumeration value="DriversLicense"/&gt;
 *     &lt;enumeration value="AssociatedRemark"/&gt;
 *     &lt;enumeration value="CollectionAddress"/&gt;
 *     &lt;enumeration value="HotelSpecialRequest"/&gt;
 *     &lt;enumeration value="CorporateDiscountID"/&gt;
 *     &lt;enumeration value="CommissionRemark"/&gt;
 *     &lt;enumeration value="PocketItineraryRemark"/&gt;
 *     &lt;enumeration value="CustomizedNameData"/&gt;
 *     &lt;enumeration value="InvoiceRemark"/&gt;
 *     &lt;enumeration value="ThirdPartyInformation"/&gt;
 *     &lt;enumeration value="TravelCompliance"/&gt;
 *     &lt;enumeration value="ReviewBooking"/&gt;
 *     &lt;enumeration value="ConsolidatorRemark"/&gt;
 *     &lt;enumeration value="BookingTraveler"/&gt;
 *     &lt;enumeration value="AppliedProfile"/&gt;
 *     &lt;enumeration value="TripName"/&gt;
 *     &lt;enumeration value="TravelPurpose"/&gt;
 *     &lt;enumeration value="BookingConfirmation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeElement")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:35:35-06:00", comment = "JAXB RI v2.2.11")
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
    TRAVEL_PURPOSE("TravelPurpose"),
    @XmlEnumValue("BookingConfirmation")
    BOOKING_CONFIRMATION("BookingConfirmation");
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
