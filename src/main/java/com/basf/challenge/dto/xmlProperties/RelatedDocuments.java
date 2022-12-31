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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}addition"/&gt;
 *         &lt;element ref="{}division"/&gt;
 *         &lt;element ref="{}continuation"/&gt;
 *         &lt;element ref="{}continuation-in-part"/&gt;
 *         &lt;element ref="{}reissue"/&gt;
 *         &lt;element ref="{}divisional-reissue"/&gt;
 *         &lt;element ref="{}reexamination"/&gt;
 *         &lt;element ref="{}substitution"/&gt;
 *         &lt;element ref="{}provisional-application"/&gt;
 *         &lt;element ref="{}related-publication"/&gt;
 *         &lt;element ref="{}date-coming-into-force"/&gt;
 *         &lt;element ref="{}continuing-reissue"/&gt;
 *         &lt;element ref="{}reexamination-issue-merger"/&gt;
 *         &lt;element ref="{}utility-model-basis"/&gt;
 *         &lt;element ref="{}previously-filed-application"/&gt;
 *         &lt;element ref="{}correction"/&gt;
 *         &lt;element ref="{}change-of-application"/&gt;
 *         &lt;element ref="{}change-of-utility"/&gt;
 *         &lt;element ref="{}previous-publication"/&gt;
 *         &lt;element ref="{}technical-priority"/&gt;
 *         &lt;element ref="{}supplementary-disclosure"/&gt;
 *         &lt;element ref="{}widerrechtliche-entnahme"/&gt;
 *         &lt;element ref="{}priority"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "additionOrDivisionOrContinuation"
})
@XmlRootElement(name = "related-documents")
public class RelatedDocuments {

    @XmlElements({
            @XmlElement(name = "addition", type = Addition.class),
            @XmlElement(name = "division", type = Division.class),
            @XmlElement(name = "continuation", type = Continuation.class),
            @XmlElement(name = "continuation-in-part", type = ContinuationInPart.class),
            @XmlElement(name = "reissue", type = Reissue.class),
            @XmlElement(name = "divisional-reissue", type = DivisionalReissue.class),
            @XmlElement(name = "reexamination", type = Reexamination.class),
            @XmlElement(name = "substitution", type = Substitution.class),
            @XmlElement(name = "provisional-application", type = ProvisionalApplication.class),
            @XmlElement(name = "related-publication", type = RelatedPublication.class),
            @XmlElement(name = "date-coming-into-force", type = DateComingIntoForce.class),
            @XmlElement(name = "continuing-reissue", type = ContinuingReissue.class),
            @XmlElement(name = "reexamination-issue-merger", type = ReexaminationIssueMerger.class),
            @XmlElement(name = "utility-model-basis", type = UtilityModelBasis.class),
            @XmlElement(name = "previously-filed-application", type = PreviouslyFiledApplication.class),
            @XmlElement(name = "correction", type = Correction.class),
            @XmlElement(name = "change-of-application", type = ChangeOfApplication.class),
            @XmlElement(name = "change-of-utility", type = ChangeOfUtility.class),
            @XmlElement(name = "previous-publication", type = PreviousPublication.class),
            @XmlElement(name = "technical-priority", type = TechnicalPriority.class),
            @XmlElement(name = "supplementary-disclosure", type = SupplementaryDisclosure.class),
            @XmlElement(name = "widerrechtliche-entnahme", type = WiderrechtlicheEntnahme.class),
            @XmlElement(name = "priority", type = Priority.class)
    })
    protected List<Object> additionOrDivisionOrContinuation;

    /**
     * Gets the value of the additionOrDivisionOrContinuation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionOrDivisionOrContinuation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionOrDivisionOrContinuation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addition }
     * {@link Division }
     * {@link Continuation }
     * {@link ContinuationInPart }
     * {@link Reissue }
     * {@link DivisionalReissue }
     * {@link Reexamination }
     * {@link Substitution }
     * {@link ProvisionalApplication }
     * {@link RelatedPublication }
     * {@link DateComingIntoForce }
     * {@link ContinuingReissue }
     * {@link ReexaminationIssueMerger }
     * {@link UtilityModelBasis }
     * {@link PreviouslyFiledApplication }
     * {@link Correction }
     * {@link ChangeOfApplication }
     * {@link ChangeOfUtility }
     * {@link PreviousPublication }
     * {@link TechnicalPriority }
     * {@link SupplementaryDisclosure }
     * {@link WiderrechtlicheEntnahme }
     * {@link Priority }
     */
    public List<Object> getAdditionOrDivisionOrContinuation() {
        if (additionOrDivisionOrContinuation == null) {
            additionOrDivisionOrContinuation = new ArrayList<Object>();
        }
        return this.additionOrDivisionOrContinuation;
    }

}
