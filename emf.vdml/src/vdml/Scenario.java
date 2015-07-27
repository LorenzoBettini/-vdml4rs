/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Scenario#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link vdml.Scenario#getType <em>Type</em>}</li>
 *   <li>{@link vdml.Scenario#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link vdml.Scenario#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link vdml.Scenario#getHeatThreshold <em>Heat Threshold</em>}</li>
 *   <li>{@link vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AnalysisContext {
	/**
	 * Returns the value of the '<em><b>Horizon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizon</em>' containment reference.
	 * @see #setHorizon(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getScenario_Horizon()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getHorizon();

	/**
	 * Sets the value of the '{@link vdml.Scenario#getHorizon <em>Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon</em>' containment reference.
	 * @see #getHorizon()
	 * @generated
	 */
	void setHorizon(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(vdml.String)
	 * @see vdml.VdmlPackage#getScenario_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	vdml.String getType();

	/**
	 * Sets the value of the '{@link vdml.Scenario#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Release Control</b></em>' reference list.
	 * The list contents are of type {@link vdml.ReleaseControl}.
	 * It is bidirectional and its opposite is '{@link vdml.ReleaseControl#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Control</em>' reference list.
	 * @see vdml.VdmlPackage#getScenario_ReleaseControl()
	 * @see vdml.ReleaseControl#getScenario
	 * @model opposite="scenario" ordered="false"
	 * @generated
	 */
	EList<ReleaseControl> getReleaseControl();

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see vdml.VdmlPackage#getScenario_IsDefault()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link vdml.Scenario#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Heat Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Threshold</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Threshold</em>' containment reference.
	 * @see #setHeatThreshold(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getScenario_HeatThreshold()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getHeatThreshold();

	/**
	 * Sets the value of the '{@link vdml.Scenario#getHeatThreshold <em>Heat Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Threshold</em>' containment reference.
	 * @see #getHeatThreshold()
	 * @generated
	 */
	void setHeatThreshold(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Context Collaboration</b></em>' reference list.
	 * The list contents are of type {@link vdml.Collaboration}.
	 * It is bidirectional and its opposite is '{@link vdml.Collaboration#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Collaboration</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Collaboration</em>' reference list.
	 * @see vdml.VdmlPackage#getScenario_ContextCollaboration()
	 * @see vdml.Collaboration#getScenario
	 * @model opposite="scenario" ordered="false"
	 * @generated
	 */
	EList<Collaboration> getContextCollaboration();

} // Scenario
