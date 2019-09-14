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

package thuvien.porlet.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import thuvien.porlet.service.ClpSerializer;
import thuvien.porlet.service.SachLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HungThai
 */
public class SachClp extends BaseModelImpl<Sach> implements Sach {
	public SachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
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
		attributes.put("TenSach", getTenSach());
		attributes.put("TheLoaiId", getTheLoaiId());
		attributes.put("SoLuong", getSoLuong());
		attributes.put("TrangThai", getTrangThai());
		attributes.put("NhaXB", getNhaXB());
		attributes.put("MaSach", getMaSach());
		attributes.put("Ke", getKe());
		attributes.put("Tang", getTang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenSach = (String)attributes.get("TenSach");

		if (TenSach != null) {
			setTenSach(TenSach);
		}

		Long TheLoaiId = (Long)attributes.get("TheLoaiId");

		if (TheLoaiId != null) {
			setTheLoaiId(TheLoaiId);
		}

		Long SoLuong = (Long)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}

		String TrangThai = (String)attributes.get("TrangThai");

		if (TrangThai != null) {
			setTrangThai(TrangThai);
		}

		String NhaXB = (String)attributes.get("NhaXB");

		if (NhaXB != null) {
			setNhaXB(NhaXB);
		}

		String MaSach = (String)attributes.get("MaSach");

		if (MaSach != null) {
			setMaSach(MaSach);
		}

		String Ke = (String)attributes.get("Ke");

		if (Ke != null) {
			setKe(Ke);
		}

		String Tang = (String)attributes.get("Tang");

		if (Tang != null) {
			setTang(Tang);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_sachRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenSach() {
		return _TenSach;
	}

	@Override
	public void setTenSach(String TenSach) {
		_TenSach = TenSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTenSach", String.class);

				method.invoke(_sachRemoteModel, TenSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTheLoaiId() {
		return _TheLoaiId;
	}

	@Override
	public void setTheLoaiId(long TheLoaiId) {
		_TheLoaiId = TheLoaiId;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTheLoaiId", long.class);

				method.invoke(_sachRemoteModel, TheLoaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoLuong() {
		return _SoLuong;
	}

	@Override
	public void setSoLuong(long SoLuong) {
		_SoLuong = SoLuong;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", long.class);

				method.invoke(_sachRemoteModel, SoLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _TrangThai;
	}

	@Override
	public void setTrangThai(String TrangThai) {
		_TrangThai = TrangThai;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_sachRemoteModel, TrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhaXB() {
		return _NhaXB;
	}

	@Override
	public void setNhaXB(String NhaXB) {
		_NhaXB = NhaXB;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaXB", String.class);

				method.invoke(_sachRemoteModel, NhaXB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSach() {
		return _MaSach;
	}

	@Override
	public void setMaSach(String MaSach) {
		_MaSach = MaSach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSach", String.class);

				method.invoke(_sachRemoteModel, MaSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKe() {
		return _Ke;
	}

	@Override
	public void setKe(String Ke) {
		_Ke = Ke;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setKe", String.class);

				method.invoke(_sachRemoteModel, Ke);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTang() {
		return _Tang;
	}

	@Override
	public void setTang(String Tang) {
		_Tang = Tang;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTang", String.class);

				method.invoke(_sachRemoteModel, Tang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSachRemoteModel() {
		return _sachRemoteModel;
	}

	public void setSachRemoteModel(BaseModel<?> sachRemoteModel) {
		_sachRemoteModel = sachRemoteModel;
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

		Class<?> remoteModelClass = _sachRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SachLocalServiceUtil.addSach(this);
		}
		else {
			SachLocalServiceUtil.updateSach(this);
		}
	}

	@Override
	public Sach toEscapedModel() {
		return (Sach)ProxyUtil.newProxyInstance(Sach.class.getClassLoader(),
			new Class[] { Sach.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SachClp clone = new SachClp();

		clone.setId(getId());
		clone.setTenSach(getTenSach());
		clone.setTheLoaiId(getTheLoaiId());
		clone.setSoLuong(getSoLuong());
		clone.setTrangThai(getTrangThai());
		clone.setNhaXB(getNhaXB());
		clone.setMaSach(getMaSach());
		clone.setKe(getKe());
		clone.setTang(getTang());

		return clone;
	}

	@Override
	public int compareTo(Sach sach) {
		long primaryKey = sach.getPrimaryKey();

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

		if (!(obj instanceof SachClp)) {
			return false;
		}

		SachClp sach = (SachClp)obj;

		long primaryKey = sach.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenSach=");
		sb.append(getTenSach());
		sb.append(", TheLoaiId=");
		sb.append(getTheLoaiId());
		sb.append(", SoLuong=");
		sb.append(getSoLuong());
		sb.append(", TrangThai=");
		sb.append(getTrangThai());
		sb.append(", NhaXB=");
		sb.append(getNhaXB());
		sb.append(", MaSach=");
		sb.append(getMaSach());
		sb.append(", Ke=");
		sb.append(getKe());
		sb.append(", Tang=");
		sb.append(getTang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("thuvien.porlet.model.Sach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenSach</column-name><column-value><![CDATA[");
		sb.append(getTenSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TheLoaiId</column-name><column-value><![CDATA[");
		sb.append(getTheLoaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NhaXB</column-name><column-value><![CDATA[");
		sb.append(getNhaXB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaSach</column-name><column-value><![CDATA[");
		sb.append(getMaSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ke</column-name><column-value><![CDATA[");
		sb.append(getKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Tang</column-name><column-value><![CDATA[");
		sb.append(getTang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _TenSach;
	private long _TheLoaiId;
	private long _SoLuong;
	private String _TrangThai;
	private String _NhaXB;
	private String _MaSach;
	private String _Ke;
	private String _Tang;
	private BaseModel<?> _sachRemoteModel;
	private Class<?> _clpSerializerClass = thuvien.porlet.service.ClpSerializer.class;
}