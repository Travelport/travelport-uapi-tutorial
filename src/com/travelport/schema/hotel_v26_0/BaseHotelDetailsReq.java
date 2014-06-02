
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseReq;
import com.travelport.schema.common_v26_0.PointOfSale;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base request for all hotel details search request..
 * 
 * <p>Java class for BaseHotelDetailsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelDetailsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}HotelProperty"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}HotelDetailsModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}PointOfSale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelDetailsReq", propOrder = {
    "hotelProperty",
    "hotelDetailsModifiers",
    "pointOfSale"
})
@XmlSeeAlso({
    HotelDetailsReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
public class BaseHotelDetailsReq
    extends BaseReq
{

    @XmlElement(name = "HotelProperty", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelDetailsModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HotelDetailsModifiers hotelDetailsModifiers;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected PointOfSale pointOfSale;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelDetailsModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetailsModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public HotelDetailsModifiers getHotelDetailsModifiers() {
        return hotelDetailsModifiers;
    }

    /**
     * Sets the value of the hotelDetailsModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetailsModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setHotelDetailsModifiers(HotelDetailsModifiers value) {
        this.hotelDetailsModifiers = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
