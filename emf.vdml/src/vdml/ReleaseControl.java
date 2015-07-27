/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ReleaseControl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link vdml.ReleaseControl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getReleaseControl()
 * @model
 * @generated
 */
public interface ReleaseControl extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(vdml.String)
	 * @see vdml.VdmlPackage#getReleaseControl_Strategy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	vdml.String getStrategy();

	/**
	 * Sets the value of the '{@link vdml.ReleaseControl#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link vdml.Scenario}.
	 * It is bidirectional and its opposite is '{@link vdml.Scenario#getReleaseControl <em>Release Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see vdml.VdmlPackage#getReleaseControl_Scenario()
	 * @see vdml.Scenario#getReleaseControl
	 * @model opposite="releaseControl" ordered="false"
	 * @generated
	 */
	EList<Scenario> getScenario();

} // ReleaseControl
