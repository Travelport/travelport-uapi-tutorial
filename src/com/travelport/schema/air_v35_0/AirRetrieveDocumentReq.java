
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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirReservationLocatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}TicketNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TCRNumber" type="{http://www.travelport.com/schema/air_v35_0}typeTCRNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v35_0}attrLocatorInfo"/&gt;
 *       &lt;attribute name="ReturnRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReturnPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RetrieveMCO" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    "tcrNumber"
})
@XmlRootElement(name = "AirRetrieveDocumentReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
public class AirRetrieveDocumentReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<String> ticketNumber;
    @XmlElement(name = "TCRNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<String> tcrNumber;
    @XmlAttribute(name = "ReturnRestrictions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnRestrictions;
    @XmlAttribute(name = "ReturnPricing")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnPricing;
    @XmlAttribute(name = "RetrieveMCO")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean retrieveMCO;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String providerLocatorCode;

    /**
     * Provider: 1G,1V,1P,1J.
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
     * Provider: 1G,1V,1P,1J.Gets the value of the ticketNumber property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Gets the value of the tcrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<String> getTCRNumber() {
        if (tcrNumber == null) {
            tcrNumber = new ArrayList<String>();
        }
        return this.tcrNumber;
    }

    /**
     * Gets the value of the returnRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public Boolean isReturnRestrictions() {
        return returnRestrictions;
    }

    /**
     * Sets the value of the returnRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnRestrictions(Boolean value) {
        this.returnRestrictions = value;
    }

    /**
     * Gets the value of the returnPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public Boolean isReturnPricing() {
        return returnPricing;
    }

    /**
     * Sets the value of the returnPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnPricing(Boolean value) {
        this.returnPricing = value;
    }

    /**
     * Gets the value of the retrieveMCO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public Boolean isRetrieveMCO() {
        return retrieveMCO;
    }

    /**
     * Sets the value of the retrieveMCO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setRetrieveMCO(Boolean value) {
        this.retrieveMCO = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
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
