/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.MeasureCategory#getCategory <em>Category</em>}</li>
 *   <li>{@link smm.MeasureCategory#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link smm.MeasureCategory#getCategoryMeasure <em>Category Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getMeasureCategory()
 * @model
 * @generated
 */
public interface MeasureCategory extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasureCategory}.
	 * It is bidirectional and its opposite is '{@link smm.MeasureCategory#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see smm.SmmPackage#getMeasureCategory_Category()
	 * @see smm.MeasureCategory#getCategoryElement
	 * @model opposite="categoryElement" required="true"
	 * @generated
	 */
	EList<MeasureCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Category Element</b></em>' reference list.
	 * The list contents are of type {@link smm.MeasureCategory}.
	 * It is bidirectional and its opposite is '{@link smm.MeasureCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Element</em>' reference list.
	 * @see smm.SmmPackage#getMeasureCategory_CategoryElement()
	 * @see smm.MeasureCategory#getCategory
	 * @model opposite="category" required="true"
	 * @generated
	 */
	EList<MeasureCategory> getCategoryElement();

	/**
	 * Returns the value of the '<em><b>Category Measure</b></em>' reference list.
	 * The list contents are of type {@link smm.Measure}.
	 * It is bidirectional and its opposite is '{@link smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Measure</em>' reference list.
	 * @see smm.SmmPackage#getMeasureCategory_CategoryMeasure()
	 * @see smm.Measure#getCategory
	 * @model opposite="category" required="true"
	 * @generated
	 */
	EList<Measure> getCategoryMeasure();

} // MeasureCategory
