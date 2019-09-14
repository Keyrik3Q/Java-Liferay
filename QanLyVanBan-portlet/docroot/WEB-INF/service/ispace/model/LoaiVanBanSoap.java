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
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.LoaiVanBanServiceSoap}.
 *
 * @author hungt
 * @see ispace.service.http.LoaiVanBanServiceSoap
 * @generated
 */
public class LoaiVanBanSoap implements Serializable {
	public static LoaiVanBanSoap toSoapModel(LoaiVanBan model) {
		LoaiVanBanSoap soapModel = new LoaiVanBanSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static LoaiVanBanSoap[] toSoapModels(LoaiVanBan[] models) {
		LoaiVanBanSoap[] soapModels = new LoaiVanBanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiVanBanSoap[][] toSoapModels(LoaiVanBan[][] models) {
		LoaiVanBanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiVanBanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiVanBanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiVanBanSoap[] toSoapModels(List<LoaiVanBan> models) {
		List<LoaiVanBanSoap> soapModels = new ArrayList<LoaiVanBanSoap>(models.size());

		for (LoaiVanBan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiVanBanSoap[soapModels.size()]);
	}

	public LoaiVanBanSoap() {
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

	private long _Id;
	private String _Ten;
}