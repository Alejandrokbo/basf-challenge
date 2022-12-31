//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para data-format-type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="data-format-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="equivalent"/&gt;
 *     &lt;enumeration value="original"/&gt;
 *     &lt;enumeration value="machine_translation"/&gt;
 *     &lt;enumeration value="first_claim"/&gt;
 *     &lt;enumeration value="human_translation"/&gt;
 *     &lt;enumeration value="transcript"/&gt;
 *     &lt;enumeration value="family_abstract"/&gt;
 *     &lt;enumeration value="docdb"/&gt;
 *     &lt;enumeration value="questel"/&gt;
 *     &lt;enumeration value="questel_Uid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "data-format-type")
@XmlEnum
public enum DataFormatType {

    @XmlEnumValue("equivalent")
    equivalent("equivalent"),
    @XmlEnumValue("original")
    original("original"),
    @XmlEnumValue("machine_translation")
    machine_translation("machine_translation"),
    @XmlEnumValue("first_claim")
    first_claim("first_claim"),
    @XmlEnumValue("human_translation")
    human_translation("human_translation"),
    @XmlEnumValue("transcript")
    transcript("transcript"),
    @XmlEnumValue("family_abstract")
    family_abstract("family_abstract"),
    @XmlEnumValue("docdb")
    docdb("docdb"),
    @XmlEnumValue("questel")
    questel("questel"),
    @XmlEnumValue("questel_Uid")
    questel_Uid("questel_Uid");
    private final String value;

    DataFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataFormatType fromValue(String v) {
        for (DataFormatType c : DataFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
