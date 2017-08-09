
package com.travelport.schema.hotel_v42_0;

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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v42_0.CorporateDiscountID;
import com.travelport.schema.common_v42_0.TypePolicyCodesList;
import com.travelport.schema.common_v42_0.TypeTrinary;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolicyCodesList" type="{http://www.travelport.com/schema/common_v42_0}typePolicyCodesList" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateDescription" type="{http://www.travelport.com/schema/hotel_v42_0}typeHotelRateDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelRateByDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}CorporateDiscountID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}AcceptedPayment" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}Commission" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}RateMatchIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}TaxDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}CancelInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}GuaranteeInfo" minOccurs="0"/&gt;
 *         &lt;element name="SupplementalRateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomCapacity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="99" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtraCharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ExtraAdultAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *                 &lt;attribute name="ExtraChildAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *                 &lt;attribute name="CribAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *                 &lt;attribute name="AdultRollawayCharge" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *                 &lt;attribute name="ChildRollawayCharge" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Inclusions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BedTypes" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MealPlans" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *                           &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *                           &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}RoomView" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SmokingRoomIndicator" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v42_0}attrHotelRate"/&gt;
 *       &lt;attribute name="RatePlanType" use="required" type="{http://www.travelport.com/schema/common_v42_0}typeRatePlanType" /&gt;
 *       &lt;attribute name="ApproximateBase" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTax" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateTotal" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *       &lt;attribute name="ApproximateSurcharge" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ApproximateRateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v42_0}typeRef" /&gt;
 *       &lt;attribute name="RateSupplier" type="{http://www.travelport.com/schema/common_v42_0}typeThirdPartySupplier" /&gt;
 *       &lt;attribute name="BookableQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="RateOfferId" type="{http://www.travelport.com/schema/hotel_v42_0}typeRateOfferId" /&gt;
 *       &lt;attribute name="InPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateChangeIndicator" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="ExtraFeesIncluded" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCodesList",
    "roomRateDescription",
    "hotelRateByDate",
    "corporateDiscountID",
    "acceptedPayment",
    "commission",
    "rateMatchIndicator",
    "taxDetails",
    "cancelInfo",
    "guaranteeInfo",
    "supplementalRateInfo",
    "roomCapacity",
    "extraCharges",
    "inclusions"
})
@XmlRootElement(name = "HotelRateDetail")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
public class HotelRateDetail
    implements Locatable
{

    @XmlElement(name = "PolicyCodesList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypePolicyCodesList policyCodesList;
    @XmlElement(name = "RoomRateDescription")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeHotelRateDescription> roomRateDescription;
    @XmlElement(name = "HotelRateByDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<HotelRateByDate> hotelRateByDate;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "AcceptedPayment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<AcceptedPayment> acceptedPayment;
    @XmlElement(name = "Commission")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Commission commission;
    @XmlElement(name = "RateMatchIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<RateMatchIndicator> rateMatchIndicator;
    @XmlElement(name = "TaxDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TaxDetails taxDetails;
    @XmlElement(name = "CancelInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected CancelInfo cancelInfo;
    @XmlElement(name = "GuaranteeInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected GuaranteeInfo guaranteeInfo;
    @XmlElement(name = "SupplementalRateInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String supplementalRateInfo;
    @XmlElement(name = "RoomCapacity")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected HotelRateDetail.RoomCapacity roomCapacity;
    @XmlElement(name = "ExtraCharges")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected HotelRateDetail.ExtraCharges extraCharges;
    @XmlElement(name = "Inclusions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected HotelRateDetail.Inclusions inclusions;
    @XmlAttribute(name = "RatePlanType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String ratePlanType;
    @XmlAttribute(name = "ApproximateBase")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String approximateBase;
    @XmlAttribute(name = "ApproximateTax")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String approximateTax;
    @XmlAttribute(name = "ApproximateTotal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String approximateTotal;
    @XmlAttribute(name = "ApproximateSurcharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String approximateSurcharge;
    @XmlAttribute(name = "RateGuaranteed")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "ApproximateRateGuaranteed")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean approximateRateGuaranteed;
    @XmlAttribute(name = "RateCategory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger rateCategory;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlAttribute(name = "RateSupplier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String rateSupplier;
    @XmlAttribute(name = "BookableQuantity")
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger bookableQuantity;
    @XmlAttribute(name = "RateOfferId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String rateOfferId;
    @XmlAttribute(name = "InPolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean inPolicy;
    @XmlAttribute(name = "RateChangeIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary rateChangeIndicator;
    @XmlAttribute(name = "ExtraFeesIncluded")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary extraFeesIncluded;
    @XmlAttribute(name = "Base")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String base;
    @XmlAttribute(name = "Tax")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String tax;
    @XmlAttribute(name = "Total")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String total;
    @XmlAttribute(name = "Surcharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String surcharge;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the policyCodesList property.
     * 
     * @return
     *     possible object is
     *     {@link TypePolicyCodesList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypePolicyCodesList getPolicyCodesList() {
        return policyCodesList;
    }

    /**
     * Sets the value of the policyCodesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePolicyCodesList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setPolicyCodesList(TypePolicyCodesList value) {
        this.policyCodesList = value;
    }

    /**
     * Gets the value of the roomRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHotelRateDescription }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeHotelRateDescription> getRoomRateDescription() {
        if (roomRateDescription == null) {
            roomRateDescription = new ArrayList<TypeHotelRateDescription>();
        }
        return this.roomRateDescription;
    }

    /**
     * Gets the value of the hotelRateByDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateByDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateByDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateByDate }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<HotelRateByDate> getHotelRateByDate() {
        if (hotelRateByDate == null) {
            hotelRateByDate = new ArrayList<HotelRateByDate>();
        }
        return this.hotelRateByDate;
    }

    /**
     * Corporate Discount IDs and Negotiate rate codes associated with this rate Gets the value of the corporateDiscountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDiscountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDiscountID }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<CorporateDiscountID> getCorporateDiscountID() {
        if (corporateDiscountID == null) {
            corporateDiscountID = new ArrayList<CorporateDiscountID>();
        }
        return this.corporateDiscountID;
    }

    /**
     * Form of payment accepted by the hotel supplier (chain or property). For credit cards, the two-character code for the credit card type is used. Gets the value of the acceptedPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedPayment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<AcceptedPayment> getAcceptedPayment() {
        if (acceptedPayment == null) {
            acceptedPayment = new ArrayList<AcceptedPayment>();
        }
        return this.acceptedPayment;
    }

    /**
     * Commission associated with the Rate Plan, as a percentage or flat amount.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Returns "Match" Indicators for certain request parameters for Hotel Rate returned in response.Gets the value of the rateMatchIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateMatchIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateMatchIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateMatchIndicator }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<RateMatchIndicator> getRateMatchIndicator() {
        if (rateMatchIndicator == null) {
            rateMatchIndicator = new ArrayList<RateMatchIndicator>();
        }
        return this.rateMatchIndicator;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public CancelInfo getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setCancelInfo(CancelInfo value) {
        this.cancelInfo = value;
    }

    /**
     * Guarantee, deposit, and prepayment information
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public GuaranteeInfo getGuaranteeInfo() {
        return guaranteeInfo;
    }

    /**
     * Sets the value of the guaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setGuaranteeInfo(GuaranteeInfo value) {
        this.guaranteeInfo = value;
    }

    /**
     * Gets the value of the supplementalRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getSupplementalRateInfo() {
        return supplementalRateInfo;
    }

    /**
     * Sets the value of the supplementalRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setSupplementalRateInfo(String value) {
        this.supplementalRateInfo = value;
    }

    /**
     * Gets the value of the roomCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.RoomCapacity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public HotelRateDetail.RoomCapacity getRoomCapacity() {
        return roomCapacity;
    }

    /**
     * Sets the value of the roomCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.RoomCapacity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRoomCapacity(HotelRateDetail.RoomCapacity value) {
        this.roomCapacity = value;
    }

    /**
     * Gets the value of the extraCharges property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.ExtraCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public HotelRateDetail.ExtraCharges getExtraCharges() {
        return extraCharges;
    }

    /**
     * Sets the value of the extraCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.ExtraCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setExtraCharges(HotelRateDetail.ExtraCharges value) {
        this.extraCharges = value;
    }

    /**
     * Gets the value of the inclusions property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail.Inclusions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public HotelRateDetail.Inclusions getInclusions() {
        return inclusions;
    }

    /**
     * Sets the value of the inclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail.Inclusions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setInclusions(HotelRateDetail.Inclusions value) {
        this.inclusions = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the approximateBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getApproximateBase() {
        return approximateBase;
    }

    /**
     * Sets the value of the approximateBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateBase(String value) {
        this.approximateBase = value;
    }

    /**
     * Gets the value of the approximateTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getApproximateTax() {
        return approximateTax;
    }

    /**
     * Sets the value of the approximateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateTax(String value) {
        this.approximateTax = value;
    }

    /**
     * Gets the value of the approximateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getApproximateTotal() {
        return approximateTotal;
    }

    /**
     * Sets the value of the approximateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateTotal(String value) {
        this.approximateTotal = value;
    }

    /**
     * Gets the value of the approximateSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getApproximateSurcharge() {
        return approximateSurcharge;
    }

    /**
     * Sets the value of the approximateSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateSurcharge(String value) {
        this.approximateSurcharge = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isRateGuaranteed() {
        return rateGuaranteed;
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the approximateRateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isApproximateRateGuaranteed() {
        return approximateRateGuaranteed;
    }

    /**
     * Sets the value of the approximateRateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateRateGuaranteed(Boolean value) {
        this.approximateRateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRateCategory(BigInteger value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the rateSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getRateSupplier() {
        return rateSupplier;
    }

    /**
     * Sets the value of the rateSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRateSupplier(String value) {
        this.rateSupplier = value;
    }

    /**
     * Gets the value of the bookableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getBookableQuantity() {
        return bookableQuantity;
    }

    /**
     * Sets the value of the bookableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setBookableQuantity(BigInteger value) {
        this.bookableQuantity = value;
    }

    /**
     * Gets the value of the rateOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getRateOfferId() {
        return rateOfferId;
    }

    /**
     * Sets the value of the rateOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRateOfferId(String value) {
        this.rateOfferId = value;
    }

    /**
     * Gets the value of the inPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isInPolicy() {
        return inPolicy;
    }

    /**
     * Sets the value of the inPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setInPolicy(Boolean value) {
        this.inPolicy = value;
    }

    /**
     * Gets the value of the rateChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getRateChangeIndicator() {
        return rateChangeIndicator;
    }

    /**
     * Sets the value of the rateChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setRateChangeIndicator(TypeTrinary value) {
        this.rateChangeIndicator = value;
    }

    /**
     * Gets the value of the extraFeesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getExtraFeesIncluded() {
        return extraFeesIncluded;
    }

    /**
     * Sets the value of the extraFeesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setExtraFeesIncluded(TypeTrinary value) {
        this.extraFeesIncluded = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ExtraAdultAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
     *       &lt;attribute name="ExtraChildAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
     *       &lt;attribute name="CribAmount" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
     *       &lt;attribute name="AdultRollawayCharge" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
     *       &lt;attribute name="ChildRollawayCharge" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public static class ExtraCharges
        implements Locatable
    {

        @XmlAttribute(name = "ExtraAdultAmount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected String extraAdultAmount;
        @XmlAttribute(name = "ExtraChildAmount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected String extraChildAmount;
        @XmlAttribute(name = "CribAmount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected String cribAmount;
        @XmlAttribute(name = "AdultRollawayCharge")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected String adultRollawayCharge;
        @XmlAttribute(name = "ChildRollawayCharge")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected String childRollawayCharge;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the extraAdultAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String getExtraAdultAmount() {
            return extraAdultAmount;
        }

        /**
         * Sets the value of the extraAdultAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setExtraAdultAmount(String value) {
            this.extraAdultAmount = value;
        }

        /**
         * Gets the value of the extraChildAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String getExtraChildAmount() {
            return extraChildAmount;
        }

        /**
         * Sets the value of the extraChildAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setExtraChildAmount(String value) {
            this.extraChildAmount = value;
        }

        /**
         * Gets the value of the cribAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String getCribAmount() {
            return cribAmount;
        }

        /**
         * Sets the value of the cribAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setCribAmount(String value) {
            this.cribAmount = value;
        }

        /**
         * Gets the value of the adultRollawayCharge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String getAdultRollawayCharge() {
            return adultRollawayCharge;
        }

        /**
         * Sets the value of the adultRollawayCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setAdultRollawayCharge(String value) {
            this.adultRollawayCharge = value;
        }

        /**
         * Gets the value of the childRollawayCharge property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String getChildRollawayCharge() {
            return childRollawayCharge;
        }

        /**
         * Sets the value of the childRollawayCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setChildRollawayCharge(String value) {
            this.childRollawayCharge = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BedTypes" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MealPlans" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
     *                 &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
     *                 &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}RoomView" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SmokingRoomIndicator" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bedTypes",
        "mealPlans",
        "roomView"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public static class Inclusions
        implements Locatable
    {

        @XmlElement(name = "BedTypes")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected List<HotelRateDetail.Inclusions.BedTypes> bedTypes;
        @XmlElement(name = "MealPlans")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected HotelRateDetail.Inclusions.MealPlans mealPlans;
        @XmlElement(name = "RoomView")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected RoomView roomView;
        @XmlAttribute(name = "SmokingRoomIndicator")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected TypeTrinary smokingRoomIndicator;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the bedTypes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bedTypes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBedTypes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRateDetail.Inclusions.BedTypes }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public List<HotelRateDetail.Inclusions.BedTypes> getBedTypes() {
            if (bedTypes == null) {
                bedTypes = new ArrayList<HotelRateDetail.Inclusions.BedTypes>();
            }
            return this.bedTypes;
        }

        /**
         * Gets the value of the mealPlans property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRateDetail.Inclusions.MealPlans }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public HotelRateDetail.Inclusions.MealPlans getMealPlans() {
            return mealPlans;
        }

        /**
         * Sets the value of the mealPlans property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRateDetail.Inclusions.MealPlans }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setMealPlans(HotelRateDetail.Inclusions.MealPlans value) {
            this.mealPlans = value;
        }

        /**
         * The view from the hotel room. 
         * 
         * @return
         *     possible object is
         *     {@link RoomView }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public RoomView getRoomView() {
            return roomView;
        }

        /**
         * Sets the value of the roomView property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoomView }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setRoomView(RoomView value) {
            this.roomView = value;
        }

        /**
         * Gets the value of the smokingRoomIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link TypeTrinary }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public TypeTrinary getSmokingRoomIndicator() {
            return smokingRoomIndicator;
        }

        /**
         * Sets the value of the smokingRoomIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeTrinary }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setSmokingRoomIndicator(TypeTrinary value) {
            this.smokingRoomIndicator = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public static class BedTypes
            implements Locatable
        {

            @XmlAttribute(name = "Code")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected BigInteger code;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected BigInteger quantity;
            @XmlLocation
            @XmlTransient
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected Locator locator;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public BigInteger getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setCode(BigInteger value) {
                this.code = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * Generates a String representation of the contents of this type.
             * This is an extension method, produced by the 'ts' xjc plugin
             * 
             */
            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public String toString() {
                return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public Locator sourceLocation() {
                return locator;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setSourceLocation(Locator newLocator) {
                locator = newLocator;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="MealPlan" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Breakfast" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
         *       &lt;attribute name="Lunch" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
         *       &lt;attribute name="Dinner" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mealPlan"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public static class MealPlans
            implements Locatable
        {

            @XmlElement(name = "MealPlan")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected List<HotelRateDetail.Inclusions.MealPlans.MealPlan> mealPlan;
            @XmlAttribute(name = "Breakfast")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected TypeTrinary breakfast;
            @XmlAttribute(name = "Lunch")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected TypeTrinary lunch;
            @XmlAttribute(name = "Dinner")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected TypeTrinary dinner;
            @XmlLocation
            @XmlTransient
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            protected Locator locator;

            /**
             * Gets the value of the mealPlan property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlan().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRateDetail.Inclusions.MealPlans.MealPlan }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public List<HotelRateDetail.Inclusions.MealPlans.MealPlan> getMealPlan() {
                if (mealPlan == null) {
                    mealPlan = new ArrayList<HotelRateDetail.Inclusions.MealPlans.MealPlan>();
                }
                return this.mealPlan;
            }

            /**
             * Gets the value of the breakfast property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public TypeTrinary getBreakfast() {
                return breakfast;
            }

            /**
             * Sets the value of the breakfast property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setBreakfast(TypeTrinary value) {
                this.breakfast = value;
            }

            /**
             * Gets the value of the lunch property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public TypeTrinary getLunch() {
                return lunch;
            }

            /**
             * Sets the value of the lunch property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setLunch(TypeTrinary value) {
                this.lunch = value;
            }

            /**
             * Gets the value of the dinner property.
             * 
             * @return
             *     possible object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public TypeTrinary getDinner() {
                return dinner;
            }

            /**
             * Sets the value of the dinner property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeTrinary }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setDinner(TypeTrinary value) {
                this.dinner = value;
            }

            /**
             * Generates a String representation of the contents of this type.
             * This is an extension method, produced by the 'ts' xjc plugin
             * 
             */
            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public String toString() {
                return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public Locator sourceLocation() {
                return locator;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public void setSourceLocation(Locator newLocator) {
                locator = newLocator;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Code" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
            public static class MealPlan
                implements Locatable
            {

                @XmlAttribute(name = "Code")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                protected BigInteger code;
                @XmlLocation
                @XmlTransient
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                protected Locator locator;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                public BigInteger getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                public void setCode(BigInteger value) {
                    this.code = value;
                }

                /**
                 * Generates a String representation of the contents of this type.
                 * This is an extension method, produced by the 'ts' xjc plugin
                 * 
                 */
                @Override
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                public String toString() {
                    return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                public Locator sourceLocation() {
                    return locator;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
                public void setSourceLocation(Locator newLocator) {
                    locator = newLocator;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="99" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capacity"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public static class RoomCapacity
        implements Locatable
    {

        @XmlElement(name = "Capacity")
        @XmlSchemaType(name = "positiveInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected List<BigInteger> capacity;
        @XmlAttribute(name = "IsPackage")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected Boolean isPackage;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the capacity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capacity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapacity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public List<BigInteger> getCapacity() {
            if (capacity == null) {
                capacity = new ArrayList<BigInteger>();
            }
            return this.capacity;
        }

        /**
         * Gets the value of the isPackage property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public Boolean isIsPackage() {
            return isPackage;
        }

        /**
         * Sets the value of the isPackage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setIsPackage(Boolean value) {
            this.isPackage = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
