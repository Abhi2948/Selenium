create table AlternateRecord(empno int,ename varchar(25),job varchar(25), mgr int,hiredate date,sal int,deptno int);
INSERT INTO AlternateRecord (empno, ename, job, mgr, hiredate, sal, deptno) VALUES
(101, 'Alice', 'Manager', NULL, '2020-01-15', 7500, 10),
(102, 'Bob', 'Analyst', 101, '2021-03-20', 6500, 20),
(103, 'Charlie', 'Clerk', 102, '2022-05-25', 3500, 30),
(104, 'David', 'Manager', NULL, '2019-08-10', 8000, 20),
(105, 'Eve', 'Salesman', 104, '2021-11-05', 4500, 30),
(106, 'Frank', 'Clerk', 104, '2022-06-15', 3200, 10),
(107, 'Grace', 'Analyst', 101, '2020-12-30', 6700, 20),
(108, 'Hannah', 'Salesman', 102, '2023-02-10', 5000, 30),
(109, 'Ian', 'Manager', NULL, '2018-07-18', 9000, 10),
(110, 'Jane', 'Clerk', 109, '2021-09-22', 3800, 20);

-- View the data to confirm insertion
SELECT * FROM AlternateRecord;
WITH NumberedRecords AS (
    SELECT 
        empno, 
        ename, 
        sal, 
        ROW_NUMBER() OVER (ORDER BY empno) AS rn
    FROM AlternateRecord
)
SELECT empno, ename, sal, rn
FROM NumberedRecords
WHERE rn % 2 != 0;--for odd
WITH NumberedRecords AS (
    SELECT 
        empno, 
        ename, 
        sal, 
        ROW_NUMBER() OVER (ORDER BY empno) AS rn
    FROM AlternateRecord
)
SELECT empno, ename, sal, rn
FROM NumberedRecords
WHERE rn % 2 = 0;

