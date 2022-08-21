<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Tam giác</h1>
<form action="/Lab2/Bai1" method="post">
    Cạnh a: <input type="text" name="a" value="6"> <br> <br>
    Cạnh b: <input type="text" name="b" value="7"><br> <br>
    Cạnh c: <input type="text" name="c" value="10"><br> <br>
    <select name="uri">
        <option value="chuvi">Chu vi</option>
        <option value="dientich">Diện tích</option>
    </select> <br><br>
    <button>Tính</button>
</form>
<h1>KQ: ${mess}</h1>
</body>
</html>