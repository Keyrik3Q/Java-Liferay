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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link thuvien.porlet.service.http.SachServiceSoap}.
 *
 * @author HungThai
 * @see thuvien.porlet.service.http.SachServiceSoap
 * @generated
 */
public class SachSoap implements Serializable {
	public static SachSoap toSoapModel(Sach model) {
		SachSoap soapModel = new SachSoap();

		soapModel.setId(model.getId());
		soapModel.setTenSach(model.getTenSach());
		soapModel.setTheLoaiId(model.getTheLoaiId());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNhaXB(model.getNhaXB());
		soapModel.setMaSach(model.getMaSach());
		soapModel.setKe(model.getKe());
		soapModel.setTang(model.getTang());

		return soapModel;
	}

	public static SachSoap[] toSoapModels(Sach[] models) {
		SachSoap[] soapModels = new SachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[][] toSoapModels(Sach[][] models) {
		SachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[] toSoapModels(List<Sach> models) {
		List<SachSoap> soapModels = new ArrayList<SachSoap>(models.size());

		for (Sach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SachSoap[soapModels.size()]);
	}

	public SachSoap() {
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

	public String getTenSach() {
		return _TenSach;
	}

	public void setTenSach(String TenSach) {
		_TenSach = TenSach;
	}

	public long getTheLoaiId() {
		return _TheLoaiId;
	}

	public void setTheLoaiId(long TheLoaiId) {
		_TheLoaiId = TheLoaiId;
	}

	public long getSoLuong() {
		return _SoLuong;
	}

	public void setSoLuong(long SoLuong) {
		_SoLuong = SoLuong;
	}

	public String getTrangThai() {
		return _TrangThai;
	}

	public void setTrangThai(String TrangThai) {
		_TrangThai = TrangThai;
	}

	public String getNhaXB() {
		return _NhaXB;
	}

	public void setNhaXB(String NhaXB) {
		_NhaXB = NhaXB;
	}

	public String getMaSach() {
		return _MaSach;
	}

	public void setMaSach(String MaSach) {
		_MaSach = MaSach;
	}

	public String getKe() {
		return _Ke;
	}

	public void setKe(String Ke) {
		_Ke = Ke;
	}

	public String getTang() {
		return _Tang;
	}

	public void setTang(String Tang) {
		_Tang = Tang;
	}

	private long _Id;
	private String _TenSach;
	private long _TheLoaiId;
	private long _SoLuong;
	private String _TrangThai;
	private String _NhaXB;
	private String _MaSach;
	private String _Ke;
	private String _Tang;
}