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
 *         &lt;element ref="{}unexamined-printed-without-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}publication-of-grant-date" minOccurs="0"/&gt;
 *         &lt;element ref="{}term-of-grant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "unexaminedPrintedWithoutGrant",
        "publicationOfGrantDate",
        "termOfGrant"
})
@XmlRootElement(name = "dates-of-public-availability")
public class DatesOfPublicAvailability {

    @XmlElement(name = "unexamined-printed-without-grant")
    protected UnexaminedPrintedWithoutGrant unexaminedPrintedWithoutGrant;
    @XmlElement(name = "publication-of-grant-date")
    @JacksonXmlProperty(localName = "publication-of-grant-date")
    protected PublicationOfGrantDate publicationOfGrantDate;
    @XmlElement(name = "term-of-grant")
    protected TermOfGrant termOfGrant;

    /**
     * Obtiene el valor de la propiedad unexaminedPrintedWithoutGrant.
     *
     * @return possible object is
     * {@link UnexaminedPrintedWithoutGrant }
     */
    public UnexaminedPrintedWithoutGrant getUnexaminedPrintedWithoutGrant() {
        return unexaminedPrintedWithoutGrant;
    }

    /**
     * Define el valor de la propiedad unexaminedPrintedWithoutGrant.
     *
     * @param value allowed object is
     *              {@link UnexaminedPrintedWithoutGrant }
     */
    public void setUnexaminedPrintedWithoutGrant(UnexaminedPrintedWithoutGrant value) {
        this.unexaminedPrintedWithoutGrant = value;
    }

    /**
     * Obtiene el valor de la propiedad publicationOfGrantDate.
     *
     * @return possible object is
     * {@link PublicationOfGrantDate }
     */
    public PublicationOfGrantDate getPublicationOfGrantDate() {
        return publicationOfGrantDate;
    }

    /**
     * Define el valor de la propiedad publicationOfGrantDate.
     *
     * @param value allowed object is
     *              {@link PublicationOfGrantDate }
     */
    public void setPublicationOfGrantDate(PublicationOfGrantDate value) {
        this.publicationOfGrantDate = value;
    }

    /**
     * Obtiene el valor de la propiedad termOfGrant.
     *
     * @return possible object is
     * {@link TermOfGrant }
     */
    public TermOfGrant getTermOfGrant() {
        return termOfGrant;
    }

    /**
     * Define el valor de la propiedad termOfGrant.
     *
     * @param value allowed object is
     *              {@link TermOfGrant }
     */
    public void setTermOfGrant(TermOfGrant value) {
        this.termOfGrant = value;
    }

}
