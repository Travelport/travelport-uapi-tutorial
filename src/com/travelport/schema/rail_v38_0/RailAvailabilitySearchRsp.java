
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
import com.travelport.schema.common_v38_0.BaseRsp;
import com.travelport.schema.common_v38_0.HostTokenList;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailSegmentList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailJourneyList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailPricingSolution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailFareNoteList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailFareIDList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v38_0}RailFareList" minOccurs="0"/&gt;
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
    "railSegmentList",
    "railJourneyList",
    "railPricingSolution",
    "railFareNoteList",
    "railFareIDList",
    "railFareList",
    "hostTokenList"
})
@XmlRootElement(name = "RailAvailabilitySearchRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
public class RailAvailabilitySearchRsp
    extends BaseRsp
{

    @XmlElement(name = "RailSegmentList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailSegmentList railSegmentList;
    @XmlElement(name = "RailJourneyList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailJourneyList railJourneyList;
    @XmlElement(name = "RailPricingSolution")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected List<RailPricingSolution> railPricingSolution;
    @XmlElement(name = "RailFareNoteList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailFareNoteList railFareNoteList;
    @XmlElement(name = "RailFareIDList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailFareIDList railFareIDList;
    @XmlElement(name = "RailFareList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected RailFareList railFareList;
    @XmlElement(name = "HostTokenList", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected HostTokenList hostTokenList;
    @XmlAttribute(name = "ResponseType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected TypeResponseType responseType;

    /**
     * Gets the value of the railSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * Gets the value of the railJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link RailJourneyList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailJourneyList getRailJourneyList() {
        return railJourneyList;
    }

    /**
     * Sets the value of the railJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailJourneyList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailJourneyList(RailJourneyList value) {
        this.railJourneyList = value;
    }

    /**
     * Gets the value of the railPricingSolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingSolution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public List<RailPricingSolution> getRailPricingSolution() {
        if (railPricingSolution == null) {
            railPricingSolution = new ArrayList<RailPricingSolution>();
        }
        return this.railPricingSolution;
    }

    /**
     * Gets the value of the railFareNoteList property.
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
     * Gets the value of the railFareIDList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareIDList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailFareIDList getRailFareIDList() {
        return railFareIDList;
    }

    /**
     * Sets the value of the railFareIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareIDList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailFareIDList(RailFareIDList value) {
        this.railFareIDList = value;
    }

    /**
     * Gets the value of the railFareList property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public RailFareList getRailFareList() {
        return railFareList;
    }

    /**
     * Sets the value of the railFareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRailFareList(RailFareList value) {
        this.railFareList = value;
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
