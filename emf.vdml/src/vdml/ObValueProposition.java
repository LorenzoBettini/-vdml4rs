/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ob Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ObValueProposition#getObSource <em>Ob Source</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getObValueProposition()
 * @model
 * @generated
 */
public interface ObValueProposition extends DecoratedValueProposition {

	/**
	 * Returns the value of the '<em><b>Ob Source</b></em>' reference list.
	 * The list contents are of type {@link vdml.SourceRole}.
	 * It is bidirectional and its opposite is '{@link vdml.SourceRole#getTargetObProposition <em>Target Ob Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ob Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ob Source</em>' reference list.
	 * @see vdml.VdmlPackage#getObValueProposition_ObSource()
	 * @see vdml.SourceRole#getTargetObProposition
	 * @model opposite="targetObProposition"
	 * @generated
	 */
	EList<SourceRole> getObSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getObSource();'"
	 * @generated
	 */
	EList<SourceRole> getSourceRole();
} // ObValueProposition
