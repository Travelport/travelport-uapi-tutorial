
package com.travelport.schema.air_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.AgencySellInfo;
import com.travelport.schema.common_v42_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}AgencySellInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}AirSolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}HostReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}OfferAvailabilityModifiers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}MerchandisingPricingModifiers" minOccurs="0"/&gt;
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
    "agencySellInfo",
    "airSolution",
    "hostReservation",
    "offerAvailabilityModifiers",
    "merchandisingPricingModifiers"
})
@XmlRootElement(name = "AirMerchandisingOfferAvailabilityReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
public class AirMerchandisingOfferAvailabilityReq
    extends BaseReq
{

    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSolution")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected AirSolution airSolution;
    @XmlElement(name = "HostReservation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected List<HostReservation> hostReservation;
    @XmlElement(name = "OfferAvailabilityModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected List<OfferAvailabilityModifiers> offerAvailabilityModifiers;
    @XmlElement(name = "MerchandisingPricingModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected MerchandisingPricingModifiers merchandisingPricingModifiers;

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public AirSolution getAirSolution() {
        return airSolution;
    }

    /**
     * Sets the value of the airSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolution }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setAirSolution(AirSolution value) {
        this.airSolution = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the hostReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public List<HostReservation> getHostReservation() {
        if (hostReservation == null) {
            hostReservation = new ArrayList<HostReservation>();
        }
        return this.hostReservation;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the offerAvailabilityModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerAvailabilityModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferAvailabilityModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAvailabilityModifiers }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public List<OfferAvailabilityModifiers> getOfferAvailabilityModifiers() {
        if (offerAvailabilityModifiers == null) {
            offerAvailabilityModifiers = new ArrayList<OfferAvailabilityModifiers>();
        }
        return this.offerAvailabilityModifiers;
    }

    /**
     * Used to provide additional pricing modifiers. Provider:ACH.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public MerchandisingPricingModifiers getMerchandisingPricingModifiers() {
        return merchandisingPricingModifiers;
    }

    /**
     * Sets the value of the merchandisingPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingPricingModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingPricingModifiers(MerchandisingPricingModifiers value) {
        this.merchandisingPricingModifiers = value;
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
