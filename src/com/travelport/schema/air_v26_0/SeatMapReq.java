
package com.travelport.schema.air_v26_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.AgencySellInfo;
import com.travelport.schema.common_v26_0.BaseReq;
import com.travelport.schema.common_v26_0.HostToken;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}AgencySellInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirSegment"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}HostToken" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}BookingCode"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}SearchTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}HostReservation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnSeatPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencySellInfo",
    "airSegment",
    "hostToken",
    "bookingCode",
    "searchTraveler",
    "hostReservation"
})
@XmlRootElement(name = "SeatMapReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
public class SeatMapReq
    extends BaseReq
{

    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSegment", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected TypeBaseAirSegment airSegment;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected HostToken hostToken;
    @XmlElement(name = "BookingCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected BookingCode bookingCode;
    @XmlElement(name = "SearchTraveler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "HostReservation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected HostReservation hostReservation;
    @XmlAttribute(name = "ReturnSeatPricing")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean returnSeatPricing;

    /**
     * 
     *                                     Provider: ACH-Required if the user requesting the seat map is not the same agent authenticated in the request.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link TypeBaseAirSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public TypeBaseAirSegment getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseAirSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setAirSegment(TypeBaseAirSegment value) {
        this.airSegment = value;
    }

    /**
     * Provider: ACH-Required if the carrier has multiple adapters.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link BookingCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public BookingCode getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setBookingCode(BookingCode value) {
        this.bookingCode = value;
    }

    /**
     * Provider: 1G,1V,ACH,MCH.Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * Provider: ACH,MCH-Required when seat price is requested.
     * 
     * @return
     *     possible object is
     *     {@link HostReservation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public HostReservation getHostReservation() {
        return hostReservation;
    }

    /**
     * Sets the value of the hostReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostReservation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setHostReservation(HostReservation value) {
        this.hostReservation = value;
    }

    /**
     * Gets the value of the returnSeatPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public boolean isReturnSeatPricing() {
        if (returnSeatPricing == null) {
            return false;
        } else {
            return returnSeatPricing;
        }
    }

    /**
     * Sets the value of the returnSeatPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setReturnSeatPricing(Boolean value) {
        this.returnSeatPricing = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
