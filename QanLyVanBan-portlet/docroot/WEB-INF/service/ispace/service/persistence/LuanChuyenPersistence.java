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

import ispace.model.LuanChuyen;

/**
 * The persistence interface for the luan chuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see LuanChuyenPersistenceImpl
 * @see LuanChuyenUtil
 * @generated
 */
public interface LuanChuyenPersistence extends BasePersistence<LuanChuyen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LuanChuyenUtil} to access the luan chuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the luan chuyen in the entity cache if it is enabled.
	*
	* @param luanChuyen the luan chuyen
	*/
	public void cacheResult(ispace.model.LuanChuyen luanChuyen);

	/**
	* Caches the luan chuyens in the entity cache if it is enabled.
	*
	* @param luanChuyens the luan chuyens
	*/
	public void cacheResult(java.util.List<ispace.model.LuanChuyen> luanChuyens);

	/**
	* Creates a new luan chuyen with the primary key. Does not add the luan chuyen to the database.
	*
	* @param Id the primary key for the new luan chuyen
	* @return the new luan chuyen
	*/
	public ispace.model.LuanChuyen create(long Id);

	/**
	* Removes the luan chuyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the luan chuyen
	* @return the luan chuyen that was removed
	* @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LuanChuyen remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLuanChuyenException;

	public ispace.model.LuanChuyen updateImpl(
		ispace.model.LuanChuyen luanChuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the luan chuyen with the primary key or throws a {@link ispace.NoSuchLuanChuyenException} if it could not be found.
	*
	* @param Id the primary key of the luan chuyen
	* @return the luan chuyen
	* @throws ispace.NoSuchLuanChuyenException if a luan chuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LuanChuyen findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchLuanChuyenException;

	/**
	* Returns the luan chuyen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the luan chuyen
	* @return the luan chuyen, or <code>null</code> if a luan chuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.LuanChuyen fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the luan chuyens.
	*
	* @return the luan chuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.LuanChuyen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.LuanChuyen> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the luan chuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.LuanChuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of luan chuyens
	* @param end the upper bound of the range of luan chuyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of luan chuyens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.LuanChuyen> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the luan chuyens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of luan chuyens.
	*
	* @return the number of luan chuyens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}