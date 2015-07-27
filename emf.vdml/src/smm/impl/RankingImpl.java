/**
 */
package smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smm.Ranking;
import smm.RankingInterval;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.RankingImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link smm.impl.RankingImpl#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingImpl extends MeasureImpl implements Ranking {
	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingInterval> interval;

	/**
	 * The cached value of the '{@link #getRankingTo() <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingTo()
	 * @generated
	 * @ordered
	 */
	protected EObject rankingTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RANKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingInterval> getInterval() {
		if (interval == null) {
			interval = new EObjectContainmentEList<RankingInterval>(RankingInterval.class, this, SmmPackage.RANKING__INTERVAL);
		}
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRankingTo() {
		if (rankingTo != null && rankingTo.eIsProxy()) {
			InternalEObject oldRankingTo = (InternalEObject)rankingTo;
			rankingTo = eResolveProxy(oldRankingTo);
			if (rankingTo != oldRankingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING__RANKING_TO, oldRankingTo, rankingTo));
			}
		}
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRankingTo() {
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankingTo(EObject newRankingTo) {
		EObject oldRankingTo = rankingTo;
		rankingTo = newRankingTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING__RANKING_TO, oldRankingTo, rankingTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.RANKING__INTERVAL:
				return ((InternalEList<?>)getInterval()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.RANKING__INTERVAL:
				return getInterval();
			case SmmPackage.RANKING__RANKING_TO:
				if (resolve) return getRankingTo();
				return basicGetRankingTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmmPackage.RANKING__INTERVAL:
				getInterval().clear();
				getInterval().addAll((Collection<? extends RankingInterval>)newValue);
				return;
			case SmmPackage.RANKING__RANKING_TO:
				setRankingTo((EObject)newValue);
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
			case SmmPackage.RANKING__INTERVAL:
				getInterval().clear();
				return;
			case SmmPackage.RANKING__RANKING_TO:
				setRankingTo((EObject)null);
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
			case SmmPackage.RANKING__INTERVAL:
				return interval != null && !interval.isEmpty();
			case SmmPackage.RANKING__RANKING_TO:
				return rankingTo != null;
		}
		return super.eIsSet(featureID);
	}

} //RankingImpl
