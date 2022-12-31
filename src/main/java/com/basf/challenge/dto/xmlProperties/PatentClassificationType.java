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


/**
 * <p>Clase Java para patent-classificationType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="patent-classificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classification-scheme"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="office" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="scheme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="classification-symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="subclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="main-group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="subgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="classification-level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symbol-position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classification-value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classification-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classification-data-source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generating-office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}action-date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patent-classificationType", propOrder = {
        "classificationScheme",
        "classificationSymbol",
        "section",
        "clazz",
        "subclass",
        "mainGroup",
        "subgroup",
        "classificationLevel",
        "symbolPosition",
        "classificationValue",
        "classificationStatus",
        "classificationDataSource",
        "generatingOffice",
        "actionDate"
})
public class PatentClassificationType {

    @XmlElement(name = "classification-scheme", required = true)
    protected PatentClassificationType.ClassificationScheme classificationScheme;
    @XmlElement(name = "classification-symbol", required = true)
    protected String classificationSymbol;
    protected String section;
    @XmlElement(name = "class")
    protected String clazz;
    protected String subclass;
    @XmlElement(name = "main-group")
    protected String mainGroup;
    protected String subgroup;
    @XmlElement(name = "classification-level")
    protected String classificationLevel;
    @XmlElement(name = "symbol-position")
    protected String symbolPosition;
    @XmlElement(name = "classification-value")
    protected String classificationValue;
    @XmlElement(name = "classification-status")
    protected String classificationStatus;
    @XmlElement(name = "classification-data-source")
    protected String classificationDataSource;
    @XmlElement(name = "generating-office")
    protected String generatingOffice;
    @XmlElement(name = "action-date")
    protected ActionDate actionDate;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "sequence")
    protected String sequence;

    /**
     * Obtiene el valor de la propiedad classificationScheme.
     *
     * @return possible object is
     * {@link ClassificationScheme }
     */
    public ClassificationScheme getClassificationScheme() {
        return classificationScheme;
    }

    /**
     * Define el valor de la propiedad classificationScheme.
     *
     * @param value allowed object is
     *              {@link ClassificationScheme }
     */
    public void setClassificationScheme(ClassificationScheme value) {
        this.classificationScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationSymbol.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassificationSymbol() {
        return classificationSymbol;
    }

    /**
     * Define el valor de la propiedad classificationSymbol.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassificationSymbol(String value) {
        this.classificationSymbol = value;
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
     * Obtiene el valor de la propiedad generatingOffice.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGeneratingOffice() {
        return generatingOffice;
    }

    /**
     * Define el valor de la propiedad generatingOffice.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGeneratingOffice(String value) {
        this.generatingOffice = value;
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
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
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
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="office" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="scheme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "edition",
            "date"
    })
    public static class ClassificationScheme {

        protected String edition;
        protected String date;
        @XmlAttribute(name = "office", required = true)
        protected String office;
        @XmlAttribute(name = "scheme", required = true)
        protected String scheme;

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
         * Obtiene el valor de la propiedad office.
         *
         * @return possible object is
         * {@link String }
         */
        public String getOffice() {
            return office;
        }

        /**
         * Define el valor de la propiedad office.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOffice(String value) {
            this.office = value;
        }

        /**
         * Obtiene el valor de la propiedad scheme.
         *
         * @return possible object is
         * {@link String }
         */
        public String getScheme() {
            return scheme;
        }

        /**
         * Define el valor de la propiedad scheme.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setScheme(String value) {
            this.scheme = value;
        }

    }

}
