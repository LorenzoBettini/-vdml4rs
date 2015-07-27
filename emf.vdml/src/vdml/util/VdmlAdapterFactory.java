/**
 */
package vdml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vdml.Activity;
import vdml.Actor;
import vdml.AnalysisContext;
import vdml.Annotation;
import vdml.Assignment;
import vdml.Attribute;
import vdml.BusinessItem;
import vdml.BusinessItemCategory;
import vdml.BusinessItemDefinition;
import vdml.BusinessItemLibrary;
import vdml.BusinessNetwork;
import vdml.CalendarService;
import vdml.Capability;
import vdml.CapabilityCategory;
import vdml.CapabilityDefinition;
import vdml.CapabilityDependency;
import vdml.CapabilityLibrary;
import vdml.CapabilityMethod;
import vdml.CapabilityOffer;
import vdml.Collaboration;
import vdml.Community;
import vdml.DecoratedRole;
import vdml.DecoratedValueProposition;
import vdml.DelegationContext;
import vdml.DeliverableFlow;
import vdml.Expression;
import vdml.Goal;
import vdml.InputDelegation;
import vdml.InputPort;
import vdml.MeasurableElement;
import vdml.MeasuredCharacteristic;
import vdml.Member;
import vdml.ObValueProposition;
import vdml.Operand;
import vdml.OrgUnit;
import vdml.OutputDelegation;
import vdml.OutputPort;
import vdml.Participant;
import vdml.Party;
import vdml.Performer;
import vdml.Person;
import vdml.Pool;
import vdml.Port;
import vdml.PortContainer;
import vdml.PortDelegation;
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
import vdml.VdmlElement;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vdml.VdmlPackage
 * @generated
 */
public class VdmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VdmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VdmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VdmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VdmlSwitch<Adapter> modelSwitch =
		new VdmlSwitch<Adapter>() {
			@Override
			public Adapter caseValueDeliveryModel(ValueDeliveryModel object) {
				return createValueDeliveryModelAdapter();
			}
			@Override
			public Adapter caseVdmlElement(VdmlElement object) {
				return createVdmlElementAdapter();
			}
			@Override
			public Adapter caseString(vdml.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseValueLibrary(ValueLibrary object) {
				return createValueLibraryAdapter();
			}
			@Override
			public Adapter caseValueDefinition(ValueDefinition object) {
				return createValueDefinitionAdapter();
			}
			@Override
			public Adapter caseValueCategory(ValueCategory object) {
				return createValueCategoryAdapter();
			}
			@Override
			public Adapter caseCapabilityLibrary(CapabilityLibrary object) {
				return createCapabilityLibraryAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseCapabilityDependency(CapabilityDependency object) {
				return createCapabilityDependencyAdapter();
			}
			@Override
			public Adapter caseBusinessItemDefinition(BusinessItemDefinition object) {
				return createBusinessItemDefinitionAdapter();
			}
			@Override
			public Adapter casePracticeDefinition(PracticeDefinition object) {
				return createPracticeDefinitionAdapter();
			}
			@Override
			public Adapter casePracticeCategory(PracticeCategory object) {
				return createPracticeCategoryAdapter();
			}
			@Override
			public Adapter caseCapabilityDefinition(CapabilityDefinition object) {
				return createCapabilityDefinitionAdapter();
			}
			@Override
			public Adapter caseBusinessItemCategory(BusinessItemCategory object) {
				return createBusinessItemCategoryAdapter();
			}
			@Override
			public Adapter caseBusinessItemLibrary(BusinessItemLibrary object) {
				return createBusinessItemLibraryAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseMeasurableElement(MeasurableElement object) {
				return createMeasurableElementAdapter();
			}
			@Override
			public Adapter caseMeasuredCharacteristic(MeasuredCharacteristic object) {
				return createMeasuredCharacteristicAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter casePortContainer(PortContainer object) {
				return createPortContainerAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseOperand(Operand object) {
				return createOperandAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseResourceUse(ResourceUse object) {
				return createResourceUseAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseDeliverableFlow(DeliverableFlow object) {
				return createDeliverableFlowAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseInputDelegation(InputDelegation object) {
				return createInputDelegationAdapter();
			}
			@Override
			public Adapter casePortDelegation(PortDelegation object) {
				return createPortDelegationAdapter();
			}
			@Override
			public Adapter caseBusinessItem(BusinessItem object) {
				return createBusinessItemAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseOrgUnit(OrgUnit object) {
				return createOrgUnitAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object) {
				return createCollaborationAdapter();
			}
			@Override
			public Adapter caseDelegationContext(DelegationContext object) {
				return createDelegationContextAdapter();
			}
			@Override
			public Adapter caseAnalysisContext(AnalysisContext object) {
				return createAnalysisContextAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseReleaseControl(ReleaseControl object) {
				return createReleaseControlAdapter();
			}
			@Override
			public Adapter caseCapabilityOffer(CapabilityOffer object) {
				return createCapabilityOfferAdapter();
			}
			@Override
			public Adapter caseCapabilityMethod(CapabilityMethod object) {
				return createCapabilityMethodAdapter();
			}
			@Override
			public Adapter casePerformer(Performer object) {
				return createPerformerAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter casePool(Pool object) {
				return createPoolAdapter();
			}
			@Override
			public Adapter caseCalendarService(CalendarService object) {
				return createCalendarServiceAdapter();
			}
			@Override
			public Adapter caseValueAdd(ValueAdd object) {
				return createValueAddAdapter();
			}
			@Override
			public Adapter caseValuePropositionComponent(ValuePropositionComponent object) {
				return createValuePropositionComponentAdapter();
			}
			@Override
			public Adapter caseOutputDelegation(OutputDelegation object) {
				return createOutputDelegationAdapter();
			}
			@Override
			public Adapter caseValueProposition(ValueProposition object) {
				return createValuePropositionAdapter();
			}
			@Override
			public Adapter casePracticeLibrary(PracticeLibrary object) {
				return createPracticeLibraryAdapter();
			}
			@Override
			public Adapter caseBusinessNetwork(BusinessNetwork object) {
				return createBusinessNetworkAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter caseCommunity(Community object) {
				return createCommunityAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseCapabilityCategory(CapabilityCategory object) {
				return createCapabilityCategoryAdapter();
			}
			@Override
			public Adapter caseInteger(vdml.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseDecoratedRole(DecoratedRole object) {
				return createDecoratedRoleAdapter();
			}
			@Override
			public Adapter caseTargetRole(TargetRole object) {
				return createTargetRoleAdapter();
			}
			@Override
			public Adapter caseSourceRole(SourceRole object) {
				return createSourceRoleAdapter();
			}
			@Override
			public Adapter caseSourceTargetRole(SourceTargetRole object) {
				return createSourceTargetRoleAdapter();
			}
			@Override
			public Adapter caseDecoratedValueProposition(DecoratedValueProposition object) {
				return createDecoratedValuePropositionAdapter();
			}
			@Override
			public Adapter caseObValueProposition(ObValueProposition object) {
				return createObValuePropositionAdapter();
			}
			@Override
			public Adapter caseSubValueProposition(SubValueProposition object) {
				return createSubValuePropositionAdapter();
			}
			@Override
			public Adapter caseSubObjValueProposition(SubObjValueProposition object) {
				return createSubObjValuePropositionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueDeliveryModel <em>Value Delivery Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueDeliveryModel
	 * @generated
	 */
	public Adapter createValueDeliveryModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.VdmlElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.VdmlElement
	 * @generated
	 */
	public Adapter createVdmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueLibrary <em>Value Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueLibrary
	 * @generated
	 */
	public Adapter createValueLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueDefinition
	 * @generated
	 */
	public Adapter createValueDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueCategory <em>Value Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueCategory
	 * @generated
	 */
	public Adapter createValueCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityLibrary <em>Capability Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityLibrary
	 * @generated
	 */
	public Adapter createCapabilityLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityDependency <em>Capability Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityDependency
	 * @generated
	 */
	public Adapter createCapabilityDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.BusinessItemDefinition <em>Business Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.BusinessItemDefinition
	 * @generated
	 */
	public Adapter createBusinessItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.PracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.PracticeDefinition
	 * @generated
	 */
	public Adapter createPracticeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.PracticeCategory <em>Practice Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.PracticeCategory
	 * @generated
	 */
	public Adapter createPracticeCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityDefinition
	 * @generated
	 */
	public Adapter createCapabilityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.BusinessItemCategory <em>Business Item Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.BusinessItemCategory
	 * @generated
	 */
	public Adapter createBusinessItemCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.BusinessItemLibrary <em>Business Item Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.BusinessItemLibrary
	 * @generated
	 */
	public Adapter createBusinessItemLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.MeasurableElement <em>Measurable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.MeasurableElement
	 * @generated
	 */
	public Adapter createMeasurableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.MeasuredCharacteristic <em>Measured Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.MeasuredCharacteristic
	 * @generated
	 */
	public Adapter createMeasuredCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.PortContainer <em>Port Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.PortContainer
	 * @generated
	 */
	public Adapter createPortContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ResourceUse
	 * @generated
	 */
	public Adapter createResourceUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.DeliverableFlow <em>Deliverable Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.DeliverableFlow
	 * @generated
	 */
	public Adapter createDeliverableFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.InputDelegation <em>Input Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.InputDelegation
	 * @generated
	 */
	public Adapter createInputDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.PortDelegation <em>Port Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.PortDelegation
	 * @generated
	 */
	public Adapter createPortDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.BusinessItem <em>Business Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.BusinessItem
	 * @generated
	 */
	public Adapter createBusinessItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.OrgUnit
	 * @generated
	 */
	public Adapter createOrgUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.DelegationContext <em>Delegation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.DelegationContext
	 * @generated
	 */
	public Adapter createDelegationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.AnalysisContext <em>Analysis Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.AnalysisContext
	 * @generated
	 */
	public Adapter createAnalysisContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ReleaseControl <em>Release Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ReleaseControl
	 * @generated
	 */
	public Adapter createReleaseControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityOffer <em>Capability Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityOffer
	 * @generated
	 */
	public Adapter createCapabilityOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityMethod <em>Capability Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityMethod
	 * @generated
	 */
	public Adapter createCapabilityMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Performer
	 * @generated
	 */
	public Adapter createPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Pool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CalendarService <em>Calendar Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CalendarService
	 * @generated
	 */
	public Adapter createCalendarServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueAdd <em>Value Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueAdd
	 * @generated
	 */
	public Adapter createValueAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValuePropositionComponent <em>Value Proposition Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValuePropositionComponent
	 * @generated
	 */
	public Adapter createValuePropositionComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.OutputDelegation <em>Output Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.OutputDelegation
	 * @generated
	 */
	public Adapter createOutputDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ValueProposition <em>Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ValueProposition
	 * @generated
	 */
	public Adapter createValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.PracticeLibrary <em>Practice Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.PracticeLibrary
	 * @generated
	 */
	public Adapter createPracticeLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.BusinessNetwork <em>Business Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.BusinessNetwork
	 * @generated
	 */
	public Adapter createBusinessNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Community
	 * @generated
	 */
	public Adapter createCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.CapabilityCategory <em>Capability Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.CapabilityCategory
	 * @generated
	 */
	public Adapter createCapabilityCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.DecoratedRole <em>Decorated Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.DecoratedRole
	 * @generated
	 */
	public Adapter createDecoratedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.TargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.TargetRole
	 * @generated
	 */
	public Adapter createTargetRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.SourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.SourceRole
	 * @generated
	 */
	public Adapter createSourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.SourceTargetRole <em>Source Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.SourceTargetRole
	 * @generated
	 */
	public Adapter createSourceTargetRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.DecoratedValueProposition <em>Decorated Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.DecoratedValueProposition
	 * @generated
	 */
	public Adapter createDecoratedValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.ObValueProposition <em>Ob Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.ObValueProposition
	 * @generated
	 */
	public Adapter createObValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.SubValueProposition <em>Sub Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.SubValueProposition
	 * @generated
	 */
	public Adapter createSubValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vdml.SubObjValueProposition <em>Sub Obj Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vdml.SubObjValueProposition
	 * @generated
	 */
	public Adapter createSubObjValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VdmlAdapterFactory
