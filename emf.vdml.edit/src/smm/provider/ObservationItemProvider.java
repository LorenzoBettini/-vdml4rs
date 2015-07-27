/**
 */
package smm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import smm.Observation;
import smm.SmmFactory;
import smm.SmmPackage;

/**
 * This is the item provider adapter for a {@link smm.Observation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObservationItemProvider extends SmmElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addObserverPropertyDescriptor(object);
			addToolPropertyDescriptor(object);
			addWhenObservedPropertyDescriptor(object);
			addRequestedMeasuresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Observer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObserverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Observation_observer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Observation_observer_feature", "_UI_Observation_type"),
				 SmmPackage.Literals.OBSERVATION__OBSERVER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Observation_tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Observation_tool_feature", "_UI_Observation_type"),
				 SmmPackage.Literals.OBSERVATION__TOOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the When Observed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenObservedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Observation_whenObserved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Observation_whenObserved_feature", "_UI_Observation_type"),
				 SmmPackage.Literals.OBSERVATION__WHEN_OBSERVED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requested Measures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestedMeasuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Observation_requestedMeasures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Observation_requestedMeasures_feature", "_UI_Observation_type"),
				 SmmPackage.Literals.OBSERVATION__REQUESTED_MEASURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SmmPackage.Literals.OBSERVATION__SCOPES);
			childrenFeatures.add(SmmPackage.Literals.OBSERVATION__OBSERVED_MEASURES);
			childrenFeatures.add(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS);
			childrenFeatures.add(SmmPackage.Literals.OBSERVATION__ARGUMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Observation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Observation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((Observation)object).getShortDescription();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Observation_type") :
			getString("_UI_Observation_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Observation.class)) {
			case SmmPackage.OBSERVATION__SCOPES:
			case SmmPackage.OBSERVATION__OBSERVED_MEASURES:
			case SmmPackage.OBSERVATION__MEASUREMENT_RELATIONS:
			case SmmPackage.OBSERVATION__ARGUMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__SCOPES,
				 SmmFactory.eINSTANCE.createObservationScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__OBSERVED_MEASURES,
				 SmmFactory.eINSTANCE.createObservedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBase1MeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRefinementMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createEquivalentMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBaseMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBase2MeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRescaleMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRankingMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBase1MeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRefinementMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createEquivalentMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRecursiveMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBaseMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createBase2MeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRescaleMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRankingMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createCategoryRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createObservedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS,
				 SmmFactory.eINSTANCE.createRecursiveMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.OBSERVATION__ARGUMENTS,
				 SmmFactory.eINSTANCE.createArgument()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SmmPackage.Literals.OBSERVATION__OBSERVED_MEASURES ||
			childFeature == SmmPackage.Literals.OBSERVATION__MEASUREMENT_RELATIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
