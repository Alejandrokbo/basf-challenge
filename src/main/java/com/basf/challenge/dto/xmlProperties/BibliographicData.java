//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
 *         &lt;element ref="{}publication-reference" minOccurs="0"/&gt;
 *         &lt;element ref="{}original-publication-kind" minOccurs="0"/&gt;
 *         &lt;element ref="{}application-reference" minOccurs="0"/&gt;
 *         &lt;element ref="{}language-of-filing" minOccurs="0"/&gt;
 *         &lt;element ref="{}language-of-publication" minOccurs="0"/&gt;
 *         &lt;element ref="{}priority-claims" minOccurs="0"/&gt;
 *         &lt;element ref="{}dates-of-public-availability" minOccurs="0"/&gt;
 *         &lt;element ref="{}term-of-grant" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-ipc" minOccurs="0"/&gt;
 *         &lt;element ref="{}classifications-ipcr" minOccurs="0"/&gt;
 *         &lt;element ref="{}classification-national" minOccurs="0"/&gt;
 *         &lt;element ref="{}classifications-ecla" minOccurs="0"/&gt;
 *         &lt;element ref="{}patent-classifications" minOccurs="0"/&gt;
 *         &lt;element ref="{}field-of-search" minOccurs="0"/&gt;
 *         &lt;element ref="{}number-of-claims" minOccurs="0"/&gt;
 *         &lt;element ref="{}exemplary-claim" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}independent-claims" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}figures" minOccurs="0"/&gt;
 *         &lt;element ref="{}invention-title" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}references-cited" minOccurs="0"/&gt;
 *         &lt;element ref="{}forward-patent-citations" minOccurs="0"/&gt;
 *         &lt;element ref="{}related-documents" minOccurs="0"/&gt;
 *         &lt;element ref="{}parties" minOccurs="0"/&gt;
 *         &lt;element ref="{}examiners" minOccurs="0"/&gt;
 *         &lt;element ref="{}designation-of-states" minOccurs="0"/&gt;
 *         &lt;element ref="{}pct-or-regional-filing-data" minOccurs="0"/&gt;
 *         &lt;element ref="{}pct-or-regional-publishing-data" minOccurs="0"/&gt;
 *         &lt;element ref="{}lgst-data" minOccurs="0"/&gt;
 *         &lt;element ref="{}patent-assignments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{}language-type" /&gt;
 *       &lt;attribute name="date-changed" type="{}date-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "publicationReference",
        "originalPublicationKind",
        "applicationReference",
        "languageOfFiling",
        "languageOfPublication",
        "priorityClaims",
        "datesOfPublicAvailability",
        "termOfGrant",
        "classificationIpc",
        "classificationsIpcr",
        "classificationNational",
        "classificationsEcla",
        "patentClassifications",
        "fieldOfSearch",
        "numberOfClaims",
        "exemplaryClaim",
        "independentClaims",
        "figures",
        "inventionTitle",
        "referencesCited",
        "forwardPatentCitations",
        "relatedDocuments",
        "parties",
        "examiners",
        "designationOfStates",
        "pctOrRegionalFilingData",
        "pctOrRegionalPublishingData",
        "lgstData",
        "patentAssignments"
})
@XmlRootElement(name = "bibliographic-data")
public class BibliographicData {

    @XmlElement(name = "publication-reference")
    @JacksonXmlProperty(localName = "publication-reference")
    protected PublicationReference publicationReference;
    @XmlElement(name = "original-publication-kind")
    @JacksonXmlProperty(localName = "original-publication-kind")
    protected String originalPublicationKind;
    @XmlElement(name = "application-reference")
    @JacksonXmlProperty(localName = "application-reference")
    protected ApplicationReference applicationReference;
    @XmlElement(name = "language-of-filing")
    @JacksonXmlProperty(localName = "language-of-filing")
    protected String languageOfFiling;
    @XmlElement(name = "language-of-publication")
    @JacksonXmlProperty(localName = "language-of-publication")
    protected String languageOfPublication;
    @XmlElement(name = "priority-claims")
    @JacksonXmlProperty(localName = "priority-claims")
    protected PriorityClaims priorityClaims;
    @XmlElement(name = "dates-of-public-availability")
    @JacksonXmlProperty(localName = "dates-of-public-availability")
    protected DatesOfPublicAvailability datesOfPublicAvailability;
    @XmlElement(name = "term-of-grant")
    protected TermOfGrant termOfGrant;
    @XmlElement(name = "classification-ipc")
    protected ClassificationIpc classificationIpc;
    @XmlElement(name = "classifications-ipcr")
    @JacksonXmlProperty(localName = "classifications-ipcr")
    protected ClassificationsIpcr classificationsIpcr;
    @XmlElement(name = "classification-national")
    @JacksonXmlProperty(localName = "classification-national")
    protected ClassificationNational classificationNational;
    @XmlElement(name = "classifications-ecla")
    @JacksonXmlProperty(localName = "classifications-ecla")
    protected ClassificationsEcla classificationsEcla;
    @XmlElement(name = "patent-classifications")
    @JacksonXmlProperty(localName = "patent-classifications")
    protected PatentClassificationsType patentClassifications;
    @XmlElement(name = "field-of-search")
    protected FieldOfSearch fieldOfSearch;
    @XmlElement(name = "number-of-claims")
    @JacksonXmlProperty(localName = "number-of-claims")
    protected String numberOfClaims;
    @XmlElement(name = "exemplary-claim")
    @JacksonXmlProperty(localName = "exemplary-claim")
    protected List<String> exemplaryClaim;
    @XmlElement(name = "independent-claims")
    protected List<String> independentClaims;
    protected Figures figures;
    @XmlElement(name = "invention-title")
    @JacksonXmlProperty(localName = "invention-title")
    protected List<InventionTitle> inventionTitle;
    @XmlElement(name = "references-cited")
    protected ReferencesCited referencesCited;
    @XmlElement(name = "forward-patent-citations")
    protected ForwardPatentCitations forwardPatentCitations;
    @XmlElement(name = "related-documents")
    protected RelatedDocuments relatedDocuments;
    protected Parties parties;
    protected Examiners examiners;
    @XmlElement(name = "designation-of-states")
    protected DesignationOfStates designationOfStates;
    @XmlElement(name = "pct-or-regional-filing-data")
    protected PctOrRegionalFilingData pctOrRegionalFilingData;
    @XmlElement(name = "pct-or-regional-publishing-data")
    protected PctOrRegionalPublishingData pctOrRegionalPublishingData;
    @XmlElement(name = "lgst-data")
    protected LgstData lgstData;
    @XmlElement(name = "patent-assignments")
    protected PatentAssignments patentAssignments;
    @XmlAttribute(name = "lang", required = true)
    protected String lang;
    @XmlAttribute(name = "date-changed")
    protected String dateChanged;

    /**
     * Obtiene el valor de la propiedad publicationReference.
     *
     * @return possible object is
     * {@link PublicationReference }
     */
    public PublicationReference getPublicationReference() {
        return publicationReference;
    }

    /**
     * Define el valor de la propiedad publicationReference.
     *
     * @param value allowed object is
     *              {@link PublicationReference }
     */
    public void setPublicationReference(PublicationReference value) {
        this.publicationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad originalPublicationKind.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOriginalPublicationKind() {
        return originalPublicationKind;
    }

    /**
     * Define el valor de la propiedad originalPublicationKind.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOriginalPublicationKind(String value) {
        this.originalPublicationKind = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationReference.
     *
     * @return possible object is
     * {@link ApplicationReference }
     */
    public ApplicationReference getApplicationReference() {
        return applicationReference;
    }

    /**
     * Define el valor de la propiedad applicationReference.
     *
     * @param value allowed object is
     *              {@link ApplicationReference }
     */
    public void setApplicationReference(ApplicationReference value) {
        this.applicationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad languageOfFiling.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageOfFiling() {
        return languageOfFiling;
    }

    /**
     * Define el valor de la propiedad languageOfFiling.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageOfFiling(String value) {
        this.languageOfFiling = value;
    }

    /**
     * Obtiene el valor de la propiedad languageOfPublication.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageOfPublication() {
        return languageOfPublication;
    }

    /**
     * Define el valor de la propiedad languageOfPublication.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageOfPublication(String value) {
        this.languageOfPublication = value;
    }

    /**
     * Obtiene el valor de la propiedad priorityClaims.
     *
     * @return possible object is
     * {@link PriorityClaims }
     */
    public PriorityClaims getPriorityClaims() {
        return priorityClaims;
    }

    /**
     * Define el valor de la propiedad priorityClaims.
     *
     * @param value allowed object is
     *              {@link PriorityClaims }
     */
    public void setPriorityClaims(PriorityClaims value) {
        this.priorityClaims = value;
    }

    /**
     * Obtiene el valor de la propiedad datesOfPublicAvailability.
     *
     * @return possible object is
     * {@link DatesOfPublicAvailability }
     */
    public DatesOfPublicAvailability getDatesOfPublicAvailability() {
        return datesOfPublicAvailability;
    }

    /**
     * Define el valor de la propiedad datesOfPublicAvailability.
     *
     * @param value allowed object is
     *              {@link DatesOfPublicAvailability }
     */
    public void setDatesOfPublicAvailability(DatesOfPublicAvailability value) {
        this.datesOfPublicAvailability = value;
    }

    /**
     * Obtiene el valor de la propiedad termOfGrant.
     *
     * @return possible object is
     * {@link TermOfGrant }
     */
    public TermOfGrant getTermOfGrant() {
        return termOfGrant;
    }

    /**
     * Define el valor de la propiedad termOfGrant.
     *
     * @param value allowed object is
     *              {@link TermOfGrant }
     */
    public void setTermOfGrant(TermOfGrant value) {
        this.termOfGrant = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationIpc.
     *
     * @return possible object is
     * {@link ClassificationIpc }
     */
    public ClassificationIpc getClassificationIpc() {
        return classificationIpc;
    }

    /**
     * Define el valor de la propiedad classificationIpc.
     *
     * @param value allowed object is
     *              {@link ClassificationIpc }
     */
    public void setClassificationIpc(ClassificationIpc value) {
        this.classificationIpc = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationsIpcr.
     *
     * @return possible object is
     * {@link ClassificationsIpcr }
     */
    public ClassificationsIpcr getClassificationsIpcr() {
        return classificationsIpcr;
    }

    /**
     * Define el valor de la propiedad classificationsIpcr.
     *
     * @param value allowed object is
     *              {@link ClassificationsIpcr }
     */
    public void setClassificationsIpcr(ClassificationsIpcr value) {
        this.classificationsIpcr = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationNational.
     *
     * @return possible object is
     * {@link ClassificationNational }
     */
    public ClassificationNational getClassificationNational() {
        return classificationNational;
    }

    /**
     * Define el valor de la propiedad classificationNational.
     *
     * @param value allowed object is
     *              {@link ClassificationNational }
     */
    public void setClassificationNational(ClassificationNational value) {
        this.classificationNational = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationsEcla.
     *
     * @return possible object is
     * {@link ClassificationsEcla }
     */
    public ClassificationsEcla getClassificationsEcla() {
        return classificationsEcla;
    }

    /**
     * Define el valor de la propiedad classificationsEcla.
     *
     * @param value allowed object is
     *              {@link ClassificationsEcla }
     */
    public void setClassificationsEcla(ClassificationsEcla value) {
        this.classificationsEcla = value;
    }

    /**
     * Obtiene el valor de la propiedad patentClassifications.
     *
     * @return possible object is
     * {@link PatentClassificationsType }
     */
    public PatentClassificationsType getPatentClassifications() {
        return patentClassifications;
    }

    /**
     * Define el valor de la propiedad patentClassifications.
     *
     * @param value allowed object is
     *              {@link PatentClassificationsType }
     */
    public void setPatentClassifications(PatentClassificationsType value) {
        this.patentClassifications = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldOfSearch.
     *
     * @return possible object is
     * {@link FieldOfSearch }
     */
    public FieldOfSearch getFieldOfSearch() {
        return fieldOfSearch;
    }

    /**
     * Define el valor de la propiedad fieldOfSearch.
     *
     * @param value allowed object is
     *              {@link FieldOfSearch }
     */
    public void setFieldOfSearch(FieldOfSearch value) {
        this.fieldOfSearch = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfClaims.
     *
     * @return possible object is
     * {@link NumberOfClaims }
     */
    public String getNumberOfClaims() {
        return numberOfClaims;
    }

    /**
     * Define el valor de la propiedad numberOfClaims.
     *
     * @param value allowed object is
     *              {@link NumberOfClaims }
     */
    public void setNumberOfClaims(String value) {
        this.numberOfClaims = value;
    }

    /**
     * Gets the value of the exemplaryClaim property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemplaryClaim property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemplaryClaim().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getExemplaryClaim() {
        if (exemplaryClaim == null) {
            exemplaryClaim = new ArrayList<String>();
        }
        return this.exemplaryClaim;
    }

    /**
     * Gets the value of the independentClaims property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentClaims property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentClaims().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getIndependentClaims() {
        if (independentClaims == null) {
            independentClaims = new ArrayList<String>();
        }
        return this.independentClaims;
    }

    /**
     * Obtiene el valor de la propiedad figures.
     *
     * @return possible object is
     * {@link Figures }
     */
    public Figures getFigures() {
        return figures;
    }

    /**
     * Define el valor de la propiedad figures.
     *
     * @param value allowed object is
     *              {@link Figures }
     */
    public void setFigures(Figures value) {
        this.figures = value;
    }

    /**
     * Gets the value of the inventionTitle property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventionTitle property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventionTitle().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventionTitle }
     */
    public List<InventionTitle> getInventionTitle() {
        if (inventionTitle == null) {
            inventionTitle = new ArrayList<InventionTitle>();
        }
        return this.inventionTitle;
    }

    /**
     * Obtiene el valor de la propiedad referencesCited.
     *
     * @return possible object is
     * {@link ReferencesCited }
     */
    public ReferencesCited getReferencesCited() {
        return referencesCited;
    }

    /**
     * Define el valor de la propiedad referencesCited.
     *
     * @param value allowed object is
     *              {@link ReferencesCited }
     */
    public void setReferencesCited(ReferencesCited value) {
        this.referencesCited = value;
    }

    /**
     * Obtiene el valor de la propiedad forwardPatentCitations.
     *
     * @return possible object is
     * {@link ForwardPatentCitations }
     */
    public ForwardPatentCitations getForwardPatentCitations() {
        return forwardPatentCitations;
    }

    /**
     * Define el valor de la propiedad forwardPatentCitations.
     *
     * @param value allowed object is
     *              {@link ForwardPatentCitations }
     */
    public void setForwardPatentCitations(ForwardPatentCitations value) {
        this.forwardPatentCitations = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedDocuments.
     *
     * @return possible object is
     * {@link RelatedDocuments }
     */
    public RelatedDocuments getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Define el valor de la propiedad relatedDocuments.
     *
     * @param value allowed object is
     *              {@link RelatedDocuments }
     */
    public void setRelatedDocuments(RelatedDocuments value) {
        this.relatedDocuments = value;
    }

    /**
     * Obtiene el valor de la propiedad parties.
     *
     * @return possible object is
     * {@link Parties }
     */
    public Parties getParties() {
        return parties;
    }

    /**
     * Define el valor de la propiedad parties.
     *
     * @param value allowed object is
     *              {@link Parties }
     */
    public void setParties(Parties value) {
        this.parties = value;
    }

    /**
     * Obtiene el valor de la propiedad examiners.
     *
     * @return possible object is
     * {@link Examiners }
     */
    public Examiners getExaminers() {
        return examiners;
    }

    /**
     * Define el valor de la propiedad examiners.
     *
     * @param value allowed object is
     *              {@link Examiners }
     */
    public void setExaminers(Examiners value) {
        this.examiners = value;
    }

    /**
     * Obtiene el valor de la propiedad designationOfStates.
     *
     * @return possible object is
     * {@link DesignationOfStates }
     */
    public DesignationOfStates getDesignationOfStates() {
        return designationOfStates;
    }

    /**
     * Define el valor de la propiedad designationOfStates.
     *
     * @param value allowed object is
     *              {@link DesignationOfStates }
     */
    public void setDesignationOfStates(DesignationOfStates value) {
        this.designationOfStates = value;
    }

    /**
     * Obtiene el valor de la propiedad pctOrRegionalFilingData.
     *
     * @return possible object is
     * {@link PctOrRegionalFilingData }
     */
    public PctOrRegionalFilingData getPctOrRegionalFilingData() {
        return pctOrRegionalFilingData;
    }

    /**
     * Define el valor de la propiedad pctOrRegionalFilingData.
     *
     * @param value allowed object is
     *              {@link PctOrRegionalFilingData }
     */
    public void setPctOrRegionalFilingData(PctOrRegionalFilingData value) {
        this.pctOrRegionalFilingData = value;
    }

    /**
     * Obtiene el valor de la propiedad pctOrRegionalPublishingData.
     *
     * @return possible object is
     * {@link PctOrRegionalPublishingData }
     */
    public PctOrRegionalPublishingData getPctOrRegionalPublishingData() {
        return pctOrRegionalPublishingData;
    }

    /**
     * Define el valor de la propiedad pctOrRegionalPublishingData.
     *
     * @param value allowed object is
     *              {@link PctOrRegionalPublishingData }
     */
    public void setPctOrRegionalPublishingData(PctOrRegionalPublishingData value) {
        this.pctOrRegionalPublishingData = value;
    }

    /**
     * Obtiene el valor de la propiedad lgstData.
     *
     * @return possible object is
     * {@link LgstData }
     */
    public LgstData getLgstData() {
        return lgstData;
    }

    /**
     * Define el valor de la propiedad lgstData.
     *
     * @param value allowed object is
     *              {@link LgstData }
     */
    public void setLgstData(LgstData value) {
        this.lgstData = value;
    }

    /**
     * Obtiene el valor de la propiedad patentAssignments.
     *
     * @return possible object is
     * {@link PatentAssignments }
     */
    public PatentAssignments getPatentAssignments() {
        return patentAssignments;
    }

    /**
     * Define el valor de la propiedad patentAssignments.
     *
     * @param value allowed object is
     *              {@link PatentAssignments }
     */
    public void setPatentAssignments(PatentAssignments value) {
        this.patentAssignments = value;
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

    /**
     * Obtiene el valor de la propiedad dateChanged.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateChanged() {
        return dateChanged;
    }

    /**
     * Define el valor de la propiedad dateChanged.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateChanged(String value) {
        this.dateChanged = value;
    }

}
