CREATE TABLE OCCUPATIONS (
    Name VARCHAR(50),
    Occupation VARCHAR(20)
);

INSERT INTO OCCUPATIONS (Name, Occupation) VALUES
('Ashley', 'Professor'),
('Christeen', 'Professor'),
('Jane', 'Actor'),
('Jenny', 'Doctor'),
('Julia', 'Actor'),
('Ketty', 'Professor'),
('Maria', 'Actor'),
('Meera', 'Singer'),
('Priya', 'Singer'),
('Samantha', 'Doctor');
select Concat(name,'(',Left(Occupation,1),')') from OCCUPATIONS order by name
select concat('There are a total of ',count(occupation),' ',Lower(Occupation),'s.') from OCCUPATIONS 
group by Occupation order by Count(Occupation),Occupation asc