<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" begin="1" end="5">
    <h1>Hello admin ${username}</h1>
</c:forEach>
<a href="/Demo/LogoutServlet">Log out</a>
</body>
</html>
