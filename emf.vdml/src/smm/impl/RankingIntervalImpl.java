/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.RankingInterval;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.RankingIntervalImpl#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link smm.impl.RankingIntervalImpl#getMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link smm.impl.RankingIntervalImpl#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link smm.impl.RankingIntervalImpl#getMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link smm.impl.RankingIntervalImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingIntervalImpl extends SmmElementImpl implements RankingInterval {
	/**
	 * The default value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAXIMUM_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Object maximumEndpoint = MAXIMUM_ENDPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaximumOpen() <em>Maximum Open</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOpen()
	 * @generated
	 * @ordered
	 */
	protected EObject maximumOpen;

	/**
	 * The default value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final Object MINIMUM_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Object minimumEndpoint = MINIMUM_ENDPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinimumOpen() <em>Minimum Open</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOpen()
	 * @generated
	 * @ordered
	 */
	protected EObject minimumOpen;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected EObject symbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RANKING_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaximumEndpoint() {
		return maximumEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumEndpoint(Object newMaximumEndpoint) {
		Object oldMaximumEndpoint = maximumEndpoint;
		maximumEndpoint = newMaximumEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT, oldMaximumEndpoint, maximumEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMaximumOpen() {
		if (maximumOpen != null && maximumOpen.eIsProxy()) {
			InternalEObject oldMaximumOpen = (InternalEObject)maximumOpen;
			maximumOpen = eResolveProxy(oldMaximumOpen);
			if (maximumOpen != oldMaximumOpen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, maximumOpen));
			}
		}
		return maximumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMaximumOpen() {
		return maximumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumOpen(EObject newMaximumOpen) {
		EObject oldMaximumOpen = maximumOpen;
		maximumOpen = newMaximumOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, maximumOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinimumEndpoint() {
		return minimumEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumEndpoint(Object newMinimumEndpoint) {
		Object oldMinimumEndpoint = minimumEndpoint;
		minimumEndpoint = newMinimumEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT, oldMinimumEndpoint, minimumEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMinimumOpen() {
		if (minimumOpen != null && minimumOpen.eIsProxy()) {
			InternalEObject oldMinimumOpen = (InternalEObject)minimumOpen;
			minimumOpen = eResolveProxy(oldMinimumOpen);
			if (minimumOpen != oldMinimumOpen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN, oldMinimumOpen, minimumOpen));
			}
		}
		return minimumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMinimumOpen() {
		return minimumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumOpen(EObject newMinimumOpen) {
		EObject oldMinimumOpen = minimumOpen;
		minimumOpen = newMinimumOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN, oldMinimumOpen, minimumOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject)symbol;
			symbol = eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING_INTERVAL__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(EObject newSymbol) {
		EObject oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				return getMaximumEndpoint();
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				if (resolve) return getMaximumOpen();
				return basicGetMaximumOpen();
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				return getMinimumEndpoint();
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				if (resolve) return getMinimumOpen();
				return basicGetMinimumOpen();
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				if (resolve) return getSymbol();
				return basicGetSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				setMaximumEndpoint((Object)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				setMaximumOpen((EObject)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				setMinimumEndpoint((Object)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				setMinimumOpen((EObject)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				setSymbol((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				setMaximumEndpoint(MAXIMUM_ENDPOINT_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				setMaximumOpen((EObject)null);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				setMinimumEndpoint(MINIMUM_ENDPOINT_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				setMinimumOpen((EObject)null);
				return;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				setSymbol((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				return MAXIMUM_ENDPOINT_EDEFAULT == null ? maximumEndpoint != null : !MAXIMUM_ENDPOINT_EDEFAULT.equals(maximumEndpoint);
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				return maximumOpen != null;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				return MINIMUM_ENDPOINT_EDEFAULT == null ? minimumEndpoint != null : !MINIMUM_ENDPOINT_EDEFAULT.equals(minimumEndpoint);
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				return minimumOpen != null;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				return symbol != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maximumEndpoint: ");
		result.append(maximumEndpoint);
		result.append(", minimumEndpoint: ");
		result.append(minimumEndpoint);
		result.append(')');
		return result.toString();
	}

} //RankingIntervalImpl
