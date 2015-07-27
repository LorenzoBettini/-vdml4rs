/**
 */
package vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vdml.MeasuredCharacteristic;
import vdml.ValueAdd;
import vdml.ValuePropositionComponent;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.ValuePropositionComponentImpl#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionComponentImpl#getComponentValue <em>Component Value</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionComponentImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link vdml.impl.ValuePropositionComponentImpl#getArticulatedValue <em>Articulated Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePropositionComponentImpl extends MeasurableElementImpl implements ValuePropositionComponent {
	/**
	 * The cached value of the '{@link #getPercentageWeight() <em>Percentage Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageWeight()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic percentageWeight;

	/**
	 * The cached value of the '{@link #getComponentValue() <em>Component Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentValue()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic componentValue;

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
	 * The cached value of the '{@link #getArticulatedValue() <em>Articulated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticulatedValue()
	 * @generated
	 * @ordered
	 */
	protected ValueAdd articulatedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePropositionComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.VALUE_PROPOSITION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getPercentageWeight() {
		return percentageWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageWeight(MeasuredCharacteristic newPercentageWeight, NotificationChain msgs) {
		MeasuredCharacteristic oldPercentageWeight = percentageWeight;
		percentageWeight = newPercentageWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, oldPercentageWeight, newPercentageWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageWeight(MeasuredCharacteristic newPercentageWeight) {
		if (newPercentageWeight != percentageWeight) {
			NotificationChain msgs = null;
			if (percentageWeight != null)
				msgs = ((InternalEObject)percentageWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
			if (newPercentageWeight != null)
				msgs = ((InternalEObject)newPercentageWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
			msgs = basicSetPercentageWeight(newPercentageWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, newPercentageWeight, newPercentageWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getComponentValue() {
		return componentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentValue(MeasuredCharacteristic newComponentValue, NotificationChain msgs) {
		MeasuredCharacteristic oldComponentValue = componentValue;
		componentValue = newComponentValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE, oldComponentValue, newComponentValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentValue(MeasuredCharacteristic newComponentValue) {
		if (newComponentValue != componentValue) {
			NotificationChain msgs = null;
			if (componentValue != null)
				msgs = ((InternalEObject)componentValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE, null, msgs);
			if (newComponentValue != null)
				msgs = ((InternalEObject)newComponentValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE, null, msgs);
			msgs = basicSetComponentValue(newComponentValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE, newComponentValue, newComponentValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, oldSatisfactionLevel, newSatisfactionLevel);
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
				msgs = ((InternalEObject)satisfactionLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
			if (newSatisfactionLevel != null)
				msgs = ((InternalEObject)newSatisfactionLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
			msgs = basicSetSatisfactionLevel(newSatisfactionLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, newSatisfactionLevel, newSatisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAdd getArticulatedValue() {
		if (articulatedValue != null && articulatedValue.eIsProxy()) {
			InternalEObject oldArticulatedValue = (InternalEObject)articulatedValue;
			articulatedValue = (ValueAdd)eResolveProxy(oldArticulatedValue);
			if (articulatedValue != oldArticulatedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, oldArticulatedValue, articulatedValue));
			}
		}
		return articulatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAdd basicGetArticulatedValue() {
		return articulatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticulatedValue(ValueAdd newArticulatedValue, NotificationChain msgs) {
		ValueAdd oldArticulatedValue = articulatedValue;
		articulatedValue = newArticulatedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, oldArticulatedValue, newArticulatedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticulatedValue(ValueAdd newArticulatedValue) {
		if (newArticulatedValue != articulatedValue) {
			NotificationChain msgs = null;
			if (articulatedValue != null)
				msgs = ((InternalEObject)articulatedValue).eInverseRemove(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
			if (newArticulatedValue != null)
				msgs = ((InternalEObject)newArticulatedValue).eInverseAdd(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
			msgs = basicSetArticulatedValue(newArticulatedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, newArticulatedValue, newArticulatedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				if (articulatedValue != null)
					msgs = ((InternalEObject)articulatedValue).eInverseRemove(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
				return basicSetArticulatedValue((ValueAdd)otherEnd, msgs);
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
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return basicSetPercentageWeight(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE:
				return basicSetComponentValue(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return basicSetSatisfactionLevel(null, msgs);
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				return basicSetArticulatedValue(null, msgs);
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
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return getPercentageWeight();
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE:
				return getComponentValue();
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				if (resolve) return getArticulatedValue();
				return basicGetArticulatedValue();
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
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				setPercentageWeight((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE:
				setComponentValue((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				setArticulatedValue((ValueAdd)newValue);
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
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				setPercentageWeight((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE:
				setComponentValue((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				setArticulatedValue((ValueAdd)null);
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
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return percentageWeight != null;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__COMPONENT_VALUE:
				return componentValue != null;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return satisfactionLevel != null;
			case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
				return articulatedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePropositionComponentImpl
