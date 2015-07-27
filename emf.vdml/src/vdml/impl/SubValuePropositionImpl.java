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
import vdml.SourceRole;
import vdml.SubValueProposition;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.SubValuePropositionImpl#getSubSource <em>Sub Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubValuePropositionImpl extends DecoratedValuePropositionImpl implements SubValueProposition {
	/**
	 * The cached value of the '{@link #getSubSource() <em>Sub Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRole> subSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.SUB_VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRole> getSubSource() {
		if (subSource == null) {
			subSource = new EObjectWithInverseResolvingEList.ManyInverse<SourceRole>(SourceRole.class, this, VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE, VdmlPackage.SOURCE_ROLE__TARGET_SUB_PROPOSITION);
		}
		return subSource;
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSource()).basicAdd(otherEnd, msgs);
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				return ((InternalEList<?>)getSubSource()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				return getSubSource();
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				getSubSource().clear();
				getSubSource().addAll((Collection<? extends SourceRole>)newValue);
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				getSubSource().clear();
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
			case VdmlPackage.SUB_VALUE_PROPOSITION__SUB_SOURCE:
				return subSource != null && !subSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubValuePropositionImpl
