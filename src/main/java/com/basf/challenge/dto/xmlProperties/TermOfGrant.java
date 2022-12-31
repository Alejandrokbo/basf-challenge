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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;element ref="{}disclaimer"/&gt;
 *         &lt;element ref="{}us-term-extension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "textOrDisclaimerOrUsTermExtension"
})
@XmlRootElement(name = "term-of-grant")
public class TermOfGrant {

    @XmlElements({
            @XmlElement(name = "text", type = Text.class),
            @XmlElement(name = "disclaimer", type = Disclaimer.class),
            @XmlElement(name = "us-term-extension", type = String.class)
    })
    protected List<Object> textOrDisclaimerOrUsTermExtension;

    /**
     * Gets the value of the textOrDisclaimerOrUsTermExtension property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrDisclaimerOrUsTermExtension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrDisclaimerOrUsTermExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Disclaimer }
     * {@link String }
     */
    public List<Object> getTextOrDisclaimerOrUsTermExtension() {
        if (textOrDisclaimerOrUsTermExtension == null) {
            textOrDisclaimerOrUsTermExtension = new ArrayList<Object>();
        }
        return this.textOrDisclaimerOrUsTermExtension;
    }

}
