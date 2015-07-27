/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link vdml.ValuePropositionComponent#getComponentValue <em>Component Value</em>}</li>
 *   <li>{@link vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getValuePropositionComponent()
 * @model
 * @generated
 */
public interface ValuePropositionComponent extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Percentage Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Weight</em>' containment reference.
	 * @see #setPercentageWeight(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getValuePropositionComponent_PercentageWeight()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getPercentageWeight();

	/**
	 * Sets the value of the '{@link vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Weight</em>' containment reference.
	 * @see #getPercentageWeight()
	 * @generated
	 */
	void setPercentageWeight(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Component Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Value</em>' containment reference.
	 * @see #setComponentValue(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getValuePropositionComponent_ComponentValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getComponentValue();

	/**
	 * Sets the value of the '{@link vdml.ValuePropositionComponent#getComponentValue <em>Component Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Value</em>' containment reference.
	 * @see #getComponentValue()
	 * @generated
	 */
	void setComponentValue(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Satisfaction Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfaction Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction Level</em>' containment reference.
	 * @see #setSatisfactionLevel(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getValuePropositionComponent_SatisfactionLevel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getSatisfactionLevel();

	/**
	 * Sets the value of the '{@link vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction Level</em>' containment reference.
	 * @see #getSatisfactionLevel()
	 * @generated
	 */
	void setSatisfactionLevel(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Articulated Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.ValueAdd#getPropositionComponent <em>Proposition Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articulated Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulated Value</em>' reference.
	 * @see #setArticulatedValue(ValueAdd)
	 * @see vdml.VdmlPackage#getValuePropositionComponent_ArticulatedValue()
	 * @see vdml.ValueAdd#getPropositionComponent
	 * @model opposite="propositionComponent" required="true" ordered="false"
	 * @generated
	 */
	ValueAdd getArticulatedValue();

	/**
	 * Sets the value of the '{@link vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articulated Value</em>' reference.
	 * @see #getArticulatedValue()
	 * @generated
	 */
	void setArticulatedValue(ValueAdd value);

} // ValuePropositionComponent
