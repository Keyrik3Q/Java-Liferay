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
 * This class is a wrapper for {@link VanBanDen}.
 * </p>
 *
 * @author hungt
 * @see VanBanDen
 * @generated
 */
public class VanBanDenWrapper implements VanBanDen, ModelWrapper<VanBanDen> {
	public VanBanDenWrapper(VanBanDen vanBanDen) {
		_vanBanDen = vanBanDen;
	}

	@Override
	public Class<?> getModelClass() {
		return VanBanDen.class;
	}

	@Override
	public String getModelClassName() {
		return VanBanDen.class.getName();
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
	* Returns the primary key of this van ban den.
	*
	* @return the primary key of this van ban den
	*/
	@Override
	public long getPrimaryKey() {
		return _vanBanDen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this van ban den.
	*
	* @param primaryKey the primary key of this van ban den
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vanBanDen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this van ban den.
	*
	* @return the ID of this van ban den
	*/
	@Override
	public long getId() {
		return _vanBanDen.getId();
	}

	/**
	* Sets the ID of this van ban den.
	*
	* @param Id the ID of this van ban den
	*/
	@Override
	public void setId(long Id) {
		_vanBanDen.setId(Id);
	}

	/**
	* Returns the so ki hieu of this van ban den.
	*
	* @return the so ki hieu of this van ban den
	*/
	@Override
	public java.lang.String getSoKiHieu() {
		return _vanBanDen.getSoKiHieu();
	}

	/**
	* Sets the so ki hieu of this van ban den.
	*
	* @param SoKiHieu the so ki hieu of this van ban den
	*/
	@Override
	public void setSoKiHieu(java.lang.String SoKiHieu) {
		_vanBanDen.setSoKiHieu(SoKiHieu);
	}

	/**
	* Returns the loai van ban of this van ban den.
	*
	* @return the loai van ban of this van ban den
	*/
	@Override
	public java.lang.String getLoaiVanBan() {
		return _vanBanDen.getLoaiVanBan();
	}

	/**
	* Sets the loai van ban of this van ban den.
	*
	* @param LoaiVanBan the loai van ban of this van ban den
	*/
	@Override
	public void setLoaiVanBan(java.lang.String LoaiVanBan) {
		_vanBanDen.setLoaiVanBan(LoaiVanBan);
	}

	/**
	* Returns the so van ban of this van ban den.
	*
	* @return the so van ban of this van ban den
	*/
	@Override
	public java.lang.String getSoVanBan() {
		return _vanBanDen.getSoVanBan();
	}

	/**
	* Sets the so van ban of this van ban den.
	*
	* @param SoVanBan the so van ban of this van ban den
	*/
	@Override
	public void setSoVanBan(java.lang.String SoVanBan) {
		_vanBanDen.setSoVanBan(SoVanBan);
	}

	/**
	* Returns the nguoi ky of this van ban den.
	*
	* @return the nguoi ky of this van ban den
	*/
	@Override
	public java.lang.String getNguoiKy() {
		return _vanBanDen.getNguoiKy();
	}

	/**
	* Sets the nguoi ky of this van ban den.
	*
	* @param NguoiKy the nguoi ky of this van ban den
	*/
	@Override
	public void setNguoiKy(java.lang.String NguoiKy) {
		_vanBanDen.setNguoiKy(NguoiKy);
	}

	/**
	* Returns the ngay ky of this van ban den.
	*
	* @return the ngay ky of this van ban den
	*/
	@Override
	public java.util.Date getNgayKy() {
		return _vanBanDen.getNgayKy();
	}

	/**
	* Sets the ngay ky of this van ban den.
	*
	* @param NgayKy the ngay ky of this van ban den
	*/
	@Override
	public void setNgayKy(java.util.Date NgayKy) {
		_vanBanDen.setNgayKy(NgayKy);
	}

	@Override
	public boolean isNew() {
		return _vanBanDen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vanBanDen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vanBanDen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vanBanDen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vanBanDen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vanBanDen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vanBanDen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vanBanDen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vanBanDen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vanBanDen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vanBanDen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VanBanDenWrapper((VanBanDen)_vanBanDen.clone());
	}

	@Override
	public int compareTo(ispace.model.VanBanDen vanBanDen) {
		return _vanBanDen.compareTo(vanBanDen);
	}

	@Override
	public int hashCode() {
		return _vanBanDen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.VanBanDen> toCacheModel() {
		return _vanBanDen.toCacheModel();
	}

	@Override
	public ispace.model.VanBanDen toEscapedModel() {
		return new VanBanDenWrapper(_vanBanDen.toEscapedModel());
	}

	@Override
	public ispace.model.VanBanDen toUnescapedModel() {
		return new VanBanDenWrapper(_vanBanDen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vanBanDen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vanBanDen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanBanDen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VanBanDenWrapper)) {
			return false;
		}

		VanBanDenWrapper vanBanDenWrapper = (VanBanDenWrapper)obj;

		if (Validator.equals(_vanBanDen, vanBanDenWrapper._vanBanDen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VanBanDen getWrappedVanBanDen() {
		return _vanBanDen;
	}

	@Override
	public VanBanDen getWrappedModel() {
		return _vanBanDen;
	}

	@Override
	public void resetOriginalValues() {
		_vanBanDen.resetOriginalValues();
	}

	private VanBanDen _vanBanDen;
}