/**
 */
package vdml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import vdml.DecoratedValueProposition;
import vdml.SourceRole;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decorated Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DecoratedValuePropositionImpl extends ValuePropositionImpl implements DecoratedValueProposition {
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
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VdmlPackage.DECORATED_VALUE_PROPOSITION___GET_SOURCE_ROLE:
				return getSourceRole();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecoratedValuePropositionImpl
