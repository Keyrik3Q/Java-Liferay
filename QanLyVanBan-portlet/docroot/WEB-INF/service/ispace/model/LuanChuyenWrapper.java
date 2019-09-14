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
 * This class is a wrapper for {@link LuanChuyen}.
 * </p>
 *
 * @author hungt
 * @see LuanChuyen
 * @generated
 */
public class LuanChuyenWrapper implements LuanChuyen, ModelWrapper<LuanChuyen> {
	public LuanChuyenWrapper(LuanChuyen luanChuyen) {
		_luanChuyen = luanChuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return LuanChuyen.class;
	}

	@Override
	public String getModelClassName() {
		return LuanChuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("KieuVanBan", getKieuVanBan());
		attributes.put("IdVanBan", getIdVanBan());
		attributes.put("NgayGui", getNgayGui());
		attributes.put("NgayNhan", getNgayNhan());
		attributes.put("NguoiGui", getNguoiGui());
		attributes.put("NguoiNhan", getNguoiNhan());
		attributes.put("YKien", getYKien());
		attributes.put("HanXuLi", getHanXuLi());
		attributes.put("YKienPhanHoi", getYKienPhanHoi());
		attributes.put("NgayPhanHoi", getNgayPhanHoi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String KieuVanBan = (String)attributes.get("KieuVanBan");

		if (KieuVanBan != null) {
			setKieuVanBan(KieuVanBan);
		}

		Long IdVanBan = (Long)attributes.get("IdVanBan");

		if (IdVanBan != null) {
			setIdVanBan(IdVanBan);
		}

		Date NgayGui = (Date)attributes.get("NgayGui");

		if (NgayGui != null) {
			setNgayGui(NgayGui);
		}

		Date NgayNhan = (Date)attributes.get("NgayNhan");

		if (NgayNhan != null) {
			setNgayNhan(NgayNhan);
		}

		String NguoiGui = (String)attributes.get("NguoiGui");

		if (NguoiGui != null) {
			setNguoiGui(NguoiGui);
		}

		String NguoiNhan = (String)attributes.get("NguoiNhan");

		if (NguoiNhan != null) {
			setNguoiNhan(NguoiNhan);
		}

		String YKien = (String)attributes.get("YKien");

		if (YKien != null) {
			setYKien(YKien);
		}

		Date HanXuLi = (Date)attributes.get("HanXuLi");

		if (HanXuLi != null) {
			setHanXuLi(HanXuLi);
		}

		String YKienPhanHoi = (String)attributes.get("YKienPhanHoi");

		if (YKienPhanHoi != null) {
			setYKienPhanHoi(YKienPhanHoi);
		}

		Date NgayPhanHoi = (Date)attributes.get("NgayPhanHoi");

		if (NgayPhanHoi != null) {
			setNgayPhanHoi(NgayPhanHoi);
		}
	}

	/**
	* Returns the primary key of this luan chuyen.
	*
	* @return the primary key of this luan chuyen
	*/
	@Override
	public long getPrimaryKey() {
		return _luanChuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this luan chuyen.
	*
	* @param primaryKey the primary key of this luan chuyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_luanChuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this luan chuyen.
	*
	* @return the ID of this luan chuyen
	*/
	@Override
	public long getId() {
		return _luanChuyen.getId();
	}

	/**
	* Sets the ID of this luan chuyen.
	*
	* @param Id the ID of this luan chuyen
	*/
	@Override
	public void setId(long Id) {
		_luanChuyen.setId(Id);
	}

	/**
	* Returns the kieu van ban of this luan chuyen.
	*
	* @return the kieu van ban of this luan chuyen
	*/
	@Override
	public java.lang.String getKieuVanBan() {
		return _luanChuyen.getKieuVanBan();
	}

	/**
	* Sets the kieu van ban of this luan chuyen.
	*
	* @param KieuVanBan the kieu van ban of this luan chuyen
	*/
	@Override
	public void setKieuVanBan(java.lang.String KieuVanBan) {
		_luanChuyen.setKieuVanBan(KieuVanBan);
	}

	/**
	* Returns the id van ban of this luan chuyen.
	*
	* @return the id van ban of this luan chuyen
	*/
	@Override
	public long getIdVanBan() {
		return _luanChuyen.getIdVanBan();
	}

	/**
	* Sets the id van ban of this luan chuyen.
	*
	* @param IdVanBan the id van ban of this luan chuyen
	*/
	@Override
	public void setIdVanBan(long IdVanBan) {
		_luanChuyen.setIdVanBan(IdVanBan);
	}

	/**
	* Returns the ngay gui of this luan chuyen.
	*
	* @return the ngay gui of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayGui() {
		return _luanChuyen.getNgayGui();
	}

	/**
	* Sets the ngay gui of this luan chuyen.
	*
	* @param NgayGui the ngay gui of this luan chuyen
	*/
	@Override
	public void setNgayGui(java.util.Date NgayGui) {
		_luanChuyen.setNgayGui(NgayGui);
	}

	/**
	* Returns the ngay nhan of this luan chuyen.
	*
	* @return the ngay nhan of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayNhan() {
		return _luanChuyen.getNgayNhan();
	}

	/**
	* Sets the ngay nhan of this luan chuyen.
	*
	* @param NgayNhan the ngay nhan of this luan chuyen
	*/
	@Override
	public void setNgayNhan(java.util.Date NgayNhan) {
		_luanChuyen.setNgayNhan(NgayNhan);
	}

	/**
	* Returns the nguoi gui of this luan chuyen.
	*
	* @return the nguoi gui of this luan chuyen
	*/
	@Override
	public java.lang.String getNguoiGui() {
		return _luanChuyen.getNguoiGui();
	}

	/**
	* Sets the nguoi gui of this luan chuyen.
	*
	* @param NguoiGui the nguoi gui of this luan chuyen
	*/
	@Override
	public void setNguoiGui(java.lang.String NguoiGui) {
		_luanChuyen.setNguoiGui(NguoiGui);
	}

	/**
	* Returns the nguoi nhan of this luan chuyen.
	*
	* @return the nguoi nhan of this luan chuyen
	*/
	@Override
	public java.lang.String getNguoiNhan() {
		return _luanChuyen.getNguoiNhan();
	}

	/**
	* Sets the nguoi nhan of this luan chuyen.
	*
	* @param NguoiNhan the nguoi nhan of this luan chuyen
	*/
	@Override
	public void setNguoiNhan(java.lang.String NguoiNhan) {
		_luanChuyen.setNguoiNhan(NguoiNhan);
	}

	/**
	* Returns the y kien of this luan chuyen.
	*
	* @return the y kien of this luan chuyen
	*/
	@Override
	public java.lang.String getYKien() {
		return _luanChuyen.getYKien();
	}

	/**
	* Sets the y kien of this luan chuyen.
	*
	* @param YKien the y kien of this luan chuyen
	*/
	@Override
	public void setYKien(java.lang.String YKien) {
		_luanChuyen.setYKien(YKien);
	}

	/**
	* Returns the han xu li of this luan chuyen.
	*
	* @return the han xu li of this luan chuyen
	*/
	@Override
	public java.util.Date getHanXuLi() {
		return _luanChuyen.getHanXuLi();
	}

	/**
	* Sets the han xu li of this luan chuyen.
	*
	* @param HanXuLi the han xu li of this luan chuyen
	*/
	@Override
	public void setHanXuLi(java.util.Date HanXuLi) {
		_luanChuyen.setHanXuLi(HanXuLi);
	}

	/**
	* Returns the y kien phan hoi of this luan chuyen.
	*
	* @return the y kien phan hoi of this luan chuyen
	*/
	@Override
	public java.lang.String getYKienPhanHoi() {
		return _luanChuyen.getYKienPhanHoi();
	}

	/**
	* Sets the y kien phan hoi of this luan chuyen.
	*
	* @param YKienPhanHoi the y kien phan hoi of this luan chuyen
	*/
	@Override
	public void setYKienPhanHoi(java.lang.String YKienPhanHoi) {
		_luanChuyen.setYKienPhanHoi(YKienPhanHoi);
	}

	/**
	* Returns the ngay phan hoi of this luan chuyen.
	*
	* @return the ngay phan hoi of this luan chuyen
	*/
	@Override
	public java.util.Date getNgayPhanHoi() {
		return _luanChuyen.getNgayPhanHoi();
	}

	/**
	* Sets the ngay phan hoi of this luan chuyen.
	*
	* @param NgayPhanHoi the ngay phan hoi of this luan chuyen
	*/
	@Override
	public void setNgayPhanHoi(java.util.Date NgayPhanHoi) {
		_luanChuyen.setNgayPhanHoi(NgayPhanHoi);
	}

	@Override
	public boolean isNew() {
		return _luanChuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_luanChuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _luanChuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_luanChuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _luanChuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _luanChuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_luanChuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _luanChuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_luanChuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_luanChuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_luanChuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LuanChuyenWrapper((LuanChuyen)_luanChuyen.clone());
	}

	@Override
	public int compareTo(ispace.model.LuanChuyen luanChuyen) {
		return _luanChuyen.compareTo(luanChuyen);
	}

	@Override
	public int hashCode() {
		return _luanChuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ispace.model.LuanChuyen> toCacheModel() {
		return _luanChuyen.toCacheModel();
	}

	@Override
	public ispace.model.LuanChuyen toEscapedModel() {
		return new LuanChuyenWrapper(_luanChuyen.toEscapedModel());
	}

	@Override
	public ispace.model.LuanChuyen toUnescapedModel() {
		return new LuanChuyenWrapper(_luanChuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _luanChuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _luanChuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_luanChuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LuanChuyenWrapper)) {
			return false;
		}

		LuanChuyenWrapper luanChuyenWrapper = (LuanChuyenWrapper)obj;

		if (Validator.equals(_luanChuyen, luanChuyenWrapper._luanChuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LuanChuyen getWrappedLuanChuyen() {
		return _luanChuyen;
	}

	@Override
	public LuanChuyen getWrappedModel() {
		return _luanChuyen;
	}

	@Override
	public void resetOriginalValues() {
		_luanChuyen.resetOriginalValues();
	}

	private LuanChuyen _luanChuyen;
}