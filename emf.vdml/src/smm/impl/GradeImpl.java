/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.Grade;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.GradeImpl#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link smm.impl.GradeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link smm.impl.GradeImpl#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeImpl extends MeasurementImpl implements Grade {
	/**
	 * The cached value of the '{@link #getIsBaseSupplied() <em>Is Base Supplied</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBaseSupplied()
	 * @generated
	 * @ordered
	 */
	protected EObject isBaseSupplied;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EObject value;

	/**
	 * The cached value of the '{@link #getRankingTo() <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingTo()
	 * @generated
	 * @ordered
	 */
	protected EObject rankingTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.GRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getIsBaseSupplied() {
		if (isBaseSupplied != null && isBaseSupplied.eIsProxy()) {
			InternalEObject oldIsBaseSupplied = (InternalEObject)isBaseSupplied;
			isBaseSupplied = eResolveProxy(oldIsBaseSupplied);
			if (isBaseSupplied != oldIsBaseSupplied) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.GRADE__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
			}
		}
		return isBaseSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetIsBaseSupplied() {
		return isBaseSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBaseSupplied(EObject newIsBaseSupplied) {
		EObject oldIsBaseSupplied = isBaseSupplied;
		isBaseSupplied = newIsBaseSupplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.GRADE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRankingTo() {
		if (rankingTo != null && rankingTo.eIsProxy()) {
			InternalEObject oldRankingTo = (InternalEObject)rankingTo;
			rankingTo = eResolveProxy(oldRankingTo);
			if (rankingTo != oldRankingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.GRADE__RANKING_TO, oldRankingTo, rankingTo));
			}
		}
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRankingTo() {
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankingTo(EObject newRankingTo) {
		EObject oldRankingTo = rankingTo;
		rankingTo = newRankingTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__RANKING_TO, oldRankingTo, rankingTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				if (resolve) return getIsBaseSupplied();
				return basicGetIsBaseSupplied();
			case SmmPackage.GRADE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case SmmPackage.GRADE__RANKING_TO:
				if (resolve) return getRankingTo();
				return basicGetRankingTo();
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
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				setIsBaseSupplied((EObject)newValue);
				return;
			case SmmPackage.GRADE__VALUE:
				setValue((EObject)newValue);
				return;
			case SmmPackage.GRADE__RANKING_TO:
				setRankingTo((EObject)newValue);
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
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				setIsBaseSupplied((EObject)null);
				return;
			case SmmPackage.GRADE__VALUE:
				setValue((EObject)null);
				return;
			case SmmPackage.GRADE__RANKING_TO:
				setRankingTo((EObject)null);
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
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				return isBaseSupplied != null;
			case SmmPackage.GRADE__VALUE:
				return value != null;
			case SmmPackage.GRADE__RANKING_TO:
				return rankingTo != null;
		}
		return super.eIsSet(featureID);
	}

} //GradeImpl
