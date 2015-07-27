/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.RescaledMeasure#getFormula <em>Formula</em>}</li>
 *   <li>{@link smm.RescaledMeasure#getRescaleFrom <em>Rescale From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRescaledMeasure()
 * @model
 * @generated
 */
public interface RescaledMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' reference.
	 * @see #setFormula(EObject)
	 * @see smm.SmmPackage#getRescaledMeasure_Formula()
	 * @model required="true"
	 * @generated
	 */
	EObject getFormula();

	/**
	 * Sets the value of the '{@link smm.RescaledMeasure#getFormula <em>Formula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(EObject value);

	/**
	 * Returns the value of the '<em><b>Rescale From</b></em>' reference list.
	 * The list contents are of type {@link smm.RescaleMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RescaleMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale From</em>' reference list.
	 * @see smm.SmmPackage#getRescaledMeasure_RescaleFrom()
	 * @see smm.RescaleMeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RescaleMeasureRelationship> getRescaleFrom();

} // RescaledMeasure
