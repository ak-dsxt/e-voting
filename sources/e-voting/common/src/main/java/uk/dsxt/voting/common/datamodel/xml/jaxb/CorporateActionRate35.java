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
 * <p>Java class for CorporateActionRate35 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionRate35">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Intrst" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="PctgSght" type="{}RateFormat7Choice" minOccurs="0"/>
 *         &lt;element name="RltdIndx" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="Sprd" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="BidIntrvl" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="PrvsFctr" type="{}RateFormat3Choice" minOccurs="0"/>
 *         &lt;element name="NxtFctr" type="{}RateFormat3Choice" minOccurs="0"/>
 *         &lt;element name="RinvstmtDscntRateToMkt" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="IntrstShrtfll" type="{}RateAndAmountFormat12Choice" minOccurs="0"/>
 *         &lt;element name="RealsdLoss" type="{}RateAndAmountFormat12Choice" minOccurs="0"/>
 *         &lt;element name="DclrdRate" type="{}RateAndAmountFormat12Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate35", propOrder = {
    "intrst",
    "pctgSght",
    "rltdIndx",
    "sprd",
    "bidIntrvl",
    "prvsFctr",
    "nxtFctr",
    "rinvstmtDscntRateToMkt",
    "intrstShrtfll",
    "realsdLoss",
    "dclrdRate"
})
public class CorporateActionRate35 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat14Choice intrst;
    @XmlElement(name = "PctgSght")
    protected RateFormat7Choice pctgSght;
    @XmlElement(name = "RltdIndx")
    protected RateFormat6Choice rltdIndx;
    @XmlElement(name = "Sprd")
    protected RateFormat6Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat14Choice bidIntrvl;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat3Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat3Choice nxtFctr;
    @XmlElement(name = "RinvstmtDscntRateToMkt")
    protected RateFormat6Choice rinvstmtDscntRateToMkt;
    @XmlElement(name = "IntrstShrtfll")
    protected RateAndAmountFormat12Choice intrstShrtfll;
    @XmlElement(name = "RealsdLoss")
    protected RateAndAmountFormat12Choice realsdLoss;
    @XmlElement(name = "DclrdRate")
    protected RateAndAmountFormat12Choice dclrdRate;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setIntrst(RateAndAmountFormat14Choice value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat7Choice }
     *     
     */
    public RateFormat7Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat7Choice }
     *     
     */
    public void setPctgSght(RateFormat7Choice value) {
        this.pctgSght = value;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setRltdIndx(RateFormat6Choice value) {
        this.rltdIndx = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setSprd(RateFormat6Choice value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setBidIntrvl(RateAndAmountFormat14Choice value) {
        this.bidIntrvl = value;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setPrvsFctr(RateFormat3Choice value) {
        this.prvsFctr = value;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setNxtFctr(RateFormat3Choice value) {
        this.nxtFctr = value;
    }

    /**
     * Gets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getRinvstmtDscntRateToMkt() {
        return rinvstmtDscntRateToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setRinvstmtDscntRateToMkt(RateFormat6Choice value) {
        this.rinvstmtDscntRateToMkt = value;
    }

    /**
     * Gets the value of the intrstShrtfll property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public RateAndAmountFormat12Choice getIntrstShrtfll() {
        return intrstShrtfll;
    }

    /**
     * Sets the value of the intrstShrtfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public void setIntrstShrtfll(RateAndAmountFormat12Choice value) {
        this.intrstShrtfll = value;
    }

    /**
     * Gets the value of the realsdLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public RateAndAmountFormat12Choice getRealsdLoss() {
        return realsdLoss;
    }

    /**
     * Sets the value of the realsdLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public void setRealsdLoss(RateAndAmountFormat12Choice value) {
        this.realsdLoss = value;
    }

    /**
     * Gets the value of the dclrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public RateAndAmountFormat12Choice getDclrdRate() {
        return dclrdRate;
    }

    /**
     * Sets the value of the dclrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat12Choice }
     *     
     */
    public void setDclrdRate(RateAndAmountFormat12Choice value) {
        this.dclrdRate = value;
    }

}
