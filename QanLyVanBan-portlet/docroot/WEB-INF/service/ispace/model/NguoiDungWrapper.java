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
 * This class is a wrapper for {@link NguoiDung}.
 * </p>
 *
 * @author hungt
 * @see NguoiDung
 * @generated
 */
public class NguoiDungWrapper implements NguoiDung, ModelWrapper<NguoiDung> {
	public NguoiDungWrapper(NguoiDung nguoiDung) {
		_nguoiDung = nguoiDung;
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

	/**
	* Returns the primary key of this nguoi dung.
	*
	* @return the primary key of this nguoi dung
	*/
	@Override
	public long getPrimaryKey() {
		return _nguoiDung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nguoi dung.
	*
	* @param primaryKey the primary key of this nguoi dung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nguoiDung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this nguoi dung.
	*
	* @return the ID of this nguoi dung
	*/
	@Override
	public long getId() {
		return _nguoiDung.getId();
	}

	/**
	* Sets the ID of this nguoi dung.
	*
	* @param Id the ID of this nguoi dung
	*/
	@Override
	public void setId(long Id) {
		_nguoiDung.setId(Id);
	}

	/**
	* Returns the ten of this nguoi dung.
	*
	* @return the ten of this nguoi dung
	*/
	@Override
	public java.lang.String getTen() {
		return _nguoiDung.getTen();
	}

	/**
	* Sets the ten of this nguoi dung.
	*
	* @param Ten the ten of this nguoi dung
	*/
	@Override
	public void setTen(java.lang.String Ten) {
		_nguoiDung.setTen(Ten);
	}

	/**
	* Returns the nguoi ky of this nguoi dung.
	*
	* @return the nguoi ky of this nguoi dung
	*/
	@Override
	public java.lang.String getNguoiKy() {
		return _nguoiDung.getNguoiKy();
	}

	/**
	* Sets the nguoi ky of this nguoi dung.
	*
	* @param NguoiKy the nguoi ky of this nguoi dung
	*/
	@Override
	public void setNguoiKy(java.lang.String NguoiKy) {
		_nguoiDung.setNguoiKy(NguoiKy);
	}

	@Override
	public boolean isNew() {
		return _nguoiDung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nguoiDung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nguoiDung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nguoiDung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nguoiDung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nguoiDung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nguoiDung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nguoiDung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nguoiDung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nguoiDung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nguoiDung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NguoiDungWrapper((NguoiDung)_nguoiDung.clone());
	}

	@Override
	public int compareTo(ispace.model.NguoiDung nguoiDung) {
		return _nguoiDung.compareTo(nguoiDung);
	}

	@Override
	public int hashCode() {
		return _nguoiDung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.NguoiDung> toCacheModel() {
		return _nguoiDung.toCacheModel();
	}

	@Override
	public ispace.model.NguoiDung toEscapedModel() {
		return new NguoiDungWrapper(_nguoiDung.toEscapedModel());
	}

	@Override
	public ispace.model.NguoiDung toUnescapedModel() {
		return new NguoiDungWrapper(_nguoiDung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nguoiDung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nguoiDung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nguoiDung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NguoiDungWrapper)) {
			return false;
		}

		NguoiDungWrapper nguoiDungWrapper = (NguoiDungWrapper)obj;

		if (Validator.equals(_nguoiDung, nguoiDungWrapper._nguoiDung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NguoiDung getWrappedNguoiDung() {
		return _nguoiDung;
	}

	@Override
	public NguoiDung getWrappedModel() {
		return _nguoiDung;
	}

	@Override
	public void resetOriginalValues() {
		_nguoiDung.resetOriginalValues();
	}

	private NguoiDung _nguoiDung;
}