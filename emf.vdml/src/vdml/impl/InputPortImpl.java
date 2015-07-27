/**
 */
package vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vdml.BusinessItemDefinition;
import vdml.DeliverableFlow;
import vdml.Expression;
import vdml.InputDelegation;
import vdml.InputPort;
import vdml.ResourceUse;
import vdml.Role;
import vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vdml.impl.InputPortImpl#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getDelegatedInput <em>Delegated Input</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getInputDelegation <em>Input Delegation</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getRole <em>Role</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getInputDefinition <em>Input Definition</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link vdml.impl.InputPortImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
	/**
	 * The cached value of the '{@link #getResourceUse() <em>Resource Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUse()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceUse> resourceUse;

	/**
	 * The cached value of the '{@link #getDelegatedInput() <em>Delegated Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputDelegation> delegatedInput;

	/**
	 * The cached value of the '{@link #getInputDelegation() <em>Input Delegation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDelegation()
	 * @generated
	 * @ordered
	 */
	protected InputDelegation inputDelegation;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getInputDefinition() <em>Input Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDefinition()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemDefinition inputDefinition;

	/**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression correlationExpression;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected DeliverableFlow input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VdmlPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceUse> getResourceUse() {
		if (resourceUse == null) {
			resourceUse = new EObjectWithInverseResolvingEList.ManyInverse<ResourceUse>(ResourceUse.class, this, VdmlPackage.INPUT_PORT__RESOURCE_USE, VdmlPackage.RESOURCE_USE__RESOURCE);
		}
		return resourceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputDelegation> getDelegatedInput() {
		if (delegatedInput == null) {
			delegatedInput = new EObjectWithInverseResolvingEList<InputDelegation>(InputDelegation.class, this, VdmlPackage.INPUT_PORT__DELEGATED_INPUT, VdmlPackage.INPUT_DELEGATION__TARGET);
		}
		return delegatedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDelegation getInputDelegation() {
		if (inputDelegation != null && inputDelegation.eIsProxy()) {
			InternalEObject oldInputDelegation = (InternalEObject)inputDelegation;
			inputDelegation = (InputDelegation)eResolveProxy(oldInputDelegation);
			if (inputDelegation != oldInputDelegation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.INPUT_PORT__INPUT_DELEGATION, oldInputDelegation, inputDelegation));
			}
		}
		return inputDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDelegation basicGetInputDelegation() {
		return inputDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputDelegation(InputDelegation newInputDelegation, NotificationChain msgs) {
		InputDelegation oldInputDelegation = inputDelegation;
		inputDelegation = newInputDelegation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__INPUT_DELEGATION, oldInputDelegation, newInputDelegation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDelegation(InputDelegation newInputDelegation) {
		if (newInputDelegation != inputDelegation) {
			NotificationChain msgs = null;
			if (inputDelegation != null)
				msgs = ((InternalEObject)inputDelegation).eInverseRemove(this, VdmlPackage.INPUT_DELEGATION__SOURCE, InputDelegation.class, msgs);
			if (newInputDelegation != null)
				msgs = ((InternalEObject)newInputDelegation).eInverseAdd(this, VdmlPackage.INPUT_DELEGATION__SOURCE, InputDelegation.class, msgs);
			msgs = basicSetInputDelegation(newInputDelegation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__INPUT_DELEGATION, newInputDelegation, newInputDelegation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.INPUT_PORT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, VdmlPackage.ROLE__ROLE_RESOURCE, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, VdmlPackage.ROLE__ROLE_RESOURCE, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition getInputDefinition() {
		if (inputDefinition != null && inputDefinition.eIsProxy()) {
			InternalEObject oldInputDefinition = (InternalEObject)inputDefinition;
			inputDefinition = (BusinessItemDefinition)eResolveProxy(oldInputDefinition);
			if (inputDefinition != oldInputDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.INPUT_PORT__INPUT_DEFINITION, oldInputDefinition, inputDefinition));
			}
		}
		return inputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition basicGetInputDefinition() {
		return inputDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDefinition(BusinessItemDefinition newInputDefinition) {
		BusinessItemDefinition oldInputDefinition = inputDefinition;
		inputDefinition = newInputDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__INPUT_DEFINITION, oldInputDefinition, inputDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCorrelationExpression() {
		return correlationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationExpression(Expression newCorrelationExpression, NotificationChain msgs) {
		Expression oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationExpression(Expression newCorrelationExpression) {
		if (newCorrelationExpression != correlationExpression) {
			NotificationChain msgs = null;
			if (correlationExpression != null)
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableFlow getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (DeliverableFlow)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.INPUT_PORT__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableFlow basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(DeliverableFlow newInput, NotificationChain msgs) {
		DeliverableFlow oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(DeliverableFlow newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, VdmlPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, VdmlPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.INPUT_PORT__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceUse()).basicAdd(otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedInput()).basicAdd(otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				if (inputDelegation != null)
					msgs = ((InternalEObject)inputDelegation).eInverseRemove(this, VdmlPackage.INPUT_DELEGATION__SOURCE, InputDelegation.class, msgs);
				return basicSetInputDelegation((InputDelegation)otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, VdmlPackage.ROLE__ROLE_RESOURCE, Role.class, msgs);
				return basicSetRole((Role)otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, VdmlPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
				return basicSetInput((DeliverableFlow)otherEnd, msgs);
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
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				return ((InternalEList<?>)getResourceUse()).basicRemove(otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				return ((InternalEList<?>)getDelegatedInput()).basicRemove(otherEnd, msgs);
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				return basicSetInputDelegation(null, msgs);
			case VdmlPackage.INPUT_PORT__ROLE:
				return basicSetRole(null, msgs);
			case VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
			case VdmlPackage.INPUT_PORT__INPUT:
				return basicSetInput(null, msgs);
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
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				return getResourceUse();
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				return getDelegatedInput();
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				if (resolve) return getInputDelegation();
				return basicGetInputDelegation();
			case VdmlPackage.INPUT_PORT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case VdmlPackage.INPUT_PORT__INPUT_DEFINITION:
				if (resolve) return getInputDefinition();
				return basicGetInputDefinition();
			case VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
			case VdmlPackage.INPUT_PORT__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
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
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				getResourceUse().clear();
				getResourceUse().addAll((Collection<? extends ResourceUse>)newValue);
				return;
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				getDelegatedInput().clear();
				getDelegatedInput().addAll((Collection<? extends InputDelegation>)newValue);
				return;
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				setInputDelegation((InputDelegation)newValue);
				return;
			case VdmlPackage.INPUT_PORT__ROLE:
				setRole((Role)newValue);
				return;
			case VdmlPackage.INPUT_PORT__INPUT_DEFINITION:
				setInputDefinition((BusinessItemDefinition)newValue);
				return;
			case VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				setCorrelationExpression((Expression)newValue);
				return;
			case VdmlPackage.INPUT_PORT__INPUT:
				setInput((DeliverableFlow)newValue);
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
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				getResourceUse().clear();
				return;
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				getDelegatedInput().clear();
				return;
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				setInputDelegation((InputDelegation)null);
				return;
			case VdmlPackage.INPUT_PORT__ROLE:
				setRole((Role)null);
				return;
			case VdmlPackage.INPUT_PORT__INPUT_DEFINITION:
				setInputDefinition((BusinessItemDefinition)null);
				return;
			case VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				setCorrelationExpression((Expression)null);
				return;
			case VdmlPackage.INPUT_PORT__INPUT:
				setInput((DeliverableFlow)null);
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
			case VdmlPackage.INPUT_PORT__RESOURCE_USE:
				return resourceUse != null && !resourceUse.isEmpty();
			case VdmlPackage.INPUT_PORT__DELEGATED_INPUT:
				return delegatedInput != null && !delegatedInput.isEmpty();
			case VdmlPackage.INPUT_PORT__INPUT_DELEGATION:
				return inputDelegation != null;
			case VdmlPackage.INPUT_PORT__ROLE:
				return role != null;
			case VdmlPackage.INPUT_PORT__INPUT_DEFINITION:
				return inputDefinition != null;
			case VdmlPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return correlationExpression != null;
			case VdmlPackage.INPUT_PORT__INPUT:
				return input != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPortImpl
