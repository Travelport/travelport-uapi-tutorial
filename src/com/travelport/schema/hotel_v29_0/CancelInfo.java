
package com.travelport.schema.hotel_v29_0;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NonRefundableStayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CancelDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CancelPenaltyAmount" type="{http://www.travelport.com/schema/common_v29_0}typeMoney" />
 *       &lt;attribute name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="CancelPenaltyPercent" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="CancelPenaltyPercentAppliesTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CancelInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
public class CancelInfo
    implements Locatable
{

    @XmlAttribute(name = "NonRefundableStayIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean nonRefundableStayIndicator;
    @XmlAttribute(name = "CancelDeadline")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected XMLGregorianCalendar cancelDeadline;
    @XmlAttribute(name = "TaxInclusive")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "FeeInclusive")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean feeInclusive;
    @XmlAttribute(name = "CancelPenaltyAmount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected String cancelPenaltyAmount;
    @XmlAttribute(name = "NumberOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected BigInteger numberOfNights;
    @XmlAttribute(name = "CancelPenaltyPercent")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Float cancelPenaltyPercent;
    @XmlAttribute(name = "CancelPenaltyPercentAppliesTo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected String cancelPenaltyPercentAppliesTo;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the nonRefundableStayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Boolean isNonRefundableStayIndicator() {
        return nonRefundableStayIndicator;
    }

    /**
     * Sets the value of the nonRefundableStayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setNonRefundableStayIndicator(Boolean value) {
        this.nonRefundableStayIndicator = value;
    }

    /**
     * Gets the value of the cancelDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public XMLGregorianCalendar getCancelDeadline() {
        return cancelDeadline;
    }

    /**
     * Sets the value of the cancelDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setCancelDeadline(XMLGregorianCalendar value) {
        this.cancelDeadline = value;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the feeInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Boolean isFeeInclusive() {
        return feeInclusive;
    }

    /**
     * Sets the value of the feeInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setFeeInclusive(Boolean value) {
        this.feeInclusive = value;
    }

    /**
     * Gets the value of the cancelPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public String getCancelPenaltyAmount() {
        return cancelPenaltyAmount;
    }

    /**
     * Sets the value of the cancelPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setCancelPenaltyAmount(String value) {
        this.cancelPenaltyAmount = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public BigInteger getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setNumberOfNights(BigInteger value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the cancelPenaltyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Float getCancelPenaltyPercent() {
        return cancelPenaltyPercent;
    }

    /**
     * Sets the value of the cancelPenaltyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setCancelPenaltyPercent(Float value) {
        this.cancelPenaltyPercent = value;
    }

    /**
     * Gets the value of the cancelPenaltyPercentAppliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public String getCancelPenaltyPercentAppliesTo() {
        return cancelPenaltyPercentAppliesTo;
    }

    /**
     * Sets the value of the cancelPenaltyPercentAppliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setCancelPenaltyPercentAppliesTo(String value) {
        this.cancelPenaltyPercentAppliesTo = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:39-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
