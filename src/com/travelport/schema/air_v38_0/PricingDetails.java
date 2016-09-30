
package com.travelport.schema.air_v38_0;

import java.math.BigDecimal;
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
import javax.xml.datatype.XMLGregorianCalendar;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v38_0.TypeFormOfRefund;
import com.travelport.schema.common_v38_0.TypeItineraryCode;
import com.travelport.schema.common_v38_0.TypePricingType;
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
 *         &lt;element name="AdvisoryMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaiverText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LowFarePricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="LowFareFound" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PenaltyApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="DiscountApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ItineraryType" type="{http://www.travelport.com/schema/common_v38_0}typeItineraryCode" /&gt;
 *       &lt;attribute name="ValidatingVendorCode" type="{http://www.travelport.com/schema/common_v38_0}typeCarrier" /&gt;
 *       &lt;attribute name="ForTicketingOnDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="LastDateToTicket" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="FormOfRefund" type="{http://www.travelport.com/schema/common_v38_0}typeFormOfRefund" /&gt;
 *       &lt;attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="PricingType" type="{http://www.travelport.com/schema/common_v38_0}typePricingType" /&gt;
 *       &lt;attribute name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="RateOfExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="OriginalTicketCurrency" type="{http://www.travelport.com/schema/common_v38_0}typeCurrency" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "advisoryMessage",
    "endorsementText",
    "waiverText"
})
@XmlRootElement(name = "PricingDetails")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class PricingDetails
    implements Locatable
{

    @XmlElement(name = "AdvisoryMessage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> advisoryMessage;
    @XmlElement(name = "EndorsementText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> endorsementText;
    @XmlElement(name = "WaiverText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String waiverText;
    @XmlAttribute(name = "LowFarePricing")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean lowFarePricing;
    @XmlAttribute(name = "LowFareFound")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean lowFareFound;
    @XmlAttribute(name = "PenaltyApplies")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean penaltyApplies;
    @XmlAttribute(name = "DiscountApplies")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean discountApplies;
    @XmlAttribute(name = "ItineraryType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected TypeItineraryCode itineraryType;
    @XmlAttribute(name = "ValidatingVendorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String validatingVendorCode;
    @XmlAttribute(name = "ForTicketingOnDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar forTicketingOnDate;
    @XmlAttribute(name = "LastDateToTicket")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar lastDateToTicket;
    @XmlAttribute(name = "FormOfRefund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected TypeFormOfRefund formOfRefund;
    @XmlAttribute(name = "AccountCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String accountCode;
    @XmlAttribute(name = "BankersSellingRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected BigDecimal bankersSellingRate;
    @XmlAttribute(name = "PricingType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected TypePricingType pricingType;
    @XmlAttribute(name = "ConversionRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected BigDecimal conversionRate;
    @XmlAttribute(name = "RateOfExchange")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected BigDecimal rateOfExchange;
    @XmlAttribute(name = "OriginalTicketCurrency")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String originalTicketCurrency;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the advisoryMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advisoryMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvisoryMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public List<String> getAdvisoryMessage() {
        if (advisoryMessage == null) {
            advisoryMessage = new ArrayList<String>();
        }
        return this.advisoryMessage;
    }

    /**
     * Gets the value of the endorsementText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public List<String> getEndorsementText() {
        if (endorsementText == null) {
            endorsementText = new ArrayList<String>();
        }
        return this.endorsementText;
    }

    /**
     * Gets the value of the waiverText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getWaiverText() {
        return waiverText;
    }

    /**
     * Sets the value of the waiverText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setWaiverText(String value) {
        this.waiverText = value;
    }

    /**
     * Gets the value of the lowFarePricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public boolean isLowFarePricing() {
        if (lowFarePricing == null) {
            return false;
        } else {
            return lowFarePricing;
        }
    }

    /**
     * Sets the value of the lowFarePricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setLowFarePricing(Boolean value) {
        this.lowFarePricing = value;
    }

    /**
     * Gets the value of the lowFareFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public boolean isLowFareFound() {
        if (lowFareFound == null) {
            return false;
        } else {
            return lowFareFound;
        }
    }

    /**
     * Sets the value of the lowFareFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setLowFareFound(Boolean value) {
        this.lowFareFound = value;
    }

    /**
     * Gets the value of the penaltyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public boolean isPenaltyApplies() {
        if (penaltyApplies == null) {
            return false;
        } else {
            return penaltyApplies;
        }
    }

    /**
     * Sets the value of the penaltyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPenaltyApplies(Boolean value) {
        this.penaltyApplies = value;
    }

    /**
     * Gets the value of the discountApplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public boolean isDiscountApplies() {
        if (discountApplies == null) {
            return false;
        } else {
            return discountApplies;
        }
    }

    /**
     * Sets the value of the discountApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDiscountApplies(Boolean value) {
        this.discountApplies = value;
    }

    /**
     * Gets the value of the itineraryType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeItineraryCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public TypeItineraryCode getItineraryType() {
        return itineraryType;
    }

    /**
     * Sets the value of the itineraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItineraryCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setItineraryType(TypeItineraryCode value) {
        this.itineraryType = value;
    }

    /**
     * Gets the value of the validatingVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getValidatingVendorCode() {
        return validatingVendorCode;
    }

    /**
     * Sets the value of the validatingVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setValidatingVendorCode(String value) {
        this.validatingVendorCode = value;
    }

    /**
     * Gets the value of the forTicketingOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getForTicketingOnDate() {
        return forTicketingOnDate;
    }

    /**
     * Sets the value of the forTicketingOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setForTicketingOnDate(XMLGregorianCalendar value) {
        this.forTicketingOnDate = value;
    }

    /**
     * Gets the value of the lastDateToTicket property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getLastDateToTicket() {
        return lastDateToTicket;
    }

    /**
     * Sets the value of the lastDateToTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setLastDateToTicket(XMLGregorianCalendar value) {
        this.lastDateToTicket = value;
    }

    /**
     * Gets the value of the formOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFormOfRefund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public TypeFormOfRefund getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFormOfRefund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setFormOfRefund(TypeFormOfRefund value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the bankersSellingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public BigDecimal getBankersSellingRate() {
        return bankersSellingRate;
    }

    /**
     * Sets the value of the bankersSellingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setBankersSellingRate(BigDecimal value) {
        this.bankersSellingRate = value;
    }

    /**
     * Gets the value of the pricingType property.
     * 
     * @return
     *     possible object is
     *     {@link TypePricingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public TypePricingType getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePricingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPricingType(TypePricingType value) {
        this.pricingType = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the rateOfExchange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public BigDecimal getRateOfExchange() {
        return rateOfExchange;
    }

    /**
     * Sets the value of the rateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setRateOfExchange(BigDecimal value) {
        this.rateOfExchange = value;
    }

    /**
     * Gets the value of the originalTicketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getOriginalTicketCurrency() {
        return originalTicketCurrency;
    }

    /**
     * Sets the value of the originalTicketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setOriginalTicketCurrency(String value) {
        this.originalTicketCurrency = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
