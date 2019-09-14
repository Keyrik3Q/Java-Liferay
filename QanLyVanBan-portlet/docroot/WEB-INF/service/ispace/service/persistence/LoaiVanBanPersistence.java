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

import ispace.model.LoaiVanBan;

/**
 * The persistence interface for the loai van ban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see LoaiVanBanPersistenceImpl
 * @see LoaiVanBanUtil
 * @generated
 */
public interface LoaiVanBanPersistence extends BasePersistence<LoaiVanBan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoaiVanBanUtil} to access the loai van ban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the loai van ban in the entity cache if it is enabled.
	*
	* @param loaiVanBan the loai van ban
	*/
	public void cacheResult(ispace.model.LoaiVanBan loaiVanBan);

	/**
	* Caches the loai van bans in the entity cache if it is enabled.
	*
	* @param loaiVanBans the loai van bans
	*/
	public void cacheResult(java.util.List<ispace.model.LoaiVanBan> loaiVanBans);

	/**
	* Creates a new loai van ban with the primary key. Does not add the loai van ban to the database.
	*
	* @param Id the primary key for the new loai van ban
	* @return the new loai van ban
	*/
	public ispace.model.LoaiVanBan create(long Id);

	/**
	* Removes the loai van ban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban that was removed
	* @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LoaiVanBan remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLoaiVanBanException;

	public ispace.model.LoaiVanBan updateImpl(
		ispace.model.LoaiVanBan loaiVanBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai van ban with the primary key or throws a {@link ispace.NoSuchLoaiVanBanException} if it could not be found.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban
	* @throws ispace.NoSuchLoaiVanBanException if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LoaiVanBan findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLoaiVanBanException;

	/**
	* Returns the loai van ban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the loai van ban
	* @return the loai van ban, or <code>null</code> if a loai van ban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LoaiVanBan fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai van bans.
	*
	* @return the loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.LoaiVanBan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.LoaiVanBan> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.LoaiVanBan> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai van bans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai van bans.
	*
	* @return the number of loai van bans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}