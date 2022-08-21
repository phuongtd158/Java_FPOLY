<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/03/2022
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <h1>Đăng ký</h1>
        <div class="col-7">
            <form action="/HelloWorld/register" method="post">
                <div class="form-group">
                    <label for="name">Họ tên</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="form-group">
                    <label for="address">Địa chỉ</label>
                    <input type="text" class="form-control" name="address" id="address">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email" id="email">
                </div>
                <div class="form-group">
                    <label for="phone">SĐT</label>
                    <input type="text" class="form-control" name="phone" id="phone">
                </div>
                <div class="form-group">
                    <label for="password">Mật khẩu</label>
                    <input type="password" class="form-control" name="password" id="password">
                </div>
                <div class="form-group">
                    <label>Giới tính</label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" checked id="male" value="true">
                        <label class="form-check-label" for="male">Nam</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="female" value="false">
                        <label class="form-check-label" for="female">Nữ</label>
                    </div>
                </div>
                <button class="btn btn-primary">Register</button>
            </form>
        </div>
        <div class="col-5 mt-3">
            <ul>
                <li>Name: ${user.name}</li>
                <li>Address: ${user.address}</li>
                <li>Email: ${user.email}</li>
                <li>Password: ${user.password}</li>
                <li>Phone number: ${user.phone}</li>
                <li>Gender: ${user.gender == true ? "Nam" : "Nữ"}</li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
