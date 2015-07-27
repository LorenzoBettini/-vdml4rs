/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescaled Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.RescaledMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link smm.RescaledMeasurement#getRescaleFrom <em>Rescale From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRescaledMeasurement()
 * @model
 * @generated
 */
public interface RescaledMeasurement extends DimensionalMeasurement {
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
	 * @see smm.SmmPackage#getRescaledMeasurement_IsBaseSupplied()
	 * @model dataType="smm.Boolean" required="true"
	 * @generated
	 */
	Object getIsBaseSupplied();

	/**
	 * Sets the value of the '{@link smm.RescaledMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #getIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(Object value);

	/**
	 * Returns the value of the '<em><b>Rescale From</b></em>' reference list.
	 * The list contents are of type {@link smm.RescaleMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RescaleMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale From</em>' reference list.
	 * @see smm.SmmPackage#getRescaledMeasurement_RescaleFrom()
	 * @see smm.RescaleMeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RescaleMeasurementRelationship> getRescaleFrom();

} // RescaledMeasurement
