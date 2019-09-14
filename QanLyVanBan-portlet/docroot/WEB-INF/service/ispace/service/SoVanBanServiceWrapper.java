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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SoVanBanService}.
 *
 * @author hungt
 * @see SoVanBanService
 * @generated
 */
public class SoVanBanServiceWrapper implements SoVanBanService,
	ServiceWrapper<SoVanBanService> {
	public SoVanBanServiceWrapper(SoVanBanService soVanBanService) {
		_soVanBanService = soVanBanService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _soVanBanService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_soVanBanService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _soVanBanService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SoVanBanService getWrappedSoVanBanService() {
		return _soVanBanService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSoVanBanService(SoVanBanService soVanBanService) {
		_soVanBanService = soVanBanService;
	}

	@Override
	public SoVanBanService getWrappedService() {
		return _soVanBanService;
	}

	@Override
	public void setWrappedService(SoVanBanService soVanBanService) {
		_soVanBanService = soVanBanService;
	}

	private SoVanBanService _soVanBanService;
}