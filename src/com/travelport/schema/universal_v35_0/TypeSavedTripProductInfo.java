
package com.travelport.schema.universal_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v35_0.TypeProduct;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * Information on the product type and its provider
 *             
 * 
 * <p>Java class for typeSavedTripProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSavedTripProductInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ProductType" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeProduct" /&gt;
 *       &lt;attribute name="VendorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSavedTripProductInfo")
@XmlSeeAlso({
    com.travelport.schema.universal_v35_0.SavedTripSearchResult.ProductInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public class TypeSavedTripProductInfo
    implements Locatable
{

    @XmlAttribute(name = "ProductType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected TypeProduct productType;
    @XmlAttribute(name = "VendorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String vendorCode;
    @XmlAttribute(name = "ProviderCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProduct }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public TypeProduct getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProduct }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setProductType(TypeProduct value) {
        this.productType = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
