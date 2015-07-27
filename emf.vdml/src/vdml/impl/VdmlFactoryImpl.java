/**
 */
package vdml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vdml.Activity;
import vdml.Actor;
import vdml.Annotation;
import vdml.Assignment;
import vdml.Attribute;
import vdml.BusinessItem;
import vdml.BusinessItemCategory;
import vdml.BusinessItemDefinition;
import vdml.BusinessItemLibrary;
import vdml.BusinessNetwork;
import vdml.CalendarService;
import vdml.CapabilityCategory;
import vdml.CapabilityDefinition;
import vdml.CapabilityDependency;
import vdml.CapabilityLibrary;
import vdml.CapabilityMethod;
import vdml.CapabilityOffer;
import vdml.Collaboration;
import vdml.Community;
import vdml.DelegationContext;
import vdml.DeliverableFlow;
import vdml.Expression;
import vdml.Goal;
import vdml.InputDelegation;
import vdml.InputPort;
import vdml.MeasuredCharacteristic;
import vdml.Member;
import vdml.ObValueProposition;
import vdml.Operand;
import vdml.OrgUnit;
import vdml.OutputDelegation;
import vdml.OutputPort;
import vdml.Party;
import vdml.Performer;
import vdml.Person;
import vdml.Pool;
import vdml.Position;
import vdml.PracticeCategory;
import vdml.PracticeDefinition;
import vdml.PracticeLibrary;
import vdml.ReleaseControl;
import vdml.ResourceUse;
import vdml.Role;
import vdml.Scenario;
import vdml.SourceRole;
import vdml.SourceTargetRole;
import vdml.Store;
import vdml.SubObjValueProposition;
import vdml.SubValueProposition;
import vdml.TargetRole;
import vdml.ValueAdd;
import vdml.ValueCategory;
import vdml.ValueDefinition;
import vdml.ValueDeliveryModel;
import vdml.ValueLibrary;
import vdml.ValueProposition;
import vdml.ValuePropositionComponent;
import vdml.VdmlFactory;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlFactoryImpl extends EFactoryImpl implements VdmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VdmlFactory init() {
		try {
			VdmlFactory theVdmlFactory = (VdmlFactory)EPackage.Registry.INSTANCE.getEFactory(VdmlPackage.eNS_URI);
			if (theVdmlFactory != null) {
				return theVdmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VdmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VdmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VdmlPackage.VALUE_DELIVERY_MODEL: return createValueDeliveryModel();
			case VdmlPackage.STRING: return createString();
			case VdmlPackage.ATTRIBUTE: return createAttribute();
			case VdmlPackage.ANNOTATION: return createAnnotation();
			case VdmlPackage.VALUE_LIBRARY: return createValueLibrary();
			case VdmlPackage.VALUE_DEFINITION: return createValueDefinition();
			case VdmlPackage.VALUE_CATEGORY: return createValueCategory();
			case VdmlPackage.CAPABILITY_LIBRARY: return createCapabilityLibrary();
			case VdmlPackage.CAPABILITY_DEPENDENCY: return createCapabilityDependency();
			case VdmlPackage.BUSINESS_ITEM_DEFINITION: return createBusinessItemDefinition();
			case VdmlPackage.PRACTICE_DEFINITION: return createPracticeDefinition();
			case VdmlPackage.PRACTICE_CATEGORY: return createPracticeCategory();
			case VdmlPackage.CAPABILITY_DEFINITION: return createCapabilityDefinition();
			case VdmlPackage.BUSINESS_ITEM_CATEGORY: return createBusinessItemCategory();
			case VdmlPackage.BUSINESS_ITEM_LIBRARY: return createBusinessItemLibrary();
			case VdmlPackage.ACTOR: return createActor();
			case VdmlPackage.MEASURED_CHARACTERISTIC: return createMeasuredCharacteristic();
			case VdmlPackage.ASSIGNMENT: return createAssignment();
			case VdmlPackage.ROLE: return createRole();
			case VdmlPackage.ACTIVITY: return createActivity();
			case VdmlPackage.EXPRESSION: return createExpression();
			case VdmlPackage.OPERAND: return createOperand();
			case VdmlPackage.GOAL: return createGoal();
			case VdmlPackage.RESOURCE_USE: return createResourceUse();
			case VdmlPackage.OUTPUT_PORT: return createOutputPort();
			case VdmlPackage.DELIVERABLE_FLOW: return createDeliverableFlow();
			case VdmlPackage.INPUT_PORT: return createInputPort();
			case VdmlPackage.INPUT_DELEGATION: return createInputDelegation();
			case VdmlPackage.BUSINESS_ITEM: return createBusinessItem();
			case VdmlPackage.STORE: return createStore();
			case VdmlPackage.ORG_UNIT: return createOrgUnit();
			case VdmlPackage.COLLABORATION: return createCollaboration();
			case VdmlPackage.DELEGATION_CONTEXT: return createDelegationContext();
			case VdmlPackage.SCENARIO: return createScenario();
			case VdmlPackage.RELEASE_CONTROL: return createReleaseControl();
			case VdmlPackage.CAPABILITY_OFFER: return createCapabilityOffer();
			case VdmlPackage.CAPABILITY_METHOD: return createCapabilityMethod();
			case VdmlPackage.PERFORMER: return createPerformer();
			case VdmlPackage.POSITION: return createPosition();
			case VdmlPackage.POOL: return createPool();
			case VdmlPackage.CALENDAR_SERVICE: return createCalendarService();
			case VdmlPackage.VALUE_ADD: return createValueAdd();
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT: return createValuePropositionComponent();
			case VdmlPackage.OUTPUT_DELEGATION: return createOutputDelegation();
			case VdmlPackage.VALUE_PROPOSITION: return createValueProposition();
			case VdmlPackage.PRACTICE_LIBRARY: return createPracticeLibrary();
			case VdmlPackage.BUSINESS_NETWORK: return createBusinessNetwork();
			case VdmlPackage.PARTY: return createParty();
			case VdmlPackage.COMMUNITY: return createCommunity();
			case VdmlPackage.MEMBER: return createMember();
			case VdmlPackage.PERSON: return createPerson();
			case VdmlPackage.CAPABILITY_CATEGORY: return createCapabilityCategory();
			case VdmlPackage.INTEGER: return createInteger();
			case VdmlPackage.TARGET_ROLE: return createTargetRole();
			case VdmlPackage.SOURCE_ROLE: return createSourceRole();
			case VdmlPackage.SOURCE_TARGET_ROLE: return createSourceTargetRole();
			case VdmlPackage.OB_VALUE_PROPOSITION: return createObValueProposition();
			case VdmlPackage.SUB_VALUE_PROPOSITION: return createSubValueProposition();
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION: return createSubObjValueProposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDeliveryModel createValueDeliveryModel() {
		ValueDeliveryModelImpl valueDeliveryModel = new ValueDeliveryModelImpl();
		return valueDeliveryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdml.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueLibrary createValueLibrary() {
		ValueLibraryImpl valueLibrary = new ValueLibraryImpl();
		return valueLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDefinition createValueDefinition() {
		ValueDefinitionImpl valueDefinition = new ValueDefinitionImpl();
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueCategory createValueCategory() {
		ValueCategoryImpl valueCategory = new ValueCategoryImpl();
		return valueCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityLibrary createCapabilityLibrary() {
		CapabilityLibraryImpl capabilityLibrary = new CapabilityLibraryImpl();
		return capabilityLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDependency createCapabilityDependency() {
		CapabilityDependencyImpl capabilityDependency = new CapabilityDependencyImpl();
		return capabilityDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition createBusinessItemDefinition() {
		BusinessItemDefinitionImpl businessItemDefinition = new BusinessItemDefinitionImpl();
		return businessItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeDefinition createPracticeDefinition() {
		PracticeDefinitionImpl practiceDefinition = new PracticeDefinitionImpl();
		return practiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeCategory createPracticeCategory() {
		PracticeCategoryImpl practiceCategory = new PracticeCategoryImpl();
		return practiceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinition createCapabilityDefinition() {
		CapabilityDefinitionImpl capabilityDefinition = new CapabilityDefinitionImpl();
		return capabilityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemCategory createBusinessItemCategory() {
		BusinessItemCategoryImpl businessItemCategory = new BusinessItemCategoryImpl();
		return businessItemCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemLibrary createBusinessItemLibrary() {
		BusinessItemLibraryImpl businessItemLibrary = new BusinessItemLibraryImpl();
		return businessItemLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic createMeasuredCharacteristic() {
		MeasuredCharacteristicImpl measuredCharacteristic = new MeasuredCharacteristicImpl();
		return measuredCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand createOperand() {
		OperandImpl operand = new OperandImpl();
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUse createResourceUse() {
		ResourceUseImpl resourceUse = new ResourceUseImpl();
		return resourceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableFlow createDeliverableFlow() {
		DeliverableFlowImpl deliverableFlow = new DeliverableFlowImpl();
		return deliverableFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDelegation createInputDelegation() {
		InputDelegationImpl inputDelegation = new InputDelegationImpl();
		return inputDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItem createBusinessItem() {
		BusinessItemImpl businessItem = new BusinessItemImpl();
		return businessItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationContext createDelegationContext() {
		DelegationContextImpl delegationContext = new DelegationContextImpl();
		return delegationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseControl createReleaseControl() {
		ReleaseControlImpl releaseControl = new ReleaseControlImpl();
		return releaseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityOffer createCapabilityOffer() {
		CapabilityOfferImpl capabilityOffer = new CapabilityOfferImpl();
		return capabilityOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityMethod createCapabilityMethod() {
		CapabilityMethodImpl capabilityMethod = new CapabilityMethodImpl();
		return capabilityMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarService createCalendarService() {
		CalendarServiceImpl calendarService = new CalendarServiceImpl();
		return calendarService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAdd createValueAdd() {
		ValueAddImpl valueAdd = new ValueAddImpl();
		return valueAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePropositionComponent createValuePropositionComponent() {
		ValuePropositionComponentImpl valuePropositionComponent = new ValuePropositionComponentImpl();
		return valuePropositionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDelegation createOutputDelegation() {
		OutputDelegationImpl outputDelegation = new OutputDelegationImpl();
		return outputDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueProposition createValueProposition() {
		ValuePropositionImpl valueProposition = new ValuePropositionImpl();
		return valueProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeLibrary createPracticeLibrary() {
		PracticeLibraryImpl practiceLibrary = new PracticeLibraryImpl();
		return practiceLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessNetwork createBusinessNetwork() {
		BusinessNetworkImpl businessNetwork = new BusinessNetworkImpl();
		return businessNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Community createCommunity() {
		CommunityImpl community = new CommunityImpl();
		return community;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityCategory createCapabilityCategory() {
		CapabilityCategoryImpl capabilityCategory = new CapabilityCategoryImpl();
		return capabilityCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdml.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRole createTargetRole() {
		TargetRoleImpl targetRole = new TargetRoleImpl();
		return targetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole createSourceRole() {
		SourceRoleImpl sourceRole = new SourceRoleImpl();
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTargetRole createSourceTargetRole() {
		SourceTargetRoleImpl sourceTargetRole = new SourceTargetRoleImpl();
		return sourceTargetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObValueProposition createObValueProposition() {
		ObValuePropositionImpl obValueProposition = new ObValuePropositionImpl();
		return obValueProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubValueProposition createSubValueProposition() {
		SubValuePropositionImpl subValueProposition = new SubValuePropositionImpl();
		return subValueProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjValueProposition createSubObjValueProposition() {
		SubObjValuePropositionImpl subObjValueProposition = new SubObjValuePropositionImpl();
		return subObjValueProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VdmlPackage getVdmlPackage() {
		return (VdmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VdmlPackage getPackage() {
		return VdmlPackage.eINSTANCE;
	}

} //VdmlFactoryImpl
