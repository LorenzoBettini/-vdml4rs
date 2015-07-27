/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.EquivalentMeasurementRelationship#getTo <em>To</em>}</li>
 *   <li>{@link smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getEquivalentMeasurementRelationship()
 * @model
 * @generated
 */
public interface EquivalentMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Measurement#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getEquivalentMeasurementRelationship_To()
	 * @see smm.Measurement#getEquivalentFrom
	 * @model opposite="equivalentFrom" required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.EquivalentMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Measurement#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measurement)
	 * @see smm.SmmPackage#getEquivalentMeasurementRelationship_From()
	 * @see smm.Measurement#getEquivalentTo
	 * @model opposite="equivalentTo" required="true"
	 * @generated
	 */
	Measurement getFrom();

	/**
	 * Sets the value of the '{@link smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measurement value);

} // EquivalentMeasurementRelationship
