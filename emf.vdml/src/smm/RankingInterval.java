/**
 */
package smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link smm.RankingInterval#getMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link smm.RankingInterval#getMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link smm.RankingInterval#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see smm.SmmPackage#getRankingInterval()
 * @model
 * @generated
 */
public interface RankingInterval extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Maximum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Endpoint</em>' attribute.
	 * @see #setMaximumEndpoint(Double)
	 * @see smm.SmmPackage#getRankingInterval_MaximumEndpoint()
	 * @model dataType="smm.Double" required="true"
	 * @generated
	 */
	Object getMaximumEndpoint();

	/**
	 * Sets the value of the '{@link smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Endpoint</em>' attribute.
	 * @see #getMaximumEndpoint()
	 * @generated
	 */
	void setMaximumEndpoint(Object value);

	/**
	 * Returns the value of the '<em><b>Maximum Open</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Open</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Open</em>' reference.
	 * @see #setMaximumOpen(EObject)
	 * @see smm.SmmPackage#getRankingInterval_MaximumOpen()
	 * @model required="true"
	 * @generated
	 */
	EObject getMaximumOpen();

	/**
	 * Sets the value of the '{@link smm.RankingInterval#getMaximumOpen <em>Maximum Open</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Open</em>' reference.
	 * @see #getMaximumOpen()
	 * @generated
	 */
	void setMaximumOpen(EObject value);

	/**
	 * Returns the value of the '<em><b>Minimum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Endpoint</em>' attribute.
	 * @see #setMinimumEndpoint(Double)
	 * @see smm.SmmPackage#getRankingInterval_MinimumEndpoint()
	 * @model dataType="smm.Double" required="true"
	 * @generated
	 */
	Object getMinimumEndpoint();

	/**
	 * Sets the value of the '{@link smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Endpoint</em>' attribute.
	 * @see #getMinimumEndpoint()
	 * @generated
	 */
	void setMinimumEndpoint(Object value);

	/**
	 * Returns the value of the '<em><b>Minimum Open</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Open</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Open</em>' reference.
	 * @see #setMinimumOpen(EObject)
	 * @see smm.SmmPackage#getRankingInterval_MinimumOpen()
	 * @model required="true"
	 * @generated
	 */
	EObject getMinimumOpen();

	/**
	 * Sets the value of the '{@link smm.RankingInterval#getMinimumOpen <em>Minimum Open</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Open</em>' reference.
	 * @see #getMinimumOpen()
	 * @generated
	 */
	void setMinimumOpen(EObject value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(EObject)
	 * @see smm.SmmPackage#getRankingInterval_Symbol()
	 * @model required="true"
	 * @generated
	 */
	EObject getSymbol();

	/**
	 * Sets the value of the '{@link smm.RankingInterval#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(EObject value);

} // RankingInterval
