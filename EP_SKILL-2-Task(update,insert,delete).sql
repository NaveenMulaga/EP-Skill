create database ep;
use ep;
create table employee(ID int primary key,Name varchar(20),Email varchar(25),Designation varchar(15), DOB varchar(20), age int,salary bigint);
desc employee;
insert into employee values(1000,'Sergio','professor@gmail.com','Professor','15-oct-1998',22,25000);
insert into employee values(1001,'Berlin','berlin123@gmail.com','Ass Professor','17-sep-1996',24,20000);
insert into employee values(1002,'Nairobi','nairobihere@gmail.com','Ass Professor','16-apr-1999',21,18000);
insert into employee values(1003,'Tokyo','iamtokyo@gmail.com','Ass Professor','10-Nov-2000',20,18000);
insert into employee values(1004,'Denver','denverhere123@gmail.com','Ass Professor','11-june-1998',22,17000);
select * from employee;
/* UPDATE*/
update employee set Name= 'Rio' ,Email='riohere@gmail.com' WHERE ID= 1004;
select * from employee;

/*insert*/
insert into employee values(1105,'Helsinki','helsinki@gmail.com','Professor','01-jan-1991',30,20000);
insert into employee values(1106,'Bogota','itsmebogota@gmail.com','Ass Professor','25-mar-1992',29,21000);
select * from employee;

/*delete*/
delete from employee where Id=1106;
select * from employee;

/*adding one more column*/
alter table employee add(Department varchar(20));
select * from employee;
desc employee;

 