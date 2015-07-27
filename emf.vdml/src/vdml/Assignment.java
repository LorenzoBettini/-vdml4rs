/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Assignment#getAssignedRole <em>Assigned Role</em>}</li>
 *   <li>{@link vdml.Assignment#getAssignableResource <em>Assignable Resource</em>}</li>
 *   <li>{@link vdml.Assignment#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Assigned Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Role#getRoleAssignment <em>Role Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Role</em>' reference.
	 * @see #setAssignedRole(Role)
	 * @see vdml.VdmlPackage#getAssignment_AssignedRole()
	 * @see vdml.Role#getRoleAssignment
	 * @model opposite="roleAssignment" required="true" ordered="false"
	 * @generated
	 */
	Role getAssignedRole();

	/**
	 * Sets the value of the '{@link vdml.Assignment#getAssignedRole <em>Assigned Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Role</em>' reference.
	 * @see #getAssignedRole()
	 * @generated
	 */
	void setAssignedRole(Role value);

	/**
	 * Returns the value of the '<em><b>Assignable Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.BusinessItem#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignable Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignable Resource</em>' reference.
	 * @see #setAssignableResource(BusinessItem)
	 * @see vdml.VdmlPackage#getAssignment_AssignableResource()
	 * @see vdml.BusinessItem#getAssignment
	 * @model opposite="assignment" ordered="false"
	 * @generated
	 */
	BusinessItem getAssignableResource();

	/**
	 * Sets the value of the '{@link vdml.Assignment#getAssignableResource <em>Assignable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignable Resource</em>' reference.
	 * @see #getAssignableResource()
	 * @generated
	 */
	void setAssignableResource(BusinessItem value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Participant#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Participant)
	 * @see vdml.VdmlPackage#getAssignment_Participant()
	 * @see vdml.Participant#getAssignment
	 * @model opposite="assignment" ordered="false"
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link vdml.Assignment#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

} // Assignment
