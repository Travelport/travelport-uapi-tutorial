
package com.travelport.schema.common_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTicketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeTicketStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
