/**
 */
package vdml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import vdml.DecoratedValueProposition;
import vdml.SourceRole;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorated Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.DecoratedValuePropositionImpl#getSourceRole <em>Source Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DecoratedValuePropositionImpl extends ValuePropositionImpl implements DecoratedValueProposition {
	/**
	 * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRole> sourceRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecoratedValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.DECORATED_VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRole> getSourceRole() {
		if (sourceRole == null) {
			sourceRole = new EObjectResolvingEList<SourceRole>(SourceRole.class, this, VdmlPackage.DECORATED_VALUE_PROPOSITION__SOURCE_ROLE);
		}
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VdmlPackage.DECORATED_VALUE_PROPOSITION__SOURCE_ROLE:
				return getSourceRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VdmlPackage.DECORATED_VALUE_PROPOSITION__SOURCE_ROLE:
				return sourceRole != null && !sourceRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecoratedValuePropositionImpl
