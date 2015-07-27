/**
 */
package vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vdml.Assignment;
import vdml.BusinessItem;
import vdml.Participant;
import vdml.Role;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.AssignmentImpl#getAssignedRole <em>Assigned Role</em>}</li>
 *   <li>{@link vdml.impl.AssignmentImpl#getAssignableResource <em>Assignable Resource</em>}</li>
 *   <li>{@link vdml.impl.AssignmentImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends VdmlElementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getAssignedRole() <em>Assigned Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedRole()
	 * @generated
	 * @ordered
	 */
	protected Role assignedRole;

	/**
	 * The cached value of the '{@link #getAssignableResource() <em>Assignable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignableResource()
	 * @generated
	 * @ordered
	 */
	protected BusinessItem assignableResource;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected Participant participant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getAssignedRole() {
		if (assignedRole != null && assignedRole.eIsProxy()) {
			InternalEObject oldAssignedRole = (InternalEObject)assignedRole;
			assignedRole = (Role)eResolveProxy(oldAssignedRole);
			if (assignedRole != oldAssignedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, oldAssignedRole, assignedRole));
			}
		}
		return assignedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetAssignedRole() {
		return assignedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedRole(Role newAssignedRole, NotificationChain msgs) {
		Role oldAssignedRole = assignedRole;
		assignedRole = newAssignedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, oldAssignedRole, newAssignedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedRole(Role newAssignedRole) {
		if (newAssignedRole != assignedRole) {
			NotificationChain msgs = null;
			if (assignedRole != null)
				msgs = ((InternalEObject)assignedRole).eInverseRemove(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
			if (newAssignedRole != null)
				msgs = ((InternalEObject)newAssignedRole).eInverseAdd(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
			msgs = basicSetAssignedRole(newAssignedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, newAssignedRole, newAssignedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItem getAssignableResource() {
		if (assignableResource != null && assignableResource.eIsProxy()) {
			InternalEObject oldAssignableResource = (InternalEObject)assignableResource;
			assignableResource = (BusinessItem)eResolveProxy(oldAssignableResource);
			if (assignableResource != oldAssignableResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE, oldAssignableResource, assignableResource));
			}
		}
		return assignableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItem basicGetAssignableResource() {
		return assignableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignableResource(BusinessItem newAssignableResource, NotificationChain msgs) {
		BusinessItem oldAssignableResource = assignableResource;
		assignableResource = newAssignableResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE, oldAssignableResource, newAssignableResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignableResource(BusinessItem newAssignableResource) {
		if (newAssignableResource != assignableResource) {
			NotificationChain msgs = null;
			if (assignableResource != null)
				msgs = ((InternalEObject)assignableResource).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM__ASSIGNMENT, BusinessItem.class, msgs);
			if (newAssignableResource != null)
				msgs = ((InternalEObject)newAssignableResource).eInverseAdd(this, VdmlPackage.BUSINESS_ITEM__ASSIGNMENT, BusinessItem.class, msgs);
			msgs = basicSetAssignableResource(newAssignableResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE, newAssignableResource, newAssignableResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getParticipant() {
		if (participant != null && participant.eIsProxy()) {
			InternalEObject oldParticipant = (InternalEObject)participant;
			participant = (Participant)eResolveProxy(oldParticipant);
			if (participant != oldParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ASSIGNMENT__PARTICIPANT, oldParticipant, participant));
			}
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetParticipant() {
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
		Participant oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__PARTICIPANT, oldParticipant, newParticipant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(Participant newParticipant) {
		if (newParticipant != participant) {
			NotificationChain msgs = null;
			if (participant != null)
				msgs = ((InternalEObject)participant).eInverseRemove(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject)newParticipant).eInverseAdd(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__PARTICIPANT, newParticipant, newParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				if (assignedRole != null)
					msgs = ((InternalEObject)assignedRole).eInverseRemove(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
				return basicSetAssignedRole((Role)otherEnd, msgs);
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				if (assignableResource != null)
					msgs = ((InternalEObject)assignableResource).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM__ASSIGNMENT, BusinessItem.class, msgs);
				return basicSetAssignableResource((BusinessItem)otherEnd, msgs);
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				if (participant != null)
					msgs = ((InternalEObject)participant).eInverseRemove(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
				return basicSetParticipant((Participant)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				return basicSetAssignedRole(null, msgs);
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				return basicSetAssignableResource(null, msgs);
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				return basicSetParticipant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				if (resolve) return getAssignedRole();
				return basicGetAssignedRole();
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				if (resolve) return getAssignableResource();
				return basicGetAssignableResource();
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				if (resolve) return getParticipant();
				return basicGetParticipant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				setAssignedRole((Role)newValue);
				return;
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				setAssignableResource((BusinessItem)newValue);
				return;
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				setParticipant((Participant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				setAssignedRole((Role)null);
				return;
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				setAssignableResource((BusinessItem)null);
				return;
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				setParticipant((Participant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
				return assignedRole != null;
			case VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE:
				return assignableResource != null;
			case VdmlPackage.ASSIGNMENT__PARTICIPANT:
				return participant != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
