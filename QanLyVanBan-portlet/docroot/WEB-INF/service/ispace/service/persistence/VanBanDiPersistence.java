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

import ispace.model.VanBanDi;

/**
 * The persistence interface for the van ban di service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hungt
 * @see VanBanDiPersistenceImpl
 * @see VanBanDiUtil
 * @generated
 */
public interface VanBanDiPersistence extends BasePersistence<VanBanDi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VanBanDiUtil} to access the van ban di persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the van ban di in the entity cache if it is enabled.
	*
	* @param vanBanDi the van ban di
	*/
	public void cacheResult(ispace.model.VanBanDi vanBanDi);

	/**
	* Caches the van ban dis in the entity cache if it is enabled.
	*
	* @param vanBanDis the van ban dis
	*/
	public void cacheResult(java.util.List<ispace.model.VanBanDi> vanBanDis);

	/**
	* Creates a new van ban di with the primary key. Does not add the van ban di to the database.
	*
	* @param Id the primary key for the new van ban di
	* @return the new van ban di
	*/
	public ispace.model.VanBanDi create(long Id);

	/**
	* Removes the van ban di with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di that was removed
	* @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDi remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDiException;

	public ispace.model.VanBanDi updateImpl(ispace.model.VanBanDi vanBanDi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the van ban di with the primary key or throws a {@link ispace.NoSuchVanBanDiException} if it could not be found.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di
	* @throws ispace.NoSuchVanBanDiException if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDi findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			ispace.NoSuchVanBanDiException;

	/**
	* Returns the van ban di with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the van ban di
	* @return the van ban di, or <code>null</code> if a van ban di with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public ispace.model.VanBanDi fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the van ban dis.
	*
	* @return the van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<ispace.model.VanBanDi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.VanBanDi> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<ispace.model.VanBanDi> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the van ban dis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of van ban dis.
	*
	* @return the number of van ban dis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}