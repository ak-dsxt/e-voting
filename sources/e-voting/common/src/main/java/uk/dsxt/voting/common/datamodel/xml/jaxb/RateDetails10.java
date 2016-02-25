//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.datamodel.xml.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDetails10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateDetails10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddtlTax" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="GrssDvddRate" type="{}GrossDividendRateFormat7Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntrstRateUsdForPmt" type="{}InterestRateUsedForPaymentFormat5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxRltdRate" type="{}RateTypeAndAmountAndStatus6" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WhldgTaxRate" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="ChrgsFees" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="EarlySlctnFeeRate" type="{}SolicitationFeeRateFormat5Choice" minOccurs="0"/>
 *         &lt;element name="FnlDvddRate" type="{}RateAndAmountFormat15Choice" minOccurs="0"/>
 *         &lt;element name="FsclStmp" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="FullyFrnkdRate" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="ThrdPtyIncntivRate" type="{}RateFormat8Choice" minOccurs="0"/>
 *         &lt;element name="NetDvddRate" type="{}NetDividendRateFormat9Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonResdtRate" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="PrvsnlDvddRate" type="{}RateAndAmountFormat15Choice" minOccurs="0"/>
 *         &lt;element name="AplblRate" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="SlctnFeeRate" type="{}SolicitationFeeRateFormat5Choice" minOccurs="0"/>
 *         &lt;element name="TaxCdtRate" type="{}TaxCreditRateFormat5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxOnIncm" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="TaxOnPrfts" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="TaxRclmRate" type="{}RateFormat6Choice" minOccurs="0"/>
 *         &lt;element name="WhldgOfFrgnTax" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="WhldgOfLclTax" type="{}RateAndAmountFormat14Choice" minOccurs="0"/>
 *         &lt;element name="EqulstnRate" type="{}RateAndAmountFormat15Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetails10", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "intrstRateUsdForPmt",
    "taxRltdRate",
    "whldgTaxRate",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fnlDvddRate",
    "fsclStmp",
    "fullyFrnkdRate",
    "thrdPtyIncntivRate",
    "netDvddRate",
    "nonResdtRate",
    "prvsnlDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "equlstnRate"
})
public class RateDetails10 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat14Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat7Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat5Choice> intrstRateUsdForPmt;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus6> taxRltdRate;
    @XmlElement(name = "WhldgTaxRate")
    protected RateFormat6Choice whldgTaxRate;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat14Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat5Choice earlySlctnFeeRate;
    @XmlElement(name = "FnlDvddRate")
    protected RateAndAmountFormat15Choice fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat6Choice fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat14Choice fullyFrnkdRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat8Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat9Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat14Choice nonResdtRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected RateAndAmountFormat15Choice prvsnlDvddRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat6Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat5Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat5Choice> taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateFormat6Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat6Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat6Choice taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat14Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat14Choice whldgOfLclTax;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat15Choice equlstnRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat14Choice value) {
        this.addtlTax = value;
    }

    /**
     * Gets the value of the grssDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grssDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossDividendRateFormat7Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat7Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat7Choice>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the intrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrstRateUsdForPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstRateUsdForPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateUsedForPaymentFormat5Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat5Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat5Choice>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the taxRltdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRltdRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRltdRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTypeAndAmountAndStatus6 }
     * 
     * 
     */
    public List<RateTypeAndAmountAndStatus6> getTaxRltdRate() {
        if (taxRltdRate == null) {
            taxRltdRate = new ArrayList<RateTypeAndAmountAndStatus6>();
        }
        return this.taxRltdRate;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setWhldgTaxRate(RateFormat6Choice value) {
        this.whldgTaxRate = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setChrgsFees(RateAndAmountFormat14Choice value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat5Choice }
     *     
     */
    public SolicitationFeeRateFormat5Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat5Choice }
     *     
     */
    public void setEarlySlctnFeeRate(SolicitationFeeRateFormat5Choice value) {
        this.earlySlctnFeeRate = value;
    }

    /**
     * Gets the value of the fnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public RateAndAmountFormat15Choice getFnlDvddRate() {
        return fnlDvddRate;
    }

    /**
     * Sets the value of the fnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public void setFnlDvddRate(RateAndAmountFormat15Choice value) {
        this.fnlDvddRate = value;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setFsclStmp(RateFormat6Choice value) {
        this.fsclStmp = value;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setFullyFrnkdRate(RateAndAmountFormat14Choice value) {
        this.fullyFrnkdRate = value;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat8Choice }
     *     
     */
    public RateFormat8Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat8Choice }
     *     
     */
    public void setThrdPtyIncntivRate(RateFormat8Choice value) {
        this.thrdPtyIncntivRate = value;
    }

    /**
     * Gets the value of the netDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetDividendRateFormat9Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat9Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat9Choice>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setNonResdtRate(RateAndAmountFormat14Choice value) {
        this.nonResdtRate = value;
    }

    /**
     * Gets the value of the prvsnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public RateAndAmountFormat15Choice getPrvsnlDvddRate() {
        return prvsnlDvddRate;
    }

    /**
     * Sets the value of the prvsnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public void setPrvsnlDvddRate(RateAndAmountFormat15Choice value) {
        this.prvsnlDvddRate = value;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setAplblRate(RateFormat6Choice value) {
        this.aplblRate = value;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat5Choice }
     *     
     */
    public SolicitationFeeRateFormat5Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat5Choice }
     *     
     */
    public void setSlctnFeeRate(SolicitationFeeRateFormat5Choice value) {
        this.slctnFeeRate = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCdtRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCdtRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCreditRateFormat5Choice }
     * 
     * 
     */
    public List<TaxCreditRateFormat5Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<TaxCreditRateFormat5Choice>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setTaxOnIncm(RateFormat6Choice value) {
        this.taxOnIncm = value;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setTaxOnPrfts(RateFormat6Choice value) {
        this.taxOnPrfts = value;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public void setTaxRclmRate(RateFormat6Choice value) {
        this.taxRclmRate = value;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setWhldgOfFrgnTax(RateAndAmountFormat14Choice value) {
        this.whldgOfFrgnTax = value;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public void setWhldgOfLclTax(RateAndAmountFormat14Choice value) {
        this.whldgOfLclTax = value;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public RateAndAmountFormat15Choice getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat15Choice }
     *     
     */
    public void setEqulstnRate(RateAndAmountFormat15Choice value) {
        this.equlstnRate = value;
    }

}
