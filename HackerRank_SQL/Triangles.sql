Create table Triangles(A INT,B INT,C INT)
INSERT INTO Triangles (A, B, C) VALUES
(8, 15, 17), -- Valid right triangle
(9, 12, 15), -- Scalene triangle
(10, 10, 10), -- Equilateral triangle
(6, 6, 10), -- Isosceles triangle
(2, 2, 3), -- Isosceles triangle
(1, 1, 2); -- Not a triangle (degenerate case)
select * from triangles
SELECT 
    A, B, C,
    CASE 
        WHEN A + B <= C OR A + C <= B OR B + C <= A THEN 'Not A Triangle'
        WHEN A = B AND B = C THEN 'Equilateral'
        WHEN A = B OR B = C OR A = C THEN 'Isosceles'
        ELSE 'Scalene'
    END AS Triangle_Type
FROM TRIANGLES;
 
