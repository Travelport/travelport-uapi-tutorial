
package com.travelport.schema.air_v42_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}ExchangeEligibilityInfo"/&gt;
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
    "exchangeEligibilityInfo"
})
@XmlRootElement(name = "AirExchangeEligibilityRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
public class AirExchangeEligibilityRsp
    extends BaseRsp
{

    @XmlElement(name = "ExchangeEligibilityInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    protected ExchangeEligibilityInfo exchangeEligibilityInfo;

    /**
     * Gets the value of the exchangeEligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeEligibilityInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public ExchangeEligibilityInfo getExchangeEligibilityInfo() {
        return exchangeEligibilityInfo;
    }

    /**
     * Sets the value of the exchangeEligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeEligibilityInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public void setExchangeEligibilityInfo(ExchangeEligibilityInfo value) {
        this.exchangeEligibilityInfo = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:51:28-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
