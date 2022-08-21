<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-8 m-auto">
            <form:form
                    action="${pageContext.request.contextPath}/admin/account/update/${account.id}"
                    method="POST" modelAttribute="account">
                <div class="form-group">
                    <label for="fullName">Họ tên</label>
                    <form:input path="fullName" class="form-control" id="fullname" />
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <form:input type="email" path="email" class="form-control"
                                id="email" />
                </div>
                <div class="form-group">
                    <label for="username">Username</label>
                    <form:input path="username" class="form-control" id="username" autocomplete="off"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <form:password path="password" class="form-control" id="password" />
                </div>
                <div class="form-group">
                    <label for="photo">Photo</label>
                    <form:input path="photo" class="form-control" id="photo" />
                </div>
                <div class="form-group">
                    <label for="admin">Admin</label>
                    <form:select path="admin" class="form-select">
                        <form:option value="1">Admin</form:option>
                        <form:option value="0">User</form:option>
                    </form:select>
                </div>
                <div class="form-group">
                    <label for="activated">Activated</label>
                    <form:select path="activated" class="form-select">
                        <form:option value="1">Activated</form:option>
                        <form:option value="0">Inactivate</form:option>
                    </form:select>
                </div>
                <button class="btn btn-primary mt-3">Create</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>