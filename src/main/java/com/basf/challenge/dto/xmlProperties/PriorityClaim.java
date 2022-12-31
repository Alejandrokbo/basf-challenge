//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}doc-number"/&gt;
 *         &lt;element ref="{}date" minOccurs="0"/&gt;
 *         &lt;element name="priority-linkage-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority-active-indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="sequence" use="required" type="{}sequence-type" /&gt;
 *       &lt;attribute name="kind" type="{}priority-kind" /&gt;
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
        "date",
        "priorityLinkageType",
        "priorityActiveIndicator"
})
@XmlRootElement(name = "priority-claim")
public class PriorityClaim {

    protected String country;
    @XmlElement(name = "doc-number", required = true)
    @JacksonXmlProperty(localName = "doc-number")
    protected String docNumber;
    protected String date;
    @XmlElement(name = "priority-linkage-type")
    protected String priorityLinkageType;
    @XmlElement(name = "priority-active-indicator")
    @JacksonXmlProperty(localName = "priority-active-indicator")
    protected String priorityActiveIndicator;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;
    @XmlAttribute(name = "kind")
    protected PriorityKind kind;
    @XmlAttribute(name = "data-format")
    @JacksonXmlProperty(localName = "data-format")
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
     * Obtiene el valor de la propiedad priorityLinkageType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPriorityLinkageType() {
        return priorityLinkageType;
    }

    /**
     * Define el valor de la propiedad priorityLinkageType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPriorityLinkageType(String value) {
        this.priorityLinkageType = value;
    }

    /**
     * Obtiene el valor de la propiedad priorityActiveIndicator.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPriorityActiveIndicator() {
        return priorityActiveIndicator;
    }

    /**
     * Define el valor de la propiedad priorityActiveIndicator.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPriorityActiveIndicator(String value) {
        this.priorityActiveIndicator = value;
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
     * Obtiene el valor de la propiedad sequence.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     *
     * @return possible object is
     * {@link PriorityKind }
     */
    public PriorityKind getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     *
     * @param value allowed object is
     *              {@link PriorityKind }
     */
    public void setKind(PriorityKind value) {
        this.kind = value;
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
