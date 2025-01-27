Select * from Employee
--Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, 
--but did not realize her keyboard's  key was broken until after completing the calculation. 
--She wants your help finding the difference between her miscalculation (using salaries with any zeros removed), 
--and the actual average salary.
--Write a query calculating the amount of error (i.e.:  average monthly salaries), and round it up to the next integer.
SELECT CEILING(ABS( (SELECT AVG(SALARY * 1.0) FROM EMPLOYEE) 
									- 
				(SELECT AVG(CAST(REPLACE(CAST(SALARY AS VARCHAR), '0', '') 
				AS BIGINT) * 1.0) FROM EMPLOYEE) )) AS result;
/*This SQL query calculates a value using the salaries of employees in an `EMPLOYEES` table.
Here's an explanation of each component:

### Query Breakdown:

#### 1. **Outer Query with CEILING and ABS**
   ```sql
   SELECT CEILING(ABS(...)) AS result;
   ```
   - **`ABS`**: Computes the absolute value of the difference between two average values.
   - **`CEILING`**: Rounds the absolute value up to the nearest integer.
   - **`AS result`**: Labels the final result for easier reference.

#### 2. **First Subquery: Average Salary**
   ```sql
   SELECT AVG(SALARY * 1.0) FROM EMPLOYEES;
   ```
   - **`SALARY * 1.0`**: Converts `SALARY` to a decimal type to avoid integer division (ensures precision).
   - **`AVG(...)`**: Calculates the average of all employee salaries.

#### 3. **Second Subquery: Modified Average**
   ```sql
   SELECT AVG(CAST(REPLACE(CAST(SALARY AS VARCHAR), '0', '') AS BIGINT) * 1.0) FROM EMPLOYEES;
   ```
   - **`CAST(SALARY AS VARCHAR)`**: Converts the `SALARY` column to a string for manipulation.
   - **`REPLACE(..., '0', '')`**: Removes all `0` characters from the salary string.
   - **`CAST(... AS BIGINT)`**: Converts the modified string back into an integer.
   - **`* 1.0`**: Ensures the result is treated as a decimal for precision.
   - **`AVG(...)`**: Calculates the average of these modified salaries.

#### 4. **Difference Between Averages**
   ```sql
   (SELECT AVG(SALARY * 1.0) ...) - (SELECT AVG(...) ...)
   ```
   - Calculates the difference between the average of original salaries and the average of modified salaries.

#### 5. **Result Calculation**
   - **Absolute Value**: Ensures the difference is non-negative.
   - **Ceiling**: Rounds up to the nearest integer.

### Example:
Assume the `EMPLOYEES` table contains:
| SALARY  |
|---------|
| 1000    |
| 2000    |
| 3000    |

- **Original Average**:  
  \( \text{AVG}((1000 + 2000 + 3000) / 3) = 2000 \)

- **Modified Salaries**:  
  Removing `0`s results in `1`, `2`, and `3`.  
  \( \text{AVG}((1 + 2 + 3) / 3) = 2 \)

- **Difference**:  
  \( |2000 - 2| = 1998 \)

- **Ceiling**:  
  \( \text{CEILING}(1998) = 1998 \)

### Purpose:
This query compares the impact of removing `0`s from salaries on the average value. 
The result highlights the magnitude of the difference in rounded form.*/