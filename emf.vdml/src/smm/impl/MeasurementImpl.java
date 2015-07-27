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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smm.EquivalentMeasurementRelationship;
import smm.Measurement;
import smm.MeasurementRelationship;
import smm.RecursiveMeasurementRelationship;
import smm.RefinementMeasurementRelationship;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.MeasurementImpl#getError <em>Error</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getInbound <em>Inbound</em>}</li>
 *   <li>{@link smm.impl.MeasurementImpl#getOutbound <em>Outbound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends SmmElementImpl implements Measurement {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EObject error;

	/**
	 * The cached value of the '{@link #getMeasurand() <em>Measurand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurand()
	 * @generated
	 * @ordered
	 */
	protected EObject measurand;

	/**
	 * The cached value of the '{@link #getBreakValue() <em>Break Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakValue()
	 * @generated
	 * @ordered
	 */
	protected EObject breakValue;

	/**
	 * The cached value of the '{@link #getRefinementTo() <em>Refinement To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasurementRelationship> refinementTo;

	/**
	 * The cached value of the '{@link #getRefinementFrom() <em>Refinement From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasurementRelationship> refinementFrom;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasurementRelationship> equivalentTo;

	/**
	 * The cached value of the '{@link #getEquivalentFrom() <em>Equivalent From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasurementRelationship> equivalentFrom;

	/**
	 * The cached value of the '{@link #getRecursiveTo() <em>Recursive To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursiveTo()
	 * @generated
	 * @ordered
	 */
	protected EObject recursiveTo;

	/**
	 * The cached value of the '{@link #getRecursiveFrom() <em>Recursive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursiveFrom()
	 * @generated
	 * @ordered
	 */
	protected EObject recursiveFrom;

	/**
	 * The cached value of the '{@link #getMeasurementRelationships() <em>Measurement Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> measurementRelationships;

	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> inbound;

	/**
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> outbound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(EObject newError) {
		EObject oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMeasurand() {
		if (measurand != null && measurand.eIsProxy()) {
			InternalEObject oldMeasurand = (InternalEObject)measurand;
			measurand = eResolveProxy(oldMeasurand);
			if (measurand != oldMeasurand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
			}
		}
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMeasurand() {
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurand(EObject newMeasurand) {
		EObject oldMeasurand = measurand;
		measurand = newMeasurand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__MEASURAND, oldMeasurand, measurand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBreakValue() {
		if (breakValue != null && breakValue.eIsProxy()) {
			InternalEObject oldBreakValue = (InternalEObject)breakValue;
			breakValue = eResolveProxy(oldBreakValue);
			if (breakValue != oldBreakValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__BREAK_VALUE, oldBreakValue, breakValue));
			}
		}
		return breakValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBreakValue() {
		return breakValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakValue(EObject newBreakValue) {
		EObject oldBreakValue = breakValue;
		breakValue = newBreakValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__BREAK_VALUE, oldBreakValue, breakValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasurementRelationship> getRefinementTo() {
		if (refinementTo == null) {
			refinementTo = new EObjectWithInverseResolvingEList<RefinementMeasurementRelationship>(RefinementMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__REFINEMENT_TO, SmmPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return refinementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasurementRelationship> getRefinementFrom() {
		if (refinementFrom == null) {
			refinementFrom = new EObjectWithInverseResolvingEList<RefinementMeasurementRelationship>(RefinementMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__REFINEMENT_FROM, SmmPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP__TO);
		}
		return refinementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasurementRelationship> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectWithInverseResolvingEList<EquivalentMeasurementRelationship>(EquivalentMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__EQUIVALENT_TO, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasurementRelationship> getEquivalentFrom() {
		if (equivalentFrom == null) {
			equivalentFrom = new EObjectWithInverseResolvingEList<EquivalentMeasurementRelationship>(EquivalentMeasurementRelationship.class, this, SmmPackage.MEASUREMENT__EQUIVALENT_FROM, SmmPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO);
		}
		return equivalentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRecursiveTo() {
		if (recursiveTo != null && recursiveTo.eIsProxy()) {
			InternalEObject oldRecursiveTo = (InternalEObject)recursiveTo;
			recursiveTo = eResolveProxy(oldRecursiveTo);
			if (recursiveTo != oldRecursiveTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__RECURSIVE_TO, oldRecursiveTo, recursiveTo));
			}
		}
		return recursiveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRecursiveTo() {
		return recursiveTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursiveTo(EObject newRecursiveTo, NotificationChain msgs) {
		EObject oldRecursiveTo = recursiveTo;
		recursiveTo = newRecursiveTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__RECURSIVE_TO, oldRecursiveTo, newRecursiveTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursiveTo(EObject newRecursiveTo) {
		if (newRecursiveTo != recursiveTo) {
			NotificationChain msgs = null;
			if (recursiveTo != null)
				msgs = ((InternalEObject)recursiveTo).eInverseRemove(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
			if (newRecursiveTo != null)
				msgs = ((InternalEObject)newRecursiveTo).eInverseAdd(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
			msgs = basicSetRecursiveTo(newRecursiveTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__RECURSIVE_TO, newRecursiveTo, newRecursiveTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRecursiveFrom() {
		if (recursiveFrom != null && recursiveFrom.eIsProxy()) {
			InternalEObject oldRecursiveFrom = (InternalEObject)recursiveFrom;
			recursiveFrom = eResolveProxy(oldRecursiveFrom);
			if (recursiveFrom != oldRecursiveFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASUREMENT__RECURSIVE_FROM, oldRecursiveFrom, recursiveFrom));
			}
		}
		return recursiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRecursiveFrom() {
		return recursiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursiveFrom(EObject newRecursiveFrom) {
		EObject oldRecursiveFrom = recursiveFrom;
		recursiveFrom = newRecursiveFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__RECURSIVE_FROM, oldRecursiveFrom, recursiveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getMeasurementRelationships() {
		if (measurementRelationships == null) {
			measurementRelationships = new EObjectContainmentEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS);
		}
		return measurementRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getInbound() {
		if (inbound == null) {
			inbound = new EObjectResolvingEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__INBOUND);
		}
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getOutbound() {
		if (outbound == null) {
			outbound = new EObjectResolvingEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__OUTBOUND);
		}
		return outbound;
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
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				if (recursiveTo != null)
					msgs = ((InternalEObject)recursiveTo).eInverseRemove(this, SmmPackage.RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM, RecursiveMeasurementRelationship.class, msgs);
				return basicSetRecursiveTo((EObject)otherEnd, msgs);
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
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return ((InternalEList<?>)getRefinementTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return ((InternalEList<?>)getRefinementFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return ((InternalEList<?>)getEquivalentTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return ((InternalEList<?>)getEquivalentFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				return basicSetRecursiveTo(null, msgs);
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return ((InternalEList<?>)getMeasurementRelationships()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.MEASUREMENT__ERROR:
				if (resolve) return getError();
				return basicGetError();
			case SmmPackage.MEASUREMENT__MEASURAND:
				if (resolve) return getMeasurand();
				return basicGetMeasurand();
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				if (resolve) return getBreakValue();
				return basicGetBreakValue();
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return getRefinementTo();
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return getRefinementFrom();
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return getEquivalentTo();
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return getEquivalentFrom();
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				if (resolve) return getRecursiveTo();
				return basicGetRecursiveTo();
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				if (resolve) return getRecursiveFrom();
				return basicGetRecursiveFrom();
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return getMeasurementRelationships();
			case SmmPackage.MEASUREMENT__INBOUND:
				return getInbound();
			case SmmPackage.MEASUREMENT__OUTBOUND:
				return getOutbound();
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
			case SmmPackage.MEASUREMENT__ERROR:
				setError((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__MEASURAND:
				setMeasurand((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				setBreakValue((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				getRefinementTo().clear();
				getRefinementTo().addAll((Collection<? extends RefinementMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				getRefinementFrom().clear();
				getRefinementFrom().addAll((Collection<? extends RefinementMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends EquivalentMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				getEquivalentFrom().addAll((Collection<? extends EquivalentMeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				setRecursiveTo((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				setRecursiveFrom((EObject)newValue);
				return;
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				getMeasurementRelationships().clear();
				getMeasurementRelationships().addAll((Collection<? extends MeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__INBOUND:
				getInbound().clear();
				getInbound().addAll((Collection<? extends MeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__OUTBOUND:
				getOutbound().clear();
				getOutbound().addAll((Collection<? extends MeasurementRelationship>)newValue);
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
			case SmmPackage.MEASUREMENT__ERROR:
				setError((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__MEASURAND:
				setMeasurand((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				setBreakValue((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				getRefinementTo().clear();
				return;
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				getRefinementFrom().clear();
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				setRecursiveTo((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				setRecursiveFrom((EObject)null);
				return;
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				getMeasurementRelationships().clear();
				return;
			case SmmPackage.MEASUREMENT__INBOUND:
				getInbound().clear();
				return;
			case SmmPackage.MEASUREMENT__OUTBOUND:
				getOutbound().clear();
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
			case SmmPackage.MEASUREMENT__ERROR:
				return error != null;
			case SmmPackage.MEASUREMENT__MEASURAND:
				return measurand != null;
			case SmmPackage.MEASUREMENT__BREAK_VALUE:
				return breakValue != null;
			case SmmPackage.MEASUREMENT__REFINEMENT_TO:
				return refinementTo != null && !refinementTo.isEmpty();
			case SmmPackage.MEASUREMENT__REFINEMENT_FROM:
				return refinementFrom != null && !refinementFrom.isEmpty();
			case SmmPackage.MEASUREMENT__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case SmmPackage.MEASUREMENT__EQUIVALENT_FROM:
				return equivalentFrom != null && !equivalentFrom.isEmpty();
			case SmmPackage.MEASUREMENT__RECURSIVE_TO:
				return recursiveTo != null;
			case SmmPackage.MEASUREMENT__RECURSIVE_FROM:
				return recursiveFrom != null;
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
				return measurementRelationships != null && !measurementRelationships.isEmpty();
			case SmmPackage.MEASUREMENT__INBOUND:
				return inbound != null && !inbound.isEmpty();
			case SmmPackage.MEASUREMENT__OUTBOUND:
				return outbound != null && !outbound.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
