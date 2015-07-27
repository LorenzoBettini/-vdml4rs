/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link smm.CollectiveMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link smm.CollectiveMeasurement#getBaseMeasurementTo <em>Base Measurement To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getCollectiveMeasurement()
 * @model
 * @generated
 */
public interface CollectiveMeasurement extends DimensionalMeasurement {
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
	 * @see smm.SmmPackage#getCollectiveMeasurement_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

	/**
	 * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #setIsBaseSupplied(Boolean)
	 * @see smm.SmmPackage#getCollectiveMeasurement_IsBaseSupplied()
	 * @model dataType="smm.Boolean" required="true"
	 * @generated
	 */
	Object getIsBaseSupplied();

	/**
	 * Sets the value of the '{@link smm.CollectiveMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #getIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(Object value);

	/**
	 * Returns the value of the '<em><b>Base Measurement To</b></em>' reference list.
	 * The list contents are of type {@link smm.BaseMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.BaseMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement To</em>' reference list.
	 * @see smm.SmmPackage#getCollectiveMeasurement_BaseMeasurementTo()
	 * @see smm.BaseMeasurementRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<BaseMeasurementRelationship> getBaseMeasurementTo();

} // CollectiveMeasurement
