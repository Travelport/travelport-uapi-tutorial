
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxInfo" type="{http://www.travelport.com/schema/common_v32_0}typeTaxInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Commission" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrAmountPercent"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MCOAmount" use="required" type="{http://www.travelport.com/schema/common_v32_0}typeMoney" /&gt;
 *       &lt;attribute name="MCOEquivalentFare" type="{http://www.travelport.com/schema/common_v32_0}typeMoney" /&gt;
 *       &lt;attribute name="MCOTotalAmount" type="{http://www.travelport.com/schema/common_v32_0}typeMoney" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxInfo",
    "commission"
})
@XmlRootElement(name = "MCOPriceData")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
public class MCOPriceData
    implements Locatable
{

    @XmlElement(name = "TaxInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "Commission")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected MCOPriceData.Commission commission;
    @XmlAttribute(name = "MCOAmount", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected String mcoAmount;
    @XmlAttribute(name = "MCOEquivalentFare")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected String mcoEquivalentFare;
    @XmlAttribute(name = "MCOTotalAmount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected String mcoTotalAmount;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public MCOPriceData.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public void setCommission(MCOPriceData.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mcoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public String getMCOAmount() {
        return mcoAmount;
    }

    /**
     * Sets the value of the mcoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public void setMCOAmount(String value) {
        this.mcoAmount = value;
    }

    /**
     * Gets the value of the mcoEquivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public String getMCOEquivalentFare() {
        return mcoEquivalentFare;
    }

    /**
     * Sets the value of the mcoEquivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public void setMCOEquivalentFare(String value) {
        this.mcoEquivalentFare = value;
    }

    /**
     * Gets the value of the mcoTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public String getMCOTotalAmount() {
        return mcoTotalAmount;
    }

    /**
     * Sets the value of the mcoTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public void setMCOTotalAmount(String value) {
        this.mcoTotalAmount = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v32_0}attrAmountPercent"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
    public static class Commission
        implements Locatable
    {

        @XmlAttribute(name = "Amount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        protected String amount;
        @XmlAttribute(name = "Percentage")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        protected String percentage;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
