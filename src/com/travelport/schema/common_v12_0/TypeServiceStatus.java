
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeServiceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Offered"/>
 *     &lt;enumeration value="Priced"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="AutoPriced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeServiceStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public enum TypeServiceStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Offered")
    OFFERED("Offered"),
    @XmlEnumValue("Priced")
    PRICED("Priced"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("AutoPriced")
    AUTO_PRICED("AutoPriced");
    private final String value;

    TypeServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeServiceStatus fromValue(String v) {
        for (TypeServiceStatus c: TypeServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
