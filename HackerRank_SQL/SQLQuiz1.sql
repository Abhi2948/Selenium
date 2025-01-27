create database QuizApp
use QuizApp
create table tabl_admin(
ad_id int primary key identity,
ad_name nvarchar(20) not null unique,
ad_pass nvarchar(20) not null,
)
create table tbl_questions
(
q_id int primary key identity,
q_text nvarchar(max) not null ,
QA nvarchar(20) not null UNIQUE,
QB nvarchar(20) not null UNIQUE,
QC nvarchar(20) not null UNIQUE,
QD nvarchar(20) not null UNIQUE,
QCorrectAns nvarchar(20) not null,
)
create table student
(
std_id int primary key identity,
std_name  nvarchar(20) not null unique,
std_password nvarchar(20) not null ,
std_image nvarchar(max) not null,
)

create table tbl_setExam
(
examId int primary key identity,
exam_date datetime,
exam_fk_stu int foreign key references student(std_id),
exam_name nvarchar(20) not null,
std_score int

)