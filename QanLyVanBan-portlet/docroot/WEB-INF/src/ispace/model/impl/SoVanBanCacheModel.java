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

import ispace.model.SoVanBan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SoVanBan in entity cache.
 *
 * @author hungt
 * @see SoVanBan
 * @generated
 */
public class SoVanBanCacheModel implements CacheModel<SoVanBan>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Ten=");
		sb.append(Ten);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SoVanBan toEntityModel() {
		SoVanBanImpl soVanBanImpl = new SoVanBanImpl();

		soVanBanImpl.setId(Id);

		if (Ten == null) {
			soVanBanImpl.setTen(StringPool.BLANK);
		}
		else {
			soVanBanImpl.setTen(Ten);
		}

		soVanBanImpl.resetOriginalValues();

		return soVanBanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Ten = objectInput.readUTF();
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
	}

	public long Id;
	public String Ten;
}