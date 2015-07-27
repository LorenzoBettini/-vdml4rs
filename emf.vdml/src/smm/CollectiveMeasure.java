/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link smm.CollectiveMeasure#getBaseMeasureTo <em>Base Measure To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getCollectiveMeasure()
 * @model
 * @generated
 */
public interface CollectiveMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Accumulator</b></em>' attribute.
	 * The literals are from the enumeration {@link smm.Accumulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator</em>' attribute.
	 * @see smm.Accumulator
	 * @see #setAccumulator(Accumulator)
	 * @see smm.SmmPackage#getCollectiveMeasure_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

	/**
	 * Returns the value of the '<em><b>Base Measure To</b></em>' reference list.
	 * The list contents are of type {@link smm.BaseMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.BaseMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure To</em>' reference list.
	 * @see smm.SmmPackage#getCollectiveMeasure_BaseMeasureTo()
	 * @see smm.BaseMeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<BaseMeasureRelationship> getBaseMeasureTo();

} // CollectiveMeasure
