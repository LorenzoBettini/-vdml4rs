/**
 */
package smm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smm.SmmPackage
 * @generated
 */
public class SmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmmPackage.eINSTANCE;
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
	protected SmmSwitch<Adapter> modelSwitch =
		new SmmSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractMeasureElement(AbstractMeasureElement object) {
				return createAbstractMeasureElementAdapter();
			}
			@Override
			public Adapter caseSmmElement(SmmElement object) {
				return createSmmElementAdapter();
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
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseBase1MeasureRelationship(Base1MeasureRelationship object) {
				return createBase1MeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseMeasureRelationship(MeasureRelationship object) {
				return createMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseSmmRelationship(SmmRelationship object) {
				return createSmmRelationshipAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseBinaryMeasure(BinaryMeasure object) {
				return createBinaryMeasureAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasure(DimensionalMeasure object) {
				return createDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureCategory(MeasureCategory object) {
				return createMeasureCategoryAdapter();
			}
			@Override
			public Adapter caseRefinementMeasureRelationship(RefinementMeasureRelationship object) {
				return createRefinementMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseEquivalentMeasureRelationship(EquivalentMeasureRelationship object) {
				return createEquivalentMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseBaseMeasureRelationship(BaseMeasureRelationship object) {
				return createBaseMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseCollectiveMeasure(CollectiveMeasure object) {
				return createCollectiveMeasureAdapter();
			}
			@Override
			public Adapter caseBase2MeasureRelationship(Base2MeasureRelationship object) {
				return createBase2MeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseRescaleMeasureRelationship(RescaleMeasureRelationship object) {
				return createRescaleMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseRescaledMeasure(RescaledMeasure object) {
				return createRescaledMeasureAdapter();
			}
			@Override
			public Adapter caseRankingMeasureRelationship(RankingMeasureRelationship object) {
				return createRankingMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseBase1MeasurementRelationship(Base1MeasurementRelationship object) {
				return createBase1MeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseMeasurementRelationship(MeasurementRelationship object) {
				return createMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseBinaryMeasurement(BinaryMeasurement object) {
				return createBinaryMeasurementAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasurement(DimensionalMeasurement object) {
				return createDimensionalMeasurementAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseRefinementMeasurementRelationship(RefinementMeasurementRelationship object) {
				return createRefinementMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseEquivalentMeasurementRelationship(EquivalentMeasurementRelationship object) {
				return createEquivalentMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseRecursiveMeasurementRelationship(RecursiveMeasurementRelationship object) {
				return createRecursiveMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseBaseMeasurementRelationship(BaseMeasurementRelationship object) {
				return createBaseMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseCollectiveMeasurement(CollectiveMeasurement object) {
				return createCollectiveMeasurementAdapter();
			}
			@Override
			public Adapter caseBase2MeasurementRelationship(Base2MeasurementRelationship object) {
				return createBase2MeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseRescaleMeasurementRelationship(RescaleMeasurementRelationship object) {
				return createRescaleMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseRescaledMeasurement(RescaledMeasurement object) {
				return createRescaledMeasurementAdapter();
			}
			@Override
			public Adapter caseRankingMeasurementRelationship(RankingMeasurementRelationship object) {
				return createRankingMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseCategoryRelationship(CategoryRelationship object) {
				return createCategoryRelationshipAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseDirectMeasurement(DirectMeasurement object) {
				return createDirectMeasurementAdapter();
			}
			@Override
			public Adapter caseCounting(Counting object) {
				return createCountingAdapter();
			}
			@Override
			public Adapter caseDirectMeasure(DirectMeasure object) {
				return createDirectMeasureAdapter();
			}
			@Override
			public Adapter caseGrade(Grade object) {
				return createGradeAdapter();
			}
			@Override
			public Adapter caseMeasureLibrary(MeasureLibrary object) {
				return createMeasureLibraryAdapter();
			}
			@Override
			public Adapter caseMofElement(MofElement object) {
				return createMofElementAdapter();
			}
			@Override
			public Adapter caseNamedMeasure(NamedMeasure object) {
				return createNamedMeasureAdapter();
			}
			@Override
			public Adapter caseNamedMeasurement(NamedMeasurement object) {
				return createNamedMeasurementAdapter();
			}
			@Override
			public Adapter caseOclOperation(OclOperation object) {
				return createOclOperationAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseObservationScope(ObservationScope object) {
				return createObservationScopeAdapter();
			}
			@Override
			public Adapter caseObservedMeasure(ObservedMeasure object) {
				return createObservedMeasureAdapter();
			}
			@Override
			public Adapter caseRanking(Ranking object) {
				return createRankingAdapter();
			}
			@Override
			public Adapter caseRankingInterval(RankingInterval object) {
				return createRankingIntervalAdapter();
			}
			@Override
			public Adapter caseRatioMeasure(RatioMeasure object) {
				return createRatioMeasureAdapter();
			}
			@Override
			public Adapter caseRatioMeasurement(RatioMeasurement object) {
				return createRatioMeasurementAdapter();
			}
			@Override
			public Adapter caseRecursiveMeasureRelationship(RecursiveMeasureRelationship object) {
				return createRecursiveMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseSmmModel(SmmModel object) {
				return createSmmModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link smm.AbstractMeasureElement <em>Abstract Measure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.AbstractMeasureElement
	 * @generated
	 */
	public Adapter createAbstractMeasureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.SmmElement
	 * @generated
	 */
	public Adapter createSmmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Base1MeasureRelationship <em>Base1 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Base1MeasureRelationship
	 * @generated
	 */
	public Adapter createBase1MeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.MeasureRelationship <em>Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.MeasureRelationship
	 * @generated
	 */
	public Adapter createMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.SmmRelationship
	 * @generated
	 */
	public Adapter createSmmRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.BinaryMeasure
	 * @generated
	 */
	public Adapter createBinaryMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.DimensionalMeasure
	 * @generated
	 */
	public Adapter createDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.MeasureCategory <em>Measure Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.MeasureCategory
	 * @generated
	 */
	public Adapter createMeasureCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RefinementMeasureRelationship <em>Refinement Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RefinementMeasureRelationship
	 * @generated
	 */
	public Adapter createRefinementMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.EquivalentMeasureRelationship <em>Equivalent Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.EquivalentMeasureRelationship
	 * @generated
	 */
	public Adapter createEquivalentMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.BaseMeasureRelationship <em>Base Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.BaseMeasureRelationship
	 * @generated
	 */
	public Adapter createBaseMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.CollectiveMeasure
	 * @generated
	 */
	public Adapter createCollectiveMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Base2MeasureRelationship <em>Base2 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Base2MeasureRelationship
	 * @generated
	 */
	public Adapter createBase2MeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RescaleMeasureRelationship <em>Rescale Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RescaleMeasureRelationship
	 * @generated
	 */
	public Adapter createRescaleMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RescaledMeasure
	 * @generated
	 */
	public Adapter createRescaledMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RankingMeasureRelationship <em>Ranking Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RankingMeasureRelationship
	 * @generated
	 */
	public Adapter createRankingMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Base1MeasurementRelationship <em>Base1 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Base1MeasurementRelationship
	 * @generated
	 */
	public Adapter createBase1MeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.MeasurementRelationship <em>Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.MeasurementRelationship
	 * @generated
	 */
	public Adapter createMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.BinaryMeasurement <em>Binary Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.BinaryMeasurement
	 * @generated
	 */
	public Adapter createBinaryMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.DimensionalMeasurement
	 * @generated
	 */
	public Adapter createDimensionalMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RefinementMeasurementRelationship <em>Refinement Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RefinementMeasurementRelationship
	 * @generated
	 */
	public Adapter createRefinementMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.EquivalentMeasurementRelationship <em>Equivalent Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.EquivalentMeasurementRelationship
	 * @generated
	 */
	public Adapter createEquivalentMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RecursiveMeasurementRelationship <em>Recursive Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RecursiveMeasurementRelationship
	 * @generated
	 */
	public Adapter createRecursiveMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.BaseMeasurementRelationship <em>Base Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.BaseMeasurementRelationship
	 * @generated
	 */
	public Adapter createBaseMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.CollectiveMeasurement <em>Collective Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.CollectiveMeasurement
	 * @generated
	 */
	public Adapter createCollectiveMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Base2MeasurementRelationship <em>Base2 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Base2MeasurementRelationship
	 * @generated
	 */
	public Adapter createBase2MeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RescaleMeasurementRelationship <em>Rescale Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RescaleMeasurementRelationship
	 * @generated
	 */
	public Adapter createRescaleMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RescaledMeasurement <em>Rescaled Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RescaledMeasurement
	 * @generated
	 */
	public Adapter createRescaledMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RankingMeasurementRelationship <em>Ranking Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RankingMeasurementRelationship
	 * @generated
	 */
	public Adapter createRankingMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.CategoryRelationship <em>Category Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.CategoryRelationship
	 * @generated
	 */
	public Adapter createCategoryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.DirectMeasurement <em>Direct Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.DirectMeasurement
	 * @generated
	 */
	public Adapter createDirectMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Counting <em>Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Counting
	 * @generated
	 */
	public Adapter createCountingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.DirectMeasure <em>Direct Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.DirectMeasure
	 * @generated
	 */
	public Adapter createDirectMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.MeasureLibrary <em>Measure Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.MeasureLibrary
	 * @generated
	 */
	public Adapter createMeasureLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.MofElement <em>Mof Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.MofElement
	 * @generated
	 */
	public Adapter createMofElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.NamedMeasure <em>Named Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.NamedMeasure
	 * @generated
	 */
	public Adapter createNamedMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.NamedMeasurement <em>Named Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.NamedMeasurement
	 * @generated
	 */
	public Adapter createNamedMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.OclOperation <em>Ocl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.OclOperation
	 * @generated
	 */
	public Adapter createOclOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.ObservationScope <em>Observation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.ObservationScope
	 * @generated
	 */
	public Adapter createObservationScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.ObservedMeasure <em>Observed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.ObservedMeasure
	 * @generated
	 */
	public Adapter createObservedMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Ranking
	 * @generated
	 */
	public Adapter createRankingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RankingInterval <em>Ranking Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RankingInterval
	 * @generated
	 */
	public Adapter createRankingIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RatioMeasure
	 * @generated
	 */
	public Adapter createRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RatioMeasurement <em>Ratio Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RatioMeasurement
	 * @generated
	 */
	public Adapter createRatioMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.RecursiveMeasureRelationship <em>Recursive Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.RecursiveMeasureRelationship
	 * @generated
	 */
	public Adapter createRecursiveMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smm.SmmModel
	 * @generated
	 */
	public Adapter createSmmModelAdapter() {
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

} //SmmAdapterFactory
