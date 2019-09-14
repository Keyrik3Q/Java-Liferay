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

import ispace.model.VanBanDi;

import java.util.List;

/**
 * The persistence utility for the van ban di service. This utility wraps {@link VanBanDiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see VanBanDiPersistence
 * @see VanBanDiPersistenceImpl
 * @generated
 */
public class VanBanDiUtil {
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
	public static void clearCache(VanBanDi vanBanDi) {
		getPersistence().clearCache(vanBanDi);
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
	public static List<VanBanDi> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VanBanDi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VanBanDi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VanBanDi update(VanBanDi vanBanDi) throws SystemException {
		return getPersistence().update(vanBanDi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VanBanDi update(VanBanDi vanBanDi,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vanBanDi, serviceContext);
	}

	/**
	* Caches the van ban di in the entity cache if it is enabled.
	*
	* @param vanBanDi the van ban di
	*/
	public static void cacheResult(ispace.model.VanBanDi vanBanDi) {
		getPersistence().cacheResult(vanBanDi);
	}

	/**
	* Caches the van ban dis in the entity cache if it is enabled.
	*
	* @param vanBanDis the van ban dis
	*/
	public static void cacheResult(
		java.util.List<ispace.model.VanBanDi> vanBanDis) {
		getPersistence().cacheResult(vanBanDis);
	}

	/**
	* Creates a new van ban di with the primary key. Does not add the van ban di to the database.
	*
	* @param Id the primary key for the new van ban di
	* @return the new van ban di
	*/
	public static ispace.model.VanBanDi create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the van ban di with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di that was removed
	* @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDi remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDiException {
		return getPersistence().remove(Id);
	}

	public static ispace.model.VanBanDi updateImpl(
		ispace.model.VanBanDi vanBanDi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vanBanDi);
	}

	/**
	* Returns the van ban di with the primary key or throws a {@link ispace.NoSuchVanBanDiException} if it could not be found.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di
	* @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDi findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDiException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the van ban di with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di, or <code>null</code> if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.VanBanDi fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the van ban dis.
	*
	* @return the van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.VanBanDi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the van ban dis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of van ban dis
	* @param end the upper bound of the range of van ban dis (not inclusive)
	* @return the range of van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.VanBanDi> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the van ban dis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.VanBanDiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of van ban dis
	* @param end the upper bound of the range of van ban dis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.VanBanDi> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the van ban dis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of van ban dis.
	*
	* @return the number of van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VanBanDiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VanBanDiPersistence)PortletBeanLocatorUtil.locate(ispace.service.ClpSerializer.getServletContextName(),
					VanBanDiPersistence.class.getName());

			ReferenceRegistry.registerReference(VanBanDiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VanBanDiPersistence persistence) {
	}

	private static VanBanDiPersistence _persistence;
}