<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello ${username}</h1>
	<form action="/IT16304_SOF3021/hello" method="GET">
		<input type="text" name="name">
		<button>Submit</button>
	</form>
</body>
</html>