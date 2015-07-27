/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.ObservationScope;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.ObservationScopeImpl#getScopeUri <em>Scope Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationScopeImpl extends SmmElementImpl implements ObservationScope {
	/**
	 * The cached value of the '{@link #getScopeUri() <em>Scope Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeUri()
	 * @generated
	 * @ordered
	 */
	protected EObject scopeUri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.OBSERVATION_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getScopeUri() {
		if (scopeUri != null && scopeUri.eIsProxy()) {
			InternalEObject oldScopeUri = (InternalEObject)scopeUri;
			scopeUri = eResolveProxy(oldScopeUri);
			if (scopeUri != oldScopeUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.OBSERVATION_SCOPE__SCOPE_URI, oldScopeUri, scopeUri));
			}
		}
		return scopeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetScopeUri() {
		return scopeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeUri(EObject newScopeUri) {
		EObject oldScopeUri = scopeUri;
		scopeUri = newScopeUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION_SCOPE__SCOPE_URI, oldScopeUri, scopeUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.OBSERVATION_SCOPE__SCOPE_URI:
				if (resolve) return getScopeUri();
				return basicGetScopeUri();
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
			case SmmPackage.OBSERVATION_SCOPE__SCOPE_URI:
				setScopeUri((EObject)newValue);
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
			case SmmPackage.OBSERVATION_SCOPE__SCOPE_URI:
				setScopeUri((EObject)null);
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
			case SmmPackage.OBSERVATION_SCOPE__SCOPE_URI:
				return scopeUri != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationScopeImpl
