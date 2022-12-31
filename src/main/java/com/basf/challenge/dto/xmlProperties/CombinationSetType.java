//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para combination-setType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="combination-setType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="group-number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="combination-rank" type="{}combination-rankType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "combination-setType", propOrder = {
        "groupNumber",
        "combinationRank"
})
public class CombinationSetType {

    @XmlElement(name = "group-number", required = true)
    protected String groupNumber;
    @XmlElement(name = "combination-rank", required = true)
    protected List<CombinationRankType> combinationRank;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;

    /**
     * Obtiene el valor de la propiedad groupNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * Define el valor de la propiedad groupNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the combinationRank property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinationRank property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationRank().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinationRankType }
     */
    public List<CombinationRankType> getCombinationRank() {
        if (combinationRank == null) {
            combinationRank = new ArrayList<CombinationRankType>();
        }
        return this.combinationRank;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad sequence.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}
