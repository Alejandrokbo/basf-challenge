//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
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
 *         &lt;element ref="{}country" minOccurs="0"/&gt;
 *         &lt;element ref="{}doc-number" minOccurs="0"/&gt;
 *         &lt;element ref="{}kind" minOccurs="0"/&gt;
 *         &lt;element ref="{}name" minOccurs="0"/&gt;
 *         &lt;element ref="{}date" minOccurs="0"/&gt;
 *         &lt;element ref="{}text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" type="{}language-type" default="en" /&gt;
 *       &lt;attribute name="data-format" type="{}data-format-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "country",
        "docNumber",
        "kind",
        "name",
        "date",
        "text"
})
@XmlRootElement(name = "document-id")
public class DocumentId {

    protected String country;
    @XmlElement(name = "doc-number")
    @JacksonXmlProperty(localName = "doc-number")
    protected String docNumber;
    protected String kind;
    protected Name name;
    protected String date;
    protected List<Text> text;
    @XmlAttribute(name = "lang")
    protected String lang;
    @XmlAttribute(name = "data-format")
    @JacksonXmlElementWrapper(localName = "data-format")
    protected DataFormatType dataFormat;

    /**
     * Obtiene el valor de la propiedad country.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Define el valor de la propiedad docNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return possible object is
     * {@link Name }
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link Name }
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the text property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
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
     * Obtiene el valor de la propiedad dataFormat.
     *
     * @return possible object is
     * {@link DataFormatType }
     */
    public DataFormatType getDataFormat() {
        return dataFormat;
    }

    /**
     * Define el valor de la propiedad dataFormat.
     *
     * @param value allowed object is
     *              {@link DataFormatType }
     */
    public void setDataFormat(DataFormatType value) {
        this.dataFormat = value;
    }

}
