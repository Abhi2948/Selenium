create Table uni_on1(city varchar(25),country varchar(90));
INSERT INTO uni_on1 (city, country) VALUES
('New York', 'USA'),
('London', 'UK'),
('Tokyo', 'Japan');

create Table uni_on2(city varchar(25),country varchar(90));
INSERT INTO uni_on2 (city, country) VALUES
('London', 'UK'),
('Paris', 'France'),
('New York', 'USA'),
('Tokyo', 'Japan');

select city from uni_on1
union
select city from uni_on2;
select city from uni_on1
union all
select city from uni_on2;