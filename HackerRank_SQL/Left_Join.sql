-- Create the emp table
CREATE TABLE emp1 (
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
INSERT INTO emp1 (empno, ename, job, mgr, hiredate, sal, comm, deptno)
VALUES
    (101, 'Alice', 'Manager', NULL, '2020-01-15', 80000.00, 5000.00, 10),
    (102, 'Bob', 'Developer', 101, '2021-05-20', 60000.00, NULL, 20),
    (103, 'Charlie', 'Analyst', 101, '2022-03-01', 70000.00, 3000.00, 10),
    (104, 'Daisy', 'Clerk', 103, '2023-07-10', 40000.00, NULL, NULL);
	
-- Create the dept table
CREATE TABLE dept1(
    deptno INT PRIMARY KEY,
    dname VARCHAR(50),
    loc VARCHAR(50)
);

-- Insert data into the dept table
INSERT INTO dept1 (deptno, dname, loc)
VALUES
    (10, 'HR', 'New York'),
    (20, 'IT', 'San Francisco'),
    (30, 'Finance', 'Chicago');
	
SELECT 
    ROW_NUMBER() OVER (ORDER BY emp.empno) AS rownum,
    emp.empno, 
    emp.ename , 
    emp.deptno, 
    dept.dname, 
    dept.loc, 
    emp.job
FROM 
    emp
LEFT JOIN 
    dept
ON 
    emp.deptno = dept.deptno;

