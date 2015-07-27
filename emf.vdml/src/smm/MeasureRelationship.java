/**
 */
package smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getMeasureRelationship()
 * @model abstract="true"
 * @generated
 */
public interface MeasureRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurand Query</em>' reference.
	 * @see #setMeasurandQuery(Operation)
	 * @see smm.SmmPackage#getMeasureRelationship_MeasurandQuery()
	 * @model required="true"
	 * @generated
	 */
	Operation getMeasurandQuery();

	/**
	 * Sets the value of the '{@link smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurand Query</em>' reference.
	 * @see #getMeasurandQuery()
	 * @generated
	 */
	void setMeasurandQuery(Operation value);

} // MeasureRelationship
