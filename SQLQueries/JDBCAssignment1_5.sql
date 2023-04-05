CREATE DATABASE rice;
USE rice;

DROP TABLE IF EXISTS dept;
CREATE TABLE dept
(
	dept_num int,
	emp_id int,
    emp_name varchar(40),
    emp_salary float,
    job_title varchar(40),
    manager_name varchar(40),
    dept_name varchar(40)
);

INSERT INTO dept values (10, 1, 'Royce', 100, 'Programmer', 'James', 'Full-stack');
INSERT INTO dept values (10, 2, 'Chris', 200, 'Programmer', 'Richard', "Front-end");
INSERT INTO dept values (30, 3, 'Haley', 300, 'Programmer', 'James', "Back-end");
INSERT INTO dept values (30, 4, 'Chelsea', 400, 'Programmer', 'James', "Back-end");
INSERT INTO dept values (30, 5, 'Frank', 500, 'Programmer', 'Richard', "Front-end");
INSERT INTO dept values (20, 6, 'Adam', 600, 'Analyst', 'James', "Game Design");
INSERT INTO dept values (20, 7, 'Timmy', 700, 'Analyst', 'Richard', "Game Design");
INSERT INTO dept values (20, 8, 'Thomas', 800, 'Analyst', 'James', "Game Design");
INSERT INTO dept values (40, 9, 'Ford', 700, 'Analyst', 'Richard', "Game Design");
INSERT INTO dept values (40, 9, 'TenZ', 1000, 'Programmer', 'Richard', "Game Design");
INSERT INTO dept values (40, 9, 'Koko', 1500, 'Programmer', 'Richard', "Full-stack");


SELECT * FROM dept;
DELETE FROM dept WHERE emp_id = 4664;

DELIMITER $$
DROP PROCEDURE IF EXISTS proc_empname $$
CREATE PROCEDURE proc_empname(IN empno int)
BEGIN
	SELECT emp_name FROM dept WHERE empno = emp_id;
END $$



DELIMITER $$
DROP PROCEDURE IF EXISTS proc_dname $$
CREATE PROCEDURE proc_dname(IN empno int)
BEGIN
	SELECT dept_name FROM dept WHERE empno = emp_id;
END $$
DELIMITER ;	

SHOW PROCEDURE STATUS WHERE db = 'rice'; 