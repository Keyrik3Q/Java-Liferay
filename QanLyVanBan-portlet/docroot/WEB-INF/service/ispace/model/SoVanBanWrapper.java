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
 * This class is a wrapper for {@link SoVanBan}.
 * </p>
 *
 * @author hungt
 * @see SoVanBan
 * @generated
 */
public class SoVanBanWrapper implements SoVanBan, ModelWrapper<SoVanBan> {
	public SoVanBanWrapper(SoVanBan soVanBan) {
		_soVanBan = soVanBan;
	}

	@Override
	public Class<?> getModelClass() {
		return SoVanBan.class;
	}

	@Override
	public String getModelClassName() {
		return SoVanBan.class.getName();
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
	* Returns the primary key of this so van ban.
	*
	* @return the primary key of this so van ban
	*/
	@Override
	public long getPrimaryKey() {
		return _soVanBan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this so van ban.
	*
	* @param primaryKey the primary key of this so van ban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_soVanBan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this so van ban.
	*
	* @return the ID of this so van ban
	*/
	@Override
	public long getId() {
		return _soVanBan.getId();
	}

	/**
	* Sets the ID of this so van ban.
	*
	* @param Id the ID of this so van ban
	*/
	@Override
	public void setId(long Id) {
		_soVanBan.setId(Id);
	}

	/**
	* Returns the ten of this so van ban.
	*
	* @return the ten of this so van ban
	*/
	@Override
	public java.lang.String getTen() {
		return _soVanBan.getTen();
	}

	/**
	* Sets the ten of this so van ban.
	*
	* @param Ten the ten of this so van ban
	*/
	@Override
	public void setTen(java.lang.String Ten) {
		_soVanBan.setTen(Ten);
	}

	@Override
	public boolean isNew() {
		return _soVanBan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_soVanBan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _soVanBan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_soVanBan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _soVanBan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _soVanBan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_soVanBan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _soVanBan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_soVanBan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_soVanBan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_soVanBan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SoVanBanWrapper((SoVanBan)_soVanBan.clone());
	}

	@Override
	public int compareTo(ispace.model.SoVanBan soVanBan) {
		return _soVanBan.compareTo(soVanBan);
	}

	@Override
	public int hashCode() {
		return _soVanBan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.SoVanBan> toCacheModel() {
		return _soVanBan.toCacheModel();
	}

	@Override
	public ispace.model.SoVanBan toEscapedModel() {
		return new SoVanBanWrapper(_soVanBan.toEscapedModel());
	}

	@Override
	public ispace.model.SoVanBan toUnescapedModel() {
		return new SoVanBanWrapper(_soVanBan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _soVanBan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _soVanBan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_soVanBan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SoVanBanWrapper)) {
			return false;
		}

		SoVanBanWrapper soVanBanWrapper = (SoVanBanWrapper)obj;

		if (Validator.equals(_soVanBan, soVanBanWrapper._soVanBan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SoVanBan getWrappedSoVanBan() {
		return _soVanBan;
	}

	@Override
	public SoVanBan getWrappedModel() {
		return _soVanBan;
	}

	@Override
	public void resetOriginalValues() {
		_soVanBan.resetOriginalValues();
	}

	private SoVanBan _soVanBan;
}