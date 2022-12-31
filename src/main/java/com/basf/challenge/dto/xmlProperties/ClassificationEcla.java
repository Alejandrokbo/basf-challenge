//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{}text"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;group ref="{}classification-group"/&gt;
 *           &lt;element ref="{}examiner-edition" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{}sequence-type" /&gt;
 *       &lt;attribute name="country" type="{}country-type" default="EP" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "text",
        "section",
        "clazz",
        "subclass",
        "mainGroup",
        "subgroup",
        "examinerEdition"
})
@XmlRootElement(name = "classification-ecla")
public class ClassificationEcla {

    @XmlElement(required = true)
    protected String text;
    protected String section;
    @XmlElement(name = "class")
    @JacksonXmlProperty(localName = "class")
    protected String clazz;
    protected String subclass;
    @XmlElement(name = "main-group")
    @JacksonXmlProperty(localName = "main-group")
    protected String mainGroup;
    protected String subgroup;
    @XmlElement(name = "examiner-edition")
    protected String examinerEdition;
    @XmlAttribute(name = "sequence")
    protected String sequence;
    @XmlAttribute(name = "country")
    protected String country;

    /**
     * Obtiene el valor de la propiedad text.
     *
     * @return possible object is
     * {@link Text }
     */
    public String getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtiene el valor de la propiedad section.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSection() {
        return section;
    }

    /**
     * Define el valor de la propiedad section.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Obtiene el valor de la propiedad clazz.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Obtiene el valor de la propiedad subclass.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubclass() {
        return subclass;
    }

    /**
     * Define el valor de la propiedad subclass.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubclass(String value) {
        this.subclass = value;
    }

    /**
     * Obtiene el valor de la propiedad mainGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMainGroup() {
        return mainGroup;
    }

    /**
     * Define el valor de la propiedad mainGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMainGroup(String value) {
        this.mainGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad subgroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubgroup() {
        return subgroup;
    }

    /**
     * Define el valor de la propiedad subgroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubgroup(String value) {
        this.subgroup = value;
    }

    /**
     * Obtiene el valor de la propiedad examinerEdition.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExaminerEdition() {
        return examinerEdition;
    }

    /**
     * Define el valor de la propiedad examinerEdition.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExaminerEdition(String value) {
        this.examinerEdition = value;
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
     * Obtiene el valor de la propiedad country.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountry() {
        if (country == null) {
            return "EP";
        } else {
            return country;
        }
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

}
