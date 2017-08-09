
package com.travelport.schema.hotel_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v42_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelPropertyWithMediaItems" maxOccurs="20"/&gt;
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
    "hotelPropertyWithMediaItems"
})
@XmlRootElement(name = "HotelMediaLinksRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
public class HotelMediaLinksRsp
    extends BaseRsp
{

    @XmlElement(name = "HotelPropertyWithMediaItems", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    protected List<HotelPropertyWithMediaItems> hotelPropertyWithMediaItems;

    /**
     * Gets the value of the hotelPropertyWithMediaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelPropertyWithMediaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelPropertyWithMediaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelPropertyWithMediaItems }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:10-06:00", comment = "JAXB RI v2.2.11")
    public List<HotelPropertyWithMediaItems> getHotelPropertyWithMediaItems() {
        if (hotelPropertyWithMediaItems == null) {
            hotelPropertyWithMediaItems = new ArrayList<HotelPropertyWithMediaItems>();
        }
        return this.hotelPropertyWithMediaItems;
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
