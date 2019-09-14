/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ispace.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for VanBanDen. This utility wraps
 * {@link ispace.service.impl.VanBanDenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author hungt
 * @see VanBanDenLocalService
 * @see ispace.service.base.VanBanDenLocalServiceBaseImpl
 * @see ispace.service.impl.VanBanDenLocalServiceImpl
 * @generated
 */
public class VanBanDenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ispace.service.impl.VanBanDenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the van ban den to the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was added
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDen addVanBanDen(
		ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVanBanDen(vanBanDen);
	}

	/**
	* Creates a new van ban den with the primary key. Does not add the van ban den to the database.
	*
	* @param Id the primary key for the new van ban den
	* @return the new van ban den
	*/
	public static ispace.model.VanBanDen createVanBanDen(long Id) {
		return getService().createVanBanDen(Id);
	}

	/**
	* Deletes the van ban den with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the van ban den
	* @return the van ban den that was removed
	* @throws PortalException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDen deleteVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVanBanDen(Id);
	}

	/**
	* Deletes the van ban den from the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDen deleteVanBanDen(
		ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVanBanDen(vanBanDen);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ispace.model.VanBanDen fetchVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVanBanDen(Id);
	}

	/**
	* Returns the van ban den with the primary key.
	*
	* @param Id the primary key of the van ban den
	* @return the van ban den
	* @throws PortalException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDen getVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVanBanDen(Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the van ban dens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of van ban dens
	* @param end the upper bound of the range of van ban dens (not inclusive)
	* @return the range of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.VanBanDen> getVanBanDens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVanBanDens(start, end);
	}

	/**
	* Returns the number of van ban dens.
	*
	* @return the number of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	public static int getVanBanDensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVanBanDensCount();
	}

	/**
	* Updates the van ban den in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDen updateVanBanDen(
		ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVanBanDen(vanBanDen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static VanBanDenLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VanBanDenLocalService.class.getName());

			if (invokableLocalService instanceof VanBanDenLocalService) {
				_service = (VanBanDenLocalService)invokableLocalService;
			}
			else {
				_service = new VanBanDenLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VanBanDenLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VanBanDenLocalService service) {
	}

	private static VanBanDenLocalService _service;
}