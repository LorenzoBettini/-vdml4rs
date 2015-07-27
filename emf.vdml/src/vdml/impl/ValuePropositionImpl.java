/**
 */
package vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import vdml.MeasuredCharacteristic;
import vdml.Role;
import vdml.ValueProposition;
import vdml.ValuePropositionComponent;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.ValuePropositionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionImpl#getPropositionValue <em>Proposition Value</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePropositionImpl extends MeasurableElementImpl implements ValueProposition {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuePropositionComponent> component;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Role recipient;

	/**
	 * The cached value of the '{@link #getPropositionValue() <em>Proposition Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropositionValue()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic propositionValue;

	/**
	 * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic satisfactionLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuePropositionComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ValuePropositionComponent>(ValuePropositionComponent.class, this, VdmlPackage.VALUE_PROPOSITION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (Role)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.VALUE_PROPOSITION__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(Role newRecipient, NotificationChain msgs) {
		Role oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(Role newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, VdmlPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, VdmlPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__RECIPIENT, newRecipient, newRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getPropositionValue() {
		return propositionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropositionValue(MeasuredCharacteristic newPropositionValue, NotificationChain msgs) {
		MeasuredCharacteristic oldPropositionValue = propositionValue;
		propositionValue = newPropositionValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE, oldPropositionValue, newPropositionValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropositionValue(MeasuredCharacteristic newPropositionValue) {
		if (newPropositionValue != propositionValue) {
			NotificationChain msgs = null;
			if (propositionValue != null)
				msgs = ((InternalEObject)propositionValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE, null, msgs);
			if (newPropositionValue != null)
				msgs = ((InternalEObject)newPropositionValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE, null, msgs);
			msgs = basicSetPropositionValue(newPropositionValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE, newPropositionValue, newPropositionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getSatisfactionLevel() {
		return satisfactionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfactionLevel(MeasuredCharacteristic newSatisfactionLevel, NotificationChain msgs) {
		MeasuredCharacteristic oldSatisfactionLevel = satisfactionLevel;
		satisfactionLevel = newSatisfactionLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL, oldSatisfactionLevel, newSatisfactionLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionLevel(MeasuredCharacteristic newSatisfactionLevel) {
		if (newSatisfactionLevel != satisfactionLevel) {
			NotificationChain msgs = null;
			if (satisfactionLevel != null)
				msgs = ((InternalEObject)satisfactionLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL, null, msgs);
			if (newSatisfactionLevel != null)
				msgs = ((InternalEObject)newSatisfactionLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL, null, msgs);
			msgs = basicSetSatisfactionLevel(newSatisfactionLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL, newSatisfactionLevel, newSatisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getProvider() {
		if (eContainerFeatureID() != VdmlPackage.VALUE_PROPOSITION__PROVIDER) return null;
		return (Role)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Role newProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvider, VdmlPackage.VALUE_PROPOSITION__PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Role newProvider) {
		if (newProvider != eInternalContainer() || (eContainerFeatureID() != VdmlPackage.VALUE_PROPOSITION__PROVIDER && newProvider != null)) {
			if (EcoreUtil.isAncestor(this, newProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, VdmlPackage.ROLE__PROVIDED_PROPOSITION, Role.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				if (recipient != null)
					msgs = ((InternalEObject)recipient).eInverseRemove(this, VdmlPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
				return basicSetRecipient((Role)otherEnd, msgs);
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvider((Role)otherEnd, msgs);
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
			case VdmlPackage.VALUE_PROPOSITION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE:
				return basicSetPropositionValue(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL:
				return basicSetSatisfactionLevel(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				return basicSetProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				return eInternalContainer().eInverseRemove(this, VdmlPackage.ROLE__PROVIDED_PROPOSITION, Role.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VdmlPackage.VALUE_PROPOSITION__COMPONENT:
				return getComponent();
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
			case VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE:
				return getPropositionValue();
			case VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				return getProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VdmlPackage.VALUE_PROPOSITION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ValuePropositionComponent>)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				setRecipient((Role)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE:
				setPropositionValue((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				setProvider((Role)newValue);
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
			case VdmlPackage.VALUE_PROPOSITION__COMPONENT:
				getComponent().clear();
				return;
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				setRecipient((Role)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE:
				setPropositionValue((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				setProvider((Role)null);
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
			case VdmlPackage.VALUE_PROPOSITION__COMPONENT:
				return component != null && !component.isEmpty();
			case VdmlPackage.VALUE_PROPOSITION__RECIPIENT:
				return recipient != null;
			case VdmlPackage.VALUE_PROPOSITION__PROPOSITION_VALUE:
				return propositionValue != null;
			case VdmlPackage.VALUE_PROPOSITION__SATISFACTION_LEVEL:
				return satisfactionLevel != null;
			case VdmlPackage.VALUE_PROPOSITION__PROVIDER:
				return getProvider() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePropositionImpl
