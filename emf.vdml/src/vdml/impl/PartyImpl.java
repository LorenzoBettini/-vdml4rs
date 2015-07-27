/**
 */
package vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vdml.MeasuredCharacteristic;
import vdml.Party;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.PartyImpl#getValueMargin <em>Value Margin</em>}</li>
 *   <li>{@link vdml.impl.PartyImpl#getProfit <em>Profit</em>}</li>
 *   <li>{@link vdml.impl.PartyImpl#isIsFocalPoint <em>Is Focal Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends RoleImpl implements Party {
	/**
	 * The cached value of the '{@link #getValueMargin() <em>Value Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMargin()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic valueMargin;

	/**
	 * The cached value of the '{@link #getProfit() <em>Profit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfit()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic profit;

	/**
	 * The default value of the '{@link #isIsFocalPoint() <em>Is Focal Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFocalPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOCAL_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFocalPoint() <em>Is Focal Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFocalPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isFocalPoint = IS_FOCAL_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getValueMargin() {
		return valueMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMargin(MeasuredCharacteristic newValueMargin, NotificationChain msgs) {
		MeasuredCharacteristic oldValueMargin = valueMargin;
		valueMargin = newValueMargin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__VALUE_MARGIN, oldValueMargin, newValueMargin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMargin(MeasuredCharacteristic newValueMargin) {
		if (newValueMargin != valueMargin) {
			NotificationChain msgs = null;
			if (valueMargin != null)
				msgs = ((InternalEObject)valueMargin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__VALUE_MARGIN, null, msgs);
			if (newValueMargin != null)
				msgs = ((InternalEObject)newValueMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__VALUE_MARGIN, null, msgs);
			msgs = basicSetValueMargin(newValueMargin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__VALUE_MARGIN, newValueMargin, newValueMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getProfit() {
		return profit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfit(MeasuredCharacteristic newProfit, NotificationChain msgs) {
		MeasuredCharacteristic oldProfit = profit;
		profit = newProfit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__PROFIT, oldProfit, newProfit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfit(MeasuredCharacteristic newProfit) {
		if (newProfit != profit) {
			NotificationChain msgs = null;
			if (profit != null)
				msgs = ((InternalEObject)profit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__PROFIT, null, msgs);
			if (newProfit != null)
				msgs = ((InternalEObject)newProfit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__PROFIT, null, msgs);
			msgs = basicSetProfit(newProfit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__PROFIT, newProfit, newProfit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFocalPoint() {
		return isFocalPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFocalPoint(boolean newIsFocalPoint) {
		boolean oldIsFocalPoint = isFocalPoint;
		isFocalPoint = newIsFocalPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__IS_FOCAL_POINT, oldIsFocalPoint, isFocalPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.PARTY__VALUE_MARGIN:
				return basicSetValueMargin(null, msgs);
			case VdmlPackage.PARTY__PROFIT:
				return basicSetProfit(null, msgs);
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
			case VdmlPackage.PARTY__VALUE_MARGIN:
				return getValueMargin();
			case VdmlPackage.PARTY__PROFIT:
				return getProfit();
			case VdmlPackage.PARTY__IS_FOCAL_POINT:
				return isIsFocalPoint();
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
			case VdmlPackage.PARTY__VALUE_MARGIN:
				setValueMargin((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.PARTY__PROFIT:
				setProfit((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.PARTY__IS_FOCAL_POINT:
				setIsFocalPoint((Boolean)newValue);
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
			case VdmlPackage.PARTY__VALUE_MARGIN:
				setValueMargin((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.PARTY__PROFIT:
				setProfit((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.PARTY__IS_FOCAL_POINT:
				setIsFocalPoint(IS_FOCAL_POINT_EDEFAULT);
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
			case VdmlPackage.PARTY__VALUE_MARGIN:
				return valueMargin != null;
			case VdmlPackage.PARTY__PROFIT:
				return profit != null;
			case VdmlPackage.PARTY__IS_FOCAL_POINT:
				return isFocalPoint != IS_FOCAL_POINT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isFocalPoint: ");
		result.append(isFocalPoint);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
