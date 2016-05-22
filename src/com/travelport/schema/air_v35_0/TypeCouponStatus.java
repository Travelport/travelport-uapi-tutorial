
package com.travelport.schema.air_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCouponStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCouponStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCouponStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public enum TypeCouponStatus {


    /**
     * Code="A" Status="Airport Controlled".
     *                     
     * 
     */
    A,

    /**
     * Code="C" Status="Checked In"
     *                     
     * 
     */
    C,

    /**
     * Code="F" Status="Flown/Used"
     *                     
     * 
     */
    F,

    /**
     * Code="L" Status="Boarded/Lifted"
     *                     
     * 
     */
    L,

    /**
     * Code="O" Status="Open"
     * 
     */
    O,

    /**
     * Code="P" Status="Printed"
     *                     
     * 
     */
    P,

    /**
     * Code="R" Status="Refunded"
     *                     
     * 
     */
    R,

    /**
     * Code="E" Status="Exchanged"
     *                     
     * 
     */
    E,

    /**
     * Code="V" Status="Void"
     * 
     */
    V,

    /**
     * Code="Z" Status="Archived/Carrier
     *                         Modified"
     * 
     */
    Z,

    /**
     * Code="U" Status="Unavailable"
     *                     
     * 
     */
    U,

    /**
     * Code="S" Status="Suspended"
     *                     
     * 
     */
    S,

    /**
     * Code="I" Status="Irregular Ops"
     *                     
     * 
     */
    I,

    /**
     * Code="D" "Deleted/Removed"
     *                     
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static TypeCouponStatus fromValue(String v) {
        return valueOf(v);
    }

}
