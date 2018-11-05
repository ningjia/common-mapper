
create table myTest.company
(
	companyId int not null
		primary key,
	name varchar(45) null
)
charset=utf8
;

INSERT INTO myTest.company (companyId, name) VALUES (1, '强生集团');
INSERT INTO myTest.company (companyId, name) VALUES (2, '汉森');


create table myTest.employer
(
	employerId int auto_increment
		primary key,
	name varchar(32) not null comment '名称',
	birthday date null comment '生日',
	sex char null comment '性别',
	companyId int null comment '公司'
)
charset=utf8
;

INSERT INTO myTest.employer (employerId, name, birthday, sex, companyId) VALUES (1, 'Tony', null, '1', 1);
INSERT INTO myTest.employer (employerId, name, birthday, sex, companyId) VALUES (2, 'Cindy', null, '0', 2);
INSERT INTO myTest.employer (employerId, name, birthday, sex, companyId) VALUES (3, 'David', null, '1', 1);
INSERT INTO myTest.employer (employerId, name, birthday, sex, companyId) VALUES (4, 'Jessica', null, '0', 2);
INSERT INTO myTest.employer (employerId, name, birthday, sex, companyId) VALUES (5, 'Emily', null, '0', 1);
