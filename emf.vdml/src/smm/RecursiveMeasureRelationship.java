/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursive Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.RecursiveMeasureRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link smm.RecursiveMeasureRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRecursiveMeasureRelationship()
 * @model
 * @generated
 */
public interface RecursiveMeasureRelationship extends MeasureRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EObject)
	 * @see smm.SmmPackage#getRecursiveMeasureRelationship_From()
	 * @model required="true"
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link smm.RecursiveMeasureRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

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
	 * @see smm.SmmPackage#getRecursiveMeasureRelationship_To()
	 * @model required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.RecursiveMeasureRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

} // RecursiveMeasureRelationship
