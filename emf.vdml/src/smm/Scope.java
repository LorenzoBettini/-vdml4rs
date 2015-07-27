/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Scope#getClass_ <em>Class</em>}</li>
 *   <li>{@link smm.Scope#getRecognizer <em>Recognizer</em>}</li>
 *   <li>{@link smm.Scope#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(EObject)
	 * @see smm.SmmPackage#getScope_Class()
	 * @model required="true"
	 * @generated
	 */
	EObject getClass_();

	/**
	 * Sets the value of the '{@link smm.Scope#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EObject value);

	/**
	 * Returns the value of the '<em><b>Recognizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recognizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognizer</em>' reference.
	 * @see #setRecognizer(EObject)
	 * @see smm.SmmPackage#getScope_Recognizer()
	 * @model required="true"
	 * @generated
	 */
	EObject getRecognizer();

	/**
	 * Sets the value of the '{@link smm.Scope#getRecognizer <em>Recognizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognizer</em>' reference.
	 * @see #getRecognizer()
	 * @generated
	 */
	void setRecognizer(EObject value);

	/**
	 * Returns the value of the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Condition</em>' reference.
	 * @see #setBreakCondition(EObject)
	 * @see smm.SmmPackage#getScope_BreakCondition()
	 * @model required="true"
	 * @generated
	 */
	EObject getBreakCondition();

	/**
	 * Sets the value of the '{@link smm.Scope#getBreakCondition <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Condition</em>' reference.
	 * @see #getBreakCondition()
	 * @generated
	 */
	void setBreakCondition(EObject value);

} // Scope
