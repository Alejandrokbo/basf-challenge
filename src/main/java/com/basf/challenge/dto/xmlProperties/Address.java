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
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}address-1" minOccurs="0"/&gt;
 *           &lt;element ref="{}city" minOccurs="0"/&gt;
 *           &lt;element ref="{}state" minOccurs="0"/&gt;
 *           &lt;element ref="{}postcode" minOccurs="0"/&gt;
 *           &lt;element ref="{}country" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}text"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "address1",
        "city",
        "state",
        "postcode",
        "country",
        "text"
})
@XmlRootElement(name = "address")
public class Address {

    @XmlElement(name = "address-1")
    protected String address1;
    protected String city;
    protected String state;
    protected String postcode;
    protected String country;
    protected Text text;

    /**
     * Obtiene el valor de la propiedad address1.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Define el valor de la propiedad address1.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad postcode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Define el valor de la propiedad postcode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountry(String value) {
        this.country = value;
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

}
