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

package ispace.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for NguoiDung. This utility wraps
 * {@link ispace.service.impl.NguoiDungLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author hungt
 * @see NguoiDungLocalService
 * @see ispace.service.base.NguoiDungLocalServiceBaseImpl
 * @see ispace.service.impl.NguoiDungLocalServiceImpl
 * @generated
 */
public class NguoiDungLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ispace.service.impl.NguoiDungLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the nguoi dung to the database. Also notifies the appropriate model listeners.
	*
	* @param nguoiDung the nguoi dung
	* @return the nguoi dung that was added
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung addNguoiDung(
		ispace.model.NguoiDung nguoiDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addNguoiDung(nguoiDung);
	}

	/**
	* Creates a new nguoi dung with the primary key. Does not add the nguoi dung to the database.
	*
	* @param Id the primary key for the new nguoi dung
	* @return the new nguoi dung
	*/
	public static ispace.model.NguoiDung createNguoiDung(long Id) {
		return getService().createNguoiDung(Id);
	}

	/**
	* Deletes the nguoi dung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the nguoi dung
	* @return the nguoi dung that was removed
	* @throws PortalException if a nguoi dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung deleteNguoiDung(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNguoiDung(Id);
	}

	/**
	* Deletes the nguoi dung from the database. Also notifies the appropriate model listeners.
	*
	* @param nguoiDung the nguoi dung
	* @return the nguoi dung that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung deleteNguoiDung(
		ispace.model.NguoiDung nguoiDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNguoiDung(nguoiDung);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ispace.model.NguoiDung fetchNguoiDung(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchNguoiDung(Id);
	}

	/**
	* Returns the nguoi dung with the primary key.
	*
	* @param Id the primary key of the nguoi dung
	* @return the nguoi dung
	* @throws PortalException if a nguoi dung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung getNguoiDung(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getNguoiDung(Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nguoi dungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ispace.model.impl.NguoiDungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoi dungs
	* @param end the upper bound of the range of nguoi dungs (not inclusive)
	* @return the range of nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<ispace.model.NguoiDung> getNguoiDungs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNguoiDungs(start, end);
	}

	/**
	* Returns the number of nguoi dungs.
	*
	* @return the number of nguoi dungs
	* @throws SystemException if a system exception occurred
	*/
	public static int getNguoiDungsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNguoiDungsCount();
	}

	/**
	* Updates the nguoi dung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nguoiDung the nguoi dung
	* @return the nguoi dung that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static ispace.model.NguoiDung updateNguoiDung(
		ispace.model.NguoiDung nguoiDung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateNguoiDung(nguoiDung);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static NguoiDungLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					NguoiDungLocalService.class.getName());

			if (invokableLocalService instanceof NguoiDungLocalService) {
				_service = (NguoiDungLocalService)invokableLocalService;
			}
			else {
				_service = new NguoiDungLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(NguoiDungLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(NguoiDungLocalService service) {
	}

	private static NguoiDungLocalService _service;
}