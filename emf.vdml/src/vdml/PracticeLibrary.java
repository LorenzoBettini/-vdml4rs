/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.PracticeLibrary#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link vdml.PracticeLibrary#getPracticeCategory <em>Practice Category</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getPracticeLibrary()
 * @model
 * @generated
 */
public interface PracticeLibrary extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Practice Definition</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.PracticeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Definition</em>' containment reference list.
	 * @see vdml.VdmlPackage#getPracticeLibrary_PracticeDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PracticeDefinition> getPracticeDefinition();

	/**
	 * Returns the value of the '<em><b>Practice Category</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.PracticeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Category</em>' containment reference list.
	 * @see vdml.VdmlPackage#getPracticeLibrary_PracticeCategory()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PracticeCategory> getPracticeCategory();

} // PracticeLibrary
