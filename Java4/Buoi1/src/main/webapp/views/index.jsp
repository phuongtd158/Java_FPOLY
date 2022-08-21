<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 08/03/2022
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IT16302</title>
</head>
<body>

<form action="/HelloWorld/HelloServlet" method="get" id="btn">
    Họ tên: <input type="text" name="name">
    <br> <br>
    <button>Gửi</button>
</form>

<h1 style="color: red">Hello ${name}</h1>

</body>
</html>
