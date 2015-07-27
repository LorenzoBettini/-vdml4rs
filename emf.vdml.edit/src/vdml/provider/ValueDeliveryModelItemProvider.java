/**
 */
package vdml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import smm.SmmFactory;

import vdml.ValueDeliveryModel;
import vdml.VdmlFactory;
import vdml.VdmlPackage;

/**
 * This is the item provider adapter for a {@link vdml.ValueDeliveryModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueDeliveryModelItemProvider extends VdmlElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDeliveryModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__METRICS_MODEL);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__VALUE_LIBRARY);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__ACTOR);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__SCENARIO);
			childrenFeatures.add(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION);
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
	 * This returns ValueDeliveryModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueDeliveryModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ValueDeliveryModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ValueDeliveryModel_type") :
			getString("_UI_ValueDeliveryModel_type") + " " + label;
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

		switch (notification.getFeatureID(ValueDeliveryModel.class)) {
			case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
			case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
			case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
			case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
			case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
			case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
			case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
			case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
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
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__METRICS_MODEL,
				 SmmFactory.eINSTANCE.createSmmModel()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__VALUE_LIBRARY,
				 VdmlFactory.eINSTANCE.createValueLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY,
				 VdmlFactory.eINSTANCE.createCapabilityLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY,
				 VdmlFactory.eINSTANCE.createBusinessItemLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__ACTOR,
				 VdmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__ACTOR,
				 VdmlFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY,
				 VdmlFactory.eINSTANCE.createPracticeLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__SCENARIO,
				 VdmlFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION,
				 VdmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION,
				 VdmlFactory.eINSTANCE.createOrgUnit()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION,
				 VdmlFactory.eINSTANCE.createCapabilityMethod()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION,
				 VdmlFactory.eINSTANCE.createBusinessNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.VALUE_DELIVERY_MODEL__COLLABORATION,
				 VdmlFactory.eINSTANCE.createCommunity()));
	}

}
