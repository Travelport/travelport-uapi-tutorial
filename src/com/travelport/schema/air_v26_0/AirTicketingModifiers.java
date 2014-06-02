
package com.travelport.schema.air_v26_0;

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
import com.travelport.schema.common_v26_0.Commission;
import com.travelport.schema.common_v26_0.CreditCardAuth;
import com.travelport.schema.common_v26_0.FormOfPayment;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}DocumentModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirPricingInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}Commission" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}FormOfPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}CreditCardAuth" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v26_0}typeCarrier" />
 *       &lt;attribute name="TicketedFareOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SuppressTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentModifiers",
    "airPricingInfoRef",
    "tourCode",
    "ticketEndorsement",
    "commission",
    "formOfPayment",
    "creditCardAuth"
})
@XmlRootElement(name = "AirTicketingModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class AirTicketingModifiers
    implements Locatable
{

    @XmlElement(name = "DocumentModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected DocumentModifiers documentModifiers;
    @XmlElement(name = "AirPricingInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    @XmlElement(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TourCode tourCode;
    @XmlElement(name = "TicketEndorsement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Commission commission;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected CreditCardAuth creditCardAuth;
    @XmlAttribute(name = "PlatingCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String platingCarrier;
    @XmlAttribute(name = "TicketedFareOverride")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean ticketedFareOverride;
    @XmlAttribute(name = "SuppressTaxAndFee")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean suppressTaxAndFee;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the documentModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public DocumentModifiers getDocumentModifiers() {
        return documentModifiers;
    }

    /**
     * Sets the value of the documentModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setDocumentModifiers(DocumentModifiers value) {
        this.documentModifiers = value;
    }

    /**
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfoRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<AirPricingInfoRef>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Allows an agency to modify the tour code information during ticket issuance. Providers supported: Worldspan and JAL.
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     * 						                     ticketing endorsements in the ticket. Providers supported: Worldspan and JAL.Gets the value of the ticketEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Allows an agency to add the commission
     * 						                     to a new or different commission rate which will be applied at
     * 						                     time of ticketing. The commission Modifier allows the user
     * 						                     specify how the commission change is to applied. Providers supported: Worldspan and JAL.
     * 						                  
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * FormOfPayment information to be used as ticketing modifier at the time of ticketing. Providers supported: Worldspan and JAL.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * CreditCardAuth information to be used as ticketing modifier at the time of ticketing. Providers supported: Worldspan and JAL.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAuth }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public CreditCardAuth getCreditCardAuth() {
        return creditCardAuth;
    }

    /**
     * Sets the value of the creditCardAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAuth }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setCreditCardAuth(CreditCardAuth value) {
        this.creditCardAuth = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the ticketedFareOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public boolean isTicketedFareOverride() {
        if (ticketedFareOverride == null) {
            return false;
        } else {
            return ticketedFareOverride;
        }
    }

    /**
     * Sets the value of the ticketedFareOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTicketedFareOverride(Boolean value) {
        this.ticketedFareOverride = value;
    }

    /**
     * Gets the value of the suppressTaxAndFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public boolean isSuppressTaxAndFee() {
        if (suppressTaxAndFee == null) {
            return false;
        } else {
            return suppressTaxAndFee;
        }
    }

    /**
     * Sets the value of the suppressTaxAndFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSuppressTaxAndFee(Boolean value) {
        this.suppressTaxAndFee = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
