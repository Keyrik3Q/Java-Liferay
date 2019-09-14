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
 * This class is used by SOAP remote services, specifically {@link thuvien.porlet.service.http.TheLoaiServiceSoap}.
 *
 * @author HungThai
 * @see thuvien.porlet.service.http.TheLoaiServiceSoap
 * @generated
 */
public class TheLoaiSoap implements Serializable {
	public static TheLoaiSoap toSoapModel(TheLoai model) {
		TheLoaiSoap soapModel = new TheLoaiSoap();

		soapModel.setId(model.getId());
		soapModel.setTenTheLoai(model.getTenTheLoai());

		return soapModel;
	}

	public static TheLoaiSoap[] toSoapModels(TheLoai[] models) {
		TheLoaiSoap[] soapModels = new TheLoaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TheLoaiSoap[][] toSoapModels(TheLoai[][] models) {
		TheLoaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TheLoaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TheLoaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TheLoaiSoap[] toSoapModels(List<TheLoai> models) {
		List<TheLoaiSoap> soapModels = new ArrayList<TheLoaiSoap>(models.size());

		for (TheLoai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TheLoaiSoap[soapModels.size()]);
	}

	public TheLoaiSoap() {
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

	public String getTenTheLoai() {
		return _TenTheLoai;
	}

	public void setTenTheLoai(String TenTheLoai) {
		_TenTheLoai = TenTheLoai;
	}

	private long _Id;
	private String _TenTheLoai;
}