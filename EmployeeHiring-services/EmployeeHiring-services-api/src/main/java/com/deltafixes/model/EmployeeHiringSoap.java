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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.deltafixes.service.http.EmployeeHiringServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeHiringSoap implements Serializable {

	public static EmployeeHiringSoap toSoapModel(EmployeeHiring model) {
		EmployeeHiringSoap soapModel = new EmployeeHiringSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEmployeeHiringId(model.getEmployeeHiringId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setTechnology(model.getTechnology());
		soapModel.setExperience(model.getExperience());
		soapModel.setTitle(model.getTitle());
		soapModel.setSummary(model.getSummary());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static EmployeeHiringSoap[] toSoapModels(EmployeeHiring[] models) {
		EmployeeHiringSoap[] soapModels = new EmployeeHiringSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeHiringSoap[][] toSoapModels(
		EmployeeHiring[][] models) {

		EmployeeHiringSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new EmployeeHiringSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeHiringSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeHiringSoap[] toSoapModels(
		List<EmployeeHiring> models) {

		List<EmployeeHiringSoap> soapModels = new ArrayList<EmployeeHiringSoap>(
			models.size());

		for (EmployeeHiring model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeHiringSoap[soapModels.size()]);
	}

	public EmployeeHiringSoap() {
	}

	public long getPrimaryKey() {
		return _employeeHiringId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeHiringId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEmployeeHiringId() {
		return _employeeHiringId;
	}

	public void setEmployeeHiringId(long employeeHiringId) {
		_employeeHiringId = employeeHiringId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getTechnology() {
		return _technology;
	}

	public void setTechnology(String technology) {
		_technology = technology;
	}

	public String getExperience() {
		return _experience;
	}

	public void setExperience(String experience) {
		_experience = experience;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _employeeHiringId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _technology;
	private String _experience;
	private String _title;
	private String _summary;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

}