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

import smm.Measurement;
import smm.SmmFactory;
import smm.SmmPackage;

/**
 * This is the item provider adapter for a {@link smm.Measurement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementItemProvider extends SmmElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementItemProvider(AdapterFactory adapterFactory) {
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

			addErrorPropertyDescriptor(object);
			addMeasurandPropertyDescriptor(object);
			addBreakValuePropertyDescriptor(object);
			addRefinementToPropertyDescriptor(object);
			addRefinementFromPropertyDescriptor(object);
			addEquivalentToPropertyDescriptor(object);
			addEquivalentFromPropertyDescriptor(object);
			addRecursiveToPropertyDescriptor(object);
			addRecursiveFromPropertyDescriptor(object);
			addInboundPropertyDescriptor(object);
			addOutboundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_error_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__ERROR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measurand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasurandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_measurand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_measurand_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__MEASURAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Break Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBreakValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_breakValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_breakValue_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__BREAK_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refinement To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinementToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_refinementTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_refinementTo_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__REFINEMENT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refinement From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinementFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_refinementFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_refinementFrom_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__REFINEMENT_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_equivalentTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_equivalentTo_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__EQUIVALENT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_equivalentFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_equivalentFrom_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__EQUIVALENT_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recursive To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecursiveToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_recursiveTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_recursiveTo_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__RECURSIVE_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recursive From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecursiveFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_recursiveFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_recursiveFrom_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__RECURSIVE_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInboundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_inbound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_inbound_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__INBOUND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outbound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutboundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measurement_outbound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measurement_outbound_feature", "_UI_Measurement_type"),
				 SmmPackage.Literals.MEASUREMENT__OUTBOUND,
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
			childrenFeatures.add(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((Measurement)object).getShortDescription();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Measurement_type") :
			getString("_UI_Measurement_type") + " " + label;
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

		switch (notification.getFeatureID(Measurement.class)) {
			case SmmPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
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
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBase1MeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRefinementMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createEquivalentMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRecursiveMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBaseMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBase2MeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRescaleMeasurementRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASUREMENT__MEASUREMENT_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRankingMeasurementRelationship()));
	}

}
