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

package thuvien.porlet.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import thuvien.porlet.model.Sach;

import java.util.List;

/**
 * The persistence utility for the sach service. This utility wraps {@link SachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see SachPersistence
 * @see SachPersistenceImpl
 * @generated
 */
public class SachUtil {
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
	public static void clearCache(Sach sach) {
		getPersistence().clearCache(sach);
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
	public static List<Sach> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sach> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sach> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Sach update(Sach sach) throws SystemException {
		return getPersistence().update(sach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Sach update(Sach sach, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(sach, serviceContext);
	}

	/**
	* Caches the sach in the entity cache if it is enabled.
	*
	* @param sach the sach
	*/
	public static void cacheResult(thuvien.porlet.model.Sach sach) {
		getPersistence().cacheResult(sach);
	}

	/**
	* Caches the sachs in the entity cache if it is enabled.
	*
	* @param sachs the sachs
	*/
	public static void cacheResult(
		java.util.List<thuvien.porlet.model.Sach> sachs) {
		getPersistence().cacheResult(sachs);
	}

	/**
	* Creates a new sach with the primary key. Does not add the sach to the database.
	*
	* @param Id the primary key for the new sach
	* @return the new sach
	*/
	public static thuvien.porlet.model.Sach create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the sach
	* @return the sach that was removed
	* @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.Sach remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchSachException {
		return getPersistence().remove(Id);
	}

	public static thuvien.porlet.model.Sach updateImpl(
		thuvien.porlet.model.Sach sach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sach);
	}

	/**
	* Returns the sach with the primary key or throws a {@link thuvien.porlet.NoSuchSachException} if it could not be found.
	*
	* @param Id the primary key of the sach
	* @return the sach
	* @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.Sach findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchSachException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the sach
	* @return the sach, or <code>null</code> if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.Sach fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the sachs.
	*
	* @return the sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<thuvien.porlet.model.Sach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<thuvien.porlet.model.Sach> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.SachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sachs
	* @param end the upper bound of the range of sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<thuvien.porlet.model.Sach> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sachs.
	*
	* @return the number of sachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SachPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SachPersistence)PortletBeanLocatorUtil.locate(thuvien.porlet.service.ClpSerializer.getServletContextName(),
					SachPersistence.class.getName());

			ReferenceRegistry.registerReference(SachUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SachPersistence persistence) {
	}

	private static SachPersistence _persistence;
}