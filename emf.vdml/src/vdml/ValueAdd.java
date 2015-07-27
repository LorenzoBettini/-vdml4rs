/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.ValueAdd#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link vdml.ValueAdd#getPropositionComponent <em>Proposition Component</em>}</li>
 *   <li>{@link vdml.ValueAdd#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link vdml.ValueAdd#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link vdml.ValueAdd#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link vdml.ValueAdd#getAggregatedTo <em>Aggregated To</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getValueAdd()
 * @model
 * @generated
 */
public interface ValueAdd extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Value Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Measurement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Measurement</em>' containment reference.
	 * @see #setValueMeasurement(MeasuredCharacteristic)
	 * @see vdml.VdmlPackage#getValueAdd_ValueMeasurement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getValueMeasurement();

	/**
	 * Sets the value of the '{@link vdml.ValueAdd#getValueMeasurement <em>Value Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Measurement</em>' containment reference.
	 * @see #getValueMeasurement()
	 * @generated
	 */
	void setValueMeasurement(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Proposition Component</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValuePropositionComponent}.
	 * It is bidirectional and its opposite is '{@link vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposition Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposition Component</em>' reference list.
	 * @see vdml.VdmlPackage#getValueAdd_PropositionComponent()
	 * @see vdml.ValuePropositionComponent#getArticulatedValue
	 * @model opposite="articulatedValue" ordered="false"
	 * @generated
	 */
	EList<ValuePropositionComponent> getPropositionComponent();

	/**
	 * Returns the value of the '<em><b>Value Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Definition</em>' reference.
	 * @see #setValueDefinition(ValueDefinition)
	 * @see vdml.VdmlPackage#getValueAdd_ValueDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	ValueDefinition getValueDefinition();

	/**
	 * Sets the value of the '{@link vdml.ValueAdd#getValueDefinition <em>Value Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Definition</em>' reference.
	 * @see #getValueDefinition()
	 * @generated
	 */
	void setValueDefinition(ValueDefinition value);

	/**
	 * Returns the value of the '<em><b>Benchmark</b></em>' containment reference list.
	 * The list contents are of type {@link vdml.MeasuredCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benchmark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark</em>' containment reference list.
	 * @see vdml.VdmlPackage#getValueAdd_Benchmark()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MeasuredCharacteristic> getBenchmark();

	/**
	 * Returns the value of the '<em><b>Aggregated From</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueAdd}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueAdd#getAggregatedTo <em>Aggregated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated From</em>' reference list.
	 * @see vdml.VdmlPackage#getValueAdd_AggregatedFrom()
	 * @see vdml.ValueAdd#getAggregatedTo
	 * @model opposite="aggregatedTo" ordered="false"
	 * @generated
	 */
	EList<ValueAdd> getAggregatedFrom();

	/**
	 * Returns the value of the '<em><b>Aggregated To</b></em>' reference list.
	 * The list contents are of type {@link vdml.ValueAdd}.
	 * It is bidirectional and its opposite is '{@link vdml.ValueAdd#getAggregatedFrom <em>Aggregated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated To</em>' reference list.
	 * @see vdml.VdmlPackage#getValueAdd_AggregatedTo()
	 * @see vdml.ValueAdd#getAggregatedFrom
	 * @model opposite="aggregatedFrom" ordered="false"
	 * @generated
	 */
	EList<ValueAdd> getAggregatedTo();

} // ValueAdd
