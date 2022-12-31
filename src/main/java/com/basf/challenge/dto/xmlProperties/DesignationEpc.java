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
 *         &lt;element ref="{}contracting-states" minOccurs="0"/&gt;
 *         &lt;element ref="{}extension-states" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "contractingStates",
        "extensionStates"
})
@XmlRootElement(name = "designation-epc")
public class DesignationEpc {

    @XmlElement(name = "contracting-states")
    protected ContractingStates contractingStates;
    @XmlElement(name = "extension-states")
    protected ExtensionStates extensionStates;

    /**
     * Obtiene el valor de la propiedad contractingStates.
     *
     * @return possible object is
     * {@link ContractingStates }
     */
    public ContractingStates getContractingStates() {
        return contractingStates;
    }

    /**
     * Define el valor de la propiedad contractingStates.
     *
     * @param value allowed object is
     *              {@link ContractingStates }
     */
    public void setContractingStates(ContractingStates value) {
        this.contractingStates = value;
    }

    /**
     * Obtiene el valor de la propiedad extensionStates.
     *
     * @return possible object is
     * {@link ExtensionStates }
     */
    public ExtensionStates getExtensionStates() {
        return extensionStates;
    }

    /**
     * Define el valor de la propiedad extensionStates.
     *
     * @param value allowed object is
     *              {@link ExtensionStates }
     */
    public void setExtensionStates(ExtensionStates value) {
        this.extensionStates = value;
    }

}
