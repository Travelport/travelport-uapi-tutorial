
package com.travelport.schema.common_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeQueueModifyAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeQueueModifyAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Remove"/&gt;
 *     &lt;enumeration value="Requeue"/&gt;
 *     &lt;enumeration value="Move"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Unlock"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeQueueModifyAction")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public enum TypeQueueModifyAction {

    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Requeue")
    REQUEUE("Requeue"),
    @XmlEnumValue("Move")
    MOVE("Move"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Unlock")
    UNLOCK("Unlock");
    private final String value;

    TypeQueueModifyAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeQueueModifyAction fromValue(String v) {
        for (TypeQueueModifyAction c: TypeQueueModifyAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
