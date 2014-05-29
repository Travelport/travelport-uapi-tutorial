
package com.travelport.schema.common_v15_0;

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
 * &lt;simpleType name="typeMCOType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AgencyServiceFee"/>
 *     &lt;enumeration value="ExchangeResidual"/>
 *     &lt;enumeration value="AirlineServiceFee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMCOType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
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
