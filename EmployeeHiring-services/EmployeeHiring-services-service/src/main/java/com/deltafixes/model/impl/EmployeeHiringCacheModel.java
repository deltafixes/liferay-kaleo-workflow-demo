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

package com.deltafixes.model.impl;

import com.deltafixes.model.EmployeeHiring;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeHiring in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeHiringCacheModel
	implements CacheModel<EmployeeHiring>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeHiringCacheModel)) {
			return false;
		}

		EmployeeHiringCacheModel employeeHiringCacheModel =
			(EmployeeHiringCacheModel)object;

		if (employeeHiringId == employeeHiringCacheModel.employeeHiringId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeHiringId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeHiringId=");
		sb.append(employeeHiringId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", technology=");
		sb.append(technology);
		sb.append(", experience=");
		sb.append(experience);
		sb.append(", title=");
		sb.append(title);
		sb.append(", summary=");
		sb.append(summary);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmployeeHiring toEntityModel() {
		EmployeeHiringImpl employeeHiringImpl = new EmployeeHiringImpl();

		if (uuid == null) {
			employeeHiringImpl.setUuid("");
		}
		else {
			employeeHiringImpl.setUuid(uuid);
		}

		employeeHiringImpl.setEmployeeHiringId(employeeHiringId);
		employeeHiringImpl.setGroupId(groupId);
		employeeHiringImpl.setCompanyId(companyId);
		employeeHiringImpl.setUserId(userId);

		if (userName == null) {
			employeeHiringImpl.setUserName("");
		}
		else {
			employeeHiringImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			employeeHiringImpl.setCreateDate(null);
		}
		else {
			employeeHiringImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeHiringImpl.setModifiedDate(null);
		}
		else {
			employeeHiringImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			employeeHiringImpl.setName("");
		}
		else {
			employeeHiringImpl.setName(name);
		}

		if (technology == null) {
			employeeHiringImpl.setTechnology("");
		}
		else {
			employeeHiringImpl.setTechnology(technology);
		}

		if (experience == null) {
			employeeHiringImpl.setExperience("");
		}
		else {
			employeeHiringImpl.setExperience(experience);
		}

		if (title == null) {
			employeeHiringImpl.setTitle("");
		}
		else {
			employeeHiringImpl.setTitle(title);
		}

		if (summary == null) {
			employeeHiringImpl.setSummary("");
		}
		else {
			employeeHiringImpl.setSummary(summary);
		}

		employeeHiringImpl.setStatus(status);
		employeeHiringImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			employeeHiringImpl.setStatusByUserName("");
		}
		else {
			employeeHiringImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			employeeHiringImpl.setStatusDate(null);
		}
		else {
			employeeHiringImpl.setStatusDate(new Date(statusDate));
		}

		employeeHiringImpl.resetOriginalValues();

		return employeeHiringImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeHiringId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		technology = objectInput.readUTF();
		experience = objectInput.readUTF();
		title = objectInput.readUTF();
		summary = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(employeeHiringId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (technology == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technology);
		}

		if (experience == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(experience);
		}

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (summary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(summary);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long employeeHiringId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String technology;
	public String experience;
	public String title;
	public String summary;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}