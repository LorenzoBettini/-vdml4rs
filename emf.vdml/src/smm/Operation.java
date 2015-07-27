/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Operation#getLanguage <em>Language</em>}</li>
 *   <li>{@link smm.Operation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(EObject)
	 * @see smm.SmmPackage#getOperation_Language()
	 * @model required="true"
	 * @generated
	 */
	EObject getLanguage();

	/**
	 * Sets the value of the '{@link smm.Operation#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(EObject value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(EObject)
	 * @see smm.SmmPackage#getOperation_Body()
	 * @model required="true"
	 * @generated
	 */
	EObject getBody();

	/**
	 * Sets the value of the '{@link smm.Operation#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EObject value);

} // Operation
