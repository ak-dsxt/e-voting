//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.datamodel.xml.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="IPOS"/>
 *     &lt;enumeration value="LACK"/>
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="RBIS"/>
 *     &lt;enumeration value="EVNM"/>
 *     &lt;enumeration value="ULNK"/>
 *     &lt;enumeration value="PRXY"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="SPLT"/>
 *     &lt;enumeration value="IPOA"/>
 *     &lt;enumeration value="IREG"/>
 *     &lt;enumeration value="DSEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason1Code")
@XmlEnum
public enum RejectionReason1Code {

    ADEA,
    LATE,
    DQUA,
    IPOS,
    LACK,
    SAFE,
    RBIS,
    EVNM,
    ULNK,
    PRXY,
    PART,
    SPLT,
    IPOA,
    IREG,
    DSEC;

    public String value() {
        return name();
    }

    public static RejectionReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
