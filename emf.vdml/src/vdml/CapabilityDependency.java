/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.CapabilityDependency#isIsTangible <em>Is Tangible</em>}</li>
 *   <li>{@link vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}</li>
 *   <li>{@link vdml.CapabilityDependency#getSource <em>Source</em>}</li>
 *   <li>{@link vdml.CapabilityDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link vdml.CapabilityDependency#isIsFromExternalSource <em>Is From External Source</em>}</li>
 *   <li>{@link vdml.CapabilityDependency#isIsForExternalTarget <em>Is For External Target</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getCapabilityDependency()
 * @model
 * @generated
 */
public interface CapabilityDependency extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Is Tangible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tangible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tangible</em>' attribute.
	 * @see #setIsTangible(boolean)
	 * @see vdml.VdmlPackage#getCapabilityDependency_IsTangible()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTangible();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#isIsTangible <em>Is Tangible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tangible</em>' attribute.
	 * @see #isIsTangible()
	 * @generated
	 */
	void setIsTangible(boolean value);

	/**
	 * Returns the value of the '<em><b>Deliverable Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Definition</em>' reference.
	 * @see #setDeliverableDefinition(BusinessItemDefinition)
	 * @see vdml.VdmlPackage#getCapabilityDependency_DeliverableDefinition()
	 * @see vdml.BusinessItemDefinition#getCapabilityDependency
	 * @model opposite="capabilityDependency" required="true" ordered="false"
	 * @generated
	 */
	BusinessItemDefinition getDeliverableDefinition();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Definition</em>' reference.
	 * @see #getDeliverableDefinition()
	 * @generated
	 */
	void setDeliverableDefinition(BusinessItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityDefinition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CapabilityDefinition)
	 * @see vdml.VdmlPackage#getCapabilityDependency_Source()
	 * @see vdml.CapabilityDefinition#getOutput
	 * @model opposite="output" ordered="false"
	 * @generated
	 */
	CapabilityDefinition getSource();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CapabilityDefinition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityDefinition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CapabilityDefinition)
	 * @see vdml.VdmlPackage#getCapabilityDependency_Target()
	 * @see vdml.CapabilityDefinition#getInput
	 * @model opposite="input" ordered="false"
	 * @generated
	 */
	CapabilityDefinition getTarget();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CapabilityDefinition value);

	/**
	 * Returns the value of the '<em><b>Is From External Source</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is From External Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is From External Source</em>' attribute.
	 * @see #setIsFromExternalSource(boolean)
	 * @see vdml.VdmlPackage#getCapabilityDependency_IsFromExternalSource()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsFromExternalSource();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#isIsFromExternalSource <em>Is From External Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is From External Source</em>' attribute.
	 * @see #isIsFromExternalSource()
	 * @generated
	 */
	void setIsFromExternalSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Is For External Target</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is For External Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For External Target</em>' attribute.
	 * @see #setIsForExternalTarget(boolean)
	 * @see vdml.VdmlPackage#getCapabilityDependency_IsForExternalTarget()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsForExternalTarget();

	/**
	 * Sets the value of the '{@link vdml.CapabilityDependency#isIsForExternalTarget <em>Is For External Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is For External Target</em>' attribute.
	 * @see #isIsForExternalTarget()
	 * @generated
	 */
	void setIsForExternalTarget(boolean value);

} // CapabilityDependency
