/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Attribute#getTag <em>Tag</em>}</li>
 *   <li>{@link vdml.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(vdml.String)
	 * @see vdml.VdmlPackage#getAttribute_Tag()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	vdml.String getTag();

	/**
	 * Sets the value of the '{@link vdml.Attribute#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(vdml.String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(vdml.String)
	 * @see vdml.VdmlPackage#getAttribute_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	vdml.String getValue();

	/**
	 * Sets the value of the '{@link vdml.Attribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(vdml.String value);

} // Attribute
