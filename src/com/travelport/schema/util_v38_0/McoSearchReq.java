
package com.travelport.schema.util_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.Airport;
import com.travelport.schema.common_v38_0.BaseReq;
import com.travelport.schema.common_v38_0.Carrier;
import com.travelport.schema.common_v38_0.Name;
import com.travelport.schema.common_v38_0.TypeTimeRange;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}Carrier" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}Airport" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}TicketNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}McoCreateDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}McoSearchModifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "carrier",
    "airport",
    "ticketNumber",
    "mcoCreateDate",
    "mcoSearchModifiers"
})
@XmlRootElement(name = "McoSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class McoSearchReq
    extends BaseReq
{

    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Name name;
    @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected List<Carrier> carrier;
    @XmlElement(name = "Airport", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected List<Airport> airport;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String ticketNumber;
    @XmlElement(name = "McoCreateDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTimeRange mcoCreateDate;
    @XmlElement(name = "McoSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected McoSearchModifiers mcoSearchModifiers;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carrier }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public List<Carrier> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<Carrier>();
        }
        return this.carrier;
    }

    /**
     * Gets the value of the airport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Airport }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public List<Airport> getAirport() {
        if (airport == null) {
            airport = new ArrayList<Airport>();
        }
        return this.airport;
    }

    /**
     * 
     *                                     The ticket that this MCO was issued
     *                                     in connection with. Could be the
     *                                     ticket that caused the fee, a
     *                                     residual from an exchange, or an
     *                                     airline service fee.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the mcoCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTimeRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public TypeTimeRange getMcoCreateDate() {
        return mcoCreateDate;
    }

    /**
     * Sets the value of the mcoCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTimeRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setMcoCreateDate(TypeTimeRange value) {
        this.mcoCreateDate = value;
    }

    /**
     * Gets the value of the mcoSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link McoSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public McoSearchModifiers getMcoSearchModifiers() {
        return mcoSearchModifiers;
    }

    /**
     * Sets the value of the mcoSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link McoSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setMcoSearchModifiers(McoSearchModifiers value) {
        this.mcoSearchModifiers = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
