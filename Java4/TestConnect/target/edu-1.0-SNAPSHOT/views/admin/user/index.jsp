<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table class="table">
    <tr>
        <th>Họ tên</th>
        <th>Số điện thoại</th>
        <th>Địa chỉ</th>
        <th>Email</th>
        <th>Thao tác</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.hoTen}</td>
            <td>${u.sdt}</td>
            <td>${u.diaChi}</td>
            <td>${u.email}</td>
            <td>
                <a href="/TestConnect/users/delete?id=${u.id}" class="btn btn-danger">Xóa</a>
                <a href="/TestConnect/users/edit?id=${u.id}" class="btn btn-warning">Cập nhật</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/TestConnect/users/create" class="btn btn-primary">Thêm</a>