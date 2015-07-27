/**
 */
package vdml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vdml.BusinessItemDefinition;
import vdml.VdmlPackage;

/**
 * This is the item provider adapter for a {@link vdml.BusinessItemDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessItemDefinitionItemProvider extends VdmlElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addPracticeDefinitionPropertyDescriptor(object);
			addSupportedCapabilityPropertyDescriptor(object);
			addIsFungiblePropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addCharacteristicDefinitionPropertyDescriptor(object);
			addIsShareablePropertyDescriptor(object);
			addCapabilityDependencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Practice Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPracticeDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_practiceDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_practiceDefinition_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedCapabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_supportedCapability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_supportedCapability_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Fungible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFungiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_isFungible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_isFungible_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_BusinessItemDefinition_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_category_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Characteristic Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharacteristicDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_characteristicDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_characteristicDefinition_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Shareable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsShareablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_isShareable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_isShareable_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capability Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessItemDefinition_capabilityDependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemDefinition_capabilityDependency_feature", "_UI_BusinessItemDefinition_type"),
				 VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns BusinessItemDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessItemDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessItemDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessItemDefinition_type") :
			getString("_UI_BusinessItemDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessItemDefinition.class)) {
			case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
			case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
