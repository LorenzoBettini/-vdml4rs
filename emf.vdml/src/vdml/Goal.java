/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Goal#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link vdml.Activity}.
	 * It is bidirectional and its opposite is '{@link vdml.Activity#getCollaborationGoal <em>Collaboration Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see vdml.VdmlPackage#getGoal_Activity()
	 * @see vdml.Activity#getCollaborationGoal
	 * @model opposite="collaborationGoal" ordered="false"
	 * @generated
	 */
	EList<Activity> getActivity();

} // Goal
