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
 * <p>Java class for DefaultProcessingOrStandingInstruction1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultProcessingOrStandingInstruction1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DfltOptnInd" type="{}YesNoIndicator"/>
 *         &lt;element name="StgInstrInd" type="{}YesNoIndicator"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProcessingOrStandingInstruction1Choice", propOrder = {
    "dfltOptnInd",
    "stgInstrInd"
})
public class DefaultProcessingOrStandingInstruction1Choice {

    @XmlElement(name = "DfltOptnInd")
    protected Boolean dfltOptnInd;
    @XmlElement(name = "StgInstrInd")
    protected Boolean stgInstrInd;

    /**
     * Gets the value of the dfltOptnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltOptnInd() {
        return dfltOptnInd;
    }

    /**
     * Sets the value of the dfltOptnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfltOptnInd(Boolean value) {
        this.dfltOptnInd = value;
    }

    /**
     * Gets the value of the stgInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgInstrInd() {
        return stgInstrInd;
    }

    /**
     * Sets the value of the stgInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStgInstrInd(Boolean value) {
        this.stgInstrInd = value;
    }

}
