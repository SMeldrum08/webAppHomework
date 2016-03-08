create table appuser (
	id number,
	firstName varchar2(30),
	lastName varchar2(30),
	userName varchar2(30),
	password varchar2(40),
	constraint appuser_pk primary key (id),
	constraint app_userName_uk unique (userName)

);

create table appstudent (
	id number,
	firstName varchar2(30),
	lastName varchar2(30),
	className varchar2(40),
	userName varchar2(30) UNIQUE,
	password varchar2(10),
	creatorName varchar2(30),
	constraint appstudent_pk primary key (id)
	
);