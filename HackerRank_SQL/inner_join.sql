create table emp(empno int,ename varchar(25),job varchar(25),mgr int,hiredate date,sal int,deptno int)
-- Insert 10 rows into the emp table
INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, deptno) VALUES
(101, 'John Doe', 'Manager', NULL, '2023-01-01', 80000, 10),
(102, 'Jane Smith', 'Clerk', 101, '2023-02-15', 35000, 20),
(103, 'Bob Johnson', 'Analyst', 101, '2023-03-20', 60000, 10),
(104, 'Alice Brown', 'Salesman', 102, '2023-04-10', 45000, 30),
(105, 'Charlie Davis', 'Clerk', 102, '2023-05-12', 30000, 20),
(106, 'Emily White', 'Analyst', 103, '2023-06-18', 62000, 10),
(107, 'Frank Moore', 'Salesman', 104, '2023-07-25', 47000, 30),
(108, 'Grace Wilson', 'Manager', NULL, '2023-08-30', 90000, 20),
(109, 'Hannah Evans', 'Clerk', 108, '2023-09-12', 34000, 20),
(110, 'Ian Taylor', 'Salesman', 107, '2023-10-05', 48000, 30);

create table dept(deptno int,dname varchar(25),loc varchar(25))
-- Insert rows into the dept table
INSERT INTO dept (deptno, dname, loc) VALUES
(10, 'Accounting', 'New York'),
(20, 'Research', 'Dallas'),
(30, 'Sales', 'Chicago'),
(40, 'Operations', 'San Francisco');
select ename,sal,dept.deptno,dname,loc from emp,dept where emp.deptno=dept.deptno and loc='new york'
select sum(sal),dname from emp,dept where emp.deptno=dept.deptno group by dname