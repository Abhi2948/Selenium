Select * from city
select (max(population) - min(population)) from city
Select SUM(Population) from city where COuntryCOde ='JPN';
Select Avg(Population) from city where District ='California';
--select Count(Name) from City where population>150000;
select sum(Population) from city where District ='California';