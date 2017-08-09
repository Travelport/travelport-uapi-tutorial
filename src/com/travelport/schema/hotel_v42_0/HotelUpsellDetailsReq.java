
package com.travelport.schema.hotel_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.BaseReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelProperty"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelRateDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelProperty",
    "hotelRateDetail"
})
@XmlRootElement(name = "HotelUpsellDetailsReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
public class HotelUpsellDetailsReq
    extends BaseReq
{

    @XmlElement(name = "HotelProperty", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelRateDetail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected HotelRateDetail hotelRateDetail;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Only returned if number of adults and   checkin/checkout given on request
     * 
     * @return
     *     possible object is
     *     {@link HotelRateDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public HotelRateDetail getHotelRateDetail() {
        return hotelRateDetail;
    }

    /**
     * Sets the value of the hotelRateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelRateDetail(HotelRateDetail value) {
        this.hotelRateDetail = value;
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
