/**
 */
package vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vdml.BusinessItemCategory;
import vdml.BusinessItemDefinition;
import vdml.BusinessItemLibrary;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.BusinessItemLibraryImpl#getBusinessItemDefinition <em>Business Item Definition</em>}</li>
 *   <li>{@link vdml.impl.BusinessItemLibraryImpl#getBusinessItemcategory <em>Business Itemcategory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessItemLibraryImpl extends VdmlElementImpl implements BusinessItemLibrary {
	/**
	 * The cached value of the '{@link #getBusinessItemDefinition() <em>Business Item Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessItemDefinition> businessItemDefinition;

	/**
	 * The cached value of the '{@link #getBusinessItemcategory() <em>Business Itemcategory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessItemcategory()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessItemCategory> businessItemcategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessItemLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.BUSINESS_ITEM_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessItemDefinition> getBusinessItemDefinition() {
		if (businessItemDefinition == null) {
			businessItemDefinition = new EObjectContainmentEList<BusinessItemDefinition>(BusinessItemDefinition.class, this, VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION);
		}
		return businessItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessItemCategory> getBusinessItemcategory() {
		if (businessItemcategory == null) {
			businessItemcategory = new EObjectContainmentEList<BusinessItemCategory>(BusinessItemCategory.class, this, VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY);
		}
		return businessItemcategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION:
				return ((InternalEList<?>)getBusinessItemDefinition()).basicRemove(otherEnd, msgs);
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY:
				return ((InternalEList<?>)getBusinessItemcategory()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION:
				return getBusinessItemDefinition();
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY:
				return getBusinessItemcategory();
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
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION:
				getBusinessItemDefinition().clear();
				getBusinessItemDefinition().addAll((Collection<? extends BusinessItemDefinition>)newValue);
				return;
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY:
				getBusinessItemcategory().clear();
				getBusinessItemcategory().addAll((Collection<? extends BusinessItemCategory>)newValue);
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
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION:
				getBusinessItemDefinition().clear();
				return;
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY:
				getBusinessItemcategory().clear();
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
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_DEFINITION:
				return businessItemDefinition != null && !businessItemDefinition.isEmpty();
			case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEMCATEGORY:
				return businessItemcategory != null && !businessItemcategory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessItemLibraryImpl
