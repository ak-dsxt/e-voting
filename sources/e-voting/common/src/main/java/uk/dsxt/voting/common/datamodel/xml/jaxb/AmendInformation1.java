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
 * <p>Java class for AmendInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrvsRef" type="{}MessageIdentification"/>
 *         &lt;element name="RcnfrmInstrs" type="{}YesNoIndicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendInformation1", propOrder = {
    "prvsRef",
    "rcnfrmInstrs"
})
public class AmendInformation1 {

    @XmlElement(name = "PrvsRef", required = true)
    protected MessageIdentification prvsRef;
    @XmlElement(name = "RcnfrmInstrs")
    protected boolean rcnfrmInstrs;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public void setPrvsRef(MessageIdentification value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the rcnfrmInstrs property.
     * 
     */
    public boolean isRcnfrmInstrs() {
        return rcnfrmInstrs;
    }

    /**
     * Sets the value of the rcnfrmInstrs property.
     * 
     */
    public void setRcnfrmInstrs(boolean value) {
        this.rcnfrmInstrs = value;
    }

}
