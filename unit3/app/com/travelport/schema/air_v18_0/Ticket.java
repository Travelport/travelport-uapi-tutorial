
package com.travelport.schema.air_v18_0;

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
import com.travelport.schema.common_v15_0.TypeTicketStatus;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Coupon" maxOccurs="4"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketEndorsement" maxOccurs="6" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TourCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TicketNumber" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeTicketNumber" />
 *       &lt;attribute name="TicketStatus" type="{http://www.travelport.com/schema/common_v15_0}typeTicketStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coupon",
    "ticketEndorsement",
    "tourCode"
})
@XmlRootElement(name = "Ticket")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class Ticket
    implements Locatable
{

    @XmlElement(name = "Coupon", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<Coupon> coupon;
    @XmlElement(name = "TicketEndorsement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TourCode> tourCode;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String key;
    @XmlAttribute(name = "TicketNumber", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String ticketNumber;
    @XmlAttribute(name = "TicketStatus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeTicketStatus ticketStatus;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coupon }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<Coupon> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<Coupon>();
        }
        return this.coupon;
    }

    /**
     * Gets the value of the ticketEndorsement property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourCode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TourCode> getTourCode() {
        if (tourCode == null) {
            tourCode = new ArrayList<TourCode>();
        }
        return this.tourCode;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTicketStatus(TypeTicketStatus value) {
        this.ticketStatus = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
