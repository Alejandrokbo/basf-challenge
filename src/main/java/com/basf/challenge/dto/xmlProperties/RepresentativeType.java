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
 * <p>Clase Java para representative-type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="representative-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agent"/&gt;
 *     &lt;enumeration value="attorney"/&gt;
 *     &lt;enumeration value="common-representative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "representative-type")
@XmlEnum
public enum RepresentativeType {

    @XmlEnumValue("agent")
    AGENT("agent"),
    @XmlEnumValue("attorney")
    ATTORNEY("attorney"),
    @XmlEnumValue("common-representative")
    COMMON_REPRESENTATIVE("common-representative");
    private final String value;

    RepresentativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RepresentativeType fromValue(String v) {
        for (RepresentativeType c : RepresentativeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
