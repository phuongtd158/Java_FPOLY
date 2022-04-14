create database FPL_DaoTao
go
use FPL_DaoTao
go


create table STUDENTS(
	MASV varchar(20),
	HOTEN nvarchar(50),
	EMAIL varchar(50),
	SODT varchar(15),
	GIOTINH bit,
	DIACHI nvarchar(50),
	HINH nvarchar(50)

	primary key(MASV)
	
)

create table GRADE(
	ID int,
	MASV varchar(20),
	TIENGANH decimal(8, 2),
	TINHOC decimal(8, 2),
	GDTC decimal(8, 2)

	primary key(ID)
	foreign key(MASV) references STUDENTS(MASV)
)

create table USERS(
	USERNAME varchar(50),
	PASSWORD varchar(50),
	ROLE nvarchar(5)

	primary key(USERNAME)
)

insert into STUDENTS(MASV, HOTEN, EMAIL, SODT, GIOTINH, DIACHI, HINH)
values('PH13747', N'Trần Đức Phương', 'phuongtdph13747@gmail.com', '0385606568',1, N'Vĩnh Phúc', null),
	  ('PH13748', N'Lê Minh Thụy', 'thuylmph13748@gmail.com', '0385606568',1, N'Hà Nội', null),
	  ('PH13749', N'Hạ Quyết Chiến', 'chienhqph13749@gmail.com', '0385606568',1, N'Vĩnh Phúc', null),
	  ('PH13750', N'Lương Hoài Nam', 'namhlph13750@gmail.com', '0385606568',1, N'Phú Thọ', null),
	  ('PH13751', N'Nguyễn Minh Phương', 'phuongnmph13751@gmail.com', '0385606568',0, N'Vĩnh Phúc', null)

insert into GRADE(ID, MASV, TIENGANH, TINHOC, GDTC)
values(1,'PH13747', 10, 10, 10),
	  (2,'PH13748', 10, 8, 9),
	  (3,'PH13749', 8, 9, 10),
	  (4,'PH13750', 9, 9, 9),
	  (5,'PH13751', 10, 9, 10)

insert into USERS(USERNAME, PASSWORD, ROLE)
values('phuongtdph13747', 'phuong123', 'hs'),
	  ('thuylmph13748', 'thuy123', 'hs'),
	  ('chienhqph13749', 'chien123', 'hs'),
	  ('namhlph13750', 'nam123', 'hs'),
	  ('phuongnmph13751', 'mphuong123', 'hs')

select * from STUDENTS
select * from GRADE
select * from USERS


