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
import vdml.SubObjValueProposition;
import vdml.SubValueProposition;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Obj Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.SubObjValuePropositionImpl#getObSource <em>Ob Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubObjValuePropositionImpl extends SubValuePropositionImpl implements SubObjValueProposition {
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
	protected SubObjValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.SUB_OBJ_VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRole> getObSource() {
		if (obSource == null) {
			obSource = new EObjectWithInverseResolvingEList.ManyInverse<SourceRole>(SourceRole.class, this, VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE, VdmlPackage.SOURCE_ROLE__TARGET_OB_PROPOSITION);
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ObValueProposition.class) {
			switch (derivedFeatureID) {
				case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE: return VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ObValueProposition.class) {
			switch (baseFeatureID) {
				case VdmlPackage.OB_VALUE_PROPOSITION__OB_SOURCE: return VdmlPackage.SUB_OBJ_VALUE_PROPOSITION__OB_SOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SubValueProposition.class) {
			switch (baseOperationID) {
				case VdmlPackage.SUB_VALUE_PROPOSITION___GET_SOURCE_ROLE: return VdmlPackage.SUB_OBJ_VALUE_PROPOSITION___GET_SOURCE_ROLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ObValueProposition.class) {
			switch (baseOperationID) {
				case VdmlPackage.OB_VALUE_PROPOSITION___GET_SOURCE_ROLE: return VdmlPackage.SUB_OBJ_VALUE_PROPOSITION___GET_SOURCE_ROLE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VdmlPackage.SUB_OBJ_VALUE_PROPOSITION___GET_SOURCE_ROLE:
				return getSourceRole();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubObjValuePropositionImpl
