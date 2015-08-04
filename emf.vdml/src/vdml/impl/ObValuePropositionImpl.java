/**
 */
package vdml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import vdml.ObValueProposition;
import vdml.SourceRole;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ob Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.ObValuePropositionImpl#getObSource <em>Ob Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObValuePropositionImpl extends DecoratedValuePropositionImpl implements ObValueProposition {
	/**
	 * The cached value of the '{@link #getObSource() <em>Ob Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRole> obSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.OB_VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRole> getObSource() {
		if (obSource == null) {
			obSource = new EObjectWithInverseResolvingEList.ManyInverse<SourceRole>(SourceRole.class, this, VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE, VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION);
		}
		return obSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRole> getSourceRole() {
		return getObSource();
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObSource()).basicAdd(otherEnd, msgs);
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				return ((InternalEList<?>)getObSource()).basicRemove(otherEnd, msgs);
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				return getObSource();
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				getObSource().clear();
				getObSource().addAll((Collection<? extends SourceRole>)newValue);
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				getObSource().clear();
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
			case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE:
				return obSource != null && !obSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VdmlPackage.OB_VALUE_PROPOSITION___GET_SOURCE_ROLE:
				return getSourceRole();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObValuePropositionImpl
