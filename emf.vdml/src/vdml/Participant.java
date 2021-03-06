/**
 */
package vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vdml.Participant#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link vdml.Participant#getParticipantCalendar <em>Participant Calendar</em>}</li>
 * </ul>
 *
 * @see vdml.VdmlPackage#getParticipant()
 * @model abstract="true"
 * @generated
 */
public interface Participant extends MeasurableElement {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link vdml.Assignment}.
	 * It is bidirectional and its opposite is '{@link vdml.Assignment#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see vdml.VdmlPackage#getParticipant_Assignment()
	 * @see vdml.Assignment#getParticipant
	 * @model opposite="participant" ordered="false"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Participant Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Calendar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Calendar</em>' containment reference.
	 * @see #setParticipantCalendar(CalendarService)
	 * @see vdml.VdmlPackage#getParticipant_ParticipantCalendar()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CalendarService getParticipantCalendar();

	/**
	 * Sets the value of the '{@link vdml.Participant#getParticipantCalendar <em>Participant Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Calendar</em>' containment reference.
	 * @see #getParticipantCalendar()
	 * @generated
	 */
	void setParticipantCalendar(CalendarService value);

} // Participant
