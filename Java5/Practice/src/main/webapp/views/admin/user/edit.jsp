<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button"
                    data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item"><a class="nav-link active"
                                            aria-current="page" href="#">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Link</a></li>
                    <li class="nav-item dropdown"><a
                            class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
                            role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Dropdown </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Something else
                                here</a></li>
                        </ul>
                    </li>
                    <li class="nav-item"><a class="nav-link disabled">Disabled</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search"
                           placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <div class="row">
        <div class="col-10 m-auto">
            <h3 class="text-center mt-3">Sửa người dùng</h3>
            <form:form
                    action="${pageContext.request.contextPath}/admin/user/update/1"
                    method="post" modelAttribute="account">
                <div class="form-group mt-3">
                    <label for="username">Name</label>
                    <form:input path="username" class="form-control" autocomplete="off"/>
                    <form:errors path="username" element="span" cssClass="text-danger"/>
                </div>
                <div class="form-group mt-3">
                    <label for="email">Email</label>
                    <form:input path="email" class="form-control" id="email" name="email" autocomplete="off"/>
                    <form:errors path="email" element="span" cssClass="text-danger"/>
                </div>
                <div class="form-group mt-3">
                    <label for="password">Password</label>
                    <form:password path="password" value="*********" name="password" class="form-control"
                                   readonly="true"/>
                    <form:errors path="password" element="span" cssClass="text-danger"/>
                </div>
                <div class="form-group mt-3">
                    <label for="admin">Tài khoản</label>
                    <form:select path="admin" id="admin" class="form-control">
                        <form:option value="1">Admin</form:option>
                        <form:option value="0">Member</form:option>
                    </form:select>
                    <form:errors path="admin" element="span" cssClass="text-danger"/>
                </div>
                <div class="form-group mt-3">
                    <label for="photo">Image</label>
                    <input type="text" path="photo" class="form-control" id="photo" name="photo">
                </div>
                <div class="form-group mt-3">
                    <label for="activated">Trạng thái</label>
                    <form:select path="activated" id="activated" class="form-control">
                        <form:option value="1">Đang hoạt động</form:option>
                        <form:option value="0">Vô hiệu hóa</form:option>
                    </form:select>
                    <form:errors path="activated" element="span" cssClass="text-danger"/>
                </div>
                <div class="form-group mt-3">
                    <button class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-danger">Clear</button>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>