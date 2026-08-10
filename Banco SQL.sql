create database Gest

create table users(
Id INT IDENTITY PRIMARY KEY,
Nome VARCHAR(100) NOT NULL,
Salario DECIMAL(10,2) DEFAULT 0.00,
Gastos DECIMAL(10,2) DEFAULT 0.00)

insert into users( Nome, Salario, Gastos)
values ('José', 1621, 500)

insert into users( Nome, Salario, Gastos)
values ('Regina', 2500, 1800)

insert into users( Nome, Salario, Gastos)
values ('Ramon', 1600, 2000)

select * from users

UPDATE users
SET Gastos = 950.00
WHERE id = 1;

select * from users

DELETE from users
where id = 3

select * from users

