
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * A generic type of fee for those charges which are
 *                incurred by the passenger, but not necessarily shown on tickets
 *             
 * 
 * <p>Java class for typeFeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeFeeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxInfoRef" maxOccurs="999" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrProviderSupplier"/&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="BaseAmount" type="{http://www.travelport.com/schema/common_v32_0}typeMoney" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v32_0}typeMoney" /&gt;
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FeeToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v32_0}typePTC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFeeInfo", propOrder = {
    "taxInfoRef"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public class TypeFeeInfo
    implements Locatable
{

    @XmlElement(name = "TaxInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeFeeInfo.TaxInfoRef> taxInfoRef;
    @XmlAttribute(name = "BaseAmount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String baseAmount;
    @XmlAttribute(name = "Description")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String description;
    @XmlAttribute(name = "SubCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String subCode;
    @XmlAttribute(name = "Key", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlAttribute(name = "Amount", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String amount;
    @XmlAttribute(name = "Code", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String code;
    @XmlAttribute(name = "FeeToken")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String feeToken;
    @XmlAttribute(name = "PaymentRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String paymentRef;
    @XmlAttribute(name = "BookingTravelerRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "PassengerTypeCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String passengerTypeCode;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String supplierCode;
    @XmlAttribute(name = "ElStat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean keyOverride;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the taxInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo.TaxInfoRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeFeeInfo.TaxInfoRef> getTaxInfoRef() {
        if (taxInfoRef == null) {
            taxInfoRef = new ArrayList<TypeFeeInfo.TaxInfoRef>();
        }
        return this.taxInfoRef;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setBaseAmount(String value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the feeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getFeeToken() {
        return feeToken;
    }

    /**
     * Sets the value of the feeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setFeeToken(String value) {
        this.feeToken = value;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public static class TaxInfoRef
        implements Locatable
    {

        @XmlAttribute(name = "Key", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String key;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
