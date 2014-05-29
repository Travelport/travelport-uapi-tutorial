
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseSearchRsp;
import com.travelport.schema.common_v15_0.MarketingInformation;
import com.travelport.schema.common_v15_0.VendorLocation;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseSearchRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}VendorLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelSearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}MarketingInformation" maxOccurs="unbounded" minOccurs="0"/>
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
    "vendorLocation",
    "hotelSearchResult",
    "marketingInformation"
})
@XmlRootElement(name = "HotelSearchAvailabilityRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
public class HotelSearchAvailabilityRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected List<VendorLocation> vendorLocation;
    @XmlElement(name = "HotelSearchResult")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected List<HotelSearchResult> hotelSearchResult;
    @XmlElement(name = "MarketingInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected List<MarketingInformation> marketingInformation;

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the hotelSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchResult }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public List<HotelSearchResult> getHotelSearchResult() {
        if (hotelSearchResult == null) {
            hotelSearchResult = new ArrayList<HotelSearchResult>();
        }
        return this.hotelSearchResult;
    }

    /**
     * Gets the value of the marketingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public List<MarketingInformation> getMarketingInformation() {
        if (marketingInformation == null) {
            marketingInformation = new ArrayList<MarketingInformation>();
        }
        return this.marketingInformation;
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
