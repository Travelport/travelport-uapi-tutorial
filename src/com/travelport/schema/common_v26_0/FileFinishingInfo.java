
package com.travelport.schema.common_v26_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}ShopInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}PolicyInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}AccountInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}AgencyInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}TravelerInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}CustomProfileInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shopInformation",
    "policyInformation",
    "accountInformation",
    "agencyInformation",
    "travelerInformation",
    "customProfileInformation"
})
@XmlRootElement(name = "FileFinishingInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class FileFinishingInfo
    implements Locatable
{

    @XmlElement(name = "ShopInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected ShopInformation shopInformation;
    @XmlElement(name = "PolicyInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<PolicyInformation> policyInformation;
    @XmlElement(name = "AccountInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected AccountInformation accountInformation;
    @XmlElement(name = "AgencyInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected AgencyInformation agencyInformation;
    @XmlElement(name = "TravelerInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TravelerInformation> travelerInformation;
    @XmlElement(name = "CustomProfileInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected CustomProfileInformation customProfileInformation;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the shopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShopInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public ShopInformation getShopInformation() {
        return shopInformation;
    }

    /**
     * Sets the value of the shopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setShopInformation(ShopInformation value) {
        this.shopInformation = value;
    }

    /**
     * Policy Information required for File							Finishing. Would repeat per Policy Type Gets the value of the policyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<PolicyInformation> getPolicyInformation() {
        if (policyInformation == null) {
            policyInformation = new ArrayList<PolicyInformation>();
        }
        return this.policyInformation;
    }

    /**
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAccountInformation(AccountInformation value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the agencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public AgencyInformation getAgencyInformation() {
        return agencyInformation;
    }

    /**
     * Sets the value of the agencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAgencyInformation(AgencyInformation value) {
        this.agencyInformation = value;
    }

    /**
     * Gets the value of the travelerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TravelerInformation> getTravelerInformation() {
        if (travelerInformation == null) {
            travelerInformation = new ArrayList<TravelerInformation>();
        }
        return this.travelerInformation;
    }

    /**
     * Gets the value of the customProfileInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomProfileInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public CustomProfileInformation getCustomProfileInformation() {
        return customProfileInformation;
    }

    /**
     * Sets the value of the customProfileInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomProfileInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setCustomProfileInformation(CustomProfileInformation value) {
        this.customProfileInformation = value;
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
