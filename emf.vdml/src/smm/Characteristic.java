/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Characteristic#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(EObject)
	 * @see smm.SmmPackage#getCharacteristic_Parent()
	 * @model required="true"
	 * @generated
	 */
	EObject getParent();

	/**
	 * Sets the value of the '{@link smm.Characteristic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EObject value);

} // Characteristic
