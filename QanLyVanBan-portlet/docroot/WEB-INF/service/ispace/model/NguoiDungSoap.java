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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.NguoiDungServiceSoap}.
 *
 * @author hungt
 * @see ispace.service.http.NguoiDungServiceSoap
 * @generated
 */
public class NguoiDungSoap implements Serializable {
	public static NguoiDungSoap toSoapModel(NguoiDung model) {
		NguoiDungSoap soapModel = new NguoiDungSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());
		soapModel.setNguoiKy(model.getNguoiKy());

		return soapModel;
	}

	public static NguoiDungSoap[] toSoapModels(NguoiDung[] models) {
		NguoiDungSoap[] soapModels = new NguoiDungSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NguoiDungSoap[][] toSoapModels(NguoiDung[][] models) {
		NguoiDungSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NguoiDungSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NguoiDungSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NguoiDungSoap[] toSoapModels(List<NguoiDung> models) {
		List<NguoiDungSoap> soapModels = new ArrayList<NguoiDungSoap>(models.size());

		for (NguoiDung model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NguoiDungSoap[soapModels.size()]);
	}

	public NguoiDungSoap() {
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

	public String getTen() {
		return _Ten;
	}

	public void setTen(String Ten) {
		_Ten = Ten;
	}

	public String getNguoiKy() {
		return _NguoiKy;
	}

	public void setNguoiKy(String NguoiKy) {
		_NguoiKy = NguoiKy;
	}

	private long _Id;
	private String _Ten;
	private String _NguoiKy;
}