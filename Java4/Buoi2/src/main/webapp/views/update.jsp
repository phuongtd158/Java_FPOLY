<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/03/2022
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Demo/update" method="post" enctype="multipart/form-data">
    Name: <input type="text" name="name"><br> <br>
    Email: <input type="email" name="email"><br> <br> <select
        name="country" class="form-select" id="country">
    <option value="VN">Viet nam</option>
    <option value="Lao">Lao</option>
    <option value="Campuchia">Campuchia</option>
</select> Photo: <input type="file" name="photo"> <br> <br> <input
        type="submit" value="Send"> <input type="reset" value="Reset">
</form>
<ul>
    <li>Photo: <img src="${srcImg}" alt=""></li>
</ul>
</body>
</html>
