/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Measure#getCategory <em>Category</em>}</li>
 *   <li>{@link smm.Measure#getTrait <em>Trait</em>}</li>
 *   <li>{@link smm.Measure#getScope <em>Scope</em>}</li>
 *   <li>{@link smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}</li>
 *   <li>{@link smm.Measure#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link smm.Measure#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link smm.Measure#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link smm.Measure#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link smm.Measure#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link smm.Measure#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}</li>
 *   <li>{@link smm.Measure#getVisible <em>Visible</em>}</li>
 *   <li>{@link smm.Measure#getMeasureRelationships <em>Measure Relationships</em>}</li>
 *   <li>{@link smm.Measure#getDefaultQuery <em>Default Query</em>}</li>
 *   <li>{@link smm.Measure#getInbound <em>Inbound</em>}</li>
 *   <li>{@link smm.Measure#getOutbound <em>Outbound</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasureCategory}.
	 * It is bidirectional and its opposite is '{@link smm.MeasureCategory#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_Category()
	 * @see smm.MeasureCategory#getCategoryMeasure
	 * @model opposite="categoryMeasure" required="true"
	 * @generated
	 */
	EList<MeasureCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' reference.
	 * @see #setTrait(EObject)
	 * @see smm.SmmPackage#getMeasure_Trait()
	 * @model required="true"
	 * @generated
	 */
	EObject getTrait();

	/**
	 * Sets the value of the '{@link smm.Measure#getTrait <em>Trait</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' reference.
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(EObject value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EObject)
	 * @see smm.SmmPackage#getMeasure_Scope()
	 * @model required="true"
	 * @generated
	 */
	EObject getScope();

	/**
	 * Sets the value of the '{@link smm.Measure#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EObject value);

	/**
	 * Returns the value of the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Label Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Label Format</em>' attribute.
	 * @see #setMeasureLabelFormat(String)
	 * @see smm.SmmPackage#getMeasure_MeasureLabelFormat()
	 * @model dataType="smm.String" required="true"
	 * @generated
	 */
	Object getMeasureLabelFormat();

	/**
	 * Sets the value of the '{@link smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Label Format</em>' attribute.
	 * @see #getMeasureLabelFormat()
	 * @generated
	 */
	void setMeasureLabelFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Refinement To</b></em>' reference list.
	 * The list contents are of type {@link smm.RefinementMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RefinementMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement To</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_RefinementTo()
	 * @see smm.RefinementMeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<RefinementMeasureRelationship> getRefinementTo();

	/**
	 * Returns the value of the '<em><b>Refinement From</b></em>' reference list.
	 * The list contents are of type {@link smm.RefinementMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.RefinementMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement From</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_RefinementFrom()
	 * @see smm.RefinementMeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<RefinementMeasureRelationship> getRefinementFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link smm.EquivalentMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.EquivalentMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_EquivalentTo()
	 * @see smm.EquivalentMeasureRelationship#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	EList<EquivalentMeasureRelationship> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link smm.EquivalentMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link smm.EquivalentMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_EquivalentFrom()
	 * @see smm.EquivalentMeasureRelationship#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	EList<EquivalentMeasureRelationship> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive To</em>' reference.
	 * @see #setRecursiveTo(EObject)
	 * @see smm.SmmPackage#getMeasure_RecursiveTo()
	 * @model required="true"
	 * @generated
	 */
	EObject getRecursiveTo();

	/**
	 * Sets the value of the '{@link smm.Measure#getRecursiveTo <em>Recursive To</em>}' reference.
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
	 * @see smm.SmmPackage#getMeasure_RecursiveFrom()
	 * @model required="true"
	 * @generated
	 */
	EObject getRecursiveFrom();

	/**
	 * Sets the value of the '{@link smm.Measure#getRecursiveFrom <em>Recursive From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive From</em>' reference.
	 * @see #getRecursiveFrom()
	 * @generated
	 */
	void setRecursiveFrom(EObject value);

	/**
	 * Returns the value of the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Label Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Label Format</em>' attribute.
	 * @see #setMeasurementLabelFormat(String)
	 * @see smm.SmmPackage#getMeasure_MeasurementLabelFormat()
	 * @model dataType="smm.String" required="true"
	 * @generated
	 */
	Object getMeasurementLabelFormat();

	/**
	 * Sets the value of the '{@link smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Label Format</em>' attribute.
	 * @see #getMeasurementLabelFormat()
	 * @generated
	 */
	void setMeasurementLabelFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' reference.
	 * @see #setVisible(EObject)
	 * @see smm.SmmPackage#getMeasure_Visible()
	 * @model required="true"
	 * @generated
	 */
	EObject getVisible();

	/**
	 * Sets the value of the '{@link smm.Measure#getVisible <em>Visible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' reference.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(EObject value);

	/**
	 * Returns the value of the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link smm.MeasureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Relationships</em>' containment reference list.
	 * @see smm.SmmPackage#getMeasure_MeasureRelationships()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasureRelationship> getMeasureRelationships();

	/**
	 * Returns the value of the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Query</em>' reference.
	 * @see #setDefaultQuery(EObject)
	 * @see smm.SmmPackage#getMeasure_DefaultQuery()
	 * @model required="true"
	 * @generated
	 */
	EObject getDefaultQuery();

	/**
	 * Sets the value of the '{@link smm.Measure#getDefaultQuery <em>Default Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Query</em>' reference.
	 * @see #getDefaultQuery()
	 * @generated
	 */
	void setDefaultQuery(EObject value);

	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_Inbound()
	 * @model required="true"
	 * @generated
	 */
	EList<MeasureRelationship> getInbound();

	/**
	 * Returns the value of the '<em><b>Outbound</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound</em>' reference list.
	 * @see smm.SmmPackage#getMeasure_Outbound()
	 * @model required="true"
	 * @generated
	 */
	EList<MeasureRelationship> getOutbound();

} // Measure
