//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

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
 *         &lt;element ref="{}document-id" minOccurs="0"/&gt;
 *         &lt;element ref="{}parent-status" minOccurs="0"/&gt;
 *         &lt;element ref="{}parent-grant-document" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "documentId",
        "parentStatus",
        "parentGrantDocument"
})
@XmlRootElement(name = "parent-doc")
public class ParentDoc {

    @XmlElement(name = "document-id")
    protected DocumentId documentId;
    @XmlElement(name = "parent-status")
    protected String parentStatus;
    @XmlElement(name = "parent-grant-document")
    protected ParentGrantDocument parentGrantDocument;

    /**
     * Obtiene el valor de la propiedad documentId.
     *
     * @return possible object is
     * {@link DocumentId }
     */
    public DocumentId getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     *
     * @param value allowed object is
     *              {@link DocumentId }
     */
    public void setDocumentId(DocumentId value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad parentStatus.
     *
     * @return possible object is
     * {@link String }
     */
    public String getParentStatus() {
        return parentStatus;
    }

    /**
     * Define el valor de la propiedad parentStatus.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setParentStatus(String value) {
        this.parentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad parentGrantDocument.
     *
     * @return possible object is
     * {@link ParentGrantDocument }
     */
    public ParentGrantDocument getParentGrantDocument() {
        return parentGrantDocument;
    }

    /**
     * Define el valor de la propiedad parentGrantDocument.
     *
     * @param value allowed object is
     *              {@link ParentGrantDocument }
     */
    public void setParentGrantDocument(ParentGrantDocument value) {
        this.parentGrantDocument = value;
    }

}
