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

package thuvien.porlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhieuMuonLocalService}.
 *
 * @author HungThai
 * @see PhieuMuonLocalService
 * @generated
 */
public class PhieuMuonLocalServiceWrapper implements PhieuMuonLocalService,
	ServiceWrapper<PhieuMuonLocalService> {
	public PhieuMuonLocalServiceWrapper(
		PhieuMuonLocalService phieuMuonLocalService) {
		_phieuMuonLocalService = phieuMuonLocalService;
	}

	/**
	* Adds the phieu muon to the database. Also notifies the appropriate model listeners.
	*
	* @param phieuMuon the phieu muon
	* @return the phieu muon that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon addPhieuMuon(
		thuvien.porlet.model.PhieuMuon phieuMuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.addPhieuMuon(phieuMuon);
	}

	/**
	* Creates a new phieu muon with the primary key. Does not add the phieu muon to the database.
	*
	* @param Id the primary key for the new phieu muon
	* @return the new phieu muon
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon createPhieuMuon(long Id) {
		return _phieuMuonLocalService.createPhieuMuon(Id);
	}

	/**
	* Deletes the phieu muon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon that was removed
	* @throws PortalException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon deletePhieuMuon(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.deletePhieuMuon(Id);
	}

	/**
	* Deletes the phieu muon from the database. Also notifies the appropriate model listeners.
	*
	* @param phieuMuon the phieu muon
	* @return the phieu muon that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon deletePhieuMuon(
		thuvien.porlet.model.PhieuMuon phieuMuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.deletePhieuMuon(phieuMuon);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phieuMuonLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link thuvien.porlet.model.impl.PhieuMuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public thuvien.porlet.model.PhieuMuon fetchPhieuMuon(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.fetchPhieuMuon(Id);
	}

	/**
	* Returns the phieu muon with the primary key.
	*
	* @param Id the primary key of the phieu muon
	* @return the phieu muon
	* @throws PortalException if a phieu muon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon getPhieuMuon(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.getPhieuMuon(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<thuvien.porlet.model.PhieuMuon> getPhieuMuons(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.getPhieuMuons(start, end);
	}

	/**
	* Returns the number of phieu muons.
	*
	* @return the number of phieu muons
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhieuMuonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.getPhieuMuonsCount();
	}

	/**
	* Updates the phieu muon in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phieuMuon the phieu muon
	* @return the phieu muon that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public thuvien.porlet.model.PhieuMuon updatePhieuMuon(
		thuvien.porlet.model.PhieuMuon phieuMuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuMuonLocalService.updatePhieuMuon(phieuMuon);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phieuMuonLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phieuMuonLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phieuMuonLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhieuMuonLocalService getWrappedPhieuMuonLocalService() {
		return _phieuMuonLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhieuMuonLocalService(
		PhieuMuonLocalService phieuMuonLocalService) {
		_phieuMuonLocalService = phieuMuonLocalService;
	}

	@Override
	public PhieuMuonLocalService getWrappedService() {
		return _phieuMuonLocalService;
	}

	@Override
	public void setWrappedService(PhieuMuonLocalService phieuMuonLocalService) {
		_phieuMuonLocalService = phieuMuonLocalService;
	}

	private PhieuMuonLocalService _phieuMuonLocalService;
}