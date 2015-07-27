/**
 */
package smm.impl;

import java.sql.Timestamp;
import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import smm.AbstractMeasureElement;
import smm.Accumulator;
import smm.Annotation;
import smm.Argument;
import smm.Attribute;
import smm.Base1MeasureRelationship;
import smm.Base1MeasurementRelationship;
import smm.Base2MeasureRelationship;
import smm.Base2MeasurementRelationship;
import smm.BaseMeasureRelationship;
import smm.BaseMeasurementRelationship;
import smm.BinaryMeasure;
import smm.BinaryMeasurement;
import smm.CategoryRelationship;
import smm.Characteristic;
import smm.CollectiveMeasure;
import smm.CollectiveMeasurement;
import smm.Count;
import smm.Counting;
import smm.DimensionalMeasure;
import smm.DimensionalMeasurement;
import smm.DirectMeasure;
import smm.DirectMeasurement;
import smm.EquivalentMeasureRelationship;
import smm.EquivalentMeasurementRelationship;
import smm.Grade;
import smm.Measure;
import smm.MeasureCategory;
import smm.MeasureLibrary;
import smm.MeasureRelationship;
import smm.Measurement;
import smm.MeasurementRelationship;
import smm.MofElement;
import smm.NamedMeasure;
import smm.NamedMeasurement;
import smm.Observation;
import smm.ObservationScope;
import smm.ObservedMeasure;
import smm.OclOperation;
import smm.Operation;
import smm.Ranking;
import smm.RankingInterval;
import smm.RankingMeasureRelationship;
import smm.RankingMeasurementRelationship;
import smm.RatioMeasure;
import smm.RatioMeasurement;
import smm.RecursiveMeasureRelationship;
import smm.RecursiveMeasurementRelationship;
import smm.RefinementMeasureRelationship;
import smm.RefinementMeasurementRelationship;
import smm.RescaleMeasureRelationship;
import smm.RescaleMeasurementRelationship;
import smm.RescaledMeasure;
import smm.RescaledMeasurement;
import smm.Scope;
import smm.SmmElement;
import smm.SmmFactory;
import smm.SmmModel;
import smm.SmmPackage;
import smm.SmmRelationship;

import vdml.VdmlPackage;

import vdml.impl.VdmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmPackageImpl extends EPackageImpl implements SmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMeasureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmElementEClass = null;

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
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base1MeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base2MeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaledMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base1MeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursiveMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base2MeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaleMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rescaledMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingMeasurementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursiveMeasureRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smmModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accumulatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

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
	 * @see smm.SmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmmPackageImpl() {
		super(eNS_URI, SmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmmPackage init() {
		if (isInited) return (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);

		// Obtain or create and register package
		SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VdmlPackageImpl theVdmlPackage = (VdmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) instanceof VdmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) : VdmlPackage.eINSTANCE);

		// Create package meta-data objects
		theSmmPackage.createPackageContents();
		theVdmlPackage.createPackageContents();

		// Initialize created meta-data
		theSmmPackage.initializePackageContents();
		theVdmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmmPackage.eNS_URI, theSmmPackage);
		return theSmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMeasureElement() {
		return abstractMeasureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmElement() {
		return smmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Attributes() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Annotations() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Name() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmmElement_ShortDescription() {
		return (EAttribute)smmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmElement_Description() {
		return (EReference)smmElementEClass.getEStructuralFeatures().get(4);
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
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Type() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Value() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase1MeasureRelationship() {
		return base1MeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasureRelationship_From() {
		return (EReference)base1MeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasureRelationship_To() {
		return (EReference)base1MeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureRelationship() {
		return measureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRelationship_MeasurandQuery() {
		return (EReference)measureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmRelationship() {
		return smmRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Language() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Body() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryMeasure() {
		return binaryMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasure_BaseMeasure2To() {
		return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasure_Functor() {
		return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasure_BaseMeasure1To() {
		return (EReference)binaryMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasure() {
		return dimensionalMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_Unit() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasureFrom() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasure1From() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_BaseMeasure2From() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_RescaleTo() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasure_RankingFrom() {
		return (EReference)dimensionalMeasureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Category() {
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Trait() {
		return (EReference)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Scope() {
		return (EReference)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_MeasureLabelFormat() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RefinementTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RefinementFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_EquivalentTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_EquivalentFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RecursiveTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RecursiveFrom() {
		return (EReference)measureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_MeasurementLabelFormat() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Visible() {
		return (EReference)measureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_MeasureRelationships() {
		return (EReference)measureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_DefaultQuery() {
		return (EReference)measureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Inbound() {
		return (EReference)measureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Outbound() {
		return (EReference)measureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureCategory() {
		return measureCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_Category() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_CategoryElement() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCategory_CategoryMeasure() {
		return (EReference)measureCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementMeasureRelationship() {
		return refinementMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasureRelationship_To() {
		return (EReference)refinementMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasureRelationship_From() {
		return (EReference)refinementMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentMeasureRelationship() {
		return equivalentMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_Mapping() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_To() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasureRelationship_From() {
		return (EReference)equivalentMeasureRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMeasureRelationship() {
		return baseMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasureRelationship_From() {
		return (EReference)baseMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasureRelationship_To() {
		return (EReference)baseMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectiveMeasure() {
		return collectiveMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasure_Accumulator() {
		return (EAttribute)collectiveMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveMeasure_BaseMeasureTo() {
		return (EReference)collectiveMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase2MeasureRelationship() {
		return base2MeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasureRelationship_From() {
		return (EReference)base2MeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasureRelationship_To() {
		return (EReference)base2MeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleMeasureRelationship() {
		return rescaleMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasureRelationship_To() {
		return (EReference)rescaleMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasureRelationship_From() {
		return (EReference)rescaleMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaledMeasure() {
		return rescaledMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaledMeasure_Formula() {
		return (EReference)rescaledMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaledMeasure_RescaleFrom() {
		return (EReference)rescaledMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingMeasureRelationship() {
		return rankingMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasureRelationship_From() {
		return (EReference)rankingMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasureRelationship_To() {
		return (EReference)rankingMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase1MeasurementRelationship() {
		return base1MeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasurementRelationship_From() {
		return (EReference)base1MeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase1MeasurementRelationship_To() {
		return (EReference)base1MeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementRelationship() {
		return measurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryMeasurement() {
		return binaryMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasurement_BaseMeasurement2To() {
		return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryMeasurement_IsBaseSupplied() {
		return (EAttribute)binaryMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryMeasurement_BaseMeasurement1To() {
		return (EReference)binaryMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasurement() {
		return dimensionalMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_Value() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurementFrom() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurement1From() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_BaseMeasurement2From() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_RescaleTo() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionalMeasurement_RankingFrom() {
		return (EReference)dimensionalMeasurementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Error() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Measurand() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_BreakValue() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RefinementTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RefinementFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_EquivalentTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_EquivalentFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RecursiveTo() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RecursiveFrom() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MeasurementRelationships() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Inbound() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Outbound() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementMeasurementRelationship() {
		return refinementMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasurementRelationship_To() {
		return (EReference)refinementMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementMeasurementRelationship_From() {
		return (EReference)refinementMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentMeasurementRelationship() {
		return equivalentMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasurementRelationship_To() {
		return (EReference)equivalentMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentMeasurementRelationship_From() {
		return (EReference)equivalentMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecursiveMeasurementRelationship() {
		return recursiveMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasurementRelationship_To() {
		return (EReference)recursiveMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasurementRelationship_From() {
		return (EReference)recursiveMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMeasurementRelationship() {
		return baseMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasurementRelationship_From() {
		return (EReference)baseMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMeasurementRelationship_To() {
		return (EReference)baseMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectiveMeasurement() {
		return collectiveMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasurement_Accumulator() {
		return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectiveMeasurement_IsBaseSupplied() {
		return (EAttribute)collectiveMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveMeasurement_BaseMeasurementTo() {
		return (EReference)collectiveMeasurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase2MeasurementRelationship() {
		return base2MeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasurementRelationship_From() {
		return (EReference)base2MeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBase2MeasurementRelationship_To() {
		return (EReference)base2MeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaleMeasurementRelationship() {
		return rescaleMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasurementRelationship_To() {
		return (EReference)rescaleMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaleMeasurementRelationship_From() {
		return (EReference)rescaleMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRescaledMeasurement() {
		return rescaledMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRescaledMeasurement_IsBaseSupplied() {
		return (EAttribute)rescaledMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRescaledMeasurement_RescaleFrom() {
		return (EReference)rescaledMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingMeasurementRelationship() {
		return rankingMeasurementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasurementRelationship_From() {
		return (EReference)rankingMeasurementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingMeasurementRelationship_To() {
		return (EReference)rankingMeasurementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryRelationship() {
		return categoryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryRelationship_From() {
		return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryRelationship_To() {
		return (EReference)categoryRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Parent() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectMeasurement() {
		return directMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounting() {
		return countingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectMeasure() {
		return directMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectMeasure_Operation() {
		return (EReference)directMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrade_IsBaseSupplied() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrade_Value() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrade_RankingTo() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureLibrary() {
		return measureLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureLibrary_MeasureElements() {
		return (EReference)measureLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureLibrary_CategoryRelationships() {
		return (EReference)measureLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofElement() {
		return mofElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMeasure() {
		return namedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedMeasurement() {
		return namedMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclOperation() {
		return oclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclOperation_Context() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclOperation_Body() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Observer() {
		return (EReference)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Tool() {
		return (EReference)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_WhenObserved() {
		return (EReference)observationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Scopes() {
		return (EReference)observationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ObservedMeasures() {
		return (EReference)observationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_RequestedMeasures() {
		return (EReference)observationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_MeasurementRelations() {
		return (EReference)observationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Arguments() {
		return (EReference)observationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationScope() {
		return observationScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationScope_ScopeUri() {
		return (EReference)observationScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservedMeasure() {
		return observedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservedMeasure_Measure() {
		return (EReference)observedMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservedMeasure_Measurements() {
		return (EReference)observedMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRanking() {
		return rankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRanking_Interval() {
		return (EReference)rankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRanking_RankingTo() {
		return (EReference)rankingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRankingInterval() {
		return rankingIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MaximumEndpoint() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingInterval_MaximumOpen() {
		return (EReference)rankingIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRankingInterval_MinimumEndpoint() {
		return (EAttribute)rankingIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingInterval_MinimumOpen() {
		return (EReference)rankingIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRankingInterval_Symbol() {
		return (EReference)rankingIntervalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioMeasure() {
		return ratioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioMeasurement() {
		return ratioMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecursiveMeasureRelationship() {
		return recursiveMeasureRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasureRelationship_From() {
		return (EReference)recursiveMeasureRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveMeasureRelationship_To() {
		return (EReference)recursiveMeasureRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_Class() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_Recognizer() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_BreakCondition() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmmModel() {
		return smmModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmModel_Observations() {
		return (EReference)smmModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmmModel_Librairies() {
		return (EReference)smmModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccumulator() {
		return accumulatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmFactory getSmmFactory() {
		return (SmmFactory)getEFactoryInstance();
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
		abstractMeasureElementEClass = createEClass(ABSTRACT_MEASURE_ELEMENT);

		smmElementEClass = createEClass(SMM_ELEMENT);
		createEReference(smmElementEClass, SMM_ELEMENT__ATTRIBUTES);
		createEReference(smmElementEClass, SMM_ELEMENT__ANNOTATIONS);
		createEReference(smmElementEClass, SMM_ELEMENT__NAME);
		createEAttribute(smmElementEClass, SMM_ELEMENT__SHORT_DESCRIPTION);
		createEReference(smmElementEClass, SMM_ELEMENT__DESCRIPTION);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TAG);
		createEReference(attributeEClass, ATTRIBUTE__VALUE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__TEXT);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__TYPE);
		createEReference(argumentEClass, ARGUMENT__VALUE);

		base1MeasureRelationshipEClass = createEClass(BASE1_MEASURE_RELATIONSHIP);
		createEReference(base1MeasureRelationshipEClass, BASE1_MEASURE_RELATIONSHIP__FROM);
		createEReference(base1MeasureRelationshipEClass, BASE1_MEASURE_RELATIONSHIP__TO);

		measureRelationshipEClass = createEClass(MEASURE_RELATIONSHIP);
		createEReference(measureRelationshipEClass, MEASURE_RELATIONSHIP__MEASURAND_QUERY);

		smmRelationshipEClass = createEClass(SMM_RELATIONSHIP);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__LANGUAGE);
		createEReference(operationEClass, OPERATION__BODY);

		binaryMeasureEClass = createEClass(BINARY_MEASURE);
		createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE2_TO);
		createEReference(binaryMeasureEClass, BINARY_MEASURE__FUNCTOR);
		createEReference(binaryMeasureEClass, BINARY_MEASURE__BASE_MEASURE1_TO);

		dimensionalMeasureEClass = createEClass(DIMENSIONAL_MEASURE);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__UNIT);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__RESCALE_TO);
		createEReference(dimensionalMeasureEClass, DIMENSIONAL_MEASURE__RANKING_FROM);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__CATEGORY);
		createEReference(measureEClass, MEASURE__TRAIT);
		createEReference(measureEClass, MEASURE__SCOPE);
		createEAttribute(measureEClass, MEASURE__MEASURE_LABEL_FORMAT);
		createEReference(measureEClass, MEASURE__REFINEMENT_TO);
		createEReference(measureEClass, MEASURE__REFINEMENT_FROM);
		createEReference(measureEClass, MEASURE__EQUIVALENT_TO);
		createEReference(measureEClass, MEASURE__EQUIVALENT_FROM);
		createEReference(measureEClass, MEASURE__RECURSIVE_TO);
		createEReference(measureEClass, MEASURE__RECURSIVE_FROM);
		createEAttribute(measureEClass, MEASURE__MEASUREMENT_LABEL_FORMAT);
		createEReference(measureEClass, MEASURE__VISIBLE);
		createEReference(measureEClass, MEASURE__MEASURE_RELATIONSHIPS);
		createEReference(measureEClass, MEASURE__DEFAULT_QUERY);
		createEReference(measureEClass, MEASURE__INBOUND);
		createEReference(measureEClass, MEASURE__OUTBOUND);

		measureCategoryEClass = createEClass(MEASURE_CATEGORY);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY_ELEMENT);
		createEReference(measureCategoryEClass, MEASURE_CATEGORY__CATEGORY_MEASURE);

		refinementMeasureRelationshipEClass = createEClass(REFINEMENT_MEASURE_RELATIONSHIP);
		createEReference(refinementMeasureRelationshipEClass, REFINEMENT_MEASURE_RELATIONSHIP__TO);
		createEReference(refinementMeasureRelationshipEClass, REFINEMENT_MEASURE_RELATIONSHIP__FROM);

		equivalentMeasureRelationshipEClass = createEClass(EQUIVALENT_MEASURE_RELATIONSHIP);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__TO);
		createEReference(equivalentMeasureRelationshipEClass, EQUIVALENT_MEASURE_RELATIONSHIP__FROM);

		baseMeasureRelationshipEClass = createEClass(BASE_MEASURE_RELATIONSHIP);
		createEReference(baseMeasureRelationshipEClass, BASE_MEASURE_RELATIONSHIP__FROM);
		createEReference(baseMeasureRelationshipEClass, BASE_MEASURE_RELATIONSHIP__TO);

		collectiveMeasureEClass = createEClass(COLLECTIVE_MEASURE);
		createEAttribute(collectiveMeasureEClass, COLLECTIVE_MEASURE__ACCUMULATOR);
		createEReference(collectiveMeasureEClass, COLLECTIVE_MEASURE__BASE_MEASURE_TO);

		base2MeasureRelationshipEClass = createEClass(BASE2_MEASURE_RELATIONSHIP);
		createEReference(base2MeasureRelationshipEClass, BASE2_MEASURE_RELATIONSHIP__FROM);
		createEReference(base2MeasureRelationshipEClass, BASE2_MEASURE_RELATIONSHIP__TO);

		rescaleMeasureRelationshipEClass = createEClass(RESCALE_MEASURE_RELATIONSHIP);
		createEReference(rescaleMeasureRelationshipEClass, RESCALE_MEASURE_RELATIONSHIP__TO);
		createEReference(rescaleMeasureRelationshipEClass, RESCALE_MEASURE_RELATIONSHIP__FROM);

		rescaledMeasureEClass = createEClass(RESCALED_MEASURE);
		createEReference(rescaledMeasureEClass, RESCALED_MEASURE__FORMULA);
		createEReference(rescaledMeasureEClass, RESCALED_MEASURE__RESCALE_FROM);

		rankingMeasureRelationshipEClass = createEClass(RANKING_MEASURE_RELATIONSHIP);
		createEReference(rankingMeasureRelationshipEClass, RANKING_MEASURE_RELATIONSHIP__FROM);
		createEReference(rankingMeasureRelationshipEClass, RANKING_MEASURE_RELATIONSHIP__TO);

		base1MeasurementRelationshipEClass = createEClass(BASE1_MEASUREMENT_RELATIONSHIP);
		createEReference(base1MeasurementRelationshipEClass, BASE1_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(base1MeasurementRelationshipEClass, BASE1_MEASUREMENT_RELATIONSHIP__TO);

		measurementRelationshipEClass = createEClass(MEASUREMENT_RELATIONSHIP);

		binaryMeasurementEClass = createEClass(BINARY_MEASUREMENT);
		createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO);
		createEAttribute(binaryMeasurementEClass, BINARY_MEASUREMENT__IS_BASE_SUPPLIED);
		createEReference(binaryMeasurementEClass, BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO);

		dimensionalMeasurementEClass = createEClass(DIMENSIONAL_MEASUREMENT);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__VALUE);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__RESCALE_TO);
		createEReference(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__RANKING_FROM);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__ERROR);
		createEReference(measurementEClass, MEASUREMENT__MEASURAND);
		createEReference(measurementEClass, MEASUREMENT__BREAK_VALUE);
		createEReference(measurementEClass, MEASUREMENT__REFINEMENT_TO);
		createEReference(measurementEClass, MEASUREMENT__REFINEMENT_FROM);
		createEReference(measurementEClass, MEASUREMENT__EQUIVALENT_TO);
		createEReference(measurementEClass, MEASUREMENT__EQUIVALENT_FROM);
		createEReference(measurementEClass, MEASUREMENT__RECURSIVE_TO);
		createEReference(measurementEClass, MEASUREMENT__RECURSIVE_FROM);
		createEReference(measurementEClass, MEASUREMENT__MEASUREMENT_RELATIONSHIPS);
		createEReference(measurementEClass, MEASUREMENT__INBOUND);
		createEReference(measurementEClass, MEASUREMENT__OUTBOUND);

		refinementMeasurementRelationshipEClass = createEClass(REFINEMENT_MEASUREMENT_RELATIONSHIP);
		createEReference(refinementMeasurementRelationshipEClass, REFINEMENT_MEASUREMENT_RELATIONSHIP__TO);
		createEReference(refinementMeasurementRelationshipEClass, REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM);

		equivalentMeasurementRelationshipEClass = createEClass(EQUIVALENT_MEASUREMENT_RELATIONSHIP);
		createEReference(equivalentMeasurementRelationshipEClass, EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO);
		createEReference(equivalentMeasurementRelationshipEClass, EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM);

		recursiveMeasurementRelationshipEClass = createEClass(RECURSIVE_MEASUREMENT_RELATIONSHIP);
		createEReference(recursiveMeasurementRelationshipEClass, RECURSIVE_MEASUREMENT_RELATIONSHIP__TO);
		createEReference(recursiveMeasurementRelationshipEClass, RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM);

		baseMeasurementRelationshipEClass = createEClass(BASE_MEASUREMENT_RELATIONSHIP);
		createEReference(baseMeasurementRelationshipEClass, BASE_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(baseMeasurementRelationshipEClass, BASE_MEASUREMENT_RELATIONSHIP__TO);

		collectiveMeasurementEClass = createEClass(COLLECTIVE_MEASUREMENT);
		createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__ACCUMULATOR);
		createEAttribute(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED);
		createEReference(collectiveMeasurementEClass, COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO);

		base2MeasurementRelationshipEClass = createEClass(BASE2_MEASUREMENT_RELATIONSHIP);
		createEReference(base2MeasurementRelationshipEClass, BASE2_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(base2MeasurementRelationshipEClass, BASE2_MEASUREMENT_RELATIONSHIP__TO);

		rescaleMeasurementRelationshipEClass = createEClass(RESCALE_MEASUREMENT_RELATIONSHIP);
		createEReference(rescaleMeasurementRelationshipEClass, RESCALE_MEASUREMENT_RELATIONSHIP__TO);
		createEReference(rescaleMeasurementRelationshipEClass, RESCALE_MEASUREMENT_RELATIONSHIP__FROM);

		rescaledMeasurementEClass = createEClass(RESCALED_MEASUREMENT);
		createEAttribute(rescaledMeasurementEClass, RESCALED_MEASUREMENT__IS_BASE_SUPPLIED);
		createEReference(rescaledMeasurementEClass, RESCALED_MEASUREMENT__RESCALE_FROM);

		rankingMeasurementRelationshipEClass = createEClass(RANKING_MEASUREMENT_RELATIONSHIP);
		createEReference(rankingMeasurementRelationshipEClass, RANKING_MEASUREMENT_RELATIONSHIP__FROM);
		createEReference(rankingMeasurementRelationshipEClass, RANKING_MEASUREMENT_RELATIONSHIP__TO);

		categoryRelationshipEClass = createEClass(CATEGORY_RELATIONSHIP);
		createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__FROM);
		createEReference(categoryRelationshipEClass, CATEGORY_RELATIONSHIP__TO);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEReference(characteristicEClass, CHARACTERISTIC__PARENT);

		countEClass = createEClass(COUNT);

		directMeasurementEClass = createEClass(DIRECT_MEASUREMENT);

		countingEClass = createEClass(COUNTING);

		directMeasureEClass = createEClass(DIRECT_MEASURE);
		createEReference(directMeasureEClass, DIRECT_MEASURE__OPERATION);

		gradeEClass = createEClass(GRADE);
		createEReference(gradeEClass, GRADE__IS_BASE_SUPPLIED);
		createEReference(gradeEClass, GRADE__VALUE);
		createEReference(gradeEClass, GRADE__RANKING_TO);

		measureLibraryEClass = createEClass(MEASURE_LIBRARY);
		createEReference(measureLibraryEClass, MEASURE_LIBRARY__MEASURE_ELEMENTS);
		createEReference(measureLibraryEClass, MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS);

		mofElementEClass = createEClass(MOF_ELEMENT);

		namedMeasureEClass = createEClass(NAMED_MEASURE);

		namedMeasurementEClass = createEClass(NAMED_MEASUREMENT);

		oclOperationEClass = createEClass(OCL_OPERATION);
		createEReference(oclOperationEClass, OCL_OPERATION__CONTEXT);
		createEReference(oclOperationEClass, OCL_OPERATION__BODY);

		observationEClass = createEClass(OBSERVATION);
		createEReference(observationEClass, OBSERVATION__OBSERVER);
		createEReference(observationEClass, OBSERVATION__TOOL);
		createEReference(observationEClass, OBSERVATION__WHEN_OBSERVED);
		createEReference(observationEClass, OBSERVATION__SCOPES);
		createEReference(observationEClass, OBSERVATION__OBSERVED_MEASURES);
		createEReference(observationEClass, OBSERVATION__REQUESTED_MEASURES);
		createEReference(observationEClass, OBSERVATION__MEASUREMENT_RELATIONS);
		createEReference(observationEClass, OBSERVATION__ARGUMENTS);

		observationScopeEClass = createEClass(OBSERVATION_SCOPE);
		createEReference(observationScopeEClass, OBSERVATION_SCOPE__SCOPE_URI);

		observedMeasureEClass = createEClass(OBSERVED_MEASURE);
		createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASURE);
		createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASUREMENTS);

		rankingEClass = createEClass(RANKING);
		createEReference(rankingEClass, RANKING__INTERVAL);
		createEReference(rankingEClass, RANKING__RANKING_TO);

		rankingIntervalEClass = createEClass(RANKING_INTERVAL);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_ENDPOINT);
		createEReference(rankingIntervalEClass, RANKING_INTERVAL__MAXIMUM_OPEN);
		createEAttribute(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_ENDPOINT);
		createEReference(rankingIntervalEClass, RANKING_INTERVAL__MINIMUM_OPEN);
		createEReference(rankingIntervalEClass, RANKING_INTERVAL__SYMBOL);

		ratioMeasureEClass = createEClass(RATIO_MEASURE);

		ratioMeasurementEClass = createEClass(RATIO_MEASUREMENT);

		recursiveMeasureRelationshipEClass = createEClass(RECURSIVE_MEASURE_RELATIONSHIP);
		createEReference(recursiveMeasureRelationshipEClass, RECURSIVE_MEASURE_RELATIONSHIP__FROM);
		createEReference(recursiveMeasureRelationshipEClass, RECURSIVE_MEASURE_RELATIONSHIP__TO);

		scopeEClass = createEClass(SCOPE);
		createEReference(scopeEClass, SCOPE__CLASS);
		createEReference(scopeEClass, SCOPE__RECOGNIZER);
		createEReference(scopeEClass, SCOPE__BREAK_CONDITION);

		smmModelEClass = createEClass(SMM_MODEL);
		createEReference(smmModelEClass, SMM_MODEL__OBSERVATIONS);
		createEReference(smmModelEClass, SMM_MODEL__LIBRAIRIES);

		// Create enums
		accumulatorEEnum = createEEnum(ACCUMULATOR);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		dateEDataType = createEDataType(DATE);
		doubleEDataType = createEDataType(DOUBLE);
		timestampEDataType = createEDataType(TIMESTAMP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractMeasureElementEClass.getESuperTypes().add(this.getSmmElement());
		attributeEClass.getESuperTypes().add(this.getSmmElement());
		annotationEClass.getESuperTypes().add(this.getSmmElement());
		argumentEClass.getESuperTypes().add(this.getSmmElement());
		base1MeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		measureRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		smmRelationshipEClass.getESuperTypes().add(this.getSmmElement());
		operationEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		binaryMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		dimensionalMeasureEClass.getESuperTypes().add(this.getMeasure());
		measureEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		measureCategoryEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		refinementMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		equivalentMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		baseMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		collectiveMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		base2MeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		rescaleMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		rescaledMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		rankingMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		base1MeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		measurementRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		binaryMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		dimensionalMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		measurementEClass.getESuperTypes().add(this.getSmmElement());
		refinementMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		equivalentMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		recursiveMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		baseMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		collectiveMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		base2MeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		rescaleMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		rescaledMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		rankingMeasurementRelationshipEClass.getESuperTypes().add(this.getMeasurementRelationship());
		categoryRelationshipEClass.getESuperTypes().add(this.getSmmRelationship());
		characteristicEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		countEClass.getESuperTypes().add(this.getDirectMeasurement());
		directMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		countingEClass.getESuperTypes().add(this.getDirectMeasure());
		directMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		gradeEClass.getESuperTypes().add(this.getMeasurement());
		measureLibraryEClass.getESuperTypes().add(this.getSmmElement());
		namedMeasureEClass.getESuperTypes().add(this.getDimensionalMeasure());
		namedMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		oclOperationEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		observationEClass.getESuperTypes().add(this.getSmmElement());
		observationScopeEClass.getESuperTypes().add(this.getSmmElement());
		observedMeasureEClass.getESuperTypes().add(this.getSmmRelationship());
		rankingEClass.getESuperTypes().add(this.getMeasure());
		rankingIntervalEClass.getESuperTypes().add(this.getSmmElement());
		ratioMeasureEClass.getESuperTypes().add(this.getBinaryMeasure());
		ratioMeasurementEClass.getESuperTypes().add(this.getBinaryMeasurement());
		recursiveMeasureRelationshipEClass.getESuperTypes().add(this.getMeasureRelationship());
		scopeEClass.getESuperTypes().add(this.getAbstractMeasureElement());
		smmModelEClass.getESuperTypes().add(this.getSmmElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractMeasureElementEClass, AbstractMeasureElement.class, "AbstractMeasureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smmElementEClass, SmmElement.class, "SmmElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmmElement_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmElement_Annotations(), this.getAnnotation(), null, "annotations", null, 1, -1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmElement_Name(), ecorePackage.getEObject(), null, "name", null, 1, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmmElement_ShortDescription(), this.getString(), "shortDescription", null, 1, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmElement_Description(), ecorePackage.getEObject(), null, "description", null, 1, 1, SmmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Tag(), ecorePackage.getEObject(), null, "tag", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Text(), ecorePackage.getEObject(), null, "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Type(), ecorePackage.getEObject(), null, "type", null, 1, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base1MeasureRelationshipEClass, Base1MeasureRelationship.class, "Base1MeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase1MeasureRelationship_From(), ecorePackage.getEObject(), this.getBinaryMeasure_BaseMeasure1To(), "from", null, 1, 1, Base1MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase1MeasureRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasure_BaseMeasure1From(), "to", null, 1, 1, Base1MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureRelationshipEClass, MeasureRelationship.class, "MeasureRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureRelationship_MeasurandQuery(), this.getOperation(), null, "measurandQuery", null, 1, 1, MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smmRelationshipEClass, SmmRelationship.class, "SmmRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Language(), ecorePackage.getEObject(), null, "language", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Body(), ecorePackage.getEObject(), null, "body", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryMeasureEClass, BinaryMeasure.class, "BinaryMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryMeasure_BaseMeasure2To(), this.getBase2MeasureRelationship(), this.getBase2MeasureRelationship_From(), "baseMeasure2To", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasure_Functor(), ecorePackage.getEObject(), null, "functor", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasure_BaseMeasure1To(), this.getBase1MeasureRelationship(), this.getBase1MeasureRelationship_From(), "baseMeasure1To", null, 1, 1, BinaryMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalMeasureEClass, DimensionalMeasure.class, "DimensionalMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionalMeasure_Unit(), ecorePackage.getEObject(), null, "unit", null, 1, 1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasureFrom(), this.getBaseMeasureRelationship(), this.getBaseMeasureRelationship_To(), "baseMeasureFrom", null, 1, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasure1From(), this.getBase1MeasureRelationship(), this.getBase1MeasureRelationship_To(), "baseMeasure1From", null, 1, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_BaseMeasure2From(), this.getBase2MeasureRelationship(), this.getBase2MeasureRelationship_To(), "baseMeasure2From", null, 1, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_RescaleTo(), this.getRescaleMeasureRelationship(), this.getRescaleMeasureRelationship_From(), "rescaleTo", null, 1, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasure_RankingFrom(), this.getRankingMeasureRelationship(), this.getRankingMeasureRelationship_To(), "rankingFrom", null, 1, -1, DimensionalMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_Category(), this.getMeasureCategory(), this.getMeasureCategory_CategoryMeasure(), "category", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Trait(), ecorePackage.getEObject(), null, "trait", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Scope(), ecorePackage.getEObject(), null, "scope", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_MeasureLabelFormat(), this.getString(), "measureLabelFormat", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RefinementTo(), this.getRefinementMeasureRelationship(), this.getRefinementMeasureRelationship_From(), "refinementTo", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RefinementFrom(), this.getRefinementMeasureRelationship(), this.getRefinementMeasureRelationship_To(), "refinementFrom", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_EquivalentTo(), this.getEquivalentMeasureRelationship(), this.getEquivalentMeasureRelationship_From(), "equivalentTo", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_EquivalentFrom(), this.getEquivalentMeasureRelationship(), this.getEquivalentMeasureRelationship_To(), "equivalentFrom", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RecursiveTo(), ecorePackage.getEObject(), null, "recursiveTo", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_RecursiveFrom(), ecorePackage.getEObject(), null, "recursiveFrom", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_MeasurementLabelFormat(), this.getString(), "measurementLabelFormat", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Visible(), ecorePackage.getEObject(), null, "visible", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_MeasureRelationships(), this.getMeasureRelationship(), null, "measureRelationships", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_DefaultQuery(), ecorePackage.getEObject(), null, "defaultQuery", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Inbound(), this.getMeasureRelationship(), null, "inbound", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Outbound(), this.getMeasureRelationship(), null, "outbound", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureCategoryEClass, MeasureCategory.class, "MeasureCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureCategory_Category(), this.getMeasureCategory(), this.getMeasureCategory_CategoryElement(), "category", null, 1, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureCategory_CategoryElement(), this.getMeasureCategory(), this.getMeasureCategory_Category(), "categoryElement", null, 1, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureCategory_CategoryMeasure(), this.getMeasure(), this.getMeasure_Category(), "categoryMeasure", null, 1, -1, MeasureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementMeasureRelationshipEClass, RefinementMeasureRelationship.class, "RefinementMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinementMeasureRelationship_To(), ecorePackage.getEObject(), this.getMeasure_RefinementFrom(), "to", null, 1, 1, RefinementMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementMeasureRelationship_From(), ecorePackage.getEObject(), this.getMeasure_RefinementTo(), "from", null, 1, 1, RefinementMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentMeasureRelationshipEClass, EquivalentMeasureRelationship.class, "EquivalentMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentMeasureRelationship_Mapping(), this.getOperation(), null, "mapping", null, 1, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasureRelationship_To(), ecorePackage.getEObject(), this.getMeasure_EquivalentFrom(), "to", null, 1, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasureRelationship_From(), ecorePackage.getEObject(), this.getMeasure_EquivalentTo(), "from", null, 1, 1, EquivalentMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseMeasureRelationshipEClass, BaseMeasureRelationship.class, "BaseMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseMeasureRelationship_From(), ecorePackage.getEObject(), this.getCollectiveMeasure_BaseMeasureTo(), "from", null, 1, 1, BaseMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseMeasureRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasure_BaseMeasureFrom(), "to", null, 1, 1, BaseMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectiveMeasureEClass, CollectiveMeasure.class, "CollectiveMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectiveMeasure_Accumulator(), this.getAccumulator(), "accumulator", null, 1, 1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveMeasure_BaseMeasureTo(), this.getBaseMeasureRelationship(), this.getBaseMeasureRelationship_From(), "baseMeasureTo", null, 1, -1, CollectiveMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base2MeasureRelationshipEClass, Base2MeasureRelationship.class, "Base2MeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase2MeasureRelationship_From(), ecorePackage.getEObject(), this.getBinaryMeasure_BaseMeasure2To(), "from", null, 1, 1, Base2MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase2MeasureRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasure_BaseMeasure2From(), "to", null, 1, 1, Base2MeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaleMeasureRelationshipEClass, RescaleMeasureRelationship.class, "RescaleMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescaleMeasureRelationship_To(), ecorePackage.getEObject(), this.getRescaledMeasure_RescaleFrom(), "to", null, 1, 1, RescaleMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaleMeasureRelationship_From(), ecorePackage.getEObject(), this.getDimensionalMeasure_RescaleTo(), "from", null, 1, 1, RescaleMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaledMeasureEClass, RescaledMeasure.class, "RescaledMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescaledMeasure_Formula(), ecorePackage.getEObject(), null, "formula", null, 1, 1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaledMeasure_RescaleFrom(), this.getRescaleMeasureRelationship(), this.getRescaleMeasureRelationship_To(), "rescaleFrom", null, 1, -1, RescaledMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingMeasureRelationshipEClass, RankingMeasureRelationship.class, "RankingMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRankingMeasureRelationship_From(), ecorePackage.getEObject(), null, "from", null, 1, 1, RankingMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingMeasureRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasure_RankingFrom(), "to", null, 1, 1, RankingMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base1MeasurementRelationshipEClass, Base1MeasurementRelationship.class, "Base1MeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase1MeasurementRelationship_From(), ecorePackage.getEObject(), this.getBinaryMeasurement_BaseMeasurement1To(), "from", null, 1, 1, Base1MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase1MeasurementRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasurement_BaseMeasurement1From(), "to", null, 1, 1, Base1MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementRelationshipEClass, MeasurementRelationship.class, "MeasurementRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryMeasurementEClass, BinaryMeasurement.class, "BinaryMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryMeasurement_BaseMeasurement2To(), this.getBase2MeasurementRelationship(), this.getBase2MeasurementRelationship_From(), "baseMeasurement2To", null, 1, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryMeasurement_IsBaseSupplied(), this.getBoolean(), "isBaseSupplied", null, 1, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryMeasurement_BaseMeasurement1To(), this.getBase1MeasurementRelationship(), this.getBase1MeasurementRelationship_From(), "baseMeasurement1To", null, 1, 1, BinaryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalMeasurementEClass, DimensionalMeasurement.class, "DimensionalMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionalMeasurement_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurementFrom(), this.getBaseMeasurementRelationship(), this.getBaseMeasurementRelationship_To(), "baseMeasurementFrom", null, 1, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurement1From(), this.getBase1MeasurementRelationship(), this.getBase1MeasurementRelationship_To(), "baseMeasurement1From", null, 1, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_BaseMeasurement2From(), this.getBase2MeasurementRelationship(), this.getBase2MeasurementRelationship_To(), "baseMeasurement2From", null, 1, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_RescaleTo(), this.getRescaleMeasurementRelationship(), this.getRescaleMeasurementRelationship_From(), "rescaleTo", null, 1, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimensionalMeasurement_RankingFrom(), this.getRankingMeasurementRelationship(), this.getRankingMeasurementRelationship_To(), "rankingFrom", null, 1, -1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_Error(), ecorePackage.getEObject(), null, "error", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Measurand(), ecorePackage.getEObject(), null, "measurand", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_BreakValue(), ecorePackage.getEObject(), null, "breakValue", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RefinementTo(), this.getRefinementMeasurementRelationship(), this.getRefinementMeasurementRelationship_From(), "refinementTo", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RefinementFrom(), this.getRefinementMeasurementRelationship(), this.getRefinementMeasurementRelationship_To(), "refinementFrom", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_EquivalentTo(), this.getEquivalentMeasurementRelationship(), this.getEquivalentMeasurementRelationship_From(), "equivalentTo", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_EquivalentFrom(), this.getEquivalentMeasurementRelationship(), this.getEquivalentMeasurementRelationship_To(), "equivalentFrom", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RecursiveTo(), ecorePackage.getEObject(), this.getRecursiveMeasurementRelationship_From(), "recursiveTo", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RecursiveFrom(), ecorePackage.getEObject(), null, "recursiveFrom", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MeasurementRelationships(), this.getMeasurementRelationship(), null, "measurementRelationships", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Inbound(), this.getMeasurementRelationship(), null, "inbound", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Outbound(), this.getMeasurementRelationship(), null, "outbound", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementMeasurementRelationshipEClass, RefinementMeasurementRelationship.class, "RefinementMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinementMeasurementRelationship_To(), ecorePackage.getEObject(), this.getMeasurement_RefinementFrom(), "to", null, 1, 1, RefinementMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_RefinementTo(), "from", null, 1, 1, RefinementMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentMeasurementRelationshipEClass, EquivalentMeasurementRelationship.class, "EquivalentMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentMeasurementRelationship_To(), ecorePackage.getEObject(), this.getMeasurement_EquivalentFrom(), "to", null, 1, 1, EquivalentMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_EquivalentTo(), "from", null, 1, 1, EquivalentMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursiveMeasurementRelationshipEClass, RecursiveMeasurementRelationship.class, "RecursiveMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecursiveMeasurementRelationship_To(), ecorePackage.getEObject(), null, "to", null, 1, 1, RecursiveMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecursiveMeasurementRelationship_From(), this.getMeasurement(), this.getMeasurement_RecursiveTo(), "from", null, 1, 1, RecursiveMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseMeasurementRelationshipEClass, BaseMeasurementRelationship.class, "BaseMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseMeasurementRelationship_From(), ecorePackage.getEObject(), this.getCollectiveMeasurement_BaseMeasurementTo(), "from", null, 1, 1, BaseMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseMeasurementRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasurement_BaseMeasurementFrom(), "to", null, 1, 1, BaseMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectiveMeasurementEClass, CollectiveMeasurement.class, "CollectiveMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectiveMeasurement_Accumulator(), this.getAccumulator(), "accumulator", null, 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectiveMeasurement_IsBaseSupplied(), this.getBoolean(), "isBaseSupplied", null, 1, 1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveMeasurement_BaseMeasurementTo(), this.getBaseMeasurementRelationship(), this.getBaseMeasurementRelationship_From(), "baseMeasurementTo", null, 1, -1, CollectiveMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base2MeasurementRelationshipEClass, Base2MeasurementRelationship.class, "Base2MeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase2MeasurementRelationship_From(), ecorePackage.getEObject(), this.getBinaryMeasurement_BaseMeasurement2To(), "from", null, 1, 1, Base2MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase2MeasurementRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasurement_BaseMeasurement2From(), "to", null, 1, 1, Base2MeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaleMeasurementRelationshipEClass, RescaleMeasurementRelationship.class, "RescaleMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRescaleMeasurementRelationship_To(), ecorePackage.getEObject(), this.getRescaledMeasurement_RescaleFrom(), "to", null, 1, 1, RescaleMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaleMeasurementRelationship_From(), ecorePackage.getEObject(), this.getDimensionalMeasurement_RescaleTo(), "from", null, 1, 1, RescaleMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rescaledMeasurementEClass, RescaledMeasurement.class, "RescaledMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRescaledMeasurement_IsBaseSupplied(), this.getBoolean(), "isBaseSupplied", null, 1, 1, RescaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRescaledMeasurement_RescaleFrom(), this.getRescaleMeasurementRelationship(), this.getRescaleMeasurementRelationship_To(), "rescaleFrom", null, 1, -1, RescaledMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingMeasurementRelationshipEClass, RankingMeasurementRelationship.class, "RankingMeasurementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRankingMeasurementRelationship_From(), ecorePackage.getEObject(), null, "from", null, 1, 1, RankingMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingMeasurementRelationship_To(), ecorePackage.getEObject(), this.getDimensionalMeasurement_RankingFrom(), "to", null, 1, 1, RankingMeasurementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryRelationshipEClass, CategoryRelationship.class, "CategoryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryRelationship_From(), ecorePackage.getEObject(), null, "from", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoryRelationship_To(), ecorePackage.getEObject(), null, "to", null, 1, 1, CategoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristic_Parent(), ecorePackage.getEObject(), null, "parent", null, 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directMeasurementEClass, DirectMeasurement.class, "DirectMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countingEClass, Counting.class, "Counting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directMeasureEClass, DirectMeasure.class, "DirectMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectMeasure_Operation(), ecorePackage.getEObject(), null, "operation", null, 1, 1, DirectMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrade_IsBaseSupplied(), ecorePackage.getEObject(), null, "isBaseSupplied", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrade_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrade_RankingTo(), ecorePackage.getEObject(), null, "rankingTo", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureLibraryEClass, MeasureLibrary.class, "MeasureLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureLibrary_MeasureElements(), this.getAbstractMeasureElement(), null, "measureElements", null, 1, -1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureLibrary_CategoryRelationships(), this.getCategoryRelationship(), null, "categoryRelationships", null, 1, -1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofElementEClass, MofElement.class, "MofElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedMeasureEClass, NamedMeasure.class, "NamedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedMeasurementEClass, NamedMeasurement.class, "NamedMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclOperationEClass, OclOperation.class, "OclOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclOperation_Context(), ecorePackage.getEObject(), null, "context", null, 1, 1, OclOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclOperation_Body(), ecorePackage.getEObject(), null, "body", null, 1, 1, OclOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservation_Observer(), ecorePackage.getEObject(), null, "observer", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Tool(), ecorePackage.getEObject(), null, "tool", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_WhenObserved(), ecorePackage.getEObject(), null, "whenObserved", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Scopes(), this.getObservationScope(), null, "scopes", null, 1, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_ObservedMeasures(), this.getObservedMeasure(), null, "observedMeasures", null, 1, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_RequestedMeasures(), this.getSmmElement(), null, "requestedMeasures", null, 1, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_MeasurementRelations(), this.getSmmRelationship(), null, "measurementRelations", null, 1, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Arguments(), this.getArgument(), null, "arguments", null, 1, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationScopeEClass, ObservationScope.class, "ObservationScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservationScope_ScopeUri(), ecorePackage.getEObject(), null, "scopeUri", null, 1, 1, ObservationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observedMeasureEClass, ObservedMeasure.class, "ObservedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservedMeasure_Measure(), ecorePackage.getEObject(), null, "measure", null, 1, 1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservedMeasure_Measurements(), this.getMeasurement(), null, "measurements", null, 1, -1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingEClass, Ranking.class, "Ranking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRanking_Interval(), this.getRankingInterval(), null, "interval", null, 1, -1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRanking_RankingTo(), ecorePackage.getEObject(), null, "rankingTo", null, 1, 1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingIntervalEClass, RankingInterval.class, "RankingInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRankingInterval_MaximumEndpoint(), this.getDouble(), "maximumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingInterval_MaximumOpen(), ecorePackage.getEObject(), null, "maximumOpen", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRankingInterval_MinimumEndpoint(), this.getDouble(), "minimumEndpoint", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingInterval_MinimumOpen(), ecorePackage.getEObject(), null, "minimumOpen", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRankingInterval_Symbol(), ecorePackage.getEObject(), null, "symbol", null, 1, 1, RankingInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioMeasureEClass, RatioMeasure.class, "RatioMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ratioMeasurementEClass, RatioMeasurement.class, "RatioMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recursiveMeasureRelationshipEClass, RecursiveMeasureRelationship.class, "RecursiveMeasureRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecursiveMeasureRelationship_From(), ecorePackage.getEObject(), null, "from", null, 1, 1, RecursiveMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecursiveMeasureRelationship_To(), ecorePackage.getEObject(), null, "to", null, 1, 1, RecursiveMeasureRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScope_Class(), ecorePackage.getEObject(), null, "class", null, 1, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_Recognizer(), ecorePackage.getEObject(), null, "recognizer", null, 1, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScope_BreakCondition(), ecorePackage.getEObject(), null, "breakCondition", null, 1, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smmModelEClass, SmmModel.class, "SmmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmmModel_Observations(), this.getObservation(), null, "observations", null, 1, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmmModel_Librairies(), this.getMeasureLibrary(), null, "librairies", null, 1, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accumulatorEEnum, Accumulator.class, "Accumulator");
		addEEnumLiteral(accumulatorEEnum, Accumulator.SUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.MAXIMUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.MINIMUM);
		addEEnumLiteral(accumulatorEEnum, Accumulator.AVERAGE);
		addEEnumLiteral(accumulatorEEnum, Accumulator.STANDARD_DEVIATION);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timestampEDataType, Timestamp.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
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
		  (oclOperationEClass, 
		   source, 
		   new String[] {
			 "originalName", "OCLOperation"
		   });
	}

} //SmmPackageImpl
