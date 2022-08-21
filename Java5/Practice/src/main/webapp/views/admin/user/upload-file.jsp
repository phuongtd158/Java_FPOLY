<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/admin/user/upload-file" method="POST" enctype="multipart/form-data">
		<input type="file" name="upload-file">
		<button>Submit</button>
	</form>
</body>
</html>