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

import thuvien.porlet.model.PhieuMuon;

/**
 * The persistence interface for the phieu muon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HungThai
 * @see PhieuMuonPersistenceImpl
 * @see PhieuMuonUtil
 * @generated
 */
public interface PhieuMuonPersistence extends BasePersistence<PhieuMuon> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhieuMuonUtil} to access the phieu muon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phieu muon in the entity cache if it is enabled.
	*
	* @param phieuMuon the phieu muon
	*/
	public void cacheResult(thuvien.porlet.model.PhieuMuon phieuMuon);

	/**
	* Caches the phieu muons in the entity cache if it is enabled.
	*
	* @param phieuMuons the phieu muons
	*/
	public void cacheResult(
		java.util.List<thuvien.porlet.model.PhieuMuon> phieuMuons);

	/**
	* Creates a new phieu muon with the primary key. Does not add the phieu muon to the database.
	*
	* @param Id the primary key for the new phieu muon
	* @return the new phieu muon
	*/
	public thuvien.porlet.model.PhieuMuon create(long Id);

	/**
	* Removes the phieu muon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon that was removed
	* @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.PhieuMuon remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchPhieuMuonException;

	public thuvien.porlet.model.PhieuMuon updateImpl(
		thuvien.porlet.model.PhieuMuon phieuMuon)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phieu muon with the primary key or throws a {@link thuvien.porlet.NoSuchPhieuMuonException} if it could not be found.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon
	* @throws thuvien.porlet.NoSuchPhieuMuonException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.PhieuMuon findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			thuvien.porlet.NoSuchPhieuMuonException;

	/**
	* Returns the phieu muon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon, or <code>null</code> if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public thuvien.porlet.model.PhieuMuon fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phieu muons.
	*
	* @return the phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<thuvien.porlet.model.PhieuMuon> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<thuvien.porlet.model.PhieuMuon> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<thuvien.porlet.model.PhieuMuon> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phieu muons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phieu muons.
	*
	* @return the number of phieu muons
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}