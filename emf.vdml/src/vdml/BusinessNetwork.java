/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.BusinessNetwork#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getBusinessNetwork()
 * @model
 * @generated
 */
public interface BusinessNetwork extends Collaboration {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference list.
	 * @see vdml.VdmlPackage#getBusinessNetwork_Party()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Party> getParty();

} // BusinessNetwork
