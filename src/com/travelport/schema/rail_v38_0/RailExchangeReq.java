
package com.travelport.schema.rail_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseCreateWithFormOfPaymentReq;
import com.travelport.schema.common_v38_0.HostTokenList;
import com.travelport.schema.common_v38_0.Payment;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseCreateWithFormOfPaymentReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailExchangeSolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}Payment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailFareNoteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}HostTokenList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailAutoSeatAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v38_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="BookingActionType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RefundOption" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railExchangeSolution",
    "payment",
    "railFareNoteList",
    "hostTokenList",
    "railAutoSeatAssignment"
})
@XmlRootElement(name = "RailExchangeReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
public class RailExchangeReq
    extends BaseCreateWithFormOfPaymentReq
{

    @XmlElement(name = "RailExchangeSolution")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailExchangeSolution railExchangeSolution;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected Payment payment;
    @XmlElement(name = "RailFareNoteList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "HostTokenList", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected HostTokenList hostTokenList;
    @XmlElement(name = "RailAutoSeatAssignment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected List<RailAutoSeatAssignment> railAutoSeatAssignment;
    @XmlAttribute(name = "LocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected String locatorCode;
    @XmlAttribute(name = "BookingActionType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected String bookingActionType;
    @XmlAttribute(name = "RefundOption")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected String refundOption;

    /**
     * Gets the value of the railExchangeSolution property.
     * 
     * @return
     *     possible object is
     *     {@link RailExchangeSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailExchangeSolution getRailExchangeSolution() {
        return railExchangeSolution;
    }

    /**
     * Sets the value of the railExchangeSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailExchangeSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailExchangeSolution(RailExchangeSolution value) {
        this.railExchangeSolution = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * List of RailFareNote(s) that is referenced by key in RailFare.
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * Gets the value of the hostTokenList property.
     * 
     * @return
     *     possible object is
     *     {@link HostTokenList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public HostTokenList getHostTokenList() {
        return hostTokenList;
    }

    /**
     * Sets the value of the hostTokenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTokenList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setHostTokenList(HostTokenList value) {
        this.hostTokenList = value;
    }

    /**
     * Gets the value of the railAutoSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railAutoSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailAutoSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAutoSeatAssignment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public List<RailAutoSeatAssignment> getRailAutoSeatAssignment() {
        if (railAutoSeatAssignment == null) {
            railAutoSeatAssignment = new ArrayList<RailAutoSeatAssignment>();
        }
        return this.railAutoSeatAssignment;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the bookingActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String getBookingActionType() {
        return bookingActionType;
    }

    /**
     * Sets the value of the bookingActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setBookingActionType(String value) {
        this.bookingActionType = value;
    }

    /**
     * Gets the value of the refundOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String getRefundOption() {
        return refundOption;
    }

    /**
     * Sets the value of the refundOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRefundOption(String value) {
        this.refundOption = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
