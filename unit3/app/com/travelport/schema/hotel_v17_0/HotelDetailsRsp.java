
package com.travelport.schema.hotel_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseRsp">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}RequestedHotelDetails"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelAlternateProperties"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestedHotelDetails",
    "hotelAlternateProperties"
})
@XmlRootElement(name = "HotelDetailsRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
public class HotelDetailsRsp
    extends BaseRsp
{

    @XmlElement(name = "RequestedHotelDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected RequestedHotelDetails requestedHotelDetails;
    @XmlElement(name = "HotelAlternateProperties")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected HotelAlternateProperties hotelAlternateProperties;

    /**
     * Gets the value of the requestedHotelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedHotelDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public RequestedHotelDetails getRequestedHotelDetails() {
        return requestedHotelDetails;
    }

    /**
     * Sets the value of the requestedHotelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedHotelDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public void setRequestedHotelDetails(RequestedHotelDetails value) {
        this.requestedHotelDetails = value;
    }

    /**
     * Gets the value of the hotelAlternateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAlternateProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public HotelAlternateProperties getHotelAlternateProperties() {
        return hotelAlternateProperties;
    }

    /**
     * Sets the value of the hotelAlternateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAlternateProperties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public void setHotelAlternateProperties(HotelAlternateProperties value) {
        this.hotelAlternateProperties = value;
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
