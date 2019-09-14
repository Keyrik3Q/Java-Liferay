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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ispace.model.SoVanBan;

import ispace.service.SoVanBanLocalServiceUtil;

/**
 * @author hungt
 * @generated
 */
public abstract class SoVanBanActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public SoVanBanActionableDynamicQuery() throws SystemException {
		setBaseLocalService(SoVanBanLocalServiceUtil.getService());
		setClass(SoVanBan.class);

		setClassLoader(ispace.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("Id");
	}
}