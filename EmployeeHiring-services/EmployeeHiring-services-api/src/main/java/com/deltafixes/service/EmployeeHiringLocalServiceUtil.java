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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for EmployeeHiring. This utility wraps
 * <code>com.deltafixes.service.impl.EmployeeHiringLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiringLocalService
 * @generated
 */
public class EmployeeHiringLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.deltafixes.service.impl.EmployeeHiringLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the employee hiring to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeHiringLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeHiring the employee hiring
	 * @return the employee hiring that was added
	 */
	public static com.deltafixes.model.EmployeeHiring addEmployeeHiring(
		com.deltafixes.model.EmployeeHiring employeeHiring) {

		return getService().addEmployeeHiring(employeeHiring);
	}

	public static com.deltafixes.model.EmployeeHiring addEmployeeHiring(
		String title, String summary, String name, String technology,
		String experience,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addEmployeeHiring(
			title, summary, name, technology, experience, serviceContext);
	}

	/**
	 * Creates a new employee hiring with the primary key. Does not add the employee hiring to the database.
	 *
	 * @param employeeHiringId the primary key for the new employee hiring
	 * @return the new employee hiring
	 */
	public static com.deltafixes.model.EmployeeHiring createEmployeeHiring(
		long employeeHiringId) {

		return getService().createEmployeeHiring(employeeHiringId);
	}

	/**
	 * Deletes the employee hiring from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeHiringLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeHiring the employee hiring
	 * @return the employee hiring that was removed
	 */
	public static com.deltafixes.model.EmployeeHiring deleteEmployeeHiring(
		com.deltafixes.model.EmployeeHiring employeeHiring) {

		return getService().deleteEmployeeHiring(employeeHiring);
	}

	/**
	 * Deletes the employee hiring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeHiringLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring that was removed
	 * @throws PortalException if a employee hiring with the primary key could not be found
	 */
	public static com.deltafixes.model.EmployeeHiring deleteEmployeeHiring(
			long employeeHiringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEmployeeHiring(employeeHiringId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.deltafixes.model.impl.EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.deltafixes.model.impl.EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.deltafixes.model.EmployeeHiring fetchEmployeeHiring(
		long employeeHiringId) {

		return getService().fetchEmployeeHiring(employeeHiringId);
	}

	/**
	 * Returns the employee hiring matching the UUID and group.
	 *
	 * @param uuid the employee hiring's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static com.deltafixes.model.EmployeeHiring
		fetchEmployeeHiringByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchEmployeeHiringByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the employee hiring with the primary key.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring
	 * @throws PortalException if a employee hiring with the primary key could not be found
	 */
	public static com.deltafixes.model.EmployeeHiring getEmployeeHiring(
			long employeeHiringId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEmployeeHiring(employeeHiringId);
	}

	/**
	 * Returns the employee hiring matching the UUID and group.
	 *
	 * @param uuid the employee hiring's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee hiring
	 * @throws PortalException if a matching employee hiring could not be found
	 */
	public static com.deltafixes.model.EmployeeHiring
			getEmployeeHiringByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEmployeeHiringByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the employee hirings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.deltafixes.model.impl.EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @return the range of employee hirings
	 */
	public static java.util.List<com.deltafixes.model.EmployeeHiring>
		getEmployeeHirings(int start, int end) {

		return getService().getEmployeeHirings(start, end);
	}

	/**
	 * Returns all the employee hirings matching the UUID and company.
	 *
	 * @param uuid the UUID of the employee hirings
	 * @param companyId the primary key of the company
	 * @return the matching employee hirings, or an empty list if no matches were found
	 */
	public static java.util.List<com.deltafixes.model.EmployeeHiring>
		getEmployeeHiringsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getEmployeeHiringsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of employee hirings matching the UUID and company.
	 *
	 * @param uuid the UUID of the employee hirings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching employee hirings, or an empty list if no matches were found
	 */
	public static java.util.List<com.deltafixes.model.EmployeeHiring>
		getEmployeeHiringsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.deltafixes.model.EmployeeHiring> orderByComparator) {

		return getService().getEmployeeHiringsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of employee hirings.
	 *
	 * @return the number of employee hirings
	 */
	public static int getEmployeeHiringsCount() {
		return getService().getEmployeeHiringsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the employee hiring in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeHiringLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employeeHiring the employee hiring
	 * @return the employee hiring that was updated
	 */
	public static com.deltafixes.model.EmployeeHiring updateEmployeeHiring(
		com.deltafixes.model.EmployeeHiring employeeHiring) {

		return getService().updateEmployeeHiring(employeeHiring);
	}

	public static com.deltafixes.model.EmployeeHiring updateStatus(
		long userId, long employeeHiringId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().updateStatus(
			userId, employeeHiringId, status, serviceContext);
	}

	public static EmployeeHiringLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EmployeeHiringLocalService, EmployeeHiringLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EmployeeHiringLocalService.class);

		ServiceTracker<EmployeeHiringLocalService, EmployeeHiringLocalService>
			serviceTracker =
				new ServiceTracker
					<EmployeeHiringLocalService, EmployeeHiringLocalService>(
						bundle.getBundleContext(),
						EmployeeHiringLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}