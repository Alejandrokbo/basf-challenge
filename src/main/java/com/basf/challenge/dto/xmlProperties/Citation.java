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
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}patcit"/&gt;
 *           &lt;element ref="{}nplcit"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}category" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-ipc" minOccurs="0"/&gt;
 *         &lt;element ref="{}classifications-ipcr" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-national" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srep-phase" type="{}text-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "patcit",
        "nplcit",
        "category",
        "classificationIpc",
        "classificationsIpcr",
        "classificationNational"
})
@XmlRootElement(name = "citation")
public class Citation {

    protected Patcit patcit;
    protected Nplcit nplcit;
    protected List<String> category;
    @XmlElement(name = "classification-ipc")
    protected ClassificationIpc classificationIpc;
    @XmlElement(name = "classifications-ipcr")
    protected ClassificationsIpcr classificationsIpcr;
    @XmlElement(name = "classification-national")
    protected ClassificationNational classificationNational;
    @XmlAttribute(name = "srep-phase")
    protected String srepPhase;

    /**
     * Obtiene el valor de la propiedad patcit.
     *
     * @return possible object is
     * {@link Patcit }
     */
    public Patcit getPatcit() {
        return patcit;
    }

    /**
     * Define el valor de la propiedad patcit.
     *
     * @param value allowed object is
     *              {@link Patcit }
     */
    public void setPatcit(Patcit value) {
        this.patcit = value;
    }

    /**
     * Obtiene el valor de la propiedad nplcit.
     *
     * @return possible object is
     * {@link Nplcit }
     */
    public Nplcit getNplcit() {
        return nplcit;
    }

    /**
     * Define el valor de la propiedad nplcit.
     *
     * @param value allowed object is
     *              {@link Nplcit }
     */
    public void setNplcit(Nplcit value) {
        this.nplcit = value;
    }

    /**
     * Gets the value of the category property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    /**
     * Obtiene el valor de la propiedad classificationIpc.
     *
     * @return possible object is
     * {@link ClassificationIpc }
     */
    public ClassificationIpc getClassificationIpc() {
        return classificationIpc;
    }

    /**
     * Define el valor de la propiedad classificationIpc.
     *
     * @param value allowed object is
     *              {@link ClassificationIpc }
     */
    public void setClassificationIpc(ClassificationIpc value) {
        this.classificationIpc = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationsIpcr.
     *
     * @return possible object is
     * {@link ClassificationsIpcr }
     */
    public ClassificationsIpcr getClassificationsIpcr() {
        return classificationsIpcr;
    }

    /**
     * Define el valor de la propiedad classificationsIpcr.
     *
     * @param value allowed object is
     *              {@link ClassificationsIpcr }
     */
    public void setClassificationsIpcr(ClassificationsIpcr value) {
        this.classificationsIpcr = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationNational.
     *
     * @return possible object is
     * {@link ClassificationNational }
     */
    public ClassificationNational getClassificationNational() {
        return classificationNational;
    }

    /**
     * Define el valor de la propiedad classificationNational.
     *
     * @param value allowed object is
     *              {@link ClassificationNational }
     */
    public void setClassificationNational(ClassificationNational value) {
        this.classificationNational = value;
    }

    /**
     * Obtiene el valor de la propiedad srepPhase.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSrepPhase() {
        return srepPhase;
    }

    /**
     * Define el valor de la propiedad srepPhase.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSrepPhase(String value) {
        this.srepPhase = value;
    }

}
