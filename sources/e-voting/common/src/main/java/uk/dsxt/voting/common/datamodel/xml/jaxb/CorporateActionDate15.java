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
 * <p>Java class for CorporateActionDate15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionDate15">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarlyRspnDdln" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="CoverXprtnDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="PrtctDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="MktDdln" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="RspnDdln" type="{}DateFormat20Choice" minOccurs="0"/>
 *         &lt;element name="XpryDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="SbcptCostDbtDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *         &lt;element name="DpstryCoverXprtnDt" type="{}DateFormat19Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate15", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDt",
    "prtctDt",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt"
})
public class CorporateActionDate15 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat19Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat19Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat19Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat19Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat20Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat19Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat19Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat19Choice dpstryCoverXprtnDt;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setEarlyRspnDdln(DateFormat19Choice value) {
        this.earlyRspnDdln = value;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setCoverXprtnDt(DateFormat19Choice value) {
        this.coverXprtnDt = value;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setPrtctDt(DateFormat19Choice value) {
        this.prtctDt = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setMktDdln(DateFormat19Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat20Choice }
     *     
     */
    public DateFormat20Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat20Choice }
     *     
     */
    public void setRspnDdln(DateFormat20Choice value) {
        this.rspnDdln = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setXpryDt(DateFormat19Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setSbcptCostDbtDt(DateFormat19Choice value) {
        this.sbcptCostDbtDt = value;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public void setDpstryCoverXprtnDt(DateFormat19Choice value) {
        this.dpstryCoverXprtnDt = value;
    }

}
