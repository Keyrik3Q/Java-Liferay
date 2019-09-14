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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TheLoai}.
 * </p>
 *
 * @author HungThai
 * @see TheLoai
 * @generated
 */
public class TheLoaiWrapper implements TheLoai, ModelWrapper<TheLoai> {
	public TheLoaiWrapper(TheLoai theLoai) {
		_theLoai = theLoai;
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

	/**
	* Returns the primary key of this the loai.
	*
	* @return the primary key of this the loai
	*/
	@Override
	public long getPrimaryKey() {
		return _theLoai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this the loai.
	*
	* @param primaryKey the primary key of this the loai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_theLoai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this the loai.
	*
	* @return the ID of this the loai
	*/
	@Override
	public long getId() {
		return _theLoai.getId();
	}

	/**
	* Sets the ID of this the loai.
	*
	* @param Id the ID of this the loai
	*/
	@Override
	public void setId(long Id) {
		_theLoai.setId(Id);
	}

	/**
	* Returns the ten the loai of this the loai.
	*
	* @return the ten the loai of this the loai
	*/
	@Override
	public java.lang.String getTenTheLoai() {
		return _theLoai.getTenTheLoai();
	}

	/**
	* Sets the ten the loai of this the loai.
	*
	* @param TenTheLoai the ten the loai of this the loai
	*/
	@Override
	public void setTenTheLoai(java.lang.String TenTheLoai) {
		_theLoai.setTenTheLoai(TenTheLoai);
	}

	@Override
	public boolean isNew() {
		return _theLoai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_theLoai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _theLoai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_theLoai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _theLoai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _theLoai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_theLoai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _theLoai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_theLoai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_theLoai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_theLoai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TheLoaiWrapper((TheLoai)_theLoai.clone());
	}

	@Override
	public int compareTo(thuvien.porlet.model.TheLoai theLoai) {
		return _theLoai.compareTo(theLoai);
	}

	@Override
	public int hashCode() {
		return _theLoai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<thuvien.porlet.model.TheLoai> toCacheModel() {
		return _theLoai.toCacheModel();
	}

	@Override
	public thuvien.porlet.model.TheLoai toEscapedModel() {
		return new TheLoaiWrapper(_theLoai.toEscapedModel());
	}

	@Override
	public thuvien.porlet.model.TheLoai toUnescapedModel() {
		return new TheLoaiWrapper(_theLoai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _theLoai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _theLoai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_theLoai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TheLoaiWrapper)) {
			return false;
		}

		TheLoaiWrapper theLoaiWrapper = (TheLoaiWrapper)obj;

		if (Validator.equals(_theLoai, theLoaiWrapper._theLoai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TheLoai getWrappedTheLoai() {
		return _theLoai;
	}

	@Override
	public TheLoai getWrappedModel() {
		return _theLoai;
	}

	@Override
	public void resetOriginalValues() {
		_theLoai.resetOriginalValues();
	}

	private TheLoai _theLoai;
}