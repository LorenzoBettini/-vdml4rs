/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.DelegationContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link vdml.DelegationContext#getContextBasedPortDelegation <em>Context Based Port Delegation</em>}</li>
 *   <li>{@link vdml.DelegationContext#getContextBasedAssignment <em>Context Based Assignment</em>}</li>
 *   <li>{@link vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}</li>
 *   <li>{@link vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getDelegationContext()
 * @model
 * @generated
 */
public interface DelegationContext extends AnalysisContext {
	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vdml.AnalysisContext#getDelegationtContext <em>Delegationt Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(AnalysisContext)
	 * @see vdml.VdmlPackage#getDelegationContext_ParentContext()
	 * @see vdml.AnalysisContext#getDelegationtContext
	 * @model opposite="delegationtContext" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AnalysisContext getParentContext();

	/**
	 * Sets the value of the '{@link vdml.DelegationContext#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(AnalysisContext value);

	/**
	 * Returns the value of the '<em><b>Context Based Port Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.PortDelegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Based Port Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Based Port Delegation</em>' containment reference list.
	 * @see vdml.VdmlPackage#getDelegationContext_ContextBasedPortDelegation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortDelegation> getContextBasedPortDelegation();

	/**
	 * Returns the value of the '<em><b>Context Based Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Based Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Based Assignment</em>' containment reference list.
	 * @see vdml.VdmlPackage#getDelegationContext_ContextBasedAssignment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Assignment> getContextBasedAssignment();

	/**
	 * Returns the value of the '<em><b>Delegated Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Activity#getDelegationContext <em>Delegation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Activity</em>' reference.
	 * @see #setDelegatedActivity(Activity)
	 * @see vdml.VdmlPackage#getDelegationContext_DelegatedActivity()
	 * @see vdml.Activity#getDelegationContext
	 * @model opposite="delegationContext" required="true" ordered="false"
	 * @generated
	 */
	Activity getDelegatedActivity();

	/**
	 * Sets the value of the '{@link vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegated Activity</em>' reference.
	 * @see #getDelegatedActivity()
	 * @generated
	 */
	void setDelegatedActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Context Collaboration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Collaboration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Collaboration</em>' reference.
	 * @see #setContextCollaboration(Collaboration)
	 * @see vdml.VdmlPackage#getDelegationContext_ContextCollaboration()
	 * @see vdml.Collaboration#getDelegationContext
	 * @model opposite="delegationContext" required="true" ordered="false"
	 * @generated
	 */
	Collaboration getContextCollaboration();

	/**
	 * Sets the value of the '{@link vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Collaboration</em>' reference.
	 * @see #getContextCollaboration()
	 * @generated
	 */
	void setContextCollaboration(Collaboration value);

} // DelegationContext
