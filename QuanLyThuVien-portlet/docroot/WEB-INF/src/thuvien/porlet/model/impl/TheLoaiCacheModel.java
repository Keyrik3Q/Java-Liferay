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

import thuvien.porlet.model.TheLoai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TheLoai in entity cache.
 *
 * @author HungThai
 * @see TheLoai
 * @generated
 */
public class TheLoaiCacheModel implements CacheModel<TheLoai>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", TenTheLoai=");
		sb.append(TenTheLoai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TheLoai toEntityModel() {
		TheLoaiImpl theLoaiImpl = new TheLoaiImpl();

		theLoaiImpl.setId(Id);

		if (TenTheLoai == null) {
			theLoaiImpl.setTenTheLoai(StringPool.BLANK);
		}
		else {
			theLoaiImpl.setTenTheLoai(TenTheLoai);
		}

		theLoaiImpl.resetOriginalValues();

		return theLoaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		TenTheLoai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (TenTheLoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTheLoai);
		}
	}

	public long Id;
	public String TenTheLoai;
}