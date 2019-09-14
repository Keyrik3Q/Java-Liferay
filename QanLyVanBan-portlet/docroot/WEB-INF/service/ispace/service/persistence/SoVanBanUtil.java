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

import ispace.model.SoVanBan;

import java.util.List;

/**
 * The persistence utility for the so van ban service. This utility wraps {@link SoVanBanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see SoVanBanPersistence
 * @see SoVanBanPersistenceImpl
 * @generated
 */
public class SoVanBanUtil {
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
	public static void clearCache(SoVanBan soVanBan) {
		getPersistence().clearCache(soVanBan);
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
	public static List<SoVanBan> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SoVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SoVanBan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SoVanBan update(SoVanBan soVanBan) throws SystemException {
		return getPersistence().update(soVanBan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SoVanBan update(SoVanBan soVanBan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(soVanBan, serviceContext);
	}

	/**
	* Caches the so van ban in the entity cache if it is enabled.
	*
	* @param soVanBan the so van ban
	*/
	public static void cacheResult(ispace.model.SoVanBan soVanBan) {
		getPersistence().cacheResult(soVanBan);
	}

	/**
	* Caches the so van bans in the entity cache if it is enabled.
	*
	* @param soVanBans the so van bans
	*/
	public static void cacheResult(
		java.util.List<ispace.model.SoVanBan> soVanBans) {
		getPersistence().cacheResult(soVanBans);
	}

	/**
	* Creates a new so van ban with the primary key. Does not add the so van ban to the database.
	*
	* @param Id the primary key for the new so van ban
	* @return the new so van ban
	*/
	public static ispace.model.SoVanBan create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the so van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban that was removed
	* @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.SoVanBan remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchSoVanBanException {
		return getPersistence().remove(Id);
	}

	public static ispace.model.SoVanBan updateImpl(
		ispace.model.SoVanBan soVanBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(soVanBan);
	}

	/**
	* Returns the so van ban with the primary key or throws a {@link ispace.NoSuchSoVanBanException} if it could not be found.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban
	* @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.SoVanBan findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchSoVanBanException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the so van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban, or <code>null</code> if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.SoVanBan fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the so van bans.
	*
	* @return the so van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.SoVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the so van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.SoVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of so van bans
	* @param end the upper bound of the range of so van bans (not inclusive)
	* @return the range of so van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.SoVanBan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the so van bans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.SoVanBanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of so van bans
	* @param end the upper bound of the range of so van bans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of so van bans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.SoVanBan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the so van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of so van bans.
	*
	* @return the number of so van bans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SoVanBanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SoVanBanPersistence)PortletBeanLocatorUtil.locate(ispace.service.ClpSerializer.getServletContextName(),
					SoVanBanPersistence.class.getName());

			ReferenceRegistry.registerReference(SoVanBanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SoVanBanPersistence persistence) {
	}

	private static SoVanBanPersistence _persistence;
}