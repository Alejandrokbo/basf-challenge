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
 *         &lt;element ref="{}country"/&gt;
 *         &lt;element name="main-classification" type="{}national-main-classification-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="further-classification" type="{}national-further-classification-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="date-changed" type="{}date-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "country",
        "mainClassification",
        "furtherClassification",
        "text"
})
@XmlRootElement(name = "classification-national")
public class ClassificationNational {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "main-classification")
    @JacksonXmlProperty(localName = "main-classification")
    protected List<NationalMainClassificationType> mainClassification;
    @XmlElement(name = "further-classification")
    @JacksonXmlProperty(localName = "further-classification")
    protected List<NationalFurtherClassificationType> furtherClassification;
    protected Text text;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "date-changed")
    protected String dateChanged;

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
     * Gets the value of the mainClassification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainClassification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainClassification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalMainClassificationType }
     */
    public List<NationalMainClassificationType> getMainClassification() {
        if (mainClassification == null) {
            mainClassification = new ArrayList<NationalMainClassificationType>();
        }
        return this.mainClassification;
    }

    /**
     * Gets the value of the furtherClassification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the furtherClassification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFurtherClassification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalFurtherClassificationType }
     */
    public List<NationalFurtherClassificationType> getFurtherClassification() {
        if (furtherClassification == null) {
            furtherClassification = new ArrayList<NationalFurtherClassificationType>();
        }
        return this.furtherClassification;
    }

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
     * Obtiene el valor de la propiedad dateChanged.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateChanged() {
        return dateChanged;
    }

    /**
     * Define el valor de la propiedad dateChanged.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateChanged(String value) {
        this.dateChanged = value;
    }

}
