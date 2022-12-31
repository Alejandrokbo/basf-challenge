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
 *         &lt;element ref="{}number-of-drawing-sheets" minOccurs="0"/&gt;
 *         &lt;element ref="{}number-of-figures" minOccurs="0"/&gt;
 *         &lt;element ref="{}image-key" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "numberOfDrawingSheets",
        "numberOfFigures",
        "imageKey"
})
@XmlRootElement(name = "figures")
public class Figures {

    @XmlElement(name = "number-of-drawing-sheets")
    @JacksonXmlProperty(localName = "number-of-drawing-sheets")
    protected String numberOfDrawingSheets;
    @XmlElement(name = "number-of-figures")
    @JacksonXmlProperty(localName = "number-of-figures")
    protected String numberOfFigures;
    @XmlElement(name = "image-key")
    @JacksonXmlProperty(localName = "image-key")
    protected ImageKey imageKey;

    /**
     * Obtiene el valor de la propiedad numberOfDrawingSheets.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumberOfDrawingSheets() {
        return numberOfDrawingSheets;
    }

    /**
     * Define el valor de la propiedad numberOfDrawingSheets.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumberOfDrawingSheets(String value) {
        this.numberOfDrawingSheets = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfFigures.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumberOfFigures() {
        return numberOfFigures;
    }

    /**
     * Define el valor de la propiedad numberOfFigures.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumberOfFigures(String value) {
        this.numberOfFigures = value;
    }

    /**
     * Obtiene el valor de la propiedad imageKey.
     *
     * @return possible object is
     * {@link ImageKey }
     */
    public ImageKey getImageKey() {
        return imageKey;
    }

    /**
     * Define el valor de la propiedad imageKey.
     *
     * @param value allowed object is
     *              {@link ImageKey }
     */
    public void setImageKey(ImageKey value) {
        this.imageKey = value;
    }

}
