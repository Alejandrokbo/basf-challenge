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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="start-date" type="{}date-type" minOccurs="0"/&gt;
 *         &lt;element name="end-date" type="{}date-type" minOccurs="0"/&gt;
 *         &lt;element name="license-type" type="{}licensetype" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="conveyance-type" type="{}conveyance-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "startDate",
        "endDate",
        "licenseType"
})
@XmlRootElement(name = "patent-assignment")
public class PatentAssignment {

    protected String name;
    @XmlElement(name = "start-date")
    protected String startDate;
    @XmlElement(name = "end-date")
    protected String endDate;
    @XmlElement(name = "license-type")
    @XmlSchemaType(name = "string")
    protected Licensetype licenseType;
    @XmlAttribute(name = "conveyance-type")
    protected ConveyanceType conveyanceType;

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad licenseType.
     *
     * @return possible object is
     * {@link Licensetype }
     */
    public Licensetype getLicenseType() {
        return licenseType;
    }

    /**
     * Define el valor de la propiedad licenseType.
     *
     * @param value allowed object is
     *              {@link Licensetype }
     */
    public void setLicenseType(Licensetype value) {
        this.licenseType = value;
    }

    /**
     * Obtiene el valor de la propiedad conveyanceType.
     *
     * @return possible object is
     * {@link ConveyanceType }
     */
    public ConveyanceType getConveyanceType() {
        return conveyanceType;
    }

    /**
     * Define el valor de la propiedad conveyanceType.
     *
     * @param value allowed object is
     *              {@link ConveyanceType }
     */
    public void setConveyanceType(ConveyanceType value) {
        this.conveyanceType = value;
    }

}
