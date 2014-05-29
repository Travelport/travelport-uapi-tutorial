
package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/air_v18_0}BaseLowFareSearchReq">
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}PageAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LowFareSearchAsynchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
public class LowFareSearchAsynchReq
    extends BaseLowFareSearchReq
{

    @XmlAttribute(name = "MaxResults")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected Integer maxResults;
    @XmlAttribute(name = "StartFromResult")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected BigInteger startFromResult;

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the startFromResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public BigInteger getStartFromResult() {
        return startFromResult;
    }

    /**
     * Sets the value of the startFromResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setStartFromResult(BigInteger value) {
        this.startFromResult = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
