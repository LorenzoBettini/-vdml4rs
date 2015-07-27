/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Operand#getAlias <em>Alias</em>}</li>
 *   <li>{@link vdml.Operand#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' reference.
	 * @see #setAlias(vdml.String)
	 * @see vdml.VdmlPackage#getOperand_Alias()
	 * @model ordered="false"
	 * @generated
	 */
	vdml.String getAlias();

	/**
	 * Sets the value of the '{@link vdml.Operand#getAlias <em>Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Measured Characteristic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Characteristic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Characteristic</em>' reference.
	 * @see #setMeasuredCharacteristic(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getOperand_MeasuredCharacteristic()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getMeasuredCharacteristic();

	/**
	 * Sets the value of the '{@link vdml.Operand#getMeasuredCharacteristic <em>Measured Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Characteristic</em>' reference.
	 * @see #getMeasuredCharacteristic()
	 * @generated
	 */
	void setMeasuredCharacteristic(MeasuredCharacteristic value);

} // Operand
