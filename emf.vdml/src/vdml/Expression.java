/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Expression#getBody <em>Body</em>}</li>
 *   <li>{@link vdml.Expression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(vdml.String)
	 * @see vdml.VdmlPackage#getExpression_Body()
	 * @model ordered="false"
	 * @generated
	 */
	vdml.String getBody();

	/**
	 * Sets the value of the '{@link vdml.Expression#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.Operand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see vdml.VdmlPackage#getExpression_Operand()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Operand> getOperand();

} // Expression
