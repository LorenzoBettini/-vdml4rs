/**
 */
package vdml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import vdml.ObValueProposition;
import vdml.SourceRole;
import vdml.SubValueProposition;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.SourceRoleImpl#getTargetObProposition <em>Target Ob Proposition</em>}</li>
 *   <li>{@link vdml.impl.SourceRoleImpl#getTargetSubProposition <em>Target Sub Proposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceRoleImpl extends DecoratedRoleImpl implements SourceRole {
	/**
	 * The cached value of the '{@link #getTargetObProposition() <em>Target Ob Proposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObProposition()
	 * @generated
	 * @ordered
	 */
	protected EList<ObValueProposition> targetObProposition;
	/**
	 * The cached value of the '{@link #getTargetSubProposition() <em>Target Sub Proposition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSubProposition()
	 * @generated
	 * @ordered
	 */
	protected EList<SubValueProposition> targetSubProposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.SOURCE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObValueProposition> getTargetObProposition() {
		if (targetObProposition == null) {
			targetObProposition = new EObjectWithInverseResolvingEList.ManyInverse<ObValueProposition>(ObValueProposition.class, this, VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION, VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE);
		}
		return targetObProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubValueProposition> getTargetSubProposition() {
		if (targetSubProposition == null) {
			targetSubProposition = new EObjectWithInverseResolvingEList.ManyInverse<SubValueProposition>(SubValueProposition.class, this, VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION, VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE);
		}
		return targetSubProposition;
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetObProposition()).basicAdd(otherEnd, msgs);
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetSubProposition()).basicAdd(otherEnd, msgs);
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				return ((InternalEList<?>)getTargetObProposition()).basicRemove(otherEnd, msgs);
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				return ((InternalEList<?>)getTargetSubProposition()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				return getTargetObProposition();
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				return getTargetSubProposition();
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				getTargetObProposition().clear();
				getTargetObProposition().addAll((Collection<? extends ObValueProposition>)newValue);
				return;
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				getTargetSubProposition().clear();
				getTargetSubProposition().addAll((Collection<? extends SubValueProposition>)newValue);
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				getTargetObProposition().clear();
				return;
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				getTargetSubProposition().clear();
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
			case VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION:
				return targetObProposition != null && !targetObProposition.isEmpty();
			case VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION:
				return targetSubProposition != null && !targetSubProposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceRoleImpl
