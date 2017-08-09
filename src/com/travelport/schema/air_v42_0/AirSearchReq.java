
package com.travelport.schema.air_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.BaseSearchReq;
import com.travelport.schema.common_v42_0.PointOfCommencement;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base Request for Air Search
 * 
 * <p>Java class for AirSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSearchReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}PointOfCommencement" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v42_0}SearchAirLeg" maxOccurs="16"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v42_0}SearchSpecificAirSegment" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}AirSearchModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}JourneyData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchReq", propOrder = {
    "pointOfCommencement",
    "searchAirLeg",
    "searchSpecificAirSegment",
    "airSearchModifiers",
    "journeyData"
})
@XmlSeeAlso({
    AvailabilitySearchReq.class,
    ScheduleSearchReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
public class AirSearchReq
    extends BaseSearchReq
{

    @XmlElement(name = "PointOfCommencement", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected PointOfCommencement pointOfCommencement;
    @XmlElement(name = "SearchAirLeg")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected List<SearchAirLeg> searchAirLeg;
    @XmlElement(name = "SearchSpecificAirSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected List<SearchSpecificAirSegment> searchSpecificAirSegment;
    @XmlElement(name = "AirSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected AirSearchModifiers airSearchModifiers;
    @XmlElement(name = "JourneyData")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected JourneyData journeyData;

    /**
     * Gets the value of the pointOfCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfCommencement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public PointOfCommencement getPointOfCommencement() {
        return pointOfCommencement;
    }

    /**
     * Sets the value of the pointOfCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfCommencement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setPointOfCommencement(PointOfCommencement value) {
        this.pointOfCommencement = value;
    }

    /**
     * Gets the value of the searchAirLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAirLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAirLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAirLeg }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public List<SearchAirLeg> getSearchAirLeg() {
        if (searchAirLeg == null) {
            searchAirLeg = new ArrayList<SearchAirLeg>();
        }
        return this.searchAirLeg;
    }

    /**
     * Gets the value of the searchSpecificAirSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchSpecificAirSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchSpecificAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchSpecificAirSegment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public List<SearchSpecificAirSegment> getSearchSpecificAirSegment() {
        if (searchSpecificAirSegment == null) {
            searchSpecificAirSegment = new ArrayList<SearchSpecificAirSegment>();
        }
        return this.searchSpecificAirSegment;
    }

    /**
     * Gets the value of the airSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public AirSearchModifiers getAirSearchModifiers() {
        return airSearchModifiers;
    }

    /**
     * Sets the value of the airSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setAirSearchModifiers(AirSearchModifiers value) {
        this.airSearchModifiers = value;
    }

    /**
     * Gets the value of the journeyData property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public JourneyData getJourneyData() {
        return journeyData;
    }

    /**
     * Sets the value of the journeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setJourneyData(JourneyData value) {
        this.journeyData = value;
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
