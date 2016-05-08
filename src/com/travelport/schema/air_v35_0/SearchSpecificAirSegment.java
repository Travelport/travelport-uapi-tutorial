
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DepartureTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeCarrier" /&gt;
 *       &lt;attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeFlightNumber" /&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeIATACode" /&gt;
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchSpecificAirSegment")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
public class SearchSpecificAirSegment
    implements Locatable
{

    @XmlAttribute(name = "DepartureTime", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String departureTime;
    @XmlAttribute(name = "Carrier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String carrier;
    @XmlAttribute(name = "FlightNumber", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String flightNumber;
    @XmlAttribute(name = "Origin", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected String destination;
    @XmlAttribute(name = "SegmentIndex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Integer segmentIndex;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
