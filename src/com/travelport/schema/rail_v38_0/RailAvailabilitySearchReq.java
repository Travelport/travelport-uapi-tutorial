
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
import com.travelport.schema.common_v38_0.BaseReq;
import com.travelport.schema.common_v38_0.HostTokenList;
import com.travelport.schema.common_v38_0.SearchPassenger;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}SearchRailLeg" maxOccurs="9"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}SearchPassenger" maxOccurs="18"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailSearchModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailPricingModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}HostTokenList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseType" type="{http://www.travelport.com/schema/rail_v38_0}typeResponseType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchRailLeg",
    "searchPassenger",
    "railSearchModifiers",
    "railPricingModifiers",
    "hostTokenList"
})
@XmlRootElement(name = "RailAvailabilitySearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
public class RailAvailabilitySearchReq
    extends BaseReq
{

    @XmlElement(name = "SearchRailLeg", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected List<SearchRailLeg> searchRailLeg;
    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v38_0", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected List<SearchPassenger> searchPassenger;
    @XmlElement(name = "RailSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailSearchModifiers railSearchModifiers;
    @XmlElement(name = "RailPricingModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailPricingModifiers railPricingModifiers;
    @XmlElement(name = "HostTokenList", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected HostTokenList hostTokenList;
    @XmlAttribute(name = "ResponseType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected TypeResponseType responseType;

    /**
     * Gets the value of the searchRailLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchRailLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchRailLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchRailLeg }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public List<SearchRailLeg> getSearchRailLeg() {
        if (searchRailLeg == null) {
            searchRailLeg = new ArrayList<SearchRailLeg>();
        }
        return this.searchRailLeg;
    }

    /**
     *  Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 						passenger Gets the value of the searchPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<SearchPassenger>();
        }
        return this.searchPassenger;
    }

    /**
     * Gets the value of the railSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RailSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailSearchModifiers getRailSearchModifiers() {
        return railSearchModifiers;
    }

    /**
     * Sets the value of the railSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailSearchModifiers(RailSearchModifiers value) {
        this.railSearchModifiers = value;
    }

    /**
     * Gets the value of the railPricingModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RailPricingModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailPricingModifiers getRailPricingModifiers() {
        return railPricingModifiers;
    }

    /**
     * Sets the value of the railPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailPricingModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailPricingModifiers(RailPricingModifiers value) {
        this.railPricingModifiers = value;
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
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeResponseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public TypeResponseType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeResponseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setResponseType(TypeResponseType value) {
        this.responseType = value;
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
