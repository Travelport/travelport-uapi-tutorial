
package com.travelport.schema.hotel_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.HostToken;
import com.travelport.schema.common_v26_0.NextResultReference;
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
 *     &lt;extension base="{http://www.travelport.com/schema/hotel_v26_0}BaseHotelDetailsReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}HostToken" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}NextResultReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnMediaLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReturnGuestReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v26_0}typePolicyReference" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostToken",
    "nextResultReference"
})
@XmlRootElement(name = "HotelDetailsReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
public class HotelDetailsReq
    extends BaseHotelDetailsReq
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected HostToken hostToken;
    @XmlElement(name = "NextResultReference", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected NextResultReference nextResultReference;
    @XmlAttribute(name = "ReturnMediaLinks")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean returnMediaLinks;
    @XmlAttribute(name = "ReturnGuestReviews")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean returnGuestReviews;
    @XmlAttribute(name = "PolicyReference")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    protected String policyReference;

    /**
     * Gets the value of the hostToken property.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Gets the value of the nextResultReference property.
     * 
     * @return
     *     possible object is
     *     {@link NextResultReference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public NextResultReference getNextResultReference() {
        return nextResultReference;
    }

    /**
     * Sets the value of the nextResultReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextResultReference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setNextResultReference(NextResultReference value) {
        this.nextResultReference = value;
    }

    /**
     * Gets the value of the returnMediaLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setReturnMediaLinks(Boolean value) {
        this.returnMediaLinks = value;
    }

    /**
     * Gets the value of the returnGuestReviews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public boolean isReturnGuestReviews() {
        if (returnGuestReviews == null) {
            return false;
        } else {
            return returnGuestReviews;
        }
    }

    /**
     * Sets the value of the returnGuestReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setReturnGuestReviews(Boolean value) {
        this.returnGuestReviews = value;
    }

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:53:17-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
