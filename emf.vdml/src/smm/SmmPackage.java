/**
 */
package smm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smm.SmmFactory
 * @model kind="package"
 * @generated
 */
public interface SmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///smm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmmPackage eINSTANCE = smm.impl.SmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link smm.impl.SmmElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.SmmElementImpl
	 * @see smm.impl.SmmPackageImpl#getSmmElement()
	 * @generated
	 */
	int SMM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__SHORT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.AbstractMeasureElementImpl
	 * @see smm.impl.SmmPackageImpl#getAbstractMeasureElement()
	 * @generated
	 */
	int ABSTRACT_MEASURE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Measure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Measure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.AttributeImpl
	 * @see smm.impl.SmmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAG = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.AnnotationImpl
	 * @see smm.impl.SmmPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.ArgumentImpl
	 * @see smm.impl.SmmPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.SmmRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.SmmRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getSmmRelationship()
	 * @generated
	 */
	int SMM_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getMeasureRelationship()
	 * @generated
	 */
	int MEASURE_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ATTRIBUTES = SMM_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ANNOTATIONS = SMM_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__MEASURAND_QUERY = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP_OPERATION_COUNT = SMM_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.Base1MeasureRelationshipImpl <em>Base1 Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.Base1MeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBase1MeasureRelationship()
	 * @generated
	 */
	int BASE1_MEASURE_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base1 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base1 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.OperationImpl
	 * @see smm.impl.SmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LANGUAGE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasureImpl
	 * @see smm.impl.SmmPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CATEGORY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TRAIT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SCOPE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_LABEL_FORMAT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REFINEMENT_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REFINEMENT_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RECURSIVE_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RECURSIVE_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASUREMENT_LABEL_FORMAT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__VISIBLE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_RELATIONSHIPS = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DEFAULT_QUERY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__INBOUND = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OUTBOUND = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.DimensionalMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getDimensionalMeasure()
	 * @generated
	 */
	int DIMENSIONAL_MEASURE = 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ATTRIBUTES = MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ANNOTATIONS = MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__SHORT_DESCRIPTION = MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT = MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REFINEMENT_TO = MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REFINEMENT_FROM = MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RECURSIVE_TO = MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RECURSIVE_FROM = MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT = MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__VISIBLE = MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS = MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__DEFAULT_QUERY = MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__INBOUND = MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__OUTBOUND = MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__UNIT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE_FROM = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM = MEASURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM = MEASURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RESCALE_TO = MEASURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RANKING_FROM = MEASURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.BinaryMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getBinaryMeasure()
	 * @generated
	 */
	int BINARY_MEASURE = 9;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ATTRIBUTES = DIMENSIONAL_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ANNOTATIONS = DIMENSIONAL_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__INBOUND = DIMENSIONAL_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__OUTBOUND = DIMENSIONAL_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE2_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__FUNCTOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measure1 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE1_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE_OPERATION_COUNT = DIMENSIONAL_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasureCategoryImpl <em>Measure Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasureCategoryImpl
	 * @see smm.impl.SmmPackageImpl#getMeasureCategory()
	 * @generated
	 */
	int MEASURE_CATEGORY = 12;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY_ELEMENT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY_MEASURE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Measure Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RefinementMeasureRelationshipImpl <em>Refinement Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RefinementMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRefinementMeasureRelationship()
	 * @generated
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refinement Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refinement Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.EquivalentMeasureRelationshipImpl <em>Equivalent Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.EquivalentMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getEquivalentMeasureRelationship()
	 * @generated
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equivalent Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Equivalent Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.BaseMeasureRelationshipImpl <em>Base Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.BaseMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBaseMeasureRelationship()
	 * @generated
	 */
	int BASE_MEASURE_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CollectiveMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getCollectiveMeasure()
	 * @generated
	 */
	int COLLECTIVE_MEASURE = 16;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ATTRIBUTES = DIMENSIONAL_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ANNOTATIONS = DIMENSIONAL_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__INBOUND = DIMENSIONAL_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__OUTBOUND = DIMENSIONAL_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ACCUMULATOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collective Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collective Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE_OPERATION_COUNT = DIMENSIONAL_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.Base2MeasureRelationshipImpl <em>Base2 Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.Base2MeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBase2MeasureRelationship()
	 * @generated
	 */
	int BASE2_MEASURE_RELATIONSHIP = 17;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base2 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base2 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RescaleMeasureRelationshipImpl <em>Rescale Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RescaleMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRescaleMeasureRelationship()
	 * @generated
	 */
	int RESCALE_MEASURE_RELATIONSHIP = 18;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescale Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rescale Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RescaledMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getRescaledMeasure()
	 * @generated
	 */
	int RESCALED_MEASURE = 19;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ATTRIBUTES = DIMENSIONAL_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ANNOTATIONS = DIMENSIONAL_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__INBOUND = DIMENSIONAL_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__OUTBOUND = DIMENSIONAL_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__FORMULA = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rescale From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RESCALE_FROM = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescaled Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rescaled Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE_OPERATION_COUNT = DIMENSIONAL_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RankingMeasureRelationshipImpl <em>Ranking Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RankingMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRankingMeasureRelationship()
	 * @generated
	 */
	int RANKING_MEASURE_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getMeasurementRelationship()
	 * @generated
	 */
	int MEASUREMENT_RELATIONSHIP = 22;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ATTRIBUTES = SMM_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ANNOTATIONS = SMM_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = SMM_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.Base1MeasurementRelationshipImpl <em>Base1 Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.Base1MeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBase1MeasurementRelationship()
	 * @generated
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base1 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base1 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 25;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ERROR = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURAND = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__BREAK_VALUE = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REFINEMENT_TO = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REFINEMENT_FROM = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EQUIVALENT_TO = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EQUIVALENT_FROM = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RECURSIVE_TO = SMM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RECURSIVE_FROM = SMM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_RELATIONSHIPS = SMM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__INBOUND = SMM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__OUTBOUND = SMM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.DimensionalMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getDimensionalMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_MEASUREMENT = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ATTRIBUTES = MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ANNOTATIONS = MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION = MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURAND = MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BREAK_VALUE = MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__REFINEMENT_TO = MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM = MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO = MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM = MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RECURSIVE_TO = MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM = MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__INBOUND = MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__OUTBOUND = MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RESCALE_TO = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RANKING_FROM = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.BinaryMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getBinaryMeasurement()
	 * @generated
	 */
	int BINARY_MEASUREMENT = 23;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ATTRIBUTES = DIMENSIONAL_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ANNOTATIONS = DIMENSIONAL_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__INBOUND = DIMENSIONAL_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__OUTBOUND = DIMENSIONAL_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RefinementMeasurementRelationshipImpl <em>Refinement Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RefinementMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRefinementMeasurementRelationship()
	 * @generated
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP = 26;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refinement Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refinement Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.EquivalentMeasurementRelationshipImpl <em>Equivalent Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.EquivalentMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getEquivalentMeasurementRelationship()
	 * @generated
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP = 27;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equivalent Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RecursiveMeasurementRelationshipImpl <em>Recursive Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RecursiveMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRecursiveMeasurementRelationship()
	 * @generated
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP = 28;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recursive Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recursive Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.BaseMeasurementRelationshipImpl <em>Base Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.BaseMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBaseMeasurementRelationship()
	 * @generated
	 */
	int BASE_MEASUREMENT_RELATIONSHIP = 29;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CollectiveMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getCollectiveMeasurement()
	 * @generated
	 */
	int COLLECTIVE_MEASUREMENT = 30;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ATTRIBUTES = DIMENSIONAL_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ANNOTATIONS = DIMENSIONAL_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__INBOUND = DIMENSIONAL_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__OUTBOUND = DIMENSIONAL_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ACCUMULATOR = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collective Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collective Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.Base2MeasurementRelationshipImpl <em>Base2 Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.Base2MeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getBase2MeasurementRelationship()
	 * @generated
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP = 31;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base2 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base2 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RescaleMeasurementRelationshipImpl <em>Rescale Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RescaleMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRescaleMeasurementRelationship()
	 * @generated
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP = 32;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescale Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rescale Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RescaledMeasurementImpl <em>Rescaled Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RescaledMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getRescaledMeasurement()
	 * @generated
	 */
	int RESCALED_MEASUREMENT = 33;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ATTRIBUTES = DIMENSIONAL_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ANNOTATIONS = DIMENSIONAL_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__INBOUND = DIMENSIONAL_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__OUTBOUND = DIMENSIONAL_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rescale From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RESCALE_FROM = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescaled Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rescaled Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RankingMeasurementRelationshipImpl <em>Ranking Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RankingMeasurementRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRankingMeasurementRelationship()
	 * @generated
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP = 34;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__ATTRIBUTES = MEASUREMENT_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__ANNOTATIONS = MEASUREMENT_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP_OPERATION_COUNT = MEASUREMENT_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CategoryRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getCategoryRelationship()
	 * @generated
	 */
	int CATEGORY_RELATIONSHIP = 35;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ATTRIBUTES = SMM_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ANNOTATIONS = SMM_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP_OPERATION_COUNT = SMM_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CharacteristicImpl
	 * @see smm.impl.SmmPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 36;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__PARENT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.DirectMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getDirectMeasurement()
	 * @generated
	 */
	int DIRECT_MEASUREMENT = 38;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ATTRIBUTES = DIMENSIONAL_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ANNOTATIONS = DIMENSIONAL_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__INBOUND = DIMENSIONAL_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__OUTBOUND = DIMENSIONAL_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Direct Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CountImpl
	 * @see smm.impl.SmmPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 37;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ATTRIBUTES = DIRECT_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ANNOTATIONS = DIRECT_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__NAME = DIRECT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SHORT_DESCRIPTION = DIRECT_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__DESCRIPTION = DIRECT_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ERROR = DIRECT_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MEASURAND = DIRECT_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BREAK_VALUE = DIRECT_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__REFINEMENT_TO = DIRECT_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__REFINEMENT_FROM = DIRECT_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EQUIVALENT_TO = DIRECT_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EQUIVALENT_FROM = DIRECT_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RECURSIVE_TO = DIRECT_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RECURSIVE_FROM = DIRECT_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MEASUREMENT_RELATIONSHIPS = DIRECT_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__INBOUND = DIRECT_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__OUTBOUND = DIRECT_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = DIRECT_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT1_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT2_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RESCALE_TO = DIRECT_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RANKING_FROM = DIRECT_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = DIRECT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = DIRECT_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.DirectMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getDirectMeasure()
	 * @generated
	 */
	int DIRECT_MEASURE = 40;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ATTRIBUTES = DIMENSIONAL_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ANNOTATIONS = DIMENSIONAL_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__INBOUND = DIMENSIONAL_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__OUTBOUND = DIMENSIONAL_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__OPERATION = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direct Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE_OPERATION_COUNT = DIMENSIONAL_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.CountingImpl <em>Counting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.CountingImpl
	 * @see smm.impl.SmmPackageImpl#getCounting()
	 * @generated
	 */
	int COUNTING = 39;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ATTRIBUTES = DIRECT_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ANNOTATIONS = DIRECT_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__NAME = DIRECT_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__SHORT_DESCRIPTION = DIRECT_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__DESCRIPTION = DIRECT_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__CATEGORY = DIRECT_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__TRAIT = DIRECT_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__SCOPE = DIRECT_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASURE_LABEL_FORMAT = DIRECT_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REFINEMENT_TO = DIRECT_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REFINEMENT_FROM = DIRECT_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_TO = DIRECT_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_FROM = DIRECT_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RECURSIVE_TO = DIRECT_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RECURSIVE_FROM = DIRECT_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASUREMENT_LABEL_FORMAT = DIRECT_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__VISIBLE = DIRECT_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASURE_RELATIONSHIPS = DIRECT_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__DEFAULT_QUERY = DIRECT_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__INBOUND = DIRECT_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__OUTBOUND = DIRECT_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__UNIT = DIRECT_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE_FROM = DIRECT_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE1_FROM = DIRECT_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE2_FROM = DIRECT_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RESCALE_TO = DIRECT_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RANKING_FROM = DIRECT_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__OPERATION = DIRECT_MEASURE__OPERATION;

	/**
	 * The number of structural features of the '<em>Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_FEATURE_COUNT = DIRECT_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_OPERATION_COUNT = DIRECT_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.GradeImpl
	 * @see smm.impl.SmmPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 41;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ATTRIBUTES = MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ANNOTATIONS = MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__SHORT_DESCRIPTION = MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURAND = MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__BREAK_VALUE = MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REFINEMENT_TO = MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REFINEMENT_FROM = MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EQUIVALENT_TO = MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EQUIVALENT_FROM = MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RECURSIVE_TO = MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RECURSIVE_FROM = MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASUREMENT_RELATIONSHIPS = MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__INBOUND = MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__OUTBOUND = MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__IS_BASE_SUPPLIED = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ranking To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RANKING_TO = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MeasureLibraryImpl
	 * @see smm.impl.SmmPackageImpl#getMeasureLibrary()
	 * @generated
	 */
	int MEASURE_LIBRARY = 42;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measure Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__MEASURE_ELEMENTS = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measure Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.MofElementImpl <em>Mof Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.MofElementImpl
	 * @see smm.impl.SmmPackageImpl#getMofElement()
	 * @generated
	 */
	int MOF_ELEMENT = 43;

	/**
	 * The number of structural features of the '<em>Mof Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mof Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.NamedMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getNamedMeasure()
	 * @generated
	 */
	int NAMED_MEASURE = 44;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ATTRIBUTES = DIMENSIONAL_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ANNOTATIONS = DIMENSIONAL_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__INBOUND = DIMENSIONAL_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__OUTBOUND = DIMENSIONAL_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Named Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE_OPERATION_COUNT = DIMENSIONAL_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.NamedMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getNamedMeasurement()
	 * @generated
	 */
	int NAMED_MEASUREMENT = 45;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ATTRIBUTES = DIMENSIONAL_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ANNOTATIONS = DIMENSIONAL_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__INBOUND = DIMENSIONAL_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__OUTBOUND = DIMENSIONAL_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Named Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.OclOperationImpl <em>Ocl Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.OclOperationImpl
	 * @see smm.impl.SmmPackageImpl#getOclOperation()
	 * @generated
	 */
	int OCL_OPERATION = 46;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__CONTEXT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__BODY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.ObservationImpl
	 * @see smm.impl.SmmPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 47;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OBSERVER = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TOOL = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Observed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__WHEN_OBSERVED = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SCOPES = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Observed Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OBSERVED_MEASURES = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requested Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REQUESTED_MEASURES = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurement Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__MEASUREMENT_RELATIONS = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ARGUMENTS = SMM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.ObservationScopeImpl <em>Observation Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.ObservationScopeImpl
	 * @see smm.impl.SmmPackageImpl#getObservationScope()
	 * @generated
	 */
	int OBSERVATION_SCOPE = 48;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__SCOPE_URI = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Observation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.ObservedMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getObservedMeasure()
	 * @generated
	 */
	int OBSERVED_MEASURE = 49;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__ATTRIBUTES = SMM_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__ANNOTATIONS = SMM_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__MEASURE = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__MEASUREMENTS = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Observed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE_OPERATION_COUNT = SMM_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RankingImpl
	 * @see smm.impl.SmmPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 50;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ATTRIBUTES = MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ANNOTATIONS = MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SHORT_DESCRIPTION = MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASURE_LABEL_FORMAT = MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REFINEMENT_TO = MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REFINEMENT_FROM = MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RECURSIVE_TO = MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RECURSIVE_FROM = MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASUREMENT_LABEL_FORMAT = MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__VISIBLE = MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASURE_RELATIONSHIPS = MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DEFAULT_QUERY = MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__INBOUND = MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__OUTBOUND = MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__INTERVAL = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ranking To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RANKING_TO = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RankingIntervalImpl
	 * @see smm.impl.SmmPackageImpl#getRankingInterval()
	 * @generated
	 */
	int RANKING_INTERVAL = 51;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Maximum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Open</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Open</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__SYMBOL = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ranking Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ranking Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RatioMeasureImpl
	 * @see smm.impl.SmmPackageImpl#getRatioMeasure()
	 * @generated
	 */
	int RATIO_MEASURE = 52;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ATTRIBUTES = BINARY_MEASURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ANNOTATIONS = BINARY_MEASURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__NAME = BINARY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__SHORT_DESCRIPTION = BINARY_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__DESCRIPTION = BINARY_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__CATEGORY = BINARY_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__TRAIT = BINARY_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__SCOPE = BINARY_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASURE_LABEL_FORMAT = BINARY_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REFINEMENT_TO = BINARY_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REFINEMENT_FROM = BINARY_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_TO = BINARY_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_FROM = BINARY_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RECURSIVE_TO = BINARY_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RECURSIVE_FROM = BINARY_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASUREMENT_LABEL_FORMAT = BINARY_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__VISIBLE = BINARY_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASURE_RELATIONSHIPS = BINARY_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__DEFAULT_QUERY = BINARY_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__INBOUND = BINARY_MEASURE__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__OUTBOUND = BINARY_MEASURE__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__UNIT = BINARY_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE_FROM = BINARY_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE1_FROM = BINARY_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE2_FROM = BINARY_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RESCALE_TO = BINARY_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RANKING_FROM = BINARY_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE2_TO = BINARY_MEASURE__BASE_MEASURE2_TO;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__FUNCTOR = BINARY_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE1_TO = BINARY_MEASURE__BASE_MEASURE1_TO;

	/**
	 * The number of structural features of the '<em>Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE_FEATURE_COUNT = BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE_OPERATION_COUNT = BINARY_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RatioMeasurementImpl
	 * @see smm.impl.SmmPackageImpl#getRatioMeasurement()
	 * @generated
	 */
	int RATIO_MEASUREMENT = 53;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ATTRIBUTES = BINARY_MEASUREMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ANNOTATIONS = BINARY_MEASUREMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__NAME = BINARY_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__SHORT_DESCRIPTION = BINARY_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__DESCRIPTION = BINARY_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ERROR = BINARY_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__MEASURAND = BINARY_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BREAK_VALUE = BINARY_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__REFINEMENT_TO = BINARY_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__REFINEMENT_FROM = BINARY_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__EQUIVALENT_TO = BINARY_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__EQUIVALENT_FROM = BINARY_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RECURSIVE_TO = BINARY_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RECURSIVE_FROM = BINARY_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = BINARY_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__INBOUND = BINARY_MEASUREMENT__INBOUND;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__OUTBOUND = BINARY_MEASUREMENT__OUTBOUND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__VALUE = BINARY_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT1_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT2_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RESCALE_TO = BINARY_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RANKING_FROM = BINARY_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT2_TO = BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__IS_BASE_SUPPLIED = BINARY_MEASUREMENT__IS_BASE_SUPPLIED;

	/**
	 * The feature id for the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT1_TO = BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO;

	/**
	 * The number of structural features of the '<em>Ratio Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT_FEATURE_COUNT = BINARY_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ratio Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT_OPERATION_COUNT = BINARY_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.RecursiveMeasureRelationshipImpl <em>Recursive Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.RecursiveMeasureRelationshipImpl
	 * @see smm.impl.SmmPackageImpl#getRecursiveMeasureRelationship()
	 * @generated
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP = 54;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__ATTRIBUTES = MEASURE_RELATIONSHIP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__ANNOTATIONS = MEASURE_RELATIONSHIP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recursive Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recursive Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP_OPERATION_COUNT = MEASURE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.ScopeImpl
	 * @see smm.impl.SmmPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 55;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ATTRIBUTES = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANNOTATIONS = ABSTRACT_MEASURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CLASS = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recognizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RECOGNIZER = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BREAK_CONDITION = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.impl.SmmModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.impl.SmmModelImpl
	 * @see smm.impl.SmmPackageImpl#getSmmModel()
	 * @generated
	 */
	int SMM_MODEL = 56;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ATTRIBUTES = SMM_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ANNOTATIONS = SMM_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__OBSERVATIONS = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Librairies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__LIBRAIRIES = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL_OPERATION_COUNT = SMM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smm.Accumulator <em>Accumulator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smm.Accumulator
	 * @see smm.impl.SmmPackageImpl#getAccumulator()
	 * @generated
	 */
	int ACCUMULATOR = 57;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see String
	 * @see smm.impl.SmmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 58;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Boolean
	 * @see smm.impl.SmmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 59;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see smm.impl.SmmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 60;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Double
	 * @see smm.impl.SmmPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 61;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see smm.impl.SmmPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 62;


	/**
	 * Returns the meta object for class '{@link smm.AbstractMeasureElement <em>Abstract Measure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Measure Element</em>'.
	 * @see smm.AbstractMeasureElement
	 * @generated
	 */
	EClass getAbstractMeasureElement();

	/**
	 * Returns the meta object for class '{@link smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see smm.SmmElement
	 * @generated
	 */
	EClass getSmmElement();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.SmmElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see smm.SmmElement#getAttributes()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.SmmElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see smm.SmmElement#getAnnotations()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Annotations();

	/**
	 * Returns the meta object for the reference '{@link smm.SmmElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see smm.SmmElement#getName()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link smm.SmmElement#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see smm.SmmElement#getShortDescription()
	 * @see #getSmmElement()
	 * @generated
	 */
	EAttribute getSmmElement_ShortDescription();

	/**
	 * Returns the meta object for the reference '{@link smm.SmmElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see smm.SmmElement#getDescription()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Description();

	/**
	 * Returns the meta object for class '{@link smm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see smm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link smm.Attribute#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see smm.Attribute#getTag()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Tag();

	/**
	 * Returns the meta object for the reference '{@link smm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see smm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link smm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see smm.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link smm.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see smm.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link smm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see smm.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference '{@link smm.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see smm.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Type();

	/**
	 * Returns the meta object for the reference '{@link smm.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see smm.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Value();

	/**
	 * Returns the meta object for class '{@link smm.Base1MeasureRelationship <em>Base1 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base1 Measure Relationship</em>'.
	 * @see smm.Base1MeasureRelationship
	 * @generated
	 */
	EClass getBase1MeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.Base1MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.Base1MeasureRelationship#getFrom()
	 * @see #getBase1MeasureRelationship()
	 * @generated
	 */
	EReference getBase1MeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.Base1MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.Base1MeasureRelationship#getTo()
	 * @see #getBase1MeasureRelationship()
	 * @generated
	 */
	EReference getBase1MeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.MeasureRelationship <em>Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Relationship</em>'.
	 * @see smm.MeasureRelationship
	 * @generated
	 */
	EClass getMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurand Query</em>'.
	 * @see smm.MeasureRelationship#getMeasurandQuery()
	 * @see #getMeasureRelationship()
	 * @generated
	 */
	EReference getMeasureRelationship_MeasurandQuery();

	/**
	 * Returns the meta object for class '{@link smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see smm.SmmRelationship
	 * @generated
	 */
	EClass getSmmRelationship();

	/**
	 * Returns the meta object for class '{@link smm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see smm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link smm.Operation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see smm.Operation#getLanguage()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Language();

	/**
	 * Returns the meta object for the reference '{@link smm.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see smm.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Body();

	/**
	 * Returns the meta object for class '{@link smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Measure</em>'.
	 * @see smm.BinaryMeasure
	 * @generated
	 */
	EClass getBinaryMeasure();

	/**
	 * Returns the meta object for the reference '{@link smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure2 To</em>'.
	 * @see smm.BinaryMeasure#getBaseMeasure2To()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure2To();

	/**
	 * Returns the meta object for the reference '{@link smm.BinaryMeasure#getFunctor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functor</em>'.
	 * @see smm.BinaryMeasure#getFunctor()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_Functor();

	/**
	 * Returns the meta object for the reference '{@link smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure1 To</em>'.
	 * @see smm.BinaryMeasure#getBaseMeasure1To()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure1To();

	/**
	 * Returns the meta object for class '{@link smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measure</em>'.
	 * @see smm.DimensionalMeasure
	 * @generated
	 */
	EClass getDimensionalMeasure();

	/**
	 * Returns the meta object for the reference '{@link smm.DimensionalMeasure#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see smm.DimensionalMeasure#getUnit()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_Unit();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasure#getBaseMeasureFrom <em>Base Measure From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure From</em>'.
	 * @see smm.DimensionalMeasure#getBaseMeasureFrom()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasureFrom();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasure#getBaseMeasure1From <em>Base Measure1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure1 From</em>'.
	 * @see smm.DimensionalMeasure#getBaseMeasure1From()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasure1From();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasure#getBaseMeasure2From <em>Base Measure2 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure2 From</em>'.
	 * @see smm.DimensionalMeasure#getBaseMeasure2From()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasure2From();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasure#getRescaleTo <em>Rescale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale To</em>'.
	 * @see smm.DimensionalMeasure#getRescaleTo()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_RescaleTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasure#getRankingFrom <em>Ranking From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranking From</em>'.
	 * @see smm.DimensionalMeasure#getRankingFrom()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_RankingFrom();

	/**
	 * Returns the meta object for class '{@link smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see smm.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see smm.Measure#getCategory()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Category();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trait</em>'.
	 * @see smm.Measure#getTrait()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Trait();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see smm.Measure#getScope()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Scope();

	/**
	 * Returns the meta object for the attribute '{@link smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Label Format</em>'.
	 * @see smm.Measure#getMeasureLabelFormat()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasureLabelFormat();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getRefinementTo <em>Refinement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement To</em>'.
	 * @see smm.Measure#getRefinementTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RefinementTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getRefinementFrom <em>Refinement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement From</em>'.
	 * @see smm.Measure#getRefinementFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RefinementFrom();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see smm.Measure#getEquivalentTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent From</em>'.
	 * @see smm.Measure#getEquivalentFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentFrom();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getRecursiveTo <em>Recursive To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive To</em>'.
	 * @see smm.Measure#getRecursiveTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RecursiveTo();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getRecursiveFrom <em>Recursive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive From</em>'.
	 * @see smm.Measure#getRecursiveFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RecursiveFrom();

	/**
	 * Returns the meta object for the attribute '{@link smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Label Format</em>'.
	 * @see smm.Measure#getMeasurementLabelFormat()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasurementLabelFormat();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visible</em>'.
	 * @see smm.Measure#getVisible()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Visible();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Measure#getMeasureRelationships <em>Measure Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Relationships</em>'.
	 * @see smm.Measure#getMeasureRelationships()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasureRelationships();

	/**
	 * Returns the meta object for the reference '{@link smm.Measure#getDefaultQuery <em>Default Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Query</em>'.
	 * @see smm.Measure#getDefaultQuery()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_DefaultQuery();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound</em>'.
	 * @see smm.Measure#getInbound()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Inbound();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measure#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound</em>'.
	 * @see smm.Measure#getOutbound()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Outbound();

	/**
	 * Returns the meta object for class '{@link smm.MeasureCategory <em>Measure Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Category</em>'.
	 * @see smm.MeasureCategory
	 * @generated
	 */
	EClass getMeasureCategory();

	/**
	 * Returns the meta object for the reference list '{@link smm.MeasureCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see smm.MeasureCategory#getCategory()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_Category();

	/**
	 * Returns the meta object for the reference list '{@link smm.MeasureCategory#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Element</em>'.
	 * @see smm.MeasureCategory#getCategoryElement()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_CategoryElement();

	/**
	 * Returns the meta object for the reference list '{@link smm.MeasureCategory#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Measure</em>'.
	 * @see smm.MeasureCategory#getCategoryMeasure()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_CategoryMeasure();

	/**
	 * Returns the meta object for class '{@link smm.RefinementMeasureRelationship <em>Refinement Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Measure Relationship</em>'.
	 * @see smm.RefinementMeasureRelationship
	 * @generated
	 */
	EClass getRefinementMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RefinementMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RefinementMeasureRelationship#getTo()
	 * @see #getRefinementMeasureRelationship()
	 * @generated
	 */
	EReference getRefinementMeasureRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.RefinementMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RefinementMeasureRelationship#getFrom()
	 * @see #getRefinementMeasureRelationship()
	 * @generated
	 */
	EReference getRefinementMeasureRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.EquivalentMeasureRelationship <em>Equivalent Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Measure Relationship</em>'.
	 * @see smm.EquivalentMeasureRelationship
	 * @generated
	 */
	EClass getEquivalentMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see smm.EquivalentMeasureRelationship#getMapping()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_Mapping();

	/**
	 * Returns the meta object for the reference '{@link smm.EquivalentMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.EquivalentMeasureRelationship#getTo()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.EquivalentMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.EquivalentMeasureRelationship#getFrom()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.BaseMeasureRelationship <em>Base Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Measure Relationship</em>'.
	 * @see smm.BaseMeasureRelationship
	 * @generated
	 */
	EClass getBaseMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.BaseMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.BaseMeasureRelationship#getFrom()
	 * @see #getBaseMeasureRelationship()
	 * @generated
	 */
	EReference getBaseMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.BaseMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.BaseMeasureRelationship#getTo()
	 * @see #getBaseMeasureRelationship()
	 * @generated
	 */
	EReference getBaseMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measure</em>'.
	 * @see smm.CollectiveMeasure
	 * @generated
	 */
	EClass getCollectiveMeasure();

	/**
	 * Returns the meta object for the attribute '{@link smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see smm.CollectiveMeasure#getAccumulator()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EAttribute getCollectiveMeasure_Accumulator();

	/**
	 * Returns the meta object for the reference list '{@link smm.CollectiveMeasure#getBaseMeasureTo <em>Base Measure To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure To</em>'.
	 * @see smm.CollectiveMeasure#getBaseMeasureTo()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EReference getCollectiveMeasure_BaseMeasureTo();

	/**
	 * Returns the meta object for class '{@link smm.Base2MeasureRelationship <em>Base2 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base2 Measure Relationship</em>'.
	 * @see smm.Base2MeasureRelationship
	 * @generated
	 */
	EClass getBase2MeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.Base2MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.Base2MeasureRelationship#getFrom()
	 * @see #getBase2MeasureRelationship()
	 * @generated
	 */
	EReference getBase2MeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.Base2MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.Base2MeasureRelationship#getTo()
	 * @see #getBase2MeasureRelationship()
	 * @generated
	 */
	EReference getBase2MeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.RescaleMeasureRelationship <em>Rescale Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescale Measure Relationship</em>'.
	 * @see smm.RescaleMeasureRelationship
	 * @generated
	 */
	EClass getRescaleMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RescaleMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RescaleMeasureRelationship#getTo()
	 * @see #getRescaleMeasureRelationship()
	 * @generated
	 */
	EReference getRescaleMeasureRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.RescaleMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RescaleMeasureRelationship#getFrom()
	 * @see #getRescaleMeasureRelationship()
	 * @generated
	 */
	EReference getRescaleMeasureRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.RescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescaled Measure</em>'.
	 * @see smm.RescaledMeasure
	 * @generated
	 */
	EClass getRescaledMeasure();

	/**
	 * Returns the meta object for the reference '{@link smm.RescaledMeasure#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formula</em>'.
	 * @see smm.RescaledMeasure#getFormula()
	 * @see #getRescaledMeasure()
	 * @generated
	 */
	EReference getRescaledMeasure_Formula();

	/**
	 * Returns the meta object for the reference list '{@link smm.RescaledMeasure#getRescaleFrom <em>Rescale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale From</em>'.
	 * @see smm.RescaledMeasure#getRescaleFrom()
	 * @see #getRescaledMeasure()
	 * @generated
	 */
	EReference getRescaledMeasure_RescaleFrom();

	/**
	 * Returns the meta object for class '{@link smm.RankingMeasureRelationship <em>Ranking Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Measure Relationship</em>'.
	 * @see smm.RankingMeasureRelationship
	 * @generated
	 */
	EClass getRankingMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RankingMeasureRelationship#getFrom()
	 * @see #getRankingMeasureRelationship()
	 * @generated
	 */
	EReference getRankingMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RankingMeasureRelationship#getTo()
	 * @see #getRankingMeasureRelationship()
	 * @generated
	 */
	EReference getRankingMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.Base1MeasurementRelationship <em>Base1 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base1 Measurement Relationship</em>'.
	 * @see smm.Base1MeasurementRelationship
	 * @generated
	 */
	EClass getBase1MeasurementRelationship();

	/**
	 * Returns the meta object for the container reference '{@link smm.Base1MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see smm.Base1MeasurementRelationship#getFrom()
	 * @see #getBase1MeasurementRelationship()
	 * @generated
	 */
	EReference getBase1MeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.Base1MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.Base1MeasurementRelationship#getTo()
	 * @see #getBase1MeasurementRelationship()
	 * @generated
	 */
	EReference getBase1MeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.MeasurementRelationship <em>Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Relationship</em>'.
	 * @see smm.MeasurementRelationship
	 * @generated
	 */
	EClass getMeasurementRelationship();

	/**
	 * Returns the meta object for class '{@link smm.BinaryMeasurement <em>Binary Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Measurement</em>'.
	 * @see smm.BinaryMeasurement
	 * @generated
	 */
	EClass getBinaryMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Measurement2 To</em>'.
	 * @see smm.BinaryMeasurement#getBaseMeasurement2To()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EReference getBinaryMeasurement_BaseMeasurement2To();

	/**
	 * Returns the meta object for the attribute '{@link smm.BinaryMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see smm.BinaryMeasurement#getIsBaseSupplied()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EAttribute getBinaryMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the containment reference '{@link smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Measurement1 To</em>'.
	 * @see smm.BinaryMeasurement#getBaseMeasurement1To()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EReference getBinaryMeasurement_BaseMeasurement1To();

	/**
	 * Returns the meta object for class '{@link smm.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measurement</em>'.
	 * @see smm.DimensionalMeasurement
	 * @generated
	 */
	EClass getDimensionalMeasurement();

	/**
	 * Returns the meta object for the reference '{@link smm.DimensionalMeasurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see smm.DimensionalMeasurement#getValue()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_Value();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasurement#getBaseMeasurementFrom <em>Base Measurement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement From</em>'.
	 * @see smm.DimensionalMeasurement#getBaseMeasurementFrom()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurementFrom();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasurement#getBaseMeasurement1From <em>Base Measurement1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement1 From</em>'.
	 * @see smm.DimensionalMeasurement#getBaseMeasurement1From()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurement1From();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasurement#getBaseMeasurement2From <em>Base Measurement2 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement2 From</em>'.
	 * @see smm.DimensionalMeasurement#getBaseMeasurement2From()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurement2From();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasurement#getRescaleTo <em>Rescale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale To</em>'.
	 * @see smm.DimensionalMeasurement#getRescaleTo()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_RescaleTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.DimensionalMeasurement#getRankingFrom <em>Ranking From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranking From</em>'.
	 * @see smm.DimensionalMeasurement#getRankingFrom()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_RankingFrom();

	/**
	 * Returns the meta object for class '{@link smm.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see smm.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link smm.Measurement#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error</em>'.
	 * @see smm.Measurement#getError()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Error();

	/**
	 * Returns the meta object for the reference '{@link smm.Measurement#getMeasurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurand</em>'.
	 * @see smm.Measurement#getMeasurand()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measurand();

	/**
	 * Returns the meta object for the reference '{@link smm.Measurement#getBreakValue <em>Break Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Break Value</em>'.
	 * @see smm.Measurement#getBreakValue()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_BreakValue();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getRefinementTo <em>Refinement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement To</em>'.
	 * @see smm.Measurement#getRefinementTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RefinementTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getRefinementFrom <em>Refinement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement From</em>'.
	 * @see smm.Measurement#getRefinementFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RefinementFrom();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see smm.Measurement#getEquivalentTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent From</em>'.
	 * @see smm.Measurement#getEquivalentFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_EquivalentFrom();

	/**
	 * Returns the meta object for the reference '{@link smm.Measurement#getRecursiveTo <em>Recursive To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive To</em>'.
	 * @see smm.Measurement#getRecursiveTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RecursiveTo();

	/**
	 * Returns the meta object for the reference '{@link smm.Measurement#getRecursiveFrom <em>Recursive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive From</em>'.
	 * @see smm.Measurement#getRecursiveFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RecursiveFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Measurement#getMeasurementRelationships <em>Measurement Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Relationships</em>'.
	 * @see smm.Measurement#getMeasurementRelationships()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementRelationships();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound</em>'.
	 * @see smm.Measurement#getInbound()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Inbound();

	/**
	 * Returns the meta object for the reference list '{@link smm.Measurement#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound</em>'.
	 * @see smm.Measurement#getOutbound()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Outbound();

	/**
	 * Returns the meta object for class '{@link smm.RefinementMeasurementRelationship <em>Refinement Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Measurement Relationship</em>'.
	 * @see smm.RefinementMeasurementRelationship
	 * @generated
	 */
	EClass getRefinementMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RefinementMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RefinementMeasurementRelationship#getTo()
	 * @see #getRefinementMeasurementRelationship()
	 * @generated
	 */
	EReference getRefinementMeasurementRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.RefinementMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RefinementMeasurementRelationship#getFrom()
	 * @see #getRefinementMeasurementRelationship()
	 * @generated
	 */
	EReference getRefinementMeasurementRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.EquivalentMeasurementRelationship <em>Equivalent Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Measurement Relationship</em>'.
	 * @see smm.EquivalentMeasurementRelationship
	 * @generated
	 */
	EClass getEquivalentMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.EquivalentMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.EquivalentMeasurementRelationship#getTo()
	 * @see #getEquivalentMeasurementRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasurementRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.EquivalentMeasurementRelationship#getFrom()
	 * @see #getEquivalentMeasurementRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasurementRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.RecursiveMeasurementRelationship <em>Recursive Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursive Measurement Relationship</em>'.
	 * @see smm.RecursiveMeasurementRelationship
	 * @generated
	 */
	EClass getRecursiveMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RecursiveMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RecursiveMeasurementRelationship#getTo()
	 * @see #getRecursiveMeasurementRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasurementRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RecursiveMeasurementRelationship#getFrom()
	 * @see #getRecursiveMeasurementRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasurementRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.BaseMeasurementRelationship <em>Base Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Measurement Relationship</em>'.
	 * @see smm.BaseMeasurementRelationship
	 * @generated
	 */
	EClass getBaseMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.BaseMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.BaseMeasurementRelationship#getFrom()
	 * @see #getBaseMeasurementRelationship()
	 * @generated
	 */
	EReference getBaseMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.BaseMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.BaseMeasurementRelationship#getTo()
	 * @see #getBaseMeasurementRelationship()
	 * @generated
	 */
	EReference getBaseMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.CollectiveMeasurement <em>Collective Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measurement</em>'.
	 * @see smm.CollectiveMeasurement
	 * @generated
	 */
	EClass getCollectiveMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see smm.CollectiveMeasurement#getAccumulator()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_Accumulator();

	/**
	 * Returns the meta object for the attribute '{@link smm.CollectiveMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see smm.CollectiveMeasurement#getIsBaseSupplied()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference list '{@link smm.CollectiveMeasurement#getBaseMeasurementTo <em>Base Measurement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement To</em>'.
	 * @see smm.CollectiveMeasurement#getBaseMeasurementTo()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EReference getCollectiveMeasurement_BaseMeasurementTo();

	/**
	 * Returns the meta object for class '{@link smm.Base2MeasurementRelationship <em>Base2 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base2 Measurement Relationship</em>'.
	 * @see smm.Base2MeasurementRelationship
	 * @generated
	 */
	EClass getBase2MeasurementRelationship();

	/**
	 * Returns the meta object for the container reference '{@link smm.Base2MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see smm.Base2MeasurementRelationship#getFrom()
	 * @see #getBase2MeasurementRelationship()
	 * @generated
	 */
	EReference getBase2MeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.Base2MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.Base2MeasurementRelationship#getTo()
	 * @see #getBase2MeasurementRelationship()
	 * @generated
	 */
	EReference getBase2MeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.RescaleMeasurementRelationship <em>Rescale Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescale Measurement Relationship</em>'.
	 * @see smm.RescaleMeasurementRelationship
	 * @generated
	 */
	EClass getRescaleMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RescaleMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RescaleMeasurementRelationship#getTo()
	 * @see #getRescaleMeasurementRelationship()
	 * @generated
	 */
	EReference getRescaleMeasurementRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link smm.RescaleMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RescaleMeasurementRelationship#getFrom()
	 * @see #getRescaleMeasurementRelationship()
	 * @generated
	 */
	EReference getRescaleMeasurementRelationship_From();

	/**
	 * Returns the meta object for class '{@link smm.RescaledMeasurement <em>Rescaled Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescaled Measurement</em>'.
	 * @see smm.RescaledMeasurement
	 * @generated
	 */
	EClass getRescaledMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link smm.RescaledMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see smm.RescaledMeasurement#getIsBaseSupplied()
	 * @see #getRescaledMeasurement()
	 * @generated
	 */
	EAttribute getRescaledMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference list '{@link smm.RescaledMeasurement#getRescaleFrom <em>Rescale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale From</em>'.
	 * @see smm.RescaledMeasurement#getRescaleFrom()
	 * @see #getRescaledMeasurement()
	 * @generated
	 */
	EReference getRescaledMeasurement_RescaleFrom();

	/**
	 * Returns the meta object for class '{@link smm.RankingMeasurementRelationship <em>Ranking Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Measurement Relationship</em>'.
	 * @see smm.RankingMeasurementRelationship
	 * @generated
	 */
	EClass getRankingMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RankingMeasurementRelationship#getFrom()
	 * @see #getRankingMeasurementRelationship()
	 * @generated
	 */
	EReference getRankingMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RankingMeasurementRelationship#getTo()
	 * @see #getRankingMeasurementRelationship()
	 * @generated
	 */
	EReference getRankingMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.CategoryRelationship <em>Category Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Relationship</em>'.
	 * @see smm.CategoryRelationship
	 * @generated
	 */
	EClass getCategoryRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.CategoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.CategoryRelationship#getFrom()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.CategoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.CategoryRelationship#getTo()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see smm.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link smm.Characteristic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see smm.Characteristic#getParent()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Parent();

	/**
	 * Returns the meta object for class '{@link smm.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see smm.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link smm.DirectMeasurement <em>Direct Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measurement</em>'.
	 * @see smm.DirectMeasurement
	 * @generated
	 */
	EClass getDirectMeasurement();

	/**
	 * Returns the meta object for class '{@link smm.Counting <em>Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counting</em>'.
	 * @see smm.Counting
	 * @generated
	 */
	EClass getCounting();

	/**
	 * Returns the meta object for class '{@link smm.DirectMeasure <em>Direct Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measure</em>'.
	 * @see smm.DirectMeasure
	 * @generated
	 */
	EClass getDirectMeasure();

	/**
	 * Returns the meta object for the reference '{@link smm.DirectMeasure#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see smm.DirectMeasure#getOperation()
	 * @see #getDirectMeasure()
	 * @generated
	 */
	EReference getDirectMeasure_Operation();

	/**
	 * Returns the meta object for class '{@link smm.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see smm.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the reference '{@link smm.Grade#getIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Base Supplied</em>'.
	 * @see smm.Grade#getIsBaseSupplied()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference '{@link smm.Grade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see smm.Grade#getValue()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Value();

	/**
	 * Returns the meta object for the reference '{@link smm.Grade#getRankingTo <em>Ranking To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranking To</em>'.
	 * @see smm.Grade#getRankingTo()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_RankingTo();

	/**
	 * Returns the meta object for class '{@link smm.MeasureLibrary <em>Measure Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Library</em>'.
	 * @see smm.MeasureLibrary
	 * @generated
	 */
	EClass getMeasureLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.MeasureLibrary#getMeasureElements <em>Measure Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Elements</em>'.
	 * @see smm.MeasureLibrary#getMeasureElements()
	 * @see #getMeasureLibrary()
	 * @generated
	 */
	EReference getMeasureLibrary_MeasureElements();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.MeasureLibrary#getCategoryRelationships <em>Category Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Relationships</em>'.
	 * @see smm.MeasureLibrary#getCategoryRelationships()
	 * @see #getMeasureLibrary()
	 * @generated
	 */
	EReference getMeasureLibrary_CategoryRelationships();

	/**
	 * Returns the meta object for class '{@link smm.MofElement <em>Mof Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Element</em>'.
	 * @see smm.MofElement
	 * @generated
	 */
	EClass getMofElement();

	/**
	 * Returns the meta object for class '{@link smm.NamedMeasure <em>Named Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measure</em>'.
	 * @see smm.NamedMeasure
	 * @generated
	 */
	EClass getNamedMeasure();

	/**
	 * Returns the meta object for class '{@link smm.NamedMeasurement <em>Named Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measurement</em>'.
	 * @see smm.NamedMeasurement
	 * @generated
	 */
	EClass getNamedMeasurement();

	/**
	 * Returns the meta object for class '{@link smm.OclOperation <em>Ocl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Operation</em>'.
	 * @see smm.OclOperation
	 * @generated
	 */
	EClass getOclOperation();

	/**
	 * Returns the meta object for the reference '{@link smm.OclOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see smm.OclOperation#getContext()
	 * @see #getOclOperation()
	 * @generated
	 */
	EReference getOclOperation_Context();

	/**
	 * Returns the meta object for the reference '{@link smm.OclOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see smm.OclOperation#getBody()
	 * @see #getOclOperation()
	 * @generated
	 */
	EReference getOclOperation_Body();

	/**
	 * Returns the meta object for class '{@link smm.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see smm.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the reference '{@link smm.Observation#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observer</em>'.
	 * @see smm.Observation#getObserver()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Observer();

	/**
	 * Returns the meta object for the reference '{@link smm.Observation#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see smm.Observation#getTool()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Tool();

	/**
	 * Returns the meta object for the reference '{@link smm.Observation#getWhenObserved <em>When Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When Observed</em>'.
	 * @see smm.Observation#getWhenObserved()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_WhenObserved();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Observation#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see smm.Observation#getScopes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Scopes();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Observation#getObservedMeasures <em>Observed Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observed Measures</em>'.
	 * @see smm.Observation#getObservedMeasures()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_ObservedMeasures();

	/**
	 * Returns the meta object for the reference list '{@link smm.Observation#getRequestedMeasures <em>Requested Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requested Measures</em>'.
	 * @see smm.Observation#getRequestedMeasures()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_RequestedMeasures();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Observation#getMeasurementRelations <em>Measurement Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Relations</em>'.
	 * @see smm.Observation#getMeasurementRelations()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_MeasurementRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Observation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see smm.Observation#getArguments()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Arguments();

	/**
	 * Returns the meta object for class '{@link smm.ObservationScope <em>Observation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation Scope</em>'.
	 * @see smm.ObservationScope
	 * @generated
	 */
	EClass getObservationScope();

	/**
	 * Returns the meta object for the reference '{@link smm.ObservationScope#getScopeUri <em>Scope Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope Uri</em>'.
	 * @see smm.ObservationScope#getScopeUri()
	 * @see #getObservationScope()
	 * @generated
	 */
	EReference getObservationScope_ScopeUri();

	/**
	 * Returns the meta object for class '{@link smm.ObservedMeasure <em>Observed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observed Measure</em>'.
	 * @see smm.ObservedMeasure
	 * @generated
	 */
	EClass getObservedMeasure();

	/**
	 * Returns the meta object for the reference '{@link smm.ObservedMeasure#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see smm.ObservedMeasure#getMeasure()
	 * @see #getObservedMeasure()
	 * @generated
	 */
	EReference getObservedMeasure_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.ObservedMeasure#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see smm.ObservedMeasure#getMeasurements()
	 * @see #getObservedMeasure()
	 * @generated
	 */
	EReference getObservedMeasure_Measurements();

	/**
	 * Returns the meta object for class '{@link smm.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see smm.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.Ranking#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interval</em>'.
	 * @see smm.Ranking#getInterval()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Interval();

	/**
	 * Returns the meta object for the reference '{@link smm.Ranking#getRankingTo <em>Ranking To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranking To</em>'.
	 * @see smm.Ranking#getRankingTo()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_RankingTo();

	/**
	 * Returns the meta object for class '{@link smm.RankingInterval <em>Ranking Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Interval</em>'.
	 * @see smm.RankingInterval
	 * @generated
	 */
	EClass getRankingInterval();

	/**
	 * Returns the meta object for the attribute '{@link smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Endpoint</em>'.
	 * @see smm.RankingInterval#getMaximumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MaximumEndpoint();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingInterval#getMaximumOpen <em>Maximum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Open</em>'.
	 * @see smm.RankingInterval#getMaximumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EReference getRankingInterval_MaximumOpen();

	/**
	 * Returns the meta object for the attribute '{@link smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Endpoint</em>'.
	 * @see smm.RankingInterval#getMinimumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MinimumEndpoint();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingInterval#getMinimumOpen <em>Minimum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Open</em>'.
	 * @see smm.RankingInterval#getMinimumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EReference getRankingInterval_MinimumOpen();

	/**
	 * Returns the meta object for the reference '{@link smm.RankingInterval#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see smm.RankingInterval#getSymbol()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EReference getRankingInterval_Symbol();

	/**
	 * Returns the meta object for class '{@link smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Measure</em>'.
	 * @see smm.RatioMeasure
	 * @generated
	 */
	EClass getRatioMeasure();

	/**
	 * Returns the meta object for class '{@link smm.RatioMeasurement <em>Ratio Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Measurement</em>'.
	 * @see smm.RatioMeasurement
	 * @generated
	 */
	EClass getRatioMeasurement();

	/**
	 * Returns the meta object for class '{@link smm.RecursiveMeasureRelationship <em>Recursive Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursive Measure Relationship</em>'.
	 * @see smm.RecursiveMeasureRelationship
	 * @generated
	 */
	EClass getRecursiveMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link smm.RecursiveMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see smm.RecursiveMeasureRelationship#getFrom()
	 * @see #getRecursiveMeasureRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link smm.RecursiveMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see smm.RecursiveMeasureRelationship#getTo()
	 * @see #getRecursiveMeasureRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see smm.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the reference '{@link smm.Scope#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see smm.Scope#getClass_()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Class();

	/**
	 * Returns the meta object for the reference '{@link smm.Scope#getRecognizer <em>Recognizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recognizer</em>'.
	 * @see smm.Scope#getRecognizer()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Recognizer();

	/**
	 * Returns the meta object for the reference '{@link smm.Scope#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Break Condition</em>'.
	 * @see smm.Scope#getBreakCondition()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_BreakCondition();

	/**
	 * Returns the meta object for class '{@link smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see smm.SmmModel
	 * @generated
	 */
	EClass getSmmModel();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.SmmModel#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see smm.SmmModel#getObservations()
	 * @see #getSmmModel()
	 * @generated
	 */
	EReference getSmmModel_Observations();

	/**
	 * Returns the meta object for the containment reference list '{@link smm.SmmModel#getLibrairies <em>Librairies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Librairies</em>'.
	 * @see smm.SmmModel#getLibrairies()
	 * @see #getSmmModel()
	 * @generated
	 */
	EReference getSmmModel_Librairies();

	/**
	 * Returns the meta object for enum '{@link smm.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accumulator</em>'.
	 * @see smm.Accumulator
	 * @generated
	 */
	EEnum getAccumulator();

	/**
	 * Returns the meta object for data type '{@link String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see String
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see Boolean
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see Double
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmmFactory getSmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.AbstractMeasureElementImpl
		 * @see smm.impl.SmmPackageImpl#getAbstractMeasureElement()
		 * @generated
		 */
		EClass ABSTRACT_MEASURE_ELEMENT = eINSTANCE.getAbstractMeasureElement();

		/**
		 * The meta object literal for the '{@link smm.impl.SmmElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.SmmElementImpl
		 * @see smm.impl.SmmPackageImpl#getSmmElement()
		 * @generated
		 */
		EClass SMM_ELEMENT = eINSTANCE.getSmmElement();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ATTRIBUTES = eINSTANCE.getSmmElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ANNOTATIONS = eINSTANCE.getSmmElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__NAME = eINSTANCE.getSmmElement_Name();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMM_ELEMENT__SHORT_DESCRIPTION = eINSTANCE.getSmmElement_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__DESCRIPTION = eINSTANCE.getSmmElement_Description();

		/**
		 * The meta object literal for the '{@link smm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.AttributeImpl
		 * @see smm.impl.SmmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TAG = eINSTANCE.getAttribute_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link smm.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.AnnotationImpl
		 * @see smm.impl.SmmPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link smm.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.ArgumentImpl
		 * @see smm.impl.SmmPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

		/**
		 * The meta object literal for the '{@link smm.impl.Base1MeasureRelationshipImpl <em>Base1 Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.Base1MeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBase1MeasureRelationship()
		 * @generated
		 */
		EClass BASE1_MEASURE_RELATIONSHIP = eINSTANCE.getBase1MeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBase1MeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBase1MeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getMeasureRelationship()
		 * @generated
		 */
		EClass MEASURE_RELATIONSHIP = eINSTANCE.getMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>Measurand Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RELATIONSHIP__MEASURAND_QUERY = eINSTANCE.getMeasureRelationship_MeasurandQuery();

		/**
		 * The meta object literal for the '{@link smm.impl.SmmRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.SmmRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getSmmRelationship()
		 * @generated
		 */
		EClass SMM_RELATIONSHIP = eINSTANCE.getSmmRelationship();

		/**
		 * The meta object literal for the '{@link smm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.OperationImpl
		 * @see smm.impl.SmmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LANGUAGE = eINSTANCE.getOperation_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '{@link smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.BinaryMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getBinaryMeasure()
		 * @generated
		 */
		EClass BINARY_MEASURE = eINSTANCE.getBinaryMeasure();

		/**
		 * The meta object literal for the '<em><b>Base Measure2 To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE2_TO = eINSTANCE.getBinaryMeasure_BaseMeasure2To();

		/**
		 * The meta object literal for the '<em><b>Functor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__FUNCTOR = eINSTANCE.getBinaryMeasure_Functor();

		/**
		 * The meta object literal for the '<em><b>Base Measure1 To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE1_TO = eINSTANCE.getBinaryMeasure_BaseMeasure1To();

		/**
		 * The meta object literal for the '{@link smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.DimensionalMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getDimensionalMeasure()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASURE = eINSTANCE.getDimensionalMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__UNIT = eINSTANCE.getDimensionalMeasure_Unit();

		/**
		 * The meta object literal for the '<em><b>Base Measure From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasureFrom();

		/**
		 * The meta object literal for the '<em><b>Base Measure1 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasure1From();

		/**
		 * The meta object literal for the '<em><b>Base Measure2 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasure2From();

		/**
		 * The meta object literal for the '<em><b>Rescale To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__RESCALE_TO = eINSTANCE.getDimensionalMeasure_RescaleTo();

		/**
		 * The meta object literal for the '<em><b>Ranking From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__RANKING_FROM = eINSTANCE.getDimensionalMeasure_RankingFrom();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasureImpl
		 * @see smm.impl.SmmPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__CATEGORY = eINSTANCE.getMeasure_Category();

		/**
		 * The meta object literal for the '<em><b>Trait</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__TRAIT = eINSTANCE.getMeasure_Trait();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SCOPE = eINSTANCE.getMeasure_Scope();

		/**
		 * The meta object literal for the '<em><b>Measure Label Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASURE_LABEL_FORMAT = eINSTANCE.getMeasure_MeasureLabelFormat();

		/**
		 * The meta object literal for the '<em><b>Refinement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REFINEMENT_TO = eINSTANCE.getMeasure_RefinementTo();

		/**
		 * The meta object literal for the '<em><b>Refinement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REFINEMENT_FROM = eINSTANCE.getMeasure_RefinementFrom();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_TO = eINSTANCE.getMeasure_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_FROM = eINSTANCE.getMeasure_EquivalentFrom();

		/**
		 * The meta object literal for the '<em><b>Recursive To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__RECURSIVE_TO = eINSTANCE.getMeasure_RecursiveTo();

		/**
		 * The meta object literal for the '<em><b>Recursive From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__RECURSIVE_FROM = eINSTANCE.getMeasure_RecursiveFrom();

		/**
		 * The meta object literal for the '<em><b>Measurement Label Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASUREMENT_LABEL_FORMAT = eINSTANCE.getMeasure_MeasurementLabelFormat();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__VISIBLE = eINSTANCE.getMeasure_Visible();

		/**
		 * The meta object literal for the '<em><b>Measure Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASURE_RELATIONSHIPS = eINSTANCE.getMeasure_MeasureRelationships();

		/**
		 * The meta object literal for the '<em><b>Default Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__DEFAULT_QUERY = eINSTANCE.getMeasure_DefaultQuery();

		/**
		 * The meta object literal for the '<em><b>Inbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__INBOUND = eINSTANCE.getMeasure_Inbound();

		/**
		 * The meta object literal for the '<em><b>Outbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__OUTBOUND = eINSTANCE.getMeasure_Outbound();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasureCategoryImpl <em>Measure Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasureCategoryImpl
		 * @see smm.impl.SmmPackageImpl#getMeasureCategory()
		 * @generated
		 */
		EClass MEASURE_CATEGORY = eINSTANCE.getMeasureCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY = eINSTANCE.getMeasureCategory_Category();

		/**
		 * The meta object literal for the '<em><b>Category Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY_ELEMENT = eINSTANCE.getMeasureCategory_CategoryElement();

		/**
		 * The meta object literal for the '<em><b>Category Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY_MEASURE = eINSTANCE.getMeasureCategory_CategoryMeasure();

		/**
		 * The meta object literal for the '{@link smm.impl.RefinementMeasureRelationshipImpl <em>Refinement Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RefinementMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRefinementMeasureRelationship()
		 * @generated
		 */
		EClass REFINEMENT_MEASURE_RELATIONSHIP = eINSTANCE.getRefinementMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRefinementMeasureRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRefinementMeasureRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.EquivalentMeasureRelationshipImpl <em>Equivalent Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.EquivalentMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getEquivalentMeasureRelationship()
		 * @generated
		 */
		EClass EQUIVALENT_MEASURE_RELATIONSHIP = eINSTANCE.getEquivalentMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING = eINSTANCE.getEquivalentMeasureRelationship_Mapping();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__TO = eINSTANCE.getEquivalentMeasureRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getEquivalentMeasureRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.BaseMeasureRelationshipImpl <em>Base Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.BaseMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBaseMeasureRelationship()
		 * @generated
		 */
		EClass BASE_MEASURE_RELATIONSHIP = eINSTANCE.getBaseMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBaseMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBaseMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CollectiveMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getCollectiveMeasure()
		 * @generated
		 */
		EClass COLLECTIVE_MEASURE = eINSTANCE.getCollectiveMeasure();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASURE__ACCUMULATOR = eINSTANCE.getCollectiveMeasure_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Base Measure To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASURE__BASE_MEASURE_TO = eINSTANCE.getCollectiveMeasure_BaseMeasureTo();

		/**
		 * The meta object literal for the '{@link smm.impl.Base2MeasureRelationshipImpl <em>Base2 Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.Base2MeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBase2MeasureRelationship()
		 * @generated
		 */
		EClass BASE2_MEASURE_RELATIONSHIP = eINSTANCE.getBase2MeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBase2MeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBase2MeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.RescaleMeasureRelationshipImpl <em>Rescale Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RescaleMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRescaleMeasureRelationship()
		 * @generated
		 */
		EClass RESCALE_MEASURE_RELATIONSHIP = eINSTANCE.getRescaleMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRescaleMeasureRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRescaleMeasureRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RescaledMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getRescaledMeasure()
		 * @generated
		 */
		EClass RESCALED_MEASURE = eINSTANCE.getRescaledMeasure();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALED_MEASURE__FORMULA = eINSTANCE.getRescaledMeasure_Formula();

		/**
		 * The meta object literal for the '<em><b>Rescale From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALED_MEASURE__RESCALE_FROM = eINSTANCE.getRescaledMeasure_RescaleFrom();

		/**
		 * The meta object literal for the '{@link smm.impl.RankingMeasureRelationshipImpl <em>Ranking Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RankingMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRankingMeasureRelationship()
		 * @generated
		 */
		EClass RANKING_MEASURE_RELATIONSHIP = eINSTANCE.getRankingMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRankingMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRankingMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.Base1MeasurementRelationshipImpl <em>Base1 Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.Base1MeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBase1MeasurementRelationship()
		 * @generated
		 */
		EClass BASE1_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBase1MeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBase1MeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBase1MeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getMeasurementRelationship()
		 * @generated
		 */
		EClass MEASUREMENT_RELATIONSHIP = eINSTANCE.getMeasurementRelationship();

		/**
		 * The meta object literal for the '{@link smm.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.BinaryMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getBinaryMeasurement()
		 * @generated
		 */
		EClass BINARY_MEASUREMENT = eINSTANCE.getBinaryMeasurement();

		/**
		 * The meta object literal for the '<em><b>Base Measurement2 To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO = eINSTANCE.getBinaryMeasurement_BaseMeasurement2To();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getBinaryMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Base Measurement1 To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO = eINSTANCE.getBinaryMeasurement_BaseMeasurement1To();

		/**
		 * The meta object literal for the '{@link smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.DimensionalMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getDimensionalMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__VALUE = eINSTANCE.getDimensionalMeasurement_Value();

		/**
		 * The meta object literal for the '<em><b>Base Measurement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurementFrom();

		/**
		 * The meta object literal for the '<em><b>Base Measurement1 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurement1From();

		/**
		 * The meta object literal for the '<em><b>Base Measurement2 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurement2From();

		/**
		 * The meta object literal for the '<em><b>Rescale To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__RESCALE_TO = eINSTANCE.getDimensionalMeasurement_RescaleTo();

		/**
		 * The meta object literal for the '<em><b>Ranking From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__RANKING_FROM = eINSTANCE.getDimensionalMeasurement_RankingFrom();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__ERROR = eINSTANCE.getMeasurement_Error();

		/**
		 * The meta object literal for the '<em><b>Measurand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURAND = eINSTANCE.getMeasurement_Measurand();

		/**
		 * The meta object literal for the '<em><b>Break Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__BREAK_VALUE = eINSTANCE.getMeasurement_BreakValue();

		/**
		 * The meta object literal for the '<em><b>Refinement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REFINEMENT_TO = eINSTANCE.getMeasurement_RefinementTo();

		/**
		 * The meta object literal for the '<em><b>Refinement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REFINEMENT_FROM = eINSTANCE.getMeasurement_RefinementFrom();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EQUIVALENT_TO = eINSTANCE.getMeasurement_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EQUIVALENT_FROM = eINSTANCE.getMeasurement_EquivalentFrom();

		/**
		 * The meta object literal for the '<em><b>Recursive To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RECURSIVE_TO = eINSTANCE.getMeasurement_RecursiveTo();

		/**
		 * The meta object literal for the '<em><b>Recursive From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RECURSIVE_FROM = eINSTANCE.getMeasurement_RecursiveFrom();

		/**
		 * The meta object literal for the '<em><b>Measurement Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_RELATIONSHIPS = eINSTANCE.getMeasurement_MeasurementRelationships();

		/**
		 * The meta object literal for the '<em><b>Inbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__INBOUND = eINSTANCE.getMeasurement_Inbound();

		/**
		 * The meta object literal for the '<em><b>Outbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__OUTBOUND = eINSTANCE.getMeasurement_Outbound();

		/**
		 * The meta object literal for the '{@link smm.impl.RefinementMeasurementRelationshipImpl <em>Refinement Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RefinementMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRefinementMeasurementRelationship()
		 * @generated
		 */
		EClass REFINEMENT_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRefinementMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRefinementMeasurementRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRefinementMeasurementRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.EquivalentMeasurementRelationshipImpl <em>Equivalent Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.EquivalentMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getEquivalentMeasurementRelationship()
		 * @generated
		 */
		EClass EQUIVALENT_MEASUREMENT_RELATIONSHIP = eINSTANCE.getEquivalentMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getEquivalentMeasurementRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getEquivalentMeasurementRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.RecursiveMeasurementRelationshipImpl <em>Recursive Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RecursiveMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRecursiveMeasurementRelationship()
		 * @generated
		 */
		EClass RECURSIVE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRecursiveMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRecursiveMeasurementRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRecursiveMeasurementRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.BaseMeasurementRelationshipImpl <em>Base Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.BaseMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBaseMeasurementRelationship()
		 * @generated
		 */
		EClass BASE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBaseMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBaseMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBaseMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CollectiveMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getCollectiveMeasurement()
		 * @generated
		 */
		EClass COLLECTIVE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__ACCUMULATOR = eINSTANCE.getCollectiveMeasurement_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getCollectiveMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Base Measurement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO = eINSTANCE.getCollectiveMeasurement_BaseMeasurementTo();

		/**
		 * The meta object literal for the '{@link smm.impl.Base2MeasurementRelationshipImpl <em>Base2 Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.Base2MeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getBase2MeasurementRelationship()
		 * @generated
		 */
		EClass BASE2_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBase2MeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBase2MeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBase2MeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.RescaleMeasurementRelationshipImpl <em>Rescale Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RescaleMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRescaleMeasurementRelationship()
		 * @generated
		 */
		EClass RESCALE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRescaleMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRescaleMeasurementRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRescaleMeasurementRelationship_From();

		/**
		 * The meta object literal for the '{@link smm.impl.RescaledMeasurementImpl <em>Rescaled Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RescaledMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getRescaledMeasurement()
		 * @generated
		 */
		EClass RESCALED_MEASUREMENT = eINSTANCE.getRescaledMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESCALED_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getRescaledMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Rescale From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALED_MEASUREMENT__RESCALE_FROM = eINSTANCE.getRescaledMeasurement_RescaleFrom();

		/**
		 * The meta object literal for the '{@link smm.impl.RankingMeasurementRelationshipImpl <em>Ranking Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RankingMeasurementRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRankingMeasurementRelationship()
		 * @generated
		 */
		EClass RANKING_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRankingMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRankingMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRankingMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CategoryRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getCategoryRelationship()
		 * @generated
		 */
		EClass CATEGORY_RELATIONSHIP = eINSTANCE.getCategoryRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__FROM = eINSTANCE.getCategoryRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__TO = eINSTANCE.getCategoryRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CharacteristicImpl
		 * @see smm.impl.SmmPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__PARENT = eINSTANCE.getCharacteristic_Parent();

		/**
		 * The meta object literal for the '{@link smm.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CountImpl
		 * @see smm.impl.SmmPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.DirectMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getDirectMeasurement()
		 * @generated
		 */
		EClass DIRECT_MEASUREMENT = eINSTANCE.getDirectMeasurement();

		/**
		 * The meta object literal for the '{@link smm.impl.CountingImpl <em>Counting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.CountingImpl
		 * @see smm.impl.SmmPackageImpl#getCounting()
		 * @generated
		 */
		EClass COUNTING = eINSTANCE.getCounting();

		/**
		 * The meta object literal for the '{@link smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.DirectMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getDirectMeasure()
		 * @generated
		 */
		EClass DIRECT_MEASURE = eINSTANCE.getDirectMeasure();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_MEASURE__OPERATION = eINSTANCE.getDirectMeasure_Operation();

		/**
		 * The meta object literal for the '{@link smm.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.GradeImpl
		 * @see smm.impl.SmmPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__IS_BASE_SUPPLIED = eINSTANCE.getGrade_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
		 * The meta object literal for the '<em><b>Ranking To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__RANKING_TO = eINSTANCE.getGrade_RankingTo();

		/**
		 * The meta object literal for the '{@link smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MeasureLibraryImpl
		 * @see smm.impl.SmmPackageImpl#getMeasureLibrary()
		 * @generated
		 */
		EClass MEASURE_LIBRARY = eINSTANCE.getMeasureLibrary();

		/**
		 * The meta object literal for the '<em><b>Measure Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_LIBRARY__MEASURE_ELEMENTS = eINSTANCE.getMeasureLibrary_MeasureElements();

		/**
		 * The meta object literal for the '<em><b>Category Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS = eINSTANCE.getMeasureLibrary_CategoryRelationships();

		/**
		 * The meta object literal for the '{@link smm.impl.MofElementImpl <em>Mof Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.MofElementImpl
		 * @see smm.impl.SmmPackageImpl#getMofElement()
		 * @generated
		 */
		EClass MOF_ELEMENT = eINSTANCE.getMofElement();

		/**
		 * The meta object literal for the '{@link smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.NamedMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getNamedMeasure()
		 * @generated
		 */
		EClass NAMED_MEASURE = eINSTANCE.getNamedMeasure();

		/**
		 * The meta object literal for the '{@link smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.NamedMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getNamedMeasurement()
		 * @generated
		 */
		EClass NAMED_MEASUREMENT = eINSTANCE.getNamedMeasurement();

		/**
		 * The meta object literal for the '{@link smm.impl.OclOperationImpl <em>Ocl Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.OclOperationImpl
		 * @see smm.impl.SmmPackageImpl#getOclOperation()
		 * @generated
		 */
		EClass OCL_OPERATION = eINSTANCE.getOclOperation();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__CONTEXT = eINSTANCE.getOclOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__BODY = eINSTANCE.getOclOperation_Body();

		/**
		 * The meta object literal for the '{@link smm.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.ObservationImpl
		 * @see smm.impl.SmmPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__OBSERVER = eINSTANCE.getObservation_Observer();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__TOOL = eINSTANCE.getObservation_Tool();

		/**
		 * The meta object literal for the '<em><b>When Observed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__WHEN_OBSERVED = eINSTANCE.getObservation_WhenObserved();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__SCOPES = eINSTANCE.getObservation_Scopes();

		/**
		 * The meta object literal for the '<em><b>Observed Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__OBSERVED_MEASURES = eINSTANCE.getObservation_ObservedMeasures();

		/**
		 * The meta object literal for the '<em><b>Requested Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__REQUESTED_MEASURES = eINSTANCE.getObservation_RequestedMeasures();

		/**
		 * The meta object literal for the '<em><b>Measurement Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__MEASUREMENT_RELATIONS = eINSTANCE.getObservation_MeasurementRelations();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__ARGUMENTS = eINSTANCE.getObservation_Arguments();

		/**
		 * The meta object literal for the '{@link smm.impl.ObservationScopeImpl <em>Observation Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.ObservationScopeImpl
		 * @see smm.impl.SmmPackageImpl#getObservationScope()
		 * @generated
		 */
		EClass OBSERVATION_SCOPE = eINSTANCE.getObservationScope();

		/**
		 * The meta object literal for the '<em><b>Scope Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION_SCOPE__SCOPE_URI = eINSTANCE.getObservationScope_ScopeUri();

		/**
		 * The meta object literal for the '{@link smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.ObservedMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getObservedMeasure()
		 * @generated
		 */
		EClass OBSERVED_MEASURE = eINSTANCE.getObservedMeasure();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVED_MEASURE__MEASURE = eINSTANCE.getObservedMeasure_Measure();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVED_MEASURE__MEASUREMENTS = eINSTANCE.getObservedMeasure_Measurements();

		/**
		 * The meta object literal for the '{@link smm.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RankingImpl
		 * @see smm.impl.SmmPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__INTERVAL = eINSTANCE.getRanking_Interval();

		/**
		 * The meta object literal for the '<em><b>Ranking To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__RANKING_TO = eINSTANCE.getRanking_RankingTo();

		/**
		 * The meta object literal for the '{@link smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RankingIntervalImpl
		 * @see smm.impl.SmmPackageImpl#getRankingInterval()
		 * @generated
		 */
		EClass RANKING_INTERVAL = eINSTANCE.getRankingInterval();

		/**
		 * The meta object literal for the '<em><b>Maximum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MAXIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MaximumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Maximum Open</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_INTERVAL__MAXIMUM_OPEN = eINSTANCE.getRankingInterval_MaximumOpen();

		/**
		 * The meta object literal for the '<em><b>Minimum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MINIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MinimumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Minimum Open</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_INTERVAL__MINIMUM_OPEN = eINSTANCE.getRankingInterval_MinimumOpen();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_INTERVAL__SYMBOL = eINSTANCE.getRankingInterval_Symbol();

		/**
		 * The meta object literal for the '{@link smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RatioMeasureImpl
		 * @see smm.impl.SmmPackageImpl#getRatioMeasure()
		 * @generated
		 */
		EClass RATIO_MEASURE = eINSTANCE.getRatioMeasure();

		/**
		 * The meta object literal for the '{@link smm.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RatioMeasurementImpl
		 * @see smm.impl.SmmPackageImpl#getRatioMeasurement()
		 * @generated
		 */
		EClass RATIO_MEASUREMENT = eINSTANCE.getRatioMeasurement();

		/**
		 * The meta object literal for the '{@link smm.impl.RecursiveMeasureRelationshipImpl <em>Recursive Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.RecursiveMeasureRelationshipImpl
		 * @see smm.impl.SmmPackageImpl#getRecursiveMeasureRelationship()
		 * @generated
		 */
		EClass RECURSIVE_MEASURE_RELATIONSHIP = eINSTANCE.getRecursiveMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRecursiveMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRecursiveMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link smm.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.ScopeImpl
		 * @see smm.impl.SmmPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__CLASS = eINSTANCE.getScope_Class();

		/**
		 * The meta object literal for the '<em><b>Recognizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__RECOGNIZER = eINSTANCE.getScope_Recognizer();

		/**
		 * The meta object literal for the '<em><b>Break Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BREAK_CONDITION = eINSTANCE.getScope_BreakCondition();

		/**
		 * The meta object literal for the '{@link smm.impl.SmmModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.impl.SmmModelImpl
		 * @see smm.impl.SmmPackageImpl#getSmmModel()
		 * @generated
		 */
		EClass SMM_MODEL = eINSTANCE.getSmmModel();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_MODEL__OBSERVATIONS = eINSTANCE.getSmmModel_Observations();

		/**
		 * The meta object literal for the '<em><b>Librairies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_MODEL__LIBRAIRIES = eINSTANCE.getSmmModel_Librairies();

		/**
		 * The meta object literal for the '{@link smm.Accumulator <em>Accumulator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smm.Accumulator
		 * @see smm.impl.SmmPackageImpl#getAccumulator()
		 * @generated
		 */
		EEnum ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see String
		 * @see smm.impl.SmmPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Boolean
		 * @see smm.impl.SmmPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see smm.impl.SmmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Double
		 * @see smm.impl.SmmPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see smm.impl.SmmPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //SmmPackage
