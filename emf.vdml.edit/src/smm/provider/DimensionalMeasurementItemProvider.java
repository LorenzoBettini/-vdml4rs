/**
 */
package smm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import smm.DimensionalMeasurement;
import smm.SmmPackage;

/**
 * This is the item provider adapter for a {@link smm.DimensionalMeasurement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionalMeasurementItemProvider extends MeasurementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurementItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
			addBaseMeasurementFromPropertyDescriptor(object);
			addBaseMeasurement1FromPropertyDescriptor(object);
			addBaseMeasurement2FromPropertyDescriptor(object);
			addRescaleToPropertyDescriptor(object);
			addRankingFromPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_value_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Measurement From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseMeasurementFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_baseMeasurementFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_baseMeasurementFrom_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Measurement1 From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseMeasurement1FromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_baseMeasurement1From_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_baseMeasurement1From_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Measurement2 From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseMeasurement2FromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_baseMeasurement2From_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_baseMeasurement2From_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rescale To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRescaleToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_rescaleTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_rescaleTo_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__RESCALE_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ranking From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRankingFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionalMeasurement_rankingFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionalMeasurement_rankingFrom_feature", "_UI_DimensionalMeasurement_type"),
				 SmmPackage.Literals.DIMENSIONAL_MEASUREMENT__RANKING_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((DimensionalMeasurement)object).getShortDescription();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DimensionalMeasurement_type") :
			getString("_UI_DimensionalMeasurement_type") + " " + label;
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
