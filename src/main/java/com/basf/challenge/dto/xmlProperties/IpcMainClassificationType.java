//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IPC main classification type.
 *
 *
 * <p>Clase Java para ipc-main-classification-type complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ipc-main-classification-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}ipc-classification-group"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ipc-main-classification-type", propOrder = {
        "text",
        "edition",
        "section",
        "clazz",
        "subclass",
        "mainGroup",
        "subgroup"
})
public class IpcMainClassificationType {

    @XmlElement(required = true)
    protected Text text;
    protected String edition;
    protected String section;
    @XmlElement(name = "class")
    protected String clazz;
    protected String subclass;
    @XmlElement(name = "main-group")
    protected String mainGroup;
    protected String subgroup;

    /**
     * Obtiene el valor de la propiedad text.
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Obtiene el valor de la propiedad edition.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Define el valor de la propiedad edition.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEdition(String value) {
        this.edition = value;
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

}
