<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<div style="align: center">
    <form action="a" method="post">
        A: <input type="number" name="a" required>
        <br>
        B: <input type="number" name="b" required>
        <br>
        <button type="submit">
            submit
        </button>
        <div>${result}</div>
    </form>
</div>
</body>
</html>