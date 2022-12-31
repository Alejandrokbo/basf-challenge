//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;nonNegativeInteger"&gt;
 *       &lt;attribute name="calculated" type="{}boolean-type" default="no" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "value"
})
@XmlRootElement(name = "number-of-claims")
public class NumberOfClaims {

    @XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected String value;
    @XmlAttribute(name = "calculated")
    protected BooleanType calculated;

    /**
     * Obtiene el valor de la propiedad value.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad calculated.
     *
     * @return possible object is
     * {@link BooleanType }
     */
    public BooleanType getCalculated() {
        if (calculated == null) {
            return BooleanType.NO;
        } else {
            return calculated;
        }
    }

    /**
     * Define el valor de la propiedad calculated.
     *
     * @param value allowed object is
     *              {@link BooleanType }
     */
    public void setCalculated(BooleanType value) {
        this.calculated = value;
    }

}
