Create table Employee(employee_ID Int,name varchar(25),months INT,salary INT)
INSERT INTO Employee (employee_ID, name, months, salary) VALUES
(12228, 'Rose', 12, 50000),
(33645, 'Angela', 24, 60000),
(45692, 'Frank', 6, 45000),
(56118, 'Patrick', 36, 70000),
(59725, 'Lisa', 18, 52000),
(74197, 'Kimberly', 8, 48000),
(78454, 'Bonnie', 30, 65000),
(83565, 'Micheil', 15, 55000),
(99607, 'Todd', 20, 57000),
(99989, 'Jack', 25, 68000);
select* from employee
select name from employee where salary>2000 and Months<10 order by employee_ID asc
--select name from employee order by Name asc
