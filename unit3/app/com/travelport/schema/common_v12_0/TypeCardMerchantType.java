
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCardMerchantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCardMerchantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="2"/>
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VD"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="DS"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BK"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BP"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BU"/>
 *     &lt;enumeration value="BX"/>
 *     &lt;enumeration value="CB"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="DT"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="EU"/>
 *     &lt;enumeration value="EW"/>
 *     &lt;enumeration value="FC"/>
 *     &lt;enumeration value="FH"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HH"/>
 *     &lt;enumeration value="IB"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IK"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="JC"/>
 *     &lt;enumeration value="JL"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="LH"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NK"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RJ"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="UB"/>
 *     &lt;enumeration value="UC"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UI"/>
 *     &lt;enumeration value="UN"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="WB"/>
 *     &lt;enumeration value="WC"/>
 *     &lt;enumeration value="XS"/>
 *     &lt;enumeration value="YJ"/>
 *     &lt;enumeration value="ZD"/>
 *     &lt;enumeration value="ZE"/>
 *     &lt;enumeration value="ZI"/>
 *     &lt;enumeration value="ZL"/>
 *     &lt;enumeration value="ZS"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="DL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCardMerchantType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeCardMerchantType {

    VI,
    VD,
    MC,
    CA,
    IC,
    TP,
    AX,
    DS,
    DC,
    AA,
    AB,
    AC,
    AM,
    AP,
    AQ,
    AR,
    AS,
    AT,
    BA,
    BB,
    BC,
    BD,
    BE,
    BF,
    BH,
    BI,
    BK,
    BM,
    BP,
    BR,
    BU,
    BX,
    CB,
    CD,
    CG,
    CK,
    CL,
    CN,
    CO,
    CP,
    CS,
    CT,
    CU,
    CX,
    DI,
    DR,
    DT,
    EC,
    EP,
    EU,
    EW,
    FC,
    FH,
    GC,
    GS,
    GU,
    GW,
    HA,
    HH,
    IB,
    ID,
    IK,
    IL,
    IR,
    JC,
    JL,
    KO,
    LH,
    LO,
    MD,
    MO,
    MT,
    MU,
    NC,
    NK,
    NM,
    NP,
    NW,
    OC,
    OT,
    PA,
    PC,
    PH,
    PI,
    PK,
    PS,
    RA,
    RJ,
    SA,
    SC,
    SI,
    SO,
    SR,
    SS,
    SU,
    SW,
    TC,
    TL,
    TR,
    TS,
    TW,
    UB,
    UC,
    UG,
    UI,
    UN,
    UP,
    US,
    UT,
    VA,
    WB,
    WC,
    XS,
    YJ,
    ZD,
    ZE,
    ZI,
    ZL,
    ZS,
    VE,
    MA,
    DL;

    public String value() {
        return name();
    }

    public static TypeCardMerchantType fromValue(String v) {
        return valueOf(v);
    }

}
