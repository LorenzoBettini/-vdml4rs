/**
 */
package vdml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vdml.MeasuredCharacteristic;
import vdml.Operand;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.OperandImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link vdml.impl.OperandImpl#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandImpl extends VdmlElementImpl implements Operand {
	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected vdml.String alias;

	/**
	 * The cached value of the '{@link #getMeasuredCharacteristic() <em>Measured Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic measuredCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdml.String getAlias() {
		if (alias != null && alias.eIsProxy()) {
			InternalEObject oldAlias = (InternalEObject)alias;
			alias = (vdml.String)eResolveProxy(oldAlias);
			if (alias != oldAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.OPERAND__ALIAS, oldAlias, alias));
			}
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdml.String basicGetAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(vdml.String newAlias) {
		vdml.String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.OPERAND__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getMeasuredCharacteristic() {
		if (measuredCharacteristic != null && measuredCharacteristic.eIsProxy()) {
			InternalEObject oldMeasuredCharacteristic = (InternalEObject)measuredCharacteristic;
			measuredCharacteristic = (MeasuredCharacteristic)eResolveProxy(oldMeasuredCharacteristic);
			if (measuredCharacteristic != oldMeasuredCharacteristic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
			}
		}
		return measuredCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic basicGetMeasuredCharacteristic() {
		return measuredCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredCharacteristic(MeasuredCharacteristic newMeasuredCharacteristic) {
		MeasuredCharacteristic oldMeasuredCharacteristic = measuredCharacteristic;
		measuredCharacteristic = newMeasuredCharacteristic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VdmlPackage.OPERAND__ALIAS:
				if (resolve) return getAlias();
				return basicGetAlias();
			case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
				if (resolve) return getMeasuredCharacteristic();
				return basicGetMeasuredCharacteristic();
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
			case VdmlPackage.OPERAND__ALIAS:
				setAlias((vdml.String)newValue);
				return;
			case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
				setMeasuredCharacteristic((MeasuredCharacteristic)newValue);
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
			case VdmlPackage.OPERAND__ALIAS:
				setAlias((vdml.String)null);
				return;
			case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
				setMeasuredCharacteristic((MeasuredCharacteristic)null);
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
			case VdmlPackage.OPERAND__ALIAS:
				return alias != null;
			case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
				return measuredCharacteristic != null;
		}
		return super.eIsSet(featureID);
	}

} //OperandImpl
