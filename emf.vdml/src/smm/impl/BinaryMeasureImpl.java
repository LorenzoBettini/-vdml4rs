/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.Base1MeasureRelationship;
import smm.Base2MeasureRelationship;
import smm.BinaryMeasure;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.BinaryMeasureImpl#getBaseMeasure2To <em>Base Measure2 To</em>}</li>
 *   <li>{@link smm.impl.BinaryMeasureImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link smm.impl.BinaryMeasureImpl#getBaseMeasure1To <em>Base Measure1 To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryMeasureImpl extends DimensionalMeasureImpl implements BinaryMeasure {
	/**
	 * The cached value of the '{@link #getBaseMeasure2To() <em>Base Measure2 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure2To()
	 * @generated
	 * @ordered
	 */
	protected Base2MeasureRelationship baseMeasure2To;

	/**
	 * The cached value of the '{@link #getFunctor() <em>Functor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
	protected EObject functor;

	/**
	 * The cached value of the '{@link #getBaseMeasure1To() <em>Base Measure1 To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure1To()
	 * @generated
	 * @ordered
	 */
	protected Base1MeasureRelationship baseMeasure1To;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.BINARY_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base2MeasureRelationship getBaseMeasure2To() {
		if (baseMeasure2To != null && baseMeasure2To.eIsProxy()) {
			InternalEObject oldBaseMeasure2To = (InternalEObject)baseMeasure2To;
			baseMeasure2To = (Base2MeasureRelationship)eResolveProxy(oldBaseMeasure2To);
			if (baseMeasure2To != oldBaseMeasure2To) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO, oldBaseMeasure2To, baseMeasure2To));
			}
		}
		return baseMeasure2To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base2MeasureRelationship basicGetBaseMeasure2To() {
		return baseMeasure2To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseMeasure2To(Base2MeasureRelationship newBaseMeasure2To, NotificationChain msgs) {
		Base2MeasureRelationship oldBaseMeasure2To = baseMeasure2To;
		baseMeasure2To = newBaseMeasure2To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO, oldBaseMeasure2To, newBaseMeasure2To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasure2To(Base2MeasureRelationship newBaseMeasure2To) {
		if (newBaseMeasure2To != baseMeasure2To) {
			NotificationChain msgs = null;
			if (baseMeasure2To != null)
				msgs = ((InternalEObject)baseMeasure2To).eInverseRemove(this, SmmPackage.BASE2_MEASURE_RELATIONSHIP__FROM, Base2MeasureRelationship.class, msgs);
			if (newBaseMeasure2To != null)
				msgs = ((InternalEObject)newBaseMeasure2To).eInverseAdd(this, SmmPackage.BASE2_MEASURE_RELATIONSHIP__FROM, Base2MeasureRelationship.class, msgs);
			msgs = basicSetBaseMeasure2To(newBaseMeasure2To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO, newBaseMeasure2To, newBaseMeasure2To));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFunctor() {
		if (functor != null && functor.eIsProxy()) {
			InternalEObject oldFunctor = (InternalEObject)functor;
			functor = eResolveProxy(oldFunctor);
			if (functor != oldFunctor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BINARY_MEASURE__FUNCTOR, oldFunctor, functor));
			}
		}
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetFunctor() {
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctor(EObject newFunctor) {
		EObject oldFunctor = functor;
		functor = newFunctor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__FUNCTOR, oldFunctor, functor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base1MeasureRelationship getBaseMeasure1To() {
		if (baseMeasure1To != null && baseMeasure1To.eIsProxy()) {
			InternalEObject oldBaseMeasure1To = (InternalEObject)baseMeasure1To;
			baseMeasure1To = (Base1MeasureRelationship)eResolveProxy(oldBaseMeasure1To);
			if (baseMeasure1To != oldBaseMeasure1To) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO, oldBaseMeasure1To, baseMeasure1To));
			}
		}
		return baseMeasure1To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base1MeasureRelationship basicGetBaseMeasure1To() {
		return baseMeasure1To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseMeasure1To(Base1MeasureRelationship newBaseMeasure1To, NotificationChain msgs) {
		Base1MeasureRelationship oldBaseMeasure1To = baseMeasure1To;
		baseMeasure1To = newBaseMeasure1To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO, oldBaseMeasure1To, newBaseMeasure1To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasure1To(Base1MeasureRelationship newBaseMeasure1To) {
		if (newBaseMeasure1To != baseMeasure1To) {
			NotificationChain msgs = null;
			if (baseMeasure1To != null)
				msgs = ((InternalEObject)baseMeasure1To).eInverseRemove(this, SmmPackage.BASE1_MEASURE_RELATIONSHIP__FROM, Base1MeasureRelationship.class, msgs);
			if (newBaseMeasure1To != null)
				msgs = ((InternalEObject)newBaseMeasure1To).eInverseAdd(this, SmmPackage.BASE1_MEASURE_RELATIONSHIP__FROM, Base1MeasureRelationship.class, msgs);
			msgs = basicSetBaseMeasure1To(newBaseMeasure1To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO, newBaseMeasure1To, newBaseMeasure1To));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				if (baseMeasure2To != null)
					msgs = ((InternalEObject)baseMeasure2To).eInverseRemove(this, SmmPackage.BASE2_MEASURE_RELATIONSHIP__FROM, Base2MeasureRelationship.class, msgs);
				return basicSetBaseMeasure2To((Base2MeasureRelationship)otherEnd, msgs);
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				if (baseMeasure1To != null)
					msgs = ((InternalEObject)baseMeasure1To).eInverseRemove(this, SmmPackage.BASE1_MEASURE_RELATIONSHIP__FROM, Base1MeasureRelationship.class, msgs);
				return basicSetBaseMeasure1To((Base1MeasureRelationship)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				return basicSetBaseMeasure2To(null, msgs);
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				return basicSetBaseMeasure1To(null, msgs);
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
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				if (resolve) return getBaseMeasure2To();
				return basicGetBaseMeasure2To();
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				if (resolve) return getFunctor();
				return basicGetFunctor();
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				if (resolve) return getBaseMeasure1To();
				return basicGetBaseMeasure1To();
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
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				setBaseMeasure2To((Base2MeasureRelationship)newValue);
				return;
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor((EObject)newValue);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				setBaseMeasure1To((Base1MeasureRelationship)newValue);
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
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				setBaseMeasure2To((Base2MeasureRelationship)null);
				return;
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor((EObject)null);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				setBaseMeasure1To((Base1MeasureRelationship)null);
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
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				return baseMeasure2To != null;
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				return functor != null;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				return baseMeasure1To != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryMeasureImpl
