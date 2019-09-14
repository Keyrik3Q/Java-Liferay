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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PhieuMuon}.
 * </p>
 *
 * @author HungThai
 * @see PhieuMuon
 * @generated
 */
public class PhieuMuonWrapper implements PhieuMuon, ModelWrapper<PhieuMuon> {
	public PhieuMuonWrapper(PhieuMuon phieuMuon) {
		_phieuMuon = phieuMuon;
	}

	@Override
	public Class<?> getModelClass() {
		return PhieuMuon.class;
	}

	@Override
	public String getModelClassName() {
		return PhieuMuon.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("UserId", getUserId());
		attributes.put("SachId", getSachId());
		attributes.put("NgayMuon", getNgayMuon());
		attributes.put("NgayTra", getNgayTra());
		attributes.put("SoLuong", getSoLuong());
		attributes.put("XacNhan", getXacNhan());
		attributes.put("TrangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String UserId = (String)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		Long SachId = (Long)attributes.get("SachId");

		if (SachId != null) {
			setSachId(SachId);
		}

		Date NgayMuon = (Date)attributes.get("NgayMuon");

		if (NgayMuon != null) {
			setNgayMuon(NgayMuon);
		}

		Date NgayTra = (Date)attributes.get("NgayTra");

		if (NgayTra != null) {
			setNgayTra(NgayTra);
		}

		Long SoLuong = (Long)attributes.get("SoLuong");

		if (SoLuong != null) {
			setSoLuong(SoLuong);
		}

		String XacNhan = (String)attributes.get("XacNhan");

		if (XacNhan != null) {
			setXacNhan(XacNhan);
		}

		String TrangThai = (String)attributes.get("TrangThai");

		if (TrangThai != null) {
			setTrangThai(TrangThai);
		}
	}

	/**
	* Returns the primary key of this phieu muon.
	*
	* @return the primary key of this phieu muon
	*/
	@Override
	public long getPrimaryKey() {
		return _phieuMuon.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieu muon.
	*
	* @param primaryKey the primary key of this phieu muon
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieuMuon.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieu muon.
	*
	* @return the ID of this phieu muon
	*/
	@Override
	public long getId() {
		return _phieuMuon.getId();
	}

	/**
	* Sets the ID of this phieu muon.
	*
	* @param Id the ID of this phieu muon
	*/
	@Override
	public void setId(long Id) {
		_phieuMuon.setId(Id);
	}

	/**
	* Returns the user ID of this phieu muon.
	*
	* @return the user ID of this phieu muon
	*/
	@Override
	public java.lang.String getUserId() {
		return _phieuMuon.getUserId();
	}

	/**
	* Sets the user ID of this phieu muon.
	*
	* @param UserId the user ID of this phieu muon
	*/
	@Override
	public void setUserId(java.lang.String UserId) {
		_phieuMuon.setUserId(UserId);
	}

	/**
	* Returns the sach ID of this phieu muon.
	*
	* @return the sach ID of this phieu muon
	*/
	@Override
	public long getSachId() {
		return _phieuMuon.getSachId();
	}

	/**
	* Sets the sach ID of this phieu muon.
	*
	* @param SachId the sach ID of this phieu muon
	*/
	@Override
	public void setSachId(long SachId) {
		_phieuMuon.setSachId(SachId);
	}

	/**
	* Returns the ngay muon of this phieu muon.
	*
	* @return the ngay muon of this phieu muon
	*/
	@Override
	public java.util.Date getNgayMuon() {
		return _phieuMuon.getNgayMuon();
	}

	/**
	* Sets the ngay muon of this phieu muon.
	*
	* @param NgayMuon the ngay muon of this phieu muon
	*/
	@Override
	public void setNgayMuon(java.util.Date NgayMuon) {
		_phieuMuon.setNgayMuon(NgayMuon);
	}

	/**
	* Returns the ngay tra of this phieu muon.
	*
	* @return the ngay tra of this phieu muon
	*/
	@Override
	public java.util.Date getNgayTra() {
		return _phieuMuon.getNgayTra();
	}

	/**
	* Sets the ngay tra of this phieu muon.
	*
	* @param NgayTra the ngay tra of this phieu muon
	*/
	@Override
	public void setNgayTra(java.util.Date NgayTra) {
		_phieuMuon.setNgayTra(NgayTra);
	}

	/**
	* Returns the so luong of this phieu muon.
	*
	* @return the so luong of this phieu muon
	*/
	@Override
	public long getSoLuong() {
		return _phieuMuon.getSoLuong();
	}

	/**
	* Sets the so luong of this phieu muon.
	*
	* @param SoLuong the so luong of this phieu muon
	*/
	@Override
	public void setSoLuong(long SoLuong) {
		_phieuMuon.setSoLuong(SoLuong);
	}

	/**
	* Returns the xac nhan of this phieu muon.
	*
	* @return the xac nhan of this phieu muon
	*/
	@Override
	public java.lang.String getXacNhan() {
		return _phieuMuon.getXacNhan();
	}

	/**
	* Sets the xac nhan of this phieu muon.
	*
	* @param XacNhan the xac nhan of this phieu muon
	*/
	@Override
	public void setXacNhan(java.lang.String XacNhan) {
		_phieuMuon.setXacNhan(XacNhan);
	}

	/**
	* Returns the trang thai of this phieu muon.
	*
	* @return the trang thai of this phieu muon
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _phieuMuon.getTrangThai();
	}

	/**
	* Sets the trang thai of this phieu muon.
	*
	* @param TrangThai the trang thai of this phieu muon
	*/
	@Override
	public void setTrangThai(java.lang.String TrangThai) {
		_phieuMuon.setTrangThai(TrangThai);
	}

	@Override
	public boolean isNew() {
		return _phieuMuon.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieuMuon.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieuMuon.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieuMuon.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieuMuon.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieuMuon.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieuMuon.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieuMuon.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieuMuon.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieuMuon.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieuMuon.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhieuMuonWrapper((PhieuMuon)_phieuMuon.clone());
	}

	@Override
	public int compareTo(thuvien.porlet.model.PhieuMuon phieuMuon) {
		return _phieuMuon.compareTo(phieuMuon);
	}

	@Override
	public int hashCode() {
		return _phieuMuon.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<thuvien.porlet.model.PhieuMuon> toCacheModel() {
		return _phieuMuon.toCacheModel();
	}

	@Override
	public thuvien.porlet.model.PhieuMuon toEscapedModel() {
		return new PhieuMuonWrapper(_phieuMuon.toEscapedModel());
	}

	@Override
	public thuvien.porlet.model.PhieuMuon toUnescapedModel() {
		return new PhieuMuonWrapper(_phieuMuon.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieuMuon.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieuMuon.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieuMuon.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhieuMuonWrapper)) {
			return false;
		}

		PhieuMuonWrapper phieuMuonWrapper = (PhieuMuonWrapper)obj;

		if (Validator.equals(_phieuMuon, phieuMuonWrapper._phieuMuon)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PhieuMuon getWrappedPhieuMuon() {
		return _phieuMuon;
	}

	@Override
	public PhieuMuon getWrappedModel() {
		return _phieuMuon;
	}

	@Override
	public void resetOriginalValues() {
		_phieuMuon.resetOriginalValues();
	}

	private PhieuMuon _phieuMuon;
}