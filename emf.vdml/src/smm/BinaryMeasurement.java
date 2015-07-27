/**
 */
package smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}</li>
 *   <li>{@link smm.BinaryMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getBinaryMeasurement()
 * @model
 * @generated
 */
public interface BinaryMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link smm.Base2MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement2 To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement2 To</em>' containment reference.
	 * @see #setBaseMeasurement2To(Base2MeasurementRelationship)
	 * @see smm.SmmPackage#getBinaryMeasurement_BaseMeasurement2To()
	 * @see smm.Base2MeasurementRelationship#getFrom
	 * @model opposite="from" containment="true" required="true"
	 * @generated
	 */
	Base2MeasurementRelationship getBaseMeasurement2To();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measurement2 To</em>' containment reference.
	 * @see #getBaseMeasurement2To()
	 * @generated
	 */
	void setBaseMeasurement2To(Base2MeasurementRelationship value);

	/**
	 * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #setIsBaseSupplied(Boolean)
	 * @see smm.SmmPackage#getBinaryMeasurement_IsBaseSupplied()
	 * @model dataType="smm.Boolean" required="true"
	 * @generated
	 */
	Object getIsBaseSupplied();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #getIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(Object value);

	/**
	 * Returns the value of the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link smm.Base1MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement1 To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement1 To</em>' containment reference.
	 * @see #setBaseMeasurement1To(Base1MeasurementRelationship)
	 * @see smm.SmmPackage#getBinaryMeasurement_BaseMeasurement1To()
	 * @see smm.Base1MeasurementRelationship#getFrom
	 * @model opposite="from" containment="true" required="true"
	 * @generated
	 */
	Base1MeasurementRelationship getBaseMeasurement1To();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measurement1 To</em>' containment reference.
	 * @see #getBaseMeasurement1To()
	 * @generated
	 */
	void setBaseMeasurement1To(Base1MeasurementRelationship value);

} // BinaryMeasurement
