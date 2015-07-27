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
import org.eclipse.emf.ecore.util.InternalEList;

import smm.Argument;
import smm.Observation;
import smm.ObservationScope;
import smm.ObservedMeasure;
import smm.SmmElement;
import smm.SmmPackage;
import smm.SmmRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.ObservationImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getObservedMeasures <em>Observed Measures</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getRequestedMeasures <em>Requested Measures</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getMeasurementRelations <em>Measurement Relations</em>}</li>
 *   <li>{@link smm.impl.ObservationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends SmmElementImpl implements Observation {
	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected EObject observer;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected EObject tool;

	/**
	 * The cached value of the '{@link #getWhenObserved() <em>When Observed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected EObject whenObserved;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationScope> scopes;

	/**
	 * The cached value of the '{@link #getObservedMeasures() <em>Observed Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservedMeasure> observedMeasures;

	/**
	 * The cached value of the '{@link #getRequestedMeasures() <em>Requested Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<SmmElement> requestedMeasures;

	/**
	 * The cached value of the '{@link #getMeasurementRelations() <em>Measurement Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SmmRelationship> measurementRelations;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObserver() {
		if (observer != null && observer.eIsProxy()) {
			InternalEObject oldObserver = (InternalEObject)observer;
			observer = eResolveProxy(oldObserver);
			if (observer != oldObserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.OBSERVATION__OBSERVER, oldObserver, observer));
			}
		}
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(EObject newObserver) {
		EObject oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__OBSERVER, oldObserver, observer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.OBSERVATION__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(EObject newTool) {
		EObject oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWhenObserved() {
		if (whenObserved != null && whenObserved.eIsProxy()) {
			InternalEObject oldWhenObserved = (InternalEObject)whenObserved;
			whenObserved = eResolveProxy(oldWhenObserved);
			if (whenObserved != oldWhenObserved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, whenObserved));
			}
		}
		return whenObserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetWhenObserved() {
		return whenObserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenObserved(EObject newWhenObserved) {
		EObject oldWhenObserved = whenObserved;
		whenObserved = newWhenObserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, whenObserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationScope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<ObservationScope>(ObservationScope.class, this, SmmPackage.OBSERVATION__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservedMeasure> getObservedMeasures() {
		if (observedMeasures == null) {
			observedMeasures = new EObjectContainmentEList<ObservedMeasure>(ObservedMeasure.class, this, SmmPackage.OBSERVATION__OBSERVED_MEASURES);
		}
		return observedMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmElement> getRequestedMeasures() {
		if (requestedMeasures == null) {
			requestedMeasures = new EObjectResolvingEList<SmmElement>(SmmElement.class, this, SmmPackage.OBSERVATION__REQUESTED_MEASURES);
		}
		return requestedMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmRelationship> getMeasurementRelations() {
		if (measurementRelations == null) {
			measurementRelations = new EObjectContainmentEList<SmmRelationship>(SmmRelationship.class, this, SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS);
		}
		return measurementRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, SmmPackage.OBSERVATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.OBSERVATION__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return ((InternalEList<?>)getObservedMeasures()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return ((InternalEList<?>)getMeasurementRelations()).basicRemove(otherEnd, msgs);
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				if (resolve) return getObserver();
				return basicGetObserver();
			case SmmPackage.OBSERVATION__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				if (resolve) return getWhenObserved();
				return basicGetWhenObserved();
			case SmmPackage.OBSERVATION__SCOPES:
				return getScopes();
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return getObservedMeasures();
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return getRequestedMeasures();
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return getMeasurementRelations();
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return getArguments();
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver((EObject)newValue);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool((EObject)newValue);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved((EObject)newValue);
				return;
			case SmmPackage.OBSERVATION__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends ObservationScope>)newValue);
				return;
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				getObservedMeasures().clear();
				getObservedMeasures().addAll((Collection<? extends ObservedMeasure>)newValue);
				return;
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				getRequestedMeasures().clear();
				getRequestedMeasures().addAll((Collection<? extends SmmElement>)newValue);
				return;
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				getMeasurementRelations().clear();
				getMeasurementRelations().addAll((Collection<? extends SmmRelationship>)newValue);
				return;
			case SmmPackage.OBSERVATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver((EObject)null);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool((EObject)null);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved((EObject)null);
				return;
			case SmmPackage.OBSERVATION__SCOPES:
				getScopes().clear();
				return;
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				getObservedMeasures().clear();
				return;
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				getRequestedMeasures().clear();
				return;
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				getMeasurementRelations().clear();
				return;
			case SmmPackage.OBSERVATION__ARGUMENTS:
				getArguments().clear();
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
			case SmmPackage.OBSERVATION__OBSERVER:
				return observer != null;
			case SmmPackage.OBSERVATION__TOOL:
				return tool != null;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				return whenObserved != null;
			case SmmPackage.OBSERVATION__SCOPES:
				return scopes != null && !scopes.isEmpty();
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
				return observedMeasures != null && !observedMeasures.isEmpty();
			case SmmPackage.OBSERVATION__REQUESTED_MEASURES:
				return requestedMeasures != null && !requestedMeasures.isEmpty();
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
				return measurementRelations != null && !measurementRelations.isEmpty();
			case SmmPackage.OBSERVATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationImpl
