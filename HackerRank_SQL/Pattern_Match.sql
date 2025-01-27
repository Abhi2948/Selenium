create table Pattern_Match(ename varchar(25),month varchar(25));
insert into Pattern_Match(ename,month) values

('Alice','jan'),
('Bob','feb'),
('Charlie','march'),
('David','april'),
('Eve','may'),
('Frank','june'),
('Grace','july'),
('Hank','aug'),
('Ivy','sept'),
('Jack','oct'),
('Kathy','nov'),
('Leo','dec'),
('Mona','jan'),
('Nina','dec');
select * from Pattern_Match 
--select ename from Pattern_Match where ename Like 'M%'
--select ename from Pattern_Match where ename Like '%a'
--select ename from Pattern_Match where ename  Like  '____'
select ename from Pattern_Match where ename  Like  '_l%'

SELECT month, ename
FROM Pattern_Match
WHERE month = 'jan';
drop table Pattern_Match