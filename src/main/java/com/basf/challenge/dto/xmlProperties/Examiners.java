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
 *         &lt;element ref="{}primary-examiner" minOccurs="0"/&gt;
 *         &lt;element ref="{}assistant-examiner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "primaryExaminer",
        "assistantExaminer"
})
@XmlRootElement(name = "examiners")
public class Examiners {

    @XmlElement(name = "primary-examiner")
    protected PrimaryExaminer primaryExaminer;
    @XmlElement(name = "assistant-examiner")
    protected AssistantExaminer assistantExaminer;

    /**
     * Obtiene el valor de la propiedad primaryExaminer.
     *
     * @return possible object is
     * {@link PrimaryExaminer }
     */
    public PrimaryExaminer getPrimaryExaminer() {
        return primaryExaminer;
    }

    /**
     * Define el valor de la propiedad primaryExaminer.
     *
     * @param value allowed object is
     *              {@link PrimaryExaminer }
     */
    public void setPrimaryExaminer(PrimaryExaminer value) {
        this.primaryExaminer = value;
    }

    /**
     * Obtiene el valor de la propiedad assistantExaminer.
     *
     * @return possible object is
     * {@link AssistantExaminer }
     */
    public AssistantExaminer getAssistantExaminer() {
        return assistantExaminer;
    }

    /**
     * Define el valor de la propiedad assistantExaminer.
     *
     * @param value allowed object is
     *              {@link AssistantExaminer }
     */
    public void setAssistantExaminer(AssistantExaminer value) {
        this.assistantExaminer = value;
    }

}
