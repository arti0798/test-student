CREATE TABLE studentEntity(
id int NOT NULL PRIMARY KEY,
name varchar(100) NOT NULL,
address varchar(100) NOT NULL
);

create table subject(subjectId varchar(30) primary key not null,subjectName varchar(30));

create table studentSubject(sNo int primary key,studentId int,foreign key(studentId)references studententity(id) on update cascade on delete cascade,subjectId varchar(30),foreign key(subjectId)references subject(subjectid) on update cascade on delete cascade);
