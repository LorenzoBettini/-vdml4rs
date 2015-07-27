/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.OutputPort#getOutput <em>Output</em>}</li>
 *   <li>{@link vdml.OutputPort#getOutputDefinition <em>Output Definition</em>}</li>
 *   <li>{@link vdml.OutputPort#getValueAdd <em>Value Add</em>}</li>
 *   <li>{@link vdml.OutputPort#getDelegatedOutput <em>Delegated Output</em>}</li>
 *   <li>{@link vdml.OutputPort#getOutputDelegation <em>Output Delegation</em>}</li>
 *   <li>{@link vdml.OutputPort#getResourceUse <em>Resource Use</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.DeliverableFlow#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(DeliverableFlow)
	 * @see vdml.VdmlPackage#getOutputPort_Output()
	 * @see vdml.DeliverableFlow#getProvider
	 * @model opposite="provider" ordered="false"
	 * @generated
	 */
	DeliverableFlow getOutput();

	/**
	 * Sets the value of the '{@link vdml.OutputPort#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DeliverableFlow value);

	/**
	 * Returns the value of the '<em><b>Output Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Definition</em>' reference.
	 * @see #setOutputDefinition(BusinessItemDefinition)
	 * @see vdml.VdmlPackage#getOutputPort_OutputDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	BusinessItemDefinition getOutputDefinition();

	/**
	 * Sets the value of the '{@link vdml.OutputPort#getOutputDefinition <em>Output Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Definition</em>' reference.
	 * @see #getOutputDefinition()
	 * @generated
	 */
	void setOutputDefinition(BusinessItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Value Add</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.ValueAdd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Add</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Add</em>' containment reference list.
	 * @see vdml.VdmlPackage#getOutputPort_ValueAdd()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueAdd> getValueAdd();

	/**
	 * Returns the value of the '<em><b>Delegated Output</b></em>' reference list.
	 * The list contents are of type {@link vdml.OutputDelegation}.
	 * It is bidirectional and its opposite is '{@link vdml.OutputDelegation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Output</em>' reference list.
	 * @see vdml.VdmlPackage#getOutputPort_DelegatedOutput()
	 * @see vdml.OutputDelegation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<OutputDelegation> getDelegatedOutput();

	/**
	 * Returns the value of the '<em><b>Output Delegation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.OutputDelegation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Delegation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Delegation</em>' reference.
	 * @see #setOutputDelegation(OutputDelegation)
	 * @see vdml.VdmlPackage#getOutputPort_OutputDelegation()
	 * @see vdml.OutputDelegation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	OutputDelegation getOutputDelegation();

	/**
	 * Sets the value of the '{@link vdml.OutputPort#getOutputDelegation <em>Output Delegation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Delegation</em>' reference.
	 * @see #getOutputDelegation()
	 * @generated
	 */
	void setOutputDelegation(OutputDelegation value);

	/**
	 * Returns the value of the '<em><b>Resource Use</b></em>' reference list.
	 * The list contents are of type {@link vdml.ResourceUse}.
	 * It is bidirectional and its opposite is '{@link vdml.ResourceUse#getDeliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use</em>' reference list.
	 * @see vdml.VdmlPackage#getOutputPort_ResourceUse()
	 * @see vdml.ResourceUse#getDeliverable
	 * @model opposite="deliverable" ordered="false"
	 * @generated
	 */
	EList<ResourceUse> getResourceUse();

} // OutputPort
