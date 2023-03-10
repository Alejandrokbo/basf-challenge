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
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}claim-text" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="claim-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "claimText"
})
@XmlRootElement(name = "claim")
public class Claim {

    @XmlElement(name = "claim-text", required = true)
    protected List<ClaimText> claimText;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "num")
    protected String num;
    @XmlAttribute(name = "claim-type")
    protected String claimType;

    /**
     * Gets the value of the claimText property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimText property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimText }
     */
    public List<ClaimText> getClaimText() {
        if (claimText == null) {
            claimText = new ArrayList<ClaimText>();
        }
        return this.claimText;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad num.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNum() {
        return num;
    }

    /**
     * Define el valor de la propiedad num.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Obtiene el valor de la propiedad claimType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Define el valor de la propiedad claimType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

}
