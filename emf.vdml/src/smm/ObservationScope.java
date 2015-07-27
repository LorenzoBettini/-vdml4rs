/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.ObservationScope#getScopeUri <em>Scope Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getObservationScope()
 * @model
 * @generated
 */
public interface ObservationScope extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Scope Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Uri</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Uri</em>' reference.
	 * @see #setScopeUri(EObject)
	 * @see smm.SmmPackage#getObservationScope_ScopeUri()
	 * @model required="true"
	 * @generated
	 */
	EObject getScopeUri();

	/**
	 * Sets the value of the '{@link smm.ObservationScope#getScopeUri <em>Scope Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Uri</em>' reference.
	 * @see #getScopeUri()
	 * @generated
	 */
	void setScopeUri(EObject value);

} // ObservationScope
