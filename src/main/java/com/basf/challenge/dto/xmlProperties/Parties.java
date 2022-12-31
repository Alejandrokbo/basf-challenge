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
 *         &lt;element ref="{}applicants" minOccurs="0"/&gt;
 *         &lt;element ref="{}inventors" minOccurs="0"/&gt;
 *         &lt;element ref="{}agents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="date-changed" type="{}date-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "applicants",
        "inventors",
        "agents"
})
@XmlRootElement(name = "parties")
public class Parties {

    protected Applicants applicants;
    protected Inventors inventors;
    protected Agents agents;
    @XmlAttribute(name = "date-changed")
    protected String dateChanged;

    /**
     * Obtiene el valor de la propiedad applicants.
     *
     * @return possible object is
     * {@link Applicants }
     */
    public Applicants getApplicants() {
        return applicants;
    }

    /**
     * Define el valor de la propiedad applicants.
     *
     * @param value allowed object is
     *              {@link Applicants }
     */
    public void setApplicants(Applicants value) {
        this.applicants = value;
    }

    /**
     * Obtiene el valor de la propiedad inventors.
     *
     * @return possible object is
     * {@link Inventors }
     */
    public Inventors getInventors() {
        return inventors;
    }

    /**
     * Define el valor de la propiedad inventors.
     *
     * @param value allowed object is
     *              {@link Inventors }
     */
    public void setInventors(Inventors value) {
        this.inventors = value;
    }

    /**
     * Obtiene el valor de la propiedad agents.
     *
     * @return possible object is
     * {@link Agents }
     */
    public Agents getAgents() {
        return agents;
    }

    /**
     * Define el valor de la propiedad agents.
     *
     * @param value allowed object is
     *              {@link Agents }
     */
    public void setAgents(Agents value) {
        this.agents = value;
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
