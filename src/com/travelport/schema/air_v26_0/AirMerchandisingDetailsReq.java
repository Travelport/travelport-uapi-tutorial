
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseReq">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}MerchandisingDetails"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}OptionalServiceModifiers"/>
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
    "merchandisingDetails",
    "optionalServiceModifiers"
})
@XmlRootElement(name = "AirMerchandisingDetailsReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
public class AirMerchandisingDetailsReq
    extends BaseReq
{

    @XmlElement(name = "MerchandisingDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected MerchandisingDetails merchandisingDetails;
    @XmlElement(name = "OptionalServiceModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected OptionalServiceModifiers optionalServiceModifiers;

    /**
     * Gets the value of the merchandisingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setOptionalServiceModifiers(OptionalServiceModifiers value) {
        this.optionalServiceModifiers = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
