Create table HighestSal(Deptno INt,SAL INT, Ename varchar(25));
-- Insert sample rows into the HighestSal table
INSERT INTO HighestSal (Deptno, SAL, Ename) VALUES
(10, 9000, 'Alice'),
(20, 8500, 'Bob'),
(30, 8700, 'Charlie'),
(10, 9500, 'David'),
(20, 9100, 'Eva'),
(30, 8800, 'Frank'),
(10, 9200, 'Grace'),
(20, 9400, 'Hannah'),
(30, 8900, 'Ian'),
(10, 9300, 'Jane');

-- View the data to confirm insertion
SELECT * FROM HighestSal;
select max(Sal) from HighestSal;
select min(Sal) from HighestSal;
select max(Sal),deptno from HighestSal group by Deptno
select min(Sal),deptno from HighestSal group by Deptno
select count(*) as totalemp, deptno from HighestSal group by deptno 