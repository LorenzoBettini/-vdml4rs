/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Party#getValueMargin <em>Value Margin</em>}</li>
 *   <li>{@link vdml.Party#getProfit <em>Profit</em>}</li>
 *   <li>{@link vdml.Party#isIsFocalPoint <em>Is Focal Point</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends Role {
	/**
	 * Returns the value of the '<em><b>Value Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Margin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Margin</em>' containment reference.
	 * @see #setValueMargin(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getParty_ValueMargin()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getValueMargin();

	/**
	 * Sets the value of the '{@link vdml.Party#getValueMargin <em>Value Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Margin</em>' containment reference.
	 * @see #getValueMargin()
	 * @generated
	 */
	void setValueMargin(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Profit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profit</em>' containment reference.
	 * @see #setProfit(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getParty_Profit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getProfit();

	/**
	 * Sets the value of the '{@link vdml.Party#getProfit <em>Profit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profit</em>' containment reference.
	 * @see #getProfit()
	 * @generated
	 */
	void setProfit(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Is Focal Point</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Focal Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Focal Point</em>' attribute.
	 * @see #setIsFocalPoint(boolean)
	 * @see vdml.VdmlPackage#getParty_IsFocalPoint()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIsFocalPoint();

	/**
	 * Sets the value of the '{@link vdml.Party#isIsFocalPoint <em>Is Focal Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Focal Point</em>' attribute.
	 * @see #isIsFocalPoint()
	 * @generated
	 */
	void setIsFocalPoint(boolean value);

} // Party
