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
 * <p>Java class for Period4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDt" type="{}DateFormat18Choice"/>
 *         &lt;element name="EndDt" type="{}DateFormat18Choice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period4", propOrder = {
    "startDt",
    "endDt"
})
public class Period4 {

    @XmlElement(name = "StartDt", required = true)
    protected DateFormat18Choice startDt;
    @XmlElement(name = "EndDt", required = true)
    protected DateFormat18Choice endDt;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat18Choice }
     *     
     */
    public DateFormat18Choice getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat18Choice }
     *     
     */
    public void setStartDt(DateFormat18Choice value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat18Choice }
     *     
     */
    public DateFormat18Choice getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat18Choice }
     *     
     */
    public void setEndDt(DateFormat18Choice value) {
        this.endDt = value;
    }

}
