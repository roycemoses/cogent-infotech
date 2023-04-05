SHOW DATABASES;
USE sakila;
SHOW TABLES;
SELECT * FROM actor;
SELECT first_name FROM actor;
SELECT first_name AS myname FROM actor;
SELECT 1+1;
SELECT now();
SELECT curdate();
SELECT curtime();
SELECT PI();
SELECT mod(45,7);
SELECT 45 % 7;
SELECT sqrt(25);
SELECT * FROM actor;
-- order by
SELECT * FROM actor ORDER BY first_name;
SELECT * FROM actor ORDER BY last_name;
SELECT * FROM actor ORDER BY first_name DESC;

-- retrieving select columns from table
SELECT first_name, last_name FROM actor;
SELECT first_name, last_name FROM actor order by first_name DESC;

-- retrieving the data with filter condition and ordered by column
SELECT * FROM actor WHERE first_name = 'DAN';
SELECT actor_id, first_name, last_name FROM actor WHERE first_name = 'JULIA' ORDER BY actor_id DESC;
SELECT actor_id, first_name, last_name FROM actor WHERE actor_id > 100 ORDER BY first_name, last_name DESC;

-- retrieve empty result set
SELECT * FROM actor WHERE 1=2;

-- ** rental table **
SELECT * FROM rental;
-- retrieve column name using aliases
SELECT rental_date, inventory_id, return_date FROM rental;
SELECT rental_date AS RentalDate, inventory_id AS FilmListID, return_date AS ReturnDate FROM rental;

-- ** film table **
SELECT * FROM film;
-- performing arithmetric operations across columns
SELECT replacement_cost - rental_rate, film_id AS FilmID, length / 60 FROM film;
SELECT replacement_cost - rental_rate AS CostDiff, film_id AS FilmID, length / 60 AS TimeInHours FROM film;
SELECT rental_rate AS RentalRate, rental_rate+3*4-1 AS Result1, (rental_rate+3)*4-1 AS Result2 FROM film; -- Order of operations is maintained

-- ** payment table **
SELECT * FROM payment;
-- retrieve result based on function
SELECT amount, round(amount) AS AmntNearestInt, round(amount, 1) AS AmntNearestTenth, floor(amount) AS FloorAmnt, ceiling(amount) AS CeilingAmnt FROM payment;

-- string operations
SELECT * FROM actor;
SELECT concat(first_name, ' ', last_name) AS FullName FROM actor;
SELECT concat(first_name, ' ', last_name) AS FullName, concat(left(first_name, 1)) AS FirstInitial FROM actor;
SELECT concat(first_name, ' ', last_name) AS FullName, length(concat(first_name, ' ', last_name)) - 1 AS FullNameLength FROM actor;
SELECT concat(first_name, ' ', last_name) AS FullName, reverse(concat(first_name, ' ', last_name)) AS ReversedFullName, 
	replace(concat(first_name, ' ', last_name), 'S', '$') AS ReplaceExample FROM actor;
    
-- date operations
-- date format functions
SELECT concat(first_name, ' ', last_name) AS FullName, 
	date_format(last_update, get_format(date, 'EUR')) AS LastUpdated1, 
	date_format(last_update, get_format(date, 'ISO')) AS LastUpdated2, -- International Organization for Standardization
    date_format(last_update, get_format(date, 'USA')) AS LastUpdated3 FROM actor;
SELECT rental_date, dayofweek(rental_date) AS DayOfWeek, 
	quarter(rental_date) AS DateQuarter, 
    week(rental_date) AS DateWeek, 
    month(rental_date) AS DateMonth FROM rental;

-- Distinct operations
SELECT * FROM actor;
SELECT DISTINCT first_name FROM actor; -- no duplicates
SELECT last_name FROM actor;
SELECT DISTINCT last_name FROM actor; -- no duplicates

-- WHERE clause comparison operators
SELECT actor_id, first_name, last_name FROM actor WHERE actor_id = '100'; -- bad practice, but works
SELECT actor_id, first_name, last_name FROM actor WHERE actor_id = 100; -- good practice
SELECT actor_id, first_name, last_name FROM actor WHERE actor_id != 5; -- excludes where actor_id is 5

-- IN operator
SELECT * FROM actor WHERE first_name IN('nick', 'johny', 'joe', 'vivien'); -- check if first_name in the input array
SELECT * FROM actor WHERE first_name NOT IN('nick', 'johny', 'joe', 'vivien'); -- check if first_name NOT in the input array

-- Subqueries
SELECT * FROM actor WHERE first_name IN('NICK', 'JOHNY', 'JOE', 'VIVIEN') 
	OR actor_id IN (SELECT actor_id FROM actor WHERE last_name = 'DEGENERES'); -- actor_id is the primary key, use it in the subquery
    
