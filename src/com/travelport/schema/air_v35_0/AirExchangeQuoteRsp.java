
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseRsp;
import com.travelport.schema.common_v35_0.HostToken;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}TicketNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirPricingSolution" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirExchangeBundleTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirExchangeBundle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}HostToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}OptionalServices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareRule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "airPricingSolution",
    "airExchangeBundleTotal",
    "airExchangeBundle",
    "hostToken",
    "optionalServices",
    "fareRule"
})
@XmlRootElement(name = "AirExchangeQuoteRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
public class AirExchangeQuoteRsp
    extends BaseRsp
{

    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> ticketNumber;
    @XmlElement(name = "AirPricingSolution", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirPricingSolution> airPricingSolution;
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
    @XmlElement(name = "FareRule")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<FareRule> fareRule;

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
     * Provider: 1G/1V/1P/1S/1A.Gets the value of the airPricingSolution property.
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
     * Gets the value of the airExchangeBundleTotal property.
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
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P Gets the value of the airExchangeBundle property.
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
     * Encrypted data from the host. Required to send the HostToken from the AirExchangeQuoteRsp in the AirExchangeReq. Providers ACH/1G/1V/1P.Gets the value of the hostToken property.
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
     * Provider: ACH.Gets the value of the fareRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRule }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<FareRule> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<FareRule>();
        }
        return this.fareRule;
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
