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
 * This class is a wrapper for {@link Sach}.
 * </p>
 *
 * @author HungThai
 * @see Sach
 * @generated
 */
public class SachWrapper implements Sach, ModelWrapper<Sach> {
	public SachWrapper(Sach sach) {
		_sach = sach;
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenSach", getTenSach());
		attributes.put("TheLoaiId", getTheLoaiId());
		attributes.put("SoLuong", getSoLuong());
		attributes.put("TrangThai", getTrangThai());
		attributes.put("NhaXB", getNhaXB());
		attributes.put("MaSach", getMaSach());
		attributes.put("Ke", getKe());
		attributes.put("Tang", getTang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenSach = (String)attributes.get("TenSach");

		if (TenSach != null) {
			setTenSach(TenSach);
		}

		Long TheLoaiId = (Long)attributes.get("TheLoaiId");

		if (TheLoaiId != null) {
			setTheLoaiId(TheLoaiId);
		}

		Long SoLuong = (Long)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}

		String TrangThai = (String)attributes.get("TrangThai");

		if (TrangThai != null) {
			setTrangThai(TrangThai);
		}

		String NhaXB = (String)attributes.get("NhaXB");

		if (NhaXB != null) {
			setNhaXB(NhaXB);
		}

		String MaSach = (String)attributes.get("MaSach");

		if (MaSach != null) {
			setMaSach(MaSach);
		}

		String Ke = (String)attributes.get("Ke");

		if (Ke != null) {
			setKe(Ke);
		}

		String Tang = (String)attributes.get("Tang");

		if (Tang != null) {
			setTang(Tang);
		}
	}

	/**
	* Returns the primary key of this sach.
	*
	* @return the primary key of this sach
	*/
	@Override
	public long getPrimaryKey() {
		return _sach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sach.
	*
	* @param primaryKey the primary key of this sach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this sach.
	*
	* @return the ID of this sach
	*/
	@Override
	public long getId() {
		return _sach.getId();
	}

	/**
	* Sets the ID of this sach.
	*
	* @param Id the ID of this sach
	*/
	@Override
	public void setId(long Id) {
		_sach.setId(Id);
	}

	/**
	* Returns the ten sach of this sach.
	*
	* @return the ten sach of this sach
	*/
	@Override
	public java.lang.String getTenSach() {
		return _sach.getTenSach();
	}

	/**
	* Sets the ten sach of this sach.
	*
	* @param TenSach the ten sach of this sach
	*/
	@Override
	public void setTenSach(java.lang.String TenSach) {
		_sach.setTenSach(TenSach);
	}

	/**
	* Returns the the loai ID of this sach.
	*
	* @return the the loai ID of this sach
	*/
	@Override
	public long getTheLoaiId() {
		return _sach.getTheLoaiId();
	}

	/**
	* Sets the the loai ID of this sach.
	*
	* @param TheLoaiId the the loai ID of this sach
	*/
	@Override
	public void setTheLoaiId(long TheLoaiId) {
		_sach.setTheLoaiId(TheLoaiId);
	}

	/**
	* Returns the so luong of this sach.
	*
	* @return the so luong of this sach
	*/
	@Override
	public long getSoLuong() {
		return _sach.getSoLuong();
	}

	/**
	* Sets the so luong of this sach.
	*
	* @param SoLuong the so luong of this sach
	*/
	@Override
	public void setSoLuong(long SoLuong) {
		_sach.setSoLuong(SoLuong);
	}

	/**
	* Returns the trang thai of this sach.
	*
	* @return the trang thai of this sach
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _sach.getTrangThai();
	}

	/**
	* Sets the trang thai of this sach.
	*
	* @param TrangThai the trang thai of this sach
	*/
	@Override
	public void setTrangThai(java.lang.String TrangThai) {
		_sach.setTrangThai(TrangThai);
	}

	/**
	* Returns the nha x b of this sach.
	*
	* @return the nha x b of this sach
	*/
	@Override
	public java.lang.String getNhaXB() {
		return _sach.getNhaXB();
	}

	/**
	* Sets the nha x b of this sach.
	*
	* @param NhaXB the nha x b of this sach
	*/
	@Override
	public void setNhaXB(java.lang.String NhaXB) {
		_sach.setNhaXB(NhaXB);
	}

	/**
	* Returns the ma sach of this sach.
	*
	* @return the ma sach of this sach
	*/
	@Override
	public java.lang.String getMaSach() {
		return _sach.getMaSach();
	}

	/**
	* Sets the ma sach of this sach.
	*
	* @param MaSach the ma sach of this sach
	*/
	@Override
	public void setMaSach(java.lang.String MaSach) {
		_sach.setMaSach(MaSach);
	}

	/**
	* Returns the ke of this sach.
	*
	* @return the ke of this sach
	*/
	@Override
	public java.lang.String getKe() {
		return _sach.getKe();
	}

	/**
	* Sets the ke of this sach.
	*
	* @param Ke the ke of this sach
	*/
	@Override
	public void setKe(java.lang.String Ke) {
		_sach.setKe(Ke);
	}

	/**
	* Returns the tang of this sach.
	*
	* @return the tang of this sach
	*/
	@Override
	public java.lang.String getTang() {
		return _sach.getTang();
	}

	/**
	* Sets the tang of this sach.
	*
	* @param Tang the tang of this sach
	*/
	@Override
	public void setTang(java.lang.String Tang) {
		_sach.setTang(Tang);
	}

	@Override
	public boolean isNew() {
		return _sach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SachWrapper((Sach)_sach.clone());
	}

	@Override
	public int compareTo(thuvien.porlet.model.Sach sach) {
		return _sach.compareTo(sach);
	}

	@Override
	public int hashCode() {
		return _sach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<thuvien.porlet.model.Sach> toCacheModel() {
		return _sach.toCacheModel();
	}

	@Override
	public thuvien.porlet.model.Sach toEscapedModel() {
		return new SachWrapper(_sach.toEscapedModel());
	}

	@Override
	public thuvien.porlet.model.Sach toUnescapedModel() {
		return new SachWrapper(_sach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SachWrapper)) {
			return false;
		}

		SachWrapper sachWrapper = (SachWrapper)obj;

		if (Validator.equals(_sach, sachWrapper._sach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sach getWrappedSach() {
		return _sach;
	}

	@Override
	public Sach getWrappedModel() {
		return _sach;
	}

	@Override
	public void resetOriginalValues() {
		_sach.resetOriginalValues();
	}

	private Sach _sach;
}