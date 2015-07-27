/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ValueCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link vdml.ValueCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link vdml.ValueCategory#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getValueCategory()
 * @model
 * @generated
 */
public interface ValueCategory extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueCategory#getChildCategory <em>Child Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference list.
	 * @see vdml.VdmlPackage#getValueCategory_ParentCategory()
	 * @see vdml.ValueCategory#getChildCategory
	 * @model opposite="childCategory" ordered="false"
	 * @generated
	 */
	EList<ValueCategory> getParentCategory();

	/**
	 * Returns the value of the '<em><b>Child Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueCategory#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Category</em>' reference list.
	 * @see vdml.VdmlPackage#getValueCategory_ChildCategory()
	 * @see vdml.ValueCategory#getParentCategory
	 * @model opposite="parentCategory" ordered="false"
	 * @generated
	 */
	EList<ValueCategory> getChildCategory();

	/**
	 * Returns the value of the '<em><b>Category Value</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueDefinition#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value</em>' reference list.
	 * @see vdml.VdmlPackage#getValueCategory_CategoryValue()
	 * @see vdml.ValueDefinition#getCategory
	 * @model opposite="category" ordered="false"
	 * @generated
	 */
	EList<ValueDefinition> getCategoryValue();

} // ValueCategory
