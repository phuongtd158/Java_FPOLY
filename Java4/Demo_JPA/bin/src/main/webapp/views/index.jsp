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
            <%--            <c:if test="${not empty mess}">--%>
            <%--                --%>
            <%--            </c:if>--%>
            <p class="alert alert-success">${mess}</p>
            <p class="alert alert-danger">${error}</p>

            <form action="/Demo_JPA/user/index" method="post">
                <div class="form-group">
                    <label for="userId">ID</label>
                    <input type="text" class="form-control" name="userId" id="userId">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password">
                </div>
                <div class="form-group">
                    <label for="fullName">Full name</label>
                    <input type="text" class="form-control" name="fullName" id="fullName">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email" id="email">
                </div>
                <div class="form-group">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="admin" id="admin"
                               value="true">
                        <label class="form-check-label" for="admin">Admin</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="admin" id="user"
                               value="false" checked>
                        <label class="form-check-label" for="user">User</label>
                    </div>
                </div>

                <div class="form-group mt-2">
                    <button class="btn btn-primary" formaction="/Demo_JPA/user/create">Insert</button>
                    <button class="btn btn-warning">Update</button>
                    <button class="btn btn-danger">Delete</button>
                    <button class="btn btn-info">Clear</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>