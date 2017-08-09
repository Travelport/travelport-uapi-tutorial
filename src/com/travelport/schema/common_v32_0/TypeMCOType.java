
package com.travelport.schema.common_v32_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMCOType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMCOType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AgencyServiceFee"/&gt;
 *     &lt;enumeration value="ExchangeResidual"/&gt;
 *     &lt;enumeration value="AirlineServiceFee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMCOType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:54:46-06:00", comment = "JAXB RI v2.2.11")
public enum TypeMCOType {

    @XmlEnumValue("AgencyServiceFee")
    AGENCY_SERVICE_FEE("AgencyServiceFee"),
    @XmlEnumValue("ExchangeResidual")
    EXCHANGE_RESIDUAL("ExchangeResidual"),
    @XmlEnumValue("AirlineServiceFee")
    AIRLINE_SERVICE_FEE("AirlineServiceFee");
    private final String value;

    TypeMCOType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMCOType fromValue(String v) {
        for (TypeMCOType c: TypeMCOType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
