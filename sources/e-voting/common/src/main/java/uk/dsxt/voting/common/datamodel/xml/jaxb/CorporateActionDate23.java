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
 * <p>Java class for CorporateActionDate23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionDate23">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtDt" type="{}DateFormat19Choice"/>
 *         &lt;element name="ValDt" type="{}DateFormat11Choice" minOccurs="0"/>
 *         &lt;element name="FXRateFxgDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="EarlstPmtDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate23", propOrder = {
    "pmtDt",
    "valDt",
    "fxRateFxgDt",
    "earlstPmtDt"
})
public class CorporateActionDate23 {

    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat19Choice pmtDt;
    @XmlElement(name = "ValDt")
    protected DateFormat11Choice valDt;
    @XmlElement(name = "FXRateFxgDt")
    protected DateFormat19Choice fxRateFxgDt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateFormat19Choice earlstPmtDt;

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setPmtDt(DateFormat19Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat11Choice }
     *     
     */
    public DateFormat11Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat11Choice }
     *     
     */
    public void setValDt(DateFormat11Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the fxRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getFXRateFxgDt() {
        return fxRateFxgDt;
    }

    /**
     * Sets the value of the fxRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setFXRateFxgDt(DateFormat19Choice value) {
        this.fxRateFxgDt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setEarlstPmtDt(DateFormat19Choice value) {
        this.earlstPmtDt = value;
    }

}
