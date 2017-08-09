
package com.travelport.schema.common_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeInvoiceRecordCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeInvoiceRecordCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="Void"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeInvoiceRecordCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public enum TypeInvoiceRecordCategory {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    TypeInvoiceRecordCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInvoiceRecordCategory fromValue(String v) {
        for (TypeInvoiceRecordCategory c: TypeInvoiceRecordCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
