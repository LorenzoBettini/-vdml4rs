/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Role#getPerformedWork <em>Performed Work</em>}</li>
 *   <li>{@link vdml.Role#getPort <em>Port</em>}</li>
 *   <li>{@link vdml.Role#getRoleResource <em>Role Resource</em>}</li>
 *   <li>{@link vdml.Role#getProvidedProposition <em>Provided Proposition</em>}</li>
 *   <li>{@link vdml.Role#getReceivedProposition <em>Received Proposition</em>}</li>
 *   <li>{@link vdml.Role#isIsLead <em>Is Lead</em>}</li>
 *   <li>{@link vdml.Role#getRoleAssignment <em>Role Assignment</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Participant {
	/**
	 * Returns the value of the '<em><b>Performed Work</b></em>' reference list.
	 * The list contents are of type {@link vdml.Activity}.
	 * It is bidirectional and its opposite is '{@link vdml.Activity#getPerformingRole <em>Performing Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Work</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Work</em>' reference list.
	 * @see vdml.VdmlPackage#getRole_PerformedWork()
	 * @see vdml.Activity#getPerformingRole
	 * @model opposite="performingRole" ordered="false"
	 * @generated
	 */
	EList<Activity> getPerformedWork();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link vdml.Port}.
	 * It is bidirectional and its opposite is '{@link vdml.Port#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see vdml.VdmlPackage#getRole_Port()
	 * @see vdml.Port#getHandler
	 * @model opposite="handler" ordered="false"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Role Resource</b></em>' reference list.
	 * The list contents are of type {@link vdml.InputPort}.
	 * It is bidirectional and its opposite is '{@link vdml.InputPort#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Resource</em>' reference list.
	 * @see vdml.VdmlPackage#getRole_RoleResource()
	 * @see vdml.InputPort#getRole
	 * @model opposite="role" ordered="false"
	 * @generated
	 */
	EList<InputPort> getRoleResource();

	/**
	 * Returns the value of the '<em><b>Provided Proposition</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.ValueProposition}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueProposition#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Proposition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Proposition</em>' containment reference list.
	 * @see vdml.VdmlPackage#getRole_ProvidedProposition()
	 * @see vdml.ValueProposition#getProvider
	 * @model opposite="provider" containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueProposition> getProvidedProposition();

	/**
	 * Returns the value of the '<em><b>Received Proposition</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueProposition}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueProposition#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Proposition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Proposition</em>' reference list.
	 * @see vdml.VdmlPackage#getRole_ReceivedProposition()
	 * @see vdml.ValueProposition#getRecipient
	 * @model opposite="recipient" ordered="false"
	 * @generated
	 */
	EList<ValueProposition> getReceivedProposition();

	/**
	 * Returns the value of the '<em><b>Is Lead</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Lead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Lead</em>' attribute.
	 * @see #setIsLead(boolean)
	 * @see vdml.VdmlPackage#getRole_IsLead()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLead();

	/**
	 * Sets the value of the '{@link vdml.Role#isIsLead <em>Is Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Lead</em>' attribute.
	 * @see #isIsLead()
	 * @generated
	 */
	void setIsLead(boolean value);

	/**
	 * Returns the value of the '<em><b>Role Assignment</b></em>' reference list.
	 * The list contents are of type {@link vdml.Assignment}.
	 * It is bidirectional and its opposite is '{@link vdml.Assignment#getAssignedRole <em>Assigned Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Assignment</em>' reference list.
	 * @see vdml.VdmlPackage#getRole_RoleAssignment()
	 * @see vdml.Assignment#getAssignedRole
	 * @model opposite="assignedRole" ordered="false"
	 * @generated
	 */
	EList<Assignment> getRoleAssignment();

} // Role
