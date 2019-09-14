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
import ispace.service.LuanChuyenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hungt
 */
public class LuanChuyenClp extends BaseModelImpl<LuanChuyen>
	implements LuanChuyen {
	public LuanChuyenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LuanChuyen.class;
	}

	@Override
	public String getModelClassName() {
		return LuanChuyen.class.getName();
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
		attributes.put("KieuVanBan", getKieuVanBan());
		attributes.put("IdVanBan", getIdVanBan());
		attributes.put("NgayGui", getNgayGui());
		attributes.put("NgayNhan", getNgayNhan());
		attributes.put("NguoiGui", getNguoiGui());
		attributes.put("NguoiNhan", getNguoiNhan());
		attributes.put("YKien", getYKien());
		attributes.put("HanXuLi", getHanXuLi());
		attributes.put("YKienPhanHoi", getYKienPhanHoi());
		attributes.put("NgayPhanHoi", getNgayPhanHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String KieuVanBan = (String)attributes.get("KieuVanBan");

		if (KieuVanBan != null) {
			setKieuVanBan(KieuVanBan);
		}

		Long IdVanBan = (Long)attributes.get("IdVanBan");

		if (IdVanBan != null) {
			setIdVanBan(IdVanBan);
		}

		Date NgayGui = (Date)attributes.get("NgayGui");

		if (NgayGui != null) {
			setNgayGui(NgayGui);
		}

		Date NgayNhan = (Date)attributes.get("NgayNhan");

		if (NgayNhan != null) {
			setNgayNhan(NgayNhan);
		}

		String NguoiGui = (String)attributes.get("NguoiGui");

		if (NguoiGui != null) {
			setNguoiGui(NguoiGui);
		}

		String NguoiNhan = (String)attributes.get("NguoiNhan");

		if (NguoiNhan != null) {
			setNguoiNhan(NguoiNhan);
		}

		String YKien = (String)attributes.get("YKien");

		if (YKien != null) {
			setYKien(YKien);
		}

		Date HanXuLi = (Date)attributes.get("HanXuLi");

		if (HanXuLi != null) {
			setHanXuLi(HanXuLi);
		}

		String YKienPhanHoi = (String)attributes.get("YKienPhanHoi");

		if (YKienPhanHoi != null) {
			setYKienPhanHoi(YKienPhanHoi);
		}

		Date NgayPhanHoi = (Date)attributes.get("NgayPhanHoi");

		if (NgayPhanHoi != null) {
			setNgayPhanHoi(NgayPhanHoi);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_luanChuyenRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKieuVanBan() {
		return _KieuVanBan;
	}

	@Override
	public void setKieuVanBan(String KieuVanBan) {
		_KieuVanBan = KieuVanBan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setKieuVanBan", String.class);

				method.invoke(_luanChuyenRemoteModel, KieuVanBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdVanBan() {
		return _IdVanBan;
	}

	@Override
	public void setIdVanBan(long IdVanBan) {
		_IdVanBan = IdVanBan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setIdVanBan", long.class);

				method.invoke(_luanChuyenRemoteModel, IdVanBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGui() {
		return _NgayGui;
	}

	@Override
	public void setNgayGui(Date NgayGui) {
		_NgayGui = NgayGui;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGui", Date.class);

				method.invoke(_luanChuyenRemoteModel, NgayGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayNhan() {
		return _NgayNhan;
	}

	@Override
	public void setNgayNhan(Date NgayNhan) {
		_NgayNhan = NgayNhan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayNhan", Date.class);

				method.invoke(_luanChuyenRemoteModel, NgayNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiGui() {
		return _NguoiGui;
	}

	@Override
	public void setNguoiGui(String NguoiGui) {
		_NguoiGui = NguoiGui;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiGui", String.class);

				method.invoke(_luanChuyenRemoteModel, NguoiGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiNhan() {
		return _NguoiNhan;
	}

	@Override
	public void setNguoiNhan(String NguoiNhan) {
		_NguoiNhan = NguoiNhan;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiNhan", String.class);

				method.invoke(_luanChuyenRemoteModel, NguoiNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKien() {
		return _YKien;
	}

	@Override
	public void setYKien(String YKien) {
		_YKien = YKien;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setYKien", String.class);

				method.invoke(_luanChuyenRemoteModel, YKien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getHanXuLi() {
		return _HanXuLi;
	}

	@Override
	public void setHanXuLi(Date HanXuLi) {
		_HanXuLi = HanXuLi;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setHanXuLi", Date.class);

				method.invoke(_luanChuyenRemoteModel, HanXuLi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getYKienPhanHoi() {
		return _YKienPhanHoi;
	}

	@Override
	public void setYKienPhanHoi(String YKienPhanHoi) {
		_YKienPhanHoi = YKienPhanHoi;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setYKienPhanHoi", String.class);

				method.invoke(_luanChuyenRemoteModel, YKienPhanHoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayPhanHoi() {
		return _NgayPhanHoi;
	}

	@Override
	public void setNgayPhanHoi(Date NgayPhanHoi) {
		_NgayPhanHoi = NgayPhanHoi;

		if (_luanChuyenRemoteModel != null) {
			try {
				Class<?> clazz = _luanChuyenRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayPhanHoi", Date.class);

				method.invoke(_luanChuyenRemoteModel, NgayPhanHoi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLuanChuyenRemoteModel() {
		return _luanChuyenRemoteModel;
	}

	public void setLuanChuyenRemoteModel(BaseModel<?> luanChuyenRemoteModel) {
		_luanChuyenRemoteModel = luanChuyenRemoteModel;
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

		Class<?> remoteModelClass = _luanChuyenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_luanChuyenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LuanChuyenLocalServiceUtil.addLuanChuyen(this);
		}
		else {
			LuanChuyenLocalServiceUtil.updateLuanChuyen(this);
		}
	}

	@Override
	public LuanChuyen toEscapedModel() {
		return (LuanChuyen)ProxyUtil.newProxyInstance(LuanChuyen.class.getClassLoader(),
			new Class[] { LuanChuyen.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LuanChuyenClp clone = new LuanChuyenClp();

		clone.setId(getId());
		clone.setKieuVanBan(getKieuVanBan());
		clone.setIdVanBan(getIdVanBan());
		clone.setNgayGui(getNgayGui());
		clone.setNgayNhan(getNgayNhan());
		clone.setNguoiGui(getNguoiGui());
		clone.setNguoiNhan(getNguoiNhan());
		clone.setYKien(getYKien());
		clone.setHanXuLi(getHanXuLi());
		clone.setYKienPhanHoi(getYKienPhanHoi());
		clone.setNgayPhanHoi(getNgayPhanHoi());

		return clone;
	}

	@Override
	public int compareTo(LuanChuyen luanChuyen) {
		long primaryKey = luanChuyen.getPrimaryKey();

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

		if (!(obj instanceof LuanChuyenClp)) {
			return false;
		}

		LuanChuyenClp luanChuyen = (LuanChuyenClp)obj;

		long primaryKey = luanChuyen.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", KieuVanBan=");
		sb.append(getKieuVanBan());
		sb.append(", IdVanBan=");
		sb.append(getIdVanBan());
		sb.append(", NgayGui=");
		sb.append(getNgayGui());
		sb.append(", NgayNhan=");
		sb.append(getNgayNhan());
		sb.append(", NguoiGui=");
		sb.append(getNguoiGui());
		sb.append(", NguoiNhan=");
		sb.append(getNguoiNhan());
		sb.append(", YKien=");
		sb.append(getYKien());
		sb.append(", HanXuLi=");
		sb.append(getHanXuLi());
		sb.append(", YKienPhanHoi=");
		sb.append(getYKienPhanHoi());
		sb.append(", NgayPhanHoi=");
		sb.append(getNgayPhanHoi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("ispace.model.LuanChuyen");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>KieuVanBan</column-name><column-value><![CDATA[");
		sb.append(getKieuVanBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IdVanBan</column-name><column-value><![CDATA[");
		sb.append(getIdVanBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayGui</column-name><column-value><![CDATA[");
		sb.append(getNgayGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiGui</column-name><column-value><![CDATA[");
		sb.append(getNguoiGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiNhan</column-name><column-value><![CDATA[");
		sb.append(getNguoiNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>YKien</column-name><column-value><![CDATA[");
		sb.append(getYKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HanXuLi</column-name><column-value><![CDATA[");
		sb.append(getHanXuLi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>YKienPhanHoi</column-name><column-value><![CDATA[");
		sb.append(getYKienPhanHoi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayPhanHoi</column-name><column-value><![CDATA[");
		sb.append(getNgayPhanHoi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _KieuVanBan;
	private long _IdVanBan;
	private Date _NgayGui;
	private Date _NgayNhan;
	private String _NguoiGui;
	private String _NguoiNhan;
	private String _YKien;
	private Date _HanXuLi;
	private String _YKienPhanHoi;
	private Date _NgayPhanHoi;
	private BaseModel<?> _luanChuyenRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}