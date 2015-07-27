/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link vdml.Collaboration#getGoal <em>Goal</em>}</li>
 *   <li>{@link vdml.Collaboration#getActivity <em>Activity</em>}</li>
 *   <li>{@link vdml.Collaboration#getFlow <em>Flow</em>}</li>
 *   <li>{@link vdml.Collaboration#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link vdml.Collaboration#getInternalPortDelegation <em>Internal Port Delegation</em>}</li>
 *   <li>{@link vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link vdml.Collaboration#getScenario <em>Scenario</em>}</li>
 *   <li>{@link vdml.Collaboration#getOwnedAssignment <em>Owned Assignment</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends Participant, PortContainer {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_CollaborationRole()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Role> getCollaborationRole();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_Goal()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_Activity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.DeliverableFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_Flow()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeliverableFlow> getFlow();

	/**
	 * Returns the value of the '<em><b>Business Item</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.BusinessItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_BusinessItem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BusinessItem> getBusinessItem();

	/**
	 * Returns the value of the '<em><b>Internal Port Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.PortDelegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Port Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Port Delegation</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_InternalPortDelegation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortDelegation> getInternalPortDelegation();

	/**
	 * Returns the value of the '<em><b>Delegation Context</b></em>' reference list.
	 * The list contents are of type {@link vdml.DelegationContext}.
	 * It is bidirectional and its opposite is '{@link vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Context</em>' reference list.
	 * @see vdml.VdmlPackage#getCollaboration_DelegationContext()
	 * @see vdml.DelegationContext#getContextCollaboration
	 * @model opposite="contextCollaboration" ordered="false"
	 * @generated
	 */
	EList<DelegationContext> getDelegationContext();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link vdml.Scenario}.
	 * It is bidirectional and its opposite is '{@link vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see vdml.VdmlPackage#getCollaboration_Scenario()
	 * @see vdml.Scenario#getContextCollaboration
	 * @model opposite="contextCollaboration" ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Owned Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Assignment</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCollaboration_OwnedAssignment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Assignment> getOwnedAssignment();

} // Collaboration
