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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VanBanDi}.
 * </p>
 *
 * @author hungt
 * @see VanBanDi
 * @generated
 */
public class VanBanDiWrapper implements VanBanDi, ModelWrapper<VanBanDi> {
	public VanBanDiWrapper(VanBanDi vanBanDi) {
		_vanBanDi = vanBanDi;
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDi.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("SoKiHieu", getSoKiHieu());
		attributes.put("LoaiVanBan", getLoaiVanBan());
		attributes.put("SoVanBan", getSoVanBan());
		attributes.put("NguoiKy", getNguoiKy());
		attributes.put("NgayKy", getNgayKy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String SoKiHieu = (String)attributes.get("SoKiHieu");

		if (SoKiHieu != null) {
			setSoKiHieu(SoKiHieu);
		}

		String LoaiVanBan = (String)attributes.get("LoaiVanBan");

		if (LoaiVanBan != null) {
			setLoaiVanBan(LoaiVanBan);
		}

		String SoVanBan = (String)attributes.get("SoVanBan");

		if (SoVanBan != null) {
			setSoVanBan(SoVanBan);
		}

		String NguoiKy = (String)attributes.get("NguoiKy");

		if (NguoiKy != null) {
			setNguoiKy(NguoiKy);
		}

		Date NgayKy = (Date)attributes.get("NgayKy");

		if (NgayKy != null) {
			setNgayKy(NgayKy);
		}
	}

	/**
	* Returns the primary key of this van ban di.
	*
	* @return the primary key of this van ban di
	*/
	@Override
	public long getPrimaryKey() {
		return _vanBanDi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this van ban di.
	*
	* @param primaryKey the primary key of this van ban di
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vanBanDi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this van ban di.
	*
	* @return the ID of this van ban di
	*/
	@Override
	public long getId() {
		return _vanBanDi.getId();
	}

	/**
	* Sets the ID of this van ban di.
	*
	* @param Id the ID of this van ban di
	*/
	@Override
	public void setId(long Id) {
		_vanBanDi.setId(Id);
	}

	/**
	* Returns the so ki hieu of this van ban di.
	*
	* @return the so ki hieu of this van ban di
	*/
	@Override
	public java.lang.String getSoKiHieu() {
		return _vanBanDi.getSoKiHieu();
	}

	/**
	* Sets the so ki hieu of this van ban di.
	*
	* @param SoKiHieu the so ki hieu of this van ban di
	*/
	@Override
	public void setSoKiHieu(java.lang.String SoKiHieu) {
		_vanBanDi.setSoKiHieu(SoKiHieu);
	}

	/**
	* Returns the loai van ban of this van ban di.
	*
	* @return the loai van ban of this van ban di
	*/
	@Override
	public java.lang.String getLoaiVanBan() {
		return _vanBanDi.getLoaiVanBan();
	}

	/**
	* Sets the loai van ban of this van ban di.
	*
	* @param LoaiVanBan the loai van ban of this van ban di
	*/
	@Override
	public void setLoaiVanBan(java.lang.String LoaiVanBan) {
		_vanBanDi.setLoaiVanBan(LoaiVanBan);
	}

	/**
	* Returns the so van ban of this van ban di.
	*
	* @return the so van ban of this van ban di
	*/
	@Override
	public java.lang.String getSoVanBan() {
		return _vanBanDi.getSoVanBan();
	}

	/**
	* Sets the so van ban of this van ban di.
	*
	* @param SoVanBan the so van ban of this van ban di
	*/
	@Override
	public void setSoVanBan(java.lang.String SoVanBan) {
		_vanBanDi.setSoVanBan(SoVanBan);
	}

	/**
	* Returns the nguoi ky of this van ban di.
	*
	* @return the nguoi ky of this van ban di
	*/
	@Override
	public java.lang.String getNguoiKy() {
		return _vanBanDi.getNguoiKy();
	}

	/**
	* Sets the nguoi ky of this van ban di.
	*
	* @param NguoiKy the nguoi ky of this van ban di
	*/
	@Override
	public void setNguoiKy(java.lang.String NguoiKy) {
		_vanBanDi.setNguoiKy(NguoiKy);
	}

	/**
	* Returns the ngay ky of this van ban di.
	*
	* @return the ngay ky of this van ban di
	*/
	@Override
	public java.util.Date getNgayKy() {
		return _vanBanDi.getNgayKy();
	}

	/**
	* Sets the ngay ky of this van ban di.
	*
	* @param NgayKy the ngay ky of this van ban di
	*/
	@Override
	public void setNgayKy(java.util.Date NgayKy) {
		_vanBanDi.setNgayKy(NgayKy);
	}

	@Override
	public boolean isNew() {
		return _vanBanDi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vanBanDi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vanBanDi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vanBanDi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vanBanDi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vanBanDi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vanBanDi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vanBanDi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vanBanDi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vanBanDi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vanBanDi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VanBanDiWrapper((VanBanDi)_vanBanDi.clone());
	}

	@Override
	public int compareTo(ispace.model.VanBanDi vanBanDi) {
		return _vanBanDi.compareTo(vanBanDi);
	}

	@Override
	public int hashCode() {
		return _vanBanDi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.VanBanDi> toCacheModel() {
		return _vanBanDi.toCacheModel();
	}

	@Override
	public ispace.model.VanBanDi toEscapedModel() {
		return new VanBanDiWrapper(_vanBanDi.toEscapedModel());
	}

	@Override
	public ispace.model.VanBanDi toUnescapedModel() {
		return new VanBanDiWrapper(_vanBanDi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vanBanDi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vanBanDi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanBanDi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDiWrapper)) {
			return false;
		}

		VanBanDiWrapper vanBanDiWrapper = (VanBanDiWrapper)obj;

		if (Validator.equals(_vanBanDi, vanBanDiWrapper._vanBanDi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VanBanDi getWrappedVanBanDi() {
		return _vanBanDi;
	}

	@Override
	public VanBanDi getWrappedModel() {
		return _vanBanDi;
	}

	@Override
	public void resetOriginalValues() {
		_vanBanDi.resetOriginalValues();
	}

	private VanBanDi _vanBanDi;
}