/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorated Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.DecoratedValueProposition#getSourceRole <em>Source Role</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getDecoratedValueProposition()
 * @model abstract="true"
 * @generated
 */
public interface DecoratedValueProposition extends ValueProposition {

	/**
	 * Returns the value of the '<em><b>Source Role</b></em>' reference list.
	 * The list contents are of type {@link vdml.SourceRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role</em>' reference list.
	 * @see vdml.VdmlPackage#getDecoratedValueProposition_SourceRole()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<SourceRole> getSourceRole();

} // DecoratedValueProposition
