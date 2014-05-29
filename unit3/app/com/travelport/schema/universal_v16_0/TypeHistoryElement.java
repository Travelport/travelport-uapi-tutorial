
package com.travelport.schema.universal_v16_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHistoryElement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHistoryElement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountingRemark"/>
 *     &lt;enumeration value="ActionStatus"/>
 *     &lt;enumeration value="AirPricingInfo"/>
 *     &lt;enumeration value="AirReservation"/>
 *     &lt;enumeration value="AirSegment"/>
 *     &lt;enumeration value="GeneralRemark"/>
 *     &lt;enumeration value="HotelReservation"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="OSI"/>
 *     &lt;enumeration value="SSR"/>
 *     &lt;enumeration value="URCancel"/>
 *     &lt;enumeration value="URCreate"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="DeliveryInfo"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="VehicleReservation"/>
 *     &lt;enumeration value="SeatAssignment"/>
 *     &lt;enumeration value="FormOfPayment"/>
 *     &lt;enumeration value="PassiveReservation"/>
 *     &lt;enumeration value="Ticketing"/>
 *     &lt;enumeration value="AirRefund"/>
 *     &lt;enumeration value="AirPricingPayment"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="RailReservation"/>
 *     &lt;enumeration value="RailCancel"/>
 *     &lt;enumeration value="RailJourney"/>
 *     &lt;enumeration value="RailSegment"/>
 *     &lt;enumeration value="RailPricingInfo"/>
 *     &lt;enumeration value="RailTicketInfo"/>
 *     &lt;enumeration value="RailSeatAssignment"/>
 *     &lt;enumeration value="OptionalServices"/>
 *     &lt;enumeration value="LinkedUniversalRecord"/>
 *     &lt;enumeration value="PassiveSegment"/>
 *     &lt;enumeration value="PassiveRemark"/>
 *     &lt;enumeration value="AgencyContactInfo"/>
 *     &lt;enumeration value="Postscript"/>
 *     &lt;enumeration value="CustomerID"/>
 *     &lt;enumeration value="BookingTravelerName"/>
 *     &lt;enumeration value="TourCode"/>
 *     &lt;enumeration value="PromotionalCode"/>
 *     &lt;enumeration value="UnassociatedRemark"/>
 *     &lt;enumeration value="AssociatedRemark"/>
 *     &lt;enumeration value="NameRemark"/>
 *     &lt;enumeration value="GuestInformation"/>
 *     &lt;enumeration value="BookingSource"/>
 *     &lt;enumeration value="PaymentInformation"/>
 *     &lt;enumeration value="TicketingModifier"/>
 *     &lt;enumeration value="ServiceFee"/>
 *     &lt;enumeration value="CreditCardAuth"/>
 *     &lt;enumeration value="DeliveryAddress"/>
 *     &lt;enumeration value="CollectionAddress"/>
 *     &lt;enumeration value="VehicleSpecialRequest"/>
 *     &lt;enumeration value="VehicleSpecialEquipment"/>
 *     &lt;enumeration value="HotelSegment"/>
 *     &lt;enumeration value="DiscountCode"/>
 *     &lt;enumeration value="DriversLicense"/>
 *     &lt;enumeration value="DOB"/>
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="GdsQueue"/>
 *     &lt;enumeration value="Guarantee"/>
 *     &lt;enumeration value="BookingTravelerType"/>
 *     &lt;enumeration value="CommissionRemark"/>
 *     &lt;enumeration value="CustomizedNameData"/>
 *     &lt;enumeration value="PocketItineraryRemark"/>
 *     &lt;enumeration value="InvoiceRemark"/>
 *     &lt;enumeration value="ReservationName"/>
 *     &lt;enumeration value="ThirdPartyInformation"/>
 *     &lt;enumeration value="TravelCompliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHistoryElement")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeHistoryElement {

    @XmlEnumValue("AccountingRemark")
    ACCOUNTING_REMARK("AccountingRemark"),
    @XmlEnumValue("ActionStatus")
    ACTION_STATUS("ActionStatus"),
    @XmlEnumValue("AirPricingInfo")
    AIR_PRICING_INFO("AirPricingInfo"),
    @XmlEnumValue("AirReservation")
    AIR_RESERVATION("AirReservation"),
    @XmlEnumValue("AirSegment")
    AIR_SEGMENT("AirSegment"),
    @XmlEnumValue("GeneralRemark")
    GENERAL_REMARK("GeneralRemark"),
    @XmlEnumValue("HotelReservation")
    HOTEL_RESERVATION("HotelReservation"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),
    OSI("OSI"),
    SSR("SSR"),
    @XmlEnumValue("URCancel")
    UR_CANCEL("URCancel"),
    @XmlEnumValue("URCreate")
    UR_CREATE("URCreate"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("DeliveryInfo")
    DELIVERY_INFO("DeliveryInfo"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("VehicleReservation")
    VEHICLE_RESERVATION("VehicleReservation"),
    @XmlEnumValue("SeatAssignment")
    SEAT_ASSIGNMENT("SeatAssignment"),
    @XmlEnumValue("FormOfPayment")
    FORM_OF_PAYMENT("FormOfPayment"),
    @XmlEnumValue("PassiveReservation")
    PASSIVE_RESERVATION("PassiveReservation"),
    @XmlEnumValue("Ticketing")
    TICKETING("Ticketing"),
    @XmlEnumValue("AirRefund")
    AIR_REFUND("AirRefund"),
    @XmlEnumValue("AirPricingPayment")
    AIR_PRICING_PAYMENT("AirPricingPayment"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("RailReservation")
    RAIL_RESERVATION("RailReservation"),
    @XmlEnumValue("RailCancel")
    RAIL_CANCEL("RailCancel"),
    @XmlEnumValue("RailJourney")
    RAIL_JOURNEY("RailJourney"),
    @XmlEnumValue("RailSegment")
    RAIL_SEGMENT("RailSegment"),
    @XmlEnumValue("RailPricingInfo")
    RAIL_PRICING_INFO("RailPricingInfo"),
    @XmlEnumValue("RailTicketInfo")
    RAIL_TICKET_INFO("RailTicketInfo"),
    @XmlEnumValue("RailSeatAssignment")
    RAIL_SEAT_ASSIGNMENT("RailSeatAssignment"),
    @XmlEnumValue("OptionalServices")
    OPTIONAL_SERVICES("OptionalServices"),
    @XmlEnumValue("LinkedUniversalRecord")
    LINKED_UNIVERSAL_RECORD("LinkedUniversalRecord"),
    @XmlEnumValue("PassiveSegment")
    PASSIVE_SEGMENT("PassiveSegment"),
    @XmlEnumValue("PassiveRemark")
    PASSIVE_REMARK("PassiveRemark"),
    @XmlEnumValue("AgencyContactInfo")
    AGENCY_CONTACT_INFO("AgencyContactInfo"),
    @XmlEnumValue("Postscript")
    POSTSCRIPT("Postscript"),
    @XmlEnumValue("CustomerID")
    CUSTOMER_ID("CustomerID"),
    @XmlEnumValue("BookingTravelerName")
    BOOKING_TRAVELER_NAME("BookingTravelerName"),
    @XmlEnumValue("TourCode")
    TOUR_CODE("TourCode"),
    @XmlEnumValue("PromotionalCode")
    PROMOTIONAL_CODE("PromotionalCode"),
    @XmlEnumValue("UnassociatedRemark")
    UNASSOCIATED_REMARK("UnassociatedRemark"),
    @XmlEnumValue("AssociatedRemark")
    ASSOCIATED_REMARK("AssociatedRemark"),
    @XmlEnumValue("NameRemark")
    NAME_REMARK("NameRemark"),
    @XmlEnumValue("GuestInformation")
    GUEST_INFORMATION("GuestInformation"),
    @XmlEnumValue("BookingSource")
    BOOKING_SOURCE("BookingSource"),
    @XmlEnumValue("PaymentInformation")
    PAYMENT_INFORMATION("PaymentInformation"),
    @XmlEnumValue("TicketingModifier")
    TICKETING_MODIFIER("TicketingModifier"),
    @XmlEnumValue("ServiceFee")
    SERVICE_FEE("ServiceFee"),
    @XmlEnumValue("CreditCardAuth")
    CREDIT_CARD_AUTH("CreditCardAuth"),
    @XmlEnumValue("DeliveryAddress")
    DELIVERY_ADDRESS("DeliveryAddress"),
    @XmlEnumValue("CollectionAddress")
    COLLECTION_ADDRESS("CollectionAddress"),
    @XmlEnumValue("VehicleSpecialRequest")
    VEHICLE_SPECIAL_REQUEST("VehicleSpecialRequest"),
    @XmlEnumValue("VehicleSpecialEquipment")
    VEHICLE_SPECIAL_EQUIPMENT("VehicleSpecialEquipment"),
    @XmlEnumValue("HotelSegment")
    HOTEL_SEGMENT("HotelSegment"),
    @XmlEnumValue("DiscountCode")
    DISCOUNT_CODE("DiscountCode"),
    @XmlEnumValue("DriversLicense")
    DRIVERS_LICENSE("DriversLicense"),
    DOB("DOB"),
    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("GdsQueue")
    GDS_QUEUE("GdsQueue"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("BookingTravelerType")
    BOOKING_TRAVELER_TYPE("BookingTravelerType"),
    @XmlEnumValue("CommissionRemark")
    COMMISSION_REMARK("CommissionRemark"),
    @XmlEnumValue("CustomizedNameData")
    CUSTOMIZED_NAME_DATA("CustomizedNameData"),
    @XmlEnumValue("PocketItineraryRemark")
    POCKET_ITINERARY_REMARK("PocketItineraryRemark"),
    @XmlEnumValue("InvoiceRemark")
    INVOICE_REMARK("InvoiceRemark"),
    @XmlEnumValue("ReservationName")
    RESERVATION_NAME("ReservationName"),
    @XmlEnumValue("ThirdPartyInformation")
    THIRD_PARTY_INFORMATION("ThirdPartyInformation"),
    @XmlEnumValue("TravelCompliance")
    TRAVEL_COMPLIANCE("TravelCompliance");
    private final String value;

    TypeHistoryElement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHistoryElement fromValue(String v) {
        for (TypeHistoryElement c: TypeHistoryElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
