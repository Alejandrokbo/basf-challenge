//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;choice&gt;
 *         &lt;element ref="{}text" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}document-id" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="npl-type" type="{}citation-type" /&gt;
 *       &lt;attribute name="medium" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "text",
        "documentId"
})
@XmlRootElement(name = "nplcit")
public class Nplcit {

    protected List<Text> text;
    @XmlElement(name = "document-id")
    protected List<DocumentId> documentId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "num")
    protected String num;
    @XmlAttribute(name = "lang")
    protected String lang;
    @XmlAttribute(name = "file")
    protected String file;
    @XmlAttribute(name = "npl-type")
    protected String nplType;
    @XmlAttribute(name = "medium")
    protected String medium;
    @XmlAttribute(name = "url")
    protected String url;

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
     * Gets the value of the documentId property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentId }
     */
    public List<DocumentId> getDocumentId() {
        if (documentId == null) {
            documentId = new ArrayList<DocumentId>();
        }
        return this.documentId;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad num.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNum() {
        return num;
    }

    /**
     * Define el valor de la propiedad num.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNum(String value) {
        this.num = value;
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
     * Obtiene el valor de la propiedad nplType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNplType() {
        return nplType;
    }

    /**
     * Define el valor de la propiedad nplType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNplType(String value) {
        this.nplType = value;
    }

    /**
     * Obtiene el valor de la propiedad medium.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMedium() {
        return medium;
    }

    /**
     * Define el valor de la propiedad medium.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
