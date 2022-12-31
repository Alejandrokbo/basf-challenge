//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.12.30 a las 03:33:23 PM UTC 
//


package com.basf.challenge.dto.xmlProperties;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Country_QNAME = new QName("", "country");
    private final static QName _DocNumber_QNAME = new QName("", "doc-number");
    private final static QName _Kind_QNAME = new QName("", "kind");
    private final static QName _Date_QNAME = new QName("", "date");
    private final static QName _OriginalPublicationKind_QNAME = new QName("", "original-publication-kind");
    private final static QName _LanguageOfFiling_QNAME = new QName("", "language-of-filing");
    private final static QName _LanguageOfPublication_QNAME = new QName("", "language-of-publication");
    private final static QName _UsTermExtension_QNAME = new QName("", "us-term-extension");
    private final static QName _ClassificationLevel_QNAME = new QName("", "classification-level");
    private final static QName _Section_QNAME = new QName("", "section");
    private final static QName _Class_QNAME = new QName("", "class");
    private final static QName _Subclass_QNAME = new QName("", "subclass");
    private final static QName _MainGroup_QNAME = new QName("", "main-group");
    private final static QName _Subgroup_QNAME = new QName("", "subgroup");
    private final static QName _SymbolPosition_QNAME = new QName("", "symbol-position");
    private final static QName _ClassificationValue_QNAME = new QName("", "classification-value");
    private final static QName _ClassificationStatus_QNAME = new QName("", "classification-status");
    private final static QName _ClassificationDataSource_QNAME = new QName("", "classification-data-source");
    private final static QName _ExaminerEdition_QNAME = new QName("", "examiner-edition");
    private final static QName _PatentClassifications_QNAME = new QName("", "patent-classifications");
    private final static QName _ExemplaryClaim_QNAME = new QName("", "exemplary-claim");
    private final static QName _IndependentClaims_QNAME = new QName("", "independent-claims");
    private final static QName _NumberOfDrawingSheets_QNAME = new QName("", "number-of-drawing-sheets");
    private final static QName _NumberOfFigures_QNAME = new QName("", "number-of-figures");
    private final static QName _Category_QNAME = new QName("", "category");
    private final static QName _ParentStatus_QNAME = new QName("", "parent-status");
    private final static QName _Orgname_QNAME = new QName("", "orgname");
    private final static QName _OrgName_QNAME = new QName("", "org-name");
    private final static QName _Department_QNAME = new QName("", "department");
    private final static QName _RegisteredNumber_QNAME = new QName("", "registered-number");
    private final static QName _Address1_QNAME = new QName("", "address-1");
    private final static QName _City_QNAME = new QName("", "city");
    private final static QName _State_QNAME = new QName("", "state");
    private final static QName _Postcode_QNAME = new QName("", "postcode");
    private final static QName _LgstStatus_QNAME = new QName("", "lgst-status");
    private final static QName _Edition_QNAME = new QName("", "edition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PatentClassificationType }
     */
    public PatentClassificationType createPatentClassificationType() {
        return new PatentClassificationType();
    }

    /**
     * Create an instance of {@link QuestelPatentDocument }
     */
    public QuestelPatentDocument createQuestelPatentDocument() {
        return new QuestelPatentDocument();
    }

    /**
     * Create an instance of {@link BibliographicData }
     */
    public BibliographicData createBibliographicData() {
        return new BibliographicData();
    }

    /**
     * Create an instance of {@link PublicationReference }
     */
    public PublicationReference createPublicationReference() {
        return new PublicationReference();
    }

    /**
     * Create an instance of {@link DocumentId }
     */
    public DocumentId createDocumentId() {
        return new DocumentId();
    }

    /**
     * Create an instance of {@link Name }
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Text }
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link ApplicationReference }
     */
    public ApplicationReference createApplicationReference() {
        return new ApplicationReference();
    }

    /**
     * Create an instance of {@link PriorityClaims }
     */
    public PriorityClaims createPriorityClaims() {
        return new PriorityClaims();
    }

    /**
     * Create an instance of {@link PriorityClaim }
     */
    public PriorityClaim createPriorityClaim() {
        return new PriorityClaim();
    }

    /**
     * Create an instance of {@link DatesOfPublicAvailability }
     */
    public DatesOfPublicAvailability createDatesOfPublicAvailability() {
        return new DatesOfPublicAvailability();
    }

    /**
     * Create an instance of {@link UnexaminedPrintedWithoutGrant }
     */
    public UnexaminedPrintedWithoutGrant createUnexaminedPrintedWithoutGrant() {
        return new UnexaminedPrintedWithoutGrant();
    }

    /**
     * Create an instance of {@link PublicationOfGrantDate }
     */
    public PublicationOfGrantDate createPublicationOfGrantDate() {
        return new PublicationOfGrantDate();
    }

    /**
     * Create an instance of {@link TermOfGrant }
     */
    public TermOfGrant createTermOfGrant() {
        return new TermOfGrant();
    }

    /**
     * Create an instance of {@link Disclaimer }
     */
    public Disclaimer createDisclaimer() {
        return new Disclaimer();
    }

    /**
     * Create an instance of {@link ClassificationIpc }
     */
    public ClassificationIpc createClassificationIpc() {
        return new ClassificationIpc();
    }

    /**
     * Create an instance of {@link IpcMainClassificationType }
     */
    public IpcMainClassificationType createIpcMainClassificationType() {
        return new IpcMainClassificationType();
    }

    /**
     * Create an instance of {@link IpcFurtherClassificationType }
     */
    public IpcFurtherClassificationType createIpcFurtherClassificationType() {
        return new IpcFurtherClassificationType();
    }

    /**
     * Create an instance of {@link ClassificationsIpcr }
     */
    public ClassificationsIpcr createClassificationsIpcr() {
        return new ClassificationsIpcr();
    }

    /**
     * Create an instance of {@link ClassificationIpcr }
     */
    public ClassificationIpcr createClassificationIpcr() {
        return new ClassificationIpcr();
    }

    /**
     * Create an instance of {@link IpcVersionIndicator }
     */
    public IpcVersionIndicator createIpcVersionIndicator() {
        return new IpcVersionIndicator();
    }

    /**
     * Create an instance of {@link GeneratingOffice }
     */
    public GeneratingOffice createGeneratingOffice() {
        return new GeneratingOffice();
    }

    /**
     * Create an instance of {@link ActionDate }
     */
    public ActionDate createActionDate() {
        return new ActionDate();
    }

    /**
     * Create an instance of {@link ClassificationNational }
     */
    public ClassificationNational createClassificationNational() {
        return new ClassificationNational();
    }

    /**
     * Create an instance of {@link NationalMainClassificationType }
     */
    public NationalMainClassificationType createNationalMainClassificationType() {
        return new NationalMainClassificationType();
    }

    /**
     * Create an instance of {@link NationalFurtherClassificationType }
     */
    public NationalFurtherClassificationType createNationalFurtherClassificationType() {
        return new NationalFurtherClassificationType();
    }

    /**
     * Create an instance of {@link ClassificationsEcla }
     */
    public ClassificationsEcla createClassificationsEcla() {
        return new ClassificationsEcla();
    }

    /**
     * Create an instance of {@link ClassificationEcla }
     */
    public ClassificationEcla createClassificationEcla() {
        return new ClassificationEcla();
    }

    /**
     * Create an instance of {@link PatentClassificationsType }
     */
    public PatentClassificationsType createPatentClassificationsType() {
        return new PatentClassificationsType();
    }

    /**
     * Create an instance of {@link FieldOfSearch }
     */
    public FieldOfSearch createFieldOfSearch() {
        return new FieldOfSearch();
    }

    /**
     * Create an instance of {@link NumberOfClaims }
     */
    public NumberOfClaims createNumberOfClaims() {
        return new NumberOfClaims();
    }

    /**
     * Create an instance of {@link Figures }
     */
    public Figures createFigures() {
        return new Figures();
    }

    /**
     * Create an instance of {@link ImageKey }
     */
    public ImageKey createImageKey() {
        return new ImageKey();
    }

    /**
     * Create an instance of {@link InventionTitle }
     */
    public InventionTitle createInventionTitle() {
        return new InventionTitle();
    }

    /**
     * Create an instance of {@link ReferencesCited }
     */
    public ReferencesCited createReferencesCited() {
        return new ReferencesCited();
    }

    /**
     * Create an instance of {@link Citation }
     */
    public Citation createCitation() {
        return new Citation();
    }

    /**
     * Create an instance of {@link Patcit }
     */
    public Patcit createPatcit() {
        return new Patcit();
    }

    /**
     * Create an instance of {@link Nplcit }
     */
    public Nplcit createNplcit() {
        return new Nplcit();
    }

    /**
     * Create an instance of {@link ForwardPatentCitations }
     */
    public ForwardPatentCitations createForwardPatentCitations() {
        return new ForwardPatentCitations();
    }

    /**
     * Create an instance of {@link RelatedDocuments }
     */
    public RelatedDocuments createRelatedDocuments() {
        return new RelatedDocuments();
    }

    /**
     * Create an instance of {@link Addition }
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link Relation }
     */
    public Relation createRelation() {
        return new Relation();
    }

    /**
     * Create an instance of {@link ParentDoc }
     */
    public ParentDoc createParentDoc() {
        return new ParentDoc();
    }

    /**
     * Create an instance of {@link ParentGrantDocument }
     */
    public ParentGrantDocument createParentGrantDocument() {
        return new ParentGrantDocument();
    }

    /**
     * Create an instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link Continuation }
     */
    public Continuation createContinuation() {
        return new Continuation();
    }

    /**
     * Create an instance of {@link ContinuationInPart }
     */
    public ContinuationInPart createContinuationInPart() {
        return new ContinuationInPart();
    }

    /**
     * Create an instance of {@link Reissue }
     */
    public Reissue createReissue() {
        return new Reissue();
    }

    /**
     * Create an instance of {@link DivisionalReissue }
     */
    public DivisionalReissue createDivisionalReissue() {
        return new DivisionalReissue();
    }

    /**
     * Create an instance of {@link UsRelation }
     */
    public UsRelation createUsRelation() {
        return new UsRelation();
    }

    /**
     * Create an instance of {@link Reexamination }
     */
    public Reexamination createReexamination() {
        return new Reexamination();
    }

    /**
     * Create an instance of {@link Substitution }
     */
    public Substitution createSubstitution() {
        return new Substitution();
    }

    /**
     * Create an instance of {@link ProvisionalApplication }
     */
    public ProvisionalApplication createProvisionalApplication() {
        return new ProvisionalApplication();
    }

    /**
     * Create an instance of {@link RelatedPublication }
     */
    public RelatedPublication createRelatedPublication() {
        return new RelatedPublication();
    }

    /**
     * Create an instance of {@link DateComingIntoForce }
     */
    public DateComingIntoForce createDateComingIntoForce() {
        return new DateComingIntoForce();
    }

    /**
     * Create an instance of {@link ContinuingReissue }
     */
    public ContinuingReissue createContinuingReissue() {
        return new ContinuingReissue();
    }

    /**
     * Create an instance of {@link ReexaminationIssueMerger }
     */
    public ReexaminationIssueMerger createReexaminationIssueMerger() {
        return new ReexaminationIssueMerger();
    }

    /**
     * Create an instance of {@link UtilityModelBasis }
     */
    public UtilityModelBasis createUtilityModelBasis() {
        return new UtilityModelBasis();
    }

    /**
     * Create an instance of {@link PreviouslyFiledApplication }
     */
    public PreviouslyFiledApplication createPreviouslyFiledApplication() {
        return new PreviouslyFiledApplication();
    }

    /**
     * Create an instance of {@link Correction }
     */
    public Correction createCorrection() {
        return new Correction();
    }

    /**
     * Create an instance of {@link ChangeOfApplication }
     */
    public ChangeOfApplication createChangeOfApplication() {
        return new ChangeOfApplication();
    }

    /**
     * Create an instance of {@link ChangeOfUtility }
     */
    public ChangeOfUtility createChangeOfUtility() {
        return new ChangeOfUtility();
    }

    /**
     * Create an instance of {@link PreviousPublication }
     */
    public PreviousPublication createPreviousPublication() {
        return new PreviousPublication();
    }

    /**
     * Create an instance of {@link TechnicalPriority }
     */
    public TechnicalPriority createTechnicalPriority() {
        return new TechnicalPriority();
    }

    /**
     * Create an instance of {@link SupplementaryDisclosure }
     */
    public SupplementaryDisclosure createSupplementaryDisclosure() {
        return new SupplementaryDisclosure();
    }

    /**
     * Create an instance of {@link WiderrechtlicheEntnahme }
     */
    public WiderrechtlicheEntnahme createWiderrechtlicheEntnahme() {
        return new WiderrechtlicheEntnahme();
    }

    /**
     * Create an instance of {@link Priority }
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link Parties }
     */
    public Parties createParties() {
        return new Parties();
    }

    /**
     * Create an instance of {@link Applicants }
     */
    public Applicants createApplicants() {
        return new Applicants();
    }

    /**
     * Create an instance of {@link Applicant }
     */
    public Applicant createApplicant() {
        return new Applicant();
    }

    /**
     * Create an instance of {@link Addressbook }
     */
    public Addressbook createAddressbook() {
        return new Addressbook();
    }

    /**
     * Create an instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Nationality }
     */
    public Nationality createNationality() {
        return new Nationality();
    }

    /**
     * Create an instance of {@link Inventors }
     */
    public Inventors createInventors() {
        return new Inventors();
    }

    /**
     * Create an instance of {@link Inventor }
     */
    public Inventor createInventor() {
        return new Inventor();
    }

    /**
     * Create an instance of {@link Agents }
     */
    public Agents createAgents() {
        return new Agents();
    }

    /**
     * Create an instance of {@link Agent }
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link Examiners }
     */
    public Examiners createExaminers() {
        return new Examiners();
    }

    /**
     * Create an instance of {@link PrimaryExaminer }
     */
    public PrimaryExaminer createPrimaryExaminer() {
        return new PrimaryExaminer();
    }

    /**
     * Create an instance of {@link AssistantExaminer }
     */
    public AssistantExaminer createAssistantExaminer() {
        return new AssistantExaminer();
    }

    /**
     * Create an instance of {@link DesignationOfStates }
     */
    public DesignationOfStates createDesignationOfStates() {
        return new DesignationOfStates();
    }

    /**
     * Create an instance of {@link DesignationPct }
     */
    public DesignationPct createDesignationPct() {
        return new DesignationPct();
    }

    /**
     * Create an instance of {@link Regional }
     */
    public Regional createRegional() {
        return new Regional();
    }

    /**
     * Create an instance of {@link Region }
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link National }
     */
    public National createNational() {
        return new National();
    }

    /**
     * Create an instance of {@link DesignationEpc }
     */
    public DesignationEpc createDesignationEpc() {
        return new DesignationEpc();
    }

    /**
     * Create an instance of {@link ContractingStates }
     */
    public ContractingStates createContractingStates() {
        return new ContractingStates();
    }

    /**
     * Create an instance of {@link ExtensionStates }
     */
    public ExtensionStates createExtensionStates() {
        return new ExtensionStates();
    }

    /**
     * Create an instance of {@link PctOrRegionalFilingData }
     */
    public PctOrRegionalFilingData createPctOrRegionalFilingData() {
        return new PctOrRegionalFilingData();
    }

    /**
     * Create an instance of {@link PctOrRegionalPublishingData }
     */
    public PctOrRegionalPublishingData createPctOrRegionalPublishingData() {
        return new PctOrRegionalPublishingData();
    }

    /**
     * Create an instance of {@link LgstData }
     */
    public LgstData createLgstData() {
        return new LgstData();
    }

    /**
     * Create an instance of {@link PatentAssignments }
     */
    public PatentAssignments createPatentAssignments() {
        return new PatentAssignments();
    }

    /**
     * Create an instance of {@link PatentAssignment }
     */
    public PatentAssignment createPatentAssignment() {
        return new PatentAssignment();
    }

    /**
     * Create an instance of {@link Abstract }
     */
    public Abstract createAbstract() {
        return new Abstract();
    }

    /**
     * Create an instance of {@link Heading }
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link P }
     */
    public P createP() {
        return new P();
    }

    /**
     * Create an instance of {@link Description }
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Claims }
     */
    public Claims createClaims() {
        return new Claims();
    }

    /**
     * Create an instance of {@link Claim }
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link ClaimText }
     */
    public ClaimText createClaimText() {
        return new ClaimText();
    }

    /**
     * Create an instance of {@link AmendedClaims }
     */
    public AmendedClaims createAmendedClaims() {
        return new AmendedClaims();
    }

    /**
     * Create an instance of {@link Br }
     */
    public Br createBr() {
        return new Br();
    }

    /**
     * Create an instance of {@link Disclaimers }
     */
    public Disclaimers createDisclaimers() {
        return new Disclaimers();
    }

    /**
     * Create an instance of {@link PostIssuanceElementType }
     */
    public PostIssuanceElementType createPostIssuanceElementType() {
        return new PostIssuanceElementType();
    }

    /**
     * Create an instance of {@link PriorityApplication }
     */
    public PriorityApplication createPriorityApplication() {
        return new PriorityApplication();
    }

    /**
     * Create an instance of {@link Reissues }
     */
    public Reissues createReissues() {
        return new Reissues();
    }

    /**
     * Create an instance of {@link DivisionOfADivision }
     */
    public DivisionOfADivision createDivisionOfADivision() {
        return new DivisionOfADivision();
    }

    /**
     * Create an instance of {@link CombinationSetType }
     */
    public CombinationSetType createCombinationSetType() {
        return new CombinationSetType();
    }

    /**
     * Create an instance of {@link CombinationRankType }
     */
    public CombinationRankType createCombinationRankType() {
        return new CombinationRankType();
    }

    /**
     * Create an instance of {@link PatentClassificationType.ClassificationScheme }
     */
    public PatentClassificationType.ClassificationScheme createPatentClassificationTypeClassificationScheme() {
        return new PatentClassificationType.ClassificationScheme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "doc-number")
    public JAXBElement<String> createDocNumber(String value) {
        return new JAXBElement<String>(_DocNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "kind")
    public JAXBElement<String> createKind(String value) {
        return new JAXBElement<String>(_Kind_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "original-publication-kind")
    public JAXBElement<String> createOriginalPublicationKind(String value) {
        return new JAXBElement<String>(_OriginalPublicationKind_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "language-of-filing")
    public JAXBElement<String> createLanguageOfFiling(String value) {
        return new JAXBElement<String>(_LanguageOfFiling_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "language-of-publication")
    public JAXBElement<String> createLanguageOfPublication(String value) {
        return new JAXBElement<String>(_LanguageOfPublication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "us-term-extension")
    public JAXBElement<String> createUsTermExtension(String value) {
        return new JAXBElement<String>(_UsTermExtension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "classification-level")
    public JAXBElement<String> createClassificationLevel(String value) {
        return new JAXBElement<String>(_ClassificationLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "section")
    public JAXBElement<String> createSection(String value) {
        return new JAXBElement<String>(_Section_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "class")
    public JAXBElement<String> createClass(String value) {
        return new JAXBElement<String>(_Class_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "subclass")
    public JAXBElement<String> createSubclass(String value) {
        return new JAXBElement<String>(_Subclass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "main-group")
    public JAXBElement<String> createMainGroup(String value) {
        return new JAXBElement<String>(_MainGroup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "subgroup")
    public JAXBElement<String> createSubgroup(String value) {
        return new JAXBElement<String>(_Subgroup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "symbol-position")
    public JAXBElement<String> createSymbolPosition(String value) {
        return new JAXBElement<String>(_SymbolPosition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "classification-value")
    public JAXBElement<String> createClassificationValue(String value) {
        return new JAXBElement<String>(_ClassificationValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "classification-status")
    public JAXBElement<String> createClassificationStatus(String value) {
        return new JAXBElement<String>(_ClassificationStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "classification-data-source")
    public JAXBElement<String> createClassificationDataSource(String value) {
        return new JAXBElement<String>(_ClassificationDataSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "examiner-edition")
    public JAXBElement<String> createExaminerEdition(String value) {
        return new JAXBElement<String>(_ExaminerEdition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatentClassificationsType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PatentClassificationsType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "patent-classifications")
    public JAXBElement<PatentClassificationsType> createPatentClassifications(PatentClassificationsType value) {
        return new JAXBElement<PatentClassificationsType>(_PatentClassifications_QNAME, PatentClassificationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exemplary-claim")
    public JAXBElement<String> createExemplaryClaim(String value) {
        return new JAXBElement<String>(_ExemplaryClaim_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "independent-claims")
    public JAXBElement<String> createIndependentClaims(String value) {
        return new JAXBElement<String>(_IndependentClaims_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "number-of-drawing-sheets")
    public JAXBElement<String> createNumberOfDrawingSheets(String value) {
        return new JAXBElement<String>(_NumberOfDrawingSheets_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "number-of-figures")
    public JAXBElement<String> createNumberOfFigures(String value) {
        return new JAXBElement<String>(_NumberOfFigures_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "parent-status")
    public JAXBElement<String> createParentStatus(String value) {
        return new JAXBElement<String>(_ParentStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "orgname")
    public JAXBElement<String> createOrgname(String value) {
        return new JAXBElement<String>(_Orgname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "org-name")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "department")
    public JAXBElement<String> createDepartment(String value) {
        return new JAXBElement<String>(_Department_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "registered-number")
    public JAXBElement<String> createRegisteredNumber(String value) {
        return new JAXBElement<String>(_RegisteredNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "address-1")
    public JAXBElement<String> createAddress1(String value) {
        return new JAXBElement<String>(_Address1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "city")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lgst-status")
    public JAXBElement<String> createLgstStatus(String value) {
        return new JAXBElement<String>(_LgstStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "edition")
    public JAXBElement<String> createEdition(String value) {
        return new JAXBElement<String>(_Edition_QNAME, String.class, null, value);
    }

}
