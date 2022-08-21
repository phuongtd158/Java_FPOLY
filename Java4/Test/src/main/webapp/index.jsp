<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
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
        <div class="col-8 offset-4 m-auto">
            <c:if test="${not empty mess}">
                <p class="alert alert-success">${mess}</p>
            </c:if>
            <c:if test="${not empty error}">
                <p class="alert alert-danger">${error}</p>
            </c:if>
            <jsp:include page="${form}"/>
        </div>
        <div class="row">
            <div class="col-8 offset-4 m-auto mt-3">
                <jsp:include page="${table}"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>