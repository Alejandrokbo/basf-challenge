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
 *         &lt;element ref="{}document-id" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="family-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="extended-family-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="is-representative"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="YES"/&gt;
 *             &lt;enumeration value="NO"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "documentId"
})
@XmlRootElement(name = "application-reference")
public class ApplicationReference {

    @XmlElement(name = "document-id", required = true)
    @JacksonXmlProperty(localName = "document-id")
    protected List<DocumentId> documentId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "family-id")
    @JacksonXmlProperty(localName = "family-id")
    protected String familyId;
    @JacksonXmlProperty(localName = "extended-family-id")
    @XmlAttribute(name = "extended-family-id")
    protected String extendedFamilyId;

    @XmlAttribute(name = "is-representative")
    protected String isRepresentative;

    /**
     * Gets the value of the documentId property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentId }
     */
    public List<DocumentId> getDocumentId() {
        if (documentId == null) {
            documentId = new ArrayList<DocumentId>();
        }
        return this.documentId;
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
     * Obtiene el valor de la propiedad familyId.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFamilyId() {
        return familyId;
    }

    /**
     * Define el valor de la propiedad familyId.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFamilyId(String value) {
        this.familyId = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedFamilyId.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtendedFamilyId() {
        return extendedFamilyId;
    }

    /**
     * Define el valor de la propiedad extendedFamilyId.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtendedFamilyId(String value) {
        this.extendedFamilyId = value;
    }

    /**
     * Obtiene el valor de la propiedad isRepresentative.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsRepresentative() {
        return isRepresentative;
    }

    /**
     * Define el valor de la propiedad isRepresentative.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsRepresentative(String value) {
        this.isRepresentative = value;
    }

}
