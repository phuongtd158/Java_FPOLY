<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<form method="POST"
      action="/TestConnect/users/store">
    <div>
        <label>Họ tên</label>
        <input type="text" name="hoTen"/>
    </div>
    <div>
        <label>Địa chỉ</label>
        <input type="text" name="diaChi"/>
    </div>
    <div>
        <label>Email</label>
        <input type="email" name="email"/>
    </div>
    <div>
        <label>Password</label>
        <input type="password" name="password"/>
    </div>
    <div>
        <label>SĐT</label>
        <input type="text" name="sdt"/>
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1"/>
        <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0"/>
        <label>Nữ</label>
    </div>
    <div>
        <button>Đăng ký</button>
        <button type="reset">Xóa form</button>
    </div>
</form>
