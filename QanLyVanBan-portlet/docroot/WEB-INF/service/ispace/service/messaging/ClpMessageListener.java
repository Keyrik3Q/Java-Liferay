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

package ispace.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ispace.service.ClpSerializer;
import ispace.service.LoaiVanBanLocalServiceUtil;
import ispace.service.LoaiVanBanServiceUtil;
import ispace.service.LuanChuyenLocalServiceUtil;
import ispace.service.LuanChuyenServiceUtil;
import ispace.service.NguoiDungLocalServiceUtil;
import ispace.service.NguoiDungServiceUtil;
import ispace.service.SoVanBanLocalServiceUtil;
import ispace.service.SoVanBanServiceUtil;
import ispace.service.VanBanDenLocalServiceUtil;
import ispace.service.VanBanDenServiceUtil;
import ispace.service.VanBanDiLocalServiceUtil;
import ispace.service.VanBanDiServiceUtil;

/**
 * @author hungt
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			LoaiVanBanLocalServiceUtil.clearService();

			LoaiVanBanServiceUtil.clearService();
			LuanChuyenLocalServiceUtil.clearService();

			LuanChuyenServiceUtil.clearService();
			NguoiDungLocalServiceUtil.clearService();

			NguoiDungServiceUtil.clearService();
			SoVanBanLocalServiceUtil.clearService();

			SoVanBanServiceUtil.clearService();
			VanBanDenLocalServiceUtil.clearService();

			VanBanDenServiceUtil.clearService();
			VanBanDiLocalServiceUtil.clearService();

			VanBanDiServiceUtil.clearService();
		}
	}
}