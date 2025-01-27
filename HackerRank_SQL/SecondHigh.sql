create database GeeksforGeeks; 
create Table SecondHigh(Empno int, Sal int);
INSERT INTO SecondHigh (Empno, Sal) VALUES
(3176, 5000),
(3177, 6000),
(3178, 5500),
(3170, 7000),
(3171, 6500),
(3172, 4800),
(3173, 7200),
(3174, 5800),
(3175, 6700),
(3179, 6200);
select * from SecondHigh;
--Select max(sal) from SecondHigh;
--select max(sal) from SecondHigh where sal not in (Select max(sal) from SecondHigh);
select max(sal) from SecondHigh where sal < (Select max(sal) from SecondHigh);