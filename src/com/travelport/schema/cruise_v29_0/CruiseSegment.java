
package com.travelport.schema.cruise_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.Segment;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}Segment">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/cruise_v29_0}CruiseStay"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}attrOrigDestDepatureInfo"/>
 *       &lt;attribute name="Vendor" type="{http://www.travelport.com/schema/common_v29_0}StringLength1to3" />
 *       &lt;attribute name="VendorName" type="{http://www.travelport.com/schema/common_v29_0}StringLength1to30" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cruiseStay"
})
@XmlRootElement(name = "CruiseSegment")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
public class CruiseSegment
    extends Segment
{

    @XmlElement(name = "CruiseStay", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected CruiseStay cruiseStay;
    @XmlAttribute(name = "Vendor")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String vendor;
    @XmlAttribute(name = "VendorName")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String vendorName;
    @XmlAttribute(name = "Origin", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String arrivalTime;

    /**
     * Gets the value of the cruiseStay property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public CruiseStay getCruiseStay() {
        return cruiseStay;
    }

    /**
     * Sets the value of the cruiseStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setCruiseStay(CruiseStay value) {
        this.cruiseStay = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
