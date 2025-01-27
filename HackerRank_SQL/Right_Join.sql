-- Create the emp table
CREATE TABLE emp2 (
    empno INT PRIMARY KEY,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10, 2),
    comm DECIMAL(10, 2),
    deptno INT
);

-- Insert data into the emp table
INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES
    (101, 'Alice', 'Manager', NULL, '2020-01-15', 80000.00, 5000.00, 10),
    (102, 'Bob', 'Developer', 101, '2021-05-20', 60000.00, NULL, 20),
    (103, 'Charlie', 'Analyst', 101, '2022-03-01', 70000.00, 3000.00, 10),
    (104, 'Daisy', 'Clerk', 103, '2023-07-10', 40000.00, NULL, NULL);

-- Create the dept table
CREATE TABLE dept2 (
    deptno INT PRIMARY KEY,
    dname VARCHAR(50),
    loc VARCHAR(50)
);

-- Insert data into the dept table
INSERT INTO dept2 (deptno, dname, loc)
VALUES
    (10, 'HR', 'New York'),
    (20, 'IT', 'San Francisco'),
    (30, 'Finance', 'Chicago');


	select * from emp2;
	select * from dept2;
	SELECT 
    ROW_NUMBER() OVER (ORDER BY dept2.deptno) AS rownum,
    emp2.empno, 
    emp2.ename, 
    emp2.deptno, 
    dept2.dname, 
    dept2.loc, 
    emp2.job
FROM 
    emp2
RIGHT JOIN 
    dept2
ON 
   dept2.deptno= emp2.deptno ;
