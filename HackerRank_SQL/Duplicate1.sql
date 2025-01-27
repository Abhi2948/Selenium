create table Duplicate1(ename varchar(50))
INSERT INTO Duplicate1 (ename) VALUES
('Alice'),
('Bob'),
('Charlie'),
('Alice'),
('Eve'),
('Bob'),
('David'),
('Charlie'),
('Frank'),
('Alice');

-- View the data to confirm insertion
SELECT * FROM Duplicate1;
select ename,count(*) from Duplicate1
group by ename
having count(*)>1;