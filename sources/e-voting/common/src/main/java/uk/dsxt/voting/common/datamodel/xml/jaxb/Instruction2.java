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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Instruction2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instruction2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrId" type="{}Max35Text"/>
 *         &lt;element name="ReqdExctnDt" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element name="VoteExctnConf" type="{}YesNoIndicator"/>
 *         &lt;element name="AcctDtls" type="{}SafekeepingAccount4"/>
 *         &lt;element name="Prxy" type="{}Proxy4" minOccurs="0"/>
 *         &lt;element name="VoteDtls" type="{}VoteDetails2" minOccurs="0"/>
 *         &lt;element name="MtgAttndee" type="{}IndividualPerson17" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpcfcInstrReq" type="{}SpecificInstructionRequest1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instruction2", propOrder = {
    "instrId",
    "reqdExctnDt",
    "voteExctnConf",
    "acctDtls",
    "prxy",
    "voteDtls",
    "mtgAttndee",
    "spcfcInstrReq"
})
public class Instruction2 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "ReqdExctnDt")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "VoteExctnConf")
    protected boolean voteExctnConf;
    @XmlElement(name = "AcctDtls", required = true)
    protected SafekeepingAccount4 acctDtls;
    @XmlElement(name = "Prxy")
    protected Proxy4 prxy;
    @XmlElement(name = "VoteDtls")
    protected VoteDetails2 voteDtls;
    @XmlElement(name = "MtgAttndee")
    protected List<IndividualPerson17> mtgAttndee;
    @XmlElement(name = "SpcfcInstrReq")
    protected SpecificInstructionRequest1 spcfcInstrReq;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the voteExctnConf property.
     * 
     */
    public boolean isVoteExctnConf() {
        return voteExctnConf;
    }

    /**
     * Sets the value of the voteExctnConf property.
     * 
     */
    public void setVoteExctnConf(boolean value) {
        this.voteExctnConf = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount4 }
     *     
     */
    public SafekeepingAccount4 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount4 }
     *     
     */
    public void setAcctDtls(SafekeepingAccount4 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy4 }
     *     
     */
    public Proxy4 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy4 }
     *     
     */
    public void setPrxy(Proxy4 value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * @return
     *     possible object is
     *     {@link VoteDetails2 }
     *     
     */
    public VoteDetails2 getVoteDtls() {
        return voteDtls;
    }

    /**
     * Sets the value of the voteDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteDetails2 }
     *     
     */
    public void setVoteDtls(VoteDetails2 value) {
        this.voteDtls = value;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtgAttndee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgAttndee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson17 }
     * 
     * 
     */
    public List<IndividualPerson17> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<IndividualPerson17>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the spcfcInstrReq property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificInstructionRequest1 }
     *     
     */
    public SpecificInstructionRequest1 getSpcfcInstrReq() {
        return spcfcInstrReq;
    }

    /**
     * Sets the value of the spcfcInstrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificInstructionRequest1 }
     *     
     */
    public void setSpcfcInstrReq(SpecificInstructionRequest1 value) {
        this.spcfcInstrReq = value;
    }

}
