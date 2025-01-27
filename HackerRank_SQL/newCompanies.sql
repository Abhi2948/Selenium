-- Create Company Table
CREATE TABLE Company (
    company_code VARCHAR(10) PRIMARY KEY,
    founder VARCHAR(50)
);

-- Create Lead_Manager Table
CREATE TABLE Lead_Manager (
    lead_manager_code VARCHAR(10) PRIMARY KEY,
    company_code VARCHAR(10),
    FOREIGN KEY (company_code) REFERENCES Company(company_code)
);

-- Create Senior_Manager Table
CREATE TABLE Senior_Manager (
    senior_manager_code VARCHAR(10) PRIMARY KEY,
    lead_manager_code VARCHAR(10),
    company_code VARCHAR(10),
    FOREIGN KEY (lead_manager_code) REFERENCES Lead_Manager(lead_manager_code),
    FOREIGN KEY (company_code) REFERENCES Company(company_code)
);

-- Create Manager Table
CREATE TABLE Manager (
    manager_code VARCHAR(10) PRIMARY KEY,
    senior_manager_code VARCHAR(10),
    lead_manager_code VARCHAR(10),
    company_code VARCHAR(10),
    FOREIGN KEY (senior_manager_code) REFERENCES Senior_Manager(senior_manager_code),
    FOREIGN KEY (lead_manager_code) REFERENCES Lead_Manager(lead_manager_code),
    FOREIGN KEY (company_code) REFERENCES Company(company_code)
);

-- Create Employee Table
CREATE TABLE EmployeeC (
    employee_code VARCHAR(10) PRIMARY KEY,
    manager_code VARCHAR(10),
    senior_manager_code VARCHAR(10),
    lead_manager_code VARCHAR(10),
    company_code VARCHAR(10),
    FOREIGN KEY (manager_code) REFERENCES Manager(manager_code),
    FOREIGN KEY (senior_manager_code) REFERENCES Senior_Manager(senior_manager_code),
    FOREIGN KEY (lead_manager_code) REFERENCES Lead_Manager(lead_manager_code),
    FOREIGN KEY (company_code) REFERENCES Company(company_code)
);

-- Insert data into Company Table
INSERT INTO Company (company_code, founder)
VALUES 
('C1', 'Monika'),
('C2', 'Samantha');

-- Insert data into Lead_Manager Table
INSERT INTO Lead_Manager (lead_manager_code, company_code)
VALUES 
('LM1', 'C1'),
('LM2', 'C2');

-- Insert data into Senior_Manager Table
INSERT INTO Senior_Manager (senior_manager_code, lead_manager_code, company_code)
VALUES 
('SM1', 'LM1', 'C1'),
('SM2', 'LM1', 'C1'),
('SM3', 'LM2', 'C2');

-- Insert data into Manager Table
INSERT INTO Manager (manager_code, senior_manager_code, lead_manager_code, company_code)
VALUES 
('M1', 'SM1', 'LM1', 'C1'),
('M2', 'SM3', 'LM2', 'C2'),
('M3', 'SM3', 'LM2', 'C2');

-- Insert data into Employee Table
INSERT INTO EmployeeC (employee_code, manager_code, senior_manager_code, lead_manager_code, company_code)
VALUES 
('E1', 'M1', 'SM1', 'LM1', 'C1'),
('E2', 'M1', 'SM1', 'LM1', 'C1'),
('E3', 'M2', 'SM3', 'LM2', 'C2'),
('E4', 'M3', 'SM3', 'LM2', 'C2');
Select e.company_code,MAX(Founder),Count(Distinct Lead_manager_code),
COunt(Distinct senior_manager_code),
COunt(Distinct manager_code),
COunt(Distinct employee_code)
from EmployeeC e
left Join
Company c
ON e.Company_code=c.company_code
GRoup by e.Company_code
Order by e.company_code;