/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.Scope;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smm.impl.ScopeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link smm.impl.ScopeImpl#getRecognizer <em>Recognizer</em>}</li>
 *   <li>{@link smm.impl.ScopeImpl#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends AbstractMeasureElementImpl implements Scope {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EObject class_;

	/**
	 * The cached value of the '{@link #getRecognizer() <em>Recognizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizer()
	 * @generated
	 * @ordered
	 */
	protected EObject recognizer;

	/**
	 * The cached value of the '{@link #getBreakCondition() <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
	protected EObject breakCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.SCOPE__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(EObject newClass) {
		EObject oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRecognizer() {
		if (recognizer != null && recognizer.eIsProxy()) {
			InternalEObject oldRecognizer = (InternalEObject)recognizer;
			recognizer = eResolveProxy(oldRecognizer);
			if (recognizer != oldRecognizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
			}
		}
		return recognizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRecognizer() {
		return recognizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognizer(EObject newRecognizer) {
		EObject oldRecognizer = recognizer;
		recognizer = newRecognizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBreakCondition() {
		if (breakCondition != null && breakCondition.eIsProxy()) {
			InternalEObject oldBreakCondition = (InternalEObject)breakCondition;
			breakCondition = eResolveProxy(oldBreakCondition);
			if (breakCondition != oldBreakCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
			}
		}
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBreakCondition() {
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakCondition(EObject newBreakCondition) {
		EObject oldBreakCondition = breakCondition;
		breakCondition = newBreakCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.SCOPE__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case SmmPackage.SCOPE__RECOGNIZER:
				if (resolve) return getRecognizer();
				return basicGetRecognizer();
			case SmmPackage.SCOPE__BREAK_CONDITION:
				if (resolve) return getBreakCondition();
				return basicGetBreakCondition();
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
			case SmmPackage.SCOPE__CLASS:
				setClass((EObject)newValue);
				return;
			case SmmPackage.SCOPE__RECOGNIZER:
				setRecognizer((EObject)newValue);
				return;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((EObject)newValue);
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
			case SmmPackage.SCOPE__CLASS:
				setClass((EObject)null);
				return;
			case SmmPackage.SCOPE__RECOGNIZER:
				setRecognizer((EObject)null);
				return;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((EObject)null);
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
			case SmmPackage.SCOPE__CLASS:
				return class_ != null;
			case SmmPackage.SCOPE__RECOGNIZER:
				return recognizer != null;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				return breakCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ScopeImpl
