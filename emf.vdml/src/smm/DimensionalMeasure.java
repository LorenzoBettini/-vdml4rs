/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.DimensionalMeasure#getUnit <em>Unit</em>}</li>
 *   <li>{@link smm.DimensionalMeasure#getBaseMeasureFrom <em>Base Measure From</em>}</li>
 *   <li>{@link smm.DimensionalMeasure#getBaseMeasure1From <em>Base Measure1 From</em>}</li>
 *   <li>{@link smm.DimensionalMeasure#getBaseMeasure2From <em>Base Measure2 From</em>}</li>
 *   <li>{@link smm.DimensionalMeasure#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link smm.DimensionalMeasure#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getDimensionalMeasure()
 * @model
 * @generated
 */
public interface DimensionalMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(EObject)
	 * @see smm.SmmPackage#getDimensionalMeasure_Unit()
	 * @model required="true"
	 * @generated
	 */
	EObject getUnit();

	/**
	 * Sets the value of the '{@link smm.DimensionalMeasure#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(EObject value);

	/**
	 * Returns the value of the '<em><b>Base Measure From</b></em>' reference list.
	 * The list contents are of type {@link smm.BaseMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.BaseMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasure_BaseMeasureFrom()
	 * @see smm.BaseMeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<BaseMeasureRelationship> getBaseMeasureFrom();

	/**
	 * Returns the value of the '<em><b>Base Measure1 From</b></em>' reference list.
	 * The list contents are of type {@link smm.Base1MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.Base1MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure1 From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasure_BaseMeasure1From()
	 * @see smm.Base1MeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<Base1MeasureRelationship> getBaseMeasure1From();

	/**
	 * Returns the value of the '<em><b>Base Measure2 From</b></em>' reference list.
	 * The list contents are of type {@link smm.Base2MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.Base2MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2 From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure2 From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasure_BaseMeasure2From()
	 * @see smm.Base2MeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<Base2MeasureRelationship> getBaseMeasure2From();

	/**
	 * Returns the value of the '<em><b>Rescale To</b></em>' reference list.
	 * The list contents are of type {@link smm.RescaleMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RescaleMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescale To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescale To</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasure_RescaleTo()
	 * @see smm.RescaleMeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<RescaleMeasureRelationship> getRescaleTo();

	/**
	 * Returns the value of the '<em><b>Ranking From</b></em>' reference list.
	 * The list contents are of type {@link smm.RankingMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RankingMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking From</em>' reference list.
	 * @see smm.SmmPackage#getDimensionalMeasure_RankingFrom()
	 * @see smm.RankingMeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RankingMeasureRelationship> getRankingFrom();

} // DimensionalMeasure
