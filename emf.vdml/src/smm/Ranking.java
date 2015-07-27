/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.Ranking#getInterval <em>Interval</em>}</li>
 *   <li>{@link smm.Ranking#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRanking()
 * @model
 * @generated
 */
public interface Ranking extends Measure {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link smm.RankingInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see smm.SmmPackage#getRanking_Interval()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RankingInterval> getInterval();

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
	 * @see smm.SmmPackage#getRanking_RankingTo()
	 * @model required="true"
	 * @generated
	 */
	EObject getRankingTo();

	/**
	 * Sets the value of the '{@link smm.Ranking#getRankingTo <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking To</em>' reference.
	 * @see #getRankingTo()
	 * @generated
	 */
	void setRankingTo(EObject value);

} // Ranking
