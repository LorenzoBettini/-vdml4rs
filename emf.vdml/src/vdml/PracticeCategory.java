/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link vdml.PracticeCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getPracticeCategory()
 * @model
 * @generated
 */
public interface PracticeCategory extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.PracticeCategory#getChildCategory <em>Child Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeCategory_ParentCategory()
	 * @see vdml.PracticeCategory#getChildCategory
	 * @model opposite="childCategory" ordered="false"
	 * @generated
	 */
	EList<PracticeCategory> getParentCategory();

	/**
	 * Returns the value of the '<em><b>Child Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Category</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeCategory_ChildCategory()
	 * @see vdml.PracticeCategory#getParentCategory
	 * @model opposite="parentCategory" ordered="false"
	 * @generated
	 */
	EList<PracticeCategory> getChildCategory();

	/**
	 * Returns the value of the '<em><b>Category Practice</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.PracticeDefinition#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Practice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Practice</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeCategory_CategoryPractice()
	 * @see vdml.PracticeDefinition#getCategory
	 * @model opposite="category" ordered="false"
	 * @generated
	 */
	EList<PracticeDefinition> getCategoryPractice();

} // PracticeCategory
