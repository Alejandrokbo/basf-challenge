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
 *         &lt;group ref="{}name-group"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "orgname",
        "orgName",
        "department",
        "registeredNumber"
})
@XmlRootElement(name = "primary-examiner")
public class PrimaryExaminer {

    protected Name name;
    protected String orgname;
    @XmlElement(name = "org-name")
    protected String orgName;
    protected String department;
    @XmlElement(name = "registered-number")
    protected String registeredNumber;

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return possible object is
     * {@link Name }
     */
    public Name getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link Name }
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad orgname.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Define el valor de la propiedad orgname.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Obtiene el valor de la propiedad orgName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Define el valor de la propiedad orgName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Obtiene el valor de la propiedad department.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Define el valor de la propiedad department.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Obtiene el valor de la propiedad registeredNumber.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegisteredNumber() {
        return registeredNumber;
    }

    /**
     * Define el valor de la propiedad registeredNumber.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegisteredNumber(String value) {
        this.registeredNumber = value;
    }

}
