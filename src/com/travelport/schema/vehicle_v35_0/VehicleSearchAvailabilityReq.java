
package com.travelport.schema.vehicle_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *     &lt;extension base="{http://www.travelport.com/schema/vehicle_v35_0}BaseVehicleSearchAvailabilityReq"&gt;
 *       &lt;attribute name="ReturnMediaLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnAllRates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnApproximateTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnExtraRateInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v35_0}typePolicyReference" /&gt;
 *       &lt;attribute name="ReturnPolicyExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleSearchAvailabilityReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
public class VehicleSearchAvailabilityReq
    extends BaseVehicleSearchAvailabilityReq
{

    @XmlAttribute(name = "ReturnMediaLinks")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnMediaLinks;
    @XmlAttribute(name = "ReturnAllRates")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnAllRates;
    @XmlAttribute(name = "ReturnApproximateTotal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnApproximateTotal;
    @XmlAttribute(name = "ReturnExtraRateInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnExtraRateInfo;
    @XmlAttribute(name = "PolicyReference")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected String policyReference;
    @XmlAttribute(name = "ReturnPolicyExclusion")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnPolicyExclusion;

    /**
     * Gets the value of the returnMediaLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnMediaLinks() {
        if (returnMediaLinks == null) {
            return false;
        } else {
            return returnMediaLinks;
        }
    }

    /**
     * Sets the value of the returnMediaLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnMediaLinks(Boolean value) {
        this.returnMediaLinks = value;
    }

    /**
     * Gets the value of the returnAllRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnAllRates() {
        if (returnAllRates == null) {
            return false;
        } else {
            return returnAllRates;
        }
    }

    /**
     * Sets the value of the returnAllRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnAllRates(Boolean value) {
        this.returnAllRates = value;
    }

    /**
     * Gets the value of the returnApproximateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnApproximateTotal() {
        if (returnApproximateTotal == null) {
            return false;
        } else {
            return returnApproximateTotal;
        }
    }

    /**
     * Sets the value of the returnApproximateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnApproximateTotal(Boolean value) {
        this.returnApproximateTotal = value;
    }

    /**
     * Gets the value of the returnExtraRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnExtraRateInfo() {
        if (returnExtraRateInfo == null) {
            return false;
        } else {
            return returnExtraRateInfo;
        }
    }

    /**
     * Sets the value of the returnExtraRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnExtraRateInfo(Boolean value) {
        this.returnExtraRateInfo = value;
    }

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public String getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

    /**
     * Gets the value of the returnPolicyExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public boolean isReturnPolicyExclusion() {
        if (returnPolicyExclusion == null) {
            return false;
        } else {
            return returnPolicyExclusion;
        }
    }

    /**
     * Sets the value of the returnPolicyExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnPolicyExclusion(Boolean value) {
        this.returnPolicyExclusion = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:25:49-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
