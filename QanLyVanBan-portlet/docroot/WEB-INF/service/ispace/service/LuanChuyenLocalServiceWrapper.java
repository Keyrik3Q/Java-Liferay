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
 * Provides a wrapper for {@link LuanChuyenLocalService}.
 *
 * @author hungt
 * @see LuanChuyenLocalService
 * @generated
 */
public class LuanChuyenLocalServiceWrapper implements LuanChuyenLocalService,
	ServiceWrapper<LuanChuyenLocalService> {
	public LuanChuyenLocalServiceWrapper(
		LuanChuyenLocalService luanChuyenLocalService) {
		_luanChuyenLocalService = luanChuyenLocalService;
	}

	/**
	* Adds the luan chuyen to the database. Also notifies the appropriate model listeners.
	*
	* @param luanChuyen the luan chuyen
	* @return the luan chuyen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.LuanChuyen addLuanChuyen(
		ispace.model.LuanChuyen luanChuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.addLuanChuyen(luanChuyen);
	}

	/**
	* Creates a new luan chuyen with the primary key. Does not add the luan chuyen to the database.
	*
	* @param Id the primary key for the new luan chuyen
	* @return the new luan chuyen
	*/
	@Override
	public ispace.model.LuanChuyen createLuanChuyen(long Id) {
		return _luanChuyenLocalService.createLuanChuyen(Id);
	}

	/**
	* Deletes the luan chuyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the luan chuyen
	* @return the luan chuyen that was removed
	* @throws PortalException if a luan chuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.LuanChuyen deleteLuanChuyen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.deleteLuanChuyen(Id);
	}

	/**
	* Deletes the luan chuyen from the database. Also notifies the appropriate model listeners.
	*
	* @param luanChuyen the luan chuyen
	* @return the luan chuyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.LuanChuyen deleteLuanChuyen(
		ispace.model.LuanChuyen luanChuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.deleteLuanChuyen(luanChuyen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _luanChuyenLocalService.dynamicQuery();
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
		return _luanChuyenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _luanChuyenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _luanChuyenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _luanChuyenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _luanChuyenLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ispace.model.LuanChuyen fetchLuanChuyen(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.fetchLuanChuyen(Id);
	}

	/**
	* Returns the luan chuyen with the primary key.
	*
	* @param Id the primary key of the luan chuyen
	* @return the luan chuyen
	* @throws PortalException if a luan chuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.LuanChuyen getLuanChuyen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.getLuanChuyen(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the luan chuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of luan chuyens
	* @param end the upper bound of the range of luan chuyens (not inclusive)
	* @return the range of luan chuyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<ispace.model.LuanChuyen> getLuanChuyens(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.getLuanChuyens(start, end);
	}

	/**
	* Returns the number of luan chuyens.
	*
	* @return the number of luan chuyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLuanChuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.getLuanChuyensCount();
	}

	/**
	* Updates the luan chuyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param luanChuyen the luan chuyen
	* @return the luan chuyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public ispace.model.LuanChuyen updateLuanChuyen(
		ispace.model.LuanChuyen luanChuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _luanChuyenLocalService.updateLuanChuyen(luanChuyen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _luanChuyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_luanChuyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _luanChuyenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LuanChuyenLocalService getWrappedLuanChuyenLocalService() {
		return _luanChuyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLuanChuyenLocalService(
		LuanChuyenLocalService luanChuyenLocalService) {
		_luanChuyenLocalService = luanChuyenLocalService;
	}

	@Override
	public LuanChuyenLocalService getWrappedService() {
		return _luanChuyenLocalService;
	}

	@Override
	public void setWrappedService(LuanChuyenLocalService luanChuyenLocalService) {
		_luanChuyenLocalService = luanChuyenLocalService;
	}

	private LuanChuyenLocalService _luanChuyenLocalService;
}