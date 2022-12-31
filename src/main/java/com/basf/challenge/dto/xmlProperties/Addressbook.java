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


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{}name-group"/&gt;
 *           &lt;element ref="{}address" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}text"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="lang" type="{}language-type" /&gt;
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
        "registeredNumber",
        "address",
        "text"
})
@XmlRootElement(name = "addressbook")
public class Addressbook {

    protected String name;
    protected String orgname;
    @XmlElement(name = "org-name")
    protected String orgName;
    protected String department;
    @XmlElement(name = "registered-number")
    protected String registeredNumber;
    protected Address address;
    protected Text text;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang")
    protected String lang;

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return possible object is
     * {@link Name }
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link Name }
     */
    public void setName(String value) {
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

    /**
     * Obtiene el valor de la propiedad address.
     *
     * @return possible object is
     * {@link Address }
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     *
     * @param value allowed object is
     *              {@link Address }
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad text.
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setText(Text value) {
        this.text = value;
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
     * Obtiene el valor de la propiedad lang.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
