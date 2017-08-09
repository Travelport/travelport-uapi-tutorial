
package com.travelport.schema.util_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
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
 *       &lt;attGroup ref="{http://www.travelport.com/schema/util_v42_0}attrProviderSupplierCapabilities"/&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AgencyCredentials" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Required"/&gt;
 *             &lt;enumeration value="Optional"/&gt;
 *             &lt;enumeration value="Prohibited"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Provisionable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MerchandisingACHAdapter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StaticDataCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MerchandisingACHCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MerchandisingHubCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ContentProvider")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class ContentProvider
    implements Locatable
{

    @XmlAttribute(name = "ProviderCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected String supplierCode;
    @XmlAttribute(name = "AgencyCredentials", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected String agencyCredentials;
    @XmlAttribute(name = "Active", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected boolean active;
    @XmlAttribute(name = "Provisionable", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected boolean provisionable;
    @XmlAttribute(name = "MerchandisingACHAdapter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected String merchandisingACHAdapter;
    @XmlAttribute(name = "StaticDataCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean staticDataCarrier;
    @XmlAttribute(name = "MerchandisingACHCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean merchandisingACHCarrier;
    @XmlAttribute(name = "MerchandisingHubCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean merchandisingHubCarrier;
    @XmlAttribute(name = "BookingRetrieve")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType bookingRetrieve;
    @XmlAttribute(name = "SegmentModify")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType segmentModify;
    @XmlAttribute(name = "OptionalServicesModify")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType optionalServicesModify;
    @XmlAttribute(name = "TravelerInfoModify")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType travelerInfoModify;
    @XmlAttribute(name = "AdditionalPayment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType additionalPayment;
    @XmlAttribute(name = "BookingCancel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType bookingCancel;
    @XmlAttribute(name = "SeatMap")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProviderSupplierCapabilityType seatMap;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the agencyCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String getAgencyCredentials() {
        return agencyCredentials;
    }

    /**
     * Sets the value of the agencyCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setAgencyCredentials(String value) {
        this.agencyCredentials = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the provisionable property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isProvisionable() {
        return provisionable;
    }

    /**
     * Sets the value of the provisionable property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setProvisionable(boolean value) {
        this.provisionable = value;
    }

    /**
     * Gets the value of the merchandisingACHAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String getMerchandisingACHAdapter() {
        return merchandisingACHAdapter;
    }

    /**
     * Sets the value of the merchandisingACHAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingACHAdapter(String value) {
        this.merchandisingACHAdapter = value;
    }

    /**
     * Gets the value of the staticDataCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isStaticDataCarrier() {
        if (staticDataCarrier == null) {
            return false;
        } else {
            return staticDataCarrier;
        }
    }

    /**
     * Sets the value of the staticDataCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setStaticDataCarrier(Boolean value) {
        this.staticDataCarrier = value;
    }

    /**
     * Gets the value of the merchandisingACHCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isMerchandisingACHCarrier() {
        if (merchandisingACHCarrier == null) {
            return false;
        } else {
            return merchandisingACHCarrier;
        }
    }

    /**
     * Sets the value of the merchandisingACHCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingACHCarrier(Boolean value) {
        this.merchandisingACHCarrier = value;
    }

    /**
     * Gets the value of the merchandisingHubCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public boolean isMerchandisingHubCarrier() {
        if (merchandisingHubCarrier == null) {
            return false;
        } else {
            return merchandisingHubCarrier;
        }
    }

    /**
     * Sets the value of the merchandisingHubCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingHubCarrier(Boolean value) {
        this.merchandisingHubCarrier = value;
    }

    /**
     * Gets the value of the bookingRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getBookingRetrieve() {
        if (bookingRetrieve == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return bookingRetrieve;
        }
    }

    /**
     * Sets the value of the bookingRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setBookingRetrieve(TypeProviderSupplierCapabilityType value) {
        this.bookingRetrieve = value;
    }

    /**
     * Gets the value of the segmentModify property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getSegmentModify() {
        if (segmentModify == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return segmentModify;
        }
    }

    /**
     * Sets the value of the segmentModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSegmentModify(TypeProviderSupplierCapabilityType value) {
        this.segmentModify = value;
    }

    /**
     * Gets the value of the optionalServicesModify property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getOptionalServicesModify() {
        if (optionalServicesModify == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return optionalServicesModify;
        }
    }

    /**
     * Sets the value of the optionalServicesModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setOptionalServicesModify(TypeProviderSupplierCapabilityType value) {
        this.optionalServicesModify = value;
    }

    /**
     * Gets the value of the travelerInfoModify property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getTravelerInfoModify() {
        if (travelerInfoModify == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return travelerInfoModify;
        }
    }

    /**
     * Sets the value of the travelerInfoModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setTravelerInfoModify(TypeProviderSupplierCapabilityType value) {
        this.travelerInfoModify = value;
    }

    /**
     * Gets the value of the additionalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getAdditionalPayment() {
        if (additionalPayment == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return additionalPayment;
        }
    }

    /**
     * Sets the value of the additionalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setAdditionalPayment(TypeProviderSupplierCapabilityType value) {
        this.additionalPayment = value;
    }

    /**
     * Gets the value of the bookingCancel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getBookingCancel() {
        if (bookingCancel == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return bookingCancel;
        }
    }

    /**
     * Sets the value of the bookingCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setBookingCancel(TypeProviderSupplierCapabilityType value) {
        this.bookingCancel = value;
    }

    /**
     * Gets the value of the seatMap property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeProviderSupplierCapabilityType getSeatMap() {
        if (seatMap == null) {
            return TypeProviderSupplierCapabilityType.YES;
        } else {
            return seatMap;
        }
    }

    /**
     * Sets the value of the seatMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderSupplierCapabilityType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSeatMap(TypeProviderSupplierCapabilityType value) {
        this.seatMap = value;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
