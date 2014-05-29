
package com.travelport.schema.air_v18_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegmentRef"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketValidity" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BaggageAllowance" minOccurs="0"/>
 *         &lt;element name="TicketDesignator" type="{http://www.travelport.com/schema/common_v15_0}typeNonBlanks" minOccurs="0"/>
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
    "airSegmentRef",
    "ticketValidity",
    "baggageAllowance",
    "ticketDesignator"
})
@XmlRootElement(name = "SegmentModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class SegmentModifiers
    implements Locatable
{

    @XmlElement(name = "AirSegmentRef", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected AirSegmentRef airSegmentRef;
    @XmlElement(name = "TicketValidity")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TicketValidity ticketValidity;
    @XmlElement(name = "BaggageAllowance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected BaggageAllowance baggageAllowance;
    @XmlElement(name = "TicketDesignator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String ticketDesignator;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the airSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public AirSegmentRef getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setAirSegmentRef(AirSegmentRef value) {
        this.airSegmentRef = value;
    }

    /**
     * To be used to pass the ticket validity dates
     * 						
     * 
     * @return
     *     possible object is
     *     {@link TicketValidity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TicketValidity getTicketValidity() {
        return ticketValidity;
    }

    /**
     * Sets the value of the ticketValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketValidity }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTicketValidity(TicketValidity value) {
        this.ticketValidity = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setBaggageAllowance(BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
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
