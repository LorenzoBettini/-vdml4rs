/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.SmmModel#getObservations <em>Observations</em>}</li>
 *   <li>{@link smm.SmmModel#getLibrairies <em>Librairies</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getSmmModel()
 * @model
 * @generated
 */
public interface SmmModel extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
	 * The list contents are of type {@link smm.Observation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' containment reference list.
	 * @see smm.SmmPackage#getSmmModel_Observations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Observation> getObservations();

	/**
	 * Returns the value of the '<em><b>Librairies</b></em>' containment reference list.
	 * The list contents are of type {@link smm.MeasureLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librairies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librairies</em>' containment reference list.
	 * @see smm.SmmPackage#getSmmModel_Librairies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasureLibrary> getLibrairies();

} // SmmModel
