
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


