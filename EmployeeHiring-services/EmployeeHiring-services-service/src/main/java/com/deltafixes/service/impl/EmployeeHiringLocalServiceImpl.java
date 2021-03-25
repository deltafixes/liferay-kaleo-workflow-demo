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

package com.deltafixes.service.impl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

import com.deltafixes.model.EmployeeHiring;
import com.deltafixes.service.base.EmployeeHiringLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;

/**
 * The implementation of the employee hiring local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.deltafixes.service.EmployeeHiringLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiringLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.deltafixes.model.EmployeeHiring",
	service = AopService.class
)
public class EmployeeHiringLocalServiceImpl
	extends EmployeeHiringLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.deltafixes.service.EmployeeHiringLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.deltafixes.service.EmployeeHiringLocalServiceUtil</code>.
	 */
	public EmployeeHiring addEmployeeHiring(String title, String summary, String name, String technology, String experience,
			ServiceContext serviceContext) {

		long employeeHiringId = counterLocalService.increment(EmployeeHiring.class.getName());
		EmployeeHiring employeeHiring = null;
		try {
			User user = userLocalService.getUser(serviceContext.getUserId());
			employeeHiring = employeeHiringLocalService.createEmployeeHiring(employeeHiringId);
			employeeHiring.setUserId(serviceContext.getUserId());
			employeeHiring.setCreateDate(new Date());
			employeeHiring.setTitle(title);
			employeeHiring.setSummary(summary);
			employeeHiring.setName(name);
			employeeHiring.setTechnology(technology);
			employeeHiring.setExperience(experience);
			employeeHiring.setUserName(user.getFullName());
			employeeHiring.setCompanyId(serviceContext.getCompanyId());
			employeeHiring.setGroupId(serviceContext.getScopeGroupId());

			employeeHiring.setStatus(WorkflowConstants.STATUS_DRAFT);
			employeeHiring.setStatusByUserId(user.getUserId());
			employeeHiring.setStatusDate(new Date());
			employeeHiring.setStatusByUserName(user.getFullName());
			employeeHiring.setStatusByUserUuid(user.getUserUuid());
			employeeHiring = employeeHiringLocalService.addEmployeeHiring(employeeHiring);

			assetEntryLocalService.updateEntry(user.getUserId(), serviceContext.getScopeGroupId(), new Date(),
					new Date(), EmployeeHiring.class.getName(), employeeHiring.getEmployeeHiringId(),
					employeeHiring.getUuid(), 0, null, null, true, false, new Date(), null, new Date(), null,
					ContentTypes.TEXT_HTML, employeeHiring.getName(), employeeHiring.getName(), null, null, null, 0, 0,
					null);
			Indexer<EmployeeHiring> indexer = IndexerRegistryUtil.nullSafeGetIndexer(EmployeeHiring.class);
			indexer.reindex(employeeHiring);

			WorkflowHandlerRegistryUtil.startWorkflowInstance(employeeHiring.getCompanyId(),
					employeeHiring.getGroupId(), employeeHiring.getUserId(), EmployeeHiring.class.getName(),
					employeeHiring.getPrimaryKey(), employeeHiring, serviceContext);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return employeeHiring;
	}

	public EmployeeHiring updateStatus(long userId, long employeeHiringId, int status, ServiceContext serviceContext) {

		EmployeeHiring employeeHiring = employeeHiringPersistence.fetchByPrimaryKey(employeeHiringId);
		employeeHiring.setStatus(status);
		employeeHiring.setStatusByUserId(userId);
		employeeHiring.setStatusDate(new Date());
		User user = null;
		try {
			user = userLocalService.getUser(userId);
			employeeHiring.setStatusByUserName(user.getFullName());
			employeeHiring.setStatusByUserUuid(user.getUserUuid());
		} catch (PortalException e) {
			e.printStackTrace();
		}
		employeeHiring = employeeHiringPersistence.update(employeeHiring);
		try {
			if (status == WorkflowConstants.STATUS_APPROVED) {
				assetEntryLocalService.updateEntry(EmployeeHiring.class.getName(), employeeHiringId, new Date(), null, true, true);
			} else {
				assetEntryLocalService.updateVisible(EmployeeHiring.class.getName(), employeeHiringId, false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeHiring;
	}
}