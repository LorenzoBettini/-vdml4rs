/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base1 Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Base1MeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link smm.Base1MeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getBase1MeasurementRelationship()
 * @model
 * @generated
 */
public interface Base1MeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' container reference.
	 * @see #setFrom(EObject)
	 * @see smm.SmmPackage#getBase1MeasurementRelationship_From()
	 * @see smm.BinaryMeasurement#getBaseMeasurement1To
	 * @model opposite="baseMeasurement1To" required="true" transient="false"
	 * @generated
	 */
	EObject getFrom();

	/**
	 * Sets the value of the '{@link smm.Base1MeasurementRelationship#getFrom <em>From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' container reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.DimensionalMeasurement#getBaseMeasurement1From <em>Base Measurement1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EObject)
	 * @see smm.SmmPackage#getBase1MeasurementRelationship_To()
	 * @see smm.DimensionalMeasurement#getBaseMeasurement1From
	 * @model opposite="baseMeasurement1From" required="true"
	 * @generated
	 */
	EObject getTo();

	/**
	 * Sets the value of the '{@link smm.Base1MeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EObject value);

} // Base1MeasurementRelationship
