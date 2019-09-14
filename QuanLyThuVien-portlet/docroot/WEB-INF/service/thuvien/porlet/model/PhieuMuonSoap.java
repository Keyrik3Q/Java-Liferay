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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link thuvien.porlet.service.http.PhieuMuonServiceSoap}.
 *
 * @author HungThai
 * @see thuvien.porlet.service.http.PhieuMuonServiceSoap
 * @generated
 */
public class PhieuMuonSoap implements Serializable {
	public static PhieuMuonSoap toSoapModel(PhieuMuon model) {
		PhieuMuonSoap soapModel = new PhieuMuonSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setSachId(model.getSachId());
		soapModel.setNgayMuon(model.getNgayMuon());
		soapModel.setNgayTra(model.getNgayTra());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setXacNhan(model.getXacNhan());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static PhieuMuonSoap[] toSoapModels(PhieuMuon[] models) {
		PhieuMuonSoap[] soapModels = new PhieuMuonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhieuMuonSoap[][] toSoapModels(PhieuMuon[][] models) {
		PhieuMuonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhieuMuonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhieuMuonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhieuMuonSoap[] toSoapModels(List<PhieuMuon> models) {
		List<PhieuMuonSoap> soapModels = new ArrayList<PhieuMuonSoap>(models.size());

		for (PhieuMuon model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhieuMuonSoap[soapModels.size()]);
	}

	public PhieuMuonSoap() {
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

	public String getUserId() {
		return _UserId;
	}

	public void setUserId(String UserId) {
		_UserId = UserId;
	}

	public long getSachId() {
		return _SachId;
	}

	public void setSachId(long SachId) {
		_SachId = SachId;
	}

	public Date getNgayMuon() {
		return _NgayMuon;
	}

	public void setNgayMuon(Date NgayMuon) {
		_NgayMuon = NgayMuon;
	}

	public Date getNgayTra() {
		return _NgayTra;
	}

	public void setNgayTra(Date NgayTra) {
		_NgayTra = NgayTra;
	}

	public long getSoLuong() {
		return _SoLuong;
	}

	public void setSoLuong(long SoLuong) {
		_SoLuong = SoLuong;
	}

	public String getXacNhan() {
		return _XacNhan;
	}

	public void setXacNhan(String XacNhan) {
		_XacNhan = XacNhan;
	}

	public String getTrangThai() {
		return _TrangThai;
	}

	public void setTrangThai(String TrangThai) {
		_TrangThai = TrangThai;
	}

	private long _Id;
	private String _UserId;
	private long _SachId;
	private Date _NgayMuon;
	private Date _NgayTra;
	private long _SoLuong;
	private String _XacNhan;
	private String _TrangThai;
}