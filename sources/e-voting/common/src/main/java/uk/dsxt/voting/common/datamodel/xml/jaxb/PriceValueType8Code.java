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
 * <p>Java class for PriceValueType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceValueType8Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TBSP"/>
 *     &lt;enumeration value="UNSP"/>
 *     &lt;enumeration value="UKWN"/>
 *     &lt;enumeration value="NILP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType8Code")
@XmlEnum
public enum PriceValueType8Code {

    TBSP,
    UNSP,
    UKWN,
    NILP;

    public String value() {
        return name();
    }

    public static PriceValueType8Code fromValue(String v) {
        return valueOf(v);
    }

}
