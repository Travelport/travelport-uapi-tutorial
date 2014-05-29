
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseSearchRsp;
import com.travelport.schema.common_v15_0.TypeDistance;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Availability Search response
 * 
 * <p>Java class for BaseAvailabilitySearchRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAvailabilitySearchRsp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseSearchRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FlightDetailsList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegmentList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareInfoList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRemarkList" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirItinerarySolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}HostTokenList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}APISRequirementsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DistanceUnits" type="{http://www.travelport.com/schema/common_v15_0}typeDistance" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAvailabilitySearchRsp", propOrder = {
    "flightDetailsList",
    "airSegmentList",
    "fareInfoList",
    "fareRemarkList",
    "airItinerarySolution",
    "hostTokenList",
    "apisRequirementsList"
})
@XmlSeeAlso({
    AvailabilitySearchRsp.class,
    AirSearchRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
public class BaseAvailabilitySearchRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "FlightDetailsList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected FlightDetailsList flightDetailsList;
    @XmlElement(name = "AirSegmentList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected AirSegmentList airSegmentList;
    @XmlElement(name = "FareInfoList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected FareInfoList fareInfoList;
    @XmlElement(name = "FareRemarkList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected FareRemarkList fareRemarkList;
    @XmlElement(name = "AirItinerarySolution")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirItinerarySolution> airItinerarySolution;
    @XmlElement(name = "HostTokenList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<HostTokenList> hostTokenList;
    @XmlElement(name = "APISRequirementsList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected APISRequirementsList apisRequirementsList;
    @XmlAttribute(name = "DistanceUnits")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected TypeDistance distanceUnits;

    /**
     * Gets the value of the flightDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public FlightDetailsList getFlightDetailsList() {
        return flightDetailsList;
    }

    /**
     * Sets the value of the flightDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setFlightDetailsList(FlightDetailsList value) {
        this.flightDetailsList = value;
    }

    /**
     * Gets the value of the airSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public AirSegmentList getAirSegmentList() {
        return airSegmentList;
    }

    /**
     * Sets the value of the airSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setAirSegmentList(AirSegmentList value) {
        this.airSegmentList = value;
    }

    /**
     * Gets the value of the fareInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link FareInfoList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public FareInfoList getFareInfoList() {
        return fareInfoList;
    }

    /**
     * Sets the value of the fareInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setFareInfoList(FareInfoList value) {
        this.fareInfoList = value;
    }

    /**
     * Gets the value of the fareRemarkList property.
     * 
     * @return
     *     possible object is
     *     {@link FareRemarkList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public FareRemarkList getFareRemarkList() {
        return fareRemarkList;
    }

    /**
     * Sets the value of the fareRemarkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRemarkList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setFareRemarkList(FareRemarkList value) {
        this.fareRemarkList = value;
    }

    /**
     * Gets the value of the airItinerarySolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerarySolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItinerarySolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItinerarySolution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<AirItinerarySolution> getAirItinerarySolution() {
        if (airItinerarySolution == null) {
            airItinerarySolution = new ArrayList<AirItinerarySolution>();
        }
        return this.airItinerarySolution;
    }

    /**
     * Gets the value of the hostTokenList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostTokenList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostTokenList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostTokenList }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<HostTokenList> getHostTokenList() {
        if (hostTokenList == null) {
            hostTokenList = new ArrayList<HostTokenList>();
        }
        return this.hostTokenList;
    }

    /**
     * Gets the value of the apisRequirementsList property.
     * 
     * @return
     *     possible object is
     *     {@link APISRequirementsList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public APISRequirementsList getAPISRequirementsList() {
        return apisRequirementsList;
    }

    /**
     * Sets the value of the apisRequirementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRequirementsList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setAPISRequirementsList(APISRequirementsList value) {
        this.apisRequirementsList = value;
    }

    /**
     * Gets the value of the distanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public TypeDistance getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the distanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setDistanceUnits(TypeDistance value) {
        this.distanceUnits = value;
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
