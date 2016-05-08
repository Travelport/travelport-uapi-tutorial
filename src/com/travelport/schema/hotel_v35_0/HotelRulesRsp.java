
package com.travelport.schema.hotel_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelRateDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelRuleItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelType" minOccurs="0"/&gt;
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
    "hotelRateDetail",
    "hotelRuleItem",
    "hotelType"
})
@XmlRootElement(name = "HotelRulesRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
public class HotelRulesRsp
    extends BaseRsp
{

    @XmlElement(name = "HotelRateDetail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected List<HotelRateDetail> hotelRateDetail;
    @XmlElement(name = "HotelRuleItem")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected List<HotelRuleItem> hotelRuleItem;
    @XmlElement(name = "HotelType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected HotelType hotelType;

    /**
     * Returns hotels rate and rule details.
     *                                 Gets the value of the hotelRateDetail property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

    /**
     * Return rules and policies related to the
     *                                     property (Like Cancellation, Accepted FOP etc.).
     *                                 Gets the value of the hotelRuleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRuleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRuleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRuleItem }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public List<HotelRuleItem> getHotelRuleItem() {
        if (hotelRuleItem == null) {
            hotelRuleItem = new ArrayList<HotelRuleItem>();
        }
        return this.hotelRuleItem;
    }

    /**
     * Supported Providers:1G/1V/1P/1J.
     * 
     * @return
     *     possible object is
     *     {@link HotelType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setHotelType(HotelType value) {
        this.hotelType = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
