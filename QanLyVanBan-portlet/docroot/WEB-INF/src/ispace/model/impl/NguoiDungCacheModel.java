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

import ispace.model.NguoiDung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NguoiDung in entity cache.
 *
 * @author hungt
 * @see NguoiDung
 * @generated
 */
public class NguoiDungCacheModel implements CacheModel<NguoiDung>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Ten=");
		sb.append(Ten);
		sb.append(", NguoiKy=");
		sb.append(NguoiKy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NguoiDung toEntityModel() {
		NguoiDungImpl nguoiDungImpl = new NguoiDungImpl();

		nguoiDungImpl.setId(Id);

		if (Ten == null) {
			nguoiDungImpl.setTen(StringPool.BLANK);
		}
		else {
			nguoiDungImpl.setTen(Ten);
		}

		if (NguoiKy == null) {
			nguoiDungImpl.setNguoiKy(StringPool.BLANK);
		}
		else {
			nguoiDungImpl.setNguoiKy(NguoiKy);
		}

		nguoiDungImpl.resetOriginalValues();

		return nguoiDungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Ten = objectInput.readUTF();
		NguoiKy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Ten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Ten);
		}

		if (NguoiKy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiKy);
		}
	}

	public long Id;
	public String Ten;
	public String NguoiKy;
}