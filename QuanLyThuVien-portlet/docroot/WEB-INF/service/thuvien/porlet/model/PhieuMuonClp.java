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
import thuvien.porlet.service.PhieuMuonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HungThai
 */
public class PhieuMuonClp extends BaseModelImpl<PhieuMuon> implements PhieuMuon {
	public PhieuMuonClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PhieuMuon.class;
	}

	@Override
	public String getModelClassName() {
		return PhieuMuon.class.getName();
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
		attributes.put("UserId", getUserId());
		attributes.put("SachId", getSachId());
		attributes.put("NgayMuon", getNgayMuon());
		attributes.put("NgayTra", getNgayTra());
		attributes.put("SoLuong", getSoLuong());
		attributes.put("XacNhan", getXacNhan());
		attributes.put("TrangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String UserId = (String)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		Long SachId = (Long)attributes.get("SachId");

		if (SachId != null) {
			setSachId(SachId);
		}

		Date NgayMuon = (Date)attributes.get("NgayMuon");

		if (NgayMuon != null) {
			setNgayMuon(NgayMuon);
		}

		Date NgayTra = (Date)attributes.get("NgayTra");

		if (NgayTra != null) {
			setNgayTra(NgayTra);
		}

		Long SoLuong = (Long)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}

		String XacNhan = (String)attributes.get("XacNhan");

		if (XacNhan != null) {
			setXacNhan(XacNhan);
		}

		String TrangThai = (String)attributes.get("TrangThai");

		if (TrangThai != null) {
			setTrangThai(TrangThai);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phieuMuonRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserId() {
		return _UserId;
	}

	@Override
	public void setUserId(String UserId) {
		_UserId = UserId;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", String.class);

				method.invoke(_phieuMuonRemoteModel, UserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSachId() {
		return _SachId;
	}

	@Override
	public void setSachId(long SachId) {
		_SachId = SachId;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSachId", long.class);

				method.invoke(_phieuMuonRemoteModel, SachId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayMuon() {
		return _NgayMuon;
	}

	@Override
	public void setNgayMuon(Date NgayMuon) {
		_NgayMuon = NgayMuon;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayMuon", Date.class);

				method.invoke(_phieuMuonRemoteModel, NgayMuon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTra() {
		return _NgayTra;
	}

	@Override
	public void setNgayTra(Date NgayTra) {
		_NgayTra = NgayTra;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTra", Date.class);

				method.invoke(_phieuMuonRemoteModel, NgayTra);
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

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", long.class);

				method.invoke(_phieuMuonRemoteModel, SoLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXacNhan() {
		return _XacNhan;
	}

	@Override
	public void setXacNhan(String XacNhan) {
		_XacNhan = XacNhan;

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setXacNhan", String.class);

				method.invoke(_phieuMuonRemoteModel, XacNhan);
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

		if (_phieuMuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieuMuonRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_phieuMuonRemoteModel, TrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPhieuMuonRemoteModel() {
		return _phieuMuonRemoteModel;
	}

	public void setPhieuMuonRemoteModel(BaseModel<?> phieuMuonRemoteModel) {
		_phieuMuonRemoteModel = phieuMuonRemoteModel;
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

		Class<?> remoteModelClass = _phieuMuonRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phieuMuonRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PhieuMuonLocalServiceUtil.addPhieuMuon(this);
		}
		else {
			PhieuMuonLocalServiceUtil.updatePhieuMuon(this);
		}
	}

	@Override
	public PhieuMuon toEscapedModel() {
		return (PhieuMuon)ProxyUtil.newProxyInstance(PhieuMuon.class.getClassLoader(),
			new Class[] { PhieuMuon.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PhieuMuonClp clone = new PhieuMuonClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setSachId(getSachId());
		clone.setNgayMuon(getNgayMuon());
		clone.setNgayTra(getNgayTra());
		clone.setSoLuong(getSoLuong());
		clone.setXacNhan(getXacNhan());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(PhieuMuon phieuMuon) {
		long primaryKey = phieuMuon.getPrimaryKey();

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

		if (!(obj instanceof PhieuMuonClp)) {
			return false;
		}

		PhieuMuonClp phieuMuon = (PhieuMuonClp)obj;

		long primaryKey = phieuMuon.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", UserId=");
		sb.append(getUserId());
		sb.append(", SachId=");
		sb.append(getSachId());
		sb.append(", NgayMuon=");
		sb.append(getNgayMuon());
		sb.append(", NgayTra=");
		sb.append(getNgayTra());
		sb.append(", SoLuong=");
		sb.append(getSoLuong());
		sb.append(", XacNhan=");
		sb.append(getXacNhan());
		sb.append(", TrangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("thuvien.porlet.model.PhieuMuon");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UserId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SachId</column-name><column-value><![CDATA[");
		sb.append(getSachId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayMuon</column-name><column-value><![CDATA[");
		sb.append(getNgayMuon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTra</column-name><column-value><![CDATA[");
		sb.append(getNgayTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XacNhan</column-name><column-value><![CDATA[");
		sb.append(getXacNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _UserId;
	private long _SachId;
	private Date _NgayMuon;
	private Date _NgayTra;
	private long _SoLuong;
	private String _XacNhan;
	private String _TrangThai;
	private BaseModel<?> _phieuMuonRemoteModel;
	private Class<?> _clpSerializerClass = thuvien.porlet.service.ClpSerializer.class;
}