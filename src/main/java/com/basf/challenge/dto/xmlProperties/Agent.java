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
 *         &lt;element ref="{}addressbook" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" use="required" type="{}sequence-type" /&gt;
 *       &lt;attribute name="rep-type" use="required" type="{}representative-type" /&gt;
 *       &lt;attribute name="data-format" type="{}data-format-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "addressbook"
})
@XmlRootElement(name = "agent")
public class Agent {

    @XmlElement(required = true)
    protected List<Addressbook> addressbook;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;
    @XmlAttribute(name = "rep-type", required = true)
    protected RepresentativeType repType;
    @XmlAttribute(name = "data-format")
    protected DataFormatType dataFormat;

    /**
     * Gets the value of the addressbook property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressbook property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressbook().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addressbook }
     */
    public List<Addressbook> getAddressbook() {
        if (addressbook == null) {
            addressbook = new ArrayList<Addressbook>();
        }
        return this.addressbook;
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

    /**
     * Obtiene el valor de la propiedad repType.
     *
     * @return possible object is
     * {@link RepresentativeType }
     */
    public RepresentativeType getRepType() {
        return repType;
    }

    /**
     * Define el valor de la propiedad repType.
     *
     * @param value allowed object is
     *              {@link RepresentativeType }
     */
    public void setRepType(RepresentativeType value) {
        this.repType = value;
    }

    /**
     * Obtiene el valor de la propiedad dataFormat.
     *
     * @return possible object is
     * {@link DataFormatType }
     */
    public DataFormatType getDataFormat() {
        return dataFormat;
    }

    /**
     * Define el valor de la propiedad dataFormat.
     *
     * @param value allowed object is
     *              {@link DataFormatType }
     */
    public void setDataFormat(DataFormatType value) {
        this.dataFormat = value;
    }

}
