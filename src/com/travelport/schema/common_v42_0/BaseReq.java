
package com.travelport.schema.common_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.util_v42_0.AgencyServiceFeeCreateReq;
import com.travelport.schema.util_v42_0.BrandedFareAdminReq;
import com.travelport.schema.util_v42_0.BrandedFareSearchReq;
import com.travelport.schema.util_v42_0.CalculateTaxReq;
import com.travelport.schema.util_v42_0.ContentProviderRetrieveReq;
import com.travelport.schema.util_v42_0.CreateAgencyFeeMcoReq;
import com.travelport.schema.util_v42_0.CreateAirlineFeeMcoReq;
import com.travelport.schema.util_v42_0.CreditCardAuthReq;
import com.travelport.schema.util_v42_0.CurrencyConversionReq;
import com.travelport.schema.util_v42_0.FindEmployeesOnFlightReq;
import com.travelport.schema.util_v42_0.McoSearchReq;
import com.travelport.schema.util_v42_0.McoVoidReq;
import com.travelport.schema.util_v42_0.MctCountReq;
import com.travelport.schema.util_v42_0.MctLookupReq;
import com.travelport.schema.util_v42_0.MirReportRetrieveReq;
import com.travelport.schema.util_v42_0.ReferenceDataRetrieveReq;
import com.travelport.schema.util_v42_0.ReferenceDataSearchReq;
import com.travelport.schema.util_v42_0.ReferenceDataUpdateReq;
import com.travelport.schema.util_v42_0.UpsellAdminReq;
import com.travelport.schema.util_v42_0.UpsellSearchReq;
import com.travelport.schema.vehicle_v42_0.VehicleLocationDetailReq;
import com.travelport.schema.vehicle_v42_0.VehicleLocationReq;
import com.travelport.schema.vehicle_v42_0.VehicleMediaLinksReq;
import com.travelport.schema.vehicle_v42_0.VehicleRetrieveReq;
import com.travelport.schema.universal_v42_0.AckScheduleChangeReq;
import com.travelport.schema.universal_v42_0.AirCancelReq;
import com.travelport.schema.universal_v42_0.AirMerchandisingFulfillmentReq;
import com.travelport.schema.universal_v42_0.HotelCancelReq;
import com.travelport.schema.universal_v42_0.PassiveCancelReq;
import com.travelport.schema.universal_v42_0.ProviderReservationDisplayDetailsReq;
import com.travelport.schema.universal_v42_0.ProviderReservationDivideReq;
import com.travelport.schema.universal_v42_0.SavedTripCreateReq;
import com.travelport.schema.universal_v42_0.SavedTripDeleteReq;
import com.travelport.schema.universal_v42_0.SavedTripModifyReq;
import com.travelport.schema.universal_v42_0.SavedTripRetrieveReq;
import com.travelport.schema.universal_v42_0.SavedTripSearchReq;
import com.travelport.schema.universal_v42_0.UniversalRecordCancelReq;
import com.travelport.schema.universal_v42_0.UniversalRecordHistorySearchReq;
import com.travelport.schema.universal_v42_0.UniversalRecordImportReq;
import com.travelport.schema.universal_v42_0.UniversalRecordModifyReq;
import com.travelport.schema.universal_v42_0.UniversalRecordRetrieveReq;
import com.travelport.schema.universal_v42_0.UniversalRecordSearchReq;
import com.travelport.schema.universal_v42_0.VehicleCancelReq;
import com.travelport.schema.hotel_v42_0.BaseHotelDetailsReq;
import com.travelport.schema.hotel_v42_0.HotelKeywordReq;
import com.travelport.schema.hotel_v42_0.HotelMediaLinksReq;
import com.travelport.schema.hotel_v42_0.HotelRetrieveReq;
import com.travelport.schema.hotel_v42_0.HotelRulesReq;
import com.travelport.schema.hotel_v42_0.HotelUpsellDetailsReq;
import com.travelport.schema.hotel_v42_0.RetrieveHotelSearchAvailabilityReq;
import com.travelport.schema.air_v42_0.AirBaseReq;
import com.travelport.schema.air_v42_0.AirExchangeEligibilityReq;
import com.travelport.schema.air_v42_0.AirExchangeReq;
import com.travelport.schema.air_v42_0.AirExchangeTicketingReq;
import com.travelport.schema.air_v42_0.AirFareDisplayReq;
import com.travelport.schema.air_v42_0.AirFareRulesReq;
import com.travelport.schema.air_v42_0.AirMerchandisingDetailsReq;
import com.travelport.schema.air_v42_0.AirMerchandisingOfferAvailabilityReq;
import com.travelport.schema.air_v42_0.AirPrePayReq;
import com.travelport.schema.air_v42_0.AirRefundQuoteReq;
import com.travelport.schema.air_v42_0.AirRefundReq;
import com.travelport.schema.air_v42_0.AirRetrieveDocumentReq;
import com.travelport.schema.air_v42_0.AirVoidDocumentReq;
import com.travelport.schema.air_v42_0.EMDIssuanceReq;
import com.travelport.schema.air_v42_0.EMDRetrieveReq;
import com.travelport.schema.air_v42_0.FlightDetailsReq;
import com.travelport.schema.air_v42_0.FlightInformationReq;
import com.travelport.schema.air_v42_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v42_0.SeatMapReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseCoreReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}OverridePCC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseSearchReq.class,
    BaseCreateReservationReq.class,
    ReferenceDataUpdateReq.class,
    FindEmployeesOnFlightReq.class,
    AgencyServiceFeeCreateReq.class,
    BrandedFareSearchReq.class,
    BrandedFareAdminReq.class,
    ContentProviderRetrieveReq.class,
    CalculateTaxReq.class,
    ReferenceDataSearchReq.class,
    ReferenceDataRetrieveReq.class,
    MctCountReq.class,
    MctLookupReq.class,
    McoVoidReq.class,
    McoSearchReq.class,
    MirReportRetrieveReq.class,
    CreateAirlineFeeMcoReq.class,
    CreateAgencyFeeMcoReq.class,
    CurrencyConversionReq.class,
    CreditCardAuthReq.class,
    UpsellSearchReq.class,
    UpsellAdminReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class BaseReq
    extends BaseCoreReq
{

    @XmlElement(name = "OverridePCC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean retrieveProviderReservationDetails;

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * Gets the value of the retrieveProviderReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isRetrieveProviderReservationDetails() {
        if (retrieveProviderReservationDetails == null) {
            return false;
        } else {
            return retrieveProviderReservationDetails;
        }
    }

    /**
     * Sets the value of the retrieveProviderReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
