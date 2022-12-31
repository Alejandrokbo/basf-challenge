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
 * <p>Clase Java para priority-kind.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="priority-kind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="regional"/&gt;
 *     &lt;enumeration value="international"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "priority-kind")
@XmlEnum
public enum PriorityKind {

    @XmlEnumValue("A")
    A("A"),

    @XmlEnumValue("national")
    national("national"),
    @XmlEnumValue("regional")
    regional("regional"),
    @XmlEnumValue("international")
    international("international");
    private final String value;

    PriorityKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriorityKind fromValue(String v) {
        for (PriorityKind c : PriorityKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
