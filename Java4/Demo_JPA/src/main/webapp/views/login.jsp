<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <c:if test="${not empty mess}">
            <p class="alert alert-success">${mess}</p>
        </c:if>
        <c:if test="${not empty error}">
            <p class="alert alert-danger">${error}</p>
        </c:if>
        <div class="col-6 offset-6 m-auto">
            <h1 class="text-center">Login</h1>
            <form action="/Demo_JPA/account/sign-in" method="post">
                <div class="mb-3">
                    <label for="userId" class="form-label">Username</label>
                    <input type="text" class="form-control" id="userId" name="userId">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password">
                </div>
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" id="remember" name="remember">
                    <label class="form-check-label" for="remember">Check me out</label>
                </div>
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
            <p class="text-center"> You don't have account ? <a href="/Demo_JPA/account/sign-up">Sign up</a></p>
        </div>
    </div>
</div>

</body>
</html>
