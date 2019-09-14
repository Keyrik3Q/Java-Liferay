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

package ispace.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ispace.model.NguoiDung;
import ispace.model.NguoiDungModel;
import ispace.model.NguoiDungSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the NguoiDung service. Represents a row in the &quot;nguoidung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ispace.model.NguoiDungModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NguoiDungImpl}.
 * </p>
 *
 * @author hungt
 * @see NguoiDungImpl
 * @see ispace.model.NguoiDung
 * @see ispace.model.NguoiDungModel
 * @generated
 */
@JSON(strict = true)
public class NguoiDungModelImpl extends BaseModelImpl<NguoiDung>
	implements NguoiDungModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nguoi dung model instance should use the {@link ispace.model.NguoiDung} interface instead.
	 */
	public static final String TABLE_NAME = "nguoidung";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "ten", Types.VARCHAR },
			{ "nguoiky", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table nguoidung (id LONG not null primary key,ten VARCHAR(75) null,nguoiky VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table nguoidung";
	public static final String ORDER_BY_JPQL = " ORDER BY nguoiDung.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nguoidung.id ASC";
	public static final String DATA_SOURCE = "qlvanbanDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.ispace.model.NguoiDung"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.ispace.model.NguoiDung"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static NguoiDung toModel(NguoiDungSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		NguoiDung model = new NguoiDungImpl();

		model.setId(soapModel.getId());
		model.setTen(soapModel.getTen());
		model.setNguoiKy(soapModel.getNguoiKy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<NguoiDung> toModels(NguoiDungSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<NguoiDung> models = new ArrayList<NguoiDung>(soapModels.length);

		for (NguoiDungSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.ispace.model.NguoiDung"));

	public NguoiDungModelImpl() {
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
	public Class<?> getModelClass() {
		return NguoiDung.class;
	}

	@Override
	public String getModelClassName() {
		return NguoiDung.class.getName();
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

	@JSON
	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;
	}

	@JSON
	@Override
	public String getTen() {
		if (_Ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _Ten;
		}
	}

	@Override
	public void setTen(String Ten) {
		_Ten = Ten;
	}

	@JSON
	@Override
	public String getNguoiKy() {
		if (_NguoiKy == null) {
			return StringPool.BLANK;
		}
		else {
			return _NguoiKy;
		}
	}

	@Override
	public void setNguoiKy(String NguoiKy) {
		_NguoiKy = NguoiKy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			NguoiDung.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NguoiDung toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (NguoiDung)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NguoiDungImpl nguoiDungImpl = new NguoiDungImpl();

		nguoiDungImpl.setId(getId());
		nguoiDungImpl.setTen(getTen());
		nguoiDungImpl.setNguoiKy(getNguoiKy());

		nguoiDungImpl.resetOriginalValues();

		return nguoiDungImpl;
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

		if (!(obj instanceof NguoiDung)) {
			return false;
		}

		NguoiDung nguoiDung = (NguoiDung)obj;

		long primaryKey = nguoiDung.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<NguoiDung> toCacheModel() {
		NguoiDungCacheModel nguoiDungCacheModel = new NguoiDungCacheModel();

		nguoiDungCacheModel.Id = getId();

		nguoiDungCacheModel.Ten = getTen();

		String Ten = nguoiDungCacheModel.Ten;

		if ((Ten != null) && (Ten.length() == 0)) {
			nguoiDungCacheModel.Ten = null;
		}

		nguoiDungCacheModel.NguoiKy = getNguoiKy();

		String NguoiKy = nguoiDungCacheModel.NguoiKy;

		if ((NguoiKy != null) && (NguoiKy.length() == 0)) {
			nguoiDungCacheModel.NguoiKy = null;
		}

		return nguoiDungCacheModel;
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

	private static ClassLoader _classLoader = NguoiDung.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			NguoiDung.class
		};
	private long _Id;
	private String _Ten;
	private String _NguoiKy;
	private NguoiDung _escapedModel;
}