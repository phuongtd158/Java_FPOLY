<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 17/03/2022
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <c:if test="${not empty sessionScope.userId}">
            <p class="alert alert-success">Hello ${sessionScope.userId}</p>
            <a href="/Demo_JPA/account/sign-out">Logout</a>
        </c:if>
        <c:if test="${not empty mess}">
            <p class="alert alert-success">${mess}</p>
        </c:if>
        <c:if test="${not empty error}">
            <p class="alert alert-danger">${error}</p>
        </c:if>
        <div class="col-8 offset-4 m-auto">
            <form action="/Demo_JPA/account/edit-profile" method="post">
                <div class="form-group">
                    <label for="userId">ID</label>
                    <input type="text"
                           class="form-control" name="userId" id="userId"
                           value="${user.userId}">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password"
                           class="form-control" name="password" id="password"
                           value="${user.password}">
                </div>
                <div class="form-group">
                    <label for="fullName">Full name</label>
                    <input type="text"
                           class="form-control" name="fullName" id="fullName"
                           value="${user.fullName}">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email"
                           class="form-control" name="email" id="email"
                           value="${user.email}">
                </div>
                <div class="form-group mt-2">
                    <button class="btn btn-warning" formaction="/Demo_JPA/user/update">Update</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
