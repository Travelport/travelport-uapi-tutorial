
package com.travelport.schema.util_v42_0;

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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/util_v42_0}AirUpsellSearchCriteria" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/util_v42_0}HotelUpsellSearchCriteria" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/util_v42_0}VehicleUpsellSearchCriteria" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v42_0}UpsellSearchModifier"/&gt;
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
    "airUpsellSearchCriteria",
    "hotelUpsellSearchCriteria",
    "vehicleUpsellSearchCriteria",
    "upsellSearchModifier"
})
@XmlRootElement(name = "UpsellSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class UpsellSearchReq
    extends BaseReq
{

    @XmlElement(name = "AirUpsellSearchCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected AirUpsellSearchCriteria airUpsellSearchCriteria;
    @XmlElement(name = "HotelUpsellSearchCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected HotelUpsellSearchCriteria hotelUpsellSearchCriteria;
    @XmlElement(name = "VehicleUpsellSearchCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleUpsellSearchCriteria vehicleUpsellSearchCriteria;
    @XmlElement(name = "UpsellSearchModifier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected UpsellSearchModifier upsellSearchModifier;

    /**
     * Gets the value of the airUpsellSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public AirUpsellSearchCriteria getAirUpsellSearchCriteria() {
        return airUpsellSearchCriteria;
    }

    /**
     * Sets the value of the airUpsellSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setAirUpsellSearchCriteria(AirUpsellSearchCriteria value) {
        this.airUpsellSearchCriteria = value;
    }

    /**
     * Gets the value of the hotelUpsellSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public HotelUpsellSearchCriteria getHotelUpsellSearchCriteria() {
        return hotelUpsellSearchCriteria;
    }

    /**
     * Sets the value of the hotelUpsellSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelUpsellSearchCriteria(HotelUpsellSearchCriteria value) {
        this.hotelUpsellSearchCriteria = value;
    }

    /**
     * Gets the value of the vehicleUpsellSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public VehicleUpsellSearchCriteria getVehicleUpsellSearchCriteria() {
        return vehicleUpsellSearchCriteria;
    }

    /**
     * Sets the value of the vehicleUpsellSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUpsellSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setVehicleUpsellSearchCriteria(VehicleUpsellSearchCriteria value) {
        this.vehicleUpsellSearchCriteria = value;
    }

    /**
     * Gets the value of the upsellSearchModifier property.
     * 
     * @return
     *     possible object is
     *     {@link UpsellSearchModifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public UpsellSearchModifier getUpsellSearchModifier() {
        return upsellSearchModifier;
    }

    /**
     * Sets the value of the upsellSearchModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsellSearchModifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setUpsellSearchModifier(UpsellSearchModifier value) {
        this.upsellSearchModifier = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
