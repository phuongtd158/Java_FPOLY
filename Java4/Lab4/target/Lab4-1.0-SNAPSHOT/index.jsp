<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
    <div id="title">
        <div class="title-header">
            <h2>Online Shopping Mall</h2>
        </div>
        <div class="logo-header"></div>
        <div style="clear: both;"></div>
    </div>
    <div id="menu">
        <jsp:include page="views/menu.jsp"></jsp:include>
    </div>
    <div id="list-item">
        <div class="row">
            <div class="col-md-9">
                <div class="row">
                    <c:forEach var="item" items="${list}">
                        <jsp:include page="views/item.jsp">
                            <jsp:param name="name" value="${item.name}"/>
                            <jsp:param name="price" value="${item.price}"/>
                            <jsp:param name="image" value="${item.image}"/>
                            <jsp:param name="newprice" value="${item.price*(1-item.discount)}"/>
                        </jsp:include>
                    </c:forEach>
                </div>
            </div>
            <div class="col-md-3">
                <div id="form-login">
                    <jsp:include page="views/login.jsp"></jsp:include>
                </div>
                <div id="list-catogery">
                    <jsp:include page="views/catogery.jsp"></jsp:include>
                </div>
            </div>
        </div>
    </div>
    <div id="category">
        <footer class="bg-light text-center text-lg-start">
            <!-- Copyright -->
            <div class="text-center p-3"
                 style="background-color: rgba(0, 0, 0, 0.2);">
                FPT Polytechic � 2021 Copyright: <a class="text-dark"
                                                    href="https://mdbootstrap.com/">MDBootstrap.com</a>
            </div>
            <!-- Copyright -->
        </footer>
    </div>
</div>
</body>
</html>