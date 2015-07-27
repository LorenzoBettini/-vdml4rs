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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import smm.Measure;
import smm.SmmFactory;
import smm.SmmPackage;

/**
 * This is the item provider adapter for a {@link smm.Measure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureItemProvider extends AbstractMeasureElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureItemProvider(AdapterFactory adapterFactory) {
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

			addCategoryPropertyDescriptor(object);
			addTraitPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addMeasureLabelFormatPropertyDescriptor(object);
			addRefinementToPropertyDescriptor(object);
			addRefinementFromPropertyDescriptor(object);
			addEquivalentToPropertyDescriptor(object);
			addEquivalentFromPropertyDescriptor(object);
			addRecursiveToPropertyDescriptor(object);
			addRecursiveFromPropertyDescriptor(object);
			addMeasurementLabelFormatPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addDefaultQueryPropertyDescriptor(object);
			addInboundPropertyDescriptor(object);
			addOutboundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_category_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trait feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_trait_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_trait_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__TRAIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_scope_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__SCOPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measure Label Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasureLabelFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_measureLabelFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_measureLabelFormat_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__MEASURE_LABEL_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Measure_refinementTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_refinementTo_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__REFINEMENT_TO,
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
				 getString("_UI_Measure_refinementFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_refinementFrom_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__REFINEMENT_FROM,
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
				 getString("_UI_Measure_equivalentTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_equivalentTo_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
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
				 getString("_UI_Measure_equivalentFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_equivalentFrom_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
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
				 getString("_UI_Measure_recursiveTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_recursiveTo_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__RECURSIVE_TO,
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
				 getString("_UI_Measure_recursiveFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_recursiveFrom_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__RECURSIVE_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measurement Label Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasurementLabelFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_measurementLabelFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_measurementLabelFormat_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__MEASUREMENT_LABEL_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_visible_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__VISIBLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Query feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_defaultQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_defaultQuery_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__DEFAULT_QUERY,
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
				 getString("_UI_Measure_inbound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_inbound_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__INBOUND,
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
				 getString("_UI_Measure_outbound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_outbound_feature", "_UI_Measure_type"),
				 SmmPackage.Literals.MEASURE__OUTBOUND,
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
			childrenFeatures.add(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS);
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
		Object labelValue = ((Measure)object).getShortDescription();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Measure_type") :
			getString("_UI_Measure_type") + " " + label;
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

		switch (notification.getFeatureID(Measure.class)) {
			case SmmPackage.MEASURE__MEASURE_LABEL_FORMAT:
			case SmmPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmmPackage.MEASURE__MEASURE_RELATIONSHIPS:
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
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBase1MeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRefinementMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createEquivalentMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBaseMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createBase2MeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRescaleMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRankingMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASURE_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createRecursiveMeasureRelationship()));
	}

}
