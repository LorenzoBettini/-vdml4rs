/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Position#getActorPool <em>Actor Pool</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends Role {
	/**
	 * Returns the value of the '<em><b>Actor Pool</b></em>' reference list.
	 * The list contents are of type {@link vdml.Pool}.
	 * It is bidirectional and its opposite is '{@link vdml.Pool#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Pool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Pool</em>' reference list.
	 * @see vdml.VdmlPackage#getPosition_ActorPool()
	 * @see vdml.Pool#getPosition
	 * @model opposite="position" ordered="false"
	 * @generated
	 */
	EList<Pool> getActorPool();

} // Position
