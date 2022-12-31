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
 *       &lt;attribute name="data-format" type="{}data-format-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content"
})
@XmlRootElement(name = "image-key")
public class ImageKey {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "data-format")
    @JacksonXmlProperty(localName = "data-format")
    protected DataFormatType dataFormat;

    /**
     * Obtiene el valor de la propiedad content.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContent() {
        return content;
    }

    /**
     * Define el valor de la propiedad content.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContent(String value) {
        this.content = value;
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
