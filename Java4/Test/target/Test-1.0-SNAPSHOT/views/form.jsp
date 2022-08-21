<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<form action="/Test/index" method="post">
    <div class="form-group">
        <label for="maSv">Mã sinh viên</label>
        <input type="text"
               class="form-control" name="maSv" id="maSv"
        >
    </div>
    <div class="form-group">
        <label for="hoTen">Họ tên</label>
        <input type="text"
               class="form-control" name="hoTen" id="hoTen"
        >
    </div>
    <div class="form-group">
        <label>Giới tính</label>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gioiTinh"
                   id="nam" value="true" checked>
            <label class="form-check-label" for="nam">Nam</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gioiTinh"
                   id="nu" value="false">
            <label class="form-check-label" for="nu">Nữ</label>
        </div>
    </div>

    <div class="form-group">
        <label>Chuyên ngành</label>
        <select class="form-select" name="chuyenNganh">
            <option selected disabled>Chọn chuyên ngành</option>
            <option value="UDPM">Ứng dụng phần mềm</option>
            <option value="TKDH">Thiết kế đồ họa</option>
            <option value="MKT">Maketing</option>
        </select>
    </div>
    <div class="form-group">
        <label for="sdt">SĐT</label>
        <input type="text"
               class="form-control" name="sdt" id="sdt"
        >
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="email"
               class="form-control" name="email" id="email"
        >
    </div>
    <button class="btn btn-primary mt-3">Lưu</button>
</form>