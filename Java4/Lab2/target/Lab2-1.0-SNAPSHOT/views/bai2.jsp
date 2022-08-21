<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 13/03/2022
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dang ky</h1> <br>
<form action="Bai2" method="post">
    Ten Dang Nhap: <input type="text" name="userName"> <br> <br>
    MatKhau: <input type="password" name="pass"> <br> <br>
    Gioi Tinh:
    <input type="radio" name="gender" value="true" checked="checked"> Nam
    <input type="radio" name="gender" value="false"> Nu <br> <br>
    Hon nhan: <input type="checkbox" name="married">Da co nguoi yeu <br> <br>
    Quoc tich: <select name="country">
    <option value="VN">Viet Nam</option>
    <option value="My">My</option>
</select>
    <br> <br>
    <input name="hobbies" type="checkbox" value="Read">Doc Sach
    <input name="hobbies" type="checkbox" value="Travel">Du lich
    <input name="hobbies" type="checkbox" value="Music">Am Nhac
    <input name="hobbies" type="checkbox" value="Other">Khac <br><br>
    Ghi Chu <textarea rows="3" cols="30" name="notes"></textarea>
    <hr>
    <input type="submit" value="Dang ky">
</form>
<ul>
    <li><span>${user.username}</span></li>
    <li><span>${user.pass}</span></li>
    <li><span>${user.gender == true ? "Nam" : "Nữ"}</span></li>
    <li><span>${user.married == null ?"Chưa có người yêu" : "Đã có người yêu"}</span></li>
    <li><span>${user.hobbies}</span></li>
    <li><span>${user.notes}</span></li>
</ul>
</body>
</html>
