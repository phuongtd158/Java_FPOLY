<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<form method="POST"
      action="/PH13747_TranDucPhuong_Lab5_300322/update?id=${user.id}">
    <div>
        <label>Họ tên</label>
        <input class="form-control" type="text" name="hoTen" value="${user.hoTen}"/>
    </div>
    <div>
        <label>Địa chỉ</label>
        <input class="form-control" type="text" name="diaChi" value="${user.diaChi}"/>
    </div>
    <div>
        <label>Email</label>
        <input class="form-control" type="email" name="email" value="${user.email}"/>
    </div>
    <div>
        <label>Password</label>
        <input class="form-control" type="password" name="password" value="${user.password}" disabled/>
    </div>
    <div>
        <label>SĐT</label>
        <input class="form-control" type="text" name="sdt" value="${user.sdt}"/>
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1"/>
        <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0"/>
        <label>Nữ</label>
    </div>
    <div>
        <button class="btn btn-success">Đăng ký</button>
        <button class="btn btn-info" type="reset">Xóa form</button>
    </div>
</form>