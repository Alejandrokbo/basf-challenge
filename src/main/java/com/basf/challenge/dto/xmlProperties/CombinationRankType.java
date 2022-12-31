//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para combination-rankType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="combination-rankType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rank-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="patent-classification" type="{}patent-classificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "combination-rankType", propOrder = {
        "rankNumber",
        "patentClassification"
})
public class CombinationRankType {

    @XmlElement(name = "rank-number", required = true)
    protected String rankNumber;
    @XmlElement(name = "patent-classification", required = true)
    protected PatentClassificationType patentClassification;

    /**
     * Obtiene el valor de la propiedad rankNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRankNumber() {
        return rankNumber;
    }

    /**
     * Define el valor de la propiedad rankNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRankNumber(String value) {
        this.rankNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad patentClassification.
     *
     * @return possible object is
     * {@link PatentClassificationType }
     */
    public PatentClassificationType getPatentClassification() {
        return patentClassification;
    }

    /**
     * Define el valor de la propiedad patentClassification.
     *
     * @param value allowed object is
     *              {@link PatentClassificationType }
     */
    public void setPatentClassification(PatentClassificationType value) {
        this.patentClassification = value;
    }

}
