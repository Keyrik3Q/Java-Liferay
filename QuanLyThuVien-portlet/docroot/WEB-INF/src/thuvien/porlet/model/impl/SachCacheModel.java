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

import thuvien.porlet.model.Sach;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sach in entity cache.
 *
 * @author HungThai
 * @see Sach
 * @generated
 */
public class SachCacheModel implements CacheModel<Sach>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", TenSach=");
		sb.append(TenSach);
		sb.append(", TheLoaiId=");
		sb.append(TheLoaiId);
		sb.append(", SoLuong=");
		sb.append(SoLuong);
		sb.append(", TrangThai=");
		sb.append(TrangThai);
		sb.append(", NhaXB=");
		sb.append(NhaXB);
		sb.append(", MaSach=");
		sb.append(MaSach);
		sb.append(", Ke=");
		sb.append(Ke);
		sb.append(", Tang=");
		sb.append(Tang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sach toEntityModel() {
		SachImpl sachImpl = new SachImpl();

		sachImpl.setId(Id);

		if (TenSach == null) {
			sachImpl.setTenSach(StringPool.BLANK);
		}
		else {
			sachImpl.setTenSach(TenSach);
		}

		sachImpl.setTheLoaiId(TheLoaiId);
		sachImpl.setSoLuong(SoLuong);

		if (TrangThai == null) {
			sachImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			sachImpl.setTrangThai(TrangThai);
		}

		if (NhaXB == null) {
			sachImpl.setNhaXB(StringPool.BLANK);
		}
		else {
			sachImpl.setNhaXB(NhaXB);
		}

		if (MaSach == null) {
			sachImpl.setMaSach(StringPool.BLANK);
		}
		else {
			sachImpl.setMaSach(MaSach);
		}

		if (Ke == null) {
			sachImpl.setKe(StringPool.BLANK);
		}
		else {
			sachImpl.setKe(Ke);
		}

		if (Tang == null) {
			sachImpl.setTang(StringPool.BLANK);
		}
		else {
			sachImpl.setTang(Tang);
		}

		sachImpl.resetOriginalValues();

		return sachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		TenSach = objectInput.readUTF();
		TheLoaiId = objectInput.readLong();
		SoLuong = objectInput.readLong();
		TrangThai = objectInput.readUTF();
		NhaXB = objectInput.readUTF();
		MaSach = objectInput.readUTF();
		Ke = objectInput.readUTF();
		Tang = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (TenSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenSach);
		}

		objectOutput.writeLong(TheLoaiId);
		objectOutput.writeLong(SoLuong);

		if (TrangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TrangThai);
		}

		if (NhaXB == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NhaXB);
		}

		if (MaSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaSach);
		}

		if (Ke == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Ke);
		}

		if (Tang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Tang);
		}
	}

	public long Id;
	public String TenSach;
	public long TheLoaiId;
	public long SoLuong;
	public String TrangThai;
	public String NhaXB;
	public String MaSach;
	public String Ke;
	public String Tang;
}