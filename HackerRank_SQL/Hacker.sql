CREATE TABLE Hackers (
    hacker_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Submissions (
    submission_id INT PRIMARY KEY,
    hacker_id INT,
    challenge_id INT,
    score INT,
    FOREIGN KEY (hacker_id) REFERENCES Hackers(hacker_id)
);
INSERT INTO Hackers (hacker_id, name) VALUES
(4071, 'Rose'),
(74842, 'Lisa'),
(84072, 'Bonnie'),
(4806, 'Angela'),
(26071, 'Frank'),
(80305, 'Kimberly'),
(49438, 'Patrick');
INSERT INTO Submissions (submission_id, hacker_id, challenge_id, score) VALUES
(1, 4071, 19797, 90),
(2, 4071, 49593, 101),
(3, 74842, 19797, 85),
(4, 74842, 63132, 89),
(5, 84072, 49593, 100),
(6, 4806, 19797, 45),
(7, 4806, 49593, 44),
(8, 26071, 19797, 50),
(9, 26071, 49593, 35),
(10, 80305, 49593, 67),
(11, 49438, 19797, 43);
with cte as(
select h.hacker_id,h.name,s.challenge_id,s.score,row_number()over(partition by h.hacker_id,s.challenge_id order by s.score desc)row_num from hackers as h inner join submissions as s
on h.hacker_id=s.hacker_id)
select hacker_id,name,sum(score) as total_sum from cte where row_num=1
group by hacker_id,name
having sum(score)>0
order by sum(score) desc,hacker_id asc