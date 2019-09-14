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

package ispace.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ispace.model.LoaiVanBan;

import java.util.List;

/**
 * The persistence utility for the loai van ban service. This utility wraps {@link LoaiVanBanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see LoaiVanBanPersistence
 * @see LoaiVanBanPersistenceImpl
 * @generated
 */
public class LoaiVanBanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LoaiVanBan loaiVanBan) {
		getPersistence().clearCache(loaiVanBan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LoaiVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LoaiVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LoaiVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LoaiVanBan update(LoaiVanBan loaiVanBan)
		throws SystemException {
		return getPersistence().update(loaiVanBan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LoaiVanBan update(LoaiVanBan loaiVanBan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(loaiVanBan, serviceContext);
	}

	/**
	* Caches the loai van ban in the entity cache if it is enabled.
	*
	* @param loaiVanBan the loai van ban
	*/
	public static void cacheResult(ispace.model.LoaiVanBan loaiVanBan) {
		getPersistence().cacheResult(loaiVanBan);
	}

	/**
	* Caches the loai van bans in the entity cache if it is enabled.
	*
	* @param loaiVanBans the loai van bans
	*/
	public static void cacheResult(
		java.util.List<ispace.model.LoaiVanBan> loaiVanBans) {
		getPersistence().cacheResult(loaiVanBans);
	}

	/**
	* Creates a new loai van ban with the primary key. Does not add the loai van ban to the database.
	*
	* @param Id the primary key for the new loai van ban
	* @return the new loai van ban
	*/
	public static ispace.model.LoaiVanBan create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the loai van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban that was removed
	* @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.LoaiVanBan remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLoaiVanBanException {
		return getPersistence().remove(Id);
	}

	public static ispace.model.LoaiVanBan updateImpl(
		ispace.model.LoaiVanBan loaiVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaiVanBan);
	}

	/**
	* Returns the loai van ban with the primary key or throws a {@link ispace.NoSuchLoaiVanBanException} if it could not be found.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban
	* @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.LoaiVanBan findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLoaiVanBanException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the loai van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban, or <code>null</code> if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.LoaiVanBan fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the loai van bans.
	*
	* @return the loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.LoaiVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the loai van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LoaiVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai van bans
	* @param end the upper bound of the range of loai van bans (not inclusive)
	* @return the range of loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.LoaiVanBan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loai van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LoaiVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai van bans
	* @param end the upper bound of the range of loai van bans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.LoaiVanBan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loai van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loai van bans.
	*
	* @return the number of loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoaiVanBanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoaiVanBanPersistence)PortletBeanLocatorUtil.locate(ispace.service.ClpSerializer.getServletContextName(),
					LoaiVanBanPersistence.class.getName());

			ReferenceRegistry.registerReference(LoaiVanBanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LoaiVanBanPersistence persistence) {
	}

	private static LoaiVanBanPersistence _persistence;
}