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

import smm.RescaleMeasureRelationship;
import smm.RescaledMeasure;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.RescaledMeasureImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link smm.impl.RescaledMeasureImpl#getRescaleFrom <em>Rescale From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescaledMeasureImpl extends DimensionalMeasureImpl implements RescaledMeasure {
	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected EObject formula;

	/**
	 * The cached value of the '{@link #getRescaleFrom() <em>Rescale From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescaleFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RescaleMeasureRelationship> rescaleFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RescaledMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RESCALED_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFormula() {
		if (formula != null && formula.eIsProxy()) {
			InternalEObject oldFormula = (InternalEObject)formula;
			formula = eResolveProxy(oldFormula);
			if (formula != oldFormula) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RESCALED_MEASURE__FORMULA, oldFormula, formula));
			}
		}
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(EObject newFormula) {
		EObject oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RESCALED_MEASURE__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RescaleMeasureRelationship> getRescaleFrom() {
		if (rescaleFrom == null) {
			rescaleFrom = new EObjectWithInverseResolvingEList<RescaleMeasureRelationship>(RescaleMeasureRelationship.class, this, SmmPackage.RESCALED_MEASURE__RESCALE_FROM, SmmPackage.RESCALE_MEASURE_RELATIONSHIP__TO);
		}
		return rescaleFrom;
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
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRescaleFrom()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				return ((InternalEList<?>)getRescaleFrom()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.RESCALED_MEASURE__FORMULA:
				if (resolve) return getFormula();
				return basicGetFormula();
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				return getRescaleFrom();
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
			case SmmPackage.RESCALED_MEASURE__FORMULA:
				setFormula((EObject)newValue);
				return;
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				getRescaleFrom().clear();
				getRescaleFrom().addAll((Collection<? extends RescaleMeasureRelationship>)newValue);
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
			case SmmPackage.RESCALED_MEASURE__FORMULA:
				setFormula((EObject)null);
				return;
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				getRescaleFrom().clear();
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
			case SmmPackage.RESCALED_MEASURE__FORMULA:
				return formula != null;
			case SmmPackage.RESCALED_MEASURE__RESCALE_FROM:
				return rescaleFrom != null && !rescaleFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RescaledMeasureImpl
