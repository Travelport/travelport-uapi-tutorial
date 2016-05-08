
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirReservationLocatorCode"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}TicketNumber"/&gt;
 *         &lt;element name="TicketingModifiersRef" type="{http://www.travelport.com/schema/air_v35_0}typeTicketingModifiersRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}WaiverCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}DetailedBillingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirTicketingModifiers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "ticketNumber",
    "ticketingModifiersRef",
    "waiverCode",
    "detailedBillingInformation",
    "airTicketingModifiers"
})
@XmlRootElement(name = "AirExchangeTicketingReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
public class AirExchangeTicketingReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationLocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v35_0", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String ticketNumber;
    @XmlElement(name = "TicketingModifiersRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<TypeTicketingModifiersRef> ticketingModifiersRef;
    @XmlElement(name = "WaiverCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected WaiverCode waiverCode;
    @XmlElement(name = "DetailedBillingInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<DetailedBillingInformation> detailedBillingInformation;
    @XmlElement(name = "AirTicketingModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<AirTicketingModifiers> airTicketingModifiers;
    @XmlAttribute(name = "BulkTicket")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean bulkTicket;

    /**
     * Identifies the PNR to ticket. Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Ticket number to reissue. Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketingModifiersRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiersRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketingModifiersRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<TypeTicketingModifiersRef> getTicketingModifiersRef() {
        if (ticketingModifiersRef == null) {
            ticketingModifiersRef = new ArrayList<TypeTicketingModifiersRef>();
        }
        return this.ticketingModifiersRef;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Providers 1G, 1V, 1P.Gets the value of the detailedBillingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedBillingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedBillingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedBillingInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<DetailedBillingInformation> getDetailedBillingInformation() {
        if (detailedBillingInformation == null) {
            detailedBillingInformation = new ArrayList<DetailedBillingInformation>();
        }
        return this.detailedBillingInformation;
    }

    /**
     * Provider: 1G,1V,1P.Gets the value of the airTicketingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTicketingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingModifiers }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<AirTicketingModifiers> getAirTicketingModifiers() {
        if (airTicketingModifiers == null) {
            airTicketingModifiers = new ArrayList<AirTicketingModifiers>();
        }
        return this.airTicketingModifiers;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
