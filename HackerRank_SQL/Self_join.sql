-- Create the emp table
CREATE TABLE emp (
    empno INT,
    ename VARCHAR(25),
    job VARCHAR(25),
    mgr INT,
    hiredate DATE,
    sal INT,
    deptno INT
);

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
select * from emp
--select e1.ename "employees",e2.ename "manager" from emp e1,emp e2 where e2.empno=e1.mgr
--select e1.ename "employees",e2.ename "manager",e2.sal from emp e1,emp e2 where e1.sal>e2.sal and e1.mgr=e2.empno
select e1.ename "employees",e2.ename "manager",e2.sal from emp e1,emp e2 where e1.hiredate>e2.hiredate and e1.mgr=e2.empno