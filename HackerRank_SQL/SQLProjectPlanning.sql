create table project(Task_ID int,Start_Date date,End_Date date)
INSERT INTO project (Task_ID, Start_Date, End_Date) VALUES
(1, '2023-01-01', '2023-01-03'),
(2, '2023-01-04', '2023-01-05'),
(3, '2023-01-07', '2023-01-09'),
(4, '2023-01-10', '2023-01-11'),
(5, '2023-02-01', '2023-02-03'),
(6, '2023-02-04', '2023-02-06'),
(7, '2023-02-07', '2023-02-08'),
(8, '2023-02-10', '2023-02-12'),
(9, '2023-03-01', '2023-03-03'),
(10, '2023-03-04', '2023-03-05');

with cte as(
select *,row_number()over(order by end_date asc)row_num from project),
cte1 as(

select distinct Min(start_date)over(partition by dateadd(day,-1*row_num,end_date)order by dateadd(day,-1*row_num,end_date))firstdate,
 Max(end_date)over(partition by dateadd(day,-1*row_num,end_date)order by dateadd(day,-1*row_num,end_date))lastdate

from cte)
select firstdate,lastdate from cte1
order by datediff(day,firstdate,lastdate)asc,firstdate asc
