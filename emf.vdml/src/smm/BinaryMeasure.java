/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}</li>
 *   <li>{@link smm.BinaryMeasure#getFunctor <em>Functor</em>}</li>
 *   <li>{@link smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getBinaryMeasure()
 * @model
 * @generated
 */
public interface BinaryMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Base Measure2 To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Base2MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2 To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure2 To</em>' reference.
	 * @see #setBaseMeasure2To(Base2MeasureRelationship)
	 * @see smm.SmmPackage#getBinaryMeasure_BaseMeasure2To()
	 * @see smm.Base2MeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	Base2MeasureRelationship getBaseMeasure2To();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure2 To</em>' reference.
	 * @see #getBaseMeasure2To()
	 * @generated
	 */
	void setBaseMeasure2To(Base2MeasureRelationship value);

	/**
	 * Returns the value of the '<em><b>Functor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor</em>' reference.
	 * @see #setFunctor(EObject)
	 * @see smm.SmmPackage#getBinaryMeasure_Functor()
	 * @model required="true"
	 * @generated
	 */
	EObject getFunctor();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasure#getFunctor <em>Functor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor</em>' reference.
	 * @see #getFunctor()
	 * @generated
	 */
	void setFunctor(EObject value);

	/**
	 * Returns the value of the '<em><b>Base Measure1 To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.Base1MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1 To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure1 To</em>' reference.
	 * @see #setBaseMeasure1To(Base1MeasureRelationship)
	 * @see smm.SmmPackage#getBinaryMeasure_BaseMeasure1To()
	 * @see smm.Base1MeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	Base1MeasureRelationship getBaseMeasure1To();

	/**
	 * Sets the value of the '{@link smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure1 To</em>' reference.
	 * @see #getBaseMeasure1To()
	 * @generated
	 */
	void setBaseMeasure1To(Base1MeasureRelationship value);

} // BinaryMeasure
