
package com.travelport.schema.hotel_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v29_0.MediaItem;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * Returns Hotel rate details for requested hotel property.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v29_0}HotelProperty"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v29_0}HotelDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v29_0}HotelRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}MediaItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v29_0}GuestReviews" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v29_0}HotelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelProperty",
    "hotelDetailItem",
    "hotelRateDetail",
    "mediaItem",
    "guestReviews",
    "hotelType"
})
@XmlRootElement(name = "RequestedHotelDetails")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
public class RequestedHotelDetails
    implements Locatable
{

    @XmlElement(name = "HotelProperty", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelDetailItem")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected List<HotelDetailItem> hotelDetailItem;
    @XmlElement(name = "HotelRateDetail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected List<HotelRateDetail> hotelRateDetail;
    @XmlElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v29_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected List<MediaItem> mediaItem;
    @XmlElement(name = "GuestReviews")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected GuestReviews guestReviews;
    @XmlElement(name = "HotelType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected HotelType hotelType;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailItem }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public List<HotelDetailItem> getHotelDetailItem() {
        if (hotelDetailItem == null) {
            hotelDetailItem = new ArrayList<HotelDetailItem>();
        }
        return this.hotelDetailItem;
    }

    /**
     * Returns hotel rate details during the stay if rates are available for requested property Gets the value of the hotelRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateDetail }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Gets the value of the mediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItem }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public List<MediaItem> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<MediaItem>();
        }
        return this.mediaItem;
    }

    /**
     * Gets the value of the guestReviews property.
     * 
     * @return
     *     possible object is
     *     {@link GuestReviews }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public GuestReviews getGuestReviews() {
        return guestReviews;
    }

    /**
     * Sets the value of the guestReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestReviews }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setGuestReviews(GuestReviews value) {
        this.guestReviews = value;
    }

    /**
     * Supported Providers:1G/1V/1P/1J.
     * 
     * @return
     *     possible object is
     *     {@link HotelType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public HotelType getHotelType() {
        return hotelType;
    }

    /**
     * Sets the value of the hotelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setHotelType(HotelType value) {
        this.hotelType = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
