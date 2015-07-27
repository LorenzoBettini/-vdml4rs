/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.OrgUnit#getCapabilityOffer <em>Capability Offer</em>}</li>
 *   <li>{@link vdml.OrgUnit#getOwnedMethod <em>Owned Method</em>}</li>
 *   <li>{@link vdml.OrgUnit#getPosition <em>Position</em>}</li>
 *   <li>{@link vdml.OrgUnit#getLocation <em>Location</em>}</li>
 *   <li>{@link vdml.OrgUnit#getOwnedStore <em>Owned Store</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getOrgUnit()
 * @model
 * @generated
 */
public interface OrgUnit extends Collaboration {
	/**
	 * Returns the value of the '<em><b>Capability Offer</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.CapabilityOffer}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityOffer#getCapabilityProvider <em>Capability Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Offer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Offer</em>' containment reference list.
	 * @see vdml.VdmlPackage#getOrgUnit_CapabilityOffer()
	 * @see vdml.CapabilityOffer#getCapabilityProvider
	 * @model opposite="capabilityProvider" containment="true" ordered="false"
	 * @generated
	 */
	EList<CapabilityOffer> getCapabilityOffer();

	/**
	 * Returns the value of the '<em><b>Owned Method</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.CapabilityMethod}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method</em>' containment reference list.
	 * @see vdml.VdmlPackage#getOrgUnit_OwnedMethod()
	 * @see vdml.CapabilityMethod#getMethodOwner
	 * @model opposite="methodOwner" containment="true" ordered="false"
	 * @generated
	 */
	EList<CapabilityMethod> getOwnedMethod();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see vdml.VdmlPackage#getOrgUnit_Position()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Position> getPosition();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(vdml.String)
	 * @see vdml.VdmlPackage#getOrgUnit_Location()
	 * @model ordered="false"
	 * @generated
	 */
	vdml.String getLocation();

	/**
	 * Sets the value of the '{@link vdml.OrgUnit#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Owned Store</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Store}.
	 * It is bidirectional and its opposite is '{@link vdml.Store#getStoreOwner <em>Store Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Store</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Store</em>' containment reference list.
	 * @see vdml.VdmlPackage#getOrgUnit_OwnedStore()
	 * @see vdml.Store#getStoreOwner
	 * @model opposite="storeOwner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Store> getOwnedStore();

} // OrgUnit
