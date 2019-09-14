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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.LuanChuyenServiceSoap}.
 *
 * @author hungt
 * @see ispace.service.http.LuanChuyenServiceSoap
 * @generated
 */
public class LuanChuyenSoap implements Serializable {
	public static LuanChuyenSoap toSoapModel(LuanChuyen model) {
		LuanChuyenSoap soapModel = new LuanChuyenSoap();

		soapModel.setId(model.getId());
		soapModel.setKieuVanBan(model.getKieuVanBan());
		soapModel.setIdVanBan(model.getIdVanBan());
		soapModel.setNgayGui(model.getNgayGui());
		soapModel.setNgayNhan(model.getNgayNhan());
		soapModel.setNguoiGui(model.getNguoiGui());
		soapModel.setNguoiNhan(model.getNguoiNhan());
		soapModel.setYKien(model.getYKien());
		soapModel.setHanXuLi(model.getHanXuLi());
		soapModel.setYKienPhanHoi(model.getYKienPhanHoi());
		soapModel.setNgayPhanHoi(model.getNgayPhanHoi());

		return soapModel;
	}

	public static LuanChuyenSoap[] toSoapModels(LuanChuyen[] models) {
		LuanChuyenSoap[] soapModels = new LuanChuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LuanChuyenSoap[][] toSoapModels(LuanChuyen[][] models) {
		LuanChuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LuanChuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LuanChuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LuanChuyenSoap[] toSoapModels(List<LuanChuyen> models) {
		List<LuanChuyenSoap> soapModels = new ArrayList<LuanChuyenSoap>(models.size());

		for (LuanChuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LuanChuyenSoap[soapModels.size()]);
	}

	public LuanChuyenSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getKieuVanBan() {
		return _KieuVanBan;
	}

	public void setKieuVanBan(String KieuVanBan) {
		_KieuVanBan = KieuVanBan;
	}

	public long getIdVanBan() {
		return _IdVanBan;
	}

	public void setIdVanBan(long IdVanBan) {
		_IdVanBan = IdVanBan;
	}

	public Date getNgayGui() {
		return _NgayGui;
	}

	public void setNgayGui(Date NgayGui) {
		_NgayGui = NgayGui;
	}

	public Date getNgayNhan() {
		return _NgayNhan;
	}

	public void setNgayNhan(Date NgayNhan) {
		_NgayNhan = NgayNhan;
	}

	public String getNguoiGui() {
		return _NguoiGui;
	}

	public void setNguoiGui(String NguoiGui) {
		_NguoiGui = NguoiGui;
	}

	public String getNguoiNhan() {
		return _NguoiNhan;
	}

	public void setNguoiNhan(String NguoiNhan) {
		_NguoiNhan = NguoiNhan;
	}

	public String getYKien() {
		return _YKien;
	}

	public void setYKien(String YKien) {
		_YKien = YKien;
	}

	public Date getHanXuLi() {
		return _HanXuLi;
	}

	public void setHanXuLi(Date HanXuLi) {
		_HanXuLi = HanXuLi;
	}

	public String getYKienPhanHoi() {
		return _YKienPhanHoi;
	}

	public void setYKienPhanHoi(String YKienPhanHoi) {
		_YKienPhanHoi = YKienPhanHoi;
	}

	public Date getNgayPhanHoi() {
		return _NgayPhanHoi;
	}

	public void setNgayPhanHoi(Date NgayPhanHoi) {
		_NgayPhanHoi = NgayPhanHoi;
	}

	private long _Id;
	private String _KieuVanBan;
	private long _IdVanBan;
	private Date _NgayGui;
	private Date _NgayNhan;
	private String _NguoiGui;
	private String _NguoiNhan;
	private String _YKien;
	private Date _HanXuLi;
	private String _YKienPhanHoi;
	private Date _NgayPhanHoi;
}