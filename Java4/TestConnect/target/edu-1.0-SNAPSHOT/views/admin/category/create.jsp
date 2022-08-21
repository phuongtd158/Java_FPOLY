<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 02/04/2022
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST"
      action="/TestConnect/categories">
    <div>
        <label>Tên danh mục</label>
        <input type="text" name="ten"/>
    </div>
    <div>
        <label>Người tạo</label>
        <select name="user_id">
            <c:forEach items="${ listUser }" var="user">
                <option value="${ user.id }">
                        ${ user.hoTen }
                </option>
            </c:forEach>
        </select>
    </div>

    <button>Thêm mới</button>
</form>
</body>
</html>
