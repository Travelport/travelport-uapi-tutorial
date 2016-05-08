
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BaseAirPriceRsp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAirPriceRsp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirItinerary"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirPriceResult" maxOccurs="16"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirPriceRsp", propOrder = {
    "airItinerary",
    "airPriceResult"
})
@XmlSeeAlso({
    AirUpsellSearchRsp.class,
    AirPriceRsp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
public class BaseAirPriceRsp
    extends BaseRsp
{

    @XmlElement(name = "AirItinerary", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected AirItinerary airItinerary;
    @XmlElement(name = "AirPriceResult", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected List<AirPriceResult> airPriceResult;

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItinerary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setAirItinerary(AirItinerary value) {
        this.airItinerary = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the airPriceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPriceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPriceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPriceResult }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public List<AirPriceResult> getAirPriceResult() {
        if (airPriceResult == null) {
            airPriceResult = new ArrayList<AirPriceResult>();
        }
        return this.airPriceResult;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
