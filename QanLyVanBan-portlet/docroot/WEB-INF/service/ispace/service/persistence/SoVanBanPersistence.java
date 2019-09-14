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

import com.liferay.portal.service.persistence.BasePersistence;

import ispace.model.SoVanBan;

/**
 * The persistence interface for the so van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see SoVanBanPersistenceImpl
 * @see SoVanBanUtil
 * @generated
 */
public interface SoVanBanPersistence extends BasePersistence<SoVanBan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SoVanBanUtil} to access the so van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the so van ban in the entity cache if it is enabled.
	*
	* @param soVanBan the so van ban
	*/
	public void cacheResult(ispace.model.SoVanBan soVanBan);

	/**
	* Caches the so van bans in the entity cache if it is enabled.
	*
	* @param soVanBans the so van bans
	*/
	public void cacheResult(java.util.List<ispace.model.SoVanBan> soVanBans);

	/**
	* Creates a new so van ban with the primary key. Does not add the so van ban to the database.
	*
	* @param Id the primary key for the new so van ban
	* @return the new so van ban
	*/
	public ispace.model.SoVanBan create(long Id);

	/**
	* Removes the so van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban that was removed
	* @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.SoVanBan remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchSoVanBanException;

	public ispace.model.SoVanBan updateImpl(ispace.model.SoVanBan soVanBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the so van ban with the primary key or throws a {@link ispace.NoSuchSoVanBanException} if it could not be found.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban
	* @throws ispace.NoSuchSoVanBanException if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.SoVanBan findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchSoVanBanException;

	/**
	* Returns the so van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the so van ban
	* @return the so van ban, or <code>null</code> if a so van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.SoVanBan fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the so van bans.
	*
	* @return the so van bans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.SoVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.SoVanBan> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.SoVanBan> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the so van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of so van bans.
	*
	* @return the number of so van bans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}