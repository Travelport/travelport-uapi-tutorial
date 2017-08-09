
package com.travelport.schema.common_v32_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for typeProviderReservationSpecificInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeProviderReservationSpecificInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}OperatedBy" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v32_0}ProviderReservationInfoRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProviderReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeProviderReservationSpecificInfo", propOrder = {
    "operatedBy",
    "providerReservationInfoRef"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public class TypeProviderReservationSpecificInfo
    implements Locatable
{

    @XmlElement(name = "OperatedBy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<OperatedBy> operatedBy;
    @XmlElement(name = "ProviderReservationInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected ProviderReservationInfoRef providerReservationInfoRef;
    @XmlAttribute(name = "ProviderReservationLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean providerReservationLevel;
    @XmlAttribute(name = "ReservationLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean reservationLevel;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Cross accrual carrier info Gets the value of the operatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatedBy }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public List<OperatedBy> getOperatedBy() {
        if (operatedBy == null) {
            operatedBy = new ArrayList<OperatedBy>();
        }
        return this.operatedBy;
    }

    /**
     * Tagging provider reservation info with LoyaltyCard.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public ProviderReservationInfoRef getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationInfoRef(ProviderReservationInfoRef value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the providerReservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationLevel(Boolean value) {
        this.providerReservationLevel = value;
    }

    /**
     * Gets the value of the reservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isReservationLevel() {
        return reservationLevel;
    }

    /**
     * Sets the value of the reservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setReservationLevel(Boolean value) {
        this.reservationLevel = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
