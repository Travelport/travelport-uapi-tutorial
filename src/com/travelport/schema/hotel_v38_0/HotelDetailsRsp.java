
package com.travelport.schema.hotel_v38_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseRsp;
import com.travelport.schema.common_v38_0.HostToken;
import com.travelport.schema.common_v38_0.NextResultReference;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}NextResultReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}HostToken" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v38_0}RequestedHotelDetails" minOccurs="0"/&gt;
 *           &lt;element name="AggregatorHotelDetails" maxOccurs="99" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.travelport.com/schema/hotel_v38_0}typeHotelDetails"&gt;
 *                   &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v38_0}attrAggregatorHotelDetail"/&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v38_0}HotelAlternateProperties"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v38_0}GuestReviews" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nextResultReference",
    "hostToken",
    "requestedHotelDetails",
    "aggregatorHotelDetails",
    "hotelAlternateProperties",
    "guestReviews"
})
@XmlRootElement(name = "HotelDetailsRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
public class HotelDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "NextResultReference", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected NextResultReference nextResultReference;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected HostToken hostToken;
    @XmlElement(name = "RequestedHotelDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected RequestedHotelDetails requestedHotelDetails;
    @XmlElement(name = "AggregatorHotelDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected List<HotelDetailsRsp.AggregatorHotelDetails> aggregatorHotelDetails;
    @XmlElement(name = "HotelAlternateProperties")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelAlternateProperties hotelAlternateProperties;
    @XmlElement(name = "GuestReviews")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected GuestReviews guestReviews;

    /**
     * Gets the value of the nextResultReference property.
     * 
     * @return
     *     possible object is
     *     {@link NextResultReference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public NextResultReference getNextResultReference() {
        return nextResultReference;
    }

    /**
     * Sets the value of the nextResultReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextResultReference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setNextResultReference(NextResultReference value) {
        this.nextResultReference = value;
    }

    /**
     * Gets the value of the hostToken property.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Supported Provider GDS – 1G, 1V, 1P, 1J.
     * 
     * @return
     *     possible object is
     *     {@link RequestedHotelDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public RequestedHotelDetails getRequestedHotelDetails() {
        return requestedHotelDetails;
    }

    /**
     * Sets the value of the requestedHotelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedHotelDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setRequestedHotelDetails(RequestedHotelDetails value) {
        this.requestedHotelDetails = value;
    }

    /**
     * Gets the value of the aggregatorHotelDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregatorHotelDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregatorHotelDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailsRsp.AggregatorHotelDetails }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public List<HotelDetailsRsp.AggregatorHotelDetails> getAggregatorHotelDetails() {
        if (aggregatorHotelDetails == null) {
            aggregatorHotelDetails = new ArrayList<HotelDetailsRsp.AggregatorHotelDetails>();
        }
        return this.aggregatorHotelDetails;
    }

    /**
     * Gets the value of the hotelAlternateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAlternateProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public HotelAlternateProperties getHotelAlternateProperties() {
        return hotelAlternateProperties;
    }

    /**
     * Sets the value of the hotelAlternateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAlternateProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelAlternateProperties(HotelAlternateProperties value) {
        this.hotelAlternateProperties = value;
    }

    /**
     * Gets the value of the guestReviews property.
     * 
     * @return
     *     possible object is
     *     {@link GuestReviews }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public GuestReviews getGuestReviews() {
        return guestReviews;
    }

    /**
     * Sets the value of the guestReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestReviews }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setGuestReviews(GuestReviews value) {
        this.guestReviews = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/hotel_v38_0}typeHotelDetails"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v38_0}attrAggregatorHotelDetail"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public static class AggregatorHotelDetails
        extends TypeHotelDetails
    {

        @XmlAttribute(name = "Aggregator")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String aggregator;
        @XmlAttribute(name = "AggregatorName")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String aggregatorName;
        @XmlAttribute(name = "RulesAndRestriction")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String rulesAndRestriction;
        @XmlAttribute(name = "TermsAndConditions")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String termsAndConditions;
        @XmlAttribute(name = "SupportsPayment")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected Boolean supportsPayment;
        @XmlAttribute(name = "CommissionModel")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String commissionModel;
        @XmlAttribute(name = "MultiRoomSupport")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String multiRoomSupport;
        @XmlAttribute(name = "SupportsChildren")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected Boolean supportsChildren;
        @XmlAttribute(name = "ChildStartAge")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected BigInteger childStartAge;
        @XmlAttribute(name = "AdultStartAge")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected BigInteger adultStartAge;
        @XmlAttribute(name = "MaxChildrenPerRoom")
        @XmlSchemaType(name = "nonNegativeInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected BigInteger maxChildrenPerRoom;
        @XmlAttribute(name = "PhoneNumber")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String phoneNumber;
        @XmlAttribute(name = "AreaCode")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String areaCode;
        @XmlAttribute(name = "CountryCode")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        protected String countryCode;

        /**
         * Gets the value of the aggregator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getAggregator() {
            return aggregator;
        }

        /**
         * Sets the value of the aggregator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setAggregator(String value) {
            this.aggregator = value;
        }

        /**
         * Gets the value of the aggregatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getAggregatorName() {
            return aggregatorName;
        }

        /**
         * Sets the value of the aggregatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setAggregatorName(String value) {
            this.aggregatorName = value;
        }

        /**
         * Gets the value of the rulesAndRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getRulesAndRestriction() {
            return rulesAndRestriction;
        }

        /**
         * Sets the value of the rulesAndRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setRulesAndRestriction(String value) {
            this.rulesAndRestriction = value;
        }

        /**
         * Gets the value of the termsAndConditions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getTermsAndConditions() {
            return termsAndConditions;
        }

        /**
         * Sets the value of the termsAndConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setTermsAndConditions(String value) {
            this.termsAndConditions = value;
        }

        /**
         * Gets the value of the supportsPayment property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public Boolean isSupportsPayment() {
            return supportsPayment;
        }

        /**
         * Sets the value of the supportsPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setSupportsPayment(Boolean value) {
            this.supportsPayment = value;
        }

        /**
         * Gets the value of the commissionModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getCommissionModel() {
            return commissionModel;
        }

        /**
         * Sets the value of the commissionModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setCommissionModel(String value) {
            this.commissionModel = value;
        }

        /**
         * Gets the value of the multiRoomSupport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getMultiRoomSupport() {
            return multiRoomSupport;
        }

        /**
         * Sets the value of the multiRoomSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setMultiRoomSupport(String value) {
            this.multiRoomSupport = value;
        }

        /**
         * Gets the value of the supportsChildren property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public Boolean isSupportsChildren() {
            return supportsChildren;
        }

        /**
         * Sets the value of the supportsChildren property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setSupportsChildren(Boolean value) {
            this.supportsChildren = value;
        }

        /**
         * Gets the value of the childStartAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public BigInteger getChildStartAge() {
            return childStartAge;
        }

        /**
         * Sets the value of the childStartAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setChildStartAge(BigInteger value) {
            this.childStartAge = value;
        }

        /**
         * Gets the value of the adultStartAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public BigInteger getAdultStartAge() {
            return adultStartAge;
        }

        /**
         * Sets the value of the adultStartAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setAdultStartAge(BigInteger value) {
            this.adultStartAge = value;
        }

        /**
         * Gets the value of the maxChildrenPerRoom property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public BigInteger getMaxChildrenPerRoom() {
            return maxChildrenPerRoom;
        }

        /**
         * Sets the value of the maxChildrenPerRoom property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setMaxChildrenPerRoom(BigInteger value) {
            this.maxChildrenPerRoom = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the areaCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getAreaCode() {
            return areaCode;
        }

        /**
         * Sets the value of the areaCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setAreaCode(String value) {
            this.areaCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

    }

}
