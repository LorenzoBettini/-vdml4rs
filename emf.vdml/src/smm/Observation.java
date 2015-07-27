/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Observation#getObserver <em>Observer</em>}</li>
 *   <li>{@link smm.Observation#getTool <em>Tool</em>}</li>
 *   <li>{@link smm.Observation#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link smm.Observation#getScopes <em>Scopes</em>}</li>
 *   <li>{@link smm.Observation#getObservedMeasures <em>Observed Measures</em>}</li>
 *   <li>{@link smm.Observation#getRequestedMeasures <em>Requested Measures</em>}</li>
 *   <li>{@link smm.Observation#getMeasurementRelations <em>Measurement Relations</em>}</li>
 *   <li>{@link smm.Observation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' reference.
	 * @see #setObserver(EObject)
	 * @see smm.SmmPackage#getObservation_Observer()
	 * @model required="true"
	 * @generated
	 */
	EObject getObserver();

	/**
	 * Sets the value of the '{@link smm.Observation#getObserver <em>Observer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(EObject value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(EObject)
	 * @see smm.SmmPackage#getObservation_Tool()
	 * @model required="true"
	 * @generated
	 */
	EObject getTool();

	/**
	 * Sets the value of the '{@link smm.Observation#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(EObject value);

	/**
	 * Returns the value of the '<em><b>When Observed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Observed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Observed</em>' reference.
	 * @see #setWhenObserved(EObject)
	 * @see smm.SmmPackage#getObservation_WhenObserved()
	 * @model required="true"
	 * @generated
	 */
	EObject getWhenObserved();

	/**
	 * Sets the value of the '{@link smm.Observation#getWhenObserved <em>When Observed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Observed</em>' reference.
	 * @see #getWhenObserved()
	 * @generated
	 */
	void setWhenObserved(EObject value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link smm.ObservationScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see smm.SmmPackage#getObservation_Scopes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ObservationScope> getScopes();

	/**
	 * Returns the value of the '<em><b>Observed Measures</b></em>' containment reference list.
	 * The list contents are of type {@link smm.ObservedMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Measures</em>' containment reference list.
	 * @see smm.SmmPackage#getObservation_ObservedMeasures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ObservedMeasure> getObservedMeasures();

	/**
	 * Returns the value of the '<em><b>Requested Measures</b></em>' reference list.
	 * The list contents are of type {@link smm.SmmElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Measures</em>' reference list.
	 * @see smm.SmmPackage#getObservation_RequestedMeasures()
	 * @model required="true"
	 * @generated
	 */
	EList<SmmElement> getRequestedMeasures();

	/**
	 * Returns the value of the '<em><b>Measurement Relations</b></em>' containment reference list.
	 * The list contents are of type {@link smm.SmmRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Relations</em>' containment reference list.
	 * @see smm.SmmPackage#getObservation_MeasurementRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SmmRelationship> getMeasurementRelations();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link smm.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see smm.SmmPackage#getObservation_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // Observation
