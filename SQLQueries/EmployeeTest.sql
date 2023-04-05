CREATE DATABASE test;
USE test;

CREATE TABLE Employee 
(
	emp_id int,
	emp_name varchar(40),
	emp_salary float
);

INSERT INTO Employee VALUES(1000, "Royce", 5000.125);
INSERT INTO Employee VALUES(2000, "Chris", 2000.25);
DELETE FROM Employee WHERE emp_id = 1000;
DELETE FROM Employee WHERE emp_salary = 9001.9;
SELECT * FROM Employee;

-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

-- Creating a stored procedure (remember to refresh to see the procedure)
CREATE TABLE person
(
	person_id int,
    first_name varchar(20),
    last_name varchar(20)
);
INSERT INTO person values (191, 'Royce', 'Moses');

DELIMITER $$
DROP PROCEDURE IF EXISTS retrieve_persons $$
CREATE PROCEDURE `retrieve_persons`()
BEGIN
	SELECT * FROM person;
END $$
DELIMITER ;	
SHOW PROCEDURE STATUS WHERE db = 'test'; 
