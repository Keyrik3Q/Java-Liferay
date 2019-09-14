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

package thuvien.porlet.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import thuvien.porlet.model.PhieuMuon;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PhieuMuon in entity cache.
 *
 * @author HungThai
 * @see PhieuMuon
 * @generated
 */
public class PhieuMuonCacheModel implements CacheModel<PhieuMuon>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", UserId=");
		sb.append(UserId);
		sb.append(", SachId=");
		sb.append(SachId);
		sb.append(", NgayMuon=");
		sb.append(NgayMuon);
		sb.append(", NgayTra=");
		sb.append(NgayTra);
		sb.append(", SoLuong=");
		sb.append(SoLuong);
		sb.append(", XacNhan=");
		sb.append(XacNhan);
		sb.append(", TrangThai=");
		sb.append(TrangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PhieuMuon toEntityModel() {
		PhieuMuonImpl phieuMuonImpl = new PhieuMuonImpl();

		phieuMuonImpl.setId(Id);

		if (UserId == null) {
			phieuMuonImpl.setUserId(StringPool.BLANK);
		}
		else {
			phieuMuonImpl.setUserId(UserId);
		}

		phieuMuonImpl.setSachId(SachId);

		if (NgayMuon == Long.MIN_VALUE) {
			phieuMuonImpl.setNgayMuon(null);
		}
		else {
			phieuMuonImpl.setNgayMuon(new Date(NgayMuon));
		}

		if (NgayTra == Long.MIN_VALUE) {
			phieuMuonImpl.setNgayTra(null);
		}
		else {
			phieuMuonImpl.setNgayTra(new Date(NgayTra));
		}

		phieuMuonImpl.setSoLuong(SoLuong);

		if (XacNhan == null) {
			phieuMuonImpl.setXacNhan(StringPool.BLANK);
		}
		else {
			phieuMuonImpl.setXacNhan(XacNhan);
		}

		if (TrangThai == null) {
			phieuMuonImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			phieuMuonImpl.setTrangThai(TrangThai);
		}

		phieuMuonImpl.resetOriginalValues();

		return phieuMuonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		UserId = objectInput.readUTF();
		SachId = objectInput.readLong();
		NgayMuon = objectInput.readLong();
		NgayTra = objectInput.readLong();
		SoLuong = objectInput.readLong();
		XacNhan = objectInput.readUTF();
		TrangThai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (UserId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UserId);
		}

		objectOutput.writeLong(SachId);
		objectOutput.writeLong(NgayMuon);
		objectOutput.writeLong(NgayTra);
		objectOutput.writeLong(SoLuong);

		if (XacNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XacNhan);
		}

		if (TrangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TrangThai);
		}
	}

	public long Id;
	public String UserId;
	public long SachId;
	public long NgayMuon;
	public long NgayTra;
	public long SoLuong;
	public String XacNhan;
	public String TrangThai;
}