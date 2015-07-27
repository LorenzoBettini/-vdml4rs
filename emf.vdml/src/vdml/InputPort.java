/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.InputPort#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link vdml.InputPort#getDelegatedInput <em>Delegated Input</em>}</li>
 *   <li>{@link vdml.InputPort#getInputDelegation <em>Input Delegation</em>}</li>
 *   <li>{@link vdml.InputPort#getRole <em>Role</em>}</li>
 *   <li>{@link vdml.InputPort#getInputDefinition <em>Input Definition</em>}</li>
 *   <li>{@link vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link vdml.InputPort#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Resource Use</b></em>' reference list.
	 * The list contents are of type {@link vdml.ResourceUse}.
	 * It is bidirectional and its opposite is '{@link vdml.ResourceUse#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use</em>' reference list.
	 * @see vdml.VdmlPackage#getInputPort_ResourceUse()
	 * @see vdml.ResourceUse#getResource
	 * @model opposite="resource" ordered="false"
	 * @generated
	 */
	EList<ResourceUse> getResourceUse();

	/**
	 * Returns the value of the '<em><b>Delegated Input</b></em>' reference list.
	 * The list contents are of type {@link vdml.InputDelegation}.
	 * It is bidirectional and its opposite is '{@link vdml.InputDelegation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Input</em>' reference list.
	 * @see vdml.VdmlPackage#getInputPort_DelegatedInput()
	 * @see vdml.InputDelegation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<InputDelegation> getDelegatedInput();

	/**
	 * Returns the value of the '<em><b>Input Delegation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.InputDelegation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Delegation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Delegation</em>' reference.
	 * @see #setInputDelegation(InputDelegation)
	 * @see vdml.VdmlPackage#getInputPort_InputDelegation()
	 * @see vdml.InputDelegation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	InputDelegation getInputDelegation();

	/**
	 * Sets the value of the '{@link vdml.InputPort#getInputDelegation <em>Input Delegation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Delegation</em>' reference.
	 * @see #getInputDelegation()
	 * @generated
	 */
	void setInputDelegation(InputDelegation value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.Role#getRoleResource <em>Role Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see vdml.VdmlPackage#getInputPort_Role()
	 * @see vdml.Role#getRoleResource
	 * @model opposite="roleResource" ordered="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link vdml.InputPort#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Input Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Definition</em>' reference.
	 * @see #setInputDefinition(BusinessItemDefinition)
	 * @see vdml.VdmlPackage#getInputPort_InputDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	BusinessItemDefinition getInputDefinition();

	/**
	 * Sets the value of the '{@link vdml.InputPort#getInputDefinition <em>Input Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Definition</em>' reference.
	 * @see #getInputDefinition()
	 * @generated
	 */
	void setInputDefinition(BusinessItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(Expression)
	 * @see vdml.VdmlPackage#getInputPort_CorrelationExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getCorrelationExpression();

	/**
	 * Sets the value of the '{@link vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.DeliverableFlow#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DeliverableFlow)
	 * @see vdml.VdmlPackage#getInputPort_Input()
	 * @see vdml.DeliverableFlow#getRecipient
	 * @model opposite="recipient" ordered="false"
	 * @generated
	 */
	DeliverableFlow getInput();

	/**
	 * Sets the value of the '{@link vdml.InputPort#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DeliverableFlow value);

} // InputPort
