/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.SourceRole#getTargetObProposition <em>Target Ob Proposition</em>}</li>
 *   <li>{@link vdml.SourceRole#getTargetSubProposition <em>Target Sub Proposition</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getSourceRole()
 * @model
 * @generated
 */
public interface SourceRole extends DecoratedRole {

	/**
	 * Returns the value of the '<em><b>Target Ob Proposition</b></em>' reference list.
	 * The list contents are of type {@link vdml.ObValueProposition}.
	 * It is bidirectional and its opposite is '{@link vdml.ObValueProposition#getObSource <em>Ob Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ob Proposition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ob Proposition</em>' reference list.
	 * @see vdml.VdmlPackage#getSourceRole_TargetObProposition()
	 * @see vdml.ObValueProposition#getObSource
	 * @model opposite="obSource"
	 * @generated
	 */
	EList<ObValueProposition> getTargetObProposition();

	/**
	 * Returns the value of the '<em><b>Target Sub Proposition</b></em>' reference list.
	 * The list contents are of type {@link vdml.SubValueProposition}.
	 * It is bidirectional and its opposite is '{@link vdml.SubValueProposition#getSubSource <em>Sub Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sub Proposition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sub Proposition</em>' reference list.
	 * @see vdml.VdmlPackage#getSourceRole_TargetSubProposition()
	 * @see vdml.SubValueProposition#getSubSource
	 * @model opposite="subSource"
	 * @generated
	 */
	EList<SubValueProposition> getTargetSubProposition();
} // SourceRole
