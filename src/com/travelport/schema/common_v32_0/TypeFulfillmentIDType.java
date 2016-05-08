
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFulfillmentIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFulfillmentIDType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bahn Card"/&gt;
 *     &lt;enumeration value="Credit Card"/&gt;
 *     &lt;enumeration value="Euro Cheque Card"/&gt;
 *     &lt;enumeration value="Collection Reference"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeFulfillmentIDType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:28:25-07:00", comment = "JAXB RI v2.2.11")
public enum TypeFulfillmentIDType {

    @XmlEnumValue("Bahn Card")
    BAHN_CARD("Bahn Card"),
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    @XmlEnumValue("Euro Cheque Card")
    EURO_CHEQUE_CARD("Euro Cheque Card"),
    @XmlEnumValue("Collection Reference")
    COLLECTION_REFERENCE("Collection Reference");
    private final String value;

    TypeFulfillmentIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFulfillmentIDType fromValue(String v) {
        for (TypeFulfillmentIDType c: TypeFulfillmentIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
