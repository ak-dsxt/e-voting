//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.datamodel.xml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Extension2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extension2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlcAndNm" type="{}Max350Text" minOccurs="0"/>
 *         &lt;element name="XtnsnEnvlp" type="{}ExtensionEnvelope1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension2", propOrder = {
    "plcAndNm",
    "xtnsnEnvlp"
})
public class Extension2 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "XtnsnEnvlp", required = true)
    protected ExtensionEnvelope1 xtnsnEnvlp;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcAndNm(String value) {
        this.plcAndNm = value;
    }

    /**
     * Gets the value of the xtnsnEnvlp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionEnvelope1 }
     *     
     */
    public ExtensionEnvelope1 getXtnsnEnvlp() {
        return xtnsnEnvlp;
    }

    /**
     * Sets the value of the xtnsnEnvlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionEnvelope1 }
     *     
     */
    public void setXtnsnEnvlp(ExtensionEnvelope1 value) {
        this.xtnsnEnvlp = value;
    }

}
