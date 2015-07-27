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

import smm.EquivalentMeasureRelationship;
import smm.Measure;
import smm.MeasureCategory;
import smm.MeasureRelationship;
import smm.RefinementMeasureRelationship;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.MeasureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getTrait <em>Trait</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getMeasureLabelFormat <em>Measure Label Format</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getMeasurementLabelFormat <em>Measurement Label Format</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getMeasureRelationships <em>Measure Relationships</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getDefaultQuery <em>Default Query</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getInbound <em>Inbound</em>}</li>
 *   <li>{@link smm.impl.MeasureImpl#getOutbound <em>Outbound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureImpl extends AbstractMeasureElementImpl implements Measure {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureCategory> category;

	/**
	 * The cached value of the '{@link #getTrait() <em>Trait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrait()
	 * @generated
	 * @ordered
	 */
	protected EObject trait;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EObject scope;

	/**
	 * The default value of the '{@link #getMeasureLabelFormat() <em>Measure Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureLabelFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Object MEASURE_LABEL_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureLabelFormat() <em>Measure Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureLabelFormat()
	 * @generated
	 * @ordered
	 */
	protected Object measureLabelFormat = MEASURE_LABEL_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefinementTo() <em>Refinement To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasureRelationship> refinementTo;

	/**
	 * The cached value of the '{@link #getRefinementFrom() <em>Refinement From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementMeasureRelationship> refinementFrom;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasureRelationship> equivalentTo;

	/**
	 * The cached value of the '{@link #getEquivalentFrom() <em>Equivalent From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentMeasureRelationship> equivalentFrom;

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
	 * The default value of the '{@link #getMeasurementLabelFormat() <em>Measurement Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementLabelFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Object MEASUREMENT_LABEL_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurementLabelFormat() <em>Measurement Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementLabelFormat()
	 * @generated
	 * @ordered
	 */
	protected Object measurementLabelFormat = MEASUREMENT_LABEL_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected EObject visible;

	/**
	 * The cached value of the '{@link #getMeasureRelationships() <em>Measure Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRelationship> measureRelationships;

	/**
	 * The cached value of the '{@link #getDefaultQuery() <em>Default Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuery()
	 * @generated
	 * @ordered
	 */
	protected EObject defaultQuery;

	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRelationship> inbound;

	/**
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRelationship> outbound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureCategory> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<MeasureCategory>(MeasureCategory.class, this, SmmPackage.MEASURE__CATEGORY, SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTrait() {
		if (trait != null && trait.eIsProxy()) {
			InternalEObject oldTrait = (InternalEObject)trait;
			trait = eResolveProxy(oldTrait);
			if (trait != oldTrait) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__TRAIT, oldTrait, trait));
			}
		}
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTrait() {
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrait(EObject newTrait) {
		EObject oldTrait = trait;
		trait = newTrait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__TRAIT, oldTrait, trait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getScope() {
		if (scope != null && scope.eIsProxy()) {
			InternalEObject oldScope = (InternalEObject)scope;
			scope = eResolveProxy(oldScope);
			if (scope != oldScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__SCOPE, oldScope, scope));
			}
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(EObject newScope) {
		EObject oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMeasureLabelFormat() {
		return measureLabelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureLabelFormat(Object newMeasureLabelFormat) {
		Object oldMeasureLabelFormat = measureLabelFormat;
		measureLabelFormat = newMeasureLabelFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__MEASURE_LABEL_FORMAT, oldMeasureLabelFormat, measureLabelFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasureRelationship> getRefinementTo() {
		if (refinementTo == null) {
			refinementTo = new EObjectWithInverseResolvingEList<RefinementMeasureRelationship>(RefinementMeasureRelationship.class, this, SmmPackage.MEASURE__REFINEMENT_TO, SmmPackage.REFINEMENT_MEASURE_RELATIONSHIP__FROM);
		}
		return refinementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementMeasureRelationship> getRefinementFrom() {
		if (refinementFrom == null) {
			refinementFrom = new EObjectWithInverseResolvingEList<RefinementMeasureRelationship>(RefinementMeasureRelationship.class, this, SmmPackage.MEASURE__REFINEMENT_FROM, SmmPackage.REFINEMENT_MEASURE_RELATIONSHIP__TO);
		}
		return refinementFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasureRelationship> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectWithInverseResolvingEList<EquivalentMeasureRelationship>(EquivalentMeasureRelationship.class, this, SmmPackage.MEASURE__EQUIVALENT_TO, SmmPackage.EQUIVALENT_MEASURE_RELATIONSHIP__FROM);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquivalentMeasureRelationship> getEquivalentFrom() {
		if (equivalentFrom == null) {
			equivalentFrom = new EObjectWithInverseResolvingEList<EquivalentMeasureRelationship>(EquivalentMeasureRelationship.class, this, SmmPackage.MEASURE__EQUIVALENT_FROM, SmmPackage.EQUIVALENT_MEASURE_RELATIONSHIP__TO);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__RECURSIVE_TO, oldRecursiveTo, recursiveTo));
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
	public void setRecursiveTo(EObject newRecursiveTo) {
		EObject oldRecursiveTo = recursiveTo;
		recursiveTo = newRecursiveTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__RECURSIVE_TO, oldRecursiveTo, recursiveTo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__RECURSIVE_FROM, oldRecursiveFrom, recursiveFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__RECURSIVE_FROM, oldRecursiveFrom, recursiveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMeasurementLabelFormat() {
		return measurementLabelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementLabelFormat(Object newMeasurementLabelFormat) {
		Object oldMeasurementLabelFormat = measurementLabelFormat;
		measurementLabelFormat = newMeasurementLabelFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT, oldMeasurementLabelFormat, measurementLabelFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVisible() {
		if (visible != null && visible.eIsProxy()) {
			InternalEObject oldVisible = (InternalEObject)visible;
			visible = eResolveProxy(oldVisible);
			if (visible != oldVisible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__VISIBLE, oldVisible, visible));
			}
		}
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(EObject newVisible) {
		EObject oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRelationship> getMeasureRelationships() {
		if (measureRelationships == null) {
			measureRelationships = new EObjectContainmentEList<MeasureRelationship>(MeasureRelationship.class, this, SmmPackage.MEASURE__MEASURE_RELATIONSHIPS);
		}
		return measureRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDefaultQuery() {
		if (defaultQuery != null && defaultQuery.eIsProxy()) {
			InternalEObject oldDefaultQuery = (InternalEObject)defaultQuery;
			defaultQuery = eResolveProxy(oldDefaultQuery);
			if (defaultQuery != oldDefaultQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__DEFAULT_QUERY, oldDefaultQuery, defaultQuery));
			}
		}
		return defaultQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDefaultQuery() {
		return defaultQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultQuery(EObject newDefaultQuery) {
		EObject oldDefaultQuery = defaultQuery;
		defaultQuery = newDefaultQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__DEFAULT_QUERY, oldDefaultQuery, defaultQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRelationship> getInbound() {
		if (inbound == null) {
			inbound = new EObjectResolvingEList<MeasureRelationship>(MeasureRelationship.class, this, SmmPackage.MEASURE__INBOUND);
		}
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRelationship> getOutbound() {
		if (outbound == null) {
			outbound = new EObjectResolvingEList<MeasureRelationship>(MeasureRelationship.class, this, SmmPackage.MEASURE__OUTBOUND);
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
			case SmmPackage.MEASURE__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__REFINEMENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefinementFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentFrom()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.MEASURE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__REFINEMENT_TO:
				return ((InternalEList<?>)getRefinementTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				return ((InternalEList<?>)getRefinementFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return ((InternalEList<?>)getEquivalentTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return ((InternalEList<?>)getEquivalentFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
				return ((InternalEList<?>)getMeasureRelationships()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.MEASURE__CATEGORY:
				return getCategory();
			case SmmPackage.MEASURE__TRAIT:
				if (resolve) return getTrait();
				return basicGetTrait();
			case SmmPackage.MEASURE__SCOPE:
				if (resolve) return getScope();
				return basicGetScope();
			case SmmPackage.MEASURE__MEASURE_LABEL_FORMAT:
				return getMeasureLabelFormat();
			case SmmPackage.MEASURE__REFINEMENT_TO:
				return getRefinementTo();
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				return getRefinementFrom();
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return getEquivalentTo();
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return getEquivalentFrom();
			case SmmPackage.MEASURE__RECURSIVE_TO:
				if (resolve) return getRecursiveTo();
				return basicGetRecursiveTo();
			case SmmPackage.MEASURE__RECURSIVE_FROM:
				if (resolve) return getRecursiveFrom();
				return basicGetRecursiveFrom();
			case SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
				return getMeasurementLabelFormat();
			case SmmPackage.MEASURE__VISIBLE:
				if (resolve) return getVisible();
				return basicGetVisible();
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
				return getMeasureRelationships();
			case SmmPackage.MEASURE__DEFAULT_QUERY:
				if (resolve) return getDefaultQuery();
				return basicGetDefaultQuery();
			case SmmPackage.MEASURE__INBOUND:
				return getInbound();
			case SmmPackage.MEASURE__OUTBOUND:
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
			case SmmPackage.MEASURE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends MeasureCategory>)newValue);
				return;
			case SmmPackage.MEASURE__TRAIT:
				setTrait((EObject)newValue);
				return;
			case SmmPackage.MEASURE__SCOPE:
				setScope((EObject)newValue);
				return;
			case SmmPackage.MEASURE__MEASURE_LABEL_FORMAT:
				setMeasureLabelFormat((Object)newValue);
				return;
			case SmmPackage.MEASURE__REFINEMENT_TO:
				getRefinementTo().clear();
				getRefinementTo().addAll((Collection<? extends RefinementMeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				getRefinementFrom().clear();
				getRefinementFrom().addAll((Collection<? extends RefinementMeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends EquivalentMeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				getEquivalentFrom().addAll((Collection<? extends EquivalentMeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__RECURSIVE_TO:
				setRecursiveTo((EObject)newValue);
				return;
			case SmmPackage.MEASURE__RECURSIVE_FROM:
				setRecursiveFrom((EObject)newValue);
				return;
			case SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
				setMeasurementLabelFormat((Object)newValue);
				return;
			case SmmPackage.MEASURE__VISIBLE:
				setVisible((EObject)newValue);
				return;
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
				getMeasureRelationships().clear();
				getMeasureRelationships().addAll((Collection<? extends MeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__DEFAULT_QUERY:
				setDefaultQuery((EObject)newValue);
				return;
			case SmmPackage.MEASURE__INBOUND:
				getInbound().clear();
				getInbound().addAll((Collection<? extends MeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__OUTBOUND:
				getOutbound().clear();
				getOutbound().addAll((Collection<? extends MeasureRelationship>)newValue);
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
			case SmmPackage.MEASURE__CATEGORY:
				getCategory().clear();
				return;
			case SmmPackage.MEASURE__TRAIT:
				setTrait((EObject)null);
				return;
			case SmmPackage.MEASURE__SCOPE:
				setScope((EObject)null);
				return;
			case SmmPackage.MEASURE__MEASURE_LABEL_FORMAT:
				setMeasureLabelFormat(MEASURE_LABEL_FORMAT_EDEFAULT);
				return;
			case SmmPackage.MEASURE__REFINEMENT_TO:
				getRefinementTo().clear();
				return;
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				getRefinementFrom().clear();
				return;
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				return;
			case SmmPackage.MEASURE__RECURSIVE_TO:
				setRecursiveTo((EObject)null);
				return;
			case SmmPackage.MEASURE__RECURSIVE_FROM:
				setRecursiveFrom((EObject)null);
				return;
			case SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
				setMeasurementLabelFormat(MEASUREMENT_LABEL_FORMAT_EDEFAULT);
				return;
			case SmmPackage.MEASURE__VISIBLE:
				setVisible((EObject)null);
				return;
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
				getMeasureRelationships().clear();
				return;
			case SmmPackage.MEASURE__DEFAULT_QUERY:
				setDefaultQuery((EObject)null);
				return;
			case SmmPackage.MEASURE__INBOUND:
				getInbound().clear();
				return;
			case SmmPackage.MEASURE__OUTBOUND:
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
			case SmmPackage.MEASURE__CATEGORY:
				return category != null && !category.isEmpty();
			case SmmPackage.MEASURE__TRAIT:
				return trait != null;
			case SmmPackage.MEASURE__SCOPE:
				return scope != null;
			case SmmPackage.MEASURE__MEASURE_LABEL_FORMAT:
				return MEASURE_LABEL_FORMAT_EDEFAULT == null ? measureLabelFormat != null : !MEASURE_LABEL_FORMAT_EDEFAULT.equals(measureLabelFormat);
			case SmmPackage.MEASURE__REFINEMENT_TO:
				return refinementTo != null && !refinementTo.isEmpty();
			case SmmPackage.MEASURE__REFINEMENT_FROM:
				return refinementFrom != null && !refinementFrom.isEmpty();
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return equivalentFrom != null && !equivalentFrom.isEmpty();
			case SmmPackage.MEASURE__RECURSIVE_TO:
				return recursiveTo != null;
			case SmmPackage.MEASURE__RECURSIVE_FROM:
				return recursiveFrom != null;
			case SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
				return MEASUREMENT_LABEL_FORMAT_EDEFAULT == null ? measurementLabelFormat != null : !MEASUREMENT_LABEL_FORMAT_EDEFAULT.equals(measurementLabelFormat);
			case SmmPackage.MEASURE__VISIBLE:
				return visible != null;
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
				return measureRelationships != null && !measureRelationships.isEmpty();
			case SmmPackage.MEASURE__DEFAULT_QUERY:
				return defaultQuery != null;
			case SmmPackage.MEASURE__INBOUND:
				return inbound != null && !inbound.isEmpty();
			case SmmPackage.MEASURE__OUTBOUND:
				return outbound != null && !outbound.isEmpty();
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
		result.append(" (measureLabelFormat: ");
		result.append(measureLabelFormat);
		result.append(", measurementLabelFormat: ");
		result.append(measurementLabelFormat);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
