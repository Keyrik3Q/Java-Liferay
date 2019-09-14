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

import ispace.model.VanBanDi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VanBanDi in entity cache.
 *
 * @author hungt
 * @see VanBanDi
 * @generated
 */
public class VanBanDiCacheModel implements CacheModel<VanBanDi>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", SoKiHieu=");
		sb.append(SoKiHieu);
		sb.append(", LoaiVanBan=");
		sb.append(LoaiVanBan);
		sb.append(", SoVanBan=");
		sb.append(SoVanBan);
		sb.append(", NguoiKy=");
		sb.append(NguoiKy);
		sb.append(", NgayKy=");
		sb.append(NgayKy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VanBanDi toEntityModel() {
		VanBanDiImpl vanBanDiImpl = new VanBanDiImpl();

		vanBanDiImpl.setId(Id);

		if (SoKiHieu == null) {
			vanBanDiImpl.setSoKiHieu(StringPool.BLANK);
		}
		else {
			vanBanDiImpl.setSoKiHieu(SoKiHieu);
		}

		if (LoaiVanBan == null) {
			vanBanDiImpl.setLoaiVanBan(StringPool.BLANK);
		}
		else {
			vanBanDiImpl.setLoaiVanBan(LoaiVanBan);
		}

		if (SoVanBan == null) {
			vanBanDiImpl.setSoVanBan(StringPool.BLANK);
		}
		else {
			vanBanDiImpl.setSoVanBan(SoVanBan);
		}

		if (NguoiKy == null) {
			vanBanDiImpl.setNguoiKy(StringPool.BLANK);
		}
		else {
			vanBanDiImpl.setNguoiKy(NguoiKy);
		}

		if (NgayKy == Long.MIN_VALUE) {
			vanBanDiImpl.setNgayKy(null);
		}
		else {
			vanBanDiImpl.setNgayKy(new Date(NgayKy));
		}

		vanBanDiImpl.resetOriginalValues();

		return vanBanDiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		SoKiHieu = objectInput.readUTF();
		LoaiVanBan = objectInput.readUTF();
		SoVanBan = objectInput.readUTF();
		NguoiKy = objectInput.readUTF();
		NgayKy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (SoKiHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoKiHieu);
		}

		if (LoaiVanBan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LoaiVanBan);
		}

		if (SoVanBan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoVanBan);
		}

		if (NguoiKy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiKy);
		}

		objectOutput.writeLong(NgayKy);
	}

	public long Id;
	public String SoKiHieu;
	public String LoaiVanBan;
	public String SoVanBan;
	public String NguoiKy;
	public long NgayKy;
}