create database Edusys
go
use	Edusys
go

create table NHANVIEN(
	MaNV varchar(10) not null,
	MatKhau varchar(20) not null,
	HoTen nvarchar(30) not null,
	VaiTro nvarchar(15) not null

	primary key(MaNV)
)
insert into NHANVIEN(MaNV, MatKhau, HoTen, VaiTro) 
values('LuongTV', '123', 'Tran Van Luong', N'Nhân viên')


create table CHUYENDE(
	MaCD varchar(10),
	TenCD nvarchar(50),
	HocPhi float,
	ThoiLuong int,
	Hinh varchar(15),
	MoTa nvarchar(255)

	primary key(MaCD)
)
insert into CHUYENDE(MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)
values('JS01', N'L?p trình Javascript c? b?n', 1500, 50, 'js.png', null),
	  ('JS02', N'L?p trình Javascript nâng cao', 1800, 40, 'js.png', null),
	  ('JAVA01', N'L?p trình Java c? b?n', 2000, 70, 'java.jpg', null),
	  ('JAVA02', N'L?p trình Java nâng cao', 2100, 30, 'java.jpg', null),
	  ('PY01', N'L?p trình Python c? b?n', 1600, 60, 'python.jpg', null),
	  ('PY02', N'L?p trình Python nâng cao', 1700, 40, 'python.png', null),
	  ('SQL02', N'SQL nâng cao', 1500, 70, 'sql.png', null),
	  ('CPL01', N'L?p trình C++', 1800, 50, 'cplus.jpg', null),
	  ('CS01', N'L?p trình C# c? b?n', 1200, 40, 'csharp.png', null),
	  ('HTML01', N'HTML & CSS c? b?n', 1500, 50, 'html.png', null)

	delete from CHUYENDE where MaCD = '1111'

create table KHOAHOC(
	MaKH int identity,
	MaCD varchar(10) not null,
	HocPhi float,
	ThoiLuong int,
	NgayKG date,
	GhiChu nvarchar(255),
	MaNV varchar(10),
	NgayTao date

	primary key(MaKH),
	foreign key(MaNV) references NHANVIEN(MaNV),
	foreign key(MaCD) references CHUYENDE(MaCD)
)

insert into KHOAHOC(MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)
values('SQL02', 500, 50, '2020-09-21', null, 'PhuongNM', '2020-08-21'),
	  ('CS01', 700, 40, '2019-09-21', null, 'PhuongTD', '2019-08-22'),
	  ('HTML01', 800, 20, '2020-04-12', null, 'LuongTV', '2020-02-23'),
	  ('JAVA01', 200, 55, '2019-08-15', null, 'PhuongNM', '2019-01-10'),
	  ('JAVA02', 300, 60, '2020-01-28', null, 'LuongTV', '2020-09-12'),
	  ('JS01', 100, 57, '2020-06-21', null, 'LuongTV', '2020-05-22'),
	  ('JS02', 400, 53, '2019-03-11', null, 'LuongTV', '2019-02-01'),
	  ('PY01', 500, 80, '2021-04-11', null, 'PhuongTD', '2020-09-02'),
	  ('PY02', 900, 30, '2021-07-21', null, 'PhuongTD', '2021-03-08'),
	  ('SQL02', 170, 45, '2021-01-15', null, 'PhuongNM', '2021-01-01')




create table NGUOIHOC(
	MaNH varchar(10) not null,
	MaNV varchar(10) not null,
	HoTen nvarchar(30),
	GioiTinh nvarchar(5),
	NgaySinh date,
	DienThoai varchar(24),
	Email varchar(50),
	GhiChu nvarchar(255),
	NgayDK date,

	primary key(MaNH),
	foreign key(MaNV) references NHANVIEN(MaNV)
)
insert into NGUOIHOC(MaNH,MaNV,HoTen,GioiTinh, NgaySinh, DienThoai,Email, GhiChu,NgayDK)
values('NH02', 'PhuongNM', N'?? Xuân S?n', 'Nam', '2002-10-01', '0383319345', 'doxuanson@gmail.com', null, '2021-08-21'),
	  ('NH03', 'PhuongNM', N'Lê Minh Th?y', 'Nam', '2002-11-01', '0399319345', 'leminhthuy@gmail.com', null, '2020-02-11'),
	  ('NH4', 'PhuongTD', N'Tr?n ??c Anh', 'Nam', '2002-10-01', '0383319345', 'tranducanh@gmail.com', null, '2019-08-30'),
	  ('NH05', 'LuongTV', N'Tr?n Ph??ng Linh', N'N?', '2004-05-27', '0383319345', 'tranphuonglinh@gmail.com', null, '2020-08-21'),
	  ('NH06', 'PhuongNM', N'??ng Tr?ng Hà', 'Nam', '2002-03-15', '0383313345', 'dangtrongha@gmail.com', null, '2021-08-21'),
	  ('NH07', 'PhuongTD', N'?? Ng?c Huy?n', N'N?', '2001-05-21', '0383312245', 'dongochuyen@gmail.com', null, '2020-08-21'),
	  ('NH08', 'PhuongNM', N'H?ng Ng?c', N'N?', '2002-10-11', '0383314445', 'hongngoc@gmail.com', null, '2021-08-21'),
	  ('NH09', 'PhuongNM', N'Lê ??c M?nh', 'Nam', '2003-10-11', '0333319345', 'leducmanh@gmail.com', null, '2019-08-21'),
	  ('NH10', 'PhuongTD', N'Ki?u Thúy', N'N?', '2002-09-12', '0383355345', 'kuythuy@gmail.com', null, '2019-08-21'),
	  ('NH11', 'LuongTV', N'Hoa Linh', N'N?', '2002-02-20', '0383377345', 'hoalinh@gmail.com', null, '2021-08-21')

drop table HOCVIEN
create table HOCVIEN(
	MaHV int identity(1, 1),
	MaKH int,
	MaNH varchar(10),
	Diem float

	primary key(MaHV),
	foreign key(MaKH) references KHOAHOC(MaKH),
	foreign key(MaNH) references NGUOIHOC(MaNH)
)
set IDENTITY_INSERT  hocvien on

insert into HOCVIEN(MaKH, MaNH, Diem)
values
	  (2,'NH06', 7 ),
	  (3,'NH07', -1 ),
	  (4,'NH08', 5 ),
	  (5,'NH09', -1 ),
	  (6,'NH10', -1 )
	insert into HOCVIEN(MaKH, MaNH, Diem)
values
	  (2,'NH06', 7 )




SELECT * FROM HOCVIEN
select * from NGUOIHOC

select * from CHUYENDE
select * from NHANVIEN

--INSERT INTO HOCVIEN(MaHV, MaKH, MaNH, Diem) VALUES (?, ?, ?, ?)
--UPDATE HOCVIEN SET Diem WHERE MaHV = ?
--DELETE FROM HOCVIEN WHERE MaHV = ?
--SELECT * FROM HOCVIEN WHERE MaHV = ?

create proc sp_BangDiem(@MaKH int)
as begin
		select
			NGUOIHOC.MaNH,
			NGUOIHOC.HoTen,
			HOCVIEN.Diem
		from HOCVIEN join NGUOIHOC on NGUOIHOC.MaNH = HOCVIEN.MaNH
		where HOCVIEN.MaKH = @MaKH
		order by Diem desc
	end
	
create proc sp_TongKeNguoiHoc
as begin
		select
			YEAR(NgayDK) Nam,
			COUNT(*) as SoLuong,
			MIN(NgayDK) as DauTien,
			MAX(NgayDK) as CuoiCung
		from NGUOIHOC
		group by YEAR(NgayDK)
end

create proc sp_ThongKeDoanhThu(@Year int)
as begin
		select
			TenCD as ChuyenDe,
			COUNT(DISTINCT KHOAHOC.MaKH) as SoKH,
			COUNT(HOCVIEN.MaHV) as SoHV,
			SUM(KHOAHOC.HocPhi) as DoanhThu,
			MIN(KHOAHOC.HocPhi) as ThapNhat,
			MAX(KHOAHOC.HocPhi) as CaoNhat,
			AVG(KHOAHOC.HocPhi) as TrungBinh
		from KHOAHOC join HOCVIEN on KHOAHOC.MaKH = HOCVIEN.MaKH
					 join CHUYENDE on CHUYENDE.MaCD = KHOAHOC.MaCD
		where YEAR(NgayKG) = @Year
		group by TenCD
	end

create proc sp_ThongKeDiem
as begin
		select
			TenCD as ChuyenDe,
			COUNT(MaHV) as SoHV,
			MIN(Diem) as ThapNhat,
			MAX(Diem) as CaoNhat,
			AVG(Diem) as TrungBinh
		from KHOAHOC join HOCVIEN on KHOAHOC.MaKH = HOCVIEN.MaKH
					 join CHUYENDE on CHUYENDE.MaCD = KHOAHOC.MaCD

		group by TenCD
	end
