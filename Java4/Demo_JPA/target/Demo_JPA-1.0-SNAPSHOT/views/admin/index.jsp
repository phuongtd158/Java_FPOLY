<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-8 m-auto">
            <c:if test="${not empty sessionScope.userId}">
                <h1>Hello admin: ${userId}</h1>
            </c:if>
            <c:if test="${not empty mess}">
                <p class="alert alert-success">${mess}</p>
            </c:if>
            <c:if test="${not empty error}">
                <p class="alert alert-danger">${error}</p>
            </c:if>
            <form action="/Demo_JPA/user/index" method="post">
                <div class="form-group">
                    <label for="userId">ID</label>
                    <input type="text" class="form-control" name="userId" id="userId" value="${user.userId}">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" value="${user.password}">
                </div>
                <div class="form-group">
                    <label for="fullName">Full name</label>
                    <input type="text" class="form-control" name="fullName" id="fullName" value="${user.fullName}">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email" id="email" value="${user.email}">
                </div>
                <div class="form-group">
                    <label>Role </label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="admin" id="admin"
                               value="true" ${user.admin==true ? 'checked' : '' }>
                        <label class="form-check-label" for="admin">Admin</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="admin" id="user"
                               value="false" ${!user.admin==true ? 'checked' : '' }>
                        <label class="form-check-label" for="user">User</label>
                    </div>
                </div>

                <div class="form-group mt-2">
                    <button class="btn btn-primary" formaction="/Demo_JPA/user/create">Insert</button>
                    <button class="btn btn-warning" formaction="/Demo_JPA/user/update">Update</button>
                    <button class="btn btn-info" formaction="/Demo_JPA/user/reset">Reset</button>
                </div>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-8 m-auto">
            <div class="row">
                <div class="col-6 offset-6">
                    <form action="/Demo_JPA/user/search" class="row">
                        <input type="text" class="form-control " name="keyword" style="width: 70%">
                        <button class="btn btn-primary " style="width: 25%; margin-left: 10px">Search</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-8 m-auto" style="overflow: auto; height: 450px">
            <table class="table table-striped table-responsive">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Full name</th>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="u" items="${users}">
                    <tr>
                        <td>${u.userId}</td>
                        <td>${u.fullName}</td>
                        <td>${u.email}</td>
                        <td>${u.admin == true ? "Admin" : "User"}</td>
                        <td>
                            <a class="btn btn-warning btn-edit" href="/Demo_JPA/user/edit?userId=${u.userId}">Edit </a>
                            <a class="btn btn-danger" href="/Demo_JPA/user/delete?userId=${u.userId}">Delete </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script>

</script>
</body>

</html>