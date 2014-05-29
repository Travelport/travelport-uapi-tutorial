
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base response for all hotel details search response.
 * 
 * <p>Java class for BaseHotelDetailsRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHotelDetailsRsp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHotelDetailsRsp", propOrder = {
    "hotelProperty",
    "hotelDetailItem",
    "hotelRateDetail"
})
@XmlSeeAlso({
    HotelUpsellDetailsRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
public class BaseHotelDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "HotelProperty", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelDetailItem")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected List<HotelDetailItem> hotelDetailItem;
    @XmlElement(name = "HotelRateDetail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected List<HotelRateDetail> hotelRateDetail;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public List<HotelDetailItem> getHotelDetailItem() {
        if (hotelDetailItem == null) {
            hotelDetailItem = new ArrayList<HotelDetailItem>();
        }
        return this.hotelDetailItem;
    }

    /**
     * Only returned if number of adults and checkin/checkout given on request Gets the value of the hotelRateDetail property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
