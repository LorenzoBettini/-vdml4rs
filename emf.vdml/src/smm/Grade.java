/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Grade#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link smm.Grade#getValue <em>Value</em>}</li>
 *   <li>{@link smm.Grade#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends Measurement {
	/**
	 * Returns the value of the '<em><b>Is Base Supplied</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Supplied</em>' reference.
	 * @see #setIsBaseSupplied(EObject)
	 * @see smm.SmmPackage#getGrade_IsBaseSupplied()
	 * @model required="true"
	 * @generated
	 */
	EObject getIsBaseSupplied();

	/**
	 * Sets the value of the '{@link smm.Grade#getIsBaseSupplied <em>Is Base Supplied</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' reference.
	 * @see #getIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(EObject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see smm.SmmPackage#getGrade_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link smm.Grade#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Ranking To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranking To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking To</em>' reference.
	 * @see #setRankingTo(EObject)
	 * @see smm.SmmPackage#getGrade_RankingTo()
	 * @model required="true"
	 * @generated
	 */
	EObject getRankingTo();

	/**
	 * Sets the value of the '{@link smm.Grade#getRankingTo <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking To</em>' reference.
	 * @see #getRankingTo()
	 * @generated
	 */
	void setRankingTo(EObject value);

} // Grade
