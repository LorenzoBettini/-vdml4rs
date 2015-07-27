/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.CapabilityMethod#getPerformer <em>Performer</em>}</li>
 *   <li>{@link vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}</li>
 *   <li>{@link vdml.CapabilityMethod#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}</li>
 *   <li>{@link vdml.CapabilityMethod#getSupportedCapability <em>Supported Capability</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getCapabilityMethod()
 * @model
 * @generated
 */
public interface CapabilityMethod extends Collaboration {
	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Performer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see vdml.VdmlPackage#getCapabilityMethod_Performer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Performer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Method Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vdml.OrgUnit#getOwnedMethod <em>Owned Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Owner</em>' container reference.
	 * @see #setMethodOwner(OrgUnit)
	 * @see vdml.VdmlPackage#getCapabilityMethod_MethodOwner()
	 * @see vdml.OrgUnit#getOwnedMethod
	 * @model opposite="ownedMethod" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OrgUnit getMethodOwner();

	/**
	 * Sets the value of the '{@link vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Owner</em>' container reference.
	 * @see #getMethodOwner()
	 * @generated
	 */
	void setMethodOwner(OrgUnit value);

	/**
	 * Returns the value of the '<em><b>Implemented Practice</b></em>' reference list.
	 * The list contents are of type {@link vdml.PracticeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented Practice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Practice</em>' reference list.
	 * @see vdml.VdmlPackage#getCapabilityMethod_ImplementedPractice()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PracticeDefinition> getImplementedPractice();

	/**
	 * Returns the value of the '<em><b>Method Resource</b></em>' reference list.
	 * The list contents are of type {@link vdml.BusinessItem}.
	 * It is bidirectional and its opposite is '{@link vdml.BusinessItem#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Resource</em>' reference list.
	 * @see vdml.VdmlPackage#getCapabilityMethod_MethodResource()
	 * @see vdml.BusinessItem#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<BusinessItem> getMethodResource();

	/**
	 * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
	 * The list contents are of type {@link vdml.CapabilityOffer}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityOffer#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Capability</em>' reference list.
	 * @see vdml.VdmlPackage#getCapabilityMethod_SupportedCapability()
	 * @see vdml.CapabilityOffer#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<CapabilityOffer> getSupportedCapability();

} // CapabilityMethod
