
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseReq"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}MerchandisingDetails"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}OptionalServiceModifiers"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}MerchandisingAvailabilityDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "merchandisingDetails",
    "optionalServiceModifiers",
    "merchandisingAvailabilityDetails"
})
@XmlRootElement(name = "AirMerchandisingDetailsReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
public class AirMerchandisingDetailsReq
    extends BaseReq
{

    @XmlElement(name = "MerchandisingDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    protected MerchandisingDetails merchandisingDetails;
    @XmlElement(name = "OptionalServiceModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    protected OptionalServiceModifiers optionalServiceModifiers;
    @XmlElement(name = "MerchandisingAvailabilityDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    protected MerchandisingAvailabilityDetails merchandisingAvailabilityDetails;

    /**
     * Gets the value of the merchandisingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public MerchandisingDetails getMerchandisingDetails() {
        return merchandisingDetails;
    }

    /**
     * Sets the value of the merchandisingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingDetails(MerchandisingDetails value) {
        this.merchandisingDetails = value;
    }

    /**
     * Gets the value of the optionalServiceModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServiceModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public OptionalServiceModifiers getOptionalServiceModifiers() {
        return optionalServiceModifiers;
    }

    /**
     * Sets the value of the optionalServiceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServiceModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public void setOptionalServiceModifiers(OptionalServiceModifiers value) {
        this.optionalServiceModifiers = value;
    }

    /**
     * Gets the value of the merchandisingAvailabilityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingAvailabilityDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public MerchandisingAvailabilityDetails getMerchandisingAvailabilityDetails() {
        return merchandisingAvailabilityDetails;
    }

    /**
     * Sets the value of the merchandisingAvailabilityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingAvailabilityDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public void setMerchandisingAvailabilityDetails(MerchandisingAvailabilityDetails value) {
        this.merchandisingAvailabilityDetails = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:29:52-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
