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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VanBanDenLocalService}.
 *
 * @author hungt
 * @see VanBanDenLocalService
 * @generated
 */
public class VanBanDenLocalServiceWrapper implements VanBanDenLocalService,
	ServiceWrapper<VanBanDenLocalService> {
	public VanBanDenLocalServiceWrapper(
		VanBanDenLocalService vanBanDenLocalService) {
		_vanBanDenLocalService = vanBanDenLocalService;
	}

	/**
	* Adds the van ban den to the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.VanBanDen addVanBanDen(ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.addVanBanDen(vanBanDen);
	}

	/**
	* Creates a new van ban den with the primary key. Does not add the van ban den to the database.
	*
	* @param Id the primary key for the new van ban den
	* @return the new van ban den
	*/
	@Override
	public ispace.model.VanBanDen createVanBanDen(long Id) {
		return _vanBanDenLocalService.createVanBanDen(Id);
	}

	/**
	* Deletes the van ban den with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the van ban den
	* @return the van ban den that was removed
	* @throws PortalException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.VanBanDen deleteVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.deleteVanBanDen(Id);
	}

	/**
	* Deletes the van ban den from the database. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.VanBanDen deleteVanBanDen(
		ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.deleteVanBanDen(vanBanDen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vanBanDenLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ispace.model.VanBanDen fetchVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.fetchVanBanDen(Id);
	}

	/**
	* Returns the van ban den with the primary key.
	*
	* @param Id the primary key of the van ban den
	* @return the van ban den
	* @throws PortalException if a van ban den with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.VanBanDen getVanBanDen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.getVanBanDen(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<ispace.model.VanBanDen> getVanBanDens(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.getVanBanDens(start, end);
	}

	/**
	* Returns the number of van ban dens.
	*
	* @return the number of van ban dens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVanBanDensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.getVanBanDensCount();
	}

	/**
	* Updates the van ban den in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vanBanDen the van ban den
	* @return the van ban den that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.VanBanDen updateVanBanDen(
		ispace.model.VanBanDen vanBanDen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanBanDenLocalService.updateVanBanDen(vanBanDen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vanBanDenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vanBanDenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vanBanDenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VanBanDenLocalService getWrappedVanBanDenLocalService() {
		return _vanBanDenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVanBanDenLocalService(
		VanBanDenLocalService vanBanDenLocalService) {
		_vanBanDenLocalService = vanBanDenLocalService;
	}

	@Override
	public VanBanDenLocalService getWrappedService() {
		return _vanBanDenLocalService;
	}

	@Override
	public void setWrappedService(VanBanDenLocalService vanBanDenLocalService) {
		_vanBanDenLocalService = vanBanDenLocalService;
	}

	private VanBanDenLocalService _vanBanDenLocalService;
}