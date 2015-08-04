/**
 */
package vdml.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import smm.SmmPackage;

import smm.impl.SmmPackageImpl;

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
import vdml.VdmlFactory;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlPackageImpl extends EPackageImpl implements VdmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDeliveryModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vdmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDelegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDelegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropositionComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDelegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practiceLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTargetRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratedValuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obValuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subValuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjValuePropositionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vdml.VdmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VdmlPackageImpl() {
		super(eNS_URI, VdmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VdmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VdmlPackage init() {
		if (isInited) return (VdmlPackage)EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI);

		// Obtain or create and register package
		VdmlPackageImpl theVdmlPackage = (VdmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VdmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VdmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) : SmmPackage.eINSTANCE);

		// Create package meta-data objects
		theVdmlPackage.createPackageContents();
		theSmmPackage.createPackageContents();

		// Initialize created meta-data
		theVdmlPackage.initializePackageContents();
		theSmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVdmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VdmlPackage.eNS_URI, theVdmlPackage);
		return theVdmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueDeliveryModel() {
		return valueDeliveryModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_MetricsModel() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_ValueLibrary() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_Capabilitylibrary() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_BusinessItemLibrary() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_Actor() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_PracticeLibrary() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_Scenario() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeliveryModel_Collaboration() {
		return (EReference)valueDeliveryModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVdmlElement() {
		return vdmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVdmlElement_Name() {
		return (EAttribute)vdmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVdmlElement_Description() {
		return (EAttribute)vdmlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVdmlElement_Attribute() {
		return (EReference)vdmlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVdmlElement_Represents() {
		return (EAttribute)vdmlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVdmlElement_Annotation() {
		return (EReference)vdmlElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Tag() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Value() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Text() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueLibrary() {
		return valueLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueLibrary_ValueDefinition() {
		return (EReference)valueLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueLibrary_ValueCategory() {
		return (EReference)valueLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueDefinition() {
		return valueDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDefinition_Category() {
		return (EReference)valueDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDefinition_CharacteristicDefinition() {
		return (EReference)valueDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueCategory() {
		return valueCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCategory_ParentCategory() {
		return (EReference)valueCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCategory_ChildCategory() {
		return (EReference)valueCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCategory_CategoryValue() {
		return (EReference)valueCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityLibrary() {
		return capabilityLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityLibrary_Capability() {
		return (EReference)capabilityLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityLibrary_CapabilityDependency() {
		return (EReference)capabilityLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_ParentCabability() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_ChildCapability() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_CharacteristicDefinition() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDependency() {
		return capabilityDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDependency_IsTangible() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDependency_DeliverableDefinition() {
		return (EReference)capabilityDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDependency_Source() {
		return (EReference)capabilityDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDependency_Target() {
		return (EReference)capabilityDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDependency_IsFromExternalSource() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityDependency_IsForExternalTarget() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemDefinition() {
		return businessItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemDefinition_PracticeDefinition() {
		return (EReference)businessItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemDefinition_SupportedCapability() {
		return (EReference)businessItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessItemDefinition_IsFungible() {
		return (EAttribute)businessItemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemDefinition_Category() {
		return (EReference)businessItemDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemDefinition_CharacteristicDefinition() {
		return (EReference)businessItemDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessItemDefinition_IsShareable() {
		return (EAttribute)businessItemDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemDefinition_CapabilityDependency() {
		return (EReference)businessItemDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPracticeDefinition() {
		return practiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeDefinition_Category() {
		return (EReference)practiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeDefinition_Capability() {
		return (EReference)practiceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeDefinition_ResourceDefinition() {
		return (EReference)practiceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPracticeCategory() {
		return practiceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeCategory_ParentCategory() {
		return (EReference)practiceCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeCategory_ChildCategory() {
		return (EReference)practiceCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeCategory_CategoryPractice() {
		return (EReference)practiceCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDefinition() {
		return capabilityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinition_Output() {
		return (EReference)capabilityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinition_Input() {
		return (EReference)capabilityDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinition_CapabilityResourceDefinition() {
		return (EReference)capabilityDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinition_PracticeDefinition() {
		return (EReference)capabilityDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemCategory() {
		return businessItemCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemCategory_ParentCategory() {
		return (EReference)businessItemCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemCategory_ChildCategory() {
		return (EReference)businessItemCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemCategory_CategoryItem() {
		return (EReference)businessItemCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItemLibrary() {
		return businessItemLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemLibrary_BusinessItemDefinition() {
		return (EReference)businessItemLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItemLibrary_BusinessItemcategory() {
		return (EReference)businessItemLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Assignment() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_ParticipantCalendar() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurableElement() {
		return measurableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurableElement_MeasuredCharacteristic() {
		return (EReference)measurableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasuredCharacteristic() {
		return measuredCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasuredCharacteristic_Measurement() {
		return (EReference)measuredCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasuredCharacteristic_CharacteristicDefinition() {
		return (EReference)measuredCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_AssignedRole() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_AssignableResource() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Participant() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_PerformedWork() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Port() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleResource() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ProvidedProposition() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ReceivedProposition() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IsLead() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleAssignment() {
		return (EReference)roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_CapabilityRequirement() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_CollaborationGoal() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ResourceUse() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_DelegationContext() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_AppliedCapabilityOffer() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Duration() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ImplementedPractice() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_RecurrenceInterval() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_PerformingRole() {
		return (EReference)activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortContainer() {
		return portContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortContainer_ContainedPort() {
		return (EReference)portContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsIntermediate() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_PlanningPercentage() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_BatchSize() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Offset() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Condition() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Handler() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Body() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperand_Alias() {
		return (EReference)operandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperand_MeasuredCharacteristic() {
		return (EReference)operandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Activity() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceUse() {
		return resourceUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_Deliverable() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_Resource() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_Quantity() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_Duration() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_PlanningPercentage() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUse_InputDriven() {
		return (EAttribute)resourceUseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceUse_Condition() {
		return (EReference)resourceUseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUse_IsExclusive() {
		return (EAttribute)resourceUseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceUse_ResourceIsConsumed() {
		return (EAttribute)resourceUseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Output() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_OutputDefinition() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_ValueAdd() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_DelegatedOutput() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_OutputDelegation() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_ResourceUse() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverableFlow() {
		return deliverableFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableFlow_Recipient() {
		return (EReference)deliverableFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverableFlow_IsTangible() {
		return (EAttribute)deliverableFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableFlow_Deliverable() {
		return (EReference)deliverableFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableFlow_Duration() {
		return (EReference)deliverableFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableFlow_Channel() {
		return (EReference)deliverableFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableFlow_Provider() {
		return (EReference)deliverableFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_ResourceUse() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_DelegatedInput() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InputDelegation() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Role() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_InputDefinition() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_CorrelationExpression() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Input() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDelegation() {
		return inputDelegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDelegation_Source() {
		return (EReference)inputDelegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDelegation_Target() {
		return (EReference)inputDelegationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDelegation() {
		return portDelegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessItem() {
		return businessItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItem_Definition() {
		return (EReference)businessItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessItem_IsFungible() {
		return (EAttribute)businessItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItem_Assignment() {
		return (EReference)businessItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItem_Store() {
		return (EReference)businessItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItem_Method() {
		return (EReference)businessItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessItem_IsShareable() {
		return (EAttribute)businessItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessItem_Flow() {
		return (EReference)businessItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_StoreOwner() {
		return (EReference)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_StoreContext() {
		return (EReference)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_SupportedCapability() {
		return (EReference)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Duration() {
		return (EReference)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_InventoryLevel() {
		return (EReference)storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Resource() {
		return (EReference)storeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrgUnit() {
		return orgUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrgUnit_CapabilityOffer() {
		return (EReference)orgUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrgUnit_OwnedMethod() {
		return (EReference)orgUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrgUnit_Position() {
		return (EReference)orgUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrgUnit_Location() {
		return (EReference)orgUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrgUnit_OwnedStore() {
		return (EReference)orgUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Goal() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Activity() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Flow() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_BusinessItem() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_InternalPortDelegation() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_DelegationContext() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Scenario() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_OwnedAssignment() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationContext() {
		return delegationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationContext_ParentContext() {
		return (EReference)delegationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationContext_ContextBasedPortDelegation() {
		return (EReference)delegationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationContext_ContextBasedAssignment() {
		return (EReference)delegationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationContext_DelegatedActivity() {
		return (EReference)delegationContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationContext_ContextCollaboration() {
		return (EReference)delegationContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisContext() {
		return analysisContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisContext_DelegationtContext() {
		return (EReference)analysisContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisContext_ContextObservation() {
		return (EReference)analysisContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisContext_ContextStore() {
		return (EReference)analysisContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Horizon() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Type() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ReleaseControl() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_IsDefault() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_HeatThreshold() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ContextCollaboration() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseControl() {
		return releaseControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseControl_Strategy() {
		return (EReference)releaseControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseControl_Scenario() {
		return (EReference)releaseControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityOffer() {
		return capabilityOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_Capability() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_CapabilityResource() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_Method() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_ReleaseControl() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_ApplyingActivity() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_HeatIndex() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_Location() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityOffer_CapabilityProvider() {
		return (EReference)capabilityOfferEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityMethod() {
		return capabilityMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityMethod_Performer() {
		return (EReference)capabilityMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityMethod_MethodOwner() {
		return (EReference)capabilityMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityMethod_ImplementedPractice() {
		return (EReference)capabilityMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityMethod_MethodResource() {
		return (EReference)capabilityMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityMethod_SupportedCapability() {
		return (EReference)capabilityMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformer() {
		return performerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_ActorPool() {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_PoolCalendar() {
		return (EReference)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_PoolSize() {
		return (EReference)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Position() {
		return (EReference)poolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarService() {
		return calendarServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueAdd() {
		return valueAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_ValueMeasurement() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_PropositionComponent() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_ValueDefinition() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_Benchmark() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_AggregatedFrom() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueAdd_AggregatedTo() {
		return (EReference)valueAddEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePropositionComponent() {
		return valuePropositionComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropositionComponent_PercentageWeight() {
		return (EReference)valuePropositionComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropositionComponent_ComponentValue() {
		return (EReference)valuePropositionComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropositionComponent_SatisfactionLevel() {
		return (EReference)valuePropositionComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropositionComponent_ArticulatedValue() {
		return (EReference)valuePropositionComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDelegation() {
		return outputDelegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDelegation_Source() {
		return (EReference)outputDelegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDelegation_Target() {
		return (EReference)outputDelegationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueProposition() {
		return valuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProposition_Component() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProposition_Recipient() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProposition_PropositionValue() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProposition_SatisfactionLevel() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProposition_Provider() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPracticeLibrary() {
		return practiceLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeLibrary_PracticeDefinition() {
		return (EReference)practiceLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPracticeLibrary_PracticeCategory() {
		return (EReference)practiceLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessNetwork() {
		return businessNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessNetwork_Party() {
		return (EReference)businessNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_ValueMargin() {
		return (EReference)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_Profit() {
		return (EReference)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParty_IsFocalPoint() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunity() {
		return communityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunity_Member() {
		return (EReference)communityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityCategory() {
		return capabilityCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecoratedRole() {
		return decoratedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetRole() {
		return targetRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceRole() {
		return sourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRole_TargetObProposition() {
		return (EReference)sourceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRole_TargetSubProposition() {
		return (EReference)sourceRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceTargetRole() {
		return sourceTargetRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecoratedValueProposition() {
		return decoratedValuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecoratedValueProposition__GetSourceRole() {
		return decoratedValuePropositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObValueProposition() {
		return obValuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObValueProposition_ObSource() {
		return (EReference)obValuePropositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObValueProposition__GetSourceRole() {
		return obValuePropositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubValueProposition() {
		return subValuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubValueProposition_SubSource() {
		return (EReference)subValuePropositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubValueProposition__GetSourceRole() {
		return subValuePropositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjValueProposition() {
		return subObjValuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VdmlFactory getVdmlFactory() {
		return (VdmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		valueDeliveryModelEClass = createEClass(VALUE_DELIVERY_MODEL);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__METRICS_MODEL);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__VALUE_LIBRARY);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__ACTOR);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__SCENARIO);
		createEReference(valueDeliveryModelEClass, VALUE_DELIVERY_MODEL__COLLABORATION);

		vdmlElementEClass = createEClass(VDML_ELEMENT);
		createEAttribute(vdmlElementEClass, VDML_ELEMENT__NAME);
		createEAttribute(vdmlElementEClass, VDML_ELEMENT__DESCRIPTION);
		createEReference(vdmlElementEClass, VDML_ELEMENT__ATTRIBUTE);
		createEAttribute(vdmlElementEClass, VDML_ELEMENT__REPRESENTS);
		createEReference(vdmlElementEClass, VDML_ELEMENT__ANNOTATION);

		stringEClass = createEClass(STRING);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TAG);
		createEReference(attributeEClass, ATTRIBUTE__VALUE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__TEXT);

		valueLibraryEClass = createEClass(VALUE_LIBRARY);
		createEReference(valueLibraryEClass, VALUE_LIBRARY__VALUE_DEFINITION);
		createEReference(valueLibraryEClass, VALUE_LIBRARY__VALUE_CATEGORY);

		valueDefinitionEClass = createEClass(VALUE_DEFINITION);
		createEReference(valueDefinitionEClass, VALUE_DEFINITION__CATEGORY);
		createEReference(valueDefinitionEClass, VALUE_DEFINITION__CHARACTERISTIC_DEFINITION);

		valueCategoryEClass = createEClass(VALUE_CATEGORY);
		createEReference(valueCategoryEClass, VALUE_CATEGORY__PARENT_CATEGORY);
		createEReference(valueCategoryEClass, VALUE_CATEGORY__CHILD_CATEGORY);
		createEReference(valueCategoryEClass, VALUE_CATEGORY__CATEGORY_VALUE);

		capabilityLibraryEClass = createEClass(CAPABILITY_LIBRARY);
		createEReference(capabilityLibraryEClass, CAPABILITY_LIBRARY__CAPABILITY);
		createEReference(capabilityLibraryEClass, CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__PARENT_CABABILITY);
		createEReference(capabilityEClass, CAPABILITY__CHILD_CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__CHARACTERISTIC_DEFINITION);

		capabilityDependencyEClass = createEClass(CAPABILITY_DEPENDENCY);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__IS_TANGIBLE);
		createEReference(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION);
		createEReference(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__SOURCE);
		createEReference(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__TARGET);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET);

		businessItemDefinitionEClass = createEClass(BUSINESS_ITEM_DEFINITION);
		createEReference(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION);
		createEReference(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY);
		createEAttribute(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE);
		createEReference(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__CATEGORY);
		createEReference(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION);
		createEAttribute(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__IS_SHAREABLE);
		createEReference(businessItemDefinitionEClass, BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY);

		practiceDefinitionEClass = createEClass(PRACTICE_DEFINITION);
		createEReference(practiceDefinitionEClass, PRACTICE_DEFINITION__CATEGORY);
		createEReference(practiceDefinitionEClass, PRACTICE_DEFINITION__CAPABILITY);
		createEReference(practiceDefinitionEClass, PRACTICE_DEFINITION__RESOURCE_DEFINITION);

		practiceCategoryEClass = createEClass(PRACTICE_CATEGORY);
		createEReference(practiceCategoryEClass, PRACTICE_CATEGORY__PARENT_CATEGORY);
		createEReference(practiceCategoryEClass, PRACTICE_CATEGORY__CHILD_CATEGORY);
		createEReference(practiceCategoryEClass, PRACTICE_CATEGORY__CATEGORY_PRACTICE);

		capabilityDefinitionEClass = createEClass(CAPABILITY_DEFINITION);
		createEReference(capabilityDefinitionEClass, CAPABILITY_DEFINITION__OUTPUT);
		createEReference(capabilityDefinitionEClass, CAPABILITY_DEFINITION__INPUT);
		createEReference(capabilityDefinitionEClass, CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION);
		createEReference(capabilityDefinitionEClass, CAPABILITY_DEFINITION__PRACTICE_DEFINITION);

		businessItemCategoryEClass = createEClass(BUSINESS_ITEM_CATEGORY);
		createEReference(businessItemCategoryEClass, BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY);
		createEReference(businessItemCategoryEClass, BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY);
		createEReference(businessItemCategoryEClass, BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM);

		businessItemLibraryEClass = createEClass(BUSINESS_ITEM_LIBRARY);
		createEReference(businessItemLibraryEClass, BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION);
		createEReference(businessItemLibraryEClass, BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY);

		actorEClass = createEClass(ACTOR);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__ASSIGNMENT);
		createEReference(participantEClass, PARTICIPANT__PARTICIPANT_CALENDAR);

		measurableElementEClass = createEClass(MEASURABLE_ELEMENT);
		createEReference(measurableElementEClass, MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC);

		measuredCharacteristicEClass = createEClass(MEASURED_CHARACTERISTIC);
		createEReference(measuredCharacteristicEClass, MEASURED_CHARACTERISTIC__MEASUREMENT);
		createEReference(measuredCharacteristicEClass, MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__ASSIGNED_ROLE);
		createEReference(assignmentEClass, ASSIGNMENT__ASSIGNABLE_RESOURCE);
		createEReference(assignmentEClass, ASSIGNMENT__PARTICIPANT);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PERFORMED_WORK);
		createEReference(roleEClass, ROLE__PORT);
		createEReference(roleEClass, ROLE__ROLE_RESOURCE);
		createEReference(roleEClass, ROLE__PROVIDED_PROPOSITION);
		createEReference(roleEClass, ROLE__RECEIVED_PROPOSITION);
		createEAttribute(roleEClass, ROLE__IS_LEAD);
		createEReference(roleEClass, ROLE__ROLE_ASSIGNMENT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CAPABILITY_REQUIREMENT);
		createEReference(activityEClass, ACTIVITY__COLLABORATION_GOAL);
		createEReference(activityEClass, ACTIVITY__RESOURCE_USE);
		createEReference(activityEClass, ACTIVITY__DELEGATION_CONTEXT);
		createEReference(activityEClass, ACTIVITY__APPLIED_CAPABILITY_OFFER);
		createEReference(activityEClass, ACTIVITY__DURATION);
		createEReference(activityEClass, ACTIVITY__IMPLEMENTED_PRACTICE);
		createEReference(activityEClass, ACTIVITY__RECURRENCE_INTERVAL);
		createEReference(activityEClass, ACTIVITY__PERFORMING_ROLE);

		portContainerEClass = createEClass(PORT_CONTAINER);
		createEReference(portContainerEClass, PORT_CONTAINER__CONTAINED_PORT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_INTERMEDIATE);
		createEReference(portEClass, PORT__PLANNING_PERCENTAGE);
		createEReference(portEClass, PORT__BATCH_SIZE);
		createEReference(portEClass, PORT__OFFSET);
		createEReference(portEClass, PORT__CONDITION);
		createEReference(portEClass, PORT__HANDLER);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__BODY);
		createEReference(expressionEClass, EXPRESSION__OPERAND);

		operandEClass = createEClass(OPERAND);
		createEReference(operandEClass, OPERAND__ALIAS);
		createEReference(operandEClass, OPERAND__MEASURED_CHARACTERISTIC);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__ACTIVITY);

		resourceUseEClass = createEClass(RESOURCE_USE);
		createEReference(resourceUseEClass, RESOURCE_USE__DELIVERABLE);
		createEReference(resourceUseEClass, RESOURCE_USE__RESOURCE);
		createEReference(resourceUseEClass, RESOURCE_USE__QUANTITY);
		createEReference(resourceUseEClass, RESOURCE_USE__DURATION);
		createEReference(resourceUseEClass, RESOURCE_USE__PLANNING_PERCENTAGE);
		createEAttribute(resourceUseEClass, RESOURCE_USE__INPUT_DRIVEN);
		createEReference(resourceUseEClass, RESOURCE_USE__CONDITION);
		createEAttribute(resourceUseEClass, RESOURCE_USE__IS_EXCLUSIVE);
		createEAttribute(resourceUseEClass, RESOURCE_USE__RESOURCE_IS_CONSUMED);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__OUTPUT);
		createEReference(outputPortEClass, OUTPUT_PORT__OUTPUT_DEFINITION);
		createEReference(outputPortEClass, OUTPUT_PORT__VALUE_ADD);
		createEReference(outputPortEClass, OUTPUT_PORT__DELEGATED_OUTPUT);
		createEReference(outputPortEClass, OUTPUT_PORT__OUTPUT_DELEGATION);
		createEReference(outputPortEClass, OUTPUT_PORT__RESOURCE_USE);

		deliverableFlowEClass = createEClass(DELIVERABLE_FLOW);
		createEReference(deliverableFlowEClass, DELIVERABLE_FLOW__RECIPIENT);
		createEAttribute(deliverableFlowEClass, DELIVERABLE_FLOW__IS_TANGIBLE);
		createEReference(deliverableFlowEClass, DELIVERABLE_FLOW__DELIVERABLE);
		createEReference(deliverableFlowEClass, DELIVERABLE_FLOW__DURATION);
		createEReference(deliverableFlowEClass, DELIVERABLE_FLOW__CHANNEL);
		createEReference(deliverableFlowEClass, DELIVERABLE_FLOW__PROVIDER);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__RESOURCE_USE);
		createEReference(inputPortEClass, INPUT_PORT__DELEGATED_INPUT);
		createEReference(inputPortEClass, INPUT_PORT__INPUT_DELEGATION);
		createEReference(inputPortEClass, INPUT_PORT__ROLE);
		createEReference(inputPortEClass, INPUT_PORT__INPUT_DEFINITION);
		createEReference(inputPortEClass, INPUT_PORT__CORRELATION_EXPRESSION);
		createEReference(inputPortEClass, INPUT_PORT__INPUT);

		inputDelegationEClass = createEClass(INPUT_DELEGATION);
		createEReference(inputDelegationEClass, INPUT_DELEGATION__SOURCE);
		createEReference(inputDelegationEClass, INPUT_DELEGATION__TARGET);

		portDelegationEClass = createEClass(PORT_DELEGATION);

		businessItemEClass = createEClass(BUSINESS_ITEM);
		createEReference(businessItemEClass, BUSINESS_ITEM__DEFINITION);
		createEAttribute(businessItemEClass, BUSINESS_ITEM__IS_FUNGIBLE);
		createEReference(businessItemEClass, BUSINESS_ITEM__ASSIGNMENT);
		createEReference(businessItemEClass, BUSINESS_ITEM__STORE);
		createEReference(businessItemEClass, BUSINESS_ITEM__METHOD);
		createEAttribute(businessItemEClass, BUSINESS_ITEM__IS_SHAREABLE);
		createEReference(businessItemEClass, BUSINESS_ITEM__FLOW);

		storeEClass = createEClass(STORE);
		createEReference(storeEClass, STORE__STORE_OWNER);
		createEReference(storeEClass, STORE__STORE_CONTEXT);
		createEReference(storeEClass, STORE__SUPPORTED_CAPABILITY);
		createEReference(storeEClass, STORE__DURATION);
		createEReference(storeEClass, STORE__INVENTORY_LEVEL);
		createEReference(storeEClass, STORE__RESOURCE);

		orgUnitEClass = createEClass(ORG_UNIT);
		createEReference(orgUnitEClass, ORG_UNIT__CAPABILITY_OFFER);
		createEReference(orgUnitEClass, ORG_UNIT__OWNED_METHOD);
		createEReference(orgUnitEClass, ORG_UNIT__POSITION);
		createEReference(orgUnitEClass, ORG_UNIT__LOCATION);
		createEReference(orgUnitEClass, ORG_UNIT__OWNED_STORE);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);
		createEReference(collaborationEClass, COLLABORATION__GOAL);
		createEReference(collaborationEClass, COLLABORATION__ACTIVITY);
		createEReference(collaborationEClass, COLLABORATION__FLOW);
		createEReference(collaborationEClass, COLLABORATION__BUSINESS_ITEM);
		createEReference(collaborationEClass, COLLABORATION__INTERNAL_PORT_DELEGATION);
		createEReference(collaborationEClass, COLLABORATION__DELEGATION_CONTEXT);
		createEReference(collaborationEClass, COLLABORATION__SCENARIO);
		createEReference(collaborationEClass, COLLABORATION__OWNED_ASSIGNMENT);

		delegationContextEClass = createEClass(DELEGATION_CONTEXT);
		createEReference(delegationContextEClass, DELEGATION_CONTEXT__PARENT_CONTEXT);
		createEReference(delegationContextEClass, DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION);
		createEReference(delegationContextEClass, DELEGATION_CONTEXT__CONTEXT_BASED_ASSIGNMENT);
		createEReference(delegationContextEClass, DELEGATION_CONTEXT__DELEGATED_ACTIVITY);
		createEReference(delegationContextEClass, DELEGATION_CONTEXT__CONTEXT_COLLABORATION);

		analysisContextEClass = createEClass(ANALYSIS_CONTEXT);
		createEReference(analysisContextEClass, ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT);
		createEReference(analysisContextEClass, ANALYSIS_CONTEXT__CONTEXT_OBSERVATION);
		createEReference(analysisContextEClass, ANALYSIS_CONTEXT__CONTEXT_STORE);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__HORIZON);
		createEReference(scenarioEClass, SCENARIO__TYPE);
		createEReference(scenarioEClass, SCENARIO__RELEASE_CONTROL);
		createEAttribute(scenarioEClass, SCENARIO__IS_DEFAULT);
		createEReference(scenarioEClass, SCENARIO__HEAT_THRESHOLD);
		createEReference(scenarioEClass, SCENARIO__CONTEXT_COLLABORATION);

		releaseControlEClass = createEClass(RELEASE_CONTROL);
		createEReference(releaseControlEClass, RELEASE_CONTROL__STRATEGY);
		createEReference(releaseControlEClass, RELEASE_CONTROL__SCENARIO);

		capabilityOfferEClass = createEClass(CAPABILITY_OFFER);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__CAPABILITY);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__CAPABILITY_RESOURCE);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__METHOD);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__RELEASE_CONTROL);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__APPLYING_ACTIVITY);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__HEAT_INDEX);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__LOCATION);
		createEReference(capabilityOfferEClass, CAPABILITY_OFFER__CAPABILITY_PROVIDER);

		capabilityMethodEClass = createEClass(CAPABILITY_METHOD);
		createEReference(capabilityMethodEClass, CAPABILITY_METHOD__PERFORMER);
		createEReference(capabilityMethodEClass, CAPABILITY_METHOD__METHOD_OWNER);
		createEReference(capabilityMethodEClass, CAPABILITY_METHOD__IMPLEMENTED_PRACTICE);
		createEReference(capabilityMethodEClass, CAPABILITY_METHOD__METHOD_RESOURCE);
		createEReference(capabilityMethodEClass, CAPABILITY_METHOD__SUPPORTED_CAPABILITY);

		performerEClass = createEClass(PERFORMER);

		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__ACTOR_POOL);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__POOL_CALENDAR);
		createEReference(poolEClass, POOL__POOL_SIZE);
		createEReference(poolEClass, POOL__POSITION);

		calendarServiceEClass = createEClass(CALENDAR_SERVICE);

		valueAddEClass = createEClass(VALUE_ADD);
		createEReference(valueAddEClass, VALUE_ADD__VALUE_MEASUREMENT);
		createEReference(valueAddEClass, VALUE_ADD__PROPOSITION_COMPONENT);
		createEReference(valueAddEClass, VALUE_ADD__VALUE_DEFINITION);
		createEReference(valueAddEClass, VALUE_ADD__BENCHMARK);
		createEReference(valueAddEClass, VALUE_ADD__AGGREGATED_FROM);
		createEReference(valueAddEClass, VALUE_ADD__AGGREGATED_TO);

		valuePropositionComponentEClass = createEClass(VALUE_PROPOSITION_COMPONENT);
		createEReference(valuePropositionComponentEClass, VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT);
		createEReference(valuePropositionComponentEClass, VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE);
		createEReference(valuePropositionComponentEClass, VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL);
		createEReference(valuePropositionComponentEClass, VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE);

		outputDelegationEClass = createEClass(OUTPUT_DELEGATION);
		createEReference(outputDelegationEClass, OUTPUT_DELEGATION__SOURCE);
		createEReference(outputDelegationEClass, OUTPUT_DELEGATION__TARGET);

		valuePropositionEClass = createEClass(VALUE_PROPOSITION);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__COMPONENT);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__RECIPIENT);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__PROPOSITION_VALUE);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__SATISFACTION_LEVEL);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__PROVIDER);

		practiceLibraryEClass = createEClass(PRACTICE_LIBRARY);
		createEReference(practiceLibraryEClass, PRACTICE_LIBRARY__PRACTICE_DEFINITION);
		createEReference(practiceLibraryEClass, PRACTICE_LIBRARY__PRACTICE_CATEGORY);

		businessNetworkEClass = createEClass(BUSINESS_NETWORK);
		createEReference(businessNetworkEClass, BUSINESS_NETWORK__PARTY);

		partyEClass = createEClass(PARTY);
		createEReference(partyEClass, PARTY__VALUE_MARGIN);
		createEReference(partyEClass, PARTY__PROFIT);
		createEAttribute(partyEClass, PARTY__IS_FOCAL_POINT);

		communityEClass = createEClass(COMMUNITY);
		createEReference(communityEClass, COMMUNITY__MEMBER);

		memberEClass = createEClass(MEMBER);

		personEClass = createEClass(PERSON);

		capabilityCategoryEClass = createEClass(CAPABILITY_CATEGORY);

		integerEClass = createEClass(INTEGER);

		decoratedRoleEClass = createEClass(DECORATED_ROLE);

		targetRoleEClass = createEClass(TARGET_ROLE);

		sourceRoleEClass = createEClass(SOURCE_ROLE);
		createEReference(sourceRoleEClass, SOURCE_ROLE__TARGET_OB_PROPOSITION);
		createEReference(sourceRoleEClass, SOURCE_ROLE__TARGET_SUB_PROPOSITION);

		sourceTargetRoleEClass = createEClass(SOURCE_TARGET_ROLE);

		decoratedValuePropositionEClass = createEClass(DECORATED_VALUE_PROPOSITION);
		createEOperation(decoratedValuePropositionEClass, DECORATED_VALUE_PROPOSITION___GET_SOURCE_ROLE);

		obValuePropositionEClass = createEClass(OB_VALUE_PROPOSITION);
		createEReference(obValuePropositionEClass, OB_VALUE_PROPOSITION__OB_SOURCE);
		createEOperation(obValuePropositionEClass, OB_VALUE_PROPOSITION___GET_SOURCE_ROLE);

		subValuePropositionEClass = createEClass(SUB_VALUE_PROPOSITION);
		createEReference(subValuePropositionEClass, SUB_VALUE_PROPOSITION__SUB_SOURCE);
		createEOperation(subValuePropositionEClass, SUB_VALUE_PROPOSITION___GET_SOURCE_ROLE);

		subObjValuePropositionEClass = createEClass(SUB_OBJ_VALUE_PROPOSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SmmPackage theSmmPackage = (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueDeliveryModelEClass.getESuperTypes().add(this.getVdmlElement());
		attributeEClass.getESuperTypes().add(this.getVdmlElement());
		annotationEClass.getESuperTypes().add(this.getVdmlElement());
		valueLibraryEClass.getESuperTypes().add(this.getVdmlElement());
		valueDefinitionEClass.getESuperTypes().add(this.getVdmlElement());
		valueCategoryEClass.getESuperTypes().add(this.getVdmlElement());
		capabilityLibraryEClass.getESuperTypes().add(this.getVdmlElement());
		capabilityEClass.getESuperTypes().add(this.getVdmlElement());
		capabilityDependencyEClass.getESuperTypes().add(this.getVdmlElement());
		businessItemDefinitionEClass.getESuperTypes().add(this.getVdmlElement());
		practiceDefinitionEClass.getESuperTypes().add(this.getVdmlElement());
		practiceCategoryEClass.getESuperTypes().add(this.getVdmlElement());
		capabilityDefinitionEClass.getESuperTypes().add(this.getCapability());
		businessItemCategoryEClass.getESuperTypes().add(this.getVdmlElement());
		businessItemLibraryEClass.getESuperTypes().add(this.getVdmlElement());
		actorEClass.getESuperTypes().add(this.getParticipant());
		participantEClass.getESuperTypes().add(this.getMeasurableElement());
		measurableElementEClass.getESuperTypes().add(this.getVdmlElement());
		measuredCharacteristicEClass.getESuperTypes().add(this.getVdmlElement());
		assignmentEClass.getESuperTypes().add(this.getVdmlElement());
		roleEClass.getESuperTypes().add(this.getParticipant());
		activityEClass.getESuperTypes().add(this.getPortContainer());
		portContainerEClass.getESuperTypes().add(this.getMeasurableElement());
		portEClass.getESuperTypes().add(this.getMeasurableElement());
		expressionEClass.getESuperTypes().add(this.getVdmlElement());
		operandEClass.getESuperTypes().add(this.getVdmlElement());
		goalEClass.getESuperTypes().add(this.getMeasurableElement());
		resourceUseEClass.getESuperTypes().add(this.getMeasurableElement());
		outputPortEClass.getESuperTypes().add(this.getPort());
		deliverableFlowEClass.getESuperTypes().add(this.getMeasurableElement());
		inputPortEClass.getESuperTypes().add(this.getPort());
		inputDelegationEClass.getESuperTypes().add(this.getPortDelegation());
		portDelegationEClass.getESuperTypes().add(this.getVdmlElement());
		businessItemEClass.getESuperTypes().add(this.getMeasurableElement());
		storeEClass.getESuperTypes().add(this.getPortContainer());
		orgUnitEClass.getESuperTypes().add(this.getCollaboration());
		collaborationEClass.getESuperTypes().add(this.getParticipant());
		collaborationEClass.getESuperTypes().add(this.getPortContainer());
		delegationContextEClass.getESuperTypes().add(this.getAnalysisContext());
		analysisContextEClass.getESuperTypes().add(this.getVdmlElement());
		scenarioEClass.getESuperTypes().add(this.getAnalysisContext());
		releaseControlEClass.getESuperTypes().add(this.getVdmlElement());
		capabilityOfferEClass.getESuperTypes().add(this.getMeasurableElement());
		capabilityMethodEClass.getESuperTypes().add(this.getCollaboration());
		performerEClass.getESuperTypes().add(this.getRole());
		positionEClass.getESuperTypes().add(this.getRole());
		poolEClass.getESuperTypes().add(this.getStore());
		calendarServiceEClass.getESuperTypes().add(this.getVdmlElement());
		valueAddEClass.getESuperTypes().add(this.getMeasurableElement());
		valuePropositionComponentEClass.getESuperTypes().add(this.getMeasurableElement());
		outputDelegationEClass.getESuperTypes().add(this.getPortDelegation());
		valuePropositionEClass.getESuperTypes().add(this.getMeasurableElement());
		practiceLibraryEClass.getESuperTypes().add(this.getVdmlElement());
		businessNetworkEClass.getESuperTypes().add(this.getCollaboration());
		partyEClass.getESuperTypes().add(this.getRole());
		communityEClass.getESuperTypes().add(this.getCollaboration());
		memberEClass.getESuperTypes().add(this.getRole());
		personEClass.getESuperTypes().add(this.getActor());
		capabilityCategoryEClass.getESuperTypes().add(this.getCapability());
		decoratedRoleEClass.getESuperTypes().add(this.getRole());
		targetRoleEClass.getESuperTypes().add(this.getDecoratedRole());
		sourceRoleEClass.getESuperTypes().add(this.getDecoratedRole());
		sourceTargetRoleEClass.getESuperTypes().add(this.getSourceRole());
		sourceTargetRoleEClass.getESuperTypes().add(this.getTargetRole());
		decoratedValuePropositionEClass.getESuperTypes().add(this.getValueProposition());
		obValuePropositionEClass.getESuperTypes().add(this.getDecoratedValueProposition());
		subValuePropositionEClass.getESuperTypes().add(this.getDecoratedValueProposition());
		subObjValuePropositionEClass.getESuperTypes().add(this.getSubValueProposition());
		subObjValuePropositionEClass.getESuperTypes().add(this.getObValueProposition());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueDeliveryModelEClass, ValueDeliveryModel.class, "ValueDeliveryModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueDeliveryModel_MetricsModel(), theSmmPackage.getSmmModel(), null, "metricsModel", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_ValueLibrary(), this.getValueLibrary(), null, "valueLibrary", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_Capabilitylibrary(), this.getCapabilityLibrary(), null, "capabilitylibrary", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_BusinessItemLibrary(), this.getBusinessItemLibrary(), null, "businessItemLibrary", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_Actor(), this.getActor(), null, "actor", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_PracticeLibrary(), this.getPracticeLibrary(), null, "practiceLibrary", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_Scenario(), this.getScenario(), null, "scenario", null, 1, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDeliveryModel_Collaboration(), this.getCollaboration(), null, "collaboration", null, 0, -1, ValueDeliveryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vdmlElementEClass, VdmlElement.class, "VdmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVdmlElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, VdmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVdmlElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, VdmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVdmlElement_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, VdmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVdmlElement_Represents(), ecorePackage.getEString(), "represents", null, 0, 1, VdmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVdmlElement_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, VdmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringEClass, vdml.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Tag(), this.getString(), null, "tag", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttribute_Value(), this.getString(), null, "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Text(), this.getString(), null, "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueLibraryEClass, ValueLibrary.class, "ValueLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueLibrary_ValueDefinition(), this.getValueDefinition(), null, "valueDefinition", null, 0, -1, ValueLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueLibrary_ValueCategory(), this.getValueCategory(), null, "valueCategory", null, 0, -1, ValueLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueDefinitionEClass, ValueDefinition.class, "ValueDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueDefinition_Category(), this.getValueCategory(), this.getValueCategory_CategoryValue(), "category", null, 0, -1, ValueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueDefinition_CharacteristicDefinition(), theSmmPackage.getCharacteristic(), null, "characteristicDefinition", null, 0, -1, ValueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueCategoryEClass, ValueCategory.class, "ValueCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueCategory_ParentCategory(), this.getValueCategory(), this.getValueCategory_ChildCategory(), "parentCategory", null, 0, -1, ValueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueCategory_ChildCategory(), this.getValueCategory(), this.getValueCategory_ParentCategory(), "childCategory", null, 0, -1, ValueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueCategory_CategoryValue(), this.getValueDefinition(), this.getValueDefinition_Category(), "categoryValue", null, 0, -1, ValueCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityLibraryEClass, CapabilityLibrary.class, "CapabilityLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityLibrary_Capability(), this.getCapability(), null, "capability", null, 0, -1, CapabilityLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityLibrary_CapabilityDependency(), this.getCapabilityDependency(), null, "capabilityDependency", null, 0, -1, CapabilityLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_ParentCabability(), this.getCapability(), this.getCapability_ChildCapability(), "parentCabability", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapability_ChildCapability(), this.getCapability(), this.getCapability_ParentCabability(), "childCapability", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapability_CharacteristicDefinition(), theSmmPackage.getCharacteristic(), null, "characteristicDefinition", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityDependencyEClass, CapabilityDependency.class, "CapabilityDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityDependency_IsTangible(), theTypesPackage.getBoolean(), "isTangible", "true", 1, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDependency_DeliverableDefinition(), this.getBusinessItemDefinition(), this.getBusinessItemDefinition_CapabilityDependency(), "deliverableDefinition", null, 1, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDependency_Source(), this.getCapabilityDefinition(), this.getCapabilityDefinition_Output(), "source", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDependency_Target(), this.getCapabilityDefinition(), this.getCapabilityDefinition_Input(), "target", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCapabilityDependency_IsFromExternalSource(), theTypesPackage.getBoolean(), "isFromExternalSource", "true", 1, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCapabilityDependency_IsForExternalTarget(), theTypesPackage.getBoolean(), "isForExternalTarget", "true", 1, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessItemDefinitionEClass, BusinessItemDefinition.class, "BusinessItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessItemDefinition_PracticeDefinition(), this.getPracticeDefinition(), this.getPracticeDefinition_ResourceDefinition(), "practiceDefinition", null, 0, -1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemDefinition_SupportedCapability(), this.getCapabilityDefinition(), this.getCapabilityDefinition_CapabilityResourceDefinition(), "supportedCapability", null, 0, -1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusinessItemDefinition_IsFungible(), theTypesPackage.getBoolean(), "isFungible", "true", 1, 1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemDefinition_Category(), this.getBusinessItemCategory(), this.getBusinessItemCategory_CategoryItem(), "category", null, 0, -1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemDefinition_CharacteristicDefinition(), theSmmPackage.getCharacteristic(), null, "characteristicDefinition", null, 0, -1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusinessItemDefinition_IsShareable(), theTypesPackage.getBoolean(), "isShareable", "false", 1, 1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemDefinition_CapabilityDependency(), this.getCapabilityDependency(), this.getCapabilityDependency_DeliverableDefinition(), "capabilityDependency", null, 0, -1, BusinessItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(practiceDefinitionEClass, PracticeDefinition.class, "PracticeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPracticeDefinition_Category(), this.getPracticeCategory(), this.getPracticeCategory_CategoryPractice(), "category", null, 0, -1, PracticeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPracticeDefinition_Capability(), this.getCapabilityDefinition(), this.getCapabilityDefinition_PracticeDefinition(), "capability", null, 0, -1, PracticeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPracticeDefinition_ResourceDefinition(), this.getBusinessItemDefinition(), this.getBusinessItemDefinition_PracticeDefinition(), "resourceDefinition", null, 0, -1, PracticeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(practiceCategoryEClass, PracticeCategory.class, "PracticeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPracticeCategory_ParentCategory(), this.getPracticeCategory(), this.getPracticeCategory_ChildCategory(), "parentCategory", null, 0, -1, PracticeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPracticeCategory_ChildCategory(), this.getPracticeCategory(), this.getPracticeCategory_ParentCategory(), "childCategory", null, 0, -1, PracticeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPracticeCategory_CategoryPractice(), this.getPracticeDefinition(), this.getPracticeDefinition_Category(), "categoryPractice", null, 0, -1, PracticeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityDefinitionEClass, CapabilityDefinition.class, "CapabilityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDefinition_Output(), this.getCapabilityDependency(), this.getCapabilityDependency_Source(), "output", null, 0, -1, CapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDefinition_Input(), this.getCapabilityDependency(), this.getCapabilityDependency_Target(), "input", null, 0, -1, CapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDefinition_CapabilityResourceDefinition(), this.getBusinessItemDefinition(), this.getBusinessItemDefinition_SupportedCapability(), "capabilityResourceDefinition", null, 0, -1, CapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityDefinition_PracticeDefinition(), this.getPracticeDefinition(), this.getPracticeDefinition_Capability(), "practiceDefinition", null, 0, -1, CapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessItemCategoryEClass, BusinessItemCategory.class, "BusinessItemCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessItemCategory_ParentCategory(), this.getBusinessItemCategory(), this.getBusinessItemCategory_ChildCategory(), "parentCategory", null, 0, -1, BusinessItemCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemCategory_ChildCategory(), this.getBusinessItemCategory(), this.getBusinessItemCategory_ParentCategory(), "childCategory", null, 0, -1, BusinessItemCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemCategory_CategoryItem(), this.getBusinessItemDefinition(), this.getBusinessItemDefinition_Category(), "categoryItem", null, 0, -1, BusinessItemCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessItemLibraryEClass, BusinessItemLibrary.class, "BusinessItemLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessItemLibrary_BusinessItemDefinition(), this.getBusinessItemDefinition(), null, "businessItemDefinition", null, 0, -1, BusinessItemLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItemLibrary_BusinessItemcategory(), this.getBusinessItemCategory(), null, "businessItemcategory", null, 0, -1, BusinessItemLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(participantEClass, Participant.class, "Participant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Assignment(), this.getAssignment(), this.getAssignment_Participant(), "assignment", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_ParticipantCalendar(), this.getCalendarService(), null, "participantCalendar", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measurableElementEClass, MeasurableElement.class, "MeasurableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurableElement_MeasuredCharacteristic(), this.getMeasuredCharacteristic(), null, "measuredCharacteristic", null, 0, -1, MeasurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measuredCharacteristicEClass, MeasuredCharacteristic.class, "MeasuredCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasuredCharacteristic_Measurement(), theSmmPackage.getMeasurement(), null, "measurement", null, 0, -1, MeasuredCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasuredCharacteristic_CharacteristicDefinition(), theSmmPackage.getCharacteristic(), null, "characteristicDefinition", null, 0, 1, MeasuredCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_AssignedRole(), this.getRole(), this.getRole_RoleAssignment(), "assignedRole", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignment_AssignableResource(), this.getBusinessItem(), this.getBusinessItem_Assignment(), "assignableResource", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignment_Participant(), this.getParticipant(), this.getParticipant_Assignment(), "participant", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_PerformedWork(), this.getActivity(), this.getActivity_PerformingRole(), "performedWork", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_Port(), this.getPort(), this.getPort_Handler(), "port", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_RoleResource(), this.getInputPort(), this.getInputPort_Role(), "roleResource", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ProvidedProposition(), this.getValueProposition(), this.getValueProposition_Provider(), "providedProposition", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ReceivedProposition(), this.getValueProposition(), this.getValueProposition_Recipient(), "receivedProposition", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRole_IsLead(), theTypesPackage.getBoolean(), "isLead", "false", 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_RoleAssignment(), this.getAssignment(), this.getAssignment_AssignedRole(), "roleAssignment", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_CapabilityRequirement(), this.getCapability(), null, "capabilityRequirement", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_CollaborationGoal(), this.getGoal(), this.getGoal_Activity(), "collaborationGoal", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_ResourceUse(), this.getResourceUse(), null, "resourceUse", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_DelegationContext(), this.getDelegationContext(), this.getDelegationContext_DelegatedActivity(), "delegationContext", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_AppliedCapabilityOffer(), this.getCapabilityOffer(), this.getCapabilityOffer_ApplyingActivity(), "appliedCapabilityOffer", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Duration(), this.getMeasuredCharacteristic(), null, "duration", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_ImplementedPractice(), this.getPracticeDefinition(), null, "implementedPractice", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_RecurrenceInterval(), this.getMeasuredCharacteristic(), null, "recurrenceInterval", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_PerformingRole(), this.getRole(), this.getRole_PerformedWork(), "performingRole", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portContainerEClass, PortContainer.class, "PortContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortContainer_ContainedPort(), this.getPort(), null, "containedPort", null, 0, -1, PortContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_IsIntermediate(), theTypesPackage.getBoolean(), "isIntermediate", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_PlanningPercentage(), this.getMeasuredCharacteristic(), null, "planningPercentage", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_BatchSize(), this.getMeasuredCharacteristic(), null, "batchSize", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Offset(), this.getMeasuredCharacteristic(), null, "offset", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Condition(), this.getExpression(), null, "condition", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Handler(), this.getRole(), this.getRole_Port(), "handler", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Body(), this.getString(), null, "body", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_Operand(), this.getOperand(), null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperand_Alias(), this.getString(), null, "alias", null, 0, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperand_MeasuredCharacteristic(), this.getMeasuredCharacteristic(), null, "measuredCharacteristic", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Activity(), this.getActivity(), this.getActivity_CollaborationGoal(), "activity", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceUseEClass, ResourceUse.class, "ResourceUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceUse_Deliverable(), this.getOutputPort(), this.getOutputPort_ResourceUse(), "deliverable", null, 0, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceUse_Resource(), this.getInputPort(), this.getInputPort_ResourceUse(), "resource", null, 0, -1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceUse_Quantity(), this.getMeasuredCharacteristic(), null, "quantity", null, 1, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceUse_Duration(), this.getMeasuredCharacteristic(), null, "duration", null, 0, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceUse_PlanningPercentage(), this.getMeasuredCharacteristic(), null, "planningPercentage", null, 0, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceUse_InputDriven(), theTypesPackage.getBoolean(), "inputDriven", "false", 1, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceUse_Condition(), this.getExpression(), null, "condition", null, 0, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceUse_IsExclusive(), theTypesPackage.getBoolean(), "isExclusive", "false", 1, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceUse_ResourceIsConsumed(), theTypesPackage.getBoolean(), "resourceIsConsumed", "true", 1, 1, ResourceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Output(), this.getDeliverableFlow(), this.getDeliverableFlow_Provider(), "output", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputPort_OutputDefinition(), this.getBusinessItemDefinition(), null, "outputDefinition", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputPort_ValueAdd(), this.getValueAdd(), null, "valueAdd", null, 0, -1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputPort_DelegatedOutput(), this.getOutputDelegation(), this.getOutputDelegation_Target(), "delegatedOutput", null, 0, -1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputPort_OutputDelegation(), this.getOutputDelegation(), this.getOutputDelegation_Source(), "outputDelegation", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputPort_ResourceUse(), this.getResourceUse(), this.getResourceUse_Deliverable(), "resourceUse", null, 0, -1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deliverableFlowEClass, DeliverableFlow.class, "DeliverableFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliverableFlow_Recipient(), this.getInputPort(), this.getInputPort_Input(), "recipient", null, 1, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeliverableFlow_IsTangible(), theTypesPackage.getBoolean(), "isTangible", "true", 1, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeliverableFlow_Deliverable(), this.getBusinessItem(), this.getBusinessItem_Flow(), "deliverable", null, 1, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeliverableFlow_Duration(), this.getMeasuredCharacteristic(), null, "duration", null, 0, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeliverableFlow_Channel(), this.getString(), null, "channel", null, 0, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeliverableFlow_Provider(), this.getOutputPort(), this.getOutputPort_Output(), "provider", null, 1, 1, DeliverableFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_ResourceUse(), this.getResourceUse(), this.getResourceUse_Resource(), "resourceUse", null, 0, -1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_DelegatedInput(), this.getInputDelegation(), this.getInputDelegation_Target(), "delegatedInput", null, 0, -1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_InputDelegation(), this.getInputDelegation(), this.getInputDelegation_Source(), "inputDelegation", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_Role(), this.getRole(), this.getRole_RoleResource(), "role", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_InputDefinition(), this.getBusinessItemDefinition(), null, "inputDefinition", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_CorrelationExpression(), this.getExpression(), null, "correlationExpression", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputPort_Input(), this.getDeliverableFlow(), this.getDeliverableFlow_Recipient(), "input", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inputDelegationEClass, InputDelegation.class, "InputDelegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputDelegation_Source(), this.getInputPort(), this.getInputPort_InputDelegation(), "source", null, 1, 1, InputDelegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInputDelegation_Target(), this.getInputPort(), this.getInputPort_DelegatedInput(), "target", null, 1, 1, InputDelegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portDelegationEClass, PortDelegation.class, "PortDelegation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessItemEClass, BusinessItem.class, "BusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessItem_Definition(), this.getBusinessItemDefinition(), null, "definition", null, 0, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusinessItem_IsFungible(), theTypesPackage.getBoolean(), "isFungible", "true", 1, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItem_Assignment(), this.getAssignment(), this.getAssignment_AssignableResource(), "assignment", null, 0, -1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItem_Store(), this.getStore(), this.getStore_Resource(), "store", null, 0, -1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItem_Method(), this.getCapabilityMethod(), this.getCapabilityMethod_MethodResource(), "method", null, 0, -1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusinessItem_IsShareable(), theTypesPackage.getBoolean(), "isShareable", "false", 1, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessItem_Flow(), this.getDeliverableFlow(), this.getDeliverableFlow_Deliverable(), "flow", null, 0, -1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStore_StoreOwner(), this.getOrgUnit(), this.getOrgUnit_OwnedStore(), "storeOwner", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_StoreContext(), this.getAnalysisContext(), this.getAnalysisContext_ContextStore(), "storeContext", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_SupportedCapability(), this.getCapabilityOffer(), this.getCapabilityOffer_CapabilityResource(), "supportedCapability", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Duration(), this.getMeasuredCharacteristic(), null, "duration", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_InventoryLevel(), this.getMeasuredCharacteristic(), null, "inventoryLevel", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Resource(), this.getBusinessItem(), this.getBusinessItem_Store(), "resource", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orgUnitEClass, OrgUnit.class, "OrgUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrgUnit_CapabilityOffer(), this.getCapabilityOffer(), this.getCapabilityOffer_CapabilityProvider(), "capabilityOffer", null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrgUnit_OwnedMethod(), this.getCapabilityMethod(), this.getCapabilityMethod_MethodOwner(), "ownedMethod", null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrgUnit_Position(), this.getPosition(), null, "position", null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrgUnit_Location(), this.getString(), null, "location", null, 0, 1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrgUnit_OwnedStore(), this.getStore(), this.getStore_StoreOwner(), "ownedStore", null, 0, -1, OrgUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_CollaborationRole(), this.getRole(), null, "collaborationRole", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_Goal(), this.getGoal(), null, "goal", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_Activity(), this.getActivity(), null, "activity", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_Flow(), this.getDeliverableFlow(), null, "flow", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_BusinessItem(), this.getBusinessItem(), null, "businessItem", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_InternalPortDelegation(), this.getPortDelegation(), null, "internalPortDelegation", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_DelegationContext(), this.getDelegationContext(), this.getDelegationContext_ContextCollaboration(), "delegationContext", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_Scenario(), this.getScenario(), this.getScenario_ContextCollaboration(), "scenario", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaboration_OwnedAssignment(), this.getAssignment(), null, "ownedAssignment", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(delegationContextEClass, DelegationContext.class, "DelegationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationContext_ParentContext(), this.getAnalysisContext(), this.getAnalysisContext_DelegationtContext(), "parentContext", null, 1, 1, DelegationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDelegationContext_ContextBasedPortDelegation(), this.getPortDelegation(), null, "contextBasedPortDelegation", null, 0, -1, DelegationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDelegationContext_ContextBasedAssignment(), this.getAssignment(), null, "contextBasedAssignment", null, 0, -1, DelegationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDelegationContext_DelegatedActivity(), this.getActivity(), this.getActivity_DelegationContext(), "delegatedActivity", null, 1, 1, DelegationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDelegationContext_ContextCollaboration(), this.getCollaboration(), this.getCollaboration_DelegationContext(), "contextCollaboration", null, 1, 1, DelegationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(analysisContextEClass, AnalysisContext.class, "AnalysisContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisContext_DelegationtContext(), this.getDelegationContext(), this.getDelegationContext_ParentContext(), "delegationtContext", null, 0, -1, AnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisContext_ContextObservation(), theSmmPackage.getObservation(), null, "contextObservation", null, 0, 1, AnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisContext_ContextStore(), this.getStore(), this.getStore_StoreContext(), "contextStore", null, 0, -1, AnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Horizon(), this.getMeasuredCharacteristic(), null, "horizon", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_Type(), this.getString(), null, "type", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_ReleaseControl(), this.getReleaseControl(), this.getReleaseControl_Scenario(), "releaseControl", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScenario_IsDefault(), theTypesPackage.getBoolean(), "isDefault", "false", 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_HeatThreshold(), this.getMeasuredCharacteristic(), null, "heatThreshold", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_ContextCollaboration(), this.getCollaboration(), this.getCollaboration_Scenario(), "contextCollaboration", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(releaseControlEClass, ReleaseControl.class, "ReleaseControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseControl_Strategy(), this.getString(), null, "strategy", null, 1, 1, ReleaseControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReleaseControl_Scenario(), this.getScenario(), this.getScenario_ReleaseControl(), "scenario", null, 0, -1, ReleaseControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityOfferEClass, CapabilityOffer.class, "CapabilityOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityOffer_Capability(), this.getCapability(), null, "capability", null, 0, 1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_CapabilityResource(), this.getStore(), this.getStore_SupportedCapability(), "capabilityResource", null, 0, -1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_Method(), this.getCapabilityMethod(), this.getCapabilityMethod_SupportedCapability(), "method", null, 0, -1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_ReleaseControl(), this.getReleaseControl(), null, "releaseControl", null, 0, -1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_ApplyingActivity(), this.getActivity(), this.getActivity_AppliedCapabilityOffer(), "applyingActivity", null, 0, -1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_HeatIndex(), this.getMeasuredCharacteristic(), null, "heatIndex", null, 0, 1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_Location(), this.getString(), null, "location", null, 0, 1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityOffer_CapabilityProvider(), this.getOrgUnit(), this.getOrgUnit_CapabilityOffer(), "capabilityProvider", null, 1, 1, CapabilityOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityMethodEClass, CapabilityMethod.class, "CapabilityMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityMethod_Performer(), this.getPerformer(), null, "performer", null, 0, -1, CapabilityMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityMethod_MethodOwner(), this.getOrgUnit(), this.getOrgUnit_OwnedMethod(), "methodOwner", null, 1, 1, CapabilityMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityMethod_ImplementedPractice(), this.getPracticeDefinition(), null, "implementedPractice", null, 0, -1, CapabilityMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityMethod_MethodResource(), this.getBusinessItem(), this.getBusinessItem_Method(), "methodResource", null, 0, -1, CapabilityMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCapabilityMethod_SupportedCapability(), this.getCapabilityOffer(), this.getCapabilityOffer_Method(), "supportedCapability", null, 0, -1, CapabilityMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(performerEClass, Performer.class, "Performer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_ActorPool(), this.getPool(), this.getPool_Position(), "actorPool", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_PoolCalendar(), this.getCalendarService(), null, "poolCalendar", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPool_PoolSize(), this.getMeasuredCharacteristic(), null, "poolSize", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPool_Position(), this.getPosition(), this.getPosition_ActorPool(), "position", null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(calendarServiceEClass, CalendarService.class, "CalendarService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueAddEClass, ValueAdd.class, "ValueAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueAdd_ValueMeasurement(), this.getMeasuredCharacteristic(), null, "valueMeasurement", null, 0, 1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueAdd_PropositionComponent(), this.getValuePropositionComponent(), this.getValuePropositionComponent_ArticulatedValue(), "propositionComponent", null, 0, -1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueAdd_ValueDefinition(), this.getValueDefinition(), null, "valueDefinition", null, 0, 1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueAdd_Benchmark(), this.getMeasuredCharacteristic(), null, "benchmark", null, 0, -1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueAdd_AggregatedFrom(), this.getValueAdd(), this.getValueAdd_AggregatedTo(), "aggregatedFrom", null, 0, -1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueAdd_AggregatedTo(), this.getValueAdd(), this.getValueAdd_AggregatedFrom(), "aggregatedTo", null, 0, -1, ValueAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valuePropositionComponentEClass, ValuePropositionComponent.class, "ValuePropositionComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePropositionComponent_PercentageWeight(), this.getMeasuredCharacteristic(), null, "percentageWeight", null, 0, 1, ValuePropositionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValuePropositionComponent_ComponentValue(), this.getMeasuredCharacteristic(), null, "componentValue", null, 0, 1, ValuePropositionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValuePropositionComponent_SatisfactionLevel(), this.getMeasuredCharacteristic(), null, "satisfactionLevel", null, 0, 1, ValuePropositionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValuePropositionComponent_ArticulatedValue(), this.getValueAdd(), this.getValueAdd_PropositionComponent(), "articulatedValue", null, 1, 1, ValuePropositionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outputDelegationEClass, OutputDelegation.class, "OutputDelegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputDelegation_Source(), this.getOutputPort(), this.getOutputPort_OutputDelegation(), "source", null, 1, 1, OutputDelegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutputDelegation_Target(), this.getOutputPort(), this.getOutputPort_DelegatedOutput(), "target", null, 1, 1, OutputDelegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valuePropositionEClass, ValueProposition.class, "ValueProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueProposition_Component(), this.getValuePropositionComponent(), null, "component", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueProposition_Recipient(), this.getRole(), this.getRole_ReceivedProposition(), "recipient", null, 0, 1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueProposition_PropositionValue(), this.getMeasuredCharacteristic(), null, "propositionValue", null, 0, 1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueProposition_SatisfactionLevel(), this.getMeasuredCharacteristic(), null, "satisfactionLevel", null, 0, 1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueProposition_Provider(), this.getRole(), this.getRole_ProvidedProposition(), "provider", null, 1, 1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(practiceLibraryEClass, PracticeLibrary.class, "PracticeLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPracticeLibrary_PracticeDefinition(), this.getPracticeDefinition(), null, "practiceDefinition", null, 0, -1, PracticeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPracticeLibrary_PracticeCategory(), this.getPracticeCategory(), null, "practiceCategory", null, 0, -1, PracticeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessNetworkEClass, BusinessNetwork.class, "BusinessNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessNetwork_Party(), this.getParty(), null, "party", null, 0, -1, BusinessNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParty_ValueMargin(), this.getMeasuredCharacteristic(), null, "valueMargin", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParty_Profit(), this.getMeasuredCharacteristic(), null, "profit", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParty_IsFocalPoint(), theTypesPackage.getBoolean(), "isFocalPoint", "false", 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communityEClass, Community.class, "Community", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunity_Member(), this.getMember(), null, "member", null, 0, -1, Community.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityCategoryEClass, CapabilityCategory.class, "CapabilityCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, vdml.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decoratedRoleEClass, DecoratedRole.class, "DecoratedRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetRoleEClass, TargetRole.class, "TargetRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceRoleEClass, SourceRole.class, "SourceRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceRole_TargetObProposition(), this.getObValueProposition(), this.getObValueProposition_ObSource(), "targetObProposition", null, 0, -1, SourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceRole_TargetSubProposition(), this.getSubValueProposition(), this.getSubValueProposition_SubSource(), "targetSubProposition", null, 0, -1, SourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTargetRoleEClass, SourceTargetRole.class, "SourceTargetRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decoratedValuePropositionEClass, DecoratedValueProposition.class, "DecoratedValueProposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDecoratedValueProposition__GetSourceRole(), this.getSourceRole(), "getSourceRole", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(obValuePropositionEClass, ObValueProposition.class, "ObValueProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObValueProposition_ObSource(), this.getSourceRole(), this.getSourceRole_TargetObProposition(), "obSource", null, 0, -1, ObValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObValueProposition__GetSourceRole(), this.getSourceRole(), "getSourceRole", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(subValuePropositionEClass, SubValueProposition.class, "SubValueProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubValueProposition_SubSource(), this.getSourceRole(), this.getSourceRole_TargetSubProposition(), "subSource", null, 0, -1, SubValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSubValueProposition__GetSourceRole(), this.getSourceRole(), "getSourceRole", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(subObjValuePropositionEClass, SubObjValueProposition.class, "SubObjValueProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// redefines
		createRedefinesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "VDML"
		   });	
		addAnnotation
		  (stringEClass, 
		   source, 
		   new String[] {
			 "originalName", "string"
		   });	
		addAnnotation
		  (integerEClass, 
		   source, 
		   new String[] {
			 "originalName", "integer"
		   });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";	
		addAnnotation
		  (getOrgUnit_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Collaboration/collaborationRole")
		   });	
		addAnnotation
		  (getCapabilityMethod_Performer(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Collaboration/collaborationRole")
		   });	
		addAnnotation
		  (getBusinessNetwork_Party(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Collaboration/collaborationRole")
		   });	
		addAnnotation
		  (getCommunity_Member(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Collaboration/collaborationRole")
		   });
	}

} //VdmlPackageImpl
