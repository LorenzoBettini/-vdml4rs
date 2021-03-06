/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.SubValueProposition#getSubSource <em>Sub Source</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getSubValueProposition()
 * @model
 * @generated
 */
public interface SubValueProposition extends DecoratedValueProposition {

	/**
	 * Returns the value of the '<em><b>Sub Source</b></em>' reference list.
	 * The list contents are of type {@link vdml.SourceRole}.
	 * It is bidirectional and its opposite is '{@link vdml.SourceRole#getTargetSubProposition <em>Target Sub Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Source</em>' reference list.
	 * @see vdml.VdmlPackage#getSubValueProposition_SubSource()
	 * @see vdml.SourceRole#getTargetSubProposition
	 * @model opposite="targetSubProposition"
	 * @generated
	 */
	EList<SourceRole> getSubSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getSubSource();'"
	 * @generated
	 */
	EList<SourceRole> getSourceRole();
} // SubValueProposition
