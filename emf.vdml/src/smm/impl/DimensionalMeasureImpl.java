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

import smm.Base1MeasureRelationship;
import smm.Base2MeasureRelationship;
import smm.BaseMeasureRelationship;
import smm.DimensionalMeasure;
import smm.RankingMeasureRelationship;
import smm.RescaleMeasureRelationship;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getBaseMeasureFrom <em>Base Measure From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getBaseMeasure1From <em>Base Measure1 From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getBaseMeasure2From <em>Base Measure2 From</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link smm.impl.DimensionalMeasureImpl#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionalMeasureImpl extends MeasureImpl implements DimensionalMeasure {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EObject unit;

	/**
	 * The cached value of the '{@link #getBaseMeasureFrom() <em>Base Measure From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasureFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasureRelationship> baseMeasureFrom;

	/**
	 * The cached value of the '{@link #getBaseMeasure1From() <em>Base Measure1 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure1From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base1MeasureRelationship> baseMeasure1From;

	/**
	 * The cached value of the '{@link #getBaseMeasure2From() <em>Base Measure2 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure2From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base2MeasureRelationship> baseMeasure2From;

	/**
	 * The cached value of the '{@link #getRescaleTo() <em>Rescale To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescaleTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RescaleMeasureRelationship> rescaleTo;

	/**
	 * The cached value of the '{@link #getRankingFrom() <em>Ranking From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingMeasureRelationship> rankingFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionalMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.DIMENSIONAL_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(EObject newUnit) {
		EObject oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasureRelationship> getBaseMeasureFrom() {
		if (baseMeasureFrom == null) {
			baseMeasureFrom = new EObjectWithInverseResolvingEList<BaseMeasureRelationship>(BaseMeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM, SmmPackage.BASE_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasureFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base1MeasureRelationship> getBaseMeasure1From() {
		if (baseMeasure1From == null) {
			baseMeasure1From = new EObjectWithInverseResolvingEList<Base1MeasureRelationship>(Base1MeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM, SmmPackage.BASE1_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasure1From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base2MeasureRelationship> getBaseMeasure2From() {
		if (baseMeasure2From == null) {
			baseMeasure2From = new EObjectWithInverseResolvingEList<Base2MeasureRelationship>(Base2MeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM, SmmPackage.BASE2_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasure2From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RescaleMeasureRelationship> getRescaleTo() {
		if (rescaleTo == null) {
			rescaleTo = new EObjectWithInverseResolvingEList<RescaleMeasureRelationship>(RescaleMeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO, SmmPackage.RESCALE_MEASURE_RELATIONSHIP__FROM);
		}
		return rescaleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingMeasureRelationship> getRankingFrom() {
		if (rankingFrom == null) {
			rankingFrom = new EObjectWithInverseResolvingEList<RankingMeasureRelationship>(RankingMeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM, SmmPackage.RANKING_MEASURE_RELATIONSHIP__TO);
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
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasureFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasure1From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasure2From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRescaleTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
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
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return ((InternalEList<?>)getBaseMeasureFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return ((InternalEList<?>)getBaseMeasure1From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return ((InternalEList<?>)getBaseMeasure2From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return ((InternalEList<?>)getRescaleTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return getBaseMeasureFrom();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return getBaseMeasure1From();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return getBaseMeasure2From();
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return getRescaleTo();
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				setUnit((EObject)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				getBaseMeasureFrom().clear();
				getBaseMeasureFrom().addAll((Collection<? extends BaseMeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				getBaseMeasure1From().clear();
				getBaseMeasure1From().addAll((Collection<? extends Base1MeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				getBaseMeasure2From().clear();
				getBaseMeasure2From().addAll((Collection<? extends Base2MeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				getRescaleTo().clear();
				getRescaleTo().addAll((Collection<? extends RescaleMeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				getRankingFrom().clear();
				getRankingFrom().addAll((Collection<? extends RankingMeasureRelationship>)newValue);
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				setUnit((EObject)null);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				getBaseMeasureFrom().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				getBaseMeasure1From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				getBaseMeasure2From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				getRescaleTo().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				return unit != null;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return baseMeasureFrom != null && !baseMeasureFrom.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return baseMeasure1From != null && !baseMeasure1From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return baseMeasure2From != null && !baseMeasure2From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return rescaleTo != null && !rescaleTo.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				return rankingFrom != null && !rankingFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DimensionalMeasureImpl
