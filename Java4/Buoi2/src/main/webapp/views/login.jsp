<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/03/2022
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Demo/login" method="post">
    Username: <input type="text" name="username" value="phuongtd"> <br> <br>
    Password: <input type="password" name="password" value="123"><br> <br>
    <input type="checkbox" name="remember" value="true">Remember me ?<br> <br>
    <input type="submit" value="Login">
</form>
</body>
</html>
