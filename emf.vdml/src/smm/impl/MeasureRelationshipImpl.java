/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.MeasureRelationship;
import smm.Operation;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.MeasureRelationshipImpl#getMeasurandQuery <em>Measurand Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureRelationshipImpl extends SmmRelationshipImpl implements MeasureRelationship {
	/**
	 * The cached value of the '{@link #getMeasurandQuery() <em>Measurand Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurandQuery()
	 * @generated
	 * @ordered
	 */
	protected Operation measurandQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASURE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMeasurandQuery() {
		if (measurandQuery != null && measurandQuery.eIsProxy()) {
			InternalEObject oldMeasurandQuery = (InternalEObject)measurandQuery;
			measurandQuery = (Operation)eResolveProxy(oldMeasurandQuery);
			if (measurandQuery != oldMeasurandQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY, oldMeasurandQuery, measurandQuery));
			}
		}
		return measurandQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMeasurandQuery() {
		return measurandQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurandQuery(Operation newMeasurandQuery) {
		Operation oldMeasurandQuery = measurandQuery;
		measurandQuery = newMeasurandQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY, oldMeasurandQuery, measurandQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY:
				if (resolve) return getMeasurandQuery();
				return basicGetMeasurandQuery();
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
			case SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY:
				setMeasurandQuery((Operation)newValue);
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
			case SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY:
				setMeasurandQuery((Operation)null);
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
			case SmmPackage.MEASURE_RELATIONSHIP__MEASURAND_QUERY:
				return measurandQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureRelationshipImpl
