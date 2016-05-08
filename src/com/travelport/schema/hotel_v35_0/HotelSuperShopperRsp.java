
package com.travelport.schema.hotel_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseSearchRsp;
import com.travelport.schema.common_v35_0.VendorLocation;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}VendorLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelSuperShopperResults" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}QuickResponse" minOccurs="0"/&gt;
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
    "vendorLocation",
    "hotelSuperShopperResults",
    "quickResponse"
})
@XmlRootElement(name = "HotelSuperShopperRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
public class HotelSuperShopperRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "HotelSuperShopperResults")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected List<HotelSuperShopperResults> hotelSuperShopperResults;
    @XmlElement(name = "QuickResponse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected QuickResponse quickResponse;

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorLocation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the hotelSuperShopperResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSuperShopperResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSuperShopperResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSuperShopperResults }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public List<HotelSuperShopperResults> getHotelSuperShopperResults() {
        if (hotelSuperShopperResults == null) {
            hotelSuperShopperResults = new ArrayList<HotelSuperShopperResults>();
        }
        return this.hotelSuperShopperResults;
    }

    /**
     * Gets the value of the quickResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QuickResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setQuickResponse(QuickResponse value) {
        this.quickResponse = value;
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
