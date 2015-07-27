/**
 */
package smm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import smm.MeasureLibrary;
import smm.SmmFactory;
import smm.SmmPackage;

/**
 * This is the item provider adapter for a {@link smm.MeasureLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureLibraryItemProvider extends SmmElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureLibraryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS);
			childrenFeatures.add(SmmPackage.Literals.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS);
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
	 * This returns MeasureLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MeasureLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((MeasureLibrary)object).getShortDescription();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_MeasureLibrary_type") :
			getString("_UI_MeasureLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(MeasureLibrary.class)) {
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
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
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createMeasureCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createCharacteristic()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createOclOperation()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__MEASURE_ELEMENTS,
				 SmmFactory.eINSTANCE.createScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS,
				 SmmFactory.eINSTANCE.createCategoryRelationship()));
	}

}
