create database CRMLeasds;
use CRMLeasds;
select * from Leads;
alter procedure GetAllLeads
as
begin
select Id,LeadDate,name,emailaddress,mobile,leadsource,leadstatus,nextfollowupdate from leads
end

exec GetAllLeads
alter procedure AddLead
@LeadDate datetime,
@Name varchar(100),
@EmailAddress varchar(100),
@Mobile varchar(10),
@LeadSource varchar(50),
@Leadstatus varchar(10),
@NextFollowUpdate datetime
As
begin
insert into Leads(LeadDate,Name,EmailAddress,Mobile,LeadSource,LeadStatus,NextFollowUpDate)
values
(@LeadDate,@Name,@EmailAddress,@Mobile,@LeadSource,@LeadStatus,@NextFollowUpDate)
end
exec AddLead '2023-12-24', 'robbin', 'robbin@gmail.com', '9891077769', 'web', 'open', '2023-12-24';
exec getallleads