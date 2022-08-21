<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 17/03/2022
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <h1>Hello user: ${sessionScope.userId}</h1>
    <li><a href="/Demo_JPA/account/edit-profile">Edit profile</a></li>
    <li><a href="/Demo_JPA/account/change-password">Change password</a></li>
    <li><a href="/Demo_JPA/account/sign-out">Logout</a></li>
</ul>
</body>
</html>
