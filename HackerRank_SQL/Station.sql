create table Station(ID int, City varchar(25), State varchar(25), Lat_N int,Long_W int)
EXEC sp_rename 'Weather', 'Station';
INSERT INTO Station (ID, City, State, Lat_N, Long_W)
VALUES
(1, 'San Francisco', 'California', 37, 122),
(2, 'New York', 'New York', 40, 74),
(3, 'Chicago', 'Illinois', 41, 87),
(4, 'Houston', 'Texas', 29, 95),
(5, 'Phoenix', 'Arizona', 33, 112),
(6, 'Philadelphia', 'Pennsylvania', 39, 75),
(7, 'San Antonio', 'Texas', 29, 98),
(8, 'San Diego', 'California', 32, 117),
(9, 'Dallas', 'Texas', 32, 96),
(10, 'San Jose', 'California', 37, 121),
(11, 'Austin', 'Texas', 30, 97),
(12, 'Jacksonville', 'Florida', 30, 81),
(13, 'Fort Worth', 'Texas', 32, 97),
(14, 'Columbus', 'Ohio', 39, 82),
(15, 'Indianapolis', 'Indiana', 39, 86);
Select * from Station
Select Distinct City from station where
(city Like '%a' or city Like '%e'or city Like '%i' or city Like '%o' or city Like '%u');--ending
Select Distinct City from station where
(city Like 'A%' or city Like 'E%'or city Like 'I%' or city Like 'O%' or city Like 'U%');--starting
Select Distinct City from station where
(city Like '%a' or city Like '%e'or city Like '%i' or city Like '%o' or city Like '%u')
and
(city Like 'A%' or city Like 'E%'or city Like 'I%' or city Like 'O%' or city Like 'U%');
Select Distinct City from station where not
(city Like 'A%' or city Like 'E%'or city Like 'I%' or city Like 'O%' or city Like 'U%');--not start with vowel
Select Distinct City from station where not
(city Like '%a' or city Like '%e'or city Like '%i' or city Like '%o' or city Like '%u');--not end with vowel
Select Distinct City from station where not
(city Like 'A%' or city Like 'E%'or city Like 'I%' or city Like 'O%' or city Like 'U%') or
not
(city Like '%a' or city Like '%e'or city Like '%i' or city Like '%o' or city Like '%u');
Select Distinct City from station where not
(city Like 'A%' or city Like 'E%'or city Like 'I%' or city Like 'O%' or city Like 'U%') and
not
(city Like '%a' or city Like '%e'or city Like '%i' or city Like '%o' or city Like '%u');
Select (count(City)-count(Distinct City)) as Difference from Station;
--Select City,State from Station;
select Distinct City from station where ID % 2=0 ;
