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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LoaiVanBan}.
 * </p>
 *
 * @author hungt
 * @see LoaiVanBan
 * @generated
 */
public class LoaiVanBanWrapper implements LoaiVanBan, ModelWrapper<LoaiVanBan> {
	public LoaiVanBanWrapper(LoaiVanBan loaiVanBan) {
		_loaiVanBan = loaiVanBan;
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiVanBan.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiVanBan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Ten", getTen());

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
	}

	/**
	* Returns the primary key of this loai van ban.
	*
	* @return the primary key of this loai van ban
	*/
	@Override
	public long getPrimaryKey() {
		return _loaiVanBan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai van ban.
	*
	* @param primaryKey the primary key of this loai van ban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaiVanBan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this loai van ban.
	*
	* @return the ID of this loai van ban
	*/
	@Override
	public long getId() {
		return _loaiVanBan.getId();
	}

	/**
	* Sets the ID of this loai van ban.
	*
	* @param Id the ID of this loai van ban
	*/
	@Override
	public void setId(long Id) {
		_loaiVanBan.setId(Id);
	}

	/**
	* Returns the ten of this loai van ban.
	*
	* @return the ten of this loai van ban
	*/
	@Override
	public java.lang.String getTen() {
		return _loaiVanBan.getTen();
	}

	/**
	* Sets the ten of this loai van ban.
	*
	* @param Ten the ten of this loai van ban
	*/
	@Override
	public void setTen(java.lang.String Ten) {
		_loaiVanBan.setTen(Ten);
	}

	@Override
	public boolean isNew() {
		return _loaiVanBan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiVanBan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiVanBan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiVanBan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiVanBan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiVanBan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiVanBan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiVanBan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiVanBan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiVanBan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiVanBan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiVanBanWrapper((LoaiVanBan)_loaiVanBan.clone());
	}

	@Override
	public int compareTo(ispace.model.LoaiVanBan loaiVanBan) {
		return _loaiVanBan.compareTo(loaiVanBan);
	}

	@Override
	public int hashCode() {
		return _loaiVanBan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.LoaiVanBan> toCacheModel() {
		return _loaiVanBan.toCacheModel();
	}

	@Override
	public ispace.model.LoaiVanBan toEscapedModel() {
		return new LoaiVanBanWrapper(_loaiVanBan.toEscapedModel());
	}

	@Override
	public ispace.model.LoaiVanBan toUnescapedModel() {
		return new LoaiVanBanWrapper(_loaiVanBan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiVanBan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiVanBan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiVanBan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiVanBanWrapper)) {
			return false;
		}

		LoaiVanBanWrapper loaiVanBanWrapper = (LoaiVanBanWrapper)obj;

		if (Validator.equals(_loaiVanBan, loaiVanBanWrapper._loaiVanBan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiVanBan getWrappedLoaiVanBan() {
		return _loaiVanBan;
	}

	@Override
	public LoaiVanBan getWrappedModel() {
		return _loaiVanBan;
	}

	@Override
	public void resetOriginalValues() {
		_loaiVanBan.resetOriginalValues();
	}

	private LoaiVanBan _loaiVanBan;
}