
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseReq"&gt;
 *       &lt;attribute name="SearchId" use="required" type="{http://www.travelport.com/schema/air_v35_0}typeLowFareSearchId" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeProviderCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RetrieveLowFareSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
public class RetrieveLowFareSearchReq
    extends BaseReq
{

    @XmlAttribute(name = "SearchId", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String searchId;
    @XmlAttribute(name = "ProviderCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderCode(String value) {
        this.providerCode = value;
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
