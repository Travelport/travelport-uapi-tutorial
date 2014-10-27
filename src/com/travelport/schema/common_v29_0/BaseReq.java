
package com.travelport.schema.common_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v29_0.AirBaseReq;
import com.travelport.schema.air_v29_0.AirExchangeQuoteReq;
import com.travelport.schema.air_v29_0.AirExchangeReq;
import com.travelport.schema.air_v29_0.AirExchangeTicketingReq;
import com.travelport.schema.air_v29_0.AirFareDisplayReq;
import com.travelport.schema.air_v29_0.AirFareRulesReq;
import com.travelport.schema.air_v29_0.AirMerchandisingDetailsReq;
import com.travelport.schema.air_v29_0.AirMerchandisingOfferAvailabilityReq;
import com.travelport.schema.air_v29_0.AirPrePayReq;
import com.travelport.schema.air_v29_0.AirRefundQuoteReq;
import com.travelport.schema.air_v29_0.AirRefundReq;
import com.travelport.schema.air_v29_0.AirRetrieveDocumentReq;
import com.travelport.schema.air_v29_0.AirVoidDocumentReq;
import com.travelport.schema.air_v29_0.EMDIssuanceReq;
import com.travelport.schema.air_v29_0.EMDRetrieveReq;
import com.travelport.schema.air_v29_0.FlightDetailsReq;
import com.travelport.schema.air_v29_0.FlightInformationReq;
import com.travelport.schema.air_v29_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v29_0.SeatMapReq;
import com.travelport.schema.hotel_v29_0.BaseHotelDetailsReq;
import com.travelport.schema.hotel_v29_0.HotelKeywordReq;
import com.travelport.schema.hotel_v29_0.HotelMediaLinksReq;
import com.travelport.schema.hotel_v29_0.HotelRetrieveReq;
import com.travelport.schema.hotel_v29_0.HotelRulesReq;
import com.travelport.schema.hotel_v29_0.HotelUpsellDetailsReq;
import com.travelport.schema.hotel_v29_0.RetrieveHotelSearchAvailabilityReq;
import com.travelport.schema.vehicle_v29_0.VehicleLocationDetailReq;
import com.travelport.schema.vehicle_v29_0.VehicleLocationReq;
import com.travelport.schema.vehicle_v29_0.VehicleMediaLinksReq;
import com.travelport.schema.vehicle_v29_0.VehicleRetrieveReq;
import com.travelport.schema.universal_v29_0.AckScheduleChangeReq;
import com.travelport.schema.universal_v29_0.AirCancelReq;
import com.travelport.schema.universal_v29_0.AirMerchandisingFulfillmentReq;
import com.travelport.schema.universal_v29_0.HotelCancelReq;
import com.travelport.schema.universal_v29_0.PassiveCancelReq;
import com.travelport.schema.universal_v29_0.ProviderReservationDisplayDetailsReq;
import com.travelport.schema.universal_v29_0.ProviderReservationDivideReq;
import com.travelport.schema.universal_v29_0.SavedTripCreateReq;
import com.travelport.schema.universal_v29_0.SavedTripDeleteReq;
import com.travelport.schema.universal_v29_0.SavedTripModifyReq;
import com.travelport.schema.universal_v29_0.SavedTripRetrieveReq;
import com.travelport.schema.universal_v29_0.SavedTripSearchReq;
import com.travelport.schema.universal_v29_0.UniversalRecordCancelReq;
import com.travelport.schema.universal_v29_0.UniversalRecordHistorySearchReq;
import com.travelport.schema.universal_v29_0.UniversalRecordImportReq;
import com.travelport.schema.universal_v29_0.UniversalRecordModifyReq;
import com.travelport.schema.universal_v29_0.UniversalRecordRetrieveReq;
import com.travelport.schema.universal_v29_0.UniversalRecordSearchReq;
import com.travelport.schema.universal_v29_0.VehicleCancelReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseCoreReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}OverridePCC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseCreateReservationReq.class,
    AirExchangeReq.class,
    RetrieveLowFareSearchReq.class,
    AirVoidDocumentReq.class,
    AirRefundQuoteReq.class,
    AirFareDisplayReq.class,
    EMDIssuanceReq.class,
    FlightInformationReq.class,
    AirExchangeQuoteReq.class,
    AirRefundReq.class,
    AirPrePayReq.class,
    BaseSearchReq.class,
    AirRetrieveDocumentReq.class,
    AirFareRulesReq.class,
    FlightDetailsReq.class,
    AirBaseReq.class,
    AirMerchandisingOfferAvailabilityReq.class,
    EMDRetrieveReq.class,
    AirMerchandisingDetailsReq.class,
    SeatMapReq.class,
    AirExchangeTicketingReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public class BaseReq
    extends BaseCoreReq
{

    @XmlElement(name = "OverridePCC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean retrieveProviderReservationDetails;

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
