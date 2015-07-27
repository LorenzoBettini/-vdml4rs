/**
 */
package smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smm.Base1MeasurementRelationship;
import smm.Base2MeasurementRelationship;
import smm.BaseMeasurementRelationship;
import smm.DimensionalMeasurement;
import smm.RankingMeasurementRelationship;
import smm.RescaleMeasurementRelationship;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getBaseMeasurementFrom <em>Base Measurement From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getBaseMeasurement1From <em>Base Measurement1 From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getBaseMeasurement2From <em>Base Measurement2 From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasurementImpl#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DimensionalMeasurementImpl extends MeasurementImpl implements DimensionalMeasurement {
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
	 * The cached value of the '{@link #getBaseMeasurementFrom() <em>Base Measurement From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurementFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasurementRelationship> baseMeasurementFrom;

	/**
	 * The cached value of the '{@link #getBaseMeasurement1From() <em>Base Measurement1 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement1From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base1MeasurementRelationship> baseMeasurement1From;

	/**
	 * The cached value of the '{@link #getBaseMeasurement2From() <em>Base Measurement2 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement2From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base2MeasurementRelationship> baseMeasurement2From;

	/**
	 * The cached value of the '{@link #getRescaleTo() <em>Rescale To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescaleTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RescaleMeasurementRelationship> rescaleTo;

	/**
	 * The cached value of the '{@link #getRankingFrom() <em>Ranking From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingMeasurementRelationship> rankingFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionalMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.DIMENSIONAL_MEASUREMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasurementRelationship> getBaseMeasurementFrom() {
		if (baseMeasurementFrom == null) {
			baseMeasurementFrom = new EObjectWithInverseResolvingEList<BaseMeasurementRelationship>(BaseMeasurementRelationship.class, this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO);
		}
		return baseMeasurementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base1MeasurementRelationship> getBaseMeasurement1From() {
		if (baseMeasurement1From == null) {
			baseMeasurement1From = new EObjectWithInverseResolvingEList<Base1MeasurementRelationship>(Base1MeasurementRelationship.class, this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM, SmmPackage.BASE1_MEASUREMENT_RELATIONSHIP__TO);
		}
		return baseMeasurement1From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base2MeasurementRelationship> getBaseMeasurement2From() {
		if (baseMeasurement2From == null) {
			baseMeasurement2From = new EObjectWithInverseResolvingEList<Base2MeasurementRelationship>(Base2MeasurementRelationship.class, this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM, SmmPackage.BASE2_MEASUREMENT_RELATIONSHIP__TO);
		}
		return baseMeasurement2From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RescaleMeasurementRelationship> getRescaleTo() {
		if (rescaleTo == null) {
			rescaleTo = new EObjectWithInverseResolvingEList<RescaleMeasurementRelationship>(RescaleMeasurementRelationship.class, this, SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO, SmmPackage.RESCALE_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return rescaleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingMeasurementRelationship> getRankingFrom() {
		if (rankingFrom == null) {
			rankingFrom = new EObjectWithInverseResolvingEList<RankingMeasurementRelationship>(RankingMeasurementRelationship.class, this, SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM, SmmPackage.RANKING_MEASUREMENT_RELATIONSHIP__TO);
		}
		return rankingFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasurementFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasurement1From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasurement2From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRescaleTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRankingFrom()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				return ((InternalEList<?>)getBaseMeasurementFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				return ((InternalEList<?>)getBaseMeasurement1From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				return ((InternalEList<?>)getBaseMeasurement2From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				return ((InternalEList<?>)getRescaleTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				return ((InternalEList<?>)getRankingFrom()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				return getBaseMeasurementFrom();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				return getBaseMeasurement1From();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				return getBaseMeasurement2From();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				return getRescaleTo();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				return getRankingFrom();
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
			case SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE:
				setValue((EObject)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				getBaseMeasurementFrom().clear();
				getBaseMeasurementFrom().addAll((Collection<? extends BaseMeasurementRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				getBaseMeasurement1From().clear();
				getBaseMeasurement1From().addAll((Collection<? extends Base1MeasurementRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				getBaseMeasurement2From().clear();
				getBaseMeasurement2From().addAll((Collection<? extends Base2MeasurementRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				getRescaleTo().clear();
				getRescaleTo().addAll((Collection<? extends RescaleMeasurementRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				getRankingFrom().clear();
				getRankingFrom().addAll((Collection<? extends RankingMeasurementRelationship>)newValue);
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
			case SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE:
				setValue((EObject)null);
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				getBaseMeasurementFrom().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				getBaseMeasurement1From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				getBaseMeasurement2From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				getRescaleTo().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				getRankingFrom().clear();
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
			case SmmPackage.DIMENSIONAL_MEASUREMENT__VALUE:
				return value != null;
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM:
				return baseMeasurementFrom != null && !baseMeasurementFrom.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM:
				return baseMeasurement1From != null && !baseMeasurement1From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM:
				return baseMeasurement2From != null && !baseMeasurement2From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RESCALE_TO:
				return rescaleTo != null && !rescaleTo.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASUREMENT__RANKING_FROM:
				return rankingFrom != null && !rankingFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionalMeasurementImpl
