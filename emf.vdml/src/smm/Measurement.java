/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link smm.Measurement#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link smm.Measurement#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link smm.Measurement#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link smm.Measurement#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link smm.Measurement#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link smm.Measurement#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link smm.Measurement#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link smm.Measurement#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link smm.Measurement#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 *   <li>{@link smm.Measurement#getInbound <em>Inbound</em>}</li>
 *   <li>{@link smm.Measurement#getOutbound <em>Outbound</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(EObject)
	 * @see smm.SmmPackage#getMeasurement_Error()
	 * @model required="true"
	 * @generated
	 */
	EObject getError();

	/**
	 * Sets the value of the '{@link smm.Measurement#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(EObject value);

	/**
	 * Returns the value of the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurand</em>' reference.
	 * @see #setMeasurand(EObject)
	 * @see smm.SmmPackage#getMeasurement_Measurand()
	 * @model required="true"
	 * @generated
	 */
	EObject getMeasurand();

	/**
	 * Sets the value of the '{@link smm.Measurement#getMeasurand <em>Measurand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurand</em>' reference.
	 * @see #getMeasurand()
	 * @generated
	 */
	void setMeasurand(EObject value);

	/**
	 * Returns the value of the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Value</em>' reference.
	 * @see #setBreakValue(EObject)
	 * @see smm.SmmPackage#getMeasurement_BreakValue()
	 * @model required="true"
	 * @generated
	 */
	EObject getBreakValue();

	/**
	 * Sets the value of the '{@link smm.Measurement#getBreakValue <em>Break Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Value</em>' reference.
	 * @see #getBreakValue()
	 * @generated
	 */
	void setBreakValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Refinement To</b></em>' reference list.
	 * The list contents are of type {@link smm.RefinementMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RefinementMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement To</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_RefinementTo()
	 * @see smm.RefinementMeasurementRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<RefinementMeasurementRelationship> getRefinementTo();

	/**
	 * Returns the value of the '<em><b>Refinement From</b></em>' reference list.
	 * The list contents are of type {@link smm.RefinementMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RefinementMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement From</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_RefinementFrom()
	 * @see smm.RefinementMeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RefinementMeasurementRelationship> getRefinementFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link smm.EquivalentMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_EquivalentTo()
	 * @see smm.EquivalentMeasurementRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<EquivalentMeasurementRelationship> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link smm.EquivalentMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.EquivalentMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_EquivalentFrom()
	 * @see smm.EquivalentMeasurementRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<EquivalentMeasurementRelationship> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Recursive To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive To</em>' reference.
	 * @see #setRecursiveTo(EObject)
	 * @see smm.SmmPackage#getMeasurement_RecursiveTo()
	 * @see smm.RecursiveMeasurementRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EObject getRecursiveTo();

	/**
	 * Sets the value of the '{@link smm.Measurement#getRecursiveTo <em>Recursive To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive To</em>' reference.
	 * @see #getRecursiveTo()
	 * @generated
	 */
	void setRecursiveTo(EObject value);

	/**
	 * Returns the value of the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive From</em>' reference.
	 * @see #setRecursiveFrom(EObject)
	 * @see smm.SmmPackage#getMeasurement_RecursiveFrom()
	 * @model required="true"
	 * @generated
	 */
	EObject getRecursiveFrom();

	/**
	 * Sets the value of the '{@link smm.Measurement#getRecursiveFrom <em>Recursive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive From</em>' reference.
	 * @see #getRecursiveFrom()
	 * @generated
	 */
	void setRecursiveFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link smm.MeasurementRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Relationships</em>' containment reference list.
	 * @see smm.SmmPackage#getMeasurement_MeasurementRelationships()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasurementRelationship> getMeasurementRelationships();

	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasurementRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_Inbound()
	 * @model required="true"
	 * @generated
	 */
	EList<MeasurementRelationship> getInbound();

	/**
	 * Returns the value of the '<em><b>Outbound</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasurementRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound</em>' reference list.
	 * @see smm.SmmPackage#getMeasurement_Outbound()
	 * @model required="true"
	 * @generated
	 */
	EList<MeasurementRelationship> getOutbound();

} // Measurement
