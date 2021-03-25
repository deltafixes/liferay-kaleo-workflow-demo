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

package com.deltafixes.service.persistence;

import com.deltafixes.model.EmployeeHiring;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the employee hiring service. This utility wraps <code>com.deltafixes.service.persistence.impl.EmployeeHiringPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiringPersistence
 * @generated
 */
public class EmployeeHiringUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EmployeeHiring employeeHiring) {
		getPersistence().clearCache(employeeHiring);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, EmployeeHiring> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmployeeHiring> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmployeeHiring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmployeeHiring> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EmployeeHiring update(EmployeeHiring employeeHiring) {
		return getPersistence().update(employeeHiring);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EmployeeHiring update(
		EmployeeHiring employeeHiring, ServiceContext serviceContext) {

		return getPersistence().update(employeeHiring, serviceContext);
	}

	/**
	 * Returns all the employee hirings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the employee hirings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @return the range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the employee hirings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee hirings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public static EmployeeHiring findByUuid_First(
			String uuid, OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUuid_First(
		String uuid, OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public static EmployeeHiring findByUuid_Last(
			String uuid, OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUuid_Last(
		String uuid, OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the employee hirings before and after the current employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param employeeHiringId the primary key of the current employee hiring
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee hiring
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public static EmployeeHiring[] findByUuid_PrevAndNext(
			long employeeHiringId, String uuid,
			OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_PrevAndNext(
			employeeHiringId, uuid, orderByComparator);
	}

	/**
	 * Removes all the employee hirings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of employee hirings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employee hirings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmployeeHiringException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public static EmployeeHiring findByUUID_G(String uuid, long groupId)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the employee hiring where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the employee hiring that was removed
	 */
	public static EmployeeHiring removeByUUID_G(String uuid, long groupId)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of employee hirings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching employee hirings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @return the range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employee hirings
	 */
	public static List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public static EmployeeHiring findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public static EmployeeHiring findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public static EmployeeHiring fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the employee hirings before and after the current employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param employeeHiringId the primary key of the current employee hiring
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee hiring
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public static EmployeeHiring[] findByUuid_C_PrevAndNext(
			long employeeHiringId, String uuid, long companyId,
			OrderByComparator<EmployeeHiring> orderByComparator)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByUuid_C_PrevAndNext(
			employeeHiringId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the employee hirings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employee hirings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the employee hiring in the entity cache if it is enabled.
	 *
	 * @param employeeHiring the employee hiring
	 */
	public static void cacheResult(EmployeeHiring employeeHiring) {
		getPersistence().cacheResult(employeeHiring);
	}

	/**
	 * Caches the employee hirings in the entity cache if it is enabled.
	 *
	 * @param employeeHirings the employee hirings
	 */
	public static void cacheResult(List<EmployeeHiring> employeeHirings) {
		getPersistence().cacheResult(employeeHirings);
	}

	/**
	 * Creates a new employee hiring with the primary key. Does not add the employee hiring to the database.
	 *
	 * @param employeeHiringId the primary key for the new employee hiring
	 * @return the new employee hiring
	 */
	public static EmployeeHiring create(long employeeHiringId) {
		return getPersistence().create(employeeHiringId);
	}

	/**
	 * Removes the employee hiring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring that was removed
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public static EmployeeHiring remove(long employeeHiringId)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().remove(employeeHiringId);
	}

	public static EmployeeHiring updateImpl(EmployeeHiring employeeHiring) {
		return getPersistence().updateImpl(employeeHiring);
	}

	/**
	 * Returns the employee hiring with the primary key or throws a <code>NoSuchEmployeeHiringException</code> if it could not be found.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public static EmployeeHiring findByPrimaryKey(long employeeHiringId)
		throws com.deltafixes.exception.NoSuchEmployeeHiringException {

		return getPersistence().findByPrimaryKey(employeeHiringId);
	}

	/**
	 * Returns the employee hiring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring, or <code>null</code> if a employee hiring with the primary key could not be found
	 */
	public static EmployeeHiring fetchByPrimaryKey(long employeeHiringId) {
		return getPersistence().fetchByPrimaryKey(employeeHiringId);
	}

	/**
	 * Returns all the employee hirings.
	 *
	 * @return the employee hirings
	 */
	public static List<EmployeeHiring> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the employee hirings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @return the range of employee hirings
	 */
	public static List<EmployeeHiring> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the employee hirings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee hirings
	 */
	public static List<EmployeeHiring> findAll(
		int start, int end,
		OrderByComparator<EmployeeHiring> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employee hirings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeHiringModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee hirings
	 * @param end the upper bound of the range of employee hirings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employee hirings
	 */
	public static List<EmployeeHiring> findAll(
		int start, int end, OrderByComparator<EmployeeHiring> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the employee hirings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of employee hirings.
	 *
	 * @return the number of employee hirings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployeeHiringPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EmployeeHiringPersistence, EmployeeHiringPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EmployeeHiringPersistence.class);

		ServiceTracker<EmployeeHiringPersistence, EmployeeHiringPersistence>
			serviceTracker =
				new ServiceTracker
					<EmployeeHiringPersistence, EmployeeHiringPersistence>(
						bundle.getBundleContext(),
						EmployeeHiringPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}