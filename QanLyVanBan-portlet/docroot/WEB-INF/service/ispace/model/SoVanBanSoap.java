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
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.SoVanBanServiceSoap}.
 *
 * @author hungt
 * @see ispace.service.http.SoVanBanServiceSoap
 * @generated
 */
public class SoVanBanSoap implements Serializable {
	public static SoVanBanSoap toSoapModel(SoVanBan model) {
		SoVanBanSoap soapModel = new SoVanBanSoap();

		soapModel.setId(model.getId());
		soapModel.setTen(model.getTen());

		return soapModel;
	}

	public static SoVanBanSoap[] toSoapModels(SoVanBan[] models) {
		SoVanBanSoap[] soapModels = new SoVanBanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SoVanBanSoap[][] toSoapModels(SoVanBan[][] models) {
		SoVanBanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SoVanBanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SoVanBanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SoVanBanSoap[] toSoapModels(List<SoVanBan> models) {
		List<SoVanBanSoap> soapModels = new ArrayList<SoVanBanSoap>(models.size());

		for (SoVanBan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SoVanBanSoap[soapModels.size()]);
	}

	public SoVanBanSoap() {
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