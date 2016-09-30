
package com.travelport.schema.hotel_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseAsyncProviderSpecificResponse;
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
 *     &lt;extension base="{http://www.travelport.com/schema/hotel_v38_0}BaseHotelSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v38_0}AsyncProviderSpecificResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SearchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asyncProviderSpecificResponse"
})
@XmlRootElement(name = "HotelSearchAvailabilityAsynchRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
public class HotelSearchAvailabilityAsynchRsp
    extends BaseHotelSearchRsp
{

    @XmlElement(name = "AsyncProviderSpecificResponse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected List<BaseAsyncProviderSpecificResponse> asyncProviderSpecificResponse;
    @XmlAttribute(name = "SearchId", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    protected String searchId;

    /**
     * Identifies pending responses from a specific provider using MoreResults attribute Gets the value of the asyncProviderSpecificResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asyncProviderSpecificResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsyncProviderSpecificResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseAsyncProviderSpecificResponse }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public List<BaseAsyncProviderSpecificResponse> getAsyncProviderSpecificResponse() {
        if (asyncProviderSpecificResponse == null) {
            asyncProviderSpecificResponse = new ArrayList<BaseAsyncProviderSpecificResponse>();
        }
        return this.asyncProviderSpecificResponse;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:32:10-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
