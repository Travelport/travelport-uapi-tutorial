
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseSearchReq;
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
 * &lt;complexType name="AirSearchReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseSearchReq">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SearchAirLeg" maxOccurs="9"/>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SearchSpecificAirSegment" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSearchModifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchReq", propOrder = {
    "searchAirLeg",
    "searchSpecificAirSegment",
    "airSearchModifiers"
})
@XmlSeeAlso({
    ScheduleSearchReq.class,
    AvailabilitySearchReq.class,
    BaseLowFareSearchReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
public class AirSearchReq
    extends BaseSearchReq
{

    @XmlElement(name = "SearchAirLeg")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<SearchAirLeg> searchAirLeg;
    @XmlElement(name = "SearchSpecificAirSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<SearchSpecificAirSegment> searchSpecificAirSegment;
    @XmlElement(name = "AirSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected AirSearchModifiers airSearchModifiers;

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setAirSearchModifiers(AirSearchModifiers value) {
        this.airSearchModifiers = value;
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
