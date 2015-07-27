/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

import smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#isIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#isIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getBusinessItemDefinition()
 * @model
 * @generated
 */
public interface BusinessItemDefinition extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Practice Definition</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Definition</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_PracticeDefinition()
	 * @see vdml.PracticeDefinition#getResourceDefinition
	 * @model opposite="resourceDefinition" ordered="false"
	 * @generated
	 */
	EList<PracticeDefinition> getPracticeDefinition();

	/**
	 * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
	 * The list contents are of type {@link vdml.CapabilityDefinition}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityDefinition#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Capability</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_SupportedCapability()
	 * @see vdml.CapabilityDefinition#getCapabilityResourceDefinition
	 * @model opposite="capabilityResourceDefinition" ordered="false"
	 * @generated
	 */
	EList<CapabilityDefinition> getSupportedCapability();

	/**
	 * Returns the value of the '<em><b>Is Fungible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fungible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fungible</em>' attribute.
	 * @see #setIsFungible(boolean)
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_IsFungible()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsFungible();

	/**
	 * Sets the value of the '{@link vdml.BusinessItemDefinition#isIsFungible <em>Is Fungible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fungible</em>' attribute.
	 * @see #isIsFungible()
	 * @generated
	 */
	void setIsFungible(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link vdml.BusinessItemCategory}.
	 * It is bidirectional and its opposite is '{@link vdml.BusinessItemCategory#getCategoryItem <em>Category Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_Category()
	 * @see vdml.BusinessItemCategory#getCategoryItem
	 * @model opposite="categoryItem" ordered="false"
	 * @generated
	 */
	EList<BusinessItemCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Characteristic Definition</b></em>' reference list.
	 * The list contents are of type {@link smm.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Definition</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Characteristic> getCharacteristicDefinition();

	/**
	 * Returns the value of the '<em><b>Is Shareable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shareable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shareable</em>' attribute.
	 * @see #setIsShareable(boolean)
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_IsShareable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsShareable();

	/**
	 * Sets the value of the '{@link vdml.BusinessItemDefinition#isIsShareable <em>Is Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shareable</em>' attribute.
	 * @see #isIsShareable()
	 * @generated
	 */
	void setIsShareable(boolean value);

	/**
	 * Returns the value of the '<em><b>Capability Dependency</b></em>' reference list.
	 * The list contents are of type {@link vdml.CapabilityDependency}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Dependency</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItemDefinition_CapabilityDependency()
	 * @see vdml.CapabilityDependency#getDeliverableDefinition
	 * @model opposite="deliverableDefinition" ordered="false"
	 * @generated
	 */
	EList<CapabilityDependency> getCapabilityDependency();

} // BusinessItemDefinition
