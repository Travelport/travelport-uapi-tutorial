
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice&gt;
 *         &lt;element name="ProviderReservationLevel"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrCommissionRemark"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassengerTypeLevel" maxOccurs="4"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrCommissionRemark"/&gt;
 *                 &lt;attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v32_0}typePTC" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrElementKeyResults"/&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v32_0}typeRef" /&gt;
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v32_0}typeProviderCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationLevel",
    "passengerTypeLevel"
})
@XmlRootElement(name = "CommissionRemark")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public class CommissionRemark
    implements Locatable
{

    @XmlElement(name = "ProviderReservationLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected CommissionRemark.ProviderReservationLevel providerReservationLevel;
    @XmlElement(name = "PassengerTypeLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<CommissionRemark.PassengerTypeLevel> passengerTypeLevel;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
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
     * Gets the value of the providerReservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public CommissionRemark.ProviderReservationLevel getProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationLevel(CommissionRemark.ProviderReservationLevel value) {
        this.providerReservationLevel = value;
    }

    /**
     * Gets the value of the passengerTypeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRemark.PassengerTypeLevel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<CommissionRemark.PassengerTypeLevel> getPassengerTypeLevel() {
        if (passengerTypeLevel == null) {
            passengerTypeLevel = new ArrayList<CommissionRemark.PassengerTypeLevel>();
        }
        return this.passengerTypeLevel;
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
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
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
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrCommissionRemark"/&gt;
     *       &lt;attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v32_0}typePTC" /&gt;
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
    public static class PassengerTypeLevel
        implements Locatable
    {

        @XmlAttribute(name = "TravelerType", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String travelerType;
        @XmlAttribute(name = "Amount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String percentage;
        @XmlAttribute(name = "CommissionCap")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String commissionCap;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the travelerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String getTravelerType() {
            return travelerType;
        }

        /**
         * Sets the value of the travelerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setTravelerType(String value) {
            this.travelerType = value;
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
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the commissionCap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setCommissionCap(String value) {
            this.commissionCap = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrCommissionRemark"/&gt;
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
    public static class ProviderReservationLevel
        implements Locatable
    {

        @XmlAttribute(name = "Amount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String percentage;
        @XmlAttribute(name = "CommissionCap")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected String commissionCap;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

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
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the commissionCap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
        public void setCommissionCap(String value) {
            this.commissionCap = value;
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
