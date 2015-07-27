/**
 */
package smm.impl;

import java.sql.Timestamp;
import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmFactoryImpl extends EFactoryImpl implements SmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmmFactory init() {
		try {
			SmmFactory theSmmFactory = (SmmFactory)EPackage.Registry.INSTANCE.getEFactory(SmmPackage.eNS_URI);
			if (theSmmFactory != null) {
				return theSmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmFactoryImpl() {
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
			case SmmPackage.ATTRIBUTE: return createAttribute();
			case SmmPackage.ANNOTATION: return createAnnotation();
			case SmmPackage.ARGUMENT: return createArgument();
			case SmmPackage.BASE1_MEASURE_RELATIONSHIP: return createBase1MeasureRelationship();
			case SmmPackage.OPERATION: return createOperation();
			case SmmPackage.BINARY_MEASURE: return createBinaryMeasure();
			case SmmPackage.DIMENSIONAL_MEASURE: return createDimensionalMeasure();
			case SmmPackage.MEASURE_CATEGORY: return createMeasureCategory();
			case SmmPackage.REFINEMENT_MEASURE_RELATIONSHIP: return createRefinementMeasureRelationship();
			case SmmPackage.EQUIVALENT_MEASURE_RELATIONSHIP: return createEquivalentMeasureRelationship();
			case SmmPackage.BASE_MEASURE_RELATIONSHIP: return createBaseMeasureRelationship();
			case SmmPackage.COLLECTIVE_MEASURE: return createCollectiveMeasure();
			case SmmPackage.BASE2_MEASURE_RELATIONSHIP: return createBase2MeasureRelationship();
			case SmmPackage.RESCALE_MEASURE_RELATIONSHIP: return createRescaleMeasureRelationship();
			case SmmPackage.RESCALED_MEASURE: return createRescaledMeasure();
			case SmmPackage.RANKING_MEASURE_RELATIONSHIP: return createRankingMeasureRelationship();
			case SmmPackage.BASE1_MEASUREMENT_RELATIONSHIP: return createBase1MeasurementRelationship();
			case SmmPackage.BINARY_MEASUREMENT: return createBinaryMeasurement();
			case SmmPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP: return createRefinementMeasurementRelationship();
			case SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP: return createEquivalentMeasurementRelationship();
			case SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP: return createRecursiveMeasurementRelationship();
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP: return createBaseMeasurementRelationship();
			case SmmPackage.COLLECTIVE_MEASUREMENT: return createCollectiveMeasurement();
			case SmmPackage.BASE2_MEASUREMENT_RELATIONSHIP: return createBase2MeasurementRelationship();
			case SmmPackage.RESCALE_MEASUREMENT_RELATIONSHIP: return createRescaleMeasurementRelationship();
			case SmmPackage.RESCALED_MEASUREMENT: return createRescaledMeasurement();
			case SmmPackage.RANKING_MEASUREMENT_RELATIONSHIP: return createRankingMeasurementRelationship();
			case SmmPackage.CATEGORY_RELATIONSHIP: return createCategoryRelationship();
			case SmmPackage.CHARACTERISTIC: return createCharacteristic();
			case SmmPackage.COUNT: return createCount();
			case SmmPackage.DIRECT_MEASUREMENT: return createDirectMeasurement();
			case SmmPackage.COUNTING: return createCounting();
			case SmmPackage.DIRECT_MEASURE: return createDirectMeasure();
			case SmmPackage.GRADE: return createGrade();
			case SmmPackage.MEASURE_LIBRARY: return createMeasureLibrary();
			case SmmPackage.MOF_ELEMENT: return createMofElement();
			case SmmPackage.NAMED_MEASURE: return createNamedMeasure();
			case SmmPackage.NAMED_MEASUREMENT: return createNamedMeasurement();
			case SmmPackage.OCL_OPERATION: return createOclOperation();
			case SmmPackage.OBSERVATION: return createObservation();
			case SmmPackage.OBSERVATION_SCOPE: return createObservationScope();
			case SmmPackage.OBSERVED_MEASURE: return createObservedMeasure();
			case SmmPackage.RANKING: return createRanking();
			case SmmPackage.RANKING_INTERVAL: return createRankingInterval();
			case SmmPackage.RATIO_MEASURE: return createRatioMeasure();
			case SmmPackage.RATIO_MEASUREMENT: return createRatioMeasurement();
			case SmmPackage.RECURSIVE_MEASURE_RELATIONSHIP: return createRecursiveMeasureRelationship();
			case SmmPackage.SCOPE: return createScope();
			case SmmPackage.SMM_MODEL: return createSmmModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmmPackage.ACCUMULATOR:
				return createAccumulatorFromString(eDataType, initialValue);
			case SmmPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case SmmPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case SmmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case SmmPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case SmmPackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmmPackage.ACCUMULATOR:
				return convertAccumulatorToString(eDataType, instanceValue);
			case SmmPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case SmmPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case SmmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case SmmPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case SmmPackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base1MeasureRelationship createBase1MeasureRelationship() {
		Base1MeasureRelationshipImpl base1MeasureRelationship = new Base1MeasureRelationshipImpl();
		return base1MeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMeasure createBinaryMeasure() {
		BinaryMeasureImpl binaryMeasure = new BinaryMeasureImpl();
		return binaryMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure createDimensionalMeasure() {
		DimensionalMeasureImpl dimensionalMeasure = new DimensionalMeasureImpl();
		return dimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureCategory createMeasureCategory() {
		MeasureCategoryImpl measureCategory = new MeasureCategoryImpl();
		return measureCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementMeasureRelationship createRefinementMeasureRelationship() {
		RefinementMeasureRelationshipImpl refinementMeasureRelationship = new RefinementMeasureRelationshipImpl();
		return refinementMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentMeasureRelationship createEquivalentMeasureRelationship() {
		EquivalentMeasureRelationshipImpl equivalentMeasureRelationship = new EquivalentMeasureRelationshipImpl();
		return equivalentMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseMeasureRelationship createBaseMeasureRelationship() {
		BaseMeasureRelationshipImpl baseMeasureRelationship = new BaseMeasureRelationshipImpl();
		return baseMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasure createCollectiveMeasure() {
		CollectiveMeasureImpl collectiveMeasure = new CollectiveMeasureImpl();
		return collectiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base2MeasureRelationship createBase2MeasureRelationship() {
		Base2MeasureRelationshipImpl base2MeasureRelationship = new Base2MeasureRelationshipImpl();
		return base2MeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaleMeasureRelationship createRescaleMeasureRelationship() {
		RescaleMeasureRelationshipImpl rescaleMeasureRelationship = new RescaleMeasureRelationshipImpl();
		return rescaleMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaledMeasure createRescaledMeasure() {
		RescaledMeasureImpl rescaledMeasure = new RescaledMeasureImpl();
		return rescaledMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasureRelationship createRankingMeasureRelationship() {
		RankingMeasureRelationshipImpl rankingMeasureRelationship = new RankingMeasureRelationshipImpl();
		return rankingMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base1MeasurementRelationship createBase1MeasurementRelationship() {
		Base1MeasurementRelationshipImpl base1MeasurementRelationship = new Base1MeasurementRelationshipImpl();
		return base1MeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMeasurement createBinaryMeasurement() {
		BinaryMeasurementImpl binaryMeasurement = new BinaryMeasurementImpl();
		return binaryMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementMeasurementRelationship createRefinementMeasurementRelationship() {
		RefinementMeasurementRelationshipImpl refinementMeasurementRelationship = new RefinementMeasurementRelationshipImpl();
		return refinementMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentMeasurementRelationship createEquivalentMeasurementRelationship() {
		EquivalentMeasurementRelationshipImpl equivalentMeasurementRelationship = new EquivalentMeasurementRelationshipImpl();
		return equivalentMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecursiveMeasurementRelationship createRecursiveMeasurementRelationship() {
		RecursiveMeasurementRelationshipImpl recursiveMeasurementRelationship = new RecursiveMeasurementRelationshipImpl();
		return recursiveMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseMeasurementRelationship createBaseMeasurementRelationship() {
		BaseMeasurementRelationshipImpl baseMeasurementRelationship = new BaseMeasurementRelationshipImpl();
		return baseMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasurement createCollectiveMeasurement() {
		CollectiveMeasurementImpl collectiveMeasurement = new CollectiveMeasurementImpl();
		return collectiveMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base2MeasurementRelationship createBase2MeasurementRelationship() {
		Base2MeasurementRelationshipImpl base2MeasurementRelationship = new Base2MeasurementRelationshipImpl();
		return base2MeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaleMeasurementRelationship createRescaleMeasurementRelationship() {
		RescaleMeasurementRelationshipImpl rescaleMeasurementRelationship = new RescaleMeasurementRelationshipImpl();
		return rescaleMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaledMeasurement createRescaledMeasurement() {
		RescaledMeasurementImpl rescaledMeasurement = new RescaledMeasurementImpl();
		return rescaledMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasurementRelationship createRankingMeasurementRelationship() {
		RankingMeasurementRelationshipImpl rankingMeasurementRelationship = new RankingMeasurementRelationshipImpl();
		return rankingMeasurementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryRelationship createCategoryRelationship() {
		CategoryRelationshipImpl categoryRelationship = new CategoryRelationshipImpl();
		return categoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasurement createDirectMeasurement() {
		DirectMeasurementImpl directMeasurement = new DirectMeasurementImpl();
		return directMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counting createCounting() {
		CountingImpl counting = new CountingImpl();
		return counting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasure createDirectMeasure() {
		DirectMeasureImpl directMeasure = new DirectMeasureImpl();
		return directMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureLibrary createMeasureLibrary() {
		MeasureLibraryImpl measureLibrary = new MeasureLibraryImpl();
		return measureLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofElement createMofElement() {
		MofElementImpl mofElement = new MofElementImpl();
		return mofElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasure createNamedMeasure() {
		NamedMeasureImpl namedMeasure = new NamedMeasureImpl();
		return namedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasurement createNamedMeasurement() {
		NamedMeasurementImpl namedMeasurement = new NamedMeasurementImpl();
		return namedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclOperation createOclOperation() {
		OclOperationImpl oclOperation = new OclOperationImpl();
		return oclOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationScope createObservationScope() {
		ObservationScopeImpl observationScope = new ObservationScopeImpl();
		return observationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservedMeasure createObservedMeasure() {
		ObservedMeasureImpl observedMeasure = new ObservedMeasureImpl();
		return observedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking createRanking() {
		RankingImpl ranking = new RankingImpl();
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingInterval createRankingInterval() {
		RankingIntervalImpl rankingInterval = new RankingIntervalImpl();
		return rankingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioMeasure createRatioMeasure() {
		RatioMeasureImpl ratioMeasure = new RatioMeasureImpl();
		return ratioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioMeasurement createRatioMeasurement() {
		RatioMeasurementImpl ratioMeasurement = new RatioMeasurementImpl();
		return ratioMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecursiveMeasureRelationship createRecursiveMeasureRelationship() {
		RecursiveMeasureRelationshipImpl recursiveMeasureRelationship = new RecursiveMeasureRelationshipImpl();
		return recursiveMeasureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmModel createSmmModel() {
		SmmModelImpl smmModel = new SmmModelImpl();
		return smmModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator createAccumulatorFromString(EDataType eDataType, String initialValue) {
		Accumulator result = Accumulator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStringFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(EDataType eDataType, String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmPackage getSmmPackage() {
		return (SmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmmPackage getPackage() {
		return SmmPackage.eINSTANCE;
	}

} //SmmFactoryImpl
