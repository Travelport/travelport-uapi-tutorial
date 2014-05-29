
package com.travelport.schema.hotel_v17_0;

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
import com.travelport.schema.common_v15_0.CorporateDiscountID;
import com.travelport.schema.common_v15_0.LoyaltyCard;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LoyaltyCard" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CorporateDiscountID" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelStay"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}NumberOfChildren" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelBedding" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="RateCategory" type="{http://www.travelport.com/schema/hotel_v17_0}typeHotelRateCategory" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RateRuleDetail" type="{http://www.travelport.com/schema/hotel_v17_0}typeRateRuleDetail" default="None" />
 *       &lt;attribute name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCard",
    "corporateDiscountID",
    "hotelStay",
    "numberOfChildren",
    "hotelBedding",
    "rateCategory"
})
@XmlRootElement(name = "HotelDetailsModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class HotelDetailsModifiers
    implements Locatable
{

    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "HotelStay", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected HotelStay hotelStay;
    @XmlElement(name = "NumberOfChildren")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected NumberOfChildren numberOfChildren;
    @XmlElement(name = "HotelBedding")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "RateCategory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeHotelRateCategory> rateCategory;
    @XmlAttribute(name = "NumberOfAdults")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Integer numberOfAdults;
    @XmlAttribute(name = "RateRuleDetail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeRateRuleDetail rateRuleDetail;
    @XmlAttribute(name = "NumberOfRooms")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Integer numberOfRooms;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String key;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Gets the value of the corporateDiscountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDiscountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDiscountID }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<CorporateDiscountID> getCorporateDiscountID() {
        if (corporateDiscountID == null) {
            corporateDiscountID = new ArrayList<CorporateDiscountID>();
        }
        return this.corporateDiscountID;
    }

    /**
     * Gets the value of the hotelStay property.
     * 
     * @return
     *     possible object is
     *     {@link HotelStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public HotelStay getHotelStay() {
        return hotelStay;
    }

    /**
     * Sets the value of the hotelStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setHotelStay(HotelStay value) {
        this.hotelStay = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfChildren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public NumberOfChildren getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfChildren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setNumberOfChildren(NumberOfChildren value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHotelRateCategory }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeHotelRateCategory> getRateCategory() {
        if (rateCategory == null) {
            rateCategory = new ArrayList<TypeHotelRateCategory>();
        }
        return this.rateCategory;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setNumberOfAdults(Integer value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the rateRuleDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateRuleDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeRateRuleDetail getRateRuleDetail() {
        if (rateRuleDetail == null) {
            return TypeRateRuleDetail.NONE;
        } else {
            return rateRuleDetail;
        }
    }

    /**
     * Sets the value of the rateRuleDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateRuleDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setRateRuleDetail(TypeRateRuleDetail value) {
        this.rateRuleDetail = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public int getNumberOfRooms() {
        if (numberOfRooms == null) {
            return  1;
        } else {
            return numberOfRooms;
        }
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
