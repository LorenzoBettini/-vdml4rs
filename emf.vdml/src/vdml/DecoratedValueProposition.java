/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorated Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see vdml.VdmlPackage#getDecoratedValueProposition()
 * @model abstract="true"
 * @generated
 */
public interface DecoratedValueProposition extends ValueProposition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SourceRole> getSourceRole();

} // DecoratedValueProposition
