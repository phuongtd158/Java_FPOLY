<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<table class="table">
    <tr>
        <th>Họ tên</th>
        <th>Số điện thoại</th>
        <th>Địa chỉ</th>
        <th>Email</th>
        <th colspan="2">Thao tác</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.hoTen}</td>
            u0
            <td>${u.sdt}</td>
            <td>${u.diaChi}</td>
            <td>${u.email}</td>
            <td>
                <a
                        data-bs-toggle="modal"
                        data-bs-target="#exampleModal${u.id}"
                        class="btn btn-danger">Xóa</a>
                <!-- Modal -->
                <div class="modal fade" id="exampleModal${u.id}" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                Bạn có muốn xóa người dùng ${u.hoTen} không ?
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <a type="button" class="btn btn-primary"
                                   href="/PH13747_TranDucPhuong_Lab5_300322/delete?id=${u.id}">Xóa</a>
                            </div>
                        </div>
                    </div>
                </div>
            </td>
            <td>
                <a href="/PH13747_TranDucPhuong_Lab5_300322/edit?id=${u.id}" class="btn btn-warning">Cập nhật</a>
            </td>
        </tr>

    </c:forEach>
</table>
<a href="/PH13747_TranDucPhuong_Lab5_300322/create" class="btn btn-primary">Thêm</a>