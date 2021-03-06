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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for XtnsnMeetingCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XtnsnMeetingCancellation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XtnsnDt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SctyDtls" type="{}FinancialInstrumentAttributes34" minOccurs="0"/>
 *                   &lt;element name="MtgDtls" type="{}Meeting3" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="Issr" type="{}IssuerInformation1" minOccurs="0"/>
 *                   &lt;element name="CorpActnDtls" type="{}CorporateAction10" minOccurs="0"/>
 *                   &lt;element name="CorpActnOptnDtls" type="{}CorporateActionOption51" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AddtlInf" type="{}CorporateActionNarrative11" minOccurs="0"/>
 *                   &lt;element name="Mtg" type="{}MeetingNotice3" minOccurs="0"/>
 *                   &lt;element name="EvtsLkg" type="{}CorporateActionEventReference1" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ShrDnomntr" type="{}XtnsnSharesDenominator" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XtnsnMeetingCancellation", propOrder = {
    "xtnsnDt"
})
public class XtnsnMeetingCancellation {

    @XmlElement(name = "XtnsnDt", required = true)
    protected XtnsnMeetingCancellation.XtnsnDt xtnsnDt;

    /**
     * Gets the value of the xtnsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XtnsnMeetingCancellation.XtnsnDt }
     *     
     */
    public XtnsnMeetingCancellation.XtnsnDt getXtnsnDt() {
        return xtnsnDt;
    }

    /**
     * Sets the value of the xtnsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtnsnMeetingCancellation.XtnsnDt }
     *     
     */
    public void setXtnsnDt(XtnsnMeetingCancellation.XtnsnDt value) {
        this.xtnsnDt = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SctyDtls" type="{}FinancialInstrumentAttributes34" minOccurs="0"/>
     *         &lt;element name="MtgDtls" type="{}Meeting3" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="Issr" type="{}IssuerInformation1" minOccurs="0"/>
     *         &lt;element name="CorpActnDtls" type="{}CorporateAction10" minOccurs="0"/>
     *         &lt;element name="CorpActnOptnDtls" type="{}CorporateActionOption51" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AddtlInf" type="{}CorporateActionNarrative11" minOccurs="0"/>
     *         &lt;element name="Mtg" type="{}MeetingNotice3" minOccurs="0"/>
     *         &lt;element name="EvtsLkg" type="{}CorporateActionEventReference1" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ShrDnomntr" type="{}XtnsnSharesDenominator" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sctyDtls",
        "mtgDtls",
        "issr",
        "corpActnDtls",
        "corpActnOptnDtls",
        "addtlInf",
        "mtg",
        "evtsLkg",
        "shrDnomntr"
    })
    public static class XtnsnDt {

        @XmlElement(name = "SctyDtls")
        protected FinancialInstrumentAttributes34 sctyDtls;
        @XmlElement(name = "MtgDtls")
        protected List<Meeting3> mtgDtls;
        @XmlElement(name = "Issr")
        protected IssuerInformation1 issr;
        @XmlElement(name = "CorpActnDtls")
        protected CorporateAction10 corpActnDtls;
        @XmlElement(name = "CorpActnOptnDtls")
        protected List<CorporateActionOption51> corpActnOptnDtls;
        @XmlElement(name = "AddtlInf")
        protected CorporateActionNarrative11 addtlInf;
        @XmlElement(name = "Mtg")
        protected MeetingNotice3 mtg;
        @XmlElement(name = "EvtsLkg")
        protected List<CorporateActionEventReference1> evtsLkg;
        @XmlElement(name = "ShrDnomntr")
        protected List<XtnsnSharesDenominator> shrDnomntr;

        /**
         * Gets the value of the sctyDtls property.
         * 
         * @return
         *     possible object is
         *     {@link FinancialInstrumentAttributes34 }
         *     
         */
        public FinancialInstrumentAttributes34 getSctyDtls() {
            return sctyDtls;
        }

        /**
         * Sets the value of the sctyDtls property.
         * 
         * @param value
         *     allowed object is
         *     {@link FinancialInstrumentAttributes34 }
         *     
         */
        public void setSctyDtls(FinancialInstrumentAttributes34 value) {
            this.sctyDtls = value;
        }

        /**
         * Gets the value of the mtgDtls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtgDtls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMtgDtls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Meeting3 }
         * 
         * 
         */
        public List<Meeting3> getMtgDtls() {
            if (mtgDtls == null) {
                mtgDtls = new ArrayList<Meeting3>();
            }
            return this.mtgDtls;
        }

        /**
         * Gets the value of the issr property.
         * 
         * @return
         *     possible object is
         *     {@link IssuerInformation1 }
         *     
         */
        public IssuerInformation1 getIssr() {
            return issr;
        }

        /**
         * Sets the value of the issr property.
         * 
         * @param value
         *     allowed object is
         *     {@link IssuerInformation1 }
         *     
         */
        public void setIssr(IssuerInformation1 value) {
            this.issr = value;
        }

        /**
         * Gets the value of the corpActnDtls property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateAction10 }
         *     
         */
        public CorporateAction10 getCorpActnDtls() {
            return corpActnDtls;
        }

        /**
         * Sets the value of the corpActnDtls property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateAction10 }
         *     
         */
        public void setCorpActnDtls(CorporateAction10 value) {
            this.corpActnDtls = value;
        }

        /**
         * Gets the value of the corpActnOptnDtls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corpActnOptnDtls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorpActnOptnDtls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateActionOption51 }
         * 
         * 
         */
        public List<CorporateActionOption51> getCorpActnOptnDtls() {
            if (corpActnOptnDtls == null) {
                corpActnOptnDtls = new ArrayList<CorporateActionOption51>();
            }
            return this.corpActnOptnDtls;
        }

        /**
         * Gets the value of the addtlInf property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateActionNarrative11 }
         *     
         */
        public CorporateActionNarrative11 getAddtlInf() {
            return addtlInf;
        }

        /**
         * Sets the value of the addtlInf property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateActionNarrative11 }
         *     
         */
        public void setAddtlInf(CorporateActionNarrative11 value) {
            this.addtlInf = value;
        }

        /**
         * Gets the value of the mtg property.
         * 
         * @return
         *     possible object is
         *     {@link MeetingNotice3 }
         *     
         */
        public MeetingNotice3 getMtg() {
            return mtg;
        }

        /**
         * Sets the value of the mtg property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingNotice3 }
         *     
         */
        public void setMtg(MeetingNotice3 value) {
            this.mtg = value;
        }

        /**
         * Gets the value of the evtsLkg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evtsLkg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvtsLkg().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporateActionEventReference1 }
         * 
         * 
         */
        public List<CorporateActionEventReference1> getEvtsLkg() {
            if (evtsLkg == null) {
                evtsLkg = new ArrayList<CorporateActionEventReference1>();
            }
            return this.evtsLkg;
        }

        /**
         * Gets the value of the shrDnomntr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shrDnomntr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShrDnomntr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XtnsnSharesDenominator }
         * 
         * 
         */
        public List<XtnsnSharesDenominator> getShrDnomntr() {
            if (shrDnomntr == null) {
                shrDnomntr = new ArrayList<XtnsnSharesDenominator>();
            }
            return this.shrDnomntr;
        }

    }

}
