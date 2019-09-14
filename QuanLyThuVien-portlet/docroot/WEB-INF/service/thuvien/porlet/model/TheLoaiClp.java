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
import thuvien.porlet.service.TheLoaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HungThai
 */
public class TheLoaiClp extends BaseModelImpl<TheLoai> implements TheLoai {
	public TheLoaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TheLoai.class;
	}

	@Override
	public String getModelClassName() {
		return TheLoai.class.getName();
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
		attributes.put("TenTheLoai", getTenTheLoai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenTheLoai = (String)attributes.get("TenTheLoai");

		if (TenTheLoai != null) {
			setTenTheLoai(TenTheLoai);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_theLoaiRemoteModel != null) {
			try {
				Class<?> clazz = _theLoaiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_theLoaiRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTheLoai() {
		return _TenTheLoai;
	}

	@Override
	public void setTenTheLoai(String TenTheLoai) {
		_TenTheLoai = TenTheLoai;

		if (_theLoaiRemoteModel != null) {
			try {
				Class<?> clazz = _theLoaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTheLoai", String.class);

				method.invoke(_theLoaiRemoteModel, TenTheLoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTheLoaiRemoteModel() {
		return _theLoaiRemoteModel;
	}

	public void setTheLoaiRemoteModel(BaseModel<?> theLoaiRemoteModel) {
		_theLoaiRemoteModel = theLoaiRemoteModel;
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

		Class<?> remoteModelClass = _theLoaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_theLoaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TheLoaiLocalServiceUtil.addTheLoai(this);
		}
		else {
			TheLoaiLocalServiceUtil.updateTheLoai(this);
		}
	}

	@Override
	public TheLoai toEscapedModel() {
		return (TheLoai)ProxyUtil.newProxyInstance(TheLoai.class.getClassLoader(),
			new Class[] { TheLoai.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TheLoaiClp clone = new TheLoaiClp();

		clone.setId(getId());
		clone.setTenTheLoai(getTenTheLoai());

		return clone;
	}

	@Override
	public int compareTo(TheLoai theLoai) {
		long primaryKey = theLoai.getPrimaryKey();

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

		if (!(obj instanceof TheLoaiClp)) {
			return false;
		}

		TheLoaiClp theLoai = (TheLoaiClp)obj;

		long primaryKey = theLoai.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenTheLoai=");
		sb.append(getTenTheLoai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("thuvien.porlet.model.TheLoai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTheLoai</column-name><column-value><![CDATA[");
		sb.append(getTenTheLoai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _TenTheLoai;
	private BaseModel<?> _theLoaiRemoteModel;
	private Class<?> _clpSerializerClass = thuvien.porlet.service.ClpSerializer.class;
}