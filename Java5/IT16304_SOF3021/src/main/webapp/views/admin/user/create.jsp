<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create user</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/admin/user/store"
		method="POST" modelAttribute="user">
		<label>Họ tên</label>
		<form:input path="fullName" />
		<form:errors path="fullName" element="span" cssClass="text-danger" />
		<br>
		<label>Password</label>
		<form:input type="password" path="password" />
		<br>
		<label>Địa chỉ</label>
		<form:input path="address" />
		<br>
		<label>Giới tính</label>
		<form:radiobutton path="gender" value="1" label="Nam" />
		<form:radiobutton path="gender" value="0" label="Nữ" />
		<br>
		<label>Email</label>
		<form:input type="email" path="email" />
		<br>
		<label>SĐT</label>
		<form:input path="phoneNumber" />
		<br>
		<label>Avatar</label>
		<form:input path="avatar" />
		<br>
		<button>Lưu</button>
	</form:form>
	<p>Name: ${user.fullName}</p>
	<p>Email: ${user.email}</p>
</body>
</html>