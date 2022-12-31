//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}priority-claim"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "priorityClaim"
})
@XmlRootElement(name = "priority-claims")
public class PriorityClaims {

    @XmlElement(name = "priority-claim", required = true)
    @JacksonXmlProperty(localName = "priority-claim")
    protected List<PriorityClaim> priorityClaim;

    /**
     * Gets the value of the priorityClaim property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityClaim property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityClaim().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityClaim }
     */
    public List<PriorityClaim> getPriorityClaim() {
        if (priorityClaim == null) {
            priorityClaim = new ArrayList<PriorityClaim>();
        }
        return this.priorityClaim;
    }

}
