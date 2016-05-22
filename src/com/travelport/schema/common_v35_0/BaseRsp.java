
package com.travelport.schema.common_v35_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;

import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.air_v35_0.AirExchangeQuoteRsp;
import com.travelport.schema.air_v35_0.AirExchangeRsp;
import com.travelport.schema.air_v35_0.AirExchangeTicketingRsp;
import com.travelport.schema.air_v35_0.AirFareDisplayRsp;
import com.travelport.schema.air_v35_0.AirFareRulesRsp;
import com.travelport.schema.air_v35_0.AirMerchandisingDetailsRsp;
import com.travelport.schema.air_v35_0.AirMerchandisingOfferAvailabilityRsp;
import com.travelport.schema.air_v35_0.AirPrePayRsp;
import com.travelport.schema.air_v35_0.AirRefundQuoteRsp;
import com.travelport.schema.air_v35_0.AirRefundRsp;
import com.travelport.schema.air_v35_0.AirRepriceRsp;
import com.travelport.schema.air_v35_0.AirRetrieveDocumentRsp;
import com.travelport.schema.air_v35_0.AirTicketingRsp;
import com.travelport.schema.air_v35_0.AirVoidDocumentRsp;
import com.travelport.schema.air_v35_0.BaseAirPriceRsp;
import com.travelport.schema.air_v35_0.EMDIssuanceRsp;
import com.travelport.schema.air_v35_0.EMDRetrieveRsp;
import com.travelport.schema.air_v35_0.FlightDetailsRsp;
import com.travelport.schema.air_v35_0.FlightInformationRsp;
import com.travelport.schema.air_v35_0.SeatMapRsp;
import com.travelport.schema.universal_v35_0.AckScheduleChangeRsp;
import com.travelport.schema.universal_v35_0.AirCancelRsp;
import com.travelport.schema.universal_v35_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v35_0.AirMerchandisingFulfillmentRsp;
import com.travelport.schema.universal_v35_0.HotelCancelRsp;
import com.travelport.schema.universal_v35_0.HotelCreateReservationRsp;
import com.travelport.schema.universal_v35_0.PassiveCancelRsp;
import com.travelport.schema.universal_v35_0.PassiveCreateReservationRsp;
import com.travelport.schema.universal_v35_0.ProviderReservationDisplayDetailsRsp;
import com.travelport.schema.universal_v35_0.ProviderReservationDivideRsp;
import com.travelport.schema.universal_v35_0.SavedTripCreateRsp;
import com.travelport.schema.universal_v35_0.SavedTripDeleteRsp;
import com.travelport.schema.universal_v35_0.SavedTripModifyRsp;
import com.travelport.schema.universal_v35_0.SavedTripRetrieveRsp;
import com.travelport.schema.universal_v35_0.SavedTripSearchRsp;
import com.travelport.schema.universal_v35_0.TypeRailCreateReservationRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordCancelRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordHistorySearchRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordImportRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordModifyRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordRetrieveRsp;
import com.travelport.schema.universal_v35_0.UniversalRecordSearchRsp;
import com.travelport.schema.universal_v35_0.VehicleCancelRsp;
import com.travelport.schema.universal_v35_0.VehicleCreateReservationRsp;
import com.travelport.schema.vehicle_v35_0.VehicleKeywordRsp;
import com.travelport.schema.vehicle_v35_0.VehicleLocationDetailRsp;
import com.travelport.schema.vehicle_v35_0.VehicleLocationRsp;
import com.travelport.schema.vehicle_v35_0.VehicleMediaLinksRsp;
import com.travelport.schema.vehicle_v35_0.VehicleRetrieveRsp;


/**
 * The base type for all responses.
 * 
 * <p>Java class for BaseRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ResponseMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="CommandHistory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRsp", propOrder = {
    "responseMessage"
})
@XmlSeeAlso({
    BaseSearchRsp.class,
    PassiveCancelRsp.class,
    PassiveCreateReservationRsp.class,
    AirMerchandisingFulfillmentRsp.class,
    AirCancelRsp.class,
    AirCreateReservationRsp.class,
    TypeRailCreateReservationRsp.class,
    HotelCancelRsp.class,
    HotelCreateReservationRsp.class,
    VehicleCancelRsp.class,
    VehicleCreateReservationRsp.class,
    SavedTripSearchRsp.class,
    SavedTripRetrieveRsp.class,
    SavedTripModifyRsp.class,
    SavedTripCreateRsp.class,
    ProviderReservationDisplayDetailsRsp.class,
    SavedTripDeleteRsp.class,
    UniversalRecordSearchRsp.class,
    UniversalRecordHistorySearchRsp.class,
    UniversalRecordModifyRsp.class,
    UniversalRecordImportRsp.class,
    AckScheduleChangeRsp.class,
    UniversalRecordCancelRsp.class,
    ProviderReservationDivideRsp.class,
    UniversalRecordRetrieveRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public class BaseRsp
    implements Locatable
{

    @XmlElement(name = "ResponseMessage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected List<ResponseMessage> responseMessage;
    @XmlAttribute(name = "TraceId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String traceId;
    @XmlAttribute(name = "TransactionId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String transactionId;
    @XmlAttribute(name = "ResponseTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger responseTime;
    @XmlAttribute(name = "CommandHistory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String commandHistory;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the responseMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseMessage }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public List<ResponseMessage> getResponseMessage() {
        if (responseMessage == null) {
            responseMessage = new ArrayList<ResponseMessage>();
        }
        return this.responseMessage;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setResponseTime(BigInteger value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the commandHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getCommandHistory() {
        return commandHistory;
    }

    /**
     * Sets the value of the commandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setCommandHistory(String value) {
        this.commandHistory = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
