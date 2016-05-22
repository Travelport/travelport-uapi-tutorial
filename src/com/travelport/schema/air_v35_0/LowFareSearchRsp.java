
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v35_0}AirSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BrandList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CurrencyType" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeCurrency" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brandList"
})
@XmlRootElement(name = "LowFareSearchRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
public class LowFareSearchRsp
    extends AirSearchRsp
{

    @XmlElement(name = "BrandList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected BrandList brandList;
    @XmlAttribute(name = "CurrencyType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String currencyType;

    /**
     * Gets the value of the brandList property.
     * 
     * @return
     *     possible object is
     *     {@link BrandList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public BrandList getBrandList() {
        return brandList;
    }

    /**
     * Sets the value of the brandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setBrandList(BrandList value) {
        this.brandList = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
