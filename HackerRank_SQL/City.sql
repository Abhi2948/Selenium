Create Table City(ID int, Name varchar(25), COUNTRYCODE varchar(25), DISTRICT varchar(25), POPULATION int);

INSERT INTO City (ID, Name, COUNTRYCODE, DISTRICT, POPULATION)
VALUES
    (3878, 'Scottsdale', 'USA', 'Arizona', 202705),
    (3965, 'Corona', 'USA', 'California', 124966),
    (3973, 'Concord', 'USA', 'California', 121780),
    (3977, 'Cedar Rapids', 'USA', 'Iowa', 120758),
    (3982, 'Coral Springs', 'USA', 'Florida', 117549);

--Select * from City;
--select * from city where Population>200000 and countrycode = 'Usa';
--select Name from city where Population>120000 and countrycode = 'Usa';
Select * from City where ID = 3977;

INSERT INTO City(ID, Name, COUNTRYCODE, DISTRICT, POPULATION)
VALUES
(1613, 'Neyagawa', 'JPN', 'Osaka', 257315),
(1630, 'Ageo', 'JPN', 'Saitama', 209442),
(1661, 'Sayama', 'JPN', 'Saitama', 162472),
(1681, 'Omuta', 'JPN', 'Fukuoka', 142889),
(1739, 'Tokuyama', 'JPN', 'Yamaguchi', 107078);
Select * from City;
select Name from City where CountryCode ='JPN';
select * from City where CountryCode ='JPN';
