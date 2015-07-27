/**
 */
package vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vdml.MeasuredCharacteristic;
import vdml.ValueAdd;
import vdml.ValueDefinition;
import vdml.ValuePropositionComponent;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.ValueAddImpl#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link vdml.impl.ValueAddImpl#getPropositionComponent <em>Proposition Component</em>}</li>
 *   <li>{@link vdml.impl.ValueAddImpl#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link vdml.impl.ValueAddImpl#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link vdml.impl.ValueAddImpl#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link vdml.impl.ValueAddImpl#getAggregatedTo <em>Aggregated To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueAddImpl extends MeasurableElementImpl implements ValueAdd {
	/**
	 * The cached value of the '{@link #getValueMeasurement() <em>Value Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMeasurement()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic valueMeasurement;

	/**
	 * The cached value of the '{@link #getPropositionComponent() <em>Proposition Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropositionComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuePropositionComponent> propositionComponent;

	/**
	 * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDefinition()
	 * @generated
	 * @ordered
	 */
	protected ValueDefinition valueDefinition;

	/**
	 * The cached value of the '{@link #getBenchmark() <em>Benchmark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenchmark()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasuredCharacteristic> benchmark;

	/**
	 * The cached value of the '{@link #getAggregatedFrom() <em>Aggregated From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueAdd> aggregatedFrom;

	/**
	 * The cached value of the '{@link #getAggregatedTo() <em>Aggregated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueAdd> aggregatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueAddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.VALUE_ADD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getValueMeasurement() {
		return valueMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMeasurement(MeasuredCharacteristic newValueMeasurement, NotificationChain msgs) {
		MeasuredCharacteristic oldValueMeasurement = valueMeasurement;
		valueMeasurement = newValueMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT, oldValueMeasurement, newValueMeasurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMeasurement(MeasuredCharacteristic newValueMeasurement) {
		if (newValueMeasurement != valueMeasurement) {
			NotificationChain msgs = null;
			if (valueMeasurement != null)
				msgs = ((InternalEObject)valueMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT, null, msgs);
			if (newValueMeasurement != null)
				msgs = ((InternalEObject)newValueMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT, null, msgs);
			msgs = basicSetValueMeasurement(newValueMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT, newValueMeasurement, newValueMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuePropositionComponent> getPropositionComponent() {
		if (propositionComponent == null) {
			propositionComponent = new EObjectWithInverseResolvingEList<ValuePropositionComponent>(ValuePropositionComponent.class, this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE);
		}
		return propositionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDefinition getValueDefinition() {
		if (valueDefinition != null && valueDefinition.eIsProxy()) {
			InternalEObject oldValueDefinition = (InternalEObject)valueDefinition;
			valueDefinition = (ValueDefinition)eResolveProxy(oldValueDefinition);
			if (valueDefinition != oldValueDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.VALUE_ADD__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
			}
		}
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDefinition basicGetValueDefinition() {
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDefinition(ValueDefinition newValueDefinition) {
		ValueDefinition oldValueDefinition = valueDefinition;
		valueDefinition = newValueDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ADD__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasuredCharacteristic> getBenchmark() {
		if (benchmark == null) {
			benchmark = new EObjectContainmentEList<MeasuredCharacteristic>(MeasuredCharacteristic.class, this, VdmlPackage.VALUE_ADD__BENCHMARK);
		}
		return benchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueAdd> getAggregatedFrom() {
		if (aggregatedFrom == null) {
			aggregatedFrom = new EObjectWithInverseResolvingEList.ManyInverse<ValueAdd>(ValueAdd.class, this, VdmlPackage.VALUE_ADD__AGGREGATED_FROM, VdmlPackage.VALUE_ADD__AGGREGATED_TO);
		}
		return aggregatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueAdd> getAggregatedTo() {
		if (aggregatedTo == null) {
			aggregatedTo = new EObjectWithInverseResolvingEList.ManyInverse<ValueAdd>(ValueAdd.class, this, VdmlPackage.VALUE_ADD__AGGREGATED_TO, VdmlPackage.VALUE_ADD__AGGREGATED_FROM);
		}
		return aggregatedTo;
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
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropositionComponent()).basicAdd(otherEnd, msgs);
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedFrom()).basicAdd(otherEnd, msgs);
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedTo()).basicAdd(otherEnd, msgs);
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
			case VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT:
				return basicSetValueMeasurement(null, msgs);
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				return ((InternalEList<?>)getPropositionComponent()).basicRemove(otherEnd, msgs);
			case VdmlPackage.VALUE_ADD__BENCHMARK:
				return ((InternalEList<?>)getBenchmark()).basicRemove(otherEnd, msgs);
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				return ((InternalEList<?>)getAggregatedFrom()).basicRemove(otherEnd, msgs);
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				return ((InternalEList<?>)getAggregatedTo()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT:
				return getValueMeasurement();
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				return getPropositionComponent();
			case VdmlPackage.VALUE_ADD__VALUE_DEFINITION:
				if (resolve) return getValueDefinition();
				return basicGetValueDefinition();
			case VdmlPackage.VALUE_ADD__BENCHMARK:
				return getBenchmark();
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				return getAggregatedFrom();
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				return getAggregatedTo();
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
			case VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT:
				setValueMeasurement((MeasuredCharacteristic)newValue);
				return;
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				getPropositionComponent().clear();
				getPropositionComponent().addAll((Collection<? extends ValuePropositionComponent>)newValue);
				return;
			case VdmlPackage.VALUE_ADD__VALUE_DEFINITION:
				setValueDefinition((ValueDefinition)newValue);
				return;
			case VdmlPackage.VALUE_ADD__BENCHMARK:
				getBenchmark().clear();
				getBenchmark().addAll((Collection<? extends MeasuredCharacteristic>)newValue);
				return;
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				getAggregatedFrom().clear();
				getAggregatedFrom().addAll((Collection<? extends ValueAdd>)newValue);
				return;
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				getAggregatedTo().clear();
				getAggregatedTo().addAll((Collection<? extends ValueAdd>)newValue);
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
			case VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT:
				setValueMeasurement((MeasuredCharacteristic)null);
				return;
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				getPropositionComponent().clear();
				return;
			case VdmlPackage.VALUE_ADD__VALUE_DEFINITION:
				setValueDefinition((ValueDefinition)null);
				return;
			case VdmlPackage.VALUE_ADD__BENCHMARK:
				getBenchmark().clear();
				return;
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				getAggregatedFrom().clear();
				return;
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				getAggregatedTo().clear();
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
			case VdmlPackage.VALUE_ADD__VALUE_MEASUREMENT:
				return valueMeasurement != null;
			case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
				return propositionComponent != null && !propositionComponent.isEmpty();
			case VdmlPackage.VALUE_ADD__VALUE_DEFINITION:
				return valueDefinition != null;
			case VdmlPackage.VALUE_ADD__BENCHMARK:
				return benchmark != null && !benchmark.isEmpty();
			case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
				return aggregatedFrom != null && !aggregatedFrom.isEmpty();
			case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
				return aggregatedTo != null && !aggregatedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueAddImpl
