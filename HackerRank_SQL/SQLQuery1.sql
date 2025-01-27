
--create table Emp (ID INT IDENTITY (1,1) , Name VARCHAR(100) , deptID INT )

--create table dept (ID INT IDENTITY (1,1) , Name VARCHAR(100)  )

--INSERT INTO EMP VALUES('Pateriya',1),('Somesh',2),('Abhijeet',3)
--INSERT INTO EMP VALUES('birju',4),('nidhi',10),('xyz',1)

--INSERT INTO dept VALUES ('HR') , ('Dev')


SELECT * FROM 
Emp 

SELECT * FROM 
dept 

SELECT * FROM 
Emp E 
LEFT JOIN DEPT D ON (E.Deptid = D.id)
WHERE d.id IS NULL