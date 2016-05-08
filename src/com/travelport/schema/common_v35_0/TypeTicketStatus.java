
package com.travelport.schema.common_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTicketStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeTicketStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeTicketStatus {


    /**
     * Code="U" Description="Unticketed"
     * 
     */
    U,

    /**
     * Code="T" Description="Ticketed"
     * 
     */
    T,

    /**
     * Code="V" Description="Voided"
     * 
     */
    V,

    /**
     * Code="R" Description="Refunded"
     * 
     */
    R,

    /**
     * Code="X" Description="eXchanged"
     * 
     */
    X,

    /**
     * Code="Z" Description="Unknown/Archived/Carrier Modified"
     * 
     */
    Z,

    /**
     * Code="N" Description="Unused"
     * 
     */
    N,

    /**
     * Code="S" Description="Used" 
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static TypeTicketStatus fromValue(String v) {
        return valueOf(v);
    }

}
