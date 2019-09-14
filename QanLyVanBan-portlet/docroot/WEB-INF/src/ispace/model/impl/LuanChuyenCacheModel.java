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

package ispace.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ispace.model.LuanChuyen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LuanChuyen in entity cache.
 *
 * @author hungt
 * @see LuanChuyen
 * @generated
 */
public class LuanChuyenCacheModel implements CacheModel<LuanChuyen>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", KieuVanBan=");
		sb.append(KieuVanBan);
		sb.append(", IdVanBan=");
		sb.append(IdVanBan);
		sb.append(", NgayGui=");
		sb.append(NgayGui);
		sb.append(", NgayNhan=");
		sb.append(NgayNhan);
		sb.append(", NguoiGui=");
		sb.append(NguoiGui);
		sb.append(", NguoiNhan=");
		sb.append(NguoiNhan);
		sb.append(", YKien=");
		sb.append(YKien);
		sb.append(", HanXuLi=");
		sb.append(HanXuLi);
		sb.append(", YKienPhanHoi=");
		sb.append(YKienPhanHoi);
		sb.append(", NgayPhanHoi=");
		sb.append(NgayPhanHoi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LuanChuyen toEntityModel() {
		LuanChuyenImpl luanChuyenImpl = new LuanChuyenImpl();

		luanChuyenImpl.setId(Id);

		if (KieuVanBan == null) {
			luanChuyenImpl.setKieuVanBan(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setKieuVanBan(KieuVanBan);
		}

		luanChuyenImpl.setIdVanBan(IdVanBan);

		if (NgayGui == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayGui(null);
		}
		else {
			luanChuyenImpl.setNgayGui(new Date(NgayGui));
		}

		if (NgayNhan == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayNhan(null);
		}
		else {
			luanChuyenImpl.setNgayNhan(new Date(NgayNhan));
		}

		if (NguoiGui == null) {
			luanChuyenImpl.setNguoiGui(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setNguoiGui(NguoiGui);
		}

		if (NguoiNhan == null) {
			luanChuyenImpl.setNguoiNhan(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setNguoiNhan(NguoiNhan);
		}

		if (YKien == null) {
			luanChuyenImpl.setYKien(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setYKien(YKien);
		}

		if (HanXuLi == Long.MIN_VALUE) {
			luanChuyenImpl.setHanXuLi(null);
		}
		else {
			luanChuyenImpl.setHanXuLi(new Date(HanXuLi));
		}

		if (YKienPhanHoi == null) {
			luanChuyenImpl.setYKienPhanHoi(StringPool.BLANK);
		}
		else {
			luanChuyenImpl.setYKienPhanHoi(YKienPhanHoi);
		}

		if (NgayPhanHoi == Long.MIN_VALUE) {
			luanChuyenImpl.setNgayPhanHoi(null);
		}
		else {
			luanChuyenImpl.setNgayPhanHoi(new Date(NgayPhanHoi));
		}

		luanChuyenImpl.resetOriginalValues();

		return luanChuyenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		KieuVanBan = objectInput.readUTF();
		IdVanBan = objectInput.readLong();
		NgayGui = objectInput.readLong();
		NgayNhan = objectInput.readLong();
		NguoiGui = objectInput.readUTF();
		NguoiNhan = objectInput.readUTF();
		YKien = objectInput.readUTF();
		HanXuLi = objectInput.readLong();
		YKienPhanHoi = objectInput.readUTF();
		NgayPhanHoi = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (KieuVanBan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(KieuVanBan);
		}

		objectOutput.writeLong(IdVanBan);
		objectOutput.writeLong(NgayGui);
		objectOutput.writeLong(NgayNhan);

		if (NguoiGui == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiGui);
		}

		if (NguoiNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiNhan);
		}

		if (YKien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(YKien);
		}

		objectOutput.writeLong(HanXuLi);

		if (YKienPhanHoi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(YKienPhanHoi);
		}

		objectOutput.writeLong(NgayPhanHoi);
	}

	public long Id;
	public String KieuVanBan;
	public long IdVanBan;
	public long NgayGui;
	public long NgayNhan;
	public String NguoiGui;
	public String NguoiNhan;
	public String YKien;
	public long HanXuLi;
	public String YKienPhanHoi;
	public long NgayPhanHoi;
}