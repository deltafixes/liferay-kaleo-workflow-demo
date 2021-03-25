create table EMP_EmployeeHiring (
	uuid_ VARCHAR(75) null,
	employeeHiringId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	technology VARCHAR(75) null,
	experience VARCHAR(75) null,
	title VARCHAR(75) null,
	summary VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);