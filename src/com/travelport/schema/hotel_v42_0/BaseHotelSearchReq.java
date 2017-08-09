
package com.travelport.schema.hotel_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.BaseSearchReq;
import com.travelport.schema.common_v42_0.PointOfSale;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * 
 *                 Base hotel Search Request
 *             
 * 
 * <p>Java class for BaseHotelSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelSearchReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseSearchReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelSearchLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelSearchModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelStay"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}PointOfSale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v42_0}typePolicyReference" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelSearchReq", propOrder = {
    "hotelSearchLocation",
    "hotelSearchModifiers",
    "hotelStay",
    "pointOfSale"
})
@XmlSeeAlso({
    HotelSearchAvailabilityReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
public class BaseHotelSearchReq
    extends BaseSearchReq
{

    @XmlElement(name = "HotelSearchLocation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelSearchLocation hotelSearchLocation;
    @XmlElement(name = "HotelSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelSearchModifiers hotelSearchModifiers;
    @XmlElement(name = "HotelStay", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelStay hotelStay;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected PointOfSale pointOfSale;
    @XmlAttribute(name = "PolicyReference")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected String policyReference;

    /**
     * Gets the value of the hotelSearchLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public HotelSearchLocation getHotelSearchLocation() {
        return hotelSearchLocation;
    }

    /**
     * Sets the value of the hotelSearchLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelSearchLocation(HotelSearchLocation value) {
        this.hotelSearchLocation = value;
    }

    /**
     * Gets the value of the hotelSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public HotelSearchModifiers getHotelSearchModifiers() {
        return hotelSearchModifiers;
    }

    /**
     * Sets the value of the hotelSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelSearchModifiers(HotelSearchModifiers value) {
        this.hotelSearchModifiers = value;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public String getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
