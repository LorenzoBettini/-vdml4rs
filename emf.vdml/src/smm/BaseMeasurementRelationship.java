/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.BaseMeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link smm.BaseMeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getBaseMeasurementRelationship()
 * @model
 * @generated
 */
public interface BaseMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.CollectiveMeasurement#getBaseMeasurementTo <em>Base Measurement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EObject)
	 * @see smm.SmmPackage#getBaseMeasurementRelationship_From()
	 * @see smm.CollectiveMeasurement#getBaseMeasurementTo
	 * @model opposite="baseMeasurementTo" required="true"
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link smm.BaseMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.DimensionalMeasurement#getBaseMeasurementFrom <em>Base Measurement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getBaseMeasurementRelationship_To()
	 * @see smm.DimensionalMeasurement#getBaseMeasurementFrom
	 * @model opposite="baseMeasurementFrom" required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.BaseMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

} // BaseMeasurementRelationship
