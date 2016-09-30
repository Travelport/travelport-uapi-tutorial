
package com.travelport.schema.util_v38_0;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ArriveStation" use="required" type="{http://www.travelport.com/schema/common_v38_0}typeIATACode" /&gt;
 *       &lt;attribute name="DepartStation" type="{http://www.travelport.com/schema/common_v38_0}typeIATACode" /&gt;
 *       &lt;attribute name="Connection" use="required" type="{http://www.travelport.com/schema/util_v38_0}typeMctConnection" /&gt;
 *       &lt;attribute name="ArriveCarrier" type="{http://www.travelport.com/schema/common_v38_0}typeCarrier" /&gt;
 *       &lt;attribute name="DepartCarrier" type="{http://www.travelport.com/schema/common_v38_0}typeCarrier" /&gt;
 *       &lt;attribute name="ArriveFlightRangeBegin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArriveFlightRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartFlightRangeBegin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartFlightRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArriveEquipment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartEquipment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PreviousStation" type="{http://www.travelport.com/schema/common_v38_0}typeIATACode" /&gt;
 *       &lt;attribute name="NextStation" type="{http://www.travelport.com/schema/common_v38_0}typeIATACode" /&gt;
 *       &lt;attribute name="PreviousCountry" type="{http://www.travelport.com/schema/common_v38_0}typeCountry" /&gt;
 *       &lt;attribute name="NextCountry" type="{http://www.travelport.com/schema/common_v38_0}typeCountry" /&gt;
 *       &lt;attribute name="PreviousState" type="{http://www.travelport.com/schema/common_v38_0}typeState" /&gt;
 *       &lt;attribute name="NextState" type="{http://www.travelport.com/schema/common_v38_0}typeState" /&gt;
 *       &lt;attribute name="ArriveTerminal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DepartTerminal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="DiscontinueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MctException")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class MctException
    implements Locatable
{

    @XmlAttribute(name = "Time", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected int time;
    @XmlAttribute(name = "ArriveStation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveStation;
    @XmlAttribute(name = "DepartStation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departStation;
    @XmlAttribute(name = "Connection", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected TypeMctConnection connection;
    @XmlAttribute(name = "ArriveCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveCarrier;
    @XmlAttribute(name = "DepartCarrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departCarrier;
    @XmlAttribute(name = "ArriveFlightRangeBegin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveFlightRangeBegin;
    @XmlAttribute(name = "ArriveFlightRangeEnd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveFlightRangeEnd;
    @XmlAttribute(name = "DepartFlightRangeBegin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departFlightRangeBegin;
    @XmlAttribute(name = "DepartFlightRangeEnd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departFlightRangeEnd;
    @XmlAttribute(name = "ArriveEquipment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveEquipment;
    @XmlAttribute(name = "DepartEquipment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departEquipment;
    @XmlAttribute(name = "PreviousStation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String previousStation;
    @XmlAttribute(name = "NextStation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String nextStation;
    @XmlAttribute(name = "PreviousCountry")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String previousCountry;
    @XmlAttribute(name = "NextCountry")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String nextCountry;
    @XmlAttribute(name = "PreviousState")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String previousState;
    @XmlAttribute(name = "NextState")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String nextState;
    @XmlAttribute(name = "ArriveTerminal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String arriveTerminal;
    @XmlAttribute(name = "DepartTerminal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected String departTerminal;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "DiscontinueDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar discontinueDate;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the time property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public int getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Gets the value of the arriveStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveStation() {
        return arriveStation;
    }

    /**
     * Sets the value of the arriveStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveStation(String value) {
        this.arriveStation = value;
    }

    /**
     * Gets the value of the departStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartStation() {
        return departStation;
    }

    /**
     * Sets the value of the departStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartStation(String value) {
        this.departStation = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMctConnection }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public TypeMctConnection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMctConnection }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setConnection(TypeMctConnection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the arriveCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveCarrier() {
        return arriveCarrier;
    }

    /**
     * Sets the value of the arriveCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveCarrier(String value) {
        this.arriveCarrier = value;
    }

    /**
     * Gets the value of the departCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartCarrier() {
        return departCarrier;
    }

    /**
     * Sets the value of the departCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartCarrier(String value) {
        this.departCarrier = value;
    }

    /**
     * Gets the value of the arriveFlightRangeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveFlightRangeBegin() {
        return arriveFlightRangeBegin;
    }

    /**
     * Sets the value of the arriveFlightRangeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveFlightRangeBegin(String value) {
        this.arriveFlightRangeBegin = value;
    }

    /**
     * Gets the value of the arriveFlightRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveFlightRangeEnd() {
        return arriveFlightRangeEnd;
    }

    /**
     * Sets the value of the arriveFlightRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveFlightRangeEnd(String value) {
        this.arriveFlightRangeEnd = value;
    }

    /**
     * Gets the value of the departFlightRangeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartFlightRangeBegin() {
        return departFlightRangeBegin;
    }

    /**
     * Sets the value of the departFlightRangeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartFlightRangeBegin(String value) {
        this.departFlightRangeBegin = value;
    }

    /**
     * Gets the value of the departFlightRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartFlightRangeEnd() {
        return departFlightRangeEnd;
    }

    /**
     * Sets the value of the departFlightRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartFlightRangeEnd(String value) {
        this.departFlightRangeEnd = value;
    }

    /**
     * Gets the value of the arriveEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveEquipment() {
        return arriveEquipment;
    }

    /**
     * Sets the value of the arriveEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveEquipment(String value) {
        this.arriveEquipment = value;
    }

    /**
     * Gets the value of the departEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartEquipment() {
        return departEquipment;
    }

    /**
     * Sets the value of the departEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartEquipment(String value) {
        this.departEquipment = value;
    }

    /**
     * Gets the value of the previousStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getPreviousStation() {
        return previousStation;
    }

    /**
     * Sets the value of the previousStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPreviousStation(String value) {
        this.previousStation = value;
    }

    /**
     * Gets the value of the nextStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getNextStation() {
        return nextStation;
    }

    /**
     * Sets the value of the nextStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setNextStation(String value) {
        this.nextStation = value;
    }

    /**
     * Gets the value of the previousCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getPreviousCountry() {
        return previousCountry;
    }

    /**
     * Sets the value of the previousCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPreviousCountry(String value) {
        this.previousCountry = value;
    }

    /**
     * Gets the value of the nextCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getNextCountry() {
        return nextCountry;
    }

    /**
     * Sets the value of the nextCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setNextCountry(String value) {
        this.nextCountry = value;
    }

    /**
     * Gets the value of the previousState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getPreviousState() {
        return previousState;
    }

    /**
     * Sets the value of the previousState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setPreviousState(String value) {
        this.previousState = value;
    }

    /**
     * Gets the value of the nextState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getNextState() {
        return nextState;
    }

    /**
     * Sets the value of the nextState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setNextState(String value) {
        this.nextState = value;
    }

    /**
     * Gets the value of the arriveTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getArriveTerminal() {
        return arriveTerminal;
    }

    /**
     * Sets the value of the arriveTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setArriveTerminal(String value) {
        this.arriveTerminal = value;
    }

    /**
     * Gets the value of the departTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String getDepartTerminal() {
        return departTerminal;
    }

    /**
     * Sets the value of the departTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDepartTerminal(String value) {
        this.departTerminal = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the discontinueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getDiscontinueDate() {
        return discontinueDate;
    }

    /**
     * Sets the value of the discontinueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setDiscontinueDate(XMLGregorianCalendar value) {
        this.discontinueDate = value;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
