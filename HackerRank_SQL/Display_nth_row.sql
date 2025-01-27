create table Display_nth_row(ROWNUM INT,ENAME varchar(25),empno int,job varchar(25),mgr int,hiredate date,sal int,deptno int);
-- Insert sample data
INSERT INTO Display_nth_row (ROWNUM, ENAME, EMPNO, JOB, MGR, HIREDATE, SAL, DEPTNO) VALUES
(1, 'Alice', 1001, 'Manager', NULL, '2022-01-15', 75000, 10),
(2, 'Bob', 1002, 'Analyst', 1001, '2022-02-10', 60000, 20),
(3, 'Charlie', 1003, 'Clerk', 1002, '2023-03-05', 40000, 30),
(4, 'David', 1004, 'Manager', NULL, '2020-06-20', 80000, 40),
(5, 'Emma', 1005, 'Analyst', 1004, '2021-07-15', 62000, 10),
(6, 'Frank', 1006, 'Clerk', 1001, '2023-04-01', 38000, 20),
(7, 'Grace', 1007, 'Manager', NULL, '2019-11-30', 90000, 30),
(8, 'Hannah', 1008, 'Analyst', 1007, '2022-12-01', 65000, 40),
(9, 'Ian', 1009, 'Clerk', 1002, '2023-01-10', 39000, 20),
(10, 'Jack', 1010, 'Manager', NULL, '2021-09-25', 85000, 10);
SELECT * 
FROM Display_nth_row 
WHERE ROWNUM <= 4
EXCEPT
SELECT * 
FROM Display_nth_row 
WHERE ROWNUM <= 3;
--///////////////////////////////////////////
SELECT *
FROM (
    SELECT ROW_NUMBER() OVER (ORDER BY (SELECT NULL)) AS r, ENAME, SAL
    FROM Display_nth_row
) AS temp
WHERE r = 4;
--////////////////////
SELECT *
FROM (
    SELECT ROW_NUMBER() OVER (ORDER BY (SELECT NULL)) AS r, ENAME, SAL
    FROM Display_nth_row
) AS temp
WHERE r IN (4, 6, 8);

