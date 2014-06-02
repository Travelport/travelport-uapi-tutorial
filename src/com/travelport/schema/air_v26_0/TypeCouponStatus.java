
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCouponStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCouponStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCouponStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
