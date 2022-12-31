//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

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
 *       &lt;choice&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element ref="{}heading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}claim" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="format" type="{}data-format-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "headingAndClaim"
})
@XmlRootElement(name = "amended-claims")
public class AmendedClaims {

    @XmlElements({
            @XmlElement(name = "heading", type = Heading.class),
            @XmlElement(name = "claim", type = Claim.class)
    })
    protected List<Object> headingAndClaim;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "lang", required = true)
    protected String lang;
    @XmlAttribute(name = "format")
    protected DataFormatType format;

    /**
     * Gets the value of the headingAndClaim property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headingAndClaim property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadingAndClaim().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Heading }
     * {@link Claim }
     */
    public List<Object> getHeadingAndClaim() {
        if (headingAndClaim == null) {
            headingAndClaim = new ArrayList<Object>();
        }
        return this.headingAndClaim;
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
     * Obtiene el valor de la propiedad format.
     *
     * @return possible object is
     * {@link DataFormatType }
     */
    public DataFormatType getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     *
     * @param value allowed object is
     *              {@link DataFormatType }
     */
    public void setFormat(DataFormatType value) {
        this.format = value;
    }

}
