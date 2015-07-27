/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.PracticeDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link vdml.PracticeDefinition#getCapability <em>Capability</em>}</li>
 *   <li>{@link vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getPracticeDefinition()
 * @model
 * @generated
 */
public interface PracticeDefinition extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeDefinition_Category()
	 * @see vdml.PracticeCategory#getCategoryPractice
	 * @model opposite="categoryPractice" ordered="false"
	 * @generated
	 */
	EList<PracticeCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference list.
	 * The list contents are of type {@link vdml.CapabilityDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeDefinition_Capability()
	 * @see vdml.CapabilityDefinition#getPracticeDefinition
	 * @model opposite="practiceDefinition" ordered="false"
	 * @generated
	 */
	EList<CapabilityDefinition> getCapability();

	/**
	 * Returns the value of the '<em><b>Resource Definition</b></em>' reference list.
	 * The list contents are of type {@link vdml.BusinessItemDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Definition</em>' reference list.
	 * @see vdml.VdmlPackage#getPracticeDefinition_ResourceDefinition()
	 * @see vdml.BusinessItemDefinition#getPracticeDefinition
	 * @model opposite="practiceDefinition" ordered="false"
	 * @generated
	 */
	EList<BusinessItemDefinition> getResourceDefinition();

} // PracticeDefinition
