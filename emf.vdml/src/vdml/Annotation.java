/**
 */
package vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Annotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(vdml.String)
	 * @see vdml.VdmlPackage#getAnnotation_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	vdml.String getText();

	/**
	 * Sets the value of the '{@link vdml.Annotation#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(vdml.String value);

} // Annotation
