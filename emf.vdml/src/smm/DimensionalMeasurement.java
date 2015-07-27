/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.DimensionalMeasurement#getValue <em>Value</em>}</li>
 *   <li>{@link smm.DimensionalMeasurement#getBaseMeasurementFrom <em>Base Measurement From</em>}</li>
 *   <li>{@link smm.DimensionalMeasurement#getBaseMeasurement1From <em>Base Measurement1 From</em>}</li>
 *   <li>{@link smm.DimensionalMeasurement#getBaseMeasurement2From <em>Base Measurement2 From</em>}</li>
 *   <li>{@link smm.DimensionalMeasurement#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link smm.DimensionalMeasurement#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getDimensionalMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface DimensionalMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see smm.SmmPackage#getDimensionalMeasurement_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link smm.DimensionalMeasurement#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Base Measurement From</b></em>' reference list.
	 * The list contents are of type {@link smm.BaseMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.BaseMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasurement_BaseMeasurementFrom()
	 * @see smm.BaseMeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<BaseMeasurementRelationship> getBaseMeasurementFrom();

	/**
	 * Returns the value of the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * The list contents are of type {@link smm.Base1MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.Base1MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement1 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement1 From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasurement_BaseMeasurement1From()
	 * @see smm.Base1MeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<Base1MeasurementRelationship> getBaseMeasurement1From();

	/**
	 * Returns the value of the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * The list contents are of type {@link smm.Base2MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.Base2MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement2 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement2 From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasurement_BaseMeasurement2From()
	 * @see smm.Base2MeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<Base2MeasurementRelationship> getBaseMeasurement2From();

	/**
	 * Returns the value of the '<em><b>Rescale To</b></em>' reference list.
	 * The list contents are of type {@link smm.RescaleMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RescaleMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale To</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasurement_RescaleTo()
	 * @see smm.RescaleMeasurementRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<RescaleMeasurementRelationship> getRescaleTo();

	/**
	 * Returns the value of the '<em><b>Ranking From</b></em>' reference list.
	 * The list contents are of type {@link smm.RankingMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RankingMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasurement_RankingFrom()
	 * @see smm.RankingMeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RankingMeasurementRelationship> getRankingFrom();

} // DimensionalMeasurement
