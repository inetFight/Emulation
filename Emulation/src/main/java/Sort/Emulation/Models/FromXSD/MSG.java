//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 05:58:35 PM EET 
//


package Sort.Emulation.Models.FromXSD;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="HEADER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HDSDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HDRCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HDMGTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HDMGID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HDEVTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BODY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="HPIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PIB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RDST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CDTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CDDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PAB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DDWE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="IU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SRB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DRSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "MSG")
public class MSG {

    @XmlElement(name = "HEADER", required = true)
    protected MSG.HEADER header;
    @XmlElement(name = "BODY", required = true)
    protected MSG.BODY body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link MSG.HEADER }
     *     
     */
    public MSG.HEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSG.HEADER }
     *     
     */
    public void setHEADER(MSG.HEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link MSG.BODY }
     *     
     */
    public MSG.BODY getBODY() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSG.BODY }
     *     
     */
    public void setBODY(MSG.BODY value) {
        this.body = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="HPIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PIB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RDST" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CDTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CDDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PAB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DDWE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WI" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="IU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DSTAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SRB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DRSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hpicOrPIBOrPAB"
    })
    public static class BODY {

        @XmlElementRefs({
            @XmlElementRef(name = "PIB", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DID", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "HPIC", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PAB", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DSTAT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SRB", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> hpicOrPIBOrPAB;

        /**
         * Gets the value of the hpicOrPIBOrPAB property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hpicOrPIBOrPAB property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHPICOrPIBOrPAB().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link MSG.BODY.PAB }{@code >}
         * {@link JAXBElement }{@code <}{@link MSG.BODY.PIB }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link MSG.BODY.SRB }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getHPICOrPIBOrPAB() {
            if (hpicOrPIBOrPAB == null) {
                hpicOrPIBOrPAB = new ArrayList<JAXBElement<?>>();
            }
            return this.hpicOrPIBOrPAB;
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
         *         &lt;element name="CID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DDWE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WI" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="IU" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "cid",
            "ddwe",
            "le",
            "wi",
            "he",
            "vo",
            "et",
            "iu",
            "it",
            "tr"
        })
        public static class PAB {

            @XmlElement(name = "CID", required = true)
            protected String cid;
            @XmlElement(name = "DDWE", required = true)
            protected String ddwe;
            @XmlElement(name = "LE", required = true)
            protected String le;
            @XmlElement(name = "WI", required = true)
            protected String wi;
            @XmlElement(name = "HE", required = true)
            protected String he;
            @XmlElement(name = "VO", required = true)
            protected String vo;
            @XmlElement(name = "ET", required = true)
            protected String et;
            @XmlElement(name = "IU", required = true)
            protected String iu;
            @XmlElement(name = "IT", required = true)
            protected String it;
            @XmlElement(name = "TR", required = true)
            protected String tr;

            /**
             * Gets the value of the cid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCID() {
                return cid;
            }

            /**
             * Sets the value of the cid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCID(String value) {
                this.cid = value;
            }

            /**
             * Gets the value of the ddwe property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDWE() {
                return ddwe;
            }

            /**
             * Sets the value of the ddwe property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDWE(String value) {
                this.ddwe = value;
            }

            /**
             * Gets the value of the le property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLE() {
                return le;
            }

            /**
             * Sets the value of the le property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLE(String value) {
                this.le = value;
            }

            /**
             * Gets the value of the wi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWI() {
                return wi;
            }

            /**
             * Sets the value of the wi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWI(String value) {
                this.wi = value;
            }

            /**
             * Gets the value of the he property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHE() {
                return he;
            }

            /**
             * Sets the value of the he property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHE(String value) {
                this.he = value;
            }

            /**
             * Gets the value of the vo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVO() {
                return vo;
            }

            /**
             * Sets the value of the vo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVO(String value) {
                this.vo = value;
            }

            /**
             * Gets the value of the et property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getET() {
                return et;
            }

            /**
             * Sets the value of the et property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setET(String value) {
                this.et = value;
            }

            /**
             * Gets the value of the iu property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIU() {
                return iu;
            }

            /**
             * Sets the value of the iu property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIU(String value) {
                this.iu = value;
            }

            /**
             * Gets the value of the it property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIT() {
                return it;
            }

            /**
             * Sets the value of the it property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIT(String value) {
                this.it = value;
            }

            /**
             * Gets the value of the tr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTR() {
                return tr;
            }

            /**
             * Sets the value of the tr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTR(String value) {
                this.tr = value;
            }

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
         *         &lt;element name="RDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RDST" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CDTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CDDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "rdid",
            "rdst",
            "cdtp",
            "cddt"
        })
        public static class PIB {

            @XmlElement(name = "RDID", required = true)
            protected String rdid;
            @XmlElement(name = "RDST", required = true)
            protected String rdst;
            @XmlElement(name = "CDTP", required = true)
            protected String cdtp;
            @XmlElement(name = "CDDT", required = true)
            protected String cddt;

            /**
             * Gets the value of the rdid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRDID() {
                return rdid;
            }

            /**
             * Sets the value of the rdid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRDID(String value) {
                this.rdid = value;
            }

            /**
             * Gets the value of the rdst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRDST() {
                return rdst;
            }

            /**
             * Sets the value of the rdst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRDST(String value) {
                this.rdst = value;
            }

            /**
             * Gets the value of the cdtp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDTP() {
                return cdtp;
            }

            /**
             * Sets the value of the cdtp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDTP(String value) {
                this.cdtp = value;
            }

            /**
             * Gets the value of the cddt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDDT() {
                return cddt;
            }

            /**
             * Sets the value of the cddt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDDT(String value) {
                this.cddt = value;
            }

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
         *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DRSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "did",
            "drid",
            "drsid",
            "et"
        })
        public static class SRB {

            @XmlElement(name = "DID", required = true)
            protected String did;
            @XmlElement(name = "DRID", required = true)
            protected String drid;
            @XmlElement(name = "DRSID", required = true)
            protected String drsid;
            @XmlElement(name = "ET", required = true)
            protected String et;

            /**
             * Gets the value of the did property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDID() {
                return did;
            }

            /**
             * Sets the value of the did property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDID(String value) {
                this.did = value;
            }

            /**
             * Gets the value of the drid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRID() {
                return drid;
            }

            /**
             * Sets the value of the drid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRID(String value) {
                this.drid = value;
            }

            /**
             * Gets the value of the drsid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRSID() {
                return drsid;
            }

            /**
             * Sets the value of the drsid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRSID(String value) {
                this.drsid = value;
            }

            /**
             * Gets the value of the et property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getET() {
                return et;
            }

            /**
             * Sets the value of the et property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setET(String value) {
                this.et = value;
            }

        }

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
     *         &lt;element name="HDSDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HDRCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HDMGTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HDMGID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HDEVTM" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "hdsdid",
        "hdrcid",
        "hdmgtp",
        "hdmgid",
        "hdevtm"
    })
    public static class HEADER {

        @XmlElement(name = "HDSDID", required = true)
        protected String hdsdid;
        @XmlElement(name = "HDRCID", required = true)
        protected String hdrcid;
        @XmlElement(name = "HDMGTP", required = true)
        protected String hdmgtp;
        @XmlElement(name = "HDMGID", required = true)
        protected String hdmgid;
        @XmlElement(name = "HDEVTM", required = true)
        protected String hdevtm;

        /**
         * Gets the value of the hdsdid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHDSDID() {
            return hdsdid;
        }

        /**
         * Sets the value of the hdsdid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHDSDID(String value) {
            this.hdsdid = value;
        }

        /**
         * Gets the value of the hdrcid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHDRCID() {
            return hdrcid;
        }

        /**
         * Sets the value of the hdrcid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHDRCID(String value) {
            this.hdrcid = value;
        }

        /**
         * Gets the value of the hdmgtp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHDMGTP() {
            return hdmgtp;
        }

        /**
         * Sets the value of the hdmgtp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHDMGTP(String value) {
            this.hdmgtp = value;
        }

        /**
         * Gets the value of the hdmgid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHDMGID() {
            return hdmgid;
        }

        /**
         * Sets the value of the hdmgid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHDMGID(String value) {
            this.hdmgid = value;
        }

        /**
         * Gets the value of the hdevtm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHDEVTM() {
            return hdevtm;
        }

        /**
         * Sets the value of the hdevtm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHDEVTM(String value) {
            this.hdevtm = value;
        }

    }

}
