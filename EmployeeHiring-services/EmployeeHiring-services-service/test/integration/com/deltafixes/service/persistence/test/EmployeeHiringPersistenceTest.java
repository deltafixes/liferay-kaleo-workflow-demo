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

package com.deltafixes.service.persistence.test;

import com.deltafixes.exception.NoSuchEmployeeHiringException;
import com.deltafixes.model.EmployeeHiring;
import com.deltafixes.service.EmployeeHiringLocalServiceUtil;
import com.deltafixes.service.persistence.EmployeeHiringPersistence;
import com.deltafixes.service.persistence.EmployeeHiringUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class EmployeeHiringPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.deltafixes.service"));

	@Before
	public void setUp() {
		_persistence = EmployeeHiringUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<EmployeeHiring> iterator = _employeeHirings.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		EmployeeHiring employeeHiring = _persistence.create(pk);

		Assert.assertNotNull(employeeHiring);

		Assert.assertEquals(employeeHiring.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		_persistence.remove(newEmployeeHiring);

		EmployeeHiring existingEmployeeHiring = _persistence.fetchByPrimaryKey(
			newEmployeeHiring.getPrimaryKey());

		Assert.assertNull(existingEmployeeHiring);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEmployeeHiring();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		EmployeeHiring newEmployeeHiring = _persistence.create(pk);

		newEmployeeHiring.setUuid(RandomTestUtil.randomString());

		newEmployeeHiring.setGroupId(RandomTestUtil.nextLong());

		newEmployeeHiring.setCompanyId(RandomTestUtil.nextLong());

		newEmployeeHiring.setUserId(RandomTestUtil.nextLong());

		newEmployeeHiring.setUserName(RandomTestUtil.randomString());

		newEmployeeHiring.setCreateDate(RandomTestUtil.nextDate());

		newEmployeeHiring.setModifiedDate(RandomTestUtil.nextDate());

		newEmployeeHiring.setName(RandomTestUtil.randomString());

		newEmployeeHiring.setTechnology(RandomTestUtil.randomString());

		newEmployeeHiring.setExperience(RandomTestUtil.randomString());

		newEmployeeHiring.setTitle(RandomTestUtil.randomString());

		newEmployeeHiring.setSummary(RandomTestUtil.randomString());

		newEmployeeHiring.setStatus(RandomTestUtil.nextInt());

		newEmployeeHiring.setStatusByUserId(RandomTestUtil.nextLong());

		newEmployeeHiring.setStatusByUserName(RandomTestUtil.randomString());

		newEmployeeHiring.setStatusDate(RandomTestUtil.nextDate());

		_employeeHirings.add(_persistence.update(newEmployeeHiring));

		EmployeeHiring existingEmployeeHiring = _persistence.findByPrimaryKey(
			newEmployeeHiring.getPrimaryKey());

		Assert.assertEquals(
			existingEmployeeHiring.getUuid(), newEmployeeHiring.getUuid());
		Assert.assertEquals(
			existingEmployeeHiring.getEmployeeHiringId(),
			newEmployeeHiring.getEmployeeHiringId());
		Assert.assertEquals(
			existingEmployeeHiring.getGroupId(),
			newEmployeeHiring.getGroupId());
		Assert.assertEquals(
			existingEmployeeHiring.getCompanyId(),
			newEmployeeHiring.getCompanyId());
		Assert.assertEquals(
			existingEmployeeHiring.getUserId(), newEmployeeHiring.getUserId());
		Assert.assertEquals(
			existingEmployeeHiring.getUserName(),
			newEmployeeHiring.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingEmployeeHiring.getCreateDate()),
			Time.getShortTimestamp(newEmployeeHiring.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingEmployeeHiring.getModifiedDate()),
			Time.getShortTimestamp(newEmployeeHiring.getModifiedDate()));
		Assert.assertEquals(
			existingEmployeeHiring.getName(), newEmployeeHiring.getName());
		Assert.assertEquals(
			existingEmployeeHiring.getTechnology(),
			newEmployeeHiring.getTechnology());
		Assert.assertEquals(
			existingEmployeeHiring.getExperience(),
			newEmployeeHiring.getExperience());
		Assert.assertEquals(
			existingEmployeeHiring.getTitle(), newEmployeeHiring.getTitle());
		Assert.assertEquals(
			existingEmployeeHiring.getSummary(),
			newEmployeeHiring.getSummary());
		Assert.assertEquals(
			existingEmployeeHiring.getStatus(), newEmployeeHiring.getStatus());
		Assert.assertEquals(
			existingEmployeeHiring.getStatusByUserId(),
			newEmployeeHiring.getStatusByUserId());
		Assert.assertEquals(
			existingEmployeeHiring.getStatusByUserName(),
			newEmployeeHiring.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingEmployeeHiring.getStatusDate()),
			Time.getShortTimestamp(newEmployeeHiring.getStatusDate()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		EmployeeHiring existingEmployeeHiring = _persistence.findByPrimaryKey(
			newEmployeeHiring.getPrimaryKey());

		Assert.assertEquals(existingEmployeeHiring, newEmployeeHiring);
	}

	@Test(expected = NoSuchEmployeeHiringException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<EmployeeHiring> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"EMP_EmployeeHiring", "uuid", true, "employeeHiringId", true,
			"groupId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "name", true,
			"technology", true, "experience", true, "title", true, "summary",
			true, "status", true, "statusByUserId", true, "statusByUserName",
			true, "statusDate", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		EmployeeHiring existingEmployeeHiring = _persistence.fetchByPrimaryKey(
			newEmployeeHiring.getPrimaryKey());

		Assert.assertEquals(existingEmployeeHiring, newEmployeeHiring);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		EmployeeHiring missingEmployeeHiring = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingEmployeeHiring);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		EmployeeHiring newEmployeeHiring1 = addEmployeeHiring();
		EmployeeHiring newEmployeeHiring2 = addEmployeeHiring();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmployeeHiring1.getPrimaryKey());
		primaryKeys.add(newEmployeeHiring2.getPrimaryKey());

		Map<Serializable, EmployeeHiring> employeeHirings =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, employeeHirings.size());
		Assert.assertEquals(
			newEmployeeHiring1,
			employeeHirings.get(newEmployeeHiring1.getPrimaryKey()));
		Assert.assertEquals(
			newEmployeeHiring2,
			employeeHirings.get(newEmployeeHiring2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, EmployeeHiring> employeeHirings =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(employeeHirings.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmployeeHiring.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, EmployeeHiring> employeeHirings =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, employeeHirings.size());
		Assert.assertEquals(
			newEmployeeHiring,
			employeeHirings.get(newEmployeeHiring.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, EmployeeHiring> employeeHirings =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(employeeHirings.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmployeeHiring.getPrimaryKey());

		Map<Serializable, EmployeeHiring> employeeHirings =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, employeeHirings.size());
		Assert.assertEquals(
			newEmployeeHiring,
			employeeHirings.get(newEmployeeHiring.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			EmployeeHiringLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<EmployeeHiring>() {

				@Override
				public void performAction(EmployeeHiring employeeHiring) {
					Assert.assertNotNull(employeeHiring);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			EmployeeHiring.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"employeeHiringId", newEmployeeHiring.getEmployeeHiringId()));

		List<EmployeeHiring> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		EmployeeHiring existingEmployeeHiring = result.get(0);

		Assert.assertEquals(existingEmployeeHiring, newEmployeeHiring);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			EmployeeHiring.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"employeeHiringId", RandomTestUtil.nextLong()));

		List<EmployeeHiring> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			EmployeeHiring.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("employeeHiringId"));

		Object newEmployeeHiringId = newEmployeeHiring.getEmployeeHiringId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"employeeHiringId", new Object[] {newEmployeeHiringId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEmployeeHiringId = result.get(0);

		Assert.assertEquals(existingEmployeeHiringId, newEmployeeHiringId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			EmployeeHiring.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("employeeHiringId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"employeeHiringId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		EmployeeHiring newEmployeeHiring = addEmployeeHiring();

		_persistence.clearCache();

		EmployeeHiring existingEmployeeHiring = _persistence.findByPrimaryKey(
			newEmployeeHiring.getPrimaryKey());

		Assert.assertTrue(
			Objects.equals(
				existingEmployeeHiring.getUuid(),
				ReflectionTestUtil.invoke(
					existingEmployeeHiring, "getOriginalUuid",
					new Class<?>[0])));
		Assert.assertEquals(
			Long.valueOf(existingEmployeeHiring.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				existingEmployeeHiring, "getOriginalGroupId", new Class<?>[0]));
	}

	protected EmployeeHiring addEmployeeHiring() throws Exception {
		long pk = RandomTestUtil.nextLong();

		EmployeeHiring employeeHiring = _persistence.create(pk);

		employeeHiring.setUuid(RandomTestUtil.randomString());

		employeeHiring.setGroupId(RandomTestUtil.nextLong());

		employeeHiring.setCompanyId(RandomTestUtil.nextLong());

		employeeHiring.setUserId(RandomTestUtil.nextLong());

		employeeHiring.setUserName(RandomTestUtil.randomString());

		employeeHiring.setCreateDate(RandomTestUtil.nextDate());

		employeeHiring.setModifiedDate(RandomTestUtil.nextDate());

		employeeHiring.setName(RandomTestUtil.randomString());

		employeeHiring.setTechnology(RandomTestUtil.randomString());

		employeeHiring.setExperience(RandomTestUtil.randomString());

		employeeHiring.setTitle(RandomTestUtil.randomString());

		employeeHiring.setSummary(RandomTestUtil.randomString());

		employeeHiring.setStatus(RandomTestUtil.nextInt());

		employeeHiring.setStatusByUserId(RandomTestUtil.nextLong());

		employeeHiring.setStatusByUserName(RandomTestUtil.randomString());

		employeeHiring.setStatusDate(RandomTestUtil.nextDate());

		_employeeHirings.add(_persistence.update(employeeHiring));

		return employeeHiring;
	}

	private List<EmployeeHiring> _employeeHirings =
		new ArrayList<EmployeeHiring>();
	private EmployeeHiringPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}