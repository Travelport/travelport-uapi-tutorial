
package com.travelport.schema.hotel_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v35_0.BaseReq;
import com.travelport.schema.common_v35_0.Keyword;
import com.travelport.schema.common_v35_0.PermittedProviders;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}Keyword" maxOccurs="15" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}PermittedProviders" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelChain" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeHotelChainCode" /&gt;
 *       &lt;attribute name="HotelCode" type="{http://www.travelport.com/schema/common_v35_0}typeHotelCode" /&gt;
 *       &lt;attribute name="CheckinDate" type="{http://www.travelport.com/schema/hotel_v35_0}typeDate" /&gt;
 *       &lt;attribute name="ReturnKeywordList" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyword",
    "permittedProviders"
})
@XmlRootElement(name = "HotelKeywordReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
public class HotelKeywordReq
    extends BaseReq
{

    @XmlElement(name = "Keyword", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected List<Keyword> keyword;
    @XmlElement(name = "PermittedProviders", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected PermittedProviders permittedProviders;
    @XmlAttribute(name = "HotelChain", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected String hotelChain;
    @XmlAttribute(name = "HotelCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected String hotelCode;
    @XmlAttribute(name = "CheckinDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar checkinDate;
    @XmlAttribute(name = "ReturnKeywordList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnKeywordList;

    /**
     * Used to request specific keyword details.Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public List<Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<Keyword>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the permittedProviders property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedProviders }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public PermittedProviders getPermittedProviders() {
        return permittedProviders;
    }

    /**
     * Sets the value of the permittedProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedProviders }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setPermittedProviders(PermittedProviders value) {
        this.permittedProviders = value;
    }

    /**
     * Gets the value of the hotelChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public String getHotelChain() {
        return hotelChain;
    }

    /**
     * Sets the value of the hotelChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setHotelChain(String value) {
        this.hotelChain = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the checkinDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getCheckinDate() {
        return checkinDate;
    }

    /**
     * Sets the value of the checkinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setCheckinDate(XMLGregorianCalendar value) {
        this.checkinDate = value;
    }

    /**
     * Gets the value of the returnKeywordList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public Boolean isReturnKeywordList() {
        return returnKeywordList;
    }

    /**
     * Sets the value of the returnKeywordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setReturnKeywordList(Boolean value) {
        this.returnKeywordList = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
