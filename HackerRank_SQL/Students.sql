Create table Students(ID INT, Name varchar(25), Marks Int)
Insert into Students(ID,Name,Marks) values(1,'Ankur',81),(2,'abhi',75),(3,'sankalp',76),(4,'anshul',84),(5,'batoli',68);
select * from Students;
select Name from Students where Marks>75 order by RIGHT(name,3),ID ASC;
