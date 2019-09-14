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

package thuvien.porlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SachLocalService}.
 *
 * @author HungThai
 * @see SachLocalService
 * @generated
 */
public class SachLocalServiceWrapper implements SachLocalService,
	ServiceWrapper<SachLocalService> {
	public SachLocalServiceWrapper(SachLocalService sachLocalService) {
		_sachLocalService = sachLocalService;
	}

	/**
	* Adds the sach to the database. Also notifies the appropriate model listeners.
	*
	* @param sach the sach
	* @return the sach that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.Sach addSach(thuvien.porlet.model.Sach sach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.addSach(sach);
	}

	/**
	* Creates a new sach with the primary key. Does not add the sach to the database.
	*
	* @param Id the primary key for the new sach
	* @return the new sach
	*/
	@Override
	public thuvien.porlet.model.Sach createSach(long Id) {
		return _sachLocalService.createSach(Id);
	}

	/**
	* Deletes the sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the sach
	* @return the sach that was removed
	* @throws PortalException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.Sach deleteSach(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.deleteSach(Id);
	}

	/**
	* Deletes the sach from the database. Also notifies the appropriate model listeners.
	*
	* @param sach the sach
	* @return the sach that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.Sach deleteSach(thuvien.porlet.model.Sach sach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.deleteSach(sach);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sachLocalService.dynamicQuery();
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
		return _sachLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sachLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sachLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sachLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sachLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public thuvien.porlet.model.Sach fetchSach(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.fetchSach(Id);
	}

	/**
	* Returns the sach with the primary key.
	*
	* @param Id the primary key of the sach
	* @return the sach
	* @throws PortalException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.Sach getSach(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.getSach(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sachs
	* @param end the upper bound of the range of sachs (not inclusive)
	* @return the range of sachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<thuvien.porlet.model.Sach> getSachs(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.getSachs(start, end);
	}

	/**
	* Returns the number of sachs.
	*
	* @return the number of sachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSachsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.getSachsCount();
	}

	/**
	* Updates the sach in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sach the sach
	* @return the sach that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.Sach updateSach(thuvien.porlet.model.Sach sach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sachLocalService.updateSach(sach);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sachLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sachLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sachLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SachLocalService getWrappedSachLocalService() {
		return _sachLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSachLocalService(SachLocalService sachLocalService) {
		_sachLocalService = sachLocalService;
	}

	@Override
	public SachLocalService getWrappedService() {
		return _sachLocalService;
	}

	@Override
	public void setWrappedService(SachLocalService sachLocalService) {
		_sachLocalService = sachLocalService;
	}

	private SachLocalService _sachLocalService;
}