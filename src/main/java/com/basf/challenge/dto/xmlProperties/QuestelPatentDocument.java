//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}bibliographic-data"/&gt;
 *         &lt;element ref="{}abstract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}claims" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}amended-claims" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{}language-type" /&gt;
 *       &lt;attribute name="schema-version" use="required" type="{}schema-version-type" /&gt;
 *       &lt;attribute name="date-produced" use="required" type="{}date-type" /&gt;
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="produced-by" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bibliographicData",
        "_abstract",
        "description",
        "claims",
        "amendedClaims"
})
@XmlRootElement(name = "questel-patent-document")
public class QuestelPatentDocument {

    @XmlElement(name = "bibliographic-data", required = true)
    @JacksonXmlProperty(localName = "bibliographic-data")
    protected BibliographicData bibliographicData;
    @XmlElement(name = "abstract")
    protected List<Abstract> _abstract;
    protected List<Description> description;
    protected List<Claims> claims;
    @XmlElement(name = "amended-claims")
    protected List<AmendedClaims> amendedClaims;
    @XmlAttribute(name = "lang", required = true)
    protected String lang;
    @XmlAttribute(name = "schema-version", required = true)
    @JacksonXmlProperty(localName = "schema-version")
    protected String schemaVersion;
    @XmlAttribute(name = "date-produced", required = true)
    @JacksonXmlProperty(localName = "date-produced")
    protected String dateProduced;
    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "produced-by", required = true)
    @JacksonXmlProperty(localName = "produced-by")
    protected String producedBy;

    /**
     * Obtiene el valor de la propiedad bibliographicData.
     *
     * @return possible object is
     * {@link BibliographicData }
     */
    public BibliographicData getBibliographicData() {
        return bibliographicData;
    }

    /**
     * Define el valor de la propiedad bibliographicData.
     *
     * @param value allowed object is
     *              {@link BibliographicData }
     */
    public void setBibliographicData(BibliographicData value) {
        this.bibliographicData = value;
    }

    /**
     * Gets the value of the abstract property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Description>();
        }
        return this.description;
    }

    /**
     * Gets the value of the claims property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claims property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaims().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Claims }
     */
    public List<Claims> getClaims() {
        if (claims == null) {
            claims = new ArrayList<Claims>();
        }
        return this.claims;
    }

    /**
     * Gets the value of the amendedClaims property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendedClaims property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendedClaims().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendedClaims }
     */
    public List<AmendedClaims> getAmendedClaims() {
        if (amendedClaims == null) {
            amendedClaims = new ArrayList<AmendedClaims>();
        }
        return this.amendedClaims;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Obtiene el valor de la propiedad schemaVersion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Define el valor de la propiedad schemaVersion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad dateProduced.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateProduced() {
        return dateProduced;
    }

    /**
     * Define el valor de la propiedad dateProduced.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateProduced(String value) {
        this.dateProduced = value;
    }

    /**
     * Obtiene el valor de la propiedad file.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFile() {
        return file;
    }

    /**
     * Define el valor de la propiedad file.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad producedBy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProducedBy() {
        return producedBy;
    }

    /**
     * Define el valor de la propiedad producedBy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProducedBy(String value) {
        this.producedBy = value;
    }

}
