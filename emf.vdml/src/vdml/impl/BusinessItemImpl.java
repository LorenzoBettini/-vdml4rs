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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vdml.Assignment;
import vdml.BusinessItem;
import vdml.BusinessItemDefinition;
import vdml.CapabilityMethod;
import vdml.DeliverableFlow;
import vdml.Store;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.BusinessItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#isIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#getStore <em>Store</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#isIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemImpl#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessItemImpl extends MeasurableElementImpl implements BusinessItem {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemDefinition definition;

	/**
	 * The default value of the '{@link #isIsFungible() <em>Is Fungible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFungible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FUNGIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsFungible() <em>Is Fungible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFungible()
	 * @generated
	 * @ordered
	 */
	protected boolean isFungible = IS_FUNGIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignment;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected EList<Store> store;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityMethod> method;

	/**
	 * The default value of the '{@link #isIsShareable() <em>Is Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShareable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHAREABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShareable() <em>Is Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShareable()
	 * @generated
	 * @ordered
	 */
	protected boolean isShareable = IS_SHAREABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliverableFlow> flow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.BUSINESS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (BusinessItemDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.BUSINESS_ITEM__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(BusinessItemDefinition newDefinition) {
		BusinessItemDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.BUSINESS_ITEM__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFungible() {
		return isFungible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFungible(boolean newIsFungible) {
		boolean oldIsFungible = isFungible;
		isFungible = newIsFungible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.BUSINESS_ITEM__IS_FUNGIBLE, oldIsFungible, isFungible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectWithInverseResolvingEList<Assignment>(Assignment.class, this, VdmlPackage.BUSINESS_ITEM__ASSIGNMENT, VdmlPackage.ASSIGNMENT__ASSIGNABLE_RESOURCE);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Store> getStore() {
		if (store == null) {
			store = new EObjectWithInverseResolvingEList<Store>(Store.class, this, VdmlPackage.BUSINESS_ITEM__STORE, VdmlPackage.STORE__RESOURCE);
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityMethod> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityMethod>(CapabilityMethod.class, this, VdmlPackage.BUSINESS_ITEM__METHOD, VdmlPackage.CAPABILITY_METHOD__METHOD_RESOURCE);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShareable() {
		return isShareable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShareable(boolean newIsShareable) {
		boolean oldIsShareable = isShareable;
		isShareable = newIsShareable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.BUSINESS_ITEM__IS_SHAREABLE, oldIsShareable, isShareable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeliverableFlow> getFlow() {
		if (flow == null) {
			flow = new EObjectWithInverseResolvingEList<DeliverableFlow>(DeliverableFlow.class, this, VdmlPackage.BUSINESS_ITEM__FLOW, VdmlPackage.DELIVERABLE_FLOW__DELIVERABLE);
		}
		return flow;
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
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignment()).basicAdd(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStore()).basicAdd(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlow()).basicAdd(otherEnd, msgs);
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
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__STORE:
				return ((InternalEList<?>)getStore()).basicRemove(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.BUSINESS_ITEM__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case VdmlPackage.BUSINESS_ITEM__IS_FUNGIBLE:
				return isIsFungible();
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				return getAssignment();
			case VdmlPackage.BUSINESS_ITEM__STORE:
				return getStore();
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				return getMethod();
			case VdmlPackage.BUSINESS_ITEM__IS_SHAREABLE:
				return isIsShareable();
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				return getFlow();
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
			case VdmlPackage.BUSINESS_ITEM__DEFINITION:
				setDefinition((BusinessItemDefinition)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__IS_FUNGIBLE:
				setIsFungible((Boolean)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__STORE:
				getStore().clear();
				getStore().addAll((Collection<? extends Store>)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends CapabilityMethod>)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__IS_SHAREABLE:
				setIsShareable((Boolean)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends DeliverableFlow>)newValue);
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
			case VdmlPackage.BUSINESS_ITEM__DEFINITION:
				setDefinition((BusinessItemDefinition)null);
				return;
			case VdmlPackage.BUSINESS_ITEM__IS_FUNGIBLE:
				setIsFungible(IS_FUNGIBLE_EDEFAULT);
				return;
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				getAssignment().clear();
				return;
			case VdmlPackage.BUSINESS_ITEM__STORE:
				getStore().clear();
				return;
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				getMethod().clear();
				return;
			case VdmlPackage.BUSINESS_ITEM__IS_SHAREABLE:
				setIsShareable(IS_SHAREABLE_EDEFAULT);
				return;
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				getFlow().clear();
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
			case VdmlPackage.BUSINESS_ITEM__DEFINITION:
				return definition != null;
			case VdmlPackage.BUSINESS_ITEM__IS_FUNGIBLE:
				return isFungible != IS_FUNGIBLE_EDEFAULT;
			case VdmlPackage.BUSINESS_ITEM__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
			case VdmlPackage.BUSINESS_ITEM__STORE:
				return store != null && !store.isEmpty();
			case VdmlPackage.BUSINESS_ITEM__METHOD:
				return method != null && !method.isEmpty();
			case VdmlPackage.BUSINESS_ITEM__IS_SHAREABLE:
				return isShareable != IS_SHAREABLE_EDEFAULT;
			case VdmlPackage.BUSINESS_ITEM__FLOW:
				return flow != null && !flow.isEmpty();
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
		result.append(" (isFungible: ");
		result.append(isFungible);
		result.append(", isShareable: ");
		result.append(isShareable);
		result.append(')');
		return result.toString();
	}

} //BusinessItemImpl
