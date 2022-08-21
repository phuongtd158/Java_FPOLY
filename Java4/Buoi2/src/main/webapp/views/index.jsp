<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="${url}" method="post">
    <label for="a">A:</label>
    <input type="text" id="a" name="a" value="1"> <br>
    <label for="b">B:</label>
    <input type="text" id="b" name="b" value="2"> <br>
    <label for="c">C:</label>
    <input type="text" id="c" name="c" value="3"> <br> <br>
    <select name="url" onchange="this.form.submit()">
        <option value="/Demo/TamGiac/ChuVi">Chu vi</option>
        <option value="/Demo/TamGiac/DienTich">Diện tích</option>
    </select> <br><br>
    <h1>${mess}</h1>
</form>
</body>
</html>