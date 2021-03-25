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

package com.deltafixes.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeHiringService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiringService
 * @generated
 */
public class EmployeeHiringServiceWrapper
	implements EmployeeHiringService, ServiceWrapper<EmployeeHiringService> {

	public EmployeeHiringServiceWrapper(
		EmployeeHiringService employeeHiringService) {

		_employeeHiringService = employeeHiringService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeHiringService.getOSGiServiceIdentifier();
	}

	@Override
	public EmployeeHiringService getWrappedService() {
		return _employeeHiringService;
	}

	@Override
	public void setWrappedService(EmployeeHiringService employeeHiringService) {
		_employeeHiringService = employeeHiringService;
	}

	private EmployeeHiringService _employeeHiringService;

}