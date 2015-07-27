/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ResourceUse#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link vdml.ResourceUse#getResource <em>Resource</em>}</li>
 *   <li>{@link vdml.ResourceUse#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link vdml.ResourceUse#getDuration <em>Duration</em>}</li>
 *   <li>{@link vdml.ResourceUse#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link vdml.ResourceUse#isInputDriven <em>Input Driven</em>}</li>
 *   <li>{@link vdml.ResourceUse#getCondition <em>Condition</em>}</li>
 *   <li>{@link vdml.ResourceUse#isIsExclusive <em>Is Exclusive</em>}</li>
 *   <li>{@link vdml.ResourceUse#isResourceIsConsumed <em>Resource Is Consumed</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getResourceUse()
 * @model
 * @generated
 */
public interface ResourceUse extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Deliverable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.OutputPort#getResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable</em>' reference.
	 * @see #setDeliverable(OutputPort)
	 * @see vdml.VdmlPackage#getResourceUse_Deliverable()
	 * @see vdml.OutputPort#getResourceUse
	 * @model opposite="resourceUse" ordered="false"
	 * @generated
	 */
	OutputPort getDeliverable();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#getDeliverable <em>Deliverable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable</em>' reference.
	 * @see #getDeliverable()
	 * @generated
	 */
	void setDeliverable(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference list.
	 * The list contents are of type {@link vdml.InputPort}.
	 * It is bidirectional and its opposite is '{@link vdml.InputPort#getResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference list.
	 * @see vdml.VdmlPackage#getResourceUse_Resource()
	 * @see vdml.InputPort#getResourceUse
	 * @model opposite="resourceUse"
	 * @generated
	 */
	EList<InputPort> getResource();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getResourceUse_Quantity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getQuantity();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getResourceUse_Duration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getDuration();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Planning Percentage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Percentage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Percentage</em>' containment reference.
	 * @see #setPlanningPercentage(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getResourceUse_PlanningPercentage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getPlanningPercentage();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#getPlanningPercentage <em>Planning Percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Percentage</em>' containment reference.
	 * @see #getPlanningPercentage()
	 * @generated
	 */
	void setPlanningPercentage(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Input Driven</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Driven</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Driven</em>' attribute.
	 * @see #setInputDriven(boolean)
	 * @see vdml.VdmlPackage#getResourceUse_InputDriven()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInputDriven();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#isInputDriven <em>Input Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Driven</em>' attribute.
	 * @see #isInputDriven()
	 * @generated
	 */
	void setInputDriven(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see vdml.VdmlPackage#getResourceUse_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Exclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exclusive</em>' attribute.
	 * @see #setIsExclusive(boolean)
	 * @see vdml.VdmlPackage#getResourceUse_IsExclusive()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExclusive();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#isIsExclusive <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive</em>' attribute.
	 * @see #isIsExclusive()
	 * @generated
	 */
	void setIsExclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Resource Is Consumed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Is Consumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Is Consumed</em>' attribute.
	 * @see #setResourceIsConsumed(boolean)
	 * @see vdml.VdmlPackage#getResourceUse_ResourceIsConsumed()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isResourceIsConsumed();

	/**
	 * Sets the value of the '{@link vdml.ResourceUse#isResourceIsConsumed <em>Resource Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Is Consumed</em>' attribute.
	 * @see #isResourceIsConsumed()
	 * @generated
	 */
	void setResourceIsConsumed(boolean value);

} // ResourceUse
