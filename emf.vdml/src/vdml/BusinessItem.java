/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.BusinessItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link vdml.BusinessItem#isIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link vdml.BusinessItem#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link vdml.BusinessItem#getStore <em>Store</em>}</li>
 *   <li>{@link vdml.BusinessItem#getMethod <em>Method</em>}</li>
 *   <li>{@link vdml.BusinessItem#isIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link vdml.BusinessItem#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getBusinessItem()
 * @model
 * @generated
 */
public interface BusinessItem extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(BusinessItemDefinition)
	 * @see vdml.VdmlPackage#getBusinessItem_Definition()
	 * @model ordered="false"
	 * @generated
	 */
	BusinessItemDefinition getDefinition();

	/**
	 * Sets the value of the '{@link vdml.BusinessItem#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(BusinessItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Fungible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fungible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fungible</em>' attribute.
	 * @see #setIsFungible(boolean)
	 * @see vdml.VdmlPackage#getBusinessItem_IsFungible()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsFungible();

	/**
	 * Sets the value of the '{@link vdml.BusinessItem#isIsFungible <em>Is Fungible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fungible</em>' attribute.
	 * @see #isIsFungible()
	 * @generated
	 */
	void setIsFungible(boolean value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link vdml.Assignment}.
	 * It is bidirectional and its opposite is '{@link vdml.Assignment#getAssignableResource <em>Assignable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItem_Assignment()
	 * @see vdml.Assignment#getAssignableResource
	 * @model opposite="assignableResource" ordered="false"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference list.
	 * The list contents are of type {@link vdml.Store}.
	 * It is bidirectional and its opposite is '{@link vdml.Store#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItem_Store()
	 * @see vdml.Store#getResource
	 * @model opposite="resource" ordered="false"
	 * @generated
	 */
	EList<Store> getStore();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link vdml.CapabilityMethod}.
	 * It is bidirectional and its opposite is '{@link vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItem_Method()
	 * @see vdml.CapabilityMethod#getMethodResource
	 * @model opposite="methodResource" ordered="false"
	 * @generated
	 */
	EList<CapabilityMethod> getMethod();

	/**
	 * Returns the value of the '<em><b>Is Shareable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shareable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shareable</em>' attribute.
	 * @see #setIsShareable(boolean)
	 * @see vdml.VdmlPackage#getBusinessItem_IsShareable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsShareable();

	/**
	 * Sets the value of the '{@link vdml.BusinessItem#isIsShareable <em>Is Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shareable</em>' attribute.
	 * @see #isIsShareable()
	 * @generated
	 */
	void setIsShareable(boolean value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' reference list.
	 * The list contents are of type {@link vdml.DeliverableFlow}.
	 * It is bidirectional and its opposite is '{@link vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' reference list.
	 * @see vdml.VdmlPackage#getBusinessItem_Flow()
	 * @see vdml.DeliverableFlow#getDeliverable
	 * @model opposite="deliverable" ordered="false"
	 * @generated
	 */
	EList<DeliverableFlow> getFlow();

} // BusinessItem
