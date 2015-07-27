/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

import smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Capability#getParentCabability <em>Parent Cabability</em>}</li>
 *   <li>{@link vdml.Capability#getChildCapability <em>Child Capability</em>}</li>
 *   <li>{@link vdml.Capability#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getCapability()
 * @model abstract="true"
 * @generated
 */
public interface Capability extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Parent Cabability</b></em>' reference list.
	 * The list contents are of type {@link vdml.Capability}.
	 * It is bidirectional and its opposite is '{@link vdml.Capability#getChildCapability <em>Child Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Cabability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Cabability</em>' reference list.
	 * @see vdml.VdmlPackage#getCapability_ParentCabability()
	 * @see vdml.Capability#getChildCapability
	 * @model opposite="childCapability" ordered="false"
	 * @generated
	 */
	EList<Capability> getParentCabability();

	/**
	 * Returns the value of the '<em><b>Child Capability</b></em>' reference list.
	 * The list contents are of type {@link vdml.Capability}.
	 * It is bidirectional and its opposite is '{@link vdml.Capability#getParentCabability <em>Parent Cabability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Capability</em>' reference list.
	 * @see vdml.VdmlPackage#getCapability_ChildCapability()
	 * @see vdml.Capability#getParentCabability
	 * @model opposite="parentCabability" ordered="false"
	 * @generated
	 */
	EList<Capability> getChildCapability();

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
	 * @see vdml.VdmlPackage#getCapability_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Characteristic> getCharacteristicDefinition();

} // Capability
