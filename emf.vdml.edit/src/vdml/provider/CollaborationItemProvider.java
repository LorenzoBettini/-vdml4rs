/**
 */
package vdml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vdml.Collaboration;
import vdml.VdmlFactory;
import vdml.VdmlPackage;

/**
 * This is the item provider adapter for a {@link vdml.Collaboration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationItemProvider extends ParticipantItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationItemProvider(AdapterFactory adapterFactory) {
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

			addDelegationContextPropertyDescriptor(object);
			addScenarioPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Delegation Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegationContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_delegationContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_delegationContext_feature", "_UI_Collaboration_type"),
				 VdmlPackage.Literals.COLLABORATION__DELEGATION_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scenario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_scenario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_scenario_feature", "_UI_Collaboration_type"),
				 VdmlPackage.Literals.COLLABORATION__SCENARIO,
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
			childrenFeatures.add(VdmlPackage.Literals.PORT_CONTAINER__CONTAINED_PORT);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__GOAL);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__ACTIVITY);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__FLOW);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__BUSINESS_ITEM);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__INTERNAL_PORT_DELEGATION);
			childrenFeatures.add(VdmlPackage.Literals.COLLABORATION__OWNED_ASSIGNMENT);
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
	 * This returns Collaboration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Collaboration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Collaboration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Collaboration_type") :
			getString("_UI_Collaboration_type") + " " + label;
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

		switch (notification.getFeatureID(Collaboration.class)) {
			case VdmlPackage.COLLABORATION__CONTAINED_PORT:
			case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
			case VdmlPackage.COLLABORATION__GOAL:
			case VdmlPackage.COLLABORATION__ACTIVITY:
			case VdmlPackage.COLLABORATION__FLOW:
			case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
			case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
			case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
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
				(VdmlPackage.Literals.PORT_CONTAINER__CONTAINED_PORT,
				 VdmlFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.PORT_CONTAINER__CONTAINED_PORT,
				 VdmlFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createParty()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createTargetRole()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createSourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__COLLABORATION_ROLE,
				 VdmlFactory.eINSTANCE.createSourceTargetRole()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__GOAL,
				 VdmlFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__ACTIVITY,
				 VdmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__FLOW,
				 VdmlFactory.eINSTANCE.createDeliverableFlow()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__BUSINESS_ITEM,
				 VdmlFactory.eINSTANCE.createBusinessItem()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__INTERNAL_PORT_DELEGATION,
				 VdmlFactory.eINSTANCE.createInputDelegation()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__INTERNAL_PORT_DELEGATION,
				 VdmlFactory.eINSTANCE.createOutputDelegation()));

		newChildDescriptors.add
			(createChildParameter
				(VdmlPackage.Literals.COLLABORATION__OWNED_ASSIGNMENT,
				 VdmlFactory.eINSTANCE.createAssignment()));
	}

}
