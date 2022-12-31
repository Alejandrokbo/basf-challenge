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
 *         &lt;element ref="{}designation-pct" minOccurs="0"/&gt;
 *         &lt;element ref="{}designation-epc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "designationPct",
        "designationEpc"
})
@XmlRootElement(name = "designation-of-states")
public class DesignationOfStates {

    @XmlElement(name = "designation-pct")
    protected DesignationPct designationPct;
    @XmlElement(name = "designation-epc")
    protected DesignationEpc designationEpc;

    /**
     * Obtiene el valor de la propiedad designationPct.
     *
     * @return possible object is
     * {@link DesignationPct }
     */
    public DesignationPct getDesignationPct() {
        return designationPct;
    }

    /**
     * Define el valor de la propiedad designationPct.
     *
     * @param value allowed object is
     *              {@link DesignationPct }
     */
    public void setDesignationPct(DesignationPct value) {
        this.designationPct = value;
    }

    /**
     * Obtiene el valor de la propiedad designationEpc.
     *
     * @return possible object is
     * {@link DesignationEpc }
     */
    public DesignationEpc getDesignationEpc() {
        return designationEpc;
    }

    /**
     * Define el valor de la propiedad designationEpc.
     *
     * @param value allowed object is
     *              {@link DesignationEpc }
     */
    public void setDesignationEpc(DesignationEpc value) {
        this.designationEpc = value;
    }

}
