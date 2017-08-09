
package com.travelport.schema.air_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseRsp"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}AirSolutionChangedInfo" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v42_0}ETR" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v42_0}TicketFailureInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v42_0}DetailedBillingInformation" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSolutionChangedInfo",
    "etr",
    "ticketFailureInfo",
    "detailedBillingInformation"
})
@XmlRootElement(name = "AirExchangeTicketingRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
public class AirExchangeTicketingRsp
    extends BaseRsp
{

    @XmlElement(name = "AirSolutionChangedInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected AirSolutionChangedInfo airSolutionChangedInfo;
    @XmlElement(name = "ETR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected ETR etr;
    @XmlElement(name = "TicketFailureInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected TicketFailureInfo ticketFailureInfo;
    @XmlElement(name = "DetailedBillingInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected DetailedBillingInformation detailedBillingInformation;

    /**
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public AirSolutionChangedInfo getAirSolutionChangedInfo() {
        return airSolutionChangedInfo;
    }

    /**
     * Sets the value of the airSolutionChangedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setAirSolutionChangedInfo(AirSolutionChangedInfo value) {
        this.airSolutionChangedInfo = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link ETR }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public ETR getETR() {
        return etr;
    }

    /**
     * Sets the value of the etr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETR }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setETR(ETR value) {
        this.etr = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link TicketFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public TicketFailureInfo getTicketFailureInfo() {
        return ticketFailureInfo;
    }

    /**
     * Sets the value of the ticketFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setTicketFailureInfo(TicketFailureInfo value) {
        this.ticketFailureInfo = value;
    }

    /**
     * Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link DetailedBillingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public DetailedBillingInformation getDetailedBillingInformation() {
        return detailedBillingInformation;
    }

    /**
     * Sets the value of the detailedBillingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedBillingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setDetailedBillingInformation(DetailedBillingInformation value) {
        this.detailedBillingInformation = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
