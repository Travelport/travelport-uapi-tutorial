
package com.travelport.schema.util_v38_0;

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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}FareFamilyCriteria"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}BrandedFareSearchModifier"/&gt;
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
    "fareFamilyCriteria",
    "brandedFareSearchModifier"
})
@XmlRootElement(name = "BrandedFareSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class BrandedFareSearchReq
    extends BaseReq
{

    @XmlElement(name = "FareFamilyCriteria", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected FareFamilyCriteria fareFamilyCriteria;
    @XmlElement(name = "BrandedFareSearchModifier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected BrandedFareSearchModifier brandedFareSearchModifier;

    /**
     * Gets the value of the fareFamilyCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public FareFamilyCriteria getFareFamilyCriteria() {
        return fareFamilyCriteria;
    }

    /**
     * Sets the value of the fareFamilyCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setFareFamilyCriteria(FareFamilyCriteria value) {
        this.fareFamilyCriteria = value;
    }

    /**
     * Gets the value of the brandedFareSearchModifier property.
     * 
     * @return
     *     possible object is
     *     {@link BrandedFareSearchModifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public BrandedFareSearchModifier getBrandedFareSearchModifier() {
        return brandedFareSearchModifier;
    }

    /**
     * Sets the value of the brandedFareSearchModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandedFareSearchModifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setBrandedFareSearchModifier(BrandedFareSearchModifier value) {
        this.brandedFareSearchModifier = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
