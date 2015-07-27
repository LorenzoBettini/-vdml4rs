/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Annotation#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(EObject)
	 * @see smm.SmmPackage#getAnnotation_Text()
	 * @model required="true"
	 * @generated
	 */
	EObject getText();

	/**
	 * Sets the value of the '{@link smm.Annotation#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(EObject value);

} // Annotation
