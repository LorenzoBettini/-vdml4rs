/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

import smm.SmmModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Delivery Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ValueDeliveryModel#getMetricsModel <em>Metrics Model</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getValueLibrary <em>Value Library</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getCapabilitylibrary <em>Capabilitylibrary</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getBusinessItemLibrary <em>Business Item Library</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getActor <em>Actor</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getPracticeLibrary <em>Practice Library</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getScenario <em>Scenario</em>}</li>
 *   <li>{@link vdml.ValueDeliveryModel#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getValueDeliveryModel()
 * @model
 * @generated
 */
public interface ValueDeliveryModel extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Metrics Model</b></em>' containment reference list.
	 * The list contents are of type {@link smm.SmmModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Model</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_MetricsModel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SmmModel> getMetricsModel();

	/**
	 * Returns the value of the '<em><b>Value Library</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.ValueLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Library</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_ValueLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueLibrary> getValueLibrary();

	/**
	 * Returns the value of the '<em><b>Capabilitylibrary</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.CapabilityLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilitylibrary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilitylibrary</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_Capabilitylibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CapabilityLibrary> getCapabilitylibrary();

	/**
	 * Returns the value of the '<em><b>Business Item Library</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.BusinessItemLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Item Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Library</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_BusinessItemLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BusinessItemLibrary> getBusinessItemLibrary();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_Actor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Practice Library</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.PracticeLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Library</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_PracticeLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PracticeLibrary> getPracticeLibrary();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_Scenario()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueDeliveryModel_Collaboration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Collaboration> getCollaboration();

} // ValueDeliveryModel
