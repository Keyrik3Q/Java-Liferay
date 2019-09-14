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
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.VanBanDiServiceSoap}.
 *
 * @author hungt
 * @see ispace.service.http.VanBanDiServiceSoap
 * @generated
 */
public class VanBanDiSoap implements Serializable {
	public static VanBanDiSoap toSoapModel(VanBanDi model) {
		VanBanDiSoap soapModel = new VanBanDiSoap();

		soapModel.setId(model.getId());
		soapModel.setSoKiHieu(model.getSoKiHieu());
		soapModel.setLoaiVanBan(model.getLoaiVanBan());
		soapModel.setSoVanBan(model.getSoVanBan());
		soapModel.setNguoiKy(model.getNguoiKy());
		soapModel.setNgayKy(model.getNgayKy());

		return soapModel;
	}

	public static VanBanDiSoap[] toSoapModels(VanBanDi[] models) {
		VanBanDiSoap[] soapModels = new VanBanDiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VanBanDiSoap[][] toSoapModels(VanBanDi[][] models) {
		VanBanDiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VanBanDiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VanBanDiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VanBanDiSoap[] toSoapModels(List<VanBanDi> models) {
		List<VanBanDiSoap> soapModels = new ArrayList<VanBanDiSoap>(models.size());

		for (VanBanDi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VanBanDiSoap[soapModels.size()]);
	}

	public VanBanDiSoap() {
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

	public String getSoKiHieu() {
		return _SoKiHieu;
	}

	public void setSoKiHieu(String SoKiHieu) {
		_SoKiHieu = SoKiHieu;
	}

	public String getLoaiVanBan() {
		return _LoaiVanBan;
	}

	public void setLoaiVanBan(String LoaiVanBan) {
		_LoaiVanBan = LoaiVanBan;
	}

	public String getSoVanBan() {
		return _SoVanBan;
	}

	public void setSoVanBan(String SoVanBan) {
		_SoVanBan = SoVanBan;
	}

	public String getNguoiKy() {
		return _NguoiKy;
	}

	public void setNguoiKy(String NguoiKy) {
		_NguoiKy = NguoiKy;
	}

	public Date getNgayKy() {
		return _NgayKy;
	}

	public void setNgayKy(Date NgayKy) {
		_NgayKy = NgayKy;
	}

	private long _Id;
	private String _SoKiHieu;
	private String _LoaiVanBan;
	private String _SoVanBan;
	private String _NguoiKy;
	private Date _NgayKy;
}