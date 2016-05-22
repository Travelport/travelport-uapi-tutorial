
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
import com.travelport.schema.common_v35_0.FormOfPayment;
import com.travelport.schema.common_v35_0.FormOfPaymentRef;
import com.travelport.schema.common_v35_0.HostToken;
import com.travelport.schema.common_v35_0.SSRInfo;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}TicketNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}SpecificSeatAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirPricingSolution" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirExchangeModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirExchangeBundleTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirExchangeBundle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}HostToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}FormOfPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}FormOfPaymentRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}SSRInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "specificSeatAssignment",
    "airPricingSolution",
    "airExchangeModifiers",
    "airExchangeBundleTotal",
    "airExchangeBundle",
    "hostToken",
    "optionalServices",
    "formOfPayment",
    "formOfPaymentRef",
    "ssrInfo"
})
@XmlRootElement(name = "AirExchangeReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
public class AirExchangeReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationLocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> ticketNumber;
    @XmlElement(name = "SpecificSeatAssignment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "AirPricingSolution", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirPricingSolution> airPricingSolution;
    @XmlElement(name = "AirExchangeModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected AirExchangeModifiers airExchangeModifiers;
    @XmlElement(name = "AirExchangeBundleTotal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected AirExchangeBundleTotal airExchangeBundleTotal;
    @XmlElement(name = "AirExchangeBundle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirExchangeBundle> airExchangeBundle;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<HostToken> hostToken;
    @XmlElement(name = "OptionalServices")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected OptionalServices optionalServices;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected FormOfPaymentRef formOfPaymentRef;
    @XmlElement(name = "SSRInfo", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<SSRInfo> ssrInfo;
    @XmlAttribute(name = "ReturnReservation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnReservation;

    /**
     * Identifies the PNR locator code. Providers ACH/1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Gets the value of the ticketNumber property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * Identifies the standard seat. Providers ACH/1G/1V/1P Gets the value of the specificSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificSeatAssignment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<SpecificSeatAssignment> getSpecificSeatAssignment() {
        if (specificSeatAssignment == null) {
            specificSeatAssignment = new ArrayList<SpecificSeatAssignment>();
        }
        return this.specificSeatAssignment;
    }

    /**
     * Providers ACH/1G/1V/1P.Gets the value of the airPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<AirPricingSolution>();
        }
        return this.airPricingSolution;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * Provider: 1G/1V/1P/1S/1A.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeBundleTotal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public AirExchangeBundleTotal getAirExchangeBundleTotal() {
        return airExchangeBundleTotal;
    }

    /**
     * Sets the value of the airExchangeBundleTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeBundleTotal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAirExchangeBundleTotal(AirExchangeBundleTotal value) {
        this.airExchangeBundleTotal = value;
    }

    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P.Gets the value of the airExchangeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirExchangeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeBundle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<AirExchangeBundle> getAirExchangeBundle() {
        if (airExchangeBundle == null) {
            airExchangeBundle = new ArrayList<AirExchangeBundle>();
        }
        return this.airExchangeBundle;
    }

    /**
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Form of Payment for any additional collection charges for the Exchange. For ACH, most carriers will only allow refund amounts to the original form of payment. Providers ACH/1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Provider: ACH-Universal Record reference to Form of Payment for any Additional Collection charges or Refund due for the itinerary exchange
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * Providers ACH, 1G, 1V, 1P.Gets the value of the ssrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<SSRInfo> getSSRInfo() {
        if (ssrInfo == null) {
            ssrInfo = new ArrayList<SSRInfo>();
        }
        return this.ssrInfo;
    }

    /**
     * Gets the value of the returnReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnReservation() {
        if (returnReservation == null) {
            return false;
        } else {
            return returnReservation;
        }
    }

    /**
     * Sets the value of the returnReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setReturnReservation(Boolean value) {
        this.returnReservation = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
