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
 * <p>Java class for NetDividendRateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetDividendRateType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAPO"/>
 *     &lt;enumeration value="FLFR"/>
 *     &lt;enumeration value="INCO"/>
 *     &lt;enumeration value="INTR"/>
 *     &lt;enumeration value="SOIC"/>
 *     &lt;enumeration value="TXBL"/>
 *     &lt;enumeration value="TXDF"/>
 *     &lt;enumeration value="TXFR"/>
 *     &lt;enumeration value="UNFR"/>
 *     &lt;enumeration value="FUPU"/>
 *     &lt;enumeration value="PAPU"/>
 *     &lt;enumeration value="REES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetDividendRateType2Code")
@XmlEnum
public enum NetDividendRateType2Code {

    CAPO,
    FLFR,
    INCO,
    INTR,
    SOIC,
    TXBL,
    TXDF,
    TXFR,
    UNFR,
    FUPU,
    PAPU,
    REES;

    public String value() {
        return name();
    }

    public static NetDividendRateType2Code fromValue(String v) {
        return valueOf(v);
    }

}
