/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Activity#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link vdml.Activity#getCollaborationGoal <em>Collaboration Goal</em>}</li>
 *   <li>{@link vdml.Activity#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link vdml.Activity#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}</li>
 *   <li>{@link vdml.Activity#getDuration <em>Duration</em>}</li>
 *   <li>{@link vdml.Activity#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link vdml.Activity#getRecurrenceInterval <em>Recurrence Interval</em>}</li>
 *   <li>{@link vdml.Activity#getPerformingRole <em>Performing Role</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends PortContainer {
	/**
	 * Returns the value of the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Requirement</em>' reference.
	 * @see #setCapabilityRequirement(Capability)
	 * @see vdml.VdmlPackage#getActivity_CapabilityRequirement()
	 * @model ordered="false"
	 * @generated
	 */
	Capability getCapabilityRequirement();

	/**
	 * Sets the value of the '{@link vdml.Activity#getCapabilityRequirement <em>Capability Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Requirement</em>' reference.
	 * @see #getCapabilityRequirement()
	 * @generated
	 */
	void setCapabilityRequirement(Capability value);

	/**
	 * Returns the value of the '<em><b>Collaboration Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Goal#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Goal</em>' reference.
	 * @see #setCollaborationGoal(Goal)
	 * @see vdml.VdmlPackage#getActivity_CollaborationGoal()
	 * @see vdml.Goal#getActivity
	 * @model opposite="activity" ordered="false"
	 * @generated
	 */
	Goal getCollaborationGoal();

	/**
	 * Sets the value of the '{@link vdml.Activity#getCollaborationGoal <em>Collaboration Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Goal</em>' reference.
	 * @see #getCollaborationGoal()
	 * @generated
	 */
	void setCollaborationGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Resource Use</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.ResourceUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use</em>' containment reference list.
	 * @see vdml.VdmlPackage#getActivity_ResourceUse()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceUse> getResourceUse();

	/**
	 * Returns the value of the '<em><b>Delegation Context</b></em>' reference list.
	 * The list contents are of type {@link vdml.DelegationContext}.
	 * It is bidirectional and its opposite is '{@link vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Context</em>' reference list.
	 * @see vdml.VdmlPackage#getActivity_DelegationContext()
	 * @see vdml.DelegationContext#getDelegatedActivity
	 * @model opposite="delegatedActivity" ordered="false"
	 * @generated
	 */
	EList<DelegationContext> getDelegationContext();

	/**
	 * Returns the value of the '<em><b>Applied Capability Offer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityOffer#getApplyingActivity <em>Applying Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Capability Offer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Capability Offer</em>' reference.
	 * @see #setAppliedCapabilityOffer(CapabilityOffer)
	 * @see vdml.VdmlPackage#getActivity_AppliedCapabilityOffer()
	 * @see vdml.CapabilityOffer#getApplyingActivity
	 * @model opposite="applyingActivity" ordered="false"
	 * @generated
	 */
	CapabilityOffer getAppliedCapabilityOffer();

	/**
	 * Sets the value of the '{@link vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Capability Offer</em>' reference.
	 * @see #getAppliedCapabilityOffer()
	 * @generated
	 */
	void setAppliedCapabilityOffer(CapabilityOffer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getActivity_Duration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getDuration();

	/**
	 * Sets the value of the '{@link vdml.Activity#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Implemented Practice</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented Practice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Practice</em>' reference list.
	 * @see vdml.VdmlPackage#getActivity_ImplementedPractice()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PracticeDefinition> getImplementedPractice();

	/**
	 * Returns the value of the '<em><b>Recurrence Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Interval</em>' containment reference.
	 * @see #setRecurrenceInterval(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getActivity_RecurrenceInterval()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getRecurrenceInterval();

	/**
	 * Sets the value of the '{@link vdml.Activity#getRecurrenceInterval <em>Recurrence Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Interval</em>' containment reference.
	 * @see #getRecurrenceInterval()
	 * @generated
	 */
	void setRecurrenceInterval(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Performing Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Role#getPerformedWork <em>Performed Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performing Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performing Role</em>' reference.
	 * @see #setPerformingRole(Role)
	 * @see vdml.VdmlPackage#getActivity_PerformingRole()
	 * @see vdml.Role#getPerformedWork
	 * @model opposite="performedWork" required="true" ordered="false"
	 * @generated
	 */
	Role getPerformingRole();

	/**
	 * Sets the value of the '{@link vdml.Activity#getPerformingRole <em>Performing Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performing Role</em>' reference.
	 * @see #getPerformingRole()
	 * @generated
	 */
	void setPerformingRole(Role value);

} // Activity
