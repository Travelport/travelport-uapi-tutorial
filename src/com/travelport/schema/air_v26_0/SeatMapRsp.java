
package com.travelport.schema.air_v26_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseRsp;
import com.travelport.schema.common_v26_0.CabinClass;
import com.travelport.schema.common_v26_0.HostToken;
import com.travelport.schema.common_v26_0.PaymentRestriction;
import com.travelport.schema.common_v26_0.Remark;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}HostToken" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}CabinClass"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirSegment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}SearchTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}Remark" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}Row" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}PaymentRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GroupSeatPrice" type="{http://www.travelport.com/schema/common_v26_0}typeMoney" />
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
    "cabinClass",
    "airSegment",
    "searchTraveler",
    "remark",
    "row",
    "paymentRestriction"
})
@XmlRootElement(name = "SeatMapRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
public class SeatMapRsp
    extends BaseRsp
{

    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected HostToken hostToken;
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v26_0", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected CabinClass cabinClass;
    @XmlElement(name = "AirSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected TypeBaseAirSegment airSegment;
    @XmlElement(name = "SearchTraveler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected Remark remark;
    @XmlElement(name = "Row", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<Row> row;
    @XmlElement(name = "PaymentRestriction", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<PaymentRestriction> paymentRestriction;
    @XmlAttribute(name = "GroupSeatPrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected String groupSeatPrice;

    /**
     * Provider: ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Provider: ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link TypeBaseAirSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public TypeBaseAirSegment getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseAirSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setAirSegment(TypeBaseAirSegment value) {
        this.airSegment = value;
    }

    /**
     * Provider: ACH,MCH.Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.
     * 
     * @return
     *     possible object is
     *     {@link Remark }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public Remark getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remark }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setRemark(Remark value) {
        this.remark = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,MCH.Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<Row> getRow() {
        if (row == null) {
            row = new ArrayList<Row>();
        }
        return this.row;
    }

    /**
     * Provider: MCH-Information regarding valid payment types, if restrictions apply(supplier specific) Gets the value of the paymentRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRestriction }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<PaymentRestriction> getPaymentRestriction() {
        if (paymentRestriction == null) {
            paymentRestriction = new ArrayList<PaymentRestriction>();
        }
        return this.paymentRestriction;
    }

    /**
     * Gets the value of the groupSeatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String getGroupSeatPrice() {
        return groupSeatPrice;
    }

    /**
     * Sets the value of the groupSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setGroupSeatPrice(String value) {
        this.groupSeatPrice = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
