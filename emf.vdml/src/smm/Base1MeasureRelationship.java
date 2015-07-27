/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base1 Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Base1MeasureRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link smm.Base1MeasureRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getBase1MeasureRelationship()
 * @model
 * @generated
 */
public interface Base1MeasureRelationship extends MeasureRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EObject)
	 * @see smm.SmmPackage#getBase1MeasureRelationship_From()
	 * @see smm.BinaryMeasure#getBaseMeasure1To
	 * @model opposite="baseMeasure1To" required="true"
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link smm.Base1MeasureRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.DimensionalMeasure#getBaseMeasure1From <em>Base Measure1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getBase1MeasureRelationship_To()
	 * @see smm.DimensionalMeasure#getBaseMeasure1From
	 * @model opposite="baseMeasure1From" required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.Base1MeasureRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

} // Base1MeasureRelationship
