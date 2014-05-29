
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirPolicy" type="{http://www.travelport.com/schema/universal_v16_0}typeSegmentPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RailPolicy" type="{http://www.travelport.com/schema/universal_v16_0}typeSegmentPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelPolicy" type="{http://www.travelport.com/schema/universal_v16_0}typeSegmentPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehiclePolicy" type="{http://www.travelport.com/schema/universal_v16_0}typeSegmentPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airPolicy",
    "railPolicy",
    "hotelPolicy",
    "vehiclePolicy"
})
@XmlRootElement(name = "PolicyInformation")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class PolicyInformation
    implements Locatable
{

    @XmlElement(name = "AirPolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeSegmentPolicy> airPolicy;
    @XmlElement(name = "RailPolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeSegmentPolicy> railPolicy;
    @XmlElement(name = "HotelPolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeSegmentPolicy> hotelPolicy;
    @XmlElement(name = "VehiclePolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeSegmentPolicy> vehiclePolicy;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String bookingTravelerRef;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the airPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentPolicy }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeSegmentPolicy> getAirPolicy() {
        if (airPolicy == null) {
            airPolicy = new ArrayList<TypeSegmentPolicy>();
        }
        return this.airPolicy;
    }

    /**
     * Gets the value of the railPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentPolicy }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeSegmentPolicy> getRailPolicy() {
        if (railPolicy == null) {
            railPolicy = new ArrayList<TypeSegmentPolicy>();
        }
        return this.railPolicy;
    }

    /**
     * Gets the value of the hotelPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentPolicy }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeSegmentPolicy> getHotelPolicy() {
        if (hotelPolicy == null) {
            hotelPolicy = new ArrayList<TypeSegmentPolicy>();
        }
        return this.hotelPolicy;
    }

    /**
     * Gets the value of the vehiclePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiclePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiclePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSegmentPolicy }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeSegmentPolicy> getVehiclePolicy() {
        if (vehiclePolicy == null) {
            vehiclePolicy = new ArrayList<TypeSegmentPolicy>();
        }
        return this.vehiclePolicy;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
