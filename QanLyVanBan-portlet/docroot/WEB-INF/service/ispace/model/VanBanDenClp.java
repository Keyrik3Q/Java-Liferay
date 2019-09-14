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

package ispace.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ispace.service.ClpSerializer;
import ispace.service.VanBanDenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hungt
 */
public class VanBanDenClp extends BaseModelImpl<VanBanDen> implements VanBanDen {
	public VanBanDenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDen.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDen.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("SoKiHieu", getSoKiHieu());
		attributes.put("LoaiVanBan", getLoaiVanBan());
		attributes.put("SoVanBan", getSoVanBan());
		attributes.put("NguoiKy", getNguoiKy());
		attributes.put("NgayKy", getNgayKy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String SoKiHieu = (String)attributes.get("SoKiHieu");

		if (SoKiHieu != null) {
			setSoKiHieu(SoKiHieu);
		}

		String LoaiVanBan = (String)attributes.get("LoaiVanBan");

		if (LoaiVanBan != null) {
			setLoaiVanBan(LoaiVanBan);
		}

		String SoVanBan = (String)attributes.get("SoVanBan");

		if (SoVanBan != null) {
			setSoVanBan(SoVanBan);
		}

		String NguoiKy = (String)attributes.get("NguoiKy");

		if (NguoiKy != null) {
			setNguoiKy(NguoiKy);
		}

		Date NgayKy = (Date)attributes.get("NgayKy");

		if (NgayKy != null) {
			setNgayKy(NgayKy);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vanBanDenRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKiHieu() {
		return _SoKiHieu;
	}

	@Override
	public void setSoKiHieu(String SoKiHieu) {
		_SoKiHieu = SoKiHieu;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKiHieu", String.class);

				method.invoke(_vanBanDenRemoteModel, SoKiHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoaiVanBan() {
		return _LoaiVanBan;
	}

	@Override
	public void setLoaiVanBan(String LoaiVanBan) {
		_LoaiVanBan = LoaiVanBan;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiVanBan", String.class);

				method.invoke(_vanBanDenRemoteModel, LoaiVanBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoVanBan() {
		return _SoVanBan;
	}

	@Override
	public void setSoVanBan(String SoVanBan) {
		_SoVanBan = SoVanBan;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setSoVanBan", String.class);

				method.invoke(_vanBanDenRemoteModel, SoVanBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiKy() {
		return _NguoiKy;
	}

	@Override
	public void setNguoiKy(String NguoiKy) {
		_NguoiKy = NguoiKy;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiKy", String.class);

				method.invoke(_vanBanDenRemoteModel, NguoiKy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayKy() {
		return _NgayKy;
	}

	@Override
	public void setNgayKy(Date NgayKy) {
		_NgayKy = NgayKy;

		if (_vanBanDenRemoteModel != null) {
			try {
				Class<?> clazz = _vanBanDenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKy", Date.class);

				method.invoke(_vanBanDenRemoteModel, NgayKy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVanBanDenRemoteModel() {
		return _vanBanDenRemoteModel;
	}

	public void setVanBanDenRemoteModel(BaseModel<?> vanBanDenRemoteModel) {
		_vanBanDenRemoteModel = vanBanDenRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _vanBanDenRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_vanBanDenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VanBanDenLocalServiceUtil.addVanBanDen(this);
		}
		else {
			VanBanDenLocalServiceUtil.updateVanBanDen(this);
		}
	}

	@Override
	public VanBanDen toEscapedModel() {
		return (VanBanDen)ProxyUtil.newProxyInstance(VanBanDen.class.getClassLoader(),
			new Class[] { VanBanDen.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VanBanDenClp clone = new VanBanDenClp();

		clone.setId(getId());
		clone.setSoKiHieu(getSoKiHieu());
		clone.setLoaiVanBan(getLoaiVanBan());
		clone.setSoVanBan(getSoVanBan());
		clone.setNguoiKy(getNguoiKy());
		clone.setNgayKy(getNgayKy());

		return clone;
	}

	@Override
	public int compareTo(VanBanDen vanBanDen) {
		long primaryKey = vanBanDen.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDenClp)) {
			return false;
		}

		VanBanDenClp vanBanDen = (VanBanDenClp)obj;

		long primaryKey = vanBanDen.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", SoKiHieu=");
		sb.append(getSoKiHieu());
		sb.append(", LoaiVanBan=");
		sb.append(getLoaiVanBan());
		sb.append(", SoVanBan=");
		sb.append(getSoVanBan());
		sb.append(", NguoiKy=");
		sb.append(getNguoiKy());
		sb.append(", NgayKy=");
		sb.append(getNgayKy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("ispace.model.VanBanDen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoKiHieu</column-name><column-value><![CDATA[");
		sb.append(getSoKiHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiVanBan</column-name><column-value><![CDATA[");
		sb.append(getLoaiVanBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoVanBan</column-name><column-value><![CDATA[");
		sb.append(getSoVanBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiKy</column-name><column-value><![CDATA[");
		sb.append(getNguoiKy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayKy</column-name><column-value><![CDATA[");
		sb.append(getNgayKy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _SoKiHieu;
	private String _LoaiVanBan;
	private String _SoVanBan;
	private String _NguoiKy;
	private Date _NgayKy;
	private BaseModel<?> _vanBanDenRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}