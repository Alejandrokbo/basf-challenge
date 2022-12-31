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
 *         &lt;element ref="{}text" minOccurs="0"/&gt;
 *         &lt;element ref="{}ipc-version-indicator" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-level" minOccurs="0"/&gt;
 *         &lt;group ref="{}classification-group"/&gt;
 *         &lt;element ref="{}symbol-position" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-value" minOccurs="0"/&gt;
 *         &lt;element ref="{}generating-office" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-status" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-data-source" minOccurs="0"/&gt;
 *         &lt;element ref="{}action-date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" type="{}sequence-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "text",
        "ipcVersionIndicator",
        "classificationLevel",
        "section",
        "clazz",
        "subclass",
        "mainGroup",
        "subgroup",
        "symbolPosition",
        "classificationValue",
        "generatingOffice",
        "classificationStatus",
        "classificationDataSource",
        "actionDate"
})
@XmlRootElement(name = "classification-ipcr")
public class ClassificationIpcr {

    protected String text;
    @XmlElement(name = "ipc-version-indicator")
    @JacksonXmlProperty(localName = "ipc-version-indicator")
    protected IpcVersionIndicator ipcVersionIndicator;
    @XmlElement(name = "classification-level")
    @JacksonXmlProperty(localName = "classification-level")
    protected String classificationLevel;
    protected String section;
    @XmlElement(name = "class")
    @JacksonXmlProperty(localName = "class")
    protected String clazz;
    protected String subclass;
    @XmlElement(name = "main-group")
    @JacksonXmlProperty(localName = "main-group")
    protected String mainGroup;
    protected String subgroup;
    @XmlElement(name = "symbol-position")
    @JacksonXmlProperty(localName = "symbol-position")
    protected String symbolPosition;
    @XmlElement(name = "classification-value")
    @JacksonXmlProperty(localName = "classification-value")
    protected String classificationValue;
    @XmlElement(name = "generating-office")
    @JacksonXmlProperty(localName = "generating-office")
    protected GeneratingOffice generatingOffice;
    @XmlElement(name = "classification-status")
    @JacksonXmlProperty(localName = "classification-status")
    protected String classificationStatus;
    @XmlElement(name = "classification-data-source")
    @JacksonXmlProperty(localName = "classification-data-source")
    protected String classificationDataSource;
    @XmlElement(name = "action-date")
    @JacksonXmlProperty(localName = "action-date")
    protected ActionDate actionDate;
    @XmlAttribute(name = "sequence")
    protected String sequence;

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
     * Obtiene el valor de la propiedad ipcVersionIndicator.
     *
     * @return possible object is
     * {@link IpcVersionIndicator }
     */
    public IpcVersionIndicator getIpcVersionIndicator() {
        return ipcVersionIndicator;
    }

    /**
     * Define el valor de la propiedad ipcVersionIndicator.
     *
     * @param value allowed object is
     *              {@link IpcVersionIndicator }
     */
    public void setIpcVersionIndicator(IpcVersionIndicator value) {
        this.ipcVersionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationLevel.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassificationLevel() {
        return classificationLevel;
    }

    /**
     * Define el valor de la propiedad classificationLevel.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassificationLevel(String value) {
        this.classificationLevel = value;
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
     * Obtiene el valor de la propiedad symbolPosition.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSymbolPosition() {
        return symbolPosition;
    }

    /**
     * Define el valor de la propiedad symbolPosition.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSymbolPosition(String value) {
        this.symbolPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationValue.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassificationValue() {
        return classificationValue;
    }

    /**
     * Define el valor de la propiedad classificationValue.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassificationValue(String value) {
        this.classificationValue = value;
    }

    /**
     * Obtiene el valor de la propiedad generatingOffice.
     *
     * @return possible object is
     * {@link GeneratingOffice }
     */
    public GeneratingOffice getGeneratingOffice() {
        return generatingOffice;
    }

    /**
     * Define el valor de la propiedad generatingOffice.
     *
     * @param value allowed object is
     *              {@link GeneratingOffice }
     */
    public void setGeneratingOffice(GeneratingOffice value) {
        this.generatingOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationStatus.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassificationStatus() {
        return classificationStatus;
    }

    /**
     * Define el valor de la propiedad classificationStatus.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassificationStatus(String value) {
        this.classificationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationDataSource.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassificationDataSource() {
        return classificationDataSource;
    }

    /**
     * Define el valor de la propiedad classificationDataSource.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassificationDataSource(String value) {
        this.classificationDataSource = value;
    }

    /**
     * Obtiene el valor de la propiedad actionDate.
     *
     * @return possible object is
     * {@link ActionDate }
     */
    public ActionDate getActionDate() {
        return actionDate;
    }

    /**
     * Define el valor de la propiedad actionDate.
     *
     * @param value allowed object is
     *              {@link ActionDate }
     */
    public void setActionDate(ActionDate value) {
        this.actionDate = value;
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

}
