
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFeeApplication.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFeeApplication">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Per One Way"/>
 *     &lt;enumeration value="Per Round Trip"/>
 *     &lt;enumeration value="Per Item"/>
 *     &lt;enumeration value="Per Travel"/>
 *     &lt;enumeration value="Per Ticket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFeeApplication")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeFeeApplication {

    @XmlEnumValue("Per One Way")
    PER_ONE_WAY("Per One Way"),
    @XmlEnumValue("Per Round Trip")
    PER_ROUND_TRIP("Per Round Trip"),
    @XmlEnumValue("Per Item")
    PER_ITEM("Per Item"),
    @XmlEnumValue("Per Travel")
    PER_TRAVEL("Per Travel"),
    @XmlEnumValue("Per Ticket")
    PER_TICKET("Per Ticket");
    private final String value;

    TypeFeeApplication(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFeeApplication fromValue(String v) {
        for (TypeFeeApplication c: TypeFeeApplication.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
