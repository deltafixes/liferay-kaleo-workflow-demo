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

package com.deltafixes.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeHiring}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiring
 * @generated
 */
public class EmployeeHiringWrapper
	extends BaseModelWrapper<EmployeeHiring>
	implements EmployeeHiring, ModelWrapper<EmployeeHiring> {

	public EmployeeHiringWrapper(EmployeeHiring employeeHiring) {
		super(employeeHiring);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeHiringId", getEmployeeHiringId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("technology", getTechnology());
		attributes.put("experience", getExperience());
		attributes.put("title", getTitle());
		attributes.put("summary", getSummary());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long employeeHiringId = (Long)attributes.get("employeeHiringId");

		if (employeeHiringId != null) {
			setEmployeeHiringId(employeeHiringId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String technology = (String)attributes.get("technology");

		if (technology != null) {
			setTechnology(technology);
		}

		String experience = (String)attributes.get("experience");

		if (experience != null) {
			setExperience(experience);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the company ID of this employee hiring.
	 *
	 * @return the company ID of this employee hiring
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this employee hiring.
	 *
	 * @return the create date of this employee hiring
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the employee hiring ID of this employee hiring.
	 *
	 * @return the employee hiring ID of this employee hiring
	 */
	@Override
	public long getEmployeeHiringId() {
		return model.getEmployeeHiringId();
	}

	/**
	 * Returns the experience of this employee hiring.
	 *
	 * @return the experience of this employee hiring
	 */
	@Override
	public String getExperience() {
		return model.getExperience();
	}

	/**
	 * Returns the group ID of this employee hiring.
	 *
	 * @return the group ID of this employee hiring
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this employee hiring.
	 *
	 * @return the modified date of this employee hiring
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this employee hiring.
	 *
	 * @return the name of this employee hiring
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this employee hiring.
	 *
	 * @return the primary key of this employee hiring
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this employee hiring.
	 *
	 * @return the status of this employee hiring
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this employee hiring.
	 *
	 * @return the status by user ID of this employee hiring
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this employee hiring.
	 *
	 * @return the status by user name of this employee hiring
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this employee hiring.
	 *
	 * @return the status by user uuid of this employee hiring
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this employee hiring.
	 *
	 * @return the status date of this employee hiring
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the summary of this employee hiring.
	 *
	 * @return the summary of this employee hiring
	 */
	@Override
	public String getSummary() {
		return model.getSummary();
	}

	/**
	 * Returns the technology of this employee hiring.
	 *
	 * @return the technology of this employee hiring
	 */
	@Override
	public String getTechnology() {
		return model.getTechnology();
	}

	/**
	 * Returns the title of this employee hiring.
	 *
	 * @return the title of this employee hiring
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this employee hiring.
	 *
	 * @return the user ID of this employee hiring
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this employee hiring.
	 *
	 * @return the user name of this employee hiring
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this employee hiring.
	 *
	 * @return the user uuid of this employee hiring
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this employee hiring.
	 *
	 * @return the uuid of this employee hiring
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is approved.
	 *
	 * @return <code>true</code> if this employee hiring is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is denied.
	 *
	 * @return <code>true</code> if this employee hiring is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is a draft.
	 *
	 * @return <code>true</code> if this employee hiring is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is expired.
	 *
	 * @return <code>true</code> if this employee hiring is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is inactive.
	 *
	 * @return <code>true</code> if this employee hiring is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is incomplete.
	 *
	 * @return <code>true</code> if this employee hiring is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is pending.
	 *
	 * @return <code>true</code> if this employee hiring is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this employee hiring is scheduled.
	 *
	 * @return <code>true</code> if this employee hiring is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this employee hiring.
	 *
	 * @param companyId the company ID of this employee hiring
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this employee hiring.
	 *
	 * @param createDate the create date of this employee hiring
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the employee hiring ID of this employee hiring.
	 *
	 * @param employeeHiringId the employee hiring ID of this employee hiring
	 */
	@Override
	public void setEmployeeHiringId(long employeeHiringId) {
		model.setEmployeeHiringId(employeeHiringId);
	}

	/**
	 * Sets the experience of this employee hiring.
	 *
	 * @param experience the experience of this employee hiring
	 */
	@Override
	public void setExperience(String experience) {
		model.setExperience(experience);
	}

	/**
	 * Sets the group ID of this employee hiring.
	 *
	 * @param groupId the group ID of this employee hiring
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this employee hiring.
	 *
	 * @param modifiedDate the modified date of this employee hiring
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this employee hiring.
	 *
	 * @param name the name of this employee hiring
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this employee hiring.
	 *
	 * @param primaryKey the primary key of this employee hiring
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this employee hiring.
	 *
	 * @param status the status of this employee hiring
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this employee hiring.
	 *
	 * @param statusByUserId the status by user ID of this employee hiring
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this employee hiring.
	 *
	 * @param statusByUserName the status by user name of this employee hiring
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this employee hiring.
	 *
	 * @param statusByUserUuid the status by user uuid of this employee hiring
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this employee hiring.
	 *
	 * @param statusDate the status date of this employee hiring
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the summary of this employee hiring.
	 *
	 * @param summary the summary of this employee hiring
	 */
	@Override
	public void setSummary(String summary) {
		model.setSummary(summary);
	}

	/**
	 * Sets the technology of this employee hiring.
	 *
	 * @param technology the technology of this employee hiring
	 */
	@Override
	public void setTechnology(String technology) {
		model.setTechnology(technology);
	}

	/**
	 * Sets the title of this employee hiring.
	 *
	 * @param title the title of this employee hiring
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this employee hiring.
	 *
	 * @param userId the user ID of this employee hiring
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this employee hiring.
	 *
	 * @param userName the user name of this employee hiring
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this employee hiring.
	 *
	 * @param userUuid the user uuid of this employee hiring
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this employee hiring.
	 *
	 * @param uuid the uuid of this employee hiring
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EmployeeHiringWrapper wrap(EmployeeHiring employeeHiring) {
		return new EmployeeHiringWrapper(employeeHiring);
	}

}