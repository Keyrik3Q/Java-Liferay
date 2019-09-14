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

import com.liferay.portal.service.persistence.BasePersistence;

import thuvien.porlet.model.Sach;

/**
 * The persistence interface for the sach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see SachPersistenceImpl
 * @see SachUtil
 * @generated
 */
public interface SachPersistence extends BasePersistence<Sach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SachUtil} to access the sach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sach in the entity cache if it is enabled.
	*
	* @param sach the sach
	*/
	public void cacheResult(thuvien.porlet.model.Sach sach);

	/**
	* Caches the sachs in the entity cache if it is enabled.
	*
	* @param sachs the sachs
	*/
	public void cacheResult(java.util.List<thuvien.porlet.model.Sach> sachs);

	/**
	* Creates a new sach with the primary key. Does not add the sach to the database.
	*
	* @param Id the primary key for the new sach
	* @return the new sach
	*/
	public thuvien.porlet.model.Sach create(long Id);

	/**
	* Removes the sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the sach
	* @return the sach that was removed
	* @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.Sach remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchSachException;

	public thuvien.porlet.model.Sach updateImpl(thuvien.porlet.model.Sach sach)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sach with the primary key or throws a {@link thuvien.porlet.NoSuchSachException} if it could not be found.
	*
	* @param Id the primary key of the sach
	* @return the sach
	* @throws thuvien.porlet.NoSuchSachException if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.Sach findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchSachException;

	/**
	* Returns the sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the sach
	* @return the sach, or <code>null</code> if a sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.Sach fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sachs.
	*
	* @return the sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<thuvien.porlet.model.Sach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<thuvien.porlet.model.Sach> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<thuvien.porlet.model.Sach> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sachs.
	*
	* @return the number of sachs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}