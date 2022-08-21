<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<table class="table">
    <tr>
        <th>Mã sinh viên</th>
        <th>Họ tên</th>
        <th>Giới tính</th>
        <th>Chuyên ngành</th>
        <th>SĐT</th>
        <th>Email</th>
        <th>Thời gian tạo</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.maSv}</td>
            <td>${student.hoTen}</td>
            <td>${student.gioiTinh == true ? "Nam" :"Nữ"}</td>
            <td>${student.chuyenNganh}</td>
            <td>${student.sdt}</td>
            <td>${student.email}</td>
            <td>
                <fmt:formatDate value="${student.thoiGianTao}" pattern="dd/MM/yyyy hh:mm:ss"/>
            </td>
        </tr>
    </c:forEach>

</table>