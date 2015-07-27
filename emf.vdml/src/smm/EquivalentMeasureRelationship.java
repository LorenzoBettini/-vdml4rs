/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}</li>
 *   <li>{@link smm.EquivalentMeasureRelationship#getTo <em>To</em>}</li>
 *   <li>{@link smm.EquivalentMeasureRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getEquivalentMeasureRelationship()
 * @model
 * @generated
 */
public interface EquivalentMeasureRelationship extends MeasureRelationship {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Operation)
	 * @see smm.SmmPackage#getEquivalentMeasureRelationship_Mapping()
	 * @model required="true"
	 * @generated
	 */
	Operation getMapping();

	/**
	 * Sets the value of the '{@link smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Operation value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getEquivalentMeasureRelationship_To()
	 * @see smm.Measure#getEquivalentFrom
	 * @model opposite="equivalentFrom" required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.EquivalentMeasureRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EObject)
	 * @see smm.SmmPackage#getEquivalentMeasureRelationship_From()
	 * @see smm.Measure#getEquivalentTo
	 * @model opposite="equivalentTo" required="true"
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link smm.EquivalentMeasureRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

} // EquivalentMeasureRelationship
