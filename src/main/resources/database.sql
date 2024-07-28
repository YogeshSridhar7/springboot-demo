CREATE TABLE Student(
     id int,
     name varchar(80),
     age int,
     address varchar(80),
     city varchar(80),
     state varchar(80)
);

CREATE TABLE Course(
     id int,
     courseName varchar(20),
     courseYear int
);

CREATE TABLE Subjects(
     id int,
     subjectName varchar(20)
);

CREATE TABLE CumulativeMarks(
     studentId int,
     subjectId int,
     courseId int,
     subjectMarks int;
     result varchar(10);
);

--url: jdbc:postgresql://localhost:5433/postgres
--    username: postgres
--    password: sa