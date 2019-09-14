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

import thuvien.porlet.model.PhieuMuon;

import java.util.List;

/**
 * The persistence utility for the phieu muon service. This utility wraps {@link PhieuMuonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see PhieuMuonPersistence
 * @see PhieuMuonPersistenceImpl
 * @generated
 */
public class PhieuMuonUtil {
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
	public static void clearCache(PhieuMuon phieuMuon) {
		getPersistence().clearCache(phieuMuon);
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
	public static List<PhieuMuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PhieuMuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PhieuMuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PhieuMuon update(PhieuMuon phieuMuon)
		throws SystemException {
		return getPersistence().update(phieuMuon);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PhieuMuon update(PhieuMuon phieuMuon,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(phieuMuon, serviceContext);
	}

	/**
	* Caches the phieu muon in the entity cache if it is enabled.
	*
	* @param phieuMuon the phieu muon
	*/
	public static void cacheResult(thuvien.porlet.model.PhieuMuon phieuMuon) {
		getPersistence().cacheResult(phieuMuon);
	}

	/**
	* Caches the phieu muons in the entity cache if it is enabled.
	*
	* @param phieuMuons the phieu muons
	*/
	public static void cacheResult(
		java.util.List<thuvien.porlet.model.PhieuMuon> phieuMuons) {
		getPersistence().cacheResult(phieuMuons);
	}

	/**
	* Creates a new phieu muon with the primary key. Does not add the phieu muon to the database.
	*
	* @param Id the primary key for the new phieu muon
	* @return the new phieu muon
	*/
	public static thuvien.porlet.model.PhieuMuon create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the phieu muon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon that was removed
	* @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.PhieuMuon remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchPhieuMuonException {
		return getPersistence().remove(Id);
	}

	public static thuvien.porlet.model.PhieuMuon updateImpl(
		thuvien.porlet.model.PhieuMuon phieuMuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(phieuMuon);
	}

	/**
	* Returns the phieu muon with the primary key or throws a {@link thuvien.porlet.NoSuchPhieuMuonException} if it could not be found.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon
	* @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.PhieuMuon findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchPhieuMuonException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the phieu muon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon, or <code>null</code> if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static thuvien.porlet.model.PhieuMuon fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the phieu muons.
	*
	* @return the phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<thuvien.porlet.model.PhieuMuon> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the phieu muons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieu muons
	* @param end the upper bound of the range of phieu muons (not inclusive)
	* @return the range of phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<thuvien.porlet.model.PhieuMuon> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the phieu muons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieu muons
	* @param end the upper bound of the range of phieu muons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<thuvien.porlet.model.PhieuMuon> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the phieu muons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of phieu muons.
	*
	* @return the number of phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PhieuMuonPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PhieuMuonPersistence)PortletBeanLocatorUtil.locate(thuvien.porlet.service.ClpSerializer.getServletContextName(),
					PhieuMuonPersistence.class.getName());

			ReferenceRegistry.registerReference(PhieuMuonUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PhieuMuonPersistence persistence) {
	}

	private static PhieuMuonPersistence _persistence;
}