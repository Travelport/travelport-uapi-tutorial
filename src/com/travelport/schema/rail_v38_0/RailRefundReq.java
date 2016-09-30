
package com.travelport.schema.rail_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseReq;
import com.travelport.schema.common_v38_0.ContinuityCheckOverride;
import com.travelport.schema.common_v38_0.FormOfPayment;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}ContinuityCheckOverride" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}FormOfPayment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v38_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="RefundOption"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Retain"/&gt;
 *             &lt;enumeration value="Refund"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "continuityCheckOverride",
    "formOfPayment"
})
@XmlRootElement(name = "RailRefundReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
public class RailRefundReq
    extends BaseReq
{

    @XmlElement(name = "ContinuityCheckOverride", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected ContinuityCheckOverride continuityCheckOverride;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected FormOfPayment formOfPayment;
    @XmlAttribute(name = "LocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected String locatorCode;
    @XmlAttribute(name = "RefundOption")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    protected String refundOption;

    /**
     * This element will be used if user wants to override segment continuity check.
     * 
     * @return
     *     possible object is
     *     {@link ContinuityCheckOverride }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public ContinuityCheckOverride getContinuityCheckOverride() {
        return continuityCheckOverride;
    }

    /**
     * Sets the value of the continuityCheckOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuityCheckOverride }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setContinuityCheckOverride(ContinuityCheckOverride value) {
        this.continuityCheckOverride = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the refundOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String getRefundOption() {
        return refundOption;
    }

    /**
     * Sets the value of the refundOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public void setRefundOption(String value) {
        this.refundOption = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:33:11-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
