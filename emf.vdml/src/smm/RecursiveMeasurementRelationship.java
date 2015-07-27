/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursive Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.RecursiveMeasurementRelationship#getTo <em>To</em>}</li>
 *   <li>{@link smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRecursiveMeasurementRelationship()
 * @model
 * @generated
 */
public interface RecursiveMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getRecursiveMeasurementRelationship_To()
	 * @model required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.RecursiveMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Measurement#getRecursiveTo <em>Recursive To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measurement)
	 * @see smm.SmmPackage#getRecursiveMeasurementRelationship_From()
	 * @see smm.Measurement#getRecursiveTo
	 * @model opposite="recursiveTo" required="true"
	 * @generated
	 */
	Measurement getFrom();

	/**
	 * Sets the value of the '{@link smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measurement value);

} // RecursiveMeasurementRelationship
