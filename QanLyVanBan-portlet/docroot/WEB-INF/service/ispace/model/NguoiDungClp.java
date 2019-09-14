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
import ispace.service.NguoiDungLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hungt
 */
public class NguoiDungClp extends BaseModelImpl<NguoiDung> implements NguoiDung {
	public NguoiDungClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NguoiDung.class;
	}

	@Override
	public String getModelClassName() {
		return NguoiDung.class.getName();
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
		attributes.put("Ten", getTen());
		attributes.put("NguoiKy", getNguoiKy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Ten = (String)attributes.get("Ten");

		if (Ten != null) {
			setTen(Ten);
		}

		String NguoiKy = (String)attributes.get("NguoiKy");

		if (NguoiKy != null) {
			setNguoiKy(NguoiKy);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_nguoiDungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoiDungRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_nguoiDungRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTen() {
		return _Ten;
	}

	@Override
	public void setTen(String Ten) {
		_Ten = Ten;

		if (_nguoiDungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoiDungRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_nguoiDungRemoteModel, Ten);
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

		if (_nguoiDungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoiDungRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiKy", String.class);

				method.invoke(_nguoiDungRemoteModel, NguoiKy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNguoiDungRemoteModel() {
		return _nguoiDungRemoteModel;
	}

	public void setNguoiDungRemoteModel(BaseModel<?> nguoiDungRemoteModel) {
		_nguoiDungRemoteModel = nguoiDungRemoteModel;
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

		Class<?> remoteModelClass = _nguoiDungRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nguoiDungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NguoiDungLocalServiceUtil.addNguoiDung(this);
		}
		else {
			NguoiDungLocalServiceUtil.updateNguoiDung(this);
		}
	}

	@Override
	public NguoiDung toEscapedModel() {
		return (NguoiDung)ProxyUtil.newProxyInstance(NguoiDung.class.getClassLoader(),
			new Class[] { NguoiDung.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NguoiDungClp clone = new NguoiDungClp();

		clone.setId(getId());
		clone.setTen(getTen());
		clone.setNguoiKy(getNguoiKy());

		return clone;
	}

	@Override
	public int compareTo(NguoiDung nguoiDung) {
		long primaryKey = nguoiDung.getPrimaryKey();

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

		if (!(obj instanceof NguoiDungClp)) {
			return false;
		}

		NguoiDungClp nguoiDung = (NguoiDungClp)obj;

		long primaryKey = nguoiDung.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Ten=");
		sb.append(getTen());
		sb.append(", NguoiKy=");
		sb.append(getNguoiKy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("ispace.model.NguoiDung");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiKy</column-name><column-value><![CDATA[");
		sb.append(getNguoiKy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Ten;
	private String _NguoiKy;
	private BaseModel<?> _nguoiDungRemoteModel;
	private Class<?> _clpSerializerClass = ispace.service.ClpSerializer.class;
}