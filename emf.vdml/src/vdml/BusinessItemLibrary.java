/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.BusinessItemLibrary#getBusinessItemDefinition <em>Business Item Definition</em>}</li>
 *   <li>{@link vdml.BusinessItemLibrary#getBusinessItemcategory <em>Business Itemcategory</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getBusinessItemLibrary()
 * @model
 * @generated
 */
public interface BusinessItemLibrary extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Business Item Definition</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.BusinessItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Definition</em>' containment reference list.
	 * @see vdml.VdmlPackage#getBusinessItemLibrary_BusinessItemDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BusinessItemDefinition> getBusinessItemDefinition();

	/**
	 * Returns the value of the '<em><b>Business Itemcategory</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.BusinessItemCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Itemcategory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Itemcategory</em>' containment reference list.
	 * @see vdml.VdmlPackage#getBusinessItemLibrary_BusinessItemcategory()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BusinessItemCategory> getBusinessItemcategory();

} // BusinessItemLibrary
