/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.ObservedMeasure#getMeasure <em>Measure</em>}</li>
 *   <li>{@link smm.ObservedMeasure#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getObservedMeasure()
 * @model
 * @generated
 */
public interface ObservedMeasure extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference.
	 * @see #setMeasure(EObject)
	 * @see smm.SmmPackage#getObservedMeasure_Measure()
	 * @model required="true"
	 * @generated
	 */
	EObject getMeasure();

	/**
	 * Sets the value of the '{@link smm.ObservedMeasure#getMeasure <em>Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(EObject value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link smm.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see smm.SmmPackage#getObservedMeasure_Measurements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

} // ObservedMeasure
