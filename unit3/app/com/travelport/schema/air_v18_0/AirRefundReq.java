
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReq;
import com.travelport.schema.common_v15_0.Commission;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TCRRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirRefundModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Commission" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airRefundBundle",
    "tcrRefundBundle",
    "airRefundModifiers",
    "commission"
})
@XmlRootElement(name = "AirRefundReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
public class AirRefundReq
    extends BaseReq
{

    @XmlElement(name = "AirRefundBundle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirRefundBundle> airRefundBundle;
    @XmlElement(name = "TCRRefundBundle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<TCRRefundBundle> tcrRefundBundle;
    @XmlElement(name = "AirRefundModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected AirRefundModifiers airRefundModifiers;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    protected List<Commission> commission;

    /**
     * Gets the value of the airRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundBundle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<AirRefundBundle> getAirRefundBundle() {
        if (airRefundBundle == null) {
            airRefundBundle = new ArrayList<AirRefundBundle>();
        }
        return this.airRefundBundle;
    }

    /**
     * Gets the value of the tcrRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRRefundBundle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<TCRRefundBundle> getTCRRefundBundle() {
        if (tcrRefundBundle == null) {
            tcrRefundBundle = new ArrayList<TCRRefundBundle>();
        }
        return this.tcrRefundBundle;
    }

    /**
     * Gets the value of the airRefundModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirRefundModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public AirRefundModifiers getAirRefundModifiers() {
        return airRefundModifiers;
    }

    /**
     * Sets the value of the airRefundModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public void setAirRefundModifiers(AirRefundModifiers value) {
        this.airRefundModifiers = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T10:42:45+02:00", comments = "JAXB RI v2.2.5")
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<Commission>();
        }
        return this.commission;
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
