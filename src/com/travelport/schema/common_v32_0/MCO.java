
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v32_0}MCOInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}FormOfPayment" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}Endorsement" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}MCOExchangeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}MCOFeeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}MCORemark" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}MCOPriceData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}StockControl" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}MCOText" maxOccurs="999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MCOIssued" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MCOIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MCODocNum" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IssueReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v32_0}typeCarrier" /&gt;
 *       &lt;attribute name="TourOperator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v32_0}typeProviderCode" /&gt;
 *       &lt;attribute name="ProviderLocatorCode" type="{http://www.travelport.com/schema/common_v32_0}typeProviderLocatorCode" /&gt;
 *       &lt;attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v32_0}typePCC" /&gt;
 *       &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "endorsement",
    "mcoExchangeInfo",
    "mcoFeeInfo",
    "mcoRemark",
    "mcoPriceData",
    "stockControl",
    "mcoText"
})
@XmlRootElement(name = "MCO")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public class MCO
    extends MCOInformation
{

    @XmlElement(name = "FormOfPayment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "Endorsement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Endorsement endorsement;
    @XmlElement(name = "MCOExchangeInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected MCOExchangeInfo mcoExchangeInfo;
    @XmlElement(name = "MCOFeeInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected MCOFeeInfo mcoFeeInfo;
    @XmlElement(name = "MCORemark")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<MCORemark> mcoRemark;
    @XmlElement(name = "MCOPriceData")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected MCOPriceData mcoPriceData;
    @XmlElement(name = "StockControl")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<StockControl> stockControl;
    @XmlElement(name = "MCOText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<MCOText> mcoText;
    @XmlAttribute(name = "TicketType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String ticketType;
    @XmlAttribute(name = "TicketNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String ticketNumber;
    @XmlAttribute(name = "MCOIssued", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected boolean mcoIssued;
    @XmlAttribute(name = "MCOIssueDate")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar mcoIssueDate;
    @XmlAttribute(name = "MCODocNum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String mcoDocNum;
    @XmlAttribute(name = "IssueReasonCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String issueReasonCode;
    @XmlAttribute(name = "PlatingCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String platingCarrier;
    @XmlAttribute(name = "TourOperator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String tourOperator;
    @XmlAttribute(name = "Location")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String location;
    @XmlAttribute(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String tourCode;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerLocatorCode;
    @XmlAttribute(name = "PseudoCityCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar expiryDate;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link Endorsement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endorsement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setEndorsement(Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the mcoExchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MCOExchangeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public MCOExchangeInfo getMCOExchangeInfo() {
        return mcoExchangeInfo;
    }

    /**
     * Sets the value of the mcoExchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOExchangeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCOExchangeInfo(MCOExchangeInfo value) {
        this.mcoExchangeInfo = value;
    }

    /**
     * Gets the value of the mcoFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MCOFeeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public MCOFeeInfo getMCOFeeInfo() {
        return mcoFeeInfo;
    }

    /**
     * Sets the value of the mcoFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOFeeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCOFeeInfo(MCOFeeInfo value) {
        this.mcoFeeInfo = value;
    }

    /**
     * Gets the value of the mcoRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCORemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCORemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<MCORemark> getMCORemark() {
        if (mcoRemark == null) {
            mcoRemark = new ArrayList<MCORemark>();
        }
        return this.mcoRemark;
    }

    /**
     * Gets the value of the mcoPriceData property.
     * 
     * @return
     *     possible object is
     *     {@link MCOPriceData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public MCOPriceData getMCOPriceData() {
        return mcoPriceData;
    }

    /**
     * Sets the value of the mcoPriceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOPriceData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCOPriceData(MCOPriceData value) {
        this.mcoPriceData = value;
    }

    /**
     * Gets the value of the stockControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockControl }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<StockControl> getStockControl() {
        if (stockControl == null) {
            stockControl = new ArrayList<StockControl>();
        }
        return this.stockControl;
    }

    /**
     * Gets the value of the mcoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCOText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCOText }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<MCOText> getMCOText() {
        if (mcoText == null) {
            mcoText = new ArrayList<MCOText>();
        }
        return this.mcoText;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the mcoIssued property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public boolean isMCOIssued() {
        return mcoIssued;
    }

    /**
     * Sets the value of the mcoIssued property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCOIssued(boolean value) {
        this.mcoIssued = value;
    }

    /**
     * Gets the value of the mcoIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getMCOIssueDate() {
        return mcoIssueDate;
    }

    /**
     * Sets the value of the mcoIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCOIssueDate(XMLGregorianCalendar value) {
        this.mcoIssueDate = value;
    }

    /**
     * Gets the value of the mcoDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getMCODocNum() {
        return mcoDocNum;
    }

    /**
     * Sets the value of the mcoDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setMCODocNum(String value) {
        this.mcoDocNum = value;
    }

    /**
     * Gets the value of the issueReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getIssueReasonCode() {
        return issueReasonCode;
    }

    /**
     * Sets the value of the issueReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setIssueReasonCode(String value) {
        this.issueReasonCode = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the tourOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getTourOperator() {
        return tourOperator;
    }

    /**
     * Sets the value of the tourOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setTourOperator(String value) {
        this.tourOperator = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setTourCode(String value) {
        this.tourCode = value;
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
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
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

}
