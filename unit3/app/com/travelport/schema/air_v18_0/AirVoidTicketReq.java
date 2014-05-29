
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirReservationLocatorCode"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}TicketNumber" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CancelAIR" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "ticketNumber"
})
@XmlRootElement(name = "AirVoidTicketReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
public class AirVoidTicketReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationLocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<String> ticketNumber;
    @XmlAttribute(name = "CancelAIR", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected boolean cancelAIR;

    /**
     * Gets the value of the airReservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * All tickets that belong to this PNR must be enumerated here. Voiding only some tickets of a multi-ticket PNR not currently supported.Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Gets the value of the cancelAIR property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public boolean isCancelAIR() {
        return cancelAIR;
    }

    /**
     * Sets the value of the cancelAIR property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setCancelAIR(boolean value) {
        this.cancelAIR = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
