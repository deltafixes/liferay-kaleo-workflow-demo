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

import com.deltafixes.exception.NoSuchEmployeeHiringException;
import com.deltafixes.model.EmployeeHiring;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the employee hiring service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeHiringUtil
 * @generated
 */
@ProviderType
public interface EmployeeHiringPersistence
	extends BasePersistence<EmployeeHiring> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeHiringUtil} to access the employee hiring persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the employee hirings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employee hirings
	 */
	public java.util.List<EmployeeHiring> findByUuid(String uuid);

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
	public java.util.List<EmployeeHiring> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<EmployeeHiring> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

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
	public java.util.List<EmployeeHiring> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public EmployeeHiring findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public EmployeeHiring findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

	/**
	 * Returns the employee hirings before and after the current employee hiring in the ordered set where uuid = &#63;.
	 *
	 * @param employeeHiringId the primary key of the current employee hiring
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee hiring
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public EmployeeHiring[] findByUuid_PrevAndNext(
			long employeeHiringId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Removes all the employee hirings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of employee hirings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employee hirings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmployeeHiringException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public EmployeeHiring findByUUID_G(String uuid, long groupId)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the employee hiring where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the employee hiring where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the employee hiring that was removed
	 */
	public EmployeeHiring removeByUUID_G(String uuid, long groupId)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the number of employee hirings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching employee hirings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employee hirings
	 */
	public java.util.List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

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
	public java.util.List<EmployeeHiring> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public EmployeeHiring findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the first employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring
	 * @throws NoSuchEmployeeHiringException if a matching employee hiring could not be found
	 */
	public EmployeeHiring findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the last employee hiring in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee hiring, or <code>null</code> if a matching employee hiring could not be found
	 */
	public EmployeeHiring fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

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
	public EmployeeHiring[] findByUuid_C_PrevAndNext(
			long employeeHiringId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
				orderByComparator)
		throws NoSuchEmployeeHiringException;

	/**
	 * Removes all the employee hirings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of employee hirings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employee hirings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the employee hiring in the entity cache if it is enabled.
	 *
	 * @param employeeHiring the employee hiring
	 */
	public void cacheResult(EmployeeHiring employeeHiring);

	/**
	 * Caches the employee hirings in the entity cache if it is enabled.
	 *
	 * @param employeeHirings the employee hirings
	 */
	public void cacheResult(java.util.List<EmployeeHiring> employeeHirings);

	/**
	 * Creates a new employee hiring with the primary key. Does not add the employee hiring to the database.
	 *
	 * @param employeeHiringId the primary key for the new employee hiring
	 * @return the new employee hiring
	 */
	public EmployeeHiring create(long employeeHiringId);

	/**
	 * Removes the employee hiring with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring that was removed
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public EmployeeHiring remove(long employeeHiringId)
		throws NoSuchEmployeeHiringException;

	public EmployeeHiring updateImpl(EmployeeHiring employeeHiring);

	/**
	 * Returns the employee hiring with the primary key or throws a <code>NoSuchEmployeeHiringException</code> if it could not be found.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring
	 * @throws NoSuchEmployeeHiringException if a employee hiring with the primary key could not be found
	 */
	public EmployeeHiring findByPrimaryKey(long employeeHiringId)
		throws NoSuchEmployeeHiringException;

	/**
	 * Returns the employee hiring with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeHiringId the primary key of the employee hiring
	 * @return the employee hiring, or <code>null</code> if a employee hiring with the primary key could not be found
	 */
	public EmployeeHiring fetchByPrimaryKey(long employeeHiringId);

	/**
	 * Returns all the employee hirings.
	 *
	 * @return the employee hirings
	 */
	public java.util.List<EmployeeHiring> findAll();

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
	public java.util.List<EmployeeHiring> findAll(int start, int end);

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
	public java.util.List<EmployeeHiring> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator);

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
	public java.util.List<EmployeeHiring> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeHiring>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the employee hirings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of employee hirings.
	 *
	 * @return the number of employee hirings
	 */
	public int countAll();

}