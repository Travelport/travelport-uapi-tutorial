
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseSearchReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}HotelLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}HotelSearchModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}HotelStay"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v26_0}QuickResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelLocation",
    "hotelSearchModifiers",
    "hotelStay",
    "quickResponse"
})
@XmlRootElement(name = "HotelSuperShopperReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
public class HotelSuperShopperReq
    extends BaseSearchReq
{

    @XmlElement(name = "HotelLocation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HotelLocation hotelLocation;
    @XmlElement(name = "HotelSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HotelSearchModifiers hotelSearchModifiers;
    @XmlElement(name = "HotelStay", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HotelStay hotelStay;
    @XmlElement(name = "QuickResponse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected QuickResponse quickResponse;

    /**
     * Gets the value of the hotelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public HotelLocation getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the value of the hotelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setHotelLocation(HotelLocation value) {
        this.hotelLocation = value;
    }

    /**
     * Gets the value of the hotelSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the quickResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QuickResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public QuickResponse getQuickResponse() {
        return quickResponse;
    }

    /**
     * Sets the value of the quickResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setQuickResponse(QuickResponse value) {
        this.quickResponse = value;
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
